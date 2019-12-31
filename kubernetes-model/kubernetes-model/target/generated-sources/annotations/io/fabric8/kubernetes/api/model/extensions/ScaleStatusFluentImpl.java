package io.fabric8.kubernetes.api.model.extensions;

import java.lang.Integer;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;
import java.util.LinkedHashMap;

public class ScaleStatusFluentImpl<A extends ScaleStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ScaleStatusFluent<A>{

    private Integer replicas;
    private Map<String,String> selector;
    private String targetSelector;

    public ScaleStatusFluentImpl(){
    }
    public ScaleStatusFluentImpl(ScaleStatus instance){
            this.withReplicas(instance.getReplicas()); 
            this.withSelector(instance.getSelector()); 
            this.withTargetSelector(instance.getTargetSelector()); 
    }

    public Integer getReplicas(){
            return this.replicas;
    }

    public A withReplicas(Integer replicas){
            this.replicas=replicas; return (A) this;
    }

    public Boolean hasReplicas(){
            return this.replicas != null;
    }

    public A addToSelector(String key,String value){
            if(this.selector == null && key != null && value != null) { this.selector = new LinkedHashMap<String,String>(); }
            if(key != null && value != null) {this.selector.put(key, value);} return (A)this;
    }

    public A addToSelector(Map<String,String> map){
            if(this.selector == null && map != null) { this.selector = new LinkedHashMap<String,String>(); }
            if(map != null) { this.selector.putAll(map);} return (A)this;
    }

    public A removeFromSelector(String key){
            if(this.selector == null) { return (A) this; }
            if(key != null && this.selector != null) {this.selector.remove(key);} return (A)this;
    }

    public A removeFromSelector(Map<String,String> map){
            if(this.selector == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.selector != null){this.selector.remove(key);}}} return (A)this;
    }

    public Map<String,String> getSelector(){
            return this.selector;
    }

    public A withSelector(Map<String,String> selector){
            if (selector == null) { this.selector =  new LinkedHashMap<String,String>();} else {this.selector = new LinkedHashMap<String,String>(selector);} return (A) this;
    }

    public Boolean hasSelector(){
            return this.selector != null;
    }

    public String getTargetSelector(){
            return this.targetSelector;
    }

    public A withTargetSelector(String targetSelector){
            this.targetSelector=targetSelector; return (A) this;
    }

    public Boolean hasTargetSelector(){
            return this.targetSelector != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ScaleStatusFluentImpl that = (ScaleStatusFluentImpl) o;
            if (replicas != null ? !replicas.equals(that.replicas) :that.replicas != null) return false;
            if (selector != null ? !selector.equals(that.selector) :that.selector != null) return false;
            if (targetSelector != null ? !targetSelector.equals(that.targetSelector) :that.targetSelector != null) return false;
            return true;
    }




}
