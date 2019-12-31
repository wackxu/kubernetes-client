package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class SecretEnvSourceBuilder extends SecretEnvSourceFluentImpl<SecretEnvSourceBuilder> implements VisitableBuilder<SecretEnvSource,SecretEnvSourceBuilder>{

    SecretEnvSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public SecretEnvSourceBuilder(){
            this(true);
    }
    public SecretEnvSourceBuilder(Boolean validationEnabled){
            this(new SecretEnvSource(), validationEnabled);
    }
    public SecretEnvSourceBuilder(SecretEnvSourceFluent<?> fluent){
            this(fluent, true);
    }
    public SecretEnvSourceBuilder(SecretEnvSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new SecretEnvSource(), validationEnabled);
    }
    public SecretEnvSourceBuilder(SecretEnvSourceFluent<?> fluent,SecretEnvSource instance){
            this(fluent, instance, true);
    }
    public SecretEnvSourceBuilder(SecretEnvSourceFluent<?> fluent,SecretEnvSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withName(instance.getName()); 
            fluent.withOptional(instance.getOptional()); 
            this.validationEnabled = validationEnabled; 
    }
    public SecretEnvSourceBuilder(SecretEnvSource instance){
            this(instance,true);
    }
    public SecretEnvSourceBuilder(SecretEnvSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withName(instance.getName()); 
            this.withOptional(instance.getOptional()); 
            this.validationEnabled = validationEnabled; 
    }
    public SecretEnvSourceBuilder(Validator validator){
            this(new SecretEnvSource(), true);
    }
    public SecretEnvSourceBuilder(SecretEnvSourceFluent<?> fluent,SecretEnvSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withName(instance.getName()); 
            fluent.withOptional(instance.getOptional()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public SecretEnvSourceBuilder(SecretEnvSource instance,Validator validator){
            this.fluent = this; 
            this.withName(instance.getName()); 
            this.withOptional(instance.getOptional()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public SecretEnvSource build(){
            SecretEnvSource buildable = new SecretEnvSource(fluent.getName(),fluent.isOptional());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SecretEnvSourceBuilder that = (SecretEnvSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
