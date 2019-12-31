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

public class ResourceQuotaFluentImpl<A extends ResourceQuotaFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ResourceQuotaFluent<A>{

    private String apiVersion;
    private String kind;
    private ObjectMetaBuilder metadata;
    private ResourceQuotaSpecBuilder spec;
    private ResourceQuotaStatusBuilder status;

    public ResourceQuotaFluentImpl(){
    }
    public ResourceQuotaFluentImpl(ResourceQuota instance){
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

    public ResourceQuotaFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public ResourceQuotaFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public ResourceQuotaFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public ResourceQuotaFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public ResourceQuotaFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public ResourceQuotaSpec getSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public ResourceQuotaSpec buildSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public A withSpec(ResourceQuotaSpec spec){
            _visitables.remove(this.spec);
            if (spec!=null){ this.spec= new ResourceQuotaSpecBuilder(spec); _visitables.add(this.spec);} return (A) this;
    }

    public Boolean hasSpec(){
            return this.spec != null;
    }

    public ResourceQuotaFluent.SpecNested<A> withNewSpec(){
            return new SpecNestedImpl();
    }

    public ResourceQuotaFluent.SpecNested<A> withNewSpecLike(ResourceQuotaSpec item){
            return new SpecNestedImpl(item);
    }

    public ResourceQuotaFluent.SpecNested<A> editSpec(){
            return withNewSpecLike(getSpec());
    }

    public ResourceQuotaFluent.SpecNested<A> editOrNewSpec(){
            return withNewSpecLike(getSpec() != null ? getSpec(): new ResourceQuotaSpecBuilder().build());
    }

    public ResourceQuotaFluent.SpecNested<A> editOrNewSpecLike(ResourceQuotaSpec item){
            return withNewSpecLike(getSpec() != null ? getSpec(): item);
    }

    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public ResourceQuotaStatus getStatus(){
            return this.status!=null?this.status.build():null;
    }

    public ResourceQuotaStatus buildStatus(){
            return this.status!=null?this.status.build():null;
    }

    public A withStatus(ResourceQuotaStatus status){
            _visitables.remove(this.status);
            if (status!=null){ this.status= new ResourceQuotaStatusBuilder(status); _visitables.add(this.status);} return (A) this;
    }

    public Boolean hasStatus(){
            return this.status != null;
    }

    public ResourceQuotaFluent.StatusNested<A> withNewStatus(){
            return new StatusNestedImpl();
    }

    public ResourceQuotaFluent.StatusNested<A> withNewStatusLike(ResourceQuotaStatus item){
            return new StatusNestedImpl(item);
    }

    public ResourceQuotaFluent.StatusNested<A> editStatus(){
            return withNewStatusLike(getStatus());
    }

    public ResourceQuotaFluent.StatusNested<A> editOrNewStatus(){
            return withNewStatusLike(getStatus() != null ? getStatus(): new ResourceQuotaStatusBuilder().build());
    }

    public ResourceQuotaFluent.StatusNested<A> editOrNewStatusLike(ResourceQuotaStatus item){
            return withNewStatusLike(getStatus() != null ? getStatus(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ResourceQuotaFluentImpl that = (ResourceQuotaFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (spec != null ? !spec.equals(that.spec) :that.spec != null) return false;
            if (status != null ? !status.equals(that.status) :that.status != null) return false;
            return true;
    }


    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<ResourceQuotaFluent.MetadataNested<N>> implements ResourceQuotaFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) ResourceQuotaFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}
    public class SpecNestedImpl<N> extends ResourceQuotaSpecFluentImpl<ResourceQuotaFluent.SpecNested<N>> implements ResourceQuotaFluent.SpecNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ResourceQuotaSpecBuilder builder;
    
            SpecNestedImpl(ResourceQuotaSpec item){
                    this.builder = new ResourceQuotaSpecBuilder(this, item);
            }
            SpecNestedImpl(){
                    this.builder = new ResourceQuotaSpecBuilder(this);
            }
    
    public N and(){
            return (N) ResourceQuotaFluentImpl.this.withSpec(builder.build());
    }
    public N endSpec(){
            return and();
    }

}
    public class StatusNestedImpl<N> extends ResourceQuotaStatusFluentImpl<ResourceQuotaFluent.StatusNested<N>> implements ResourceQuotaFluent.StatusNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ResourceQuotaStatusBuilder builder;
    
            StatusNestedImpl(ResourceQuotaStatus item){
                    this.builder = new ResourceQuotaStatusBuilder(this, item);
            }
            StatusNestedImpl(){
                    this.builder = new ResourceQuotaStatusBuilder(this);
            }
    
    public N and(){
            return (N) ResourceQuotaFluentImpl.this.withStatus(builder.build());
    }
    public N endStatus(){
            return and();
    }

}


}
