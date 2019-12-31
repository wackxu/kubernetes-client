package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class EnvFromSourceBuilder extends EnvFromSourceFluentImpl<EnvFromSourceBuilder> implements VisitableBuilder<EnvFromSource,EnvFromSourceBuilder>{

    EnvFromSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public EnvFromSourceBuilder(){
            this(true);
    }
    public EnvFromSourceBuilder(Boolean validationEnabled){
            this(new EnvFromSource(), validationEnabled);
    }
    public EnvFromSourceBuilder(EnvFromSourceFluent<?> fluent){
            this(fluent, true);
    }
    public EnvFromSourceBuilder(EnvFromSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new EnvFromSource(), validationEnabled);
    }
    public EnvFromSourceBuilder(EnvFromSourceFluent<?> fluent,EnvFromSource instance){
            this(fluent, instance, true);
    }
    public EnvFromSourceBuilder(EnvFromSourceFluent<?> fluent,EnvFromSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withConfigMapRef(instance.getConfigMapRef()); 
            fluent.withPrefix(instance.getPrefix()); 
            fluent.withSecretRef(instance.getSecretRef()); 
            this.validationEnabled = validationEnabled; 
    }
    public EnvFromSourceBuilder(EnvFromSource instance){
            this(instance,true);
    }
    public EnvFromSourceBuilder(EnvFromSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withConfigMapRef(instance.getConfigMapRef()); 
            this.withPrefix(instance.getPrefix()); 
            this.withSecretRef(instance.getSecretRef()); 
            this.validationEnabled = validationEnabled; 
    }
    public EnvFromSourceBuilder(Validator validator){
            this(new EnvFromSource(), true);
    }
    public EnvFromSourceBuilder(EnvFromSourceFluent<?> fluent,EnvFromSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withConfigMapRef(instance.getConfigMapRef()); 
            fluent.withPrefix(instance.getPrefix()); 
            fluent.withSecretRef(instance.getSecretRef()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public EnvFromSourceBuilder(EnvFromSource instance,Validator validator){
            this.fluent = this; 
            this.withConfigMapRef(instance.getConfigMapRef()); 
            this.withPrefix(instance.getPrefix()); 
            this.withSecretRef(instance.getSecretRef()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public EnvFromSource build(){
            EnvFromSource buildable = new EnvFromSource(fluent.getConfigMapRef(),fluent.getPrefix(),fluent.getSecretRef());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            EnvFromSourceBuilder that = (EnvFromSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
