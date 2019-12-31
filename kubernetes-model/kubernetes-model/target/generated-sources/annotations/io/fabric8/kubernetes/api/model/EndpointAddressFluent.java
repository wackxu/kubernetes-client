package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface EndpointAddressFluent<A extends EndpointAddressFluent<A>> extends Fluent<A>{


    public String getHostname();
    public A withHostname(String hostname);
    public Boolean hasHostname();
    public String getIp();
    public A withIp(String ip);
    public Boolean hasIp();
    public String getNodeName();
    public A withNodeName(String nodeName);
    public Boolean hasNodeName();
    
/**
 * This method has been deprecated, please use method buildTargetRef instead.
 * @return The buildable object.
 */
@Deprecated public ObjectReference getTargetRef();
    public ObjectReference buildTargetRef();
    public A withTargetRef(ObjectReference targetRef);
    public Boolean hasTargetRef();
    public EndpointAddressFluent.TargetRefNested<A> withNewTargetRef();
    public EndpointAddressFluent.TargetRefNested<A> withNewTargetRefLike(ObjectReference item);
    public EndpointAddressFluent.TargetRefNested<A> editTargetRef();
    public EndpointAddressFluent.TargetRefNested<A> editOrNewTargetRef();
    public EndpointAddressFluent.TargetRefNested<A> editOrNewTargetRefLike(ObjectReference item);

    public interface TargetRefNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectReferenceFluent<EndpointAddressFluent.TargetRefNested<N>>{

        
    public N and();    public N endTargetRef();
}


}
