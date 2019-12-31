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
import java.lang.Long;
import java.lang.Object;

public class BuildConfigFluentImpl<A extends BuildConfigFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements BuildConfigFluent<A>{

    private String apiVersion;
    private String kind;
    private ObjectMetaBuilder metadata;
    private BuildConfigSpecBuilder spec;
    private BuildConfigStatusBuilder status;

    public BuildConfigFluentImpl(){
    }
    public BuildConfigFluentImpl(BuildConfig instance){
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

    public BuildConfigFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public BuildConfigFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public BuildConfigFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public BuildConfigFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public BuildConfigFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public BuildConfigSpec getSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public BuildConfigSpec buildSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public A withSpec(BuildConfigSpec spec){
            _visitables.remove(this.spec);
            if (spec!=null){ this.spec= new BuildConfigSpecBuilder(spec); _visitables.add(this.spec);} return (A) this;
    }

    public Boolean hasSpec(){
            return this.spec != null;
    }

    public BuildConfigFluent.SpecNested<A> withNewSpec(){
            return new SpecNestedImpl();
    }

    public BuildConfigFluent.SpecNested<A> withNewSpecLike(BuildConfigSpec item){
            return new SpecNestedImpl(item);
    }

    public BuildConfigFluent.SpecNested<A> editSpec(){
            return withNewSpecLike(getSpec());
    }

    public BuildConfigFluent.SpecNested<A> editOrNewSpec(){
            return withNewSpecLike(getSpec() != null ? getSpec(): new BuildConfigSpecBuilder().build());
    }

    public BuildConfigFluent.SpecNested<A> editOrNewSpecLike(BuildConfigSpec item){
            return withNewSpecLike(getSpec() != null ? getSpec(): item);
    }

    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public BuildConfigStatus getStatus(){
            return this.status!=null?this.status.build():null;
    }

    public BuildConfigStatus buildStatus(){
            return this.status!=null?this.status.build():null;
    }

    public A withStatus(BuildConfigStatus status){
            _visitables.remove(this.status);
            if (status!=null){ this.status= new BuildConfigStatusBuilder(status); _visitables.add(this.status);} return (A) this;
    }

    public Boolean hasStatus(){
            return this.status != null;
    }

    public A withNewStatus(Long lastVersion){
            return (A)withStatus(new BuildConfigStatus(lastVersion));
    }

    public BuildConfigFluent.StatusNested<A> withNewStatus(){
            return new StatusNestedImpl();
    }

    public BuildConfigFluent.StatusNested<A> withNewStatusLike(BuildConfigStatus item){
            return new StatusNestedImpl(item);
    }

    public BuildConfigFluent.StatusNested<A> editStatus(){
            return withNewStatusLike(getStatus());
    }

    public BuildConfigFluent.StatusNested<A> editOrNewStatus(){
            return withNewStatusLike(getStatus() != null ? getStatus(): new BuildConfigStatusBuilder().build());
    }

    public BuildConfigFluent.StatusNested<A> editOrNewStatusLike(BuildConfigStatus item){
            return withNewStatusLike(getStatus() != null ? getStatus(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            BuildConfigFluentImpl that = (BuildConfigFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (spec != null ? !spec.equals(that.spec) :that.spec != null) return false;
            if (status != null ? !status.equals(that.status) :that.status != null) return false;
            return true;
    }


    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<BuildConfigFluent.MetadataNested<N>> implements BuildConfigFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) BuildConfigFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}
    public class SpecNestedImpl<N> extends BuildConfigSpecFluentImpl<BuildConfigFluent.SpecNested<N>> implements BuildConfigFluent.SpecNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildConfigSpecBuilder builder;
    
            SpecNestedImpl(BuildConfigSpec item){
                    this.builder = new BuildConfigSpecBuilder(this, item);
            }
            SpecNestedImpl(){
                    this.builder = new BuildConfigSpecBuilder(this);
            }
    
    public N and(){
            return (N) BuildConfigFluentImpl.this.withSpec(builder.build());
    }
    public N endSpec(){
            return and();
    }

}
    public class StatusNestedImpl<N> extends BuildConfigStatusFluentImpl<BuildConfigFluent.StatusNested<N>> implements BuildConfigFluent.StatusNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildConfigStatusBuilder builder;
    
            StatusNestedImpl(BuildConfigStatus item){
                    this.builder = new BuildConfigStatusBuilder(this, item);
            }
            StatusNestedImpl(){
                    this.builder = new BuildConfigStatusBuilder(this);
            }
    
    public N and(){
            return (N) BuildConfigFluentImpl.this.withStatus(builder.build());
    }
    public N endStatus(){
            return and();
    }

}


}
