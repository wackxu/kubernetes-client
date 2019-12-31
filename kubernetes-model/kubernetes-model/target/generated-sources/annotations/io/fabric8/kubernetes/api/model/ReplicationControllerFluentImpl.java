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

public class ReplicationControllerFluentImpl<A extends ReplicationControllerFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ReplicationControllerFluent<A>{

    private String apiVersion;
    private String kind;
    private ObjectMetaBuilder metadata;
    private ReplicationControllerSpecBuilder spec;
    private ReplicationControllerStatusBuilder status;

    public ReplicationControllerFluentImpl(){
    }
    public ReplicationControllerFluentImpl(ReplicationController instance){
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

    public ReplicationControllerFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public ReplicationControllerFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public ReplicationControllerFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public ReplicationControllerFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public ReplicationControllerFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public ReplicationControllerSpec getSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public ReplicationControllerSpec buildSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public A withSpec(ReplicationControllerSpec spec){
            _visitables.remove(this.spec);
            if (spec!=null){ this.spec= new ReplicationControllerSpecBuilder(spec); _visitables.add(this.spec);} return (A) this;
    }

    public Boolean hasSpec(){
            return this.spec != null;
    }

    public ReplicationControllerFluent.SpecNested<A> withNewSpec(){
            return new SpecNestedImpl();
    }

    public ReplicationControllerFluent.SpecNested<A> withNewSpecLike(ReplicationControllerSpec item){
            return new SpecNestedImpl(item);
    }

    public ReplicationControllerFluent.SpecNested<A> editSpec(){
            return withNewSpecLike(getSpec());
    }

    public ReplicationControllerFluent.SpecNested<A> editOrNewSpec(){
            return withNewSpecLike(getSpec() != null ? getSpec(): new ReplicationControllerSpecBuilder().build());
    }

    public ReplicationControllerFluent.SpecNested<A> editOrNewSpecLike(ReplicationControllerSpec item){
            return withNewSpecLike(getSpec() != null ? getSpec(): item);
    }

    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public ReplicationControllerStatus getStatus(){
            return this.status!=null?this.status.build():null;
    }

    public ReplicationControllerStatus buildStatus(){
            return this.status!=null?this.status.build():null;
    }

    public A withStatus(ReplicationControllerStatus status){
            _visitables.remove(this.status);
            if (status!=null){ this.status= new ReplicationControllerStatusBuilder(status); _visitables.add(this.status);} return (A) this;
    }

    public Boolean hasStatus(){
            return this.status != null;
    }

    public ReplicationControllerFluent.StatusNested<A> withNewStatus(){
            return new StatusNestedImpl();
    }

    public ReplicationControllerFluent.StatusNested<A> withNewStatusLike(ReplicationControllerStatus item){
            return new StatusNestedImpl(item);
    }

    public ReplicationControllerFluent.StatusNested<A> editStatus(){
            return withNewStatusLike(getStatus());
    }

    public ReplicationControllerFluent.StatusNested<A> editOrNewStatus(){
            return withNewStatusLike(getStatus() != null ? getStatus(): new ReplicationControllerStatusBuilder().build());
    }

    public ReplicationControllerFluent.StatusNested<A> editOrNewStatusLike(ReplicationControllerStatus item){
            return withNewStatusLike(getStatus() != null ? getStatus(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ReplicationControllerFluentImpl that = (ReplicationControllerFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (spec != null ? !spec.equals(that.spec) :that.spec != null) return false;
            if (status != null ? !status.equals(that.status) :that.status != null) return false;
            return true;
    }


    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<ReplicationControllerFluent.MetadataNested<N>> implements ReplicationControllerFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) ReplicationControllerFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}
    public class SpecNestedImpl<N> extends ReplicationControllerSpecFluentImpl<ReplicationControllerFluent.SpecNested<N>> implements ReplicationControllerFluent.SpecNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ReplicationControllerSpecBuilder builder;
    
            SpecNestedImpl(ReplicationControllerSpec item){
                    this.builder = new ReplicationControllerSpecBuilder(this, item);
            }
            SpecNestedImpl(){
                    this.builder = new ReplicationControllerSpecBuilder(this);
            }
    
    public N and(){
            return (N) ReplicationControllerFluentImpl.this.withSpec(builder.build());
    }
    public N endSpec(){
            return and();
    }

}
    public class StatusNestedImpl<N> extends ReplicationControllerStatusFluentImpl<ReplicationControllerFluent.StatusNested<N>> implements ReplicationControllerFluent.StatusNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ReplicationControllerStatusBuilder builder;
    
            StatusNestedImpl(ReplicationControllerStatus item){
                    this.builder = new ReplicationControllerStatusBuilder(this, item);
            }
            StatusNestedImpl(){
                    this.builder = new ReplicationControllerStatusBuilder(this);
            }
    
    public N and(){
            return (N) ReplicationControllerFluentImpl.this.withStatus(builder.build());
    }
    public N endStatus(){
            return and();
    }

}


}
