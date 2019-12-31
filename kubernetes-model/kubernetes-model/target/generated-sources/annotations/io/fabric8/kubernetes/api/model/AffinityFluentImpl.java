package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Boolean;
import javax.validation.Valid;
import java.lang.Object;

public class AffinityFluentImpl<A extends AffinityFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements AffinityFluent<A>{

    private NodeAffinityBuilder nodeAffinity;
    private PodAffinityBuilder podAffinity;
    private PodAntiAffinityBuilder podAntiAffinity;

    public AffinityFluentImpl(){
    }
    public AffinityFluentImpl(Affinity instance){
            this.withNodeAffinity(instance.getNodeAffinity()); 
            this.withPodAffinity(instance.getPodAffinity()); 
            this.withPodAntiAffinity(instance.getPodAntiAffinity()); 
    }

    
/**
 * This method has been deprecated, please use method buildNodeAffinity instead.
 * @return The buildable object.
 */
@Deprecated public NodeAffinity getNodeAffinity(){
            return this.nodeAffinity!=null?this.nodeAffinity.build():null;
    }

    public NodeAffinity buildNodeAffinity(){
            return this.nodeAffinity!=null?this.nodeAffinity.build():null;
    }

    public A withNodeAffinity(NodeAffinity nodeAffinity){
            _visitables.remove(this.nodeAffinity);
            if (nodeAffinity!=null){ this.nodeAffinity= new NodeAffinityBuilder(nodeAffinity); _visitables.add(this.nodeAffinity);} return (A) this;
    }

    public Boolean hasNodeAffinity(){
            return this.nodeAffinity != null;
    }

    public AffinityFluent.NodeAffinityNested<A> withNewNodeAffinity(){
            return new NodeAffinityNestedImpl();
    }

    public AffinityFluent.NodeAffinityNested<A> withNewNodeAffinityLike(NodeAffinity item){
            return new NodeAffinityNestedImpl(item);
    }

    public AffinityFluent.NodeAffinityNested<A> editNodeAffinity(){
            return withNewNodeAffinityLike(getNodeAffinity());
    }

    public AffinityFluent.NodeAffinityNested<A> editOrNewNodeAffinity(){
            return withNewNodeAffinityLike(getNodeAffinity() != null ? getNodeAffinity(): new NodeAffinityBuilder().build());
    }

    public AffinityFluent.NodeAffinityNested<A> editOrNewNodeAffinityLike(NodeAffinity item){
            return withNewNodeAffinityLike(getNodeAffinity() != null ? getNodeAffinity(): item);
    }

    
/**
 * This method has been deprecated, please use method buildPodAffinity instead.
 * @return The buildable object.
 */
@Deprecated public PodAffinity getPodAffinity(){
            return this.podAffinity!=null?this.podAffinity.build():null;
    }

    public PodAffinity buildPodAffinity(){
            return this.podAffinity!=null?this.podAffinity.build():null;
    }

    public A withPodAffinity(PodAffinity podAffinity){
            _visitables.remove(this.podAffinity);
            if (podAffinity!=null){ this.podAffinity= new PodAffinityBuilder(podAffinity); _visitables.add(this.podAffinity);} return (A) this;
    }

    public Boolean hasPodAffinity(){
            return this.podAffinity != null;
    }

    public AffinityFluent.PodAffinityNested<A> withNewPodAffinity(){
            return new PodAffinityNestedImpl();
    }

    public AffinityFluent.PodAffinityNested<A> withNewPodAffinityLike(PodAffinity item){
            return new PodAffinityNestedImpl(item);
    }

    public AffinityFluent.PodAffinityNested<A> editPodAffinity(){
            return withNewPodAffinityLike(getPodAffinity());
    }

    public AffinityFluent.PodAffinityNested<A> editOrNewPodAffinity(){
            return withNewPodAffinityLike(getPodAffinity() != null ? getPodAffinity(): new PodAffinityBuilder().build());
    }

    public AffinityFluent.PodAffinityNested<A> editOrNewPodAffinityLike(PodAffinity item){
            return withNewPodAffinityLike(getPodAffinity() != null ? getPodAffinity(): item);
    }

    
/**
 * This method has been deprecated, please use method buildPodAntiAffinity instead.
 * @return The buildable object.
 */
@Deprecated public PodAntiAffinity getPodAntiAffinity(){
            return this.podAntiAffinity!=null?this.podAntiAffinity.build():null;
    }

    public PodAntiAffinity buildPodAntiAffinity(){
            return this.podAntiAffinity!=null?this.podAntiAffinity.build():null;
    }

    public A withPodAntiAffinity(PodAntiAffinity podAntiAffinity){
            _visitables.remove(this.podAntiAffinity);
            if (podAntiAffinity!=null){ this.podAntiAffinity= new PodAntiAffinityBuilder(podAntiAffinity); _visitables.add(this.podAntiAffinity);} return (A) this;
    }

    public Boolean hasPodAntiAffinity(){
            return this.podAntiAffinity != null;
    }

    public AffinityFluent.PodAntiAffinityNested<A> withNewPodAntiAffinity(){
            return new PodAntiAffinityNestedImpl();
    }

    public AffinityFluent.PodAntiAffinityNested<A> withNewPodAntiAffinityLike(PodAntiAffinity item){
            return new PodAntiAffinityNestedImpl(item);
    }

    public AffinityFluent.PodAntiAffinityNested<A> editPodAntiAffinity(){
            return withNewPodAntiAffinityLike(getPodAntiAffinity());
    }

    public AffinityFluent.PodAntiAffinityNested<A> editOrNewPodAntiAffinity(){
            return withNewPodAntiAffinityLike(getPodAntiAffinity() != null ? getPodAntiAffinity(): new PodAntiAffinityBuilder().build());
    }

    public AffinityFluent.PodAntiAffinityNested<A> editOrNewPodAntiAffinityLike(PodAntiAffinity item){
            return withNewPodAntiAffinityLike(getPodAntiAffinity() != null ? getPodAntiAffinity(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            AffinityFluentImpl that = (AffinityFluentImpl) o;
            if (nodeAffinity != null ? !nodeAffinity.equals(that.nodeAffinity) :that.nodeAffinity != null) return false;
            if (podAffinity != null ? !podAffinity.equals(that.podAffinity) :that.podAffinity != null) return false;
            if (podAntiAffinity != null ? !podAntiAffinity.equals(that.podAntiAffinity) :that.podAntiAffinity != null) return false;
            return true;
    }


    public class NodeAffinityNestedImpl<N> extends NodeAffinityFluentImpl<AffinityFluent.NodeAffinityNested<N>> implements AffinityFluent.NodeAffinityNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NodeAffinityBuilder builder;
    
            NodeAffinityNestedImpl(NodeAffinity item){
                    this.builder = new NodeAffinityBuilder(this, item);
            }
            NodeAffinityNestedImpl(){
                    this.builder = new NodeAffinityBuilder(this);
            }
    
    public N and(){
            return (N) AffinityFluentImpl.this.withNodeAffinity(builder.build());
    }
    public N endNodeAffinity(){
            return and();
    }

}
    public class PodAffinityNestedImpl<N> extends PodAffinityFluentImpl<AffinityFluent.PodAffinityNested<N>> implements AffinityFluent.PodAffinityNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodAffinityBuilder builder;
    
            PodAffinityNestedImpl(PodAffinity item){
                    this.builder = new PodAffinityBuilder(this, item);
            }
            PodAffinityNestedImpl(){
                    this.builder = new PodAffinityBuilder(this);
            }
    
    public N and(){
            return (N) AffinityFluentImpl.this.withPodAffinity(builder.build());
    }
    public N endPodAffinity(){
            return and();
    }

}
    public class PodAntiAffinityNestedImpl<N> extends PodAntiAffinityFluentImpl<AffinityFluent.PodAntiAffinityNested<N>> implements AffinityFluent.PodAntiAffinityNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodAntiAffinityBuilder builder;
    
            PodAntiAffinityNestedImpl(PodAntiAffinity item){
                    this.builder = new PodAntiAffinityBuilder(this, item);
            }
            PodAntiAffinityNestedImpl(){
                    this.builder = new PodAntiAffinityBuilder(this);
            }
    
    public N and(){
            return (N) AffinityFluentImpl.this.withPodAntiAffinity(builder.build());
    }
    public N endPodAntiAffinity(){
            return and();
    }

}


}
