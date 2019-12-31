package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;
import java.util.LinkedHashMap;

public class ResourceRequirementsFluentImpl<A extends ResourceRequirementsFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ResourceRequirementsFluent<A>{

    private Map<String,Quantity> limits;
    private Map<String,Quantity> requests;

    public ResourceRequirementsFluentImpl(){
    }
    public ResourceRequirementsFluentImpl(ResourceRequirements instance){
            this.withLimits(instance.getLimits()); 
            this.withRequests(instance.getRequests()); 
    }

    public A addToLimits(String key,Quantity value){
            if(this.limits == null && key != null && value != null) { this.limits = new LinkedHashMap<String,Quantity>(); }
            if(key != null && value != null) {this.limits.put(key, value);} return (A)this;
    }

    public A addToLimits(Map<String,Quantity> map){
            if(this.limits == null && map != null) { this.limits = new LinkedHashMap<String,Quantity>(); }
            if(map != null) { this.limits.putAll(map);} return (A)this;
    }

    public A removeFromLimits(String key){
            if(this.limits == null) { return (A) this; }
            if(key != null && this.limits != null) {this.limits.remove(key);} return (A)this;
    }

    public A removeFromLimits(Map<String,Quantity> map){
            if(this.limits == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.limits != null){this.limits.remove(key);}}} return (A)this;
    }

    public Map<String,Quantity> getLimits(){
            return this.limits;
    }

    public A withLimits(Map<String,Quantity> limits){
            if (limits == null) { this.limits =  new LinkedHashMap<String,Quantity>();} else {this.limits = new LinkedHashMap<String,Quantity>(limits);} return (A) this;
    }

    public Boolean hasLimits(){
            return this.limits != null;
    }

    public A addToRequests(String key,Quantity value){
            if(this.requests == null && key != null && value != null) { this.requests = new LinkedHashMap<String,Quantity>(); }
            if(key != null && value != null) {this.requests.put(key, value);} return (A)this;
    }

    public A addToRequests(Map<String,Quantity> map){
            if(this.requests == null && map != null) { this.requests = new LinkedHashMap<String,Quantity>(); }
            if(map != null) { this.requests.putAll(map);} return (A)this;
    }

    public A removeFromRequests(String key){
            if(this.requests == null) { return (A) this; }
            if(key != null && this.requests != null) {this.requests.remove(key);} return (A)this;
    }

    public A removeFromRequests(Map<String,Quantity> map){
            if(this.requests == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.requests != null){this.requests.remove(key);}}} return (A)this;
    }

    public Map<String,Quantity> getRequests(){
            return this.requests;
    }

    public A withRequests(Map<String,Quantity> requests){
            if (requests == null) { this.requests =  new LinkedHashMap<String,Quantity>();} else {this.requests = new LinkedHashMap<String,Quantity>(requests);} return (A) this;
    }

    public Boolean hasRequests(){
            return this.requests != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ResourceRequirementsFluentImpl that = (ResourceRequirementsFluentImpl) o;
            if (limits != null ? !limits.equals(that.limits) :that.limits != null) return false;
            if (requests != null ? !requests.equals(that.requests) :that.requests != null) return false;
            return true;
    }




}
