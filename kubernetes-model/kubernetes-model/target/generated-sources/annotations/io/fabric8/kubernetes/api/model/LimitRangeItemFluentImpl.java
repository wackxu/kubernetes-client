package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;
import java.util.LinkedHashMap;

public class LimitRangeItemFluentImpl<A extends LimitRangeItemFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements LimitRangeItemFluent<A>{

    private Map<String,Quantity> _default;
    private Map<String,Quantity> defaultRequest;
    private Map<String,Quantity> max;
    private Map<String,Quantity> maxLimitRequestRatio;
    private Map<String,Quantity> min;
    private String type;

    public LimitRangeItemFluentImpl(){
    }
    public LimitRangeItemFluentImpl(LimitRangeItem instance){
            this.withDefault(instance.getDefault()); 
            this.withDefaultRequest(instance.getDefaultRequest()); 
            this.withMax(instance.getMax()); 
            this.withMaxLimitRequestRatio(instance.getMaxLimitRequestRatio()); 
            this.withMin(instance.getMin()); 
            this.withType(instance.getType()); 
    }

    public A addToDefault(String key,Quantity value){
            if(this._default == null && key != null && value != null) { this._default = new LinkedHashMap<String,Quantity>(); }
            if(key != null && value != null) {this._default.put(key, value);} return (A)this;
    }

    public A addToDefault(Map<String,Quantity> map){
            if(this._default == null && map != null) { this._default = new LinkedHashMap<String,Quantity>(); }
            if(map != null) { this._default.putAll(map);} return (A)this;
    }

    public A removeFromDefault(String key){
            if(this._default == null) { return (A) this; }
            if(key != null && this._default != null) {this._default.remove(key);} return (A)this;
    }

    public A removeFromDefault(Map<String,Quantity> map){
            if(this._default == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this._default != null){this._default.remove(key);}}} return (A)this;
    }

    public Map<String,Quantity> getDefault(){
            return this._default;
    }

    public A withDefault(Map<String,Quantity> _default){
            if (_default == null) { this._default =  new LinkedHashMap<String,Quantity>();} else {this._default = new LinkedHashMap<String,Quantity>(_default);} return (A) this;
    }

    public Boolean hasDefault(){
            return this._default != null;
    }

    public A addToDefaultRequest(String key,Quantity value){
            if(this.defaultRequest == null && key != null && value != null) { this.defaultRequest = new LinkedHashMap<String,Quantity>(); }
            if(key != null && value != null) {this.defaultRequest.put(key, value);} return (A)this;
    }

    public A addToDefaultRequest(Map<String,Quantity> map){
            if(this.defaultRequest == null && map != null) { this.defaultRequest = new LinkedHashMap<String,Quantity>(); }
            if(map != null) { this.defaultRequest.putAll(map);} return (A)this;
    }

    public A removeFromDefaultRequest(String key){
            if(this.defaultRequest == null) { return (A) this; }
            if(key != null && this.defaultRequest != null) {this.defaultRequest.remove(key);} return (A)this;
    }

    public A removeFromDefaultRequest(Map<String,Quantity> map){
            if(this.defaultRequest == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.defaultRequest != null){this.defaultRequest.remove(key);}}} return (A)this;
    }

    public Map<String,Quantity> getDefaultRequest(){
            return this.defaultRequest;
    }

    public A withDefaultRequest(Map<String,Quantity> defaultRequest){
            if (defaultRequest == null) { this.defaultRequest =  new LinkedHashMap<String,Quantity>();} else {this.defaultRequest = new LinkedHashMap<String,Quantity>(defaultRequest);} return (A) this;
    }

    public Boolean hasDefaultRequest(){
            return this.defaultRequest != null;
    }

    public A addToMax(String key,Quantity value){
            if(this.max == null && key != null && value != null) { this.max = new LinkedHashMap<String,Quantity>(); }
            if(key != null && value != null) {this.max.put(key, value);} return (A)this;
    }

    public A addToMax(Map<String,Quantity> map){
            if(this.max == null && map != null) { this.max = new LinkedHashMap<String,Quantity>(); }
            if(map != null) { this.max.putAll(map);} return (A)this;
    }

    public A removeFromMax(String key){
            if(this.max == null) { return (A) this; }
            if(key != null && this.max != null) {this.max.remove(key);} return (A)this;
    }

    public A removeFromMax(Map<String,Quantity> map){
            if(this.max == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.max != null){this.max.remove(key);}}} return (A)this;
    }

    public Map<String,Quantity> getMax(){
            return this.max;
    }

    public A withMax(Map<String,Quantity> max){
            if (max == null) { this.max =  new LinkedHashMap<String,Quantity>();} else {this.max = new LinkedHashMap<String,Quantity>(max);} return (A) this;
    }

    public Boolean hasMax(){
            return this.max != null;
    }

    public A addToMaxLimitRequestRatio(String key,Quantity value){
            if(this.maxLimitRequestRatio == null && key != null && value != null) { this.maxLimitRequestRatio = new LinkedHashMap<String,Quantity>(); }
            if(key != null && value != null) {this.maxLimitRequestRatio.put(key, value);} return (A)this;
    }

    public A addToMaxLimitRequestRatio(Map<String,Quantity> map){
            if(this.maxLimitRequestRatio == null && map != null) { this.maxLimitRequestRatio = new LinkedHashMap<String,Quantity>(); }
            if(map != null) { this.maxLimitRequestRatio.putAll(map);} return (A)this;
    }

    public A removeFromMaxLimitRequestRatio(String key){
            if(this.maxLimitRequestRatio == null) { return (A) this; }
            if(key != null && this.maxLimitRequestRatio != null) {this.maxLimitRequestRatio.remove(key);} return (A)this;
    }

    public A removeFromMaxLimitRequestRatio(Map<String,Quantity> map){
            if(this.maxLimitRequestRatio == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.maxLimitRequestRatio != null){this.maxLimitRequestRatio.remove(key);}}} return (A)this;
    }

    public Map<String,Quantity> getMaxLimitRequestRatio(){
            return this.maxLimitRequestRatio;
    }

    public A withMaxLimitRequestRatio(Map<String,Quantity> maxLimitRequestRatio){
            if (maxLimitRequestRatio == null) { this.maxLimitRequestRatio =  new LinkedHashMap<String,Quantity>();} else {this.maxLimitRequestRatio = new LinkedHashMap<String,Quantity>(maxLimitRequestRatio);} return (A) this;
    }

    public Boolean hasMaxLimitRequestRatio(){
            return this.maxLimitRequestRatio != null;
    }

    public A addToMin(String key,Quantity value){
            if(this.min == null && key != null && value != null) { this.min = new LinkedHashMap<String,Quantity>(); }
            if(key != null && value != null) {this.min.put(key, value);} return (A)this;
    }

    public A addToMin(Map<String,Quantity> map){
            if(this.min == null && map != null) { this.min = new LinkedHashMap<String,Quantity>(); }
            if(map != null) { this.min.putAll(map);} return (A)this;
    }

    public A removeFromMin(String key){
            if(this.min == null) { return (A) this; }
            if(key != null && this.min != null) {this.min.remove(key);} return (A)this;
    }

    public A removeFromMin(Map<String,Quantity> map){
            if(this.min == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.min != null){this.min.remove(key);}}} return (A)this;
    }

    public Map<String,Quantity> getMin(){
            return this.min;
    }

    public A withMin(Map<String,Quantity> min){
            if (min == null) { this.min =  new LinkedHashMap<String,Quantity>();} else {this.min = new LinkedHashMap<String,Quantity>(min);} return (A) this;
    }

    public Boolean hasMin(){
            return this.min != null;
    }

    public String getType(){
            return this.type;
    }

    public A withType(String type){
            this.type=type; return (A) this;
    }

    public Boolean hasType(){
            return this.type != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            LimitRangeItemFluentImpl that = (LimitRangeItemFluentImpl) o;
            if (_default != null ? !_default.equals(that._default) :that._default != null) return false;
            if (defaultRequest != null ? !defaultRequest.equals(that.defaultRequest) :that.defaultRequest != null) return false;
            if (max != null ? !max.equals(that.max) :that.max != null) return false;
            if (maxLimitRequestRatio != null ? !maxLimitRequestRatio.equals(that.maxLimitRequestRatio) :that.maxLimitRequestRatio != null) return false;
            if (min != null ? !min.equals(that.min) :that.min != null) return false;
            if (type != null ? !type.equals(that.type) :that.type != null) return false;
            return true;
    }




}
