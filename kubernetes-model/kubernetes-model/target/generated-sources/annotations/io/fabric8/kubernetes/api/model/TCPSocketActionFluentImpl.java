package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.lang.String;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.lang.Boolean;
import java.lang.Override;
import com.fasterxml.jackson.core.JsonParser;
import java.lang.Integer;
import javax.validation.Valid;
import java.lang.Object;

public class TCPSocketActionFluentImpl<A extends TCPSocketActionFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements TCPSocketActionFluent<A>{

    private String host;
    private IntOrStringBuilder port;

    public TCPSocketActionFluentImpl(){
    }
    public TCPSocketActionFluentImpl(TCPSocketAction instance){
            this.withHost(instance.getHost()); 
            this.withPort(instance.getPort()); 
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

    
/**
 * This method has been deprecated, please use method buildPort instead.
 * @return The buildable object.
 */
@Deprecated public IntOrString getPort(){
            return this.port!=null?this.port.build():null;
    }

    public IntOrString buildPort(){
            return this.port!=null?this.port.build():null;
    }

    public A withPort(IntOrString port){
            _visitables.remove(this.port);
            if (port!=null){ this.port= new IntOrStringBuilder(port); _visitables.add(this.port);} return (A) this;
    }

    public Boolean hasPort(){
            return this.port != null;
    }

    public A withNewPort(String strVal){
            return (A)withPort(new IntOrString(strVal));
    }

    public A withNewPort(Integer intVal){
            return (A)withPort(new IntOrString(intVal));
    }

    public TCPSocketActionFluent.PortNested<A> withNewPort(){
            return new PortNestedImpl();
    }

    public TCPSocketActionFluent.PortNested<A> withNewPortLike(IntOrString item){
            return new PortNestedImpl(item);
    }

    public TCPSocketActionFluent.PortNested<A> editPort(){
            return withNewPortLike(getPort());
    }

    public TCPSocketActionFluent.PortNested<A> editOrNewPort(){
            return withNewPortLike(getPort() != null ? getPort(): new IntOrStringBuilder().build());
    }

    public TCPSocketActionFluent.PortNested<A> editOrNewPortLike(IntOrString item){
            return withNewPortLike(getPort() != null ? getPort(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            TCPSocketActionFluentImpl that = (TCPSocketActionFluentImpl) o;
            if (host != null ? !host.equals(that.host) :that.host != null) return false;
            if (port != null ? !port.equals(that.port) :that.port != null) return false;
            return true;
    }


    public class PortNestedImpl<N> extends IntOrStringFluentImpl<TCPSocketActionFluent.PortNested<N>> implements TCPSocketActionFluent.PortNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IntOrStringBuilder builder;
    
            PortNestedImpl(IntOrString item){
                    this.builder = new IntOrStringBuilder(this, item);
            }
            PortNestedImpl(){
                    this.builder = new IntOrStringBuilder(this);
            }
    
    public N and(){
            return (N) TCPSocketActionFluentImpl.this.withPort(builder.build());
    }
    public N endPort(){
            return and();
    }

}


}
