package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class PodTemplateSpecFluentImpl<A extends PodTemplateSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements PodTemplateSpecFluent<A>{

    private ObjectMetaBuilder metadata;
    private PodSpecBuilder spec;

    public PodTemplateSpecFluentImpl(){
    }
    public PodTemplateSpecFluentImpl(PodTemplateSpec instance){
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
    }

    
/**
 * This method has been deprecated, please use method buildMetadata instead.
 * @return The buildable object.
 */
@Deprecated public ObjectMeta getMetadata(){
            return this.metadata!=null?this.metadata.build():null;
    }

    public ObjectMeta buildMetadata(){
            return this.metadata!=null?this.metadata.build():null;
    }

    public A withMetadata(ObjectMeta metadata){
            _visitables.remove(this.metadata);
            if (metadata!=null){ this.metadata= new ObjectMetaBuilder(metadata); _visitables.add(this.metadata);} return (A) this;
    }

    public Boolean hasMetadata(){
            return this.metadata != null;
    }

    public PodTemplateSpecFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public PodTemplateSpecFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public PodTemplateSpecFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public PodTemplateSpecFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public PodTemplateSpecFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public PodSpec getSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public PodSpec buildSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public A withSpec(PodSpec spec){
            _visitables.remove(this.spec);
            if (spec!=null){ this.spec= new PodSpecBuilder(spec); _visitables.add(this.spec);} return (A) this;
    }

    public Boolean hasSpec(){
            return this.spec != null;
    }

    public PodTemplateSpecFluent.SpecNested<A> withNewSpec(){
            return new SpecNestedImpl();
    }

    public PodTemplateSpecFluent.SpecNested<A> withNewSpecLike(PodSpec item){
            return new SpecNestedImpl(item);
    }

    public PodTemplateSpecFluent.SpecNested<A> editSpec(){
            return withNewSpecLike(getSpec());
    }

    public PodTemplateSpecFluent.SpecNested<A> editOrNewSpec(){
            return withNewSpecLike(getSpec() != null ? getSpec(): new PodSpecBuilder().build());
    }

    public PodTemplateSpecFluent.SpecNested<A> editOrNewSpecLike(PodSpec item){
            return withNewSpecLike(getSpec() != null ? getSpec(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PodTemplateSpecFluentImpl that = (PodTemplateSpecFluentImpl) o;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (spec != null ? !spec.equals(that.spec) :that.spec != null) return false;
            return true;
    }


    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<PodTemplateSpecFluent.MetadataNested<N>> implements PodTemplateSpecFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) PodTemplateSpecFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}
    public class SpecNestedImpl<N> extends PodSpecFluentImpl<PodTemplateSpecFluent.SpecNested<N>> implements PodTemplateSpecFluent.SpecNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodSpecBuilder builder;
    
            SpecNestedImpl(PodSpec item){
                    this.builder = new PodSpecBuilder(this, item);
            }
            SpecNestedImpl(){
                    this.builder = new PodSpecBuilder(this);
            }
    
    public N and(){
            return (N) PodTemplateSpecFluentImpl.this.withSpec(builder.build());
    }
    public N endSpec(){
            return and();
    }

}


}
