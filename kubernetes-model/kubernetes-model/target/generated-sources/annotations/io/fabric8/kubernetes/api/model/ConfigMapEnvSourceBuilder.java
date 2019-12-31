package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ConfigMapEnvSourceBuilder extends ConfigMapEnvSourceFluentImpl<ConfigMapEnvSourceBuilder> implements VisitableBuilder<ConfigMapEnvSource,ConfigMapEnvSourceBuilder>{

    ConfigMapEnvSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ConfigMapEnvSourceBuilder(){
            this(true);
    }
    public ConfigMapEnvSourceBuilder(Boolean validationEnabled){
            this(new ConfigMapEnvSource(), validationEnabled);
    }
    public ConfigMapEnvSourceBuilder(ConfigMapEnvSourceFluent<?> fluent){
            this(fluent, true);
    }
    public ConfigMapEnvSourceBuilder(ConfigMapEnvSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ConfigMapEnvSource(), validationEnabled);
    }
    public ConfigMapEnvSourceBuilder(ConfigMapEnvSourceFluent<?> fluent,ConfigMapEnvSource instance){
            this(fluent, instance, true);
    }
    public ConfigMapEnvSourceBuilder(ConfigMapEnvSourceFluent<?> fluent,ConfigMapEnvSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withName(instance.getName()); 
            fluent.withOptional(instance.getOptional()); 
            this.validationEnabled = validationEnabled; 
    }
    public ConfigMapEnvSourceBuilder(ConfigMapEnvSource instance){
            this(instance,true);
    }
    public ConfigMapEnvSourceBuilder(ConfigMapEnvSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withName(instance.getName()); 
            this.withOptional(instance.getOptional()); 
            this.validationEnabled = validationEnabled; 
    }
    public ConfigMapEnvSourceBuilder(Validator validator){
            this(new ConfigMapEnvSource(), true);
    }
    public ConfigMapEnvSourceBuilder(ConfigMapEnvSourceFluent<?> fluent,ConfigMapEnvSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withName(instance.getName()); 
            fluent.withOptional(instance.getOptional()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ConfigMapEnvSourceBuilder(ConfigMapEnvSource instance,Validator validator){
            this.fluent = this; 
            this.withName(instance.getName()); 
            this.withOptional(instance.getOptional()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ConfigMapEnvSource build(){
            ConfigMapEnvSource buildable = new ConfigMapEnvSource(fluent.getName(),fluent.isOptional());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ConfigMapEnvSourceBuilder that = (ConfigMapEnvSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
