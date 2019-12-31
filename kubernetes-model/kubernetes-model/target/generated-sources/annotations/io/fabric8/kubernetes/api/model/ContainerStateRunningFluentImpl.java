package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class ContainerStateRunningFluentImpl<A extends ContainerStateRunningFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ContainerStateRunningFluent<A>{

    private String startedAt;

    public ContainerStateRunningFluentImpl(){
    }
    public ContainerStateRunningFluentImpl(ContainerStateRunning instance){
            this.withStartedAt(instance.getStartedAt()); 
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
            ContainerStateRunningFluentImpl that = (ContainerStateRunningFluentImpl) o;
            if (startedAt != null ? !startedAt.equals(that.startedAt) :that.startedAt != null) return false;
            return true;
    }




}
