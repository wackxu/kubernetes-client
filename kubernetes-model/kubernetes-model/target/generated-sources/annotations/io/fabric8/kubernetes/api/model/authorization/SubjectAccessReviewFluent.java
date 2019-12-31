package io.fabric8.kubernetes.api.model.authorization;

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

public interface SubjectAccessReviewFluent<A extends SubjectAccessReviewFluent<A>> extends Fluent<A>{


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
    public SubjectAccessReviewFluent.MetadataNested<A> withNewMetadata();
    public SubjectAccessReviewFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public SubjectAccessReviewFluent.MetadataNested<A> editMetadata();
    public SubjectAccessReviewFluent.MetadataNested<A> editOrNewMetadata();
    public SubjectAccessReviewFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public SubjectAccessReviewSpec getSpec();
    public SubjectAccessReviewSpec buildSpec();
    public A withSpec(SubjectAccessReviewSpec spec);
    public Boolean hasSpec();
    public SubjectAccessReviewFluent.SpecNested<A> withNewSpec();
    public SubjectAccessReviewFluent.SpecNested<A> withNewSpecLike(SubjectAccessReviewSpec item);
    public SubjectAccessReviewFluent.SpecNested<A> editSpec();
    public SubjectAccessReviewFluent.SpecNested<A> editOrNewSpec();
    public SubjectAccessReviewFluent.SpecNested<A> editOrNewSpecLike(SubjectAccessReviewSpec item);
    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public SubjectAccessReviewStatus getStatus();
    public SubjectAccessReviewStatus buildStatus();
    public A withStatus(SubjectAccessReviewStatus status);
    public Boolean hasStatus();
    public A withNewStatus(Boolean allowed,Boolean denied,String evaluationError,String reason);
    public SubjectAccessReviewFluent.StatusNested<A> withNewStatus();
    public SubjectAccessReviewFluent.StatusNested<A> withNewStatusLike(SubjectAccessReviewStatus item);
    public SubjectAccessReviewFluent.StatusNested<A> editStatus();
    public SubjectAccessReviewFluent.StatusNested<A> editOrNewStatus();
    public SubjectAccessReviewFluent.StatusNested<A> editOrNewStatusLike(SubjectAccessReviewStatus item);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<SubjectAccessReviewFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface SpecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SubjectAccessReviewSpecFluent<SubjectAccessReviewFluent.SpecNested<N>>{

        
    public N and();    public N endSpec();
}
    public interface StatusNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SubjectAccessReviewStatusFluent<SubjectAccessReviewFluent.StatusNested<N>>{

        
    public N and();    public N endStatus();
}


}
