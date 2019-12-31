package io.fabric8.kubernetes.api.model.policy;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.LinkedHashMap;
import java.lang.Integer;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public class PodDisruptionBudgetStatusFluentImpl<A extends PodDisruptionBudgetStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements PodDisruptionBudgetStatusFluent<A>{

    private Integer currentHealthy;
    private Integer desiredHealthy;
    private Map<String,String> disruptedPods;
    private Integer disruptionsAllowed;
    private Integer expectedPods;
    private Long observedGeneration;

    public PodDisruptionBudgetStatusFluentImpl(){
    }
    public PodDisruptionBudgetStatusFluentImpl(PodDisruptionBudgetStatus instance){
            this.withCurrentHealthy(instance.getCurrentHealthy()); 
            this.withDesiredHealthy(instance.getDesiredHealthy()); 
            this.withDisruptedPods(instance.getDisruptedPods()); 
            this.withDisruptionsAllowed(instance.getDisruptionsAllowed()); 
            this.withExpectedPods(instance.getExpectedPods()); 
            this.withObservedGeneration(instance.getObservedGeneration()); 
    }

    public Integer getCurrentHealthy(){
            return this.currentHealthy;
    }

    public A withCurrentHealthy(Integer currentHealthy){
            this.currentHealthy=currentHealthy; return (A) this;
    }

    public Boolean hasCurrentHealthy(){
            return this.currentHealthy != null;
    }

    public Integer getDesiredHealthy(){
            return this.desiredHealthy;
    }

    public A withDesiredHealthy(Integer desiredHealthy){
            this.desiredHealthy=desiredHealthy; return (A) this;
    }

    public Boolean hasDesiredHealthy(){
            return this.desiredHealthy != null;
    }

    public A addToDisruptedPods(String key,String value){
            if(this.disruptedPods == null && key != null && value != null) { this.disruptedPods = new LinkedHashMap<String,String>(); }
            if(key != null && value != null) {this.disruptedPods.put(key, value);} return (A)this;
    }

    public A addToDisruptedPods(Map<String,String> map){
            if(this.disruptedPods == null && map != null) { this.disruptedPods = new LinkedHashMap<String,String>(); }
            if(map != null) { this.disruptedPods.putAll(map);} return (A)this;
    }

    public A removeFromDisruptedPods(String key){
            if(this.disruptedPods == null) { return (A) this; }
            if(key != null && this.disruptedPods != null) {this.disruptedPods.remove(key);} return (A)this;
    }

    public A removeFromDisruptedPods(Map<String,String> map){
            if(this.disruptedPods == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.disruptedPods != null){this.disruptedPods.remove(key);}}} return (A)this;
    }

    public Map<String,String> getDisruptedPods(){
            return this.disruptedPods;
    }

    public A withDisruptedPods(Map<String,String> disruptedPods){
            if (disruptedPods == null) { this.disruptedPods =  new LinkedHashMap<String,String>();} else {this.disruptedPods = new LinkedHashMap<String,String>(disruptedPods);} return (A) this;
    }

    public Boolean hasDisruptedPods(){
            return this.disruptedPods != null;
    }

    public Integer getDisruptionsAllowed(){
            return this.disruptionsAllowed;
    }

    public A withDisruptionsAllowed(Integer disruptionsAllowed){
            this.disruptionsAllowed=disruptionsAllowed; return (A) this;
    }

    public Boolean hasDisruptionsAllowed(){
            return this.disruptionsAllowed != null;
    }

    public Integer getExpectedPods(){
            return this.expectedPods;
    }

    public A withExpectedPods(Integer expectedPods){
            this.expectedPods=expectedPods; return (A) this;
    }

    public Boolean hasExpectedPods(){
            return this.expectedPods != null;
    }

    public Long getObservedGeneration(){
            return this.observedGeneration;
    }

    public A withObservedGeneration(Long observedGeneration){
            this.observedGeneration=observedGeneration; return (A) this;
    }

    public Boolean hasObservedGeneration(){
            return this.observedGeneration != null;
    }

    public A withNewObservedGeneration(String arg1){
            return (A)withObservedGeneration(new Long(arg1));
    }

    public A withNewObservedGeneration(long arg1){
            return (A)withObservedGeneration(new Long(arg1));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PodDisruptionBudgetStatusFluentImpl that = (PodDisruptionBudgetStatusFluentImpl) o;
            if (currentHealthy != null ? !currentHealthy.equals(that.currentHealthy) :that.currentHealthy != null) return false;
            if (desiredHealthy != null ? !desiredHealthy.equals(that.desiredHealthy) :that.desiredHealthy != null) return false;
            if (disruptedPods != null ? !disruptedPods.equals(that.disruptedPods) :that.disruptedPods != null) return false;
            if (disruptionsAllowed != null ? !disruptionsAllowed.equals(that.disruptionsAllowed) :that.disruptionsAllowed != null) return false;
            if (expectedPods != null ? !expectedPods.equals(that.expectedPods) :that.expectedPods != null) return false;
            if (observedGeneration != null ? !observedGeneration.equals(that.observedGeneration) :that.observedGeneration != null) return false;
            return true;
    }




}
