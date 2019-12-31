package io.fabric8.kubernetes.api.model.authentication;

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

public class TokenReviewFluentImpl<A extends TokenReviewFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements TokenReviewFluent<A>{

    private String apiVersion;
    private String kind;
    private ObjectMetaBuilder metadata;
    private TokenReviewSpecBuilder spec;
    private TokenReviewStatusBuilder status;

    public TokenReviewFluentImpl(){
    }
    public TokenReviewFluentImpl(TokenReview instance){
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

    public TokenReviewFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public TokenReviewFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public TokenReviewFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public TokenReviewFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public TokenReviewFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public TokenReviewSpec getSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public TokenReviewSpec buildSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public A withSpec(TokenReviewSpec spec){
            _visitables.remove(this.spec);
            if (spec!=null){ this.spec= new TokenReviewSpecBuilder(spec); _visitables.add(this.spec);} return (A) this;
    }

    public Boolean hasSpec(){
            return this.spec != null;
    }

    public TokenReviewFluent.SpecNested<A> withNewSpec(){
            return new SpecNestedImpl();
    }

    public TokenReviewFluent.SpecNested<A> withNewSpecLike(TokenReviewSpec item){
            return new SpecNestedImpl(item);
    }

    public TokenReviewFluent.SpecNested<A> editSpec(){
            return withNewSpecLike(getSpec());
    }

    public TokenReviewFluent.SpecNested<A> editOrNewSpec(){
            return withNewSpecLike(getSpec() != null ? getSpec(): new TokenReviewSpecBuilder().build());
    }

    public TokenReviewFluent.SpecNested<A> editOrNewSpecLike(TokenReviewSpec item){
            return withNewSpecLike(getSpec() != null ? getSpec(): item);
    }

    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public TokenReviewStatus getStatus(){
            return this.status!=null?this.status.build():null;
    }

    public TokenReviewStatus buildStatus(){
            return this.status!=null?this.status.build():null;
    }

    public A withStatus(TokenReviewStatus status){
            _visitables.remove(this.status);
            if (status!=null){ this.status= new TokenReviewStatusBuilder(status); _visitables.add(this.status);} return (A) this;
    }

    public Boolean hasStatus(){
            return this.status != null;
    }

    public TokenReviewFluent.StatusNested<A> withNewStatus(){
            return new StatusNestedImpl();
    }

    public TokenReviewFluent.StatusNested<A> withNewStatusLike(TokenReviewStatus item){
            return new StatusNestedImpl(item);
    }

    public TokenReviewFluent.StatusNested<A> editStatus(){
            return withNewStatusLike(getStatus());
    }

    public TokenReviewFluent.StatusNested<A> editOrNewStatus(){
            return withNewStatusLike(getStatus() != null ? getStatus(): new TokenReviewStatusBuilder().build());
    }

    public TokenReviewFluent.StatusNested<A> editOrNewStatusLike(TokenReviewStatus item){
            return withNewStatusLike(getStatus() != null ? getStatus(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            TokenReviewFluentImpl that = (TokenReviewFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (spec != null ? !spec.equals(that.spec) :that.spec != null) return false;
            if (status != null ? !status.equals(that.status) :that.status != null) return false;
            return true;
    }


    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<TokenReviewFluent.MetadataNested<N>> implements TokenReviewFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) TokenReviewFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}
    public class SpecNestedImpl<N> extends TokenReviewSpecFluentImpl<TokenReviewFluent.SpecNested<N>> implements TokenReviewFluent.SpecNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TokenReviewSpecBuilder builder;
    
            SpecNestedImpl(TokenReviewSpec item){
                    this.builder = new TokenReviewSpecBuilder(this, item);
            }
            SpecNestedImpl(){
                    this.builder = new TokenReviewSpecBuilder(this);
            }
    
    public N and(){
            return (N) TokenReviewFluentImpl.this.withSpec(builder.build());
    }
    public N endSpec(){
            return and();
    }

}
    public class StatusNestedImpl<N> extends TokenReviewStatusFluentImpl<TokenReviewFluent.StatusNested<N>> implements TokenReviewFluent.StatusNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TokenReviewStatusBuilder builder;
    
            StatusNestedImpl(TokenReviewStatus item){
                    this.builder = new TokenReviewStatusBuilder(this, item);
            }
            StatusNestedImpl(){
                    this.builder = new TokenReviewStatusBuilder(this);
            }
    
    public N and(){
            return (N) TokenReviewFluentImpl.this.withStatus(builder.build());
    }
    public N endStatus(){
            return and();
    }

}


}
