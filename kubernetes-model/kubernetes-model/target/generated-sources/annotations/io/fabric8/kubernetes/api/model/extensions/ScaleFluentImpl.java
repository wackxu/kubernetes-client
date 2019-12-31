package io.fabric8.kubernetes.api.model.extensions;

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
import java.lang.Integer;
import javax.validation.Valid;
import java.lang.Object;

public class ScaleFluentImpl<A extends ScaleFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ScaleFluent<A>{

    private String apiVersion;
    private String kind;
    private ObjectMetaBuilder metadata;
    private ScaleSpecBuilder spec;
    private ScaleStatusBuilder status;

    public ScaleFluentImpl(){
    }
    public ScaleFluentImpl(Scale instance){
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

    public ScaleFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public ScaleFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public ScaleFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public ScaleFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public ScaleFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public ScaleSpec getSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public ScaleSpec buildSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public A withSpec(ScaleSpec spec){
            _visitables.remove(this.spec);
            if (spec!=null){ this.spec= new ScaleSpecBuilder(spec); _visitables.add(this.spec);} return (A) this;
    }

    public Boolean hasSpec(){
            return this.spec != null;
    }

    public A withNewSpec(Integer replicas){
            return (A)withSpec(new ScaleSpec(replicas));
    }

    public ScaleFluent.SpecNested<A> withNewSpec(){
            return new SpecNestedImpl();
    }

    public ScaleFluent.SpecNested<A> withNewSpecLike(ScaleSpec item){
            return new SpecNestedImpl(item);
    }

    public ScaleFluent.SpecNested<A> editSpec(){
            return withNewSpecLike(getSpec());
    }

    public ScaleFluent.SpecNested<A> editOrNewSpec(){
            return withNewSpecLike(getSpec() != null ? getSpec(): new ScaleSpecBuilder().build());
    }

    public ScaleFluent.SpecNested<A> editOrNewSpecLike(ScaleSpec item){
            return withNewSpecLike(getSpec() != null ? getSpec(): item);
    }

    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public ScaleStatus getStatus(){
            return this.status!=null?this.status.build():null;
    }

    public ScaleStatus buildStatus(){
            return this.status!=null?this.status.build():null;
    }

    public A withStatus(ScaleStatus status){
            _visitables.remove(this.status);
            if (status!=null){ this.status= new ScaleStatusBuilder(status); _visitables.add(this.status);} return (A) this;
    }

    public Boolean hasStatus(){
            return this.status != null;
    }

    public ScaleFluent.StatusNested<A> withNewStatus(){
            return new StatusNestedImpl();
    }

    public ScaleFluent.StatusNested<A> withNewStatusLike(ScaleStatus item){
            return new StatusNestedImpl(item);
    }

    public ScaleFluent.StatusNested<A> editStatus(){
            return withNewStatusLike(getStatus());
    }

    public ScaleFluent.StatusNested<A> editOrNewStatus(){
            return withNewStatusLike(getStatus() != null ? getStatus(): new ScaleStatusBuilder().build());
    }

    public ScaleFluent.StatusNested<A> editOrNewStatusLike(ScaleStatus item){
            return withNewStatusLike(getStatus() != null ? getStatus(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ScaleFluentImpl that = (ScaleFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (spec != null ? !spec.equals(that.spec) :that.spec != null) return false;
            if (status != null ? !status.equals(that.status) :that.status != null) return false;
            return true;
    }


    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<ScaleFluent.MetadataNested<N>> implements ScaleFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) ScaleFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}
    public class SpecNestedImpl<N> extends ScaleSpecFluentImpl<ScaleFluent.SpecNested<N>> implements ScaleFluent.SpecNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ScaleSpecBuilder builder;
    
            SpecNestedImpl(ScaleSpec item){
                    this.builder = new ScaleSpecBuilder(this, item);
            }
            SpecNestedImpl(){
                    this.builder = new ScaleSpecBuilder(this);
            }
    
    public N and(){
            return (N) ScaleFluentImpl.this.withSpec(builder.build());
    }
    public N endSpec(){
            return and();
    }

}
    public class StatusNestedImpl<N> extends ScaleStatusFluentImpl<ScaleFluent.StatusNested<N>> implements ScaleFluent.StatusNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ScaleStatusBuilder builder;
    
            StatusNestedImpl(ScaleStatus item){
                    this.builder = new ScaleStatusBuilder(this, item);
            }
            StatusNestedImpl(){
                    this.builder = new ScaleStatusBuilder(this);
            }
    
    public N and(){
            return (N) ScaleFluentImpl.this.withStatus(builder.build());
    }
    public N endStatus(){
            return and();
    }

}


}
