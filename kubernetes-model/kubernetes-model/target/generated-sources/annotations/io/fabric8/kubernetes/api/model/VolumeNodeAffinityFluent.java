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

public interface VolumeNodeAffinityFluent<A extends VolumeNodeAffinityFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildRequired instead.
 * @return The buildable object.
 */
@Deprecated public NodeSelector getRequired();
    public NodeSelector buildRequired();
    public A withRequired(NodeSelector required);
    public Boolean hasRequired();
    public VolumeNodeAffinityFluent.RequiredNested<A> withNewRequired();
    public VolumeNodeAffinityFluent.RequiredNested<A> withNewRequiredLike(NodeSelector item);
    public VolumeNodeAffinityFluent.RequiredNested<A> editRequired();
    public VolumeNodeAffinityFluent.RequiredNested<A> editOrNewRequired();
    public VolumeNodeAffinityFluent.RequiredNested<A> editOrNewRequiredLike(NodeSelector item);

    public interface RequiredNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeSelectorFluent<VolumeNodeAffinityFluent.RequiredNested<N>>{

        
    public N and();    public N endRequired();
}


}
