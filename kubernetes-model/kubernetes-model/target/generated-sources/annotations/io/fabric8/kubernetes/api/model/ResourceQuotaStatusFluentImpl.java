package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;
import java.util.LinkedHashMap;

public class ResourceQuotaStatusFluentImpl<A extends ResourceQuotaStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ResourceQuotaStatusFluent<A>{

    private Map<String,Quantity> hard;
    private Map<String,Quantity> used;

    public ResourceQuotaStatusFluentImpl(){
    }
    public ResourceQuotaStatusFluentImpl(ResourceQuotaStatus instance){
            this.withHard(instance.getHard()); 
            this.withUsed(instance.getUsed()); 
    }

    public A addToHard(String key,Quantity value){
            if(this.hard == null && key != null && value != null) { this.hard = new LinkedHashMap<String,Quantity>(); }
            if(key != null && value != null) {this.hard.put(key, value);} return (A)this;
    }

    public A addToHard(Map<String,Quantity> map){
            if(this.hard == null && map != null) { this.hard = new LinkedHashMap<String,Quantity>(); }
            if(map != null) { this.hard.putAll(map);} return (A)this;
    }

    public A removeFromHard(String key){
            if(this.hard == null) { return (A) this; }
            if(key != null && this.hard != null) {this.hard.remove(key);} return (A)this;
    }

    public A removeFromHard(Map<String,Quantity> map){
            if(this.hard == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.hard != null){this.hard.remove(key);}}} return (A)this;
    }

    public Map<String,Quantity> getHard(){
            return this.hard;
    }

    public A withHard(Map<String,Quantity> hard){
            if (hard == null) { this.hard =  new LinkedHashMap<String,Quantity>();} else {this.hard = new LinkedHashMap<String,Quantity>(hard);} return (A) this;
    }

    public Boolean hasHard(){
            return this.hard != null;
    }

    public A addToUsed(String key,Quantity value){
            if(this.used == null && key != null && value != null) { this.used = new LinkedHashMap<String,Quantity>(); }
            if(key != null && value != null) {this.used.put(key, value);} return (A)this;
    }

    public A addToUsed(Map<String,Quantity> map){
            if(this.used == null && map != null) { this.used = new LinkedHashMap<String,Quantity>(); }
            if(map != null) { this.used.putAll(map);} return (A)this;
    }

    public A removeFromUsed(String key){
            if(this.used == null) { return (A) this; }
            if(key != null && this.used != null) {this.used.remove(key);} return (A)this;
    }

    public A removeFromUsed(Map<String,Quantity> map){
            if(this.used == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.used != null){this.used.remove(key);}}} return (A)this;
    }

    public Map<String,Quantity> getUsed(){
            return this.used;
    }

    public A withUsed(Map<String,Quantity> used){
            if (used == null) { this.used =  new LinkedHashMap<String,Quantity>();} else {this.used = new LinkedHashMap<String,Quantity>(used);} return (A) this;
    }

    public Boolean hasUsed(){
            return this.used != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ResourceQuotaStatusFluentImpl that = (ResourceQuotaStatusFluentImpl) o;
            if (hard != null ? !hard.equals(that.hard) :that.hard != null) return false;
            if (used != null ? !used.equals(that.used) :that.used != null) return false;
            return true;
    }




}
