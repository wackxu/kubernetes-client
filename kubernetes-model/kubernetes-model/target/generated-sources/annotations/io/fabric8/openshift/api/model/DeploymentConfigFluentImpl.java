package io.fabric8.openshift.api.model;

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

public class DeploymentConfigFluentImpl<A extends DeploymentConfigFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements DeploymentConfigFluent<A>{

    private String apiVersion;
    private String kind;
    private ObjectMetaBuilder metadata;
    private DeploymentConfigSpecBuilder spec;
    private DeploymentConfigStatusBuilder status;

    public DeploymentConfigFluentImpl(){
    }
    public DeploymentConfigFluentImpl(DeploymentConfig instance){
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

    public DeploymentConfigFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public DeploymentConfigFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public DeploymentConfigFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public DeploymentConfigFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public DeploymentConfigFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public DeploymentConfigSpec getSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public DeploymentConfigSpec buildSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public A withSpec(DeploymentConfigSpec spec){
            _visitables.remove(this.spec);
            if (spec!=null){ this.spec= new DeploymentConfigSpecBuilder(spec); _visitables.add(this.spec);} return (A) this;
    }

    public Boolean hasSpec(){
            return this.spec != null;
    }

    public DeploymentConfigFluent.SpecNested<A> withNewSpec(){
            return new SpecNestedImpl();
    }

    public DeploymentConfigFluent.SpecNested<A> withNewSpecLike(DeploymentConfigSpec item){
            return new SpecNestedImpl(item);
    }

    public DeploymentConfigFluent.SpecNested<A> editSpec(){
            return withNewSpecLike(getSpec());
    }

    public DeploymentConfigFluent.SpecNested<A> editOrNewSpec(){
            return withNewSpecLike(getSpec() != null ? getSpec(): new DeploymentConfigSpecBuilder().build());
    }

    public DeploymentConfigFluent.SpecNested<A> editOrNewSpecLike(DeploymentConfigSpec item){
            return withNewSpecLike(getSpec() != null ? getSpec(): item);
    }

    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public DeploymentConfigStatus getStatus(){
            return this.status!=null?this.status.build():null;
    }

    public DeploymentConfigStatus buildStatus(){
            return this.status!=null?this.status.build():null;
    }

    public A withStatus(DeploymentConfigStatus status){
            _visitables.remove(this.status);
            if (status!=null){ this.status= new DeploymentConfigStatusBuilder(status); _visitables.add(this.status);} return (A) this;
    }

    public Boolean hasStatus(){
            return this.status != null;
    }

    public DeploymentConfigFluent.StatusNested<A> withNewStatus(){
            return new StatusNestedImpl();
    }

    public DeploymentConfigFluent.StatusNested<A> withNewStatusLike(DeploymentConfigStatus item){
            return new StatusNestedImpl(item);
    }

    public DeploymentConfigFluent.StatusNested<A> editStatus(){
            return withNewStatusLike(getStatus());
    }

    public DeploymentConfigFluent.StatusNested<A> editOrNewStatus(){
            return withNewStatusLike(getStatus() != null ? getStatus(): new DeploymentConfigStatusBuilder().build());
    }

    public DeploymentConfigFluent.StatusNested<A> editOrNewStatusLike(DeploymentConfigStatus item){
            return withNewStatusLike(getStatus() != null ? getStatus(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DeploymentConfigFluentImpl that = (DeploymentConfigFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (spec != null ? !spec.equals(that.spec) :that.spec != null) return false;
            if (status != null ? !status.equals(that.status) :that.status != null) return false;
            return true;
    }


    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<DeploymentConfigFluent.MetadataNested<N>> implements DeploymentConfigFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) DeploymentConfigFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}
    public class SpecNestedImpl<N> extends DeploymentConfigSpecFluentImpl<DeploymentConfigFluent.SpecNested<N>> implements DeploymentConfigFluent.SpecNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentConfigSpecBuilder builder;
    
            SpecNestedImpl(DeploymentConfigSpec item){
                    this.builder = new DeploymentConfigSpecBuilder(this, item);
            }
            SpecNestedImpl(){
                    this.builder = new DeploymentConfigSpecBuilder(this);
            }
    
    public N and(){
            return (N) DeploymentConfigFluentImpl.this.withSpec(builder.build());
    }
    public N endSpec(){
            return and();
    }

}
    public class StatusNestedImpl<N> extends DeploymentConfigStatusFluentImpl<DeploymentConfigFluent.StatusNested<N>> implements DeploymentConfigFluent.StatusNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentConfigStatusBuilder builder;
    
            StatusNestedImpl(DeploymentConfigStatus item){
                    this.builder = new DeploymentConfigStatusBuilder(this, item);
            }
            StatusNestedImpl(){
                    this.builder = new DeploymentConfigStatusBuilder(this);
            }
    
    public N and(){
            return (N) DeploymentConfigFluentImpl.this.withStatus(builder.build());
    }
    public N endStatus(){
            return and();
    }

}


}
