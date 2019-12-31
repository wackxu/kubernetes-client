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

public class BuildFluentImpl<A extends BuildFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements BuildFluent<A>{

    private String apiVersion;
    private String kind;
    private ObjectMetaBuilder metadata;
    private BuildSpecBuilder spec;
    private BuildStatusBuilder status;

    public BuildFluentImpl(){
    }
    public BuildFluentImpl(Build instance){
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

    public BuildFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public BuildFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public BuildFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public BuildFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public BuildFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public BuildSpec getSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public BuildSpec buildSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public A withSpec(BuildSpec spec){
            _visitables.remove(this.spec);
            if (spec!=null){ this.spec= new BuildSpecBuilder(spec); _visitables.add(this.spec);} return (A) this;
    }

    public Boolean hasSpec(){
            return this.spec != null;
    }

    public BuildFluent.SpecNested<A> withNewSpec(){
            return new SpecNestedImpl();
    }

    public BuildFluent.SpecNested<A> withNewSpecLike(BuildSpec item){
            return new SpecNestedImpl(item);
    }

    public BuildFluent.SpecNested<A> editSpec(){
            return withNewSpecLike(getSpec());
    }

    public BuildFluent.SpecNested<A> editOrNewSpec(){
            return withNewSpecLike(getSpec() != null ? getSpec(): new BuildSpecBuilder().build());
    }

    public BuildFluent.SpecNested<A> editOrNewSpecLike(BuildSpec item){
            return withNewSpecLike(getSpec() != null ? getSpec(): item);
    }

    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public BuildStatus getStatus(){
            return this.status!=null?this.status.build():null;
    }

    public BuildStatus buildStatus(){
            return this.status!=null?this.status.build():null;
    }

    public A withStatus(BuildStatus status){
            _visitables.remove(this.status);
            if (status!=null){ this.status= new BuildStatusBuilder(status); _visitables.add(this.status);} return (A) this;
    }

    public Boolean hasStatus(){
            return this.status != null;
    }

    public BuildFluent.StatusNested<A> withNewStatus(){
            return new StatusNestedImpl();
    }

    public BuildFluent.StatusNested<A> withNewStatusLike(BuildStatus item){
            return new StatusNestedImpl(item);
    }

    public BuildFluent.StatusNested<A> editStatus(){
            return withNewStatusLike(getStatus());
    }

    public BuildFluent.StatusNested<A> editOrNewStatus(){
            return withNewStatusLike(getStatus() != null ? getStatus(): new BuildStatusBuilder().build());
    }

    public BuildFluent.StatusNested<A> editOrNewStatusLike(BuildStatus item){
            return withNewStatusLike(getStatus() != null ? getStatus(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            BuildFluentImpl that = (BuildFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (spec != null ? !spec.equals(that.spec) :that.spec != null) return false;
            if (status != null ? !status.equals(that.status) :that.status != null) return false;
            return true;
    }


    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<BuildFluent.MetadataNested<N>> implements BuildFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) BuildFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}
    public class SpecNestedImpl<N> extends BuildSpecFluentImpl<BuildFluent.SpecNested<N>> implements BuildFluent.SpecNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildSpecBuilder builder;
    
            SpecNestedImpl(BuildSpec item){
                    this.builder = new BuildSpecBuilder(this, item);
            }
            SpecNestedImpl(){
                    this.builder = new BuildSpecBuilder(this);
            }
    
    public N and(){
            return (N) BuildFluentImpl.this.withSpec(builder.build());
    }
    public N endSpec(){
            return and();
    }

}
    public class StatusNestedImpl<N> extends BuildStatusFluentImpl<BuildFluent.StatusNested<N>> implements BuildFluent.StatusNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildStatusBuilder builder;
    
            StatusNestedImpl(BuildStatus item){
                    this.builder = new BuildStatusBuilder(this, item);
            }
            StatusNestedImpl(){
                    this.builder = new BuildStatusBuilder(this);
            }
    
    public N and(){
            return (N) BuildFluentImpl.this.withStatus(builder.build());
    }
    public N endStatus(){
            return and();
    }

}


}
