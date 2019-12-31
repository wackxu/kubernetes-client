package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface SessionAffinityConfigFluent<A extends SessionAffinityConfigFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildClientIP instead.
 * @return The buildable object.
 */
@Deprecated public ClientIPConfig getClientIP();
    public ClientIPConfig buildClientIP();
    public A withClientIP(ClientIPConfig clientIP);
    public Boolean hasClientIP();
    public A withNewClientIP(Integer timeoutSeconds);
    public SessionAffinityConfigFluent.ClientIPNested<A> withNewClientIP();
    public SessionAffinityConfigFluent.ClientIPNested<A> withNewClientIPLike(ClientIPConfig item);
    public SessionAffinityConfigFluent.ClientIPNested<A> editClientIP();
    public SessionAffinityConfigFluent.ClientIPNested<A> editOrNewClientIP();
    public SessionAffinityConfigFluent.ClientIPNested<A> editOrNewClientIPLike(ClientIPConfig item);

    public interface ClientIPNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ClientIPConfigFluent<SessionAffinityConfigFluent.ClientIPNested<N>>{

        
    public N and();    public N endClientIP();
}


}
