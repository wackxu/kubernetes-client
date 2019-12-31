package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ConfigMapBuildSourceBuilder extends ConfigMapBuildSourceFluentImpl<ConfigMapBuildSourceBuilder> implements VisitableBuilder<ConfigMapBuildSource,ConfigMapBuildSourceBuilder>{

    ConfigMapBuildSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ConfigMapBuildSourceBuilder(){
            this(true);
    }
    public ConfigMapBuildSourceBuilder(Boolean validationEnabled){
            this(new ConfigMapBuildSource(), validationEnabled);
    }
    public ConfigMapBuildSourceBuilder(ConfigMapBuildSourceFluent<?> fluent){
            this(fluent, true);
    }
    public ConfigMapBuildSourceBuilder(ConfigMapBuildSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ConfigMapBuildSource(), validationEnabled);
    }
    public ConfigMapBuildSourceBuilder(ConfigMapBuildSourceFluent<?> fluent,ConfigMapBuildSource instance){
            this(fluent, instance, true);
    }
    public ConfigMapBuildSourceBuilder(ConfigMapBuildSourceFluent<?> fluent,ConfigMapBuildSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withConfigMap(instance.getConfigMap()); 
            fluent.withDestinationDir(instance.getDestinationDir()); 
            this.validationEnabled = validationEnabled; 
    }
    public ConfigMapBuildSourceBuilder(ConfigMapBuildSource instance){
            this(instance,true);
    }
    public ConfigMapBuildSourceBuilder(ConfigMapBuildSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withConfigMap(instance.getConfigMap()); 
            this.withDestinationDir(instance.getDestinationDir()); 
            this.validationEnabled = validationEnabled; 
    }
    public ConfigMapBuildSourceBuilder(Validator validator){
            this(new ConfigMapBuildSource(), true);
    }
    public ConfigMapBuildSourceBuilder(ConfigMapBuildSourceFluent<?> fluent,ConfigMapBuildSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withConfigMap(instance.getConfigMap()); 
            fluent.withDestinationDir(instance.getDestinationDir()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ConfigMapBuildSourceBuilder(ConfigMapBuildSource instance,Validator validator){
            this.fluent = this; 
            this.withConfigMap(instance.getConfigMap()); 
            this.withDestinationDir(instance.getDestinationDir()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ConfigMapBuildSource build(){
            ConfigMapBuildSource buildable = new ConfigMapBuildSource(fluent.getConfigMap(),fluent.getDestinationDir());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ConfigMapBuildSourceBuilder that = (ConfigMapBuildSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
