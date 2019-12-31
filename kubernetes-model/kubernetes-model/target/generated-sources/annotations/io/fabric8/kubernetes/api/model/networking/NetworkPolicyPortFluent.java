package io.fabric8.kubernetes.api.model.networking;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.builder.Nested;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.lang.String;
import com.fasterxml.jackson.databind.JsonDeserializer;
import io.fabric8.kubernetes.api.model.IntOrStringBuilder;
import java.lang.Deprecated;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.lang.Boolean;
import java.lang.Override;
import com.fasterxml.jackson.core.JsonParser;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.IntOrStringFluent;
import java.lang.Integer;
import javax.validation.Valid;
import java.lang.Object;
import java.util.Map;

public interface NetworkPolicyPortFluent<A extends NetworkPolicyPortFluent<A>> extends Fluent<A>{


    
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
    public NetworkPolicyPortFluent.PortNested<A> withNewPort();
    public NetworkPolicyPortFluent.PortNested<A> withNewPortLike(IntOrString item);
    public NetworkPolicyPortFluent.PortNested<A> editPort();
    public NetworkPolicyPortFluent.PortNested<A> editOrNewPort();
    public NetworkPolicyPortFluent.PortNested<A> editOrNewPortLike(IntOrString item);
    public String getProtocol();
    public A withProtocol(String protocol);
    public Boolean hasProtocol();

    public interface PortNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IntOrStringFluent<NetworkPolicyPortFluent.PortNested<N>>{

        
    public N and();    public N endPort();
}


}
