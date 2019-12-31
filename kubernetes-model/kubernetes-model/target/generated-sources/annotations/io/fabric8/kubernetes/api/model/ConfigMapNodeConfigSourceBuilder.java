package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ConfigMapNodeConfigSourceBuilder extends ConfigMapNodeConfigSourceFluentImpl<ConfigMapNodeConfigSourceBuilder> implements VisitableBuilder<ConfigMapNodeConfigSource,ConfigMapNodeConfigSourceBuilder>{

    ConfigMapNodeConfigSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ConfigMapNodeConfigSourceBuilder(){
            this(true);
    }
    public ConfigMapNodeConfigSourceBuilder(Boolean validationEnabled){
            this(new ConfigMapNodeConfigSource(), validationEnabled);
    }
    public ConfigMapNodeConfigSourceBuilder(ConfigMapNodeConfigSourceFluent<?> fluent){
            this(fluent, true);
    }
    public ConfigMapNodeConfigSourceBuilder(ConfigMapNodeConfigSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ConfigMapNodeConfigSource(), validationEnabled);
    }
    public ConfigMapNodeConfigSourceBuilder(ConfigMapNodeConfigSourceFluent<?> fluent,ConfigMapNodeConfigSource instance){
            this(fluent, instance, true);
    }
    public ConfigMapNodeConfigSourceBuilder(ConfigMapNodeConfigSourceFluent<?> fluent,ConfigMapNodeConfigSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withKubeletConfigKey(instance.getKubeletConfigKey()); 
            fluent.withName(instance.getName()); 
            fluent.withNamespace(instance.getNamespace()); 
            fluent.withResourceVersion(instance.getResourceVersion()); 
            fluent.withUid(instance.getUid()); 
            this.validationEnabled = validationEnabled; 
    }
    public ConfigMapNodeConfigSourceBuilder(ConfigMapNodeConfigSource instance){
            this(instance,true);
    }
    public ConfigMapNodeConfigSourceBuilder(ConfigMapNodeConfigSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withKubeletConfigKey(instance.getKubeletConfigKey()); 
            this.withName(instance.getName()); 
            this.withNamespace(instance.getNamespace()); 
            this.withResourceVersion(instance.getResourceVersion()); 
            this.withUid(instance.getUid()); 
            this.validationEnabled = validationEnabled; 
    }
    public ConfigMapNodeConfigSourceBuilder(Validator validator){
            this(new ConfigMapNodeConfigSource(), true);
    }
    public ConfigMapNodeConfigSourceBuilder(ConfigMapNodeConfigSourceFluent<?> fluent,ConfigMapNodeConfigSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withKubeletConfigKey(instance.getKubeletConfigKey()); 
            fluent.withName(instance.getName()); 
            fluent.withNamespace(instance.getNamespace()); 
            fluent.withResourceVersion(instance.getResourceVersion()); 
            fluent.withUid(instance.getUid()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ConfigMapNodeConfigSourceBuilder(ConfigMapNodeConfigSource instance,Validator validator){
            this.fluent = this; 
            this.withKubeletConfigKey(instance.getKubeletConfigKey()); 
            this.withName(instance.getName()); 
            this.withNamespace(instance.getNamespace()); 
            this.withResourceVersion(instance.getResourceVersion()); 
            this.withUid(instance.getUid()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ConfigMapNodeConfigSource build(){
            ConfigMapNodeConfigSource buildable = new ConfigMapNodeConfigSource(fluent.getKubeletConfigKey(),fluent.getName(),fluent.getNamespace(),fluent.getResourceVersion(),fluent.getUid());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ConfigMapNodeConfigSourceBuilder that = (ConfigMapNodeConfigSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
