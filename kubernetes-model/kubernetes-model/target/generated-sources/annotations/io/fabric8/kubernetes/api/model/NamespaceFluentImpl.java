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

public class NamespaceFluentImpl<A extends NamespaceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements NamespaceFluent<A>{

    private String apiVersion;
    private String kind;
    private ObjectMetaBuilder metadata;
    private NamespaceSpecBuilder spec;
    private NamespaceStatusBuilder status;

    public NamespaceFluentImpl(){
    }
    public NamespaceFluentImpl(Namespace instance){
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

    public NamespaceFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public NamespaceFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public NamespaceFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public NamespaceFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public NamespaceFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public NamespaceSpec getSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public NamespaceSpec buildSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public A withSpec(NamespaceSpec spec){
            _visitables.remove(this.spec);
            if (spec!=null){ this.spec= new NamespaceSpecBuilder(spec); _visitables.add(this.spec);} return (A) this;
    }

    public Boolean hasSpec(){
            return this.spec != null;
    }

    public NamespaceFluent.SpecNested<A> withNewSpec(){
            return new SpecNestedImpl();
    }

    public NamespaceFluent.SpecNested<A> withNewSpecLike(NamespaceSpec item){
            return new SpecNestedImpl(item);
    }

    public NamespaceFluent.SpecNested<A> editSpec(){
            return withNewSpecLike(getSpec());
    }

    public NamespaceFluent.SpecNested<A> editOrNewSpec(){
            return withNewSpecLike(getSpec() != null ? getSpec(): new NamespaceSpecBuilder().build());
    }

    public NamespaceFluent.SpecNested<A> editOrNewSpecLike(NamespaceSpec item){
            return withNewSpecLike(getSpec() != null ? getSpec(): item);
    }

    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public NamespaceStatus getStatus(){
            return this.status!=null?this.status.build():null;
    }

    public NamespaceStatus buildStatus(){
            return this.status!=null?this.status.build():null;
    }

    public A withStatus(NamespaceStatus status){
            _visitables.remove(this.status);
            if (status!=null){ this.status= new NamespaceStatusBuilder(status); _visitables.add(this.status);} return (A) this;
    }

    public Boolean hasStatus(){
            return this.status != null;
    }

    public A withNewStatus(String phase){
            return (A)withStatus(new NamespaceStatus(phase));
    }

    public NamespaceFluent.StatusNested<A> withNewStatus(){
            return new StatusNestedImpl();
    }

    public NamespaceFluent.StatusNested<A> withNewStatusLike(NamespaceStatus item){
            return new StatusNestedImpl(item);
    }

    public NamespaceFluent.StatusNested<A> editStatus(){
            return withNewStatusLike(getStatus());
    }

    public NamespaceFluent.StatusNested<A> editOrNewStatus(){
            return withNewStatusLike(getStatus() != null ? getStatus(): new NamespaceStatusBuilder().build());
    }

    public NamespaceFluent.StatusNested<A> editOrNewStatusLike(NamespaceStatus item){
            return withNewStatusLike(getStatus() != null ? getStatus(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NamespaceFluentImpl that = (NamespaceFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (spec != null ? !spec.equals(that.spec) :that.spec != null) return false;
            if (status != null ? !status.equals(that.status) :that.status != null) return false;
            return true;
    }


    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<NamespaceFluent.MetadataNested<N>> implements NamespaceFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) NamespaceFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}
    public class SpecNestedImpl<N> extends NamespaceSpecFluentImpl<NamespaceFluent.SpecNested<N>> implements NamespaceFluent.SpecNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NamespaceSpecBuilder builder;
    
            SpecNestedImpl(NamespaceSpec item){
                    this.builder = new NamespaceSpecBuilder(this, item);
            }
            SpecNestedImpl(){
                    this.builder = new NamespaceSpecBuilder(this);
            }
    
    public N and(){
            return (N) NamespaceFluentImpl.this.withSpec(builder.build());
    }
    public N endSpec(){
            return and();
    }

}
    public class StatusNestedImpl<N> extends NamespaceStatusFluentImpl<NamespaceFluent.StatusNested<N>> implements NamespaceFluent.StatusNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NamespaceStatusBuilder builder;
    
            StatusNestedImpl(NamespaceStatus item){
                    this.builder = new NamespaceStatusBuilder(this, item);
            }
            StatusNestedImpl(){
                    this.builder = new NamespaceStatusBuilder(this);
            }
    
    public N and(){
            return (N) NamespaceFluentImpl.this.withStatus(builder.build());
    }
    public N endStatus(){
            return and();
    }

}


}
