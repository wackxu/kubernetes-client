package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ConfigMapListBuilder extends ConfigMapListFluentImpl<ConfigMapListBuilder> implements VisitableBuilder<ConfigMapList,ConfigMapListBuilder>{

    ConfigMapListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ConfigMapListBuilder(){
            this(true);
    }
    public ConfigMapListBuilder(Boolean validationEnabled){
            this(new ConfigMapList(), validationEnabled);
    }
    public ConfigMapListBuilder(ConfigMapListFluent<?> fluent){
            this(fluent, true);
    }
    public ConfigMapListBuilder(ConfigMapListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ConfigMapList(), validationEnabled);
    }
    public ConfigMapListBuilder(ConfigMapListFluent<?> fluent,ConfigMapList instance){
            this(fluent, instance, true);
    }
    public ConfigMapListBuilder(ConfigMapListFluent<?> fluent,ConfigMapList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public ConfigMapListBuilder(ConfigMapList instance){
            this(instance,true);
    }
    public ConfigMapListBuilder(ConfigMapList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public ConfigMapListBuilder(Validator validator){
            this(new ConfigMapList(), true);
    }
    public ConfigMapListBuilder(ConfigMapListFluent<?> fluent,ConfigMapList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ConfigMapListBuilder(ConfigMapList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ConfigMapList build(){
            ConfigMapList buildable = new ConfigMapList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ConfigMapListBuilder that = (ConfigMapListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
