package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class BindingFluentImpl<A extends BindingFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements BindingFluent<A>{

    private String apiVersion;
    private String kind;
    private ObjectMetaBuilder metadata;
    private ObjectReferenceBuilder target;

    public BindingFluentImpl(){
    }
    public BindingFluentImpl(Binding instance){
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withTarget(instance.getTarget()); 
    }

    public String getApiVersion(){
            return this.apiVersion;
    }

    public A withApiVersion(String apiVersion){
            this.apiVersion=apiVersion; return (A) this;
    }

    public Boolean hasApiVersion(){
            return this.apiVersion != null;
    }

    public String getKind(){
            return this.kind;
    }

    public A withKind(String kind){
            this.kind=kind; return (A) this;
    }

    public Boolean hasKind(){
            return this.kind != null;
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

    public BindingFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public BindingFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public BindingFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public BindingFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public BindingFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    
/**
 * This method has been deprecated, please use method buildTarget instead.
 * @return The buildable object.
 */
@Deprecated public ObjectReference getTarget(){
            return this.target!=null?this.target.build():null;
    }

    public ObjectReference buildTarget(){
            return this.target!=null?this.target.build():null;
    }

    public A withTarget(ObjectReference target){
            _visitables.remove(this.target);
            if (target!=null){ this.target= new ObjectReferenceBuilder(target); _visitables.add(this.target);} return (A) this;
    }

    public Boolean hasTarget(){
            return this.target != null;
    }

    public BindingFluent.TargetNested<A> withNewTarget(){
            return new TargetNestedImpl();
    }

    public BindingFluent.TargetNested<A> withNewTargetLike(ObjectReference item){
            return new TargetNestedImpl(item);
    }

    public BindingFluent.TargetNested<A> editTarget(){
            return withNewTargetLike(getTarget());
    }

    public BindingFluent.TargetNested<A> editOrNewTarget(){
            return withNewTargetLike(getTarget() != null ? getTarget(): new ObjectReferenceBuilder().build());
    }

    public BindingFluent.TargetNested<A> editOrNewTargetLike(ObjectReference item){
            return withNewTargetLike(getTarget() != null ? getTarget(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            BindingFluentImpl that = (BindingFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (target != null ? !target.equals(that.target) :that.target != null) return false;
            return true;
    }


    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<BindingFluent.MetadataNested<N>> implements BindingFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) BindingFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}
    public class TargetNestedImpl<N> extends ObjectReferenceFluentImpl<BindingFluent.TargetNested<N>> implements BindingFluent.TargetNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectReferenceBuilder builder;
    
            TargetNestedImpl(ObjectReference item){
                    this.builder = new ObjectReferenceBuilder(this, item);
            }
            TargetNestedImpl(){
                    this.builder = new ObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) BindingFluentImpl.this.withTarget(builder.build());
    }
    public N endTarget(){
            return and();
    }

}


}
