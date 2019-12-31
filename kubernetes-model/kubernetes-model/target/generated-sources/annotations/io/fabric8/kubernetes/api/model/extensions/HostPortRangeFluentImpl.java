package io.fabric8.kubernetes.api.model.extensions;

import java.lang.Integer;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class HostPortRangeFluentImpl<A extends HostPortRangeFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements HostPortRangeFluent<A>{

    private Integer max;
    private Integer min;

    public HostPortRangeFluentImpl(){
    }
    public HostPortRangeFluentImpl(HostPortRange instance){
            this.withMax(instance.getMax()); 
            this.withMin(instance.getMin()); 
    }

    public Integer getMax(){
            return this.max;
    }

    public A withMax(Integer max){
            this.max=max; return (A) this;
    }

    public Boolean hasMax(){
            return this.max != null;
    }

    public Integer getMin(){
            return this.min;
    }

    public A withMin(Integer min){
            this.min=min; return (A) this;
    }

    public Boolean hasMin(){
            return this.min != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            HostPortRangeFluentImpl that = (HostPortRangeFluentImpl) o;
            if (max != null ? !max.equals(that.max) :that.max != null) return false;
            if (min != null ? !min.equals(that.min) :that.min != null) return false;
            return true;
    }




}
