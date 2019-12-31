package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class TaintFluentImpl<A extends TaintFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements TaintFluent<A>{

    private String effect;
    private String key;
    private String timeAdded;
    private String value;

    public TaintFluentImpl(){
    }
    public TaintFluentImpl(Taint instance){
            this.withEffect(instance.getEffect()); 
            this.withKey(instance.getKey()); 
            this.withTimeAdded(instance.getTimeAdded()); 
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

    public String getTimeAdded(){
            return this.timeAdded;
    }

    public A withTimeAdded(String timeAdded){
            this.timeAdded=timeAdded; return (A) this;
    }

    public Boolean hasTimeAdded(){
            return this.timeAdded != null;
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
            TaintFluentImpl that = (TaintFluentImpl) o;
            if (effect != null ? !effect.equals(that.effect) :that.effect != null) return false;
            if (key != null ? !key.equals(that.key) :that.key != null) return false;
            if (timeAdded != null ? !timeAdded.equals(that.timeAdded) :that.timeAdded != null) return false;
            if (value != null ? !value.equals(that.value) :that.value != null) return false;
            return true;
    }




}
