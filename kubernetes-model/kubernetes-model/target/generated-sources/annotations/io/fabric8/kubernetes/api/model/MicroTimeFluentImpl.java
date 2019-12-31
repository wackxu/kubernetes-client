package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class MicroTimeFluentImpl<A extends MicroTimeFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements MicroTimeFluent<A>{

    private String time;

    public MicroTimeFluentImpl(){
    }
    public MicroTimeFluentImpl(MicroTime instance){
            this.withTime(instance.getTime()); 
    }

    public String getTime(){
            return this.time;
    }

    public A withTime(String time){
            this.time=time; return (A) this;
    }

    public Boolean hasTime(){
            return this.time != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            MicroTimeFluentImpl that = (MicroTimeFluentImpl) o;
            if (time != null ? !time.equals(that.time) :that.time != null) return false;
            return true;
    }




}
