package io.fabric8.kubernetes.api.model;

import java.lang.Integer;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class DaemonEndpointFluentImpl<A extends DaemonEndpointFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements DaemonEndpointFluent<A>{

    private Integer port;

    public DaemonEndpointFluentImpl(){
    }
    public DaemonEndpointFluentImpl(DaemonEndpoint instance){
            this.withPort(instance.getPort()); 
    }

    public Integer getPort(){
            return this.port;
    }

    public A withPort(Integer port){
            this.port=port; return (A) this;
    }

    public Boolean hasPort(){
            return this.port != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DaemonEndpointFluentImpl that = (DaemonEndpointFluentImpl) o;
            if (port != null ? !port.equals(that.port) :that.port != null) return false;
            return true;
    }




}
