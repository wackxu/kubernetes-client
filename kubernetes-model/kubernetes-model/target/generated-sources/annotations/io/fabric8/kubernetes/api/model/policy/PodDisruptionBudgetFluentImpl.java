package io.fabric8.kubernetes.api.model.policy;

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

public class PodDisruptionBudgetFluentImpl<A extends PodDisruptionBudgetFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements PodDisruptionBudgetFluent<A>{

    private String apiVersion;
    private String kind;
    private ObjectMetaBuilder metadata;
    private PodDisruptionBudgetSpecBuilder spec;
    private PodDisruptionBudgetStatusBuilder status;

    public PodDisruptionBudgetFluentImpl(){
    }
    public PodDisruptionBudgetFluentImpl(PodDisruptionBudget instance){
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

    public PodDisruptionBudgetFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public PodDisruptionBudgetFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public PodDisruptionBudgetFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public PodDisruptionBudgetFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public PodDisruptionBudgetFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public PodDisruptionBudgetSpec getSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public PodDisruptionBudgetSpec buildSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public A withSpec(PodDisruptionBudgetSpec spec){
            _visitables.remove(this.spec);
            if (spec!=null){ this.spec= new PodDisruptionBudgetSpecBuilder(spec); _visitables.add(this.spec);} return (A) this;
    }

    public Boolean hasSpec(){
            return this.spec != null;
    }

    public PodDisruptionBudgetFluent.SpecNested<A> withNewSpec(){
            return new SpecNestedImpl();
    }

    public PodDisruptionBudgetFluent.SpecNested<A> withNewSpecLike(PodDisruptionBudgetSpec item){
            return new SpecNestedImpl(item);
    }

    public PodDisruptionBudgetFluent.SpecNested<A> editSpec(){
            return withNewSpecLike(getSpec());
    }

    public PodDisruptionBudgetFluent.SpecNested<A> editOrNewSpec(){
            return withNewSpecLike(getSpec() != null ? getSpec(): new PodDisruptionBudgetSpecBuilder().build());
    }

    public PodDisruptionBudgetFluent.SpecNested<A> editOrNewSpecLike(PodDisruptionBudgetSpec item){
            return withNewSpecLike(getSpec() != null ? getSpec(): item);
    }

    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public PodDisruptionBudgetStatus getStatus(){
            return this.status!=null?this.status.build():null;
    }

    public PodDisruptionBudgetStatus buildStatus(){
            return this.status!=null?this.status.build():null;
    }

    public A withStatus(PodDisruptionBudgetStatus status){
            _visitables.remove(this.status);
            if (status!=null){ this.status= new PodDisruptionBudgetStatusBuilder(status); _visitables.add(this.status);} return (A) this;
    }

    public Boolean hasStatus(){
            return this.status != null;
    }

    public PodDisruptionBudgetFluent.StatusNested<A> withNewStatus(){
            return new StatusNestedImpl();
    }

    public PodDisruptionBudgetFluent.StatusNested<A> withNewStatusLike(PodDisruptionBudgetStatus item){
            return new StatusNestedImpl(item);
    }

    public PodDisruptionBudgetFluent.StatusNested<A> editStatus(){
            return withNewStatusLike(getStatus());
    }

    public PodDisruptionBudgetFluent.StatusNested<A> editOrNewStatus(){
            return withNewStatusLike(getStatus() != null ? getStatus(): new PodDisruptionBudgetStatusBuilder().build());
    }

    public PodDisruptionBudgetFluent.StatusNested<A> editOrNewStatusLike(PodDisruptionBudgetStatus item){
            return withNewStatusLike(getStatus() != null ? getStatus(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PodDisruptionBudgetFluentImpl that = (PodDisruptionBudgetFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (spec != null ? !spec.equals(that.spec) :that.spec != null) return false;
            if (status != null ? !status.equals(that.status) :that.status != null) return false;
            return true;
    }


    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<PodDisruptionBudgetFluent.MetadataNested<N>> implements PodDisruptionBudgetFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) PodDisruptionBudgetFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}
    public class SpecNestedImpl<N> extends PodDisruptionBudgetSpecFluentImpl<PodDisruptionBudgetFluent.SpecNested<N>> implements PodDisruptionBudgetFluent.SpecNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodDisruptionBudgetSpecBuilder builder;
    
            SpecNestedImpl(PodDisruptionBudgetSpec item){
                    this.builder = new PodDisruptionBudgetSpecBuilder(this, item);
            }
            SpecNestedImpl(){
                    this.builder = new PodDisruptionBudgetSpecBuilder(this);
            }
    
    public N and(){
            return (N) PodDisruptionBudgetFluentImpl.this.withSpec(builder.build());
    }
    public N endSpec(){
            return and();
    }

}
    public class StatusNestedImpl<N> extends PodDisruptionBudgetStatusFluentImpl<PodDisruptionBudgetFluent.StatusNested<N>> implements PodDisruptionBudgetFluent.StatusNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodDisruptionBudgetStatusBuilder builder;
    
            StatusNestedImpl(PodDisruptionBudgetStatus item){
                    this.builder = new PodDisruptionBudgetStatusBuilder(this, item);
            }
            StatusNestedImpl(){
                    this.builder = new PodDisruptionBudgetStatusBuilder(this);
            }
    
    public N and(){
            return (N) PodDisruptionBudgetFluentImpl.this.withStatus(builder.build());
    }
    public N endStatus(){
            return and();
    }

}


}
