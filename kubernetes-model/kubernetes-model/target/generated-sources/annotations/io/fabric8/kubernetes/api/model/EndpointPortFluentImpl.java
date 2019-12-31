package io.fabric8.kubernetes.api.model;

import java.lang.Integer;
import javax.validation.constraints.Pattern;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.Size;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class EndpointPortFluentImpl<A extends EndpointPortFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements EndpointPortFluent<A>{

    private String name;
    private Integer port;
    private String protocol;

    public EndpointPortFluentImpl(){
    }
    public EndpointPortFluentImpl(EndpointPort instance){
            this.withName(instance.getName()); 
            this.withPort(instance.getPort()); 
            this.withProtocol(instance.getProtocol()); 
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

    public Integer getPort(){
            return this.port;
    }

    public A withPort(Integer port){
            this.port=port; return (A) this;
    }

    public Boolean hasPort(){
            return this.port != null;
    }

    public String getProtocol(){
            return this.protocol;
    }

    public A withProtocol(String protocol){
            this.protocol=protocol; return (A) this;
    }

    public Boolean hasProtocol(){
            return this.protocol != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            EndpointPortFluentImpl that = (EndpointPortFluentImpl) o;
            if (name != null ? !name.equals(that.name) :that.name != null) return false;
            if (port != null ? !port.equals(that.port) :that.port != null) return false;
            if (protocol != null ? !protocol.equals(that.protocol) :that.protocol != null) return false;
            return true;
    }




}
