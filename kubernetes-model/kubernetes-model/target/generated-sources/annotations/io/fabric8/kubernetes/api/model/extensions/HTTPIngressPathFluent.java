package io.fabric8.kubernetes.api.model.extensions;

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

public interface HTTPIngressPathFluent<A extends HTTPIngressPathFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildBackend instead.
 * @return The buildable object.
 */
@Deprecated public IngressBackend getBackend();
    public IngressBackend buildBackend();
    public A withBackend(IngressBackend backend);
    public Boolean hasBackend();
    public HTTPIngressPathFluent.BackendNested<A> withNewBackend();
    public HTTPIngressPathFluent.BackendNested<A> withNewBackendLike(IngressBackend item);
    public HTTPIngressPathFluent.BackendNested<A> editBackend();
    public HTTPIngressPathFluent.BackendNested<A> editOrNewBackend();
    public HTTPIngressPathFluent.BackendNested<A> editOrNewBackendLike(IngressBackend item);
    public String getPath();
    public A withPath(String path);
    public Boolean hasPath();

    public interface BackendNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IngressBackendFluent<HTTPIngressPathFluent.BackendNested<N>>{

        
    public N and();    public N endBackend();
}


}
