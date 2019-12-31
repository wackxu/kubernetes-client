package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class SecretKeySelectorBuilder extends SecretKeySelectorFluentImpl<SecretKeySelectorBuilder> implements VisitableBuilder<SecretKeySelector,SecretKeySelectorBuilder>{

    SecretKeySelectorFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public SecretKeySelectorBuilder(){
            this(true);
    }
    public SecretKeySelectorBuilder(Boolean validationEnabled){
            this(new SecretKeySelector(), validationEnabled);
    }
    public SecretKeySelectorBuilder(SecretKeySelectorFluent<?> fluent){
            this(fluent, true);
    }
    public SecretKeySelectorBuilder(SecretKeySelectorFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new SecretKeySelector(), validationEnabled);
    }
    public SecretKeySelectorBuilder(SecretKeySelectorFluent<?> fluent,SecretKeySelector instance){
            this(fluent, instance, true);
    }
    public SecretKeySelectorBuilder(SecretKeySelectorFluent<?> fluent,SecretKeySelector instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withKey(instance.getKey()); 
            fluent.withName(instance.getName()); 
            fluent.withOptional(instance.getOptional()); 
            this.validationEnabled = validationEnabled; 
    }
    public SecretKeySelectorBuilder(SecretKeySelector instance){
            this(instance,true);
    }
    public SecretKeySelectorBuilder(SecretKeySelector instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withKey(instance.getKey()); 
            this.withName(instance.getName()); 
            this.withOptional(instance.getOptional()); 
            this.validationEnabled = validationEnabled; 
    }
    public SecretKeySelectorBuilder(Validator validator){
            this(new SecretKeySelector(), true);
    }
    public SecretKeySelectorBuilder(SecretKeySelectorFluent<?> fluent,SecretKeySelector instance,Validator validator){
            this.fluent = fluent; 
            fluent.withKey(instance.getKey()); 
            fluent.withName(instance.getName()); 
            fluent.withOptional(instance.getOptional()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public SecretKeySelectorBuilder(SecretKeySelector instance,Validator validator){
            this.fluent = this; 
            this.withKey(instance.getKey()); 
            this.withName(instance.getName()); 
            this.withOptional(instance.getOptional()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public SecretKeySelector build(){
            SecretKeySelector buildable = new SecretKeySelector(fluent.getKey(),fluent.getName(),fluent.isOptional());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SecretKeySelectorBuilder that = (SecretKeySelectorBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
