package io.fabric8.kubernetes.api.model;

import java.lang.Integer;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class ContainerStateTerminatedFluentImpl<A extends ContainerStateTerminatedFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ContainerStateTerminatedFluent<A>{

    private String containerID;
    private Integer exitCode;
    private String finishedAt;
    private String message;
    private String reason;
    private Integer signal;
    private String startedAt;

    public ContainerStateTerminatedFluentImpl(){
    }
    public ContainerStateTerminatedFluentImpl(ContainerStateTerminated instance){
            this.withContainerID(instance.getContainerID()); 
            this.withExitCode(instance.getExitCode()); 
            this.withFinishedAt(instance.getFinishedAt()); 
            this.withMessage(instance.getMessage()); 
            this.withReason(instance.getReason()); 
            this.withSignal(instance.getSignal()); 
            this.withStartedAt(instance.getStartedAt()); 
    }

    public String getContainerID(){
            return this.containerID;
    }

    public A withContainerID(String containerID){
            this.containerID=containerID; return (A) this;
    }

    public Boolean hasContainerID(){
            return this.containerID != null;
    }

    public Integer getExitCode(){
            return this.exitCode;
    }

    public A withExitCode(Integer exitCode){
            this.exitCode=exitCode; return (A) this;
    }

    public Boolean hasExitCode(){
            return this.exitCode != null;
    }

    public String getFinishedAt(){
            return this.finishedAt;
    }

    public A withFinishedAt(String finishedAt){
            this.finishedAt=finishedAt; return (A) this;
    }

    public Boolean hasFinishedAt(){
            return this.finishedAt != null;
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

    public Integer getSignal(){
            return this.signal;
    }

    public A withSignal(Integer signal){
            this.signal=signal; return (A) this;
    }

    public Boolean hasSignal(){
            return this.signal != null;
    }

    public String getStartedAt(){
            return this.startedAt;
    }

    public A withStartedAt(String startedAt){
            this.startedAt=startedAt; return (A) this;
    }

    public Boolean hasStartedAt(){
            return this.startedAt != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ContainerStateTerminatedFluentImpl that = (ContainerStateTerminatedFluentImpl) o;
            if (containerID != null ? !containerID.equals(that.containerID) :that.containerID != null) return false;
            if (exitCode != null ? !exitCode.equals(that.exitCode) :that.exitCode != null) return false;
            if (finishedAt != null ? !finishedAt.equals(that.finishedAt) :that.finishedAt != null) return false;
            if (message != null ? !message.equals(that.message) :that.message != null) return false;
            if (reason != null ? !reason.equals(that.reason) :that.reason != null) return false;
            if (signal != null ? !signal.equals(that.signal) :that.signal != null) return false;
            if (startedAt != null ? !startedAt.equals(that.startedAt) :that.startedAt != null) return false;
            return true;
    }




}
