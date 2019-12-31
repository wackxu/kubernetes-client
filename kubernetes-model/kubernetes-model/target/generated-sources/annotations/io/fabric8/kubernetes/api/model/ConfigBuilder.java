package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ConfigBuilder extends ConfigFluentImpl<ConfigBuilder> implements VisitableBuilder<Config,ConfigBuilder>{

    ConfigFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ConfigBuilder(){
            this(true);
    }
    public ConfigBuilder(Boolean validationEnabled){
            this(new Config(), validationEnabled);
    }
    public ConfigBuilder(ConfigFluent<?> fluent){
            this(fluent, true);
    }
    public ConfigBuilder(ConfigFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new Config(), validationEnabled);
    }
    public ConfigBuilder(ConfigFluent<?> fluent,Config instance){
            this(fluent, instance, true);
    }
    public ConfigBuilder(ConfigFluent<?> fluent,Config instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withClusters(instance.getClusters()); 
            fluent.withContexts(instance.getContexts()); 
            fluent.withCurrentContext(instance.getCurrentContext()); 
            fluent.withExtensions(instance.getExtensions()); 
            fluent.withKind(instance.getKind()); 
            fluent.withPreferences(instance.getPreferences()); 
            fluent.withUsers(instance.getUsers()); 
            this.validationEnabled = validationEnabled; 
    }
    public ConfigBuilder(Config instance){
            this(instance,true);
    }
    public ConfigBuilder(Config instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withClusters(instance.getClusters()); 
            this.withContexts(instance.getContexts()); 
            this.withCurrentContext(instance.getCurrentContext()); 
            this.withExtensions(instance.getExtensions()); 
            this.withKind(instance.getKind()); 
            this.withPreferences(instance.getPreferences()); 
            this.withUsers(instance.getUsers()); 
            this.validationEnabled = validationEnabled; 
    }
    public ConfigBuilder(Validator validator){
            this(new Config(), true);
    }
    public ConfigBuilder(ConfigFluent<?> fluent,Config instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withClusters(instance.getClusters()); 
            fluent.withContexts(instance.getContexts()); 
            fluent.withCurrentContext(instance.getCurrentContext()); 
            fluent.withExtensions(instance.getExtensions()); 
            fluent.withKind(instance.getKind()); 
            fluent.withPreferences(instance.getPreferences()); 
            fluent.withUsers(instance.getUsers()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ConfigBuilder(Config instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withClusters(instance.getClusters()); 
            this.withContexts(instance.getContexts()); 
            this.withCurrentContext(instance.getCurrentContext()); 
            this.withExtensions(instance.getExtensions()); 
            this.withKind(instance.getKind()); 
            this.withPreferences(instance.getPreferences()); 
            this.withUsers(instance.getUsers()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public Config build(){
            Config buildable = new Config(fluent.getApiVersion(),fluent.getClusters(),fluent.getContexts(),fluent.getCurrentContext(),fluent.getExtensions(),fluent.getKind(),fluent.getPreferences(),fluent.getUsers());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ConfigBuilder that = (ConfigBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
