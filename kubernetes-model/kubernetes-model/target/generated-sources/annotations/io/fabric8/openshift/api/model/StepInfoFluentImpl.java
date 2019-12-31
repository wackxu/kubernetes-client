package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class StepInfoFluentImpl<A extends StepInfoFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements StepInfoFluent<A>{

    private Long durationMilliseconds;
    private String name;
    private String startTime;

    public StepInfoFluentImpl(){
    }
    public StepInfoFluentImpl(StepInfo instance){
            this.withDurationMilliseconds(instance.getDurationMilliseconds()); 
            this.withName(instance.getName()); 
            this.withStartTime(instance.getStartTime()); 
    }

    public Long getDurationMilliseconds(){
            return this.durationMilliseconds;
    }

    public A withDurationMilliseconds(Long durationMilliseconds){
            this.durationMilliseconds=durationMilliseconds; return (A) this;
    }

    public Boolean hasDurationMilliseconds(){
            return this.durationMilliseconds != null;
    }

    public A withNewDurationMilliseconds(String arg1){
            return (A)withDurationMilliseconds(new Long(arg1));
    }

    public A withNewDurationMilliseconds(long arg1){
            return (A)withDurationMilliseconds(new Long(arg1));
    }

    public String getName(){
            return this.name;
    }

    public A withName(String name){
            this.name=name; return (A) this;
    }

    public Boolean hasName(){
            return this.name != null;
    }

    public String getStartTime(){
            return this.startTime;
    }

    public A withStartTime(String startTime){
            this.startTime=startTime; return (A) this;
    }

    public Boolean hasStartTime(){
            return this.startTime != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            StepInfoFluentImpl that = (StepInfoFluentImpl) o;
            if (durationMilliseconds != null ? !durationMilliseconds.equals(that.durationMilliseconds) :that.durationMilliseconds != null) return false;
            if (name != null ? !name.equals(that.name) :that.name != null) return false;
            if (startTime != null ? !startTime.equals(that.startTime) :that.startTime != null) return false;
            return true;
    }




}
