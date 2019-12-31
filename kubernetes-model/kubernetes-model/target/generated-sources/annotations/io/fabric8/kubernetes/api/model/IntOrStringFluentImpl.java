package io.fabric8.kubernetes.api.model;

import java.lang.Integer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;
import java.util.LinkedHashMap;

public class IntOrStringFluentImpl<A extends IntOrStringFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements IntOrStringFluent<A>{

    private Integer IntVal;
    private Integer Kind;
    private String StrVal;
    private Map<String,Object> additionalProperties;

    public IntOrStringFluentImpl(){
    }
    public IntOrStringFluentImpl(IntOrString instance){
            this.withIntVal(instance.getIntVal()); 
            this.withKind(instance.getKind()); 
            this.withStrVal(instance.getStrVal()); 
            this.withAdditionalProperties(instance.getAdditionalProperties()); 
            this.withIntVal(instance.getIntVal());

            this.withKind(instance.getKind());

            this.withStrVal(instance.getStrVal());

    }

    public Integer getIntVal(){
            return this.IntVal;
    }

    public A withIntVal(Integer IntVal){
            this.IntVal=IntVal; return (A) this;
    }

    public Boolean hasIntVal(){
            return this.IntVal != null;
    }

    public Integer getKind(){
            return this.Kind;
    }

    public A withKind(Integer Kind){
            this.Kind=Kind; return (A) this;
    }

    public Boolean hasKind(){
            return this.Kind != null;
    }

    public String getStrVal(){
            return this.StrVal;
    }

    public A withStrVal(String StrVal){
            this.StrVal=StrVal; return (A) this;
    }

    public Boolean hasStrVal(){
            return this.StrVal != null;
    }

    public A addToAdditionalProperties(String key,Object value){
            if(this.additionalProperties == null && key != null && value != null) { this.additionalProperties = new LinkedHashMap<String,Object>(); }
            if(key != null && value != null) {this.additionalProperties.put(key, value);} return (A)this;
    }

    public A addToAdditionalProperties(Map<String,Object> map){
            if(this.additionalProperties == null && map != null) { this.additionalProperties = new LinkedHashMap<String,Object>(); }
            if(map != null) { this.additionalProperties.putAll(map);} return (A)this;
    }

    public A removeFromAdditionalProperties(String key){
            if(this.additionalProperties == null) { return (A) this; }
            if(key != null && this.additionalProperties != null) {this.additionalProperties.remove(key);} return (A)this;
    }

    public A removeFromAdditionalProperties(Map<String,Object> map){
            if(this.additionalProperties == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.additionalProperties != null){this.additionalProperties.remove(key);}}} return (A)this;
    }

    public Map<String,Object> getAdditionalProperties(){
            return this.additionalProperties;
    }

    public A withAdditionalProperties(Map<String,Object> additionalProperties){
            if (additionalProperties == null) { this.additionalProperties =  new LinkedHashMap<String,Object>();} else {this.additionalProperties = new LinkedHashMap<String,Object>(additionalProperties);} return (A) this;
    }

    public Boolean hasAdditionalProperties(){
            return this.additionalProperties != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            IntOrStringFluentImpl that = (IntOrStringFluentImpl) o;
            if (IntVal != null ? !IntVal.equals(that.IntVal) :that.IntVal != null) return false;
            if (Kind != null ? !Kind.equals(that.Kind) :that.Kind != null) return false;
            if (StrVal != null ? !StrVal.equals(that.StrVal) :that.StrVal != null) return false;
            if (additionalProperties != null ? !additionalProperties.equals(that.additionalProperties) :that.additionalProperties != null) return false;
            return true;
    }




}
