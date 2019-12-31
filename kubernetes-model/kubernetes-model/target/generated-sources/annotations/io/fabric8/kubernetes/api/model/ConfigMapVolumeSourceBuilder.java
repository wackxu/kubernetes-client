package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ConfigMapVolumeSourceBuilder extends ConfigMapVolumeSourceFluentImpl<ConfigMapVolumeSourceBuilder> implements VisitableBuilder<ConfigMapVolumeSource,ConfigMapVolumeSourceBuilder>{

    ConfigMapVolumeSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ConfigMapVolumeSourceBuilder(){
            this(true);
    }
    public ConfigMapVolumeSourceBuilder(Boolean validationEnabled){
            this(new ConfigMapVolumeSource(), validationEnabled);
    }
    public ConfigMapVolumeSourceBuilder(ConfigMapVolumeSourceFluent<?> fluent){
            this(fluent, true);
    }
    public ConfigMapVolumeSourceBuilder(ConfigMapVolumeSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ConfigMapVolumeSource(), validationEnabled);
    }
    public ConfigMapVolumeSourceBuilder(ConfigMapVolumeSourceFluent<?> fluent,ConfigMapVolumeSource instance){
            this(fluent, instance, true);
    }
    public ConfigMapVolumeSourceBuilder(ConfigMapVolumeSourceFluent<?> fluent,ConfigMapVolumeSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withDefaultMode(instance.getDefaultMode()); 
            fluent.withItems(instance.getItems()); 
            fluent.withName(instance.getName()); 
            fluent.withOptional(instance.getOptional()); 
            this.validationEnabled = validationEnabled; 
    }
    public ConfigMapVolumeSourceBuilder(ConfigMapVolumeSource instance){
            this(instance,true);
    }
    public ConfigMapVolumeSourceBuilder(ConfigMapVolumeSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withDefaultMode(instance.getDefaultMode()); 
            this.withItems(instance.getItems()); 
            this.withName(instance.getName()); 
            this.withOptional(instance.getOptional()); 
            this.validationEnabled = validationEnabled; 
    }
    public ConfigMapVolumeSourceBuilder(Validator validator){
            this(new ConfigMapVolumeSource(), true);
    }
    public ConfigMapVolumeSourceBuilder(ConfigMapVolumeSourceFluent<?> fluent,ConfigMapVolumeSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withDefaultMode(instance.getDefaultMode()); 
            fluent.withItems(instance.getItems()); 
            fluent.withName(instance.getName()); 
            fluent.withOptional(instance.getOptional()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ConfigMapVolumeSourceBuilder(ConfigMapVolumeSource instance,Validator validator){
            this.fluent = this; 
            this.withDefaultMode(instance.getDefaultMode()); 
            this.withItems(instance.getItems()); 
            this.withName(instance.getName()); 
            this.withOptional(instance.getOptional()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ConfigMapVolumeSource build(){
            ConfigMapVolumeSource buildable = new ConfigMapVolumeSource(fluent.getDefaultMode(),fluent.getItems(),fluent.getName(),fluent.isOptional());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ConfigMapVolumeSourceBuilder that = (ConfigMapVolumeSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
