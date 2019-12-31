package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ConfigMapBuilder extends ConfigMapFluentImpl<ConfigMapBuilder> implements VisitableBuilder<ConfigMap,ConfigMapBuilder>{

    ConfigMapFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ConfigMapBuilder(){
            this(true);
    }
    public ConfigMapBuilder(Boolean validationEnabled){
            this(new ConfigMap(), validationEnabled);
    }
    public ConfigMapBuilder(ConfigMapFluent<?> fluent){
            this(fluent, true);
    }
    public ConfigMapBuilder(ConfigMapFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ConfigMap(), validationEnabled);
    }
    public ConfigMapBuilder(ConfigMapFluent<?> fluent,ConfigMap instance){
            this(fluent, instance, true);
    }
    public ConfigMapBuilder(ConfigMapFluent<?> fluent,ConfigMap instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withBinaryData(instance.getBinaryData()); 
            fluent.withData(instance.getData()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public ConfigMapBuilder(ConfigMap instance){
            this(instance,true);
    }
    public ConfigMapBuilder(ConfigMap instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withBinaryData(instance.getBinaryData()); 
            this.withData(instance.getData()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public ConfigMapBuilder(Validator validator){
            this(new ConfigMap(), true);
    }
    public ConfigMapBuilder(ConfigMapFluent<?> fluent,ConfigMap instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withBinaryData(instance.getBinaryData()); 
            fluent.withData(instance.getData()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ConfigMapBuilder(ConfigMap instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withBinaryData(instance.getBinaryData()); 
            this.withData(instance.getData()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ConfigMap build(){
            ConfigMap buildable = new ConfigMap(fluent.getApiVersion(),fluent.getBinaryData(),fluent.getData(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ConfigMapBuilder that = (ConfigMapBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
