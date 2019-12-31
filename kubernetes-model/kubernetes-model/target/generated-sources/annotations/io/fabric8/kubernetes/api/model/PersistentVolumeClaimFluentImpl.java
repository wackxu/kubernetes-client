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

public class PersistentVolumeClaimFluentImpl<A extends PersistentVolumeClaimFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements PersistentVolumeClaimFluent<A>{

    private String apiVersion;
    private String kind;
    private ObjectMetaBuilder metadata;
    private PersistentVolumeClaimSpecBuilder spec;
    private PersistentVolumeClaimStatusBuilder status;

    public PersistentVolumeClaimFluentImpl(){
    }
    public PersistentVolumeClaimFluentImpl(PersistentVolumeClaim instance){
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

    public PersistentVolumeClaimFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public PersistentVolumeClaimFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public PersistentVolumeClaimFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public PersistentVolumeClaimFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public PersistentVolumeClaimFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public PersistentVolumeClaimSpec getSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public PersistentVolumeClaimSpec buildSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public A withSpec(PersistentVolumeClaimSpec spec){
            _visitables.remove(this.spec);
            if (spec!=null){ this.spec= new PersistentVolumeClaimSpecBuilder(spec); _visitables.add(this.spec);} return (A) this;
    }

    public Boolean hasSpec(){
            return this.spec != null;
    }

    public PersistentVolumeClaimFluent.SpecNested<A> withNewSpec(){
            return new SpecNestedImpl();
    }

    public PersistentVolumeClaimFluent.SpecNested<A> withNewSpecLike(PersistentVolumeClaimSpec item){
            return new SpecNestedImpl(item);
    }

    public PersistentVolumeClaimFluent.SpecNested<A> editSpec(){
            return withNewSpecLike(getSpec());
    }

    public PersistentVolumeClaimFluent.SpecNested<A> editOrNewSpec(){
            return withNewSpecLike(getSpec() != null ? getSpec(): new PersistentVolumeClaimSpecBuilder().build());
    }

    public PersistentVolumeClaimFluent.SpecNested<A> editOrNewSpecLike(PersistentVolumeClaimSpec item){
            return withNewSpecLike(getSpec() != null ? getSpec(): item);
    }

    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public PersistentVolumeClaimStatus getStatus(){
            return this.status!=null?this.status.build():null;
    }

    public PersistentVolumeClaimStatus buildStatus(){
            return this.status!=null?this.status.build():null;
    }

    public A withStatus(PersistentVolumeClaimStatus status){
            _visitables.remove(this.status);
            if (status!=null){ this.status= new PersistentVolumeClaimStatusBuilder(status); _visitables.add(this.status);} return (A) this;
    }

    public Boolean hasStatus(){
            return this.status != null;
    }

    public PersistentVolumeClaimFluent.StatusNested<A> withNewStatus(){
            return new StatusNestedImpl();
    }

    public PersistentVolumeClaimFluent.StatusNested<A> withNewStatusLike(PersistentVolumeClaimStatus item){
            return new StatusNestedImpl(item);
    }

    public PersistentVolumeClaimFluent.StatusNested<A> editStatus(){
            return withNewStatusLike(getStatus());
    }

    public PersistentVolumeClaimFluent.StatusNested<A> editOrNewStatus(){
            return withNewStatusLike(getStatus() != null ? getStatus(): new PersistentVolumeClaimStatusBuilder().build());
    }

    public PersistentVolumeClaimFluent.StatusNested<A> editOrNewStatusLike(PersistentVolumeClaimStatus item){
            return withNewStatusLike(getStatus() != null ? getStatus(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PersistentVolumeClaimFluentImpl that = (PersistentVolumeClaimFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (spec != null ? !spec.equals(that.spec) :that.spec != null) return false;
            if (status != null ? !status.equals(that.status) :that.status != null) return false;
            return true;
    }


    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<PersistentVolumeClaimFluent.MetadataNested<N>> implements PersistentVolumeClaimFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) PersistentVolumeClaimFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}
    public class SpecNestedImpl<N> extends PersistentVolumeClaimSpecFluentImpl<PersistentVolumeClaimFluent.SpecNested<N>> implements PersistentVolumeClaimFluent.SpecNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PersistentVolumeClaimSpecBuilder builder;
    
            SpecNestedImpl(PersistentVolumeClaimSpec item){
                    this.builder = new PersistentVolumeClaimSpecBuilder(this, item);
            }
            SpecNestedImpl(){
                    this.builder = new PersistentVolumeClaimSpecBuilder(this);
            }
    
    public N and(){
            return (N) PersistentVolumeClaimFluentImpl.this.withSpec(builder.build());
    }
    public N endSpec(){
            return and();
    }

}
    public class StatusNestedImpl<N> extends PersistentVolumeClaimStatusFluentImpl<PersistentVolumeClaimFluent.StatusNested<N>> implements PersistentVolumeClaimFluent.StatusNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PersistentVolumeClaimStatusBuilder builder;
    
            StatusNestedImpl(PersistentVolumeClaimStatus item){
                    this.builder = new PersistentVolumeClaimStatusBuilder(this, item);
            }
            StatusNestedImpl(){
                    this.builder = new PersistentVolumeClaimStatusBuilder(this);
            }
    
    public N and(){
            return (N) PersistentVolumeClaimFluentImpl.this.withStatus(builder.build());
    }
    public N endStatus(){
            return and();
    }

}


}
