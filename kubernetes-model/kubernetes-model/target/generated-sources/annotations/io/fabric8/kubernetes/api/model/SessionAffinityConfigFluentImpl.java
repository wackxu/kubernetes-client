package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.Integer;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class SessionAffinityConfigFluentImpl<A extends SessionAffinityConfigFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements SessionAffinityConfigFluent<A>{

    private ClientIPConfigBuilder clientIP;

    public SessionAffinityConfigFluentImpl(){
    }
    public SessionAffinityConfigFluentImpl(SessionAffinityConfig instance){
            this.withClientIP(instance.getClientIP()); 
    }

    
/**
 * This method has been deprecated, please use method buildClientIP instead.
 * @return The buildable object.
 */
@Deprecated public ClientIPConfig getClientIP(){
            return this.clientIP!=null?this.clientIP.build():null;
    }

    public ClientIPConfig buildClientIP(){
            return this.clientIP!=null?this.clientIP.build():null;
    }

    public A withClientIP(ClientIPConfig clientIP){
            _visitables.remove(this.clientIP);
            if (clientIP!=null){ this.clientIP= new ClientIPConfigBuilder(clientIP); _visitables.add(this.clientIP);} return (A) this;
    }

    public Boolean hasClientIP(){
            return this.clientIP != null;
    }

    public A withNewClientIP(Integer timeoutSeconds){
            return (A)withClientIP(new ClientIPConfig(timeoutSeconds));
    }

    public SessionAffinityConfigFluent.ClientIPNested<A> withNewClientIP(){
            return new ClientIPNestedImpl();
    }

    public SessionAffinityConfigFluent.ClientIPNested<A> withNewClientIPLike(ClientIPConfig item){
            return new ClientIPNestedImpl(item);
    }

    public SessionAffinityConfigFluent.ClientIPNested<A> editClientIP(){
            return withNewClientIPLike(getClientIP());
    }

    public SessionAffinityConfigFluent.ClientIPNested<A> editOrNewClientIP(){
            return withNewClientIPLike(getClientIP() != null ? getClientIP(): new ClientIPConfigBuilder().build());
    }

    public SessionAffinityConfigFluent.ClientIPNested<A> editOrNewClientIPLike(ClientIPConfig item){
            return withNewClientIPLike(getClientIP() != null ? getClientIP(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SessionAffinityConfigFluentImpl that = (SessionAffinityConfigFluentImpl) o;
            if (clientIP != null ? !clientIP.equals(that.clientIP) :that.clientIP != null) return false;
            return true;
    }


    public class ClientIPNestedImpl<N> extends ClientIPConfigFluentImpl<SessionAffinityConfigFluent.ClientIPNested<N>> implements SessionAffinityConfigFluent.ClientIPNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ClientIPConfigBuilder builder;
    
            ClientIPNestedImpl(ClientIPConfig item){
                    this.builder = new ClientIPConfigBuilder(this, item);
            }
            ClientIPNestedImpl(){
                    this.builder = new ClientIPConfigBuilder(this);
            }
    
    public N and(){
            return (N) SessionAffinityConfigFluentImpl.this.withClientIP(builder.build());
    }
    public N endClientIP(){
            return and();
    }

}


}
