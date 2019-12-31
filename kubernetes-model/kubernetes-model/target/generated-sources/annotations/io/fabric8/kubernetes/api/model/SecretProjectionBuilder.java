package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class SecretProjectionBuilder extends SecretProjectionFluentImpl<SecretProjectionBuilder> implements VisitableBuilder<SecretProjection,SecretProjectionBuilder>{

    SecretProjectionFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public SecretProjectionBuilder(){
            this(true);
    }
    public SecretProjectionBuilder(Boolean validationEnabled){
            this(new SecretProjection(), validationEnabled);
    }
    public SecretProjectionBuilder(SecretProjectionFluent<?> fluent){
            this(fluent, true);
    }
    public SecretProjectionBuilder(SecretProjectionFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new SecretProjection(), validationEnabled);
    }
    public SecretProjectionBuilder(SecretProjectionFluent<?> fluent,SecretProjection instance){
            this(fluent, instance, true);
    }
    public SecretProjectionBuilder(SecretProjectionFluent<?> fluent,SecretProjection instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withItems(instance.getItems()); 
            fluent.withName(instance.getName()); 
            fluent.withOptional(instance.getOptional()); 
            this.validationEnabled = validationEnabled; 
    }
    public SecretProjectionBuilder(SecretProjection instance){
            this(instance,true);
    }
    public SecretProjectionBuilder(SecretProjection instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withItems(instance.getItems()); 
            this.withName(instance.getName()); 
            this.withOptional(instance.getOptional()); 
            this.validationEnabled = validationEnabled; 
    }
    public SecretProjectionBuilder(Validator validator){
            this(new SecretProjection(), true);
    }
    public SecretProjectionBuilder(SecretProjectionFluent<?> fluent,SecretProjection instance,Validator validator){
            this.fluent = fluent; 
            fluent.withItems(instance.getItems()); 
            fluent.withName(instance.getName()); 
            fluent.withOptional(instance.getOptional()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public SecretProjectionBuilder(SecretProjection instance,Validator validator){
            this.fluent = this; 
            this.withItems(instance.getItems()); 
            this.withName(instance.getName()); 
            this.withOptional(instance.getOptional()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public SecretProjection build(){
            SecretProjection buildable = new SecretProjection(fluent.getItems(),fluent.getName(),fluent.isOptional());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SecretProjectionBuilder that = (SecretProjectionBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
