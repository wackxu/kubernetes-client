package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.lang.String;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.lang.Deprecated;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.lang.Boolean;
import java.lang.Override;
import com.fasterxml.jackson.core.JsonParser;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Integer;
import javax.validation.Valid;
import java.lang.Object;
import java.util.Map;

public interface TCPSocketActionFluent<A extends TCPSocketActionFluent<A>> extends Fluent<A>{


    public String getHost();
    public A withHost(String host);
    public Boolean hasHost();
    
/**
 * This method has been deprecated, please use method buildPort instead.
 * @return The buildable object.
 */
@Deprecated public IntOrString getPort();
    public IntOrString buildPort();
    public A withPort(IntOrString port);
    public Boolean hasPort();
    public A withNewPort(String strVal);
    public A withNewPort(Integer intVal);
    public TCPSocketActionFluent.PortNested<A> withNewPort();
    public TCPSocketActionFluent.PortNested<A> withNewPortLike(IntOrString item);
    public TCPSocketActionFluent.PortNested<A> editPort();
    public TCPSocketActionFluent.PortNested<A> editOrNewPort();
    public TCPSocketActionFluent.PortNested<A> editOrNewPortLike(IntOrString item);

    public interface PortNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IntOrStringFluent<TCPSocketActionFluent.PortNested<N>>{

        
    public N and();    public N endPort();
}


}
