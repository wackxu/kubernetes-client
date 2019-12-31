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

public class ImageStreamFluentImpl<A extends ImageStreamFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ImageStreamFluent<A>{

    private String apiVersion;
    private String kind;
    private ObjectMetaBuilder metadata;
    private ImageStreamSpecBuilder spec;
    private ImageStreamStatusBuilder status;

    public ImageStreamFluentImpl(){
    }
    public ImageStreamFluentImpl(ImageStream instance){
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

    public ImageStreamFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public ImageStreamFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public ImageStreamFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public ImageStreamFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public ImageStreamFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public ImageStreamSpec getSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public ImageStreamSpec buildSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public A withSpec(ImageStreamSpec spec){
            _visitables.remove(this.spec);
            if (spec!=null){ this.spec= new ImageStreamSpecBuilder(spec); _visitables.add(this.spec);} return (A) this;
    }

    public Boolean hasSpec(){
            return this.spec != null;
    }

    public ImageStreamFluent.SpecNested<A> withNewSpec(){
            return new SpecNestedImpl();
    }

    public ImageStreamFluent.SpecNested<A> withNewSpecLike(ImageStreamSpec item){
            return new SpecNestedImpl(item);
    }

    public ImageStreamFluent.SpecNested<A> editSpec(){
            return withNewSpecLike(getSpec());
    }

    public ImageStreamFluent.SpecNested<A> editOrNewSpec(){
            return withNewSpecLike(getSpec() != null ? getSpec(): new ImageStreamSpecBuilder().build());
    }

    public ImageStreamFluent.SpecNested<A> editOrNewSpecLike(ImageStreamSpec item){
            return withNewSpecLike(getSpec() != null ? getSpec(): item);
    }

    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public ImageStreamStatus getStatus(){
            return this.status!=null?this.status.build():null;
    }

    public ImageStreamStatus buildStatus(){
            return this.status!=null?this.status.build():null;
    }

    public A withStatus(ImageStreamStatus status){
            _visitables.remove(this.status);
            if (status!=null){ this.status= new ImageStreamStatusBuilder(status); _visitables.add(this.status);} return (A) this;
    }

    public Boolean hasStatus(){
            return this.status != null;
    }

    public ImageStreamFluent.StatusNested<A> withNewStatus(){
            return new StatusNestedImpl();
    }

    public ImageStreamFluent.StatusNested<A> withNewStatusLike(ImageStreamStatus item){
            return new StatusNestedImpl(item);
    }

    public ImageStreamFluent.StatusNested<A> editStatus(){
            return withNewStatusLike(getStatus());
    }

    public ImageStreamFluent.StatusNested<A> editOrNewStatus(){
            return withNewStatusLike(getStatus() != null ? getStatus(): new ImageStreamStatusBuilder().build());
    }

    public ImageStreamFluent.StatusNested<A> editOrNewStatusLike(ImageStreamStatus item){
            return withNewStatusLike(getStatus() != null ? getStatus(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ImageStreamFluentImpl that = (ImageStreamFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (spec != null ? !spec.equals(that.spec) :that.spec != null) return false;
            if (status != null ? !status.equals(that.status) :that.status != null) return false;
            return true;
    }


    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<ImageStreamFluent.MetadataNested<N>> implements ImageStreamFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) ImageStreamFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}
    public class SpecNestedImpl<N> extends ImageStreamSpecFluentImpl<ImageStreamFluent.SpecNested<N>> implements ImageStreamFluent.SpecNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageStreamSpecBuilder builder;
    
            SpecNestedImpl(ImageStreamSpec item){
                    this.builder = new ImageStreamSpecBuilder(this, item);
            }
            SpecNestedImpl(){
                    this.builder = new ImageStreamSpecBuilder(this);
            }
    
    public N and(){
            return (N) ImageStreamFluentImpl.this.withSpec(builder.build());
    }
    public N endSpec(){
            return and();
    }

}
    public class StatusNestedImpl<N> extends ImageStreamStatusFluentImpl<ImageStreamFluent.StatusNested<N>> implements ImageStreamFluent.StatusNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageStreamStatusBuilder builder;
    
            StatusNestedImpl(ImageStreamStatus item){
                    this.builder = new ImageStreamStatusBuilder(this, item);
            }
            StatusNestedImpl(){
                    this.builder = new ImageStreamStatusBuilder(this);
            }
    
    public N and(){
            return (N) ImageStreamFluentImpl.this.withStatus(builder.build());
    }
    public N endStatus(){
            return and();
    }

}


}
