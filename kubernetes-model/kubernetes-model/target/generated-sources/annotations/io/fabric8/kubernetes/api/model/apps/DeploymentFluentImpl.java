package io.fabric8.kubernetes.api.model.apps;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectMetaFluentImpl;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import javax.validation.Valid;
import java.lang.Object;

public class DeploymentFluentImpl<A extends DeploymentFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements DeploymentFluent<A>{

    private String apiVersion;
    private String kind;
    private ObjectMetaBuilder metadata;
    private DeploymentSpecBuilder spec;
    private DeploymentStatusBuilder status;

    public DeploymentFluentImpl(){
    }
    public DeploymentFluentImpl(Deployment instance){
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

    public DeploymentFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public DeploymentFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public DeploymentFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public DeploymentFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public DeploymentFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public DeploymentSpec getSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public DeploymentSpec buildSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public A withSpec(DeploymentSpec spec){
            _visitables.remove(this.spec);
            if (spec!=null){ this.spec= new DeploymentSpecBuilder(spec); _visitables.add(this.spec);} return (A) this;
    }

    public Boolean hasSpec(){
            return this.spec != null;
    }

    public DeploymentFluent.SpecNested<A> withNewSpec(){
            return new SpecNestedImpl();
    }

    public DeploymentFluent.SpecNested<A> withNewSpecLike(DeploymentSpec item){
            return new SpecNestedImpl(item);
    }

    public DeploymentFluent.SpecNested<A> editSpec(){
            return withNewSpecLike(getSpec());
    }

    public DeploymentFluent.SpecNested<A> editOrNewSpec(){
            return withNewSpecLike(getSpec() != null ? getSpec(): new DeploymentSpecBuilder().build());
    }

    public DeploymentFluent.SpecNested<A> editOrNewSpecLike(DeploymentSpec item){
            return withNewSpecLike(getSpec() != null ? getSpec(): item);
    }

    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public DeploymentStatus getStatus(){
            return this.status!=null?this.status.build():null;
    }

    public DeploymentStatus buildStatus(){
            return this.status!=null?this.status.build():null;
    }

    public A withStatus(DeploymentStatus status){
            _visitables.remove(this.status);
            if (status!=null){ this.status= new DeploymentStatusBuilder(status); _visitables.add(this.status);} return (A) this;
    }

    public Boolean hasStatus(){
            return this.status != null;
    }

    public DeploymentFluent.StatusNested<A> withNewStatus(){
            return new StatusNestedImpl();
    }

    public DeploymentFluent.StatusNested<A> withNewStatusLike(DeploymentStatus item){
            return new StatusNestedImpl(item);
    }

    public DeploymentFluent.StatusNested<A> editStatus(){
            return withNewStatusLike(getStatus());
    }

    public DeploymentFluent.StatusNested<A> editOrNewStatus(){
            return withNewStatusLike(getStatus() != null ? getStatus(): new DeploymentStatusBuilder().build());
    }

    public DeploymentFluent.StatusNested<A> editOrNewStatusLike(DeploymentStatus item){
            return withNewStatusLike(getStatus() != null ? getStatus(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DeploymentFluentImpl that = (DeploymentFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (spec != null ? !spec.equals(that.spec) :that.spec != null) return false;
            if (status != null ? !status.equals(that.status) :that.status != null) return false;
            return true;
    }


    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<DeploymentFluent.MetadataNested<N>> implements DeploymentFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) DeploymentFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}
    public class SpecNestedImpl<N> extends DeploymentSpecFluentImpl<DeploymentFluent.SpecNested<N>> implements DeploymentFluent.SpecNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentSpecBuilder builder;
    
            SpecNestedImpl(DeploymentSpec item){
                    this.builder = new DeploymentSpecBuilder(this, item);
            }
            SpecNestedImpl(){
                    this.builder = new DeploymentSpecBuilder(this);
            }
    
    public N and(){
            return (N) DeploymentFluentImpl.this.withSpec(builder.build());
    }
    public N endSpec(){
            return and();
    }

}
    public class StatusNestedImpl<N> extends DeploymentStatusFluentImpl<DeploymentFluent.StatusNested<N>> implements DeploymentFluent.StatusNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentStatusBuilder builder;
    
            StatusNestedImpl(DeploymentStatus item){
                    this.builder = new DeploymentStatusBuilder(this, item);
            }
            StatusNestedImpl(){
                    this.builder = new DeploymentStatusBuilder(this);
            }
    
    public N and(){
            return (N) DeploymentFluentImpl.this.withStatus(builder.build());
    }
    public N endStatus(){
            return and();
    }

}


}
