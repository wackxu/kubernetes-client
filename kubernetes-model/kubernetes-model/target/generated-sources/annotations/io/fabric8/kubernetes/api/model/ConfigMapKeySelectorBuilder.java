package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ConfigMapKeySelectorBuilder extends ConfigMapKeySelectorFluentImpl<ConfigMapKeySelectorBuilder> implements VisitableBuilder<ConfigMapKeySelector,ConfigMapKeySelectorBuilder>{

    ConfigMapKeySelectorFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ConfigMapKeySelectorBuilder(){
            this(true);
    }
    public ConfigMapKeySelectorBuilder(Boolean validationEnabled){
            this(new ConfigMapKeySelector(), validationEnabled);
    }
    public ConfigMapKeySelectorBuilder(ConfigMapKeySelectorFluent<?> fluent){
            this(fluent, true);
    }
    public ConfigMapKeySelectorBuilder(ConfigMapKeySelectorFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ConfigMapKeySelector(), validationEnabled);
    }
    public ConfigMapKeySelectorBuilder(ConfigMapKeySelectorFluent<?> fluent,ConfigMapKeySelector instance){
            this(fluent, instance, true);
    }
    public ConfigMapKeySelectorBuilder(ConfigMapKeySelectorFluent<?> fluent,ConfigMapKeySelector instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withKey(instance.getKey()); 
            fluent.withName(instance.getName()); 
            fluent.withOptional(instance.getOptional()); 
            this.validationEnabled = validationEnabled; 
    }
    public ConfigMapKeySelectorBuilder(ConfigMapKeySelector instance){
            this(instance,true);
    }
    public ConfigMapKeySelectorBuilder(ConfigMapKeySelector instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withKey(instance.getKey()); 
            this.withName(instance.getName()); 
            this.withOptional(instance.getOptional()); 
            this.validationEnabled = validationEnabled; 
    }
    public ConfigMapKeySelectorBuilder(Validator validator){
            this(new ConfigMapKeySelector(), true);
    }
    public ConfigMapKeySelectorBuilder(ConfigMapKeySelectorFluent<?> fluent,ConfigMapKeySelector instance,Validator validator){
            this.fluent = fluent; 
            fluent.withKey(instance.getKey()); 
            fluent.withName(instance.getName()); 
            fluent.withOptional(instance.getOptional()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ConfigMapKeySelectorBuilder(ConfigMapKeySelector instance,Validator validator){
            this.fluent = this; 
            this.withKey(instance.getKey()); 
            this.withName(instance.getName()); 
            this.withOptional(instance.getOptional()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ConfigMapKeySelector build(){
            ConfigMapKeySelector buildable = new ConfigMapKeySelector(fluent.getKey(),fluent.getName(),fluent.isOptional());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ConfigMapKeySelectorBuilder that = (ConfigMapKeySelectorBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
