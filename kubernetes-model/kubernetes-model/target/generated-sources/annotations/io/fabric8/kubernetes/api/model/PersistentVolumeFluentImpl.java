package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Boolean;
import javax.validation.Valid;
import java.lang.Object;

public class PersistentVolumeFluentImpl<A extends PersistentVolumeFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements PersistentVolumeFluent<A>{

    private String apiVersion;
    private String kind;
    private ObjectMetaBuilder metadata;
    private PersistentVolumeSpecBuilder spec;
    private PersistentVolumeStatusBuilder status;

    public PersistentVolumeFluentImpl(){
    }
    public PersistentVolumeFluentImpl(PersistentVolume instance){
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.withStatus(instance.getStatus()); 
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

    public PersistentVolumeFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public PersistentVolumeFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public PersistentVolumeFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public PersistentVolumeFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public PersistentVolumeFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public PersistentVolumeSpec getSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public PersistentVolumeSpec buildSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public A withSpec(PersistentVolumeSpec spec){
            _visitables.remove(this.spec);
            if (spec!=null){ this.spec= new PersistentVolumeSpecBuilder(spec); _visitables.add(this.spec);} return (A) this;
    }

    public Boolean hasSpec(){
            return this.spec != null;
    }

    public PersistentVolumeFluent.SpecNested<A> withNewSpec(){
            return new SpecNestedImpl();
    }

    public PersistentVolumeFluent.SpecNested<A> withNewSpecLike(PersistentVolumeSpec item){
            return new SpecNestedImpl(item);
    }

    public PersistentVolumeFluent.SpecNested<A> editSpec(){
            return withNewSpecLike(getSpec());
    }

    public PersistentVolumeFluent.SpecNested<A> editOrNewSpec(){
            return withNewSpecLike(getSpec() != null ? getSpec(): new PersistentVolumeSpecBuilder().build());
    }

    public PersistentVolumeFluent.SpecNested<A> editOrNewSpecLike(PersistentVolumeSpec item){
            return withNewSpecLike(getSpec() != null ? getSpec(): item);
    }

    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public PersistentVolumeStatus getStatus(){
            return this.status!=null?this.status.build():null;
    }

    public PersistentVolumeStatus buildStatus(){
            return this.status!=null?this.status.build():null;
    }

    public A withStatus(PersistentVolumeStatus status){
            _visitables.remove(this.status);
            if (status!=null){ this.status= new PersistentVolumeStatusBuilder(status); _visitables.add(this.status);} return (A) this;
    }

    public Boolean hasStatus(){
            return this.status != null;
    }

    public A withNewStatus(String message,String phase,String reason){
            return (A)withStatus(new PersistentVolumeStatus(message, phase, reason));
    }

    public PersistentVolumeFluent.StatusNested<A> withNewStatus(){
            return new StatusNestedImpl();
    }

    public PersistentVolumeFluent.StatusNested<A> withNewStatusLike(PersistentVolumeStatus item){
            return new StatusNestedImpl(item);
    }

    public PersistentVolumeFluent.StatusNested<A> editStatus(){
            return withNewStatusLike(getStatus());
    }

    public PersistentVolumeFluent.StatusNested<A> editOrNewStatus(){
            return withNewStatusLike(getStatus() != null ? getStatus(): new PersistentVolumeStatusBuilder().build());
    }

    public PersistentVolumeFluent.StatusNested<A> editOrNewStatusLike(PersistentVolumeStatus item){
            return withNewStatusLike(getStatus() != null ? getStatus(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PersistentVolumeFluentImpl that = (PersistentVolumeFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (spec != null ? !spec.equals(that.spec) :that.spec != null) return false;
            if (status != null ? !status.equals(that.status) :that.status != null) return false;
            return true;
    }


    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<PersistentVolumeFluent.MetadataNested<N>> implements PersistentVolumeFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) PersistentVolumeFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}
    public class SpecNestedImpl<N> extends PersistentVolumeSpecFluentImpl<PersistentVolumeFluent.SpecNested<N>> implements PersistentVolumeFluent.SpecNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PersistentVolumeSpecBuilder builder;
    
            SpecNestedImpl(PersistentVolumeSpec item){
                    this.builder = new PersistentVolumeSpecBuilder(this, item);
            }
            SpecNestedImpl(){
                    this.builder = new PersistentVolumeSpecBuilder(this);
            }
    
    public N and(){
            return (N) PersistentVolumeFluentImpl.this.withSpec(builder.build());
    }
    public N endSpec(){
            return and();
    }

}
    public class StatusNestedImpl<N> extends PersistentVolumeStatusFluentImpl<PersistentVolumeFluent.StatusNested<N>> implements PersistentVolumeFluent.StatusNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PersistentVolumeStatusBuilder builder;
    
            StatusNestedImpl(PersistentVolumeStatus item){
                    this.builder = new PersistentVolumeStatusBuilder(this, item);
            }
            StatusNestedImpl(){
                    this.builder = new PersistentVolumeStatusBuilder(this);
            }
    
    public N and(){
            return (N) PersistentVolumeFluentImpl.this.withStatus(builder.build());
    }
    public N endStatus(){
            return and();
    }

}


}
