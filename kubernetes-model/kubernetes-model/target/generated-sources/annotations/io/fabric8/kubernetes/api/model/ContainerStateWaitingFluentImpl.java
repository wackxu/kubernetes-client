package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class ContainerStateWaitingFluentImpl<A extends ContainerStateWaitingFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ContainerStateWaitingFluent<A>{

    private String message;
    private String reason;

    public ContainerStateWaitingFluentImpl(){
    }
    public ContainerStateWaitingFluentImpl(ContainerStateWaiting instance){
            this.withMessage(instance.getMessage()); 
            this.withReason(instance.getReason()); 
    }

    public String getMessage(){
            return this.message;
    }

    public A withMessage(String message){
            this.message=message; return (A) this;
    }

    public Boolean hasMessage(){
            return this.message != null;
    }

    public String getReason(){
            return this.reason;
    }

    public A withReason(String reason){
            this.reason=reason; return (A) this;
    }

    public Boolean hasReason(){
            return this.reason != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ContainerStateWaitingFluentImpl that = (ContainerStateWaitingFluentImpl) o;
            if (message != null ? !message.equals(that.message) :that.message != null) return false;
            if (reason != null ? !reason.equals(that.reason) :that.reason != null) return false;
            return true;
    }




}
