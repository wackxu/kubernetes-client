package io.fabric8.kubernetes.api.model.authorization;

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

public class SubjectAccessReviewFluentImpl<A extends SubjectAccessReviewFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements SubjectAccessReviewFluent<A>{

    private String apiVersion;
    private String kind;
    private ObjectMetaBuilder metadata;
    private SubjectAccessReviewSpecBuilder spec;
    private SubjectAccessReviewStatusBuilder status;

    public SubjectAccessReviewFluentImpl(){
    }
    public SubjectAccessReviewFluentImpl(SubjectAccessReview instance){
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

    public SubjectAccessReviewFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public SubjectAccessReviewFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public SubjectAccessReviewFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public SubjectAccessReviewFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public SubjectAccessReviewFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public SubjectAccessReviewSpec getSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public SubjectAccessReviewSpec buildSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public A withSpec(SubjectAccessReviewSpec spec){
            _visitables.remove(this.spec);
            if (spec!=null){ this.spec= new SubjectAccessReviewSpecBuilder(spec); _visitables.add(this.spec);} return (A) this;
    }

    public Boolean hasSpec(){
            return this.spec != null;
    }

    public SubjectAccessReviewFluent.SpecNested<A> withNewSpec(){
            return new SpecNestedImpl();
    }

    public SubjectAccessReviewFluent.SpecNested<A> withNewSpecLike(SubjectAccessReviewSpec item){
            return new SpecNestedImpl(item);
    }

    public SubjectAccessReviewFluent.SpecNested<A> editSpec(){
            return withNewSpecLike(getSpec());
    }

    public SubjectAccessReviewFluent.SpecNested<A> editOrNewSpec(){
            return withNewSpecLike(getSpec() != null ? getSpec(): new SubjectAccessReviewSpecBuilder().build());
    }

    public SubjectAccessReviewFluent.SpecNested<A> editOrNewSpecLike(SubjectAccessReviewSpec item){
            return withNewSpecLike(getSpec() != null ? getSpec(): item);
    }

    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public SubjectAccessReviewStatus getStatus(){
            return this.status!=null?this.status.build():null;
    }

    public SubjectAccessReviewStatus buildStatus(){
            return this.status!=null?this.status.build():null;
    }

    public A withStatus(SubjectAccessReviewStatus status){
            _visitables.remove(this.status);
            if (status!=null){ this.status= new SubjectAccessReviewStatusBuilder(status); _visitables.add(this.status);} return (A) this;
    }

    public Boolean hasStatus(){
            return this.status != null;
    }

    public A withNewStatus(Boolean allowed,Boolean denied,String evaluationError,String reason){
            return (A)withStatus(new SubjectAccessReviewStatus(allowed, denied, evaluationError, reason));
    }

    public SubjectAccessReviewFluent.StatusNested<A> withNewStatus(){
            return new StatusNestedImpl();
    }

    public SubjectAccessReviewFluent.StatusNested<A> withNewStatusLike(SubjectAccessReviewStatus item){
            return new StatusNestedImpl(item);
    }

    public SubjectAccessReviewFluent.StatusNested<A> editStatus(){
            return withNewStatusLike(getStatus());
    }

    public SubjectAccessReviewFluent.StatusNested<A> editOrNewStatus(){
            return withNewStatusLike(getStatus() != null ? getStatus(): new SubjectAccessReviewStatusBuilder().build());
    }

    public SubjectAccessReviewFluent.StatusNested<A> editOrNewStatusLike(SubjectAccessReviewStatus item){
            return withNewStatusLike(getStatus() != null ? getStatus(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SubjectAccessReviewFluentImpl that = (SubjectAccessReviewFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (spec != null ? !spec.equals(that.spec) :that.spec != null) return false;
            if (status != null ? !status.equals(that.status) :that.status != null) return false;
            return true;
    }


    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<SubjectAccessReviewFluent.MetadataNested<N>> implements SubjectAccessReviewFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) SubjectAccessReviewFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}
    public class SpecNestedImpl<N> extends SubjectAccessReviewSpecFluentImpl<SubjectAccessReviewFluent.SpecNested<N>> implements SubjectAccessReviewFluent.SpecNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SubjectAccessReviewSpecBuilder builder;
    
            SpecNestedImpl(SubjectAccessReviewSpec item){
                    this.builder = new SubjectAccessReviewSpecBuilder(this, item);
            }
            SpecNestedImpl(){
                    this.builder = new SubjectAccessReviewSpecBuilder(this);
            }
    
    public N and(){
            return (N) SubjectAccessReviewFluentImpl.this.withSpec(builder.build());
    }
    public N endSpec(){
            return and();
    }

}
    public class StatusNestedImpl<N> extends SubjectAccessReviewStatusFluentImpl<SubjectAccessReviewFluent.StatusNested<N>> implements SubjectAccessReviewFluent.StatusNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SubjectAccessReviewStatusBuilder builder;
    
            StatusNestedImpl(SubjectAccessReviewStatus item){
                    this.builder = new SubjectAccessReviewStatusBuilder(this, item);
            }
            StatusNestedImpl(){
                    this.builder = new SubjectAccessReviewStatusBuilder(this);
            }
    
    public N and(){
            return (N) SubjectAccessReviewFluentImpl.this.withStatus(builder.build());
    }
    public N endStatus(){
            return and();
    }

}


}
