package io.fabric8.kubernetes.api.builder;

import javax.validation.Validation;
import java.util.Set;
import javax.validation.ValidationException;
import javax.validation.ValidatorFactory;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.lang.Object;
import javax.validation.Validator;
import io.sundr.resourcecify.annotations.Resourcecify;

public final class ValidationUtils{

    private static final Object LOCK = new Object();
    private static Validator validator;


    private static Validator createValidator(){
            try {
    ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    return factory.getValidator();
} catch (ValidationException e) {
    return null;
}
    }

    private static Validator getValidator(){
            Validator v = validator;
            if (v == null) {
    synchronized (LOCK) {
        v = validator;
        if (validator == null) {
            v = createValidator();
            validator = v;
        }
    }
}
            return v;
    }

    public static <T>void validate(T item){
            validate(item, getValidator());
    }

    public static <T>void validate(T item,Validator v){
            if (v == null) {
    v = getValidator();
}
            if (v == null) {
    return;
}
            Set<ConstraintViolation<T>> violations = v.validate(item);
            if (!violations.isEmpty()) {
    StringBuilder sb = new StringBuilder("Constraint Validations: ");
    boolean first = true;
    for (ConstraintViolation violation : violations) {
        if (first) {
            first = false;
        } else {
            sb.append(", ");
        }
        Object leafBean = violation.getLeafBean();
        sb.append(violation.getPropertyPath() + " " + violation.getMessage() + " on bean: " + leafBean);
    }
    throw new ConstraintViolationException(sb.toString(), violations);
}
    }




}
