package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.Integer;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class NodeDaemonEndpointsFluentImpl<A extends NodeDaemonEndpointsFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements NodeDaemonEndpointsFluent<A>{

    private DaemonEndpointBuilder kubeletEndpoint;

    public NodeDaemonEndpointsFluentImpl(){
    }
    public NodeDaemonEndpointsFluentImpl(NodeDaemonEndpoints instance){
            this.withKubeletEndpoint(instance.getKubeletEndpoint()); 
    }

    
/**
 * This method has been deprecated, please use method buildKubeletEndpoint instead.
 * @return The buildable object.
 */
@Deprecated public DaemonEndpoint getKubeletEndpoint(){
            return this.kubeletEndpoint!=null?this.kubeletEndpoint.build():null;
    }

    public DaemonEndpoint buildKubeletEndpoint(){
            return this.kubeletEndpoint!=null?this.kubeletEndpoint.build():null;
    }

    public A withKubeletEndpoint(DaemonEndpoint kubeletEndpoint){
            _visitables.remove(this.kubeletEndpoint);
            if (kubeletEndpoint!=null){ this.kubeletEndpoint= new DaemonEndpointBuilder(kubeletEndpoint); _visitables.add(this.kubeletEndpoint);} return (A) this;
    }

    public Boolean hasKubeletEndpoint(){
            return this.kubeletEndpoint != null;
    }

    public A withNewKubeletEndpoint(Integer port){
            return (A)withKubeletEndpoint(new DaemonEndpoint(port));
    }

    public NodeDaemonEndpointsFluent.KubeletEndpointNested<A> withNewKubeletEndpoint(){
            return new KubeletEndpointNestedImpl();
    }

    public NodeDaemonEndpointsFluent.KubeletEndpointNested<A> withNewKubeletEndpointLike(DaemonEndpoint item){
            return new KubeletEndpointNestedImpl(item);
    }

    public NodeDaemonEndpointsFluent.KubeletEndpointNested<A> editKubeletEndpoint(){
            return withNewKubeletEndpointLike(getKubeletEndpoint());
    }

    public NodeDaemonEndpointsFluent.KubeletEndpointNested<A> editOrNewKubeletEndpoint(){
            return withNewKubeletEndpointLike(getKubeletEndpoint() != null ? getKubeletEndpoint(): new DaemonEndpointBuilder().build());
    }

    public NodeDaemonEndpointsFluent.KubeletEndpointNested<A> editOrNewKubeletEndpointLike(DaemonEndpoint item){
            return withNewKubeletEndpointLike(getKubeletEndpoint() != null ? getKubeletEndpoint(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NodeDaemonEndpointsFluentImpl that = (NodeDaemonEndpointsFluentImpl) o;
            if (kubeletEndpoint != null ? !kubeletEndpoint.equals(that.kubeletEndpoint) :that.kubeletEndpoint != null) return false;
            return true;
    }


    public class KubeletEndpointNestedImpl<N> extends DaemonEndpointFluentImpl<NodeDaemonEndpointsFluent.KubeletEndpointNested<N>> implements NodeDaemonEndpointsFluent.KubeletEndpointNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DaemonEndpointBuilder builder;
    
            KubeletEndpointNestedImpl(DaemonEndpoint item){
                    this.builder = new DaemonEndpointBuilder(this, item);
            }
            KubeletEndpointNestedImpl(){
                    this.builder = new DaemonEndpointBuilder(this);
            }
    
    public N and(){
            return (N) NodeDaemonEndpointsFluentImpl.this.withKubeletEndpoint(builder.build());
    }
    public N endKubeletEndpoint(){
            return and();
    }

}


}
