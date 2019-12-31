package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class EnvVarSourceBuilder extends EnvVarSourceFluentImpl<EnvVarSourceBuilder> implements VisitableBuilder<EnvVarSource,EnvVarSourceBuilder>{

    EnvVarSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public EnvVarSourceBuilder(){
            this(true);
    }
    public EnvVarSourceBuilder(Boolean validationEnabled){
            this(new EnvVarSource(), validationEnabled);
    }
    public EnvVarSourceBuilder(EnvVarSourceFluent<?> fluent){
            this(fluent, true);
    }
    public EnvVarSourceBuilder(EnvVarSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new EnvVarSource(), validationEnabled);
    }
    public EnvVarSourceBuilder(EnvVarSourceFluent<?> fluent,EnvVarSource instance){
            this(fluent, instance, true);
    }
    public EnvVarSourceBuilder(EnvVarSourceFluent<?> fluent,EnvVarSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withConfigMapKeyRef(instance.getConfigMapKeyRef()); 
            fluent.withFieldRef(instance.getFieldRef()); 
            fluent.withResourceFieldRef(instance.getResourceFieldRef()); 
            fluent.withSecretKeyRef(instance.getSecretKeyRef()); 
            this.validationEnabled = validationEnabled; 
    }
    public EnvVarSourceBuilder(EnvVarSource instance){
            this(instance,true);
    }
    public EnvVarSourceBuilder(EnvVarSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withConfigMapKeyRef(instance.getConfigMapKeyRef()); 
            this.withFieldRef(instance.getFieldRef()); 
            this.withResourceFieldRef(instance.getResourceFieldRef()); 
            this.withSecretKeyRef(instance.getSecretKeyRef()); 
            this.validationEnabled = validationEnabled; 
    }
    public EnvVarSourceBuilder(Validator validator){
            this(new EnvVarSource(), true);
    }
    public EnvVarSourceBuilder(EnvVarSourceFluent<?> fluent,EnvVarSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withConfigMapKeyRef(instance.getConfigMapKeyRef()); 
            fluent.withFieldRef(instance.getFieldRef()); 
            fluent.withResourceFieldRef(instance.getResourceFieldRef()); 
            fluent.withSecretKeyRef(instance.getSecretKeyRef()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public EnvVarSourceBuilder(EnvVarSource instance,Validator validator){
            this.fluent = this; 
            this.withConfigMapKeyRef(instance.getConfigMapKeyRef()); 
            this.withFieldRef(instance.getFieldRef()); 
            this.withResourceFieldRef(instance.getResourceFieldRef()); 
            this.withSecretKeyRef(instance.getSecretKeyRef()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public EnvVarSource build(){
            EnvVarSource buildable = new EnvVarSource(fluent.getConfigMapKeyRef(),fluent.getFieldRef(),fluent.getResourceFieldRef(),fluent.getSecretKeyRef());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            EnvVarSourceBuilder that = (EnvVarSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
