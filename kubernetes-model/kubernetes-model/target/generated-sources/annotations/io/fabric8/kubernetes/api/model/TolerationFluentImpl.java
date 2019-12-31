package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class TolerationFluentImpl<A extends TolerationFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements TolerationFluent<A>{

    private String effect;
    private String key;
    private String operator;
    private Long tolerationSeconds;
    private String value;

    public TolerationFluentImpl(){
    }
    public TolerationFluentImpl(Toleration instance){
            this.withEffect(instance.getEffect()); 
            this.withKey(instance.getKey()); 
            this.withOperator(instance.getOperator()); 
            this.withTolerationSeconds(instance.getTolerationSeconds()); 
            this.withValue(instance.getValue()); 
    }

    public String getEffect(){
            return this.effect;
    }

    public A withEffect(String effect){
            this.effect=effect; return (A) this;
    }

    public Boolean hasEffect(){
            return this.effect != null;
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

    public String getOperator(){
            return this.operator;
    }

    public A withOperator(String operator){
            this.operator=operator; return (A) this;
    }

    public Boolean hasOperator(){
            return this.operator != null;
    }

    public Long getTolerationSeconds(){
            return this.tolerationSeconds;
    }

    public A withTolerationSeconds(Long tolerationSeconds){
            this.tolerationSeconds=tolerationSeconds; return (A) this;
    }

    public Boolean hasTolerationSeconds(){
            return this.tolerationSeconds != null;
    }

    public A withNewTolerationSeconds(String arg1){
            return (A)withTolerationSeconds(new Long(arg1));
    }

    public A withNewTolerationSeconds(long arg1){
            return (A)withTolerationSeconds(new Long(arg1));
    }

    public String getValue(){
            return this.value;
    }

    public A withValue(String value){
            this.value=value; return (A) this;
    }

    public Boolean hasValue(){
            return this.value != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            TolerationFluentImpl that = (TolerationFluentImpl) o;
            if (effect != null ? !effect.equals(that.effect) :that.effect != null) return false;
            if (key != null ? !key.equals(that.key) :that.key != null) return false;
            if (operator != null ? !operator.equals(that.operator) :that.operator != null) return false;
            if (tolerationSeconds != null ? !tolerationSeconds.equals(that.tolerationSeconds) :that.tolerationSeconds != null) return false;
            if (value != null ? !value.equals(that.value) :that.value != null) return false;
            return true;
    }




}
