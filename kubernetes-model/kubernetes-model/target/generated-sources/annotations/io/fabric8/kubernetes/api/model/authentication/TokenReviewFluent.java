package io.fabric8.kubernetes.api.model.authentication;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.model.ObjectMetaFluent;
import java.lang.Deprecated;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import javax.validation.Valid;
import java.lang.Object;
import java.util.Map;

public interface TokenReviewFluent<A extends TokenReviewFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public String getKind();
    public A withKind(String kind);
    public Boolean hasKind();
    
/**
 * This method has been deprecated, please use method buildMetadata instead.
 * @return The buildable object.
 */
@Deprecated public ObjectMeta getMetadata();
    public ObjectMeta buildMetadata();
    public A withMetadata(ObjectMeta metadata);
    public Boolean hasMetadata();
    public TokenReviewFluent.MetadataNested<A> withNewMetadata();
    public TokenReviewFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public TokenReviewFluent.MetadataNested<A> editMetadata();
    public TokenReviewFluent.MetadataNested<A> editOrNewMetadata();
    public TokenReviewFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public TokenReviewSpec getSpec();
    public TokenReviewSpec buildSpec();
    public A withSpec(TokenReviewSpec spec);
    public Boolean hasSpec();
    public TokenReviewFluent.SpecNested<A> withNewSpec();
    public TokenReviewFluent.SpecNested<A> withNewSpecLike(TokenReviewSpec item);
    public TokenReviewFluent.SpecNested<A> editSpec();
    public TokenReviewFluent.SpecNested<A> editOrNewSpec();
    public TokenReviewFluent.SpecNested<A> editOrNewSpecLike(TokenReviewSpec item);
    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public TokenReviewStatus getStatus();
    public TokenReviewStatus buildStatus();
    public A withStatus(TokenReviewStatus status);
    public Boolean hasStatus();
    public TokenReviewFluent.StatusNested<A> withNewStatus();
    public TokenReviewFluent.StatusNested<A> withNewStatusLike(TokenReviewStatus item);
    public TokenReviewFluent.StatusNested<A> editStatus();
    public TokenReviewFluent.StatusNested<A> editOrNewStatus();
    public TokenReviewFluent.StatusNested<A> editOrNewStatusLike(TokenReviewStatus item);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<TokenReviewFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface SpecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TokenReviewSpecFluent<TokenReviewFluent.SpecNested<N>>{

        
    public N and();    public N endSpec();
}
    public interface StatusNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TokenReviewStatusFluent<TokenReviewFluent.StatusNested<N>>{

        
    public N and();    public N endStatus();
}


}
