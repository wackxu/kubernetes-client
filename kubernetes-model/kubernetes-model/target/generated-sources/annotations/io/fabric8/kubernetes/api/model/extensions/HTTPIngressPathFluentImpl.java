package io.fabric8.kubernetes.api.model.extensions;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class HTTPIngressPathFluentImpl<A extends HTTPIngressPathFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements HTTPIngressPathFluent<A>{

    private IngressBackendBuilder backend;
    private String path;

    public HTTPIngressPathFluentImpl(){
    }
    public HTTPIngressPathFluentImpl(HTTPIngressPath instance){
            this.withBackend(instance.getBackend()); 
            this.withPath(instance.getPath()); 
    }

    
/**
 * This method has been deprecated, please use method buildBackend instead.
 * @return The buildable object.
 */
@Deprecated public IngressBackend getBackend(){
            return this.backend!=null?this.backend.build():null;
    }

    public IngressBackend buildBackend(){
            return this.backend!=null?this.backend.build():null;
    }

    public A withBackend(IngressBackend backend){
            _visitables.remove(this.backend);
            if (backend!=null){ this.backend= new IngressBackendBuilder(backend); _visitables.add(this.backend);} return (A) this;
    }

    public Boolean hasBackend(){
            return this.backend != null;
    }

    public HTTPIngressPathFluent.BackendNested<A> withNewBackend(){
            return new BackendNestedImpl();
    }

    public HTTPIngressPathFluent.BackendNested<A> withNewBackendLike(IngressBackend item){
            return new BackendNestedImpl(item);
    }

    public HTTPIngressPathFluent.BackendNested<A> editBackend(){
            return withNewBackendLike(getBackend());
    }

    public HTTPIngressPathFluent.BackendNested<A> editOrNewBackend(){
            return withNewBackendLike(getBackend() != null ? getBackend(): new IngressBackendBuilder().build());
    }

    public HTTPIngressPathFluent.BackendNested<A> editOrNewBackendLike(IngressBackend item){
            return withNewBackendLike(getBackend() != null ? getBackend(): item);
    }

    public String getPath(){
            return this.path;
    }

    public A withPath(String path){
            this.path=path; return (A) this;
    }

    public Boolean hasPath(){
            return this.path != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            HTTPIngressPathFluentImpl that = (HTTPIngressPathFluentImpl) o;
            if (backend != null ? !backend.equals(that.backend) :that.backend != null) return false;
            if (path != null ? !path.equals(that.path) :that.path != null) return false;
            return true;
    }


    public class BackendNestedImpl<N> extends IngressBackendFluentImpl<HTTPIngressPathFluent.BackendNested<N>> implements HTTPIngressPathFluent.BackendNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IngressBackendBuilder builder;
    
            BackendNestedImpl(IngressBackend item){
                    this.builder = new IngressBackendBuilder(this, item);
            }
            BackendNestedImpl(){
                    this.builder = new IngressBackendBuilder(this);
            }
    
    public N and(){
            return (N) HTTPIngressPathFluentImpl.this.withBackend(builder.build());
    }
    public N endBackend(){
            return and();
    }

}


}
