package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class EventSourceFluentImpl<A extends EventSourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements EventSourceFluent<A>{

    private String component;
    private String host;

    public EventSourceFluentImpl(){
    }
    public EventSourceFluentImpl(EventSource instance){
            this.withComponent(instance.getComponent()); 
            this.withHost(instance.getHost()); 
    }

    public String getComponent(){
            return this.component;
    }

    public A withComponent(String component){
            this.component=component; return (A) this;
    }

    public Boolean hasComponent(){
            return this.component != null;
    }

    public String getHost(){
            return this.host;
    }

    public A withHost(String host){
            this.host=host; return (A) this;
    }

    public Boolean hasHost(){
            return this.host != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            EventSourceFluentImpl that = (EventSourceFluentImpl) o;
            if (component != null ? !component.equals(that.component) :that.component != null) return false;
            if (host != null ? !host.equals(that.host) :that.host != null) return false;
            return true;
    }




}
