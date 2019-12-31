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

public interface AffinityFluent<A extends AffinityFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildNodeAffinity instead.
 * @return The buildable object.
 */
@Deprecated public NodeAffinity getNodeAffinity();
    public NodeAffinity buildNodeAffinity();
    public A withNodeAffinity(NodeAffinity nodeAffinity);
    public Boolean hasNodeAffinity();
    public AffinityFluent.NodeAffinityNested<A> withNewNodeAffinity();
    public AffinityFluent.NodeAffinityNested<A> withNewNodeAffinityLike(NodeAffinity item);
    public AffinityFluent.NodeAffinityNested<A> editNodeAffinity();
    public AffinityFluent.NodeAffinityNested<A> editOrNewNodeAffinity();
    public AffinityFluent.NodeAffinityNested<A> editOrNewNodeAffinityLike(NodeAffinity item);
    
/**
 * This method has been deprecated, please use method buildPodAffinity instead.
 * @return The buildable object.
 */
@Deprecated public PodAffinity getPodAffinity();
    public PodAffinity buildPodAffinity();
    public A withPodAffinity(PodAffinity podAffinity);
    public Boolean hasPodAffinity();
    public AffinityFluent.PodAffinityNested<A> withNewPodAffinity();
    public AffinityFluent.PodAffinityNested<A> withNewPodAffinityLike(PodAffinity item);
    public AffinityFluent.PodAffinityNested<A> editPodAffinity();
    public AffinityFluent.PodAffinityNested<A> editOrNewPodAffinity();
    public AffinityFluent.PodAffinityNested<A> editOrNewPodAffinityLike(PodAffinity item);
    
/**
 * This method has been deprecated, please use method buildPodAntiAffinity instead.
 * @return The buildable object.
 */
@Deprecated public PodAntiAffinity getPodAntiAffinity();
    public PodAntiAffinity buildPodAntiAffinity();
    public A withPodAntiAffinity(PodAntiAffinity podAntiAffinity);
    public Boolean hasPodAntiAffinity();
    public AffinityFluent.PodAntiAffinityNested<A> withNewPodAntiAffinity();
    public AffinityFluent.PodAntiAffinityNested<A> withNewPodAntiAffinityLike(PodAntiAffinity item);
    public AffinityFluent.PodAntiAffinityNested<A> editPodAntiAffinity();
    public AffinityFluent.PodAntiAffinityNested<A> editOrNewPodAntiAffinity();
    public AffinityFluent.PodAntiAffinityNested<A> editOrNewPodAntiAffinityLike(PodAntiAffinity item);

    public interface NodeAffinityNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeAffinityFluent<AffinityFluent.NodeAffinityNested<N>>{

        
    public N and();    public N endNodeAffinity();
}
    public interface PodAffinityNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodAffinityFluent<AffinityFluent.PodAffinityNested<N>>{

        
    public N and();    public N endPodAffinity();
}
    public interface PodAntiAffinityNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodAntiAffinityFluent<AffinityFluent.PodAntiAffinityNested<N>>{

        
    public N and();    public N endPodAntiAffinity();
}


}
