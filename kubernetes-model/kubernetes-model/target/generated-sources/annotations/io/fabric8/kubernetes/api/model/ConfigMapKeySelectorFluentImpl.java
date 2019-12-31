package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class ConfigMapKeySelectorFluentImpl<A extends ConfigMapKeySelectorFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ConfigMapKeySelectorFluent<A>{

    private String key;
    private String name;
    private Boolean optional;

    public ConfigMapKeySelectorFluentImpl(){
    }
    public ConfigMapKeySelectorFluentImpl(ConfigMapKeySelector instance){
            this.withKey(instance.getKey()); 
            this.withName(instance.getName()); 
            this.withOptional(instance.getOptional()); 
    }

    public String getKey(){
            return this.key;
    }

    public A withKey(String key){
            this.key=key; return (A) this;
    }

    public Boolean hasKey(){
            return this.key != null;
    }

    public String getName(){
            return this.name;
    }

    public A withName(String name){
            this.name=name; return (A) this;
    }

    public Boolean hasName(){
            return this.name != null;
    }

    public Boolean isOptional(){
            return this.optional;
    }

    public A withOptional(Boolean optional){
            this.optional=optional; return (A) this;
    }

    public Boolean hasOptional(){
            return this.optional != null;
    }

    public A withNewOptional(String arg1){
            return (A)withOptional(new Boolean(arg1));
    }

    public A withNewOptional(boolean arg1){
            return (A)withOptional(new Boolean(arg1));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ConfigMapKeySelectorFluentImpl that = (ConfigMapKeySelectorFluentImpl) o;
            if (key != null ? !key.equals(that.key) :that.key != null) return false;
            if (name != null ? !name.equals(that.name) :that.name != null) return false;
            if (optional != null ? !optional.equals(that.optional) :that.optional != null) return false;
            return true;
    }




}
