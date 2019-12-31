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
import javax.validation.Valid;
import java.lang.Object;

public class IngressFluentImpl<A extends IngressFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements IngressFluent<A>{

    private String apiVersion;
    private String kind;
    private ObjectMetaBuilder metadata;
    private IngressSpecBuilder spec;
    private IngressStatusBuilder status;

    public IngressFluentImpl(){
    }
    public IngressFluentImpl(Ingress instance){
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

    public IngressFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public IngressFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public IngressFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public IngressFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public IngressFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public IngressSpec getSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public IngressSpec buildSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public A withSpec(IngressSpec spec){
            _visitables.remove(this.spec);
            if (spec!=null){ this.spec= new IngressSpecBuilder(spec); _visitables.add(this.spec);} return (A) this;
    }

    public Boolean hasSpec(){
            return this.spec != null;
    }

    public IngressFluent.SpecNested<A> withNewSpec(){
            return new SpecNestedImpl();
    }

    public IngressFluent.SpecNested<A> withNewSpecLike(IngressSpec item){
            return new SpecNestedImpl(item);
    }

    public IngressFluent.SpecNested<A> editSpec(){
            return withNewSpecLike(getSpec());
    }

    public IngressFluent.SpecNested<A> editOrNewSpec(){
            return withNewSpecLike(getSpec() != null ? getSpec(): new IngressSpecBuilder().build());
    }

    public IngressFluent.SpecNested<A> editOrNewSpecLike(IngressSpec item){
            return withNewSpecLike(getSpec() != null ? getSpec(): item);
    }

    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public IngressStatus getStatus(){
            return this.status!=null?this.status.build():null;
    }

    public IngressStatus buildStatus(){
            return this.status!=null?this.status.build():null;
    }

    public A withStatus(IngressStatus status){
            _visitables.remove(this.status);
            if (status!=null){ this.status= new IngressStatusBuilder(status); _visitables.add(this.status);} return (A) this;
    }

    public Boolean hasStatus(){
            return this.status != null;
    }

    public IngressFluent.StatusNested<A> withNewStatus(){
            return new StatusNestedImpl();
    }

    public IngressFluent.StatusNested<A> withNewStatusLike(IngressStatus item){
            return new StatusNestedImpl(item);
    }

    public IngressFluent.StatusNested<A> editStatus(){
            return withNewStatusLike(getStatus());
    }

    public IngressFluent.StatusNested<A> editOrNewStatus(){
            return withNewStatusLike(getStatus() != null ? getStatus(): new IngressStatusBuilder().build());
    }

    public IngressFluent.StatusNested<A> editOrNewStatusLike(IngressStatus item){
            return withNewStatusLike(getStatus() != null ? getStatus(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            IngressFluentImpl that = (IngressFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (spec != null ? !spec.equals(that.spec) :that.spec != null) return false;
            if (status != null ? !status.equals(that.status) :that.status != null) return false;
            return true;
    }


    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<IngressFluent.MetadataNested<N>> implements IngressFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) IngressFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}
    public class SpecNestedImpl<N> extends IngressSpecFluentImpl<IngressFluent.SpecNested<N>> implements IngressFluent.SpecNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IngressSpecBuilder builder;
    
            SpecNestedImpl(IngressSpec item){
                    this.builder = new IngressSpecBuilder(this, item);
            }
            SpecNestedImpl(){
                    this.builder = new IngressSpecBuilder(this);
            }
    
    public N and(){
            return (N) IngressFluentImpl.this.withSpec(builder.build());
    }
    public N endSpec(){
            return and();
    }

}
    public class StatusNestedImpl<N> extends IngressStatusFluentImpl<IngressFluent.StatusNested<N>> implements IngressFluent.StatusNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IngressStatusBuilder builder;
    
            StatusNestedImpl(IngressStatus item){
                    this.builder = new IngressStatusBuilder(this, item);
            }
            StatusNestedImpl(){
                    this.builder = new IngressStatusBuilder(this);
            }
    
    public N and(){
            return (N) IngressFluentImpl.this.withStatus(builder.build());
    }
    public N endStatus(){
            return and();
    }

}


}
