package io.fabric8.kubernetes.api.model.apiextensions;

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

public class CustomResourceDefinitionFluentImpl<A extends CustomResourceDefinitionFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements CustomResourceDefinitionFluent<A>{

    private String apiVersion;
    private String kind;
    private ObjectMetaBuilder metadata;
    private CustomResourceDefinitionSpecBuilder spec;
    private CustomResourceDefinitionStatusBuilder status;

    public CustomResourceDefinitionFluentImpl(){
    }
    public CustomResourceDefinitionFluentImpl(CustomResourceDefinition instance){
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

    public CustomResourceDefinitionFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public CustomResourceDefinitionFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public CustomResourceDefinitionFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public CustomResourceDefinitionFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public CustomResourceDefinitionFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public CustomResourceDefinitionSpec getSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public CustomResourceDefinitionSpec buildSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public A withSpec(CustomResourceDefinitionSpec spec){
            _visitables.remove(this.spec);
            if (spec!=null){ this.spec= new CustomResourceDefinitionSpecBuilder(spec); _visitables.add(this.spec);} return (A) this;
    }

    public Boolean hasSpec(){
            return this.spec != null;
    }

    public CustomResourceDefinitionFluent.SpecNested<A> withNewSpec(){
            return new SpecNestedImpl();
    }

    public CustomResourceDefinitionFluent.SpecNested<A> withNewSpecLike(CustomResourceDefinitionSpec item){
            return new SpecNestedImpl(item);
    }

    public CustomResourceDefinitionFluent.SpecNested<A> editSpec(){
            return withNewSpecLike(getSpec());
    }

    public CustomResourceDefinitionFluent.SpecNested<A> editOrNewSpec(){
            return withNewSpecLike(getSpec() != null ? getSpec(): new CustomResourceDefinitionSpecBuilder().build());
    }

    public CustomResourceDefinitionFluent.SpecNested<A> editOrNewSpecLike(CustomResourceDefinitionSpec item){
            return withNewSpecLike(getSpec() != null ? getSpec(): item);
    }

    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public CustomResourceDefinitionStatus getStatus(){
            return this.status!=null?this.status.build():null;
    }

    public CustomResourceDefinitionStatus buildStatus(){
            return this.status!=null?this.status.build():null;
    }

    public A withStatus(CustomResourceDefinitionStatus status){
            _visitables.remove(this.status);
            if (status!=null){ this.status= new CustomResourceDefinitionStatusBuilder(status); _visitables.add(this.status);} return (A) this;
    }

    public Boolean hasStatus(){
            return this.status != null;
    }

    public CustomResourceDefinitionFluent.StatusNested<A> withNewStatus(){
            return new StatusNestedImpl();
    }

    public CustomResourceDefinitionFluent.StatusNested<A> withNewStatusLike(CustomResourceDefinitionStatus item){
            return new StatusNestedImpl(item);
    }

    public CustomResourceDefinitionFluent.StatusNested<A> editStatus(){
            return withNewStatusLike(getStatus());
    }

    public CustomResourceDefinitionFluent.StatusNested<A> editOrNewStatus(){
            return withNewStatusLike(getStatus() != null ? getStatus(): new CustomResourceDefinitionStatusBuilder().build());
    }

    public CustomResourceDefinitionFluent.StatusNested<A> editOrNewStatusLike(CustomResourceDefinitionStatus item){
            return withNewStatusLike(getStatus() != null ? getStatus(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CustomResourceDefinitionFluentImpl that = (CustomResourceDefinitionFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (spec != null ? !spec.equals(that.spec) :that.spec != null) return false;
            if (status != null ? !status.equals(that.status) :that.status != null) return false;
            return true;
    }


    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<CustomResourceDefinitionFluent.MetadataNested<N>> implements CustomResourceDefinitionFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) CustomResourceDefinitionFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}
    public class SpecNestedImpl<N> extends CustomResourceDefinitionSpecFluentImpl<CustomResourceDefinitionFluent.SpecNested<N>> implements CustomResourceDefinitionFluent.SpecNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomResourceDefinitionSpecBuilder builder;
    
            SpecNestedImpl(CustomResourceDefinitionSpec item){
                    this.builder = new CustomResourceDefinitionSpecBuilder(this, item);
            }
            SpecNestedImpl(){
                    this.builder = new CustomResourceDefinitionSpecBuilder(this);
            }
    
    public N and(){
            return (N) CustomResourceDefinitionFluentImpl.this.withSpec(builder.build());
    }
    public N endSpec(){
            return and();
    }

}
    public class StatusNestedImpl<N> extends CustomResourceDefinitionStatusFluentImpl<CustomResourceDefinitionFluent.StatusNested<N>> implements CustomResourceDefinitionFluent.StatusNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomResourceDefinitionStatusBuilder builder;
    
            StatusNestedImpl(CustomResourceDefinitionStatus item){
                    this.builder = new CustomResourceDefinitionStatusBuilder(this, item);
            }
            StatusNestedImpl(){
                    this.builder = new CustomResourceDefinitionStatusBuilder(this);
            }
    
    public N and(){
            return (N) CustomResourceDefinitionFluentImpl.this.withStatus(builder.build());
    }
    public N endStatus(){
            return and();
    }

}


}
