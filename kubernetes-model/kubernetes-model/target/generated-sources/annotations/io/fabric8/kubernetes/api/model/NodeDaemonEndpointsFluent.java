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

public interface NodeDaemonEndpointsFluent<A extends NodeDaemonEndpointsFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildKubeletEndpoint instead.
 * @return The buildable object.
 */
@Deprecated public DaemonEndpoint getKubeletEndpoint();
    public DaemonEndpoint buildKubeletEndpoint();
    public A withKubeletEndpoint(DaemonEndpoint kubeletEndpoint);
    public Boolean hasKubeletEndpoint();
    public A withNewKubeletEndpoint(Integer port);
    public NodeDaemonEndpointsFluent.KubeletEndpointNested<A> withNewKubeletEndpoint();
    public NodeDaemonEndpointsFluent.KubeletEndpointNested<A> withNewKubeletEndpointLike(DaemonEndpoint item);
    public NodeDaemonEndpointsFluent.KubeletEndpointNested<A> editKubeletEndpoint();
    public NodeDaemonEndpointsFluent.KubeletEndpointNested<A> editOrNewKubeletEndpoint();
    public NodeDaemonEndpointsFluent.KubeletEndpointNested<A> editOrNewKubeletEndpointLike(DaemonEndpoint item);

    public interface KubeletEndpointNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DaemonEndpointFluent<NodeDaemonEndpointsFluent.KubeletEndpointNested<N>>{

        
    public N and();    public N endKubeletEndpoint();
}


}
