package io.fabric8.kubernetes.api.model.networking;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.builder.Nested;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.lang.String;
import com.fasterxml.jackson.databind.JsonDeserializer;
import io.fabric8.kubernetes.api.model.IntOrStringBuilder;
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
import io.fabric8.kubernetes.api.model.IntOrStringFluentImpl;

public class NetworkPolicyPortFluentImpl<A extends NetworkPolicyPortFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements NetworkPolicyPortFluent<A>{

    private IntOrStringBuilder port;
    private String protocol;

    public NetworkPolicyPortFluentImpl(){
    }
    public NetworkPolicyPortFluentImpl(NetworkPolicyPort instance){
            this.withPort(instance.getPort()); 
            this.withProtocol(instance.getProtocol()); 
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

    public NetworkPolicyPortFluent.PortNested<A> withNewPort(){
            return new PortNestedImpl();
    }

    public NetworkPolicyPortFluent.PortNested<A> withNewPortLike(IntOrString item){
            return new PortNestedImpl(item);
    }

    public NetworkPolicyPortFluent.PortNested<A> editPort(){
            return withNewPortLike(getPort());
    }

    public NetworkPolicyPortFluent.PortNested<A> editOrNewPort(){
            return withNewPortLike(getPort() != null ? getPort(): new IntOrStringBuilder().build());
    }

    public NetworkPolicyPortFluent.PortNested<A> editOrNewPortLike(IntOrString item){
            return withNewPortLike(getPort() != null ? getPort(): item);
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
            NetworkPolicyPortFluentImpl that = (NetworkPolicyPortFluentImpl) o;
            if (port != null ? !port.equals(that.port) :that.port != null) return false;
            if (protocol != null ? !protocol.equals(that.protocol) :that.protocol != null) return false;
            return true;
    }


    public class PortNestedImpl<N> extends IntOrStringFluentImpl<NetworkPolicyPortFluent.PortNested<N>> implements NetworkPolicyPortFluent.PortNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IntOrStringBuilder builder;
    
            PortNestedImpl(IntOrString item){
                    this.builder = new IntOrStringBuilder(this, item);
            }
            PortNestedImpl(){
                    this.builder = new IntOrStringBuilder(this);
            }
    
    public N and(){
            return (N) NetworkPolicyPortFluentImpl.this.withPort(builder.build());
    }
    public N endPort(){
            return and();
    }

}


}
