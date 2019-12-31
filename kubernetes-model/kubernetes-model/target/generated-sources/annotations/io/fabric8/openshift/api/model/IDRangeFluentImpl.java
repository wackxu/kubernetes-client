package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class IDRangeFluentImpl<A extends io.fabric8.openshift.api.model.IDRangeFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements io.fabric8.openshift.api.model.IDRangeFluent<A>{

    private Long max;
    private Long min;

    public IDRangeFluentImpl(){
    }
    public IDRangeFluentImpl(io.fabric8.openshift.api.model.IDRange instance){
            this.withMax(instance.getMax()); 
            this.withMin(instance.getMin()); 
    }

    public Long getMax(){
            return this.max;
    }

    public A withMax(Long max){
            this.max=max; return (A) this;
    }

    public Boolean hasMax(){
            return this.max != null;
    }

    public A withNewMax(String arg1){
            return (A)withMax(new Long(arg1));
    }

    public A withNewMax(long arg1){
            return (A)withMax(new Long(arg1));
    }

    public Long getMin(){
            return this.min;
    }

    public A withMin(Long min){
            this.min=min; return (A) this;
    }

    public Boolean hasMin(){
            return this.min != null;
    }

    public A withNewMin(String arg1){
            return (A)withMin(new Long(arg1));
    }

    public A withNewMin(long arg1){
            return (A)withMin(new Long(arg1));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            IDRangeFluentImpl that = (IDRangeFluentImpl) o;
            if (max != null ? !max.equals(that.max) :that.max != null) return false;
            if (min != null ? !min.equals(that.min) :that.min != null) return false;
            return true;
    }




}
