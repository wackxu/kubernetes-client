package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class VolumeNodeAffinityFluentImpl<A extends VolumeNodeAffinityFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements VolumeNodeAffinityFluent<A>{

    private NodeSelectorBuilder required;

    public VolumeNodeAffinityFluentImpl(){
    }
    public VolumeNodeAffinityFluentImpl(VolumeNodeAffinity instance){
            this.withRequired(instance.getRequired()); 
    }

    
/**
 * This method has been deprecated, please use method buildRequired instead.
 * @return The buildable object.
 */
@Deprecated public NodeSelector getRequired(){
            return this.required!=null?this.required.build():null;
    }

    public NodeSelector buildRequired(){
            return this.required!=null?this.required.build():null;
    }

    public A withRequired(NodeSelector required){
            _visitables.remove(this.required);
            if (required!=null){ this.required= new NodeSelectorBuilder(required); _visitables.add(this.required);} return (A) this;
    }

    public Boolean hasRequired(){
            return this.required != null;
    }

    public VolumeNodeAffinityFluent.RequiredNested<A> withNewRequired(){
            return new RequiredNestedImpl();
    }

    public VolumeNodeAffinityFluent.RequiredNested<A> withNewRequiredLike(NodeSelector item){
            return new RequiredNestedImpl(item);
    }

    public VolumeNodeAffinityFluent.RequiredNested<A> editRequired(){
            return withNewRequiredLike(getRequired());
    }

    public VolumeNodeAffinityFluent.RequiredNested<A> editOrNewRequired(){
            return withNewRequiredLike(getRequired() != null ? getRequired(): new NodeSelectorBuilder().build());
    }

    public VolumeNodeAffinityFluent.RequiredNested<A> editOrNewRequiredLike(NodeSelector item){
            return withNewRequiredLike(getRequired() != null ? getRequired(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            VolumeNodeAffinityFluentImpl that = (VolumeNodeAffinityFluentImpl) o;
            if (required != null ? !required.equals(that.required) :that.required != null) return false;
            return true;
    }


    public class RequiredNestedImpl<N> extends NodeSelectorFluentImpl<VolumeNodeAffinityFluent.RequiredNested<N>> implements VolumeNodeAffinityFluent.RequiredNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NodeSelectorBuilder builder;
    
            RequiredNestedImpl(NodeSelector item){
                    this.builder = new NodeSelectorBuilder(this, item);
            }
            RequiredNestedImpl(){
                    this.builder = new NodeSelectorBuilder(this);
            }
    
    public N and(){
            return (N) VolumeNodeAffinityFluentImpl.this.withRequired(builder.build());
    }
    public N endRequired(){
            return and();
    }

}


}
