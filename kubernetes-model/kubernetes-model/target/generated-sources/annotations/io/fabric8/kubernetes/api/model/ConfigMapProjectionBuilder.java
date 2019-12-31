package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ConfigMapProjectionBuilder extends ConfigMapProjectionFluentImpl<ConfigMapProjectionBuilder> implements VisitableBuilder<ConfigMapProjection,ConfigMapProjectionBuilder>{

    ConfigMapProjectionFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ConfigMapProjectionBuilder(){
            this(true);
    }
    public ConfigMapProjectionBuilder(Boolean validationEnabled){
            this(new ConfigMapProjection(), validationEnabled);
    }
    public ConfigMapProjectionBuilder(ConfigMapProjectionFluent<?> fluent){
            this(fluent, true);
    }
    public ConfigMapProjectionBuilder(ConfigMapProjectionFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ConfigMapProjection(), validationEnabled);
    }
    public ConfigMapProjectionBuilder(ConfigMapProjectionFluent<?> fluent,ConfigMapProjection instance){
            this(fluent, instance, true);
    }
    public ConfigMapProjectionBuilder(ConfigMapProjectionFluent<?> fluent,ConfigMapProjection instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withItems(instance.getItems()); 
            fluent.withName(instance.getName()); 
            fluent.withOptional(instance.getOptional()); 
            this.validationEnabled = validationEnabled; 
    }
    public ConfigMapProjectionBuilder(ConfigMapProjection instance){
            this(instance,true);
    }
    public ConfigMapProjectionBuilder(ConfigMapProjection instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withItems(instance.getItems()); 
            this.withName(instance.getName()); 
            this.withOptional(instance.getOptional()); 
            this.validationEnabled = validationEnabled; 
    }
    public ConfigMapProjectionBuilder(Validator validator){
            this(new ConfigMapProjection(), true);
    }
    public ConfigMapProjectionBuilder(ConfigMapProjectionFluent<?> fluent,ConfigMapProjection instance,Validator validator){
            this.fluent = fluent; 
            fluent.withItems(instance.getItems()); 
            fluent.withName(instance.getName()); 
            fluent.withOptional(instance.getOptional()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ConfigMapProjectionBuilder(ConfigMapProjection instance,Validator validator){
            this.fluent = this; 
            this.withItems(instance.getItems()); 
            this.withName(instance.getName()); 
            this.withOptional(instance.getOptional()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ConfigMapProjection build(){
            ConfigMapProjection buildable = new ConfigMapProjection(fluent.getItems(),fluent.getName(),fluent.isOptional());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ConfigMapProjectionBuilder that = (ConfigMapProjectionBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
