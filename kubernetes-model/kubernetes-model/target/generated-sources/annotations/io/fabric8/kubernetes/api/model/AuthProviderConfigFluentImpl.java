package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;
import java.util.LinkedHashMap;

public class AuthProviderConfigFluentImpl<A extends AuthProviderConfigFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements AuthProviderConfigFluent<A>{

    private Map<String,String> config;
    private String name;

    public AuthProviderConfigFluentImpl(){
    }
    public AuthProviderConfigFluentImpl(AuthProviderConfig instance){
            this.withConfig(instance.getConfig()); 
            this.withName(instance.getName()); 
    }

    public A addToConfig(String key,String value){
            if(this.config == null && key != null && value != null) { this.config = new LinkedHashMap<String,String>(); }
            if(key != null && value != null) {this.config.put(key, value);} return (A)this;
    }

    public A addToConfig(Map<String,String> map){
            if(this.config == null && map != null) { this.config = new LinkedHashMap<String,String>(); }
            if(map != null) { this.config.putAll(map);} return (A)this;
    }

    public A removeFromConfig(String key){
            if(this.config == null) { return (A) this; }
            if(key != null && this.config != null) {this.config.remove(key);} return (A)this;
    }

    public A removeFromConfig(Map<String,String> map){
            if(this.config == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.config != null){this.config.remove(key);}}} return (A)this;
    }

    public Map<String,String> getConfig(){
            return this.config;
    }

    public A withConfig(Map<String,String> config){
            if (config == null) { this.config =  new LinkedHashMap<String,String>();} else {this.config = new LinkedHashMap<String,String>(config);} return (A) this;
    }

    public Boolean hasConfig(){
            return this.config != null;
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

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            AuthProviderConfigFluentImpl that = (AuthProviderConfigFluentImpl) o;
            if (config != null ? !config.equals(that.config) :that.config != null) return false;
            if (name != null ? !name.equals(that.name) :that.name != null) return false;
            return true;
    }




}
