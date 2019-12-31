package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.util.LinkedHashMap;
import io.fabric8.kubernetes.api.model.ObjectMetaFluent;
import java.lang.Deprecated;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public interface ImageSignatureFluent<A extends ImageSignatureFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToConditions(int index,SignatureCondition item);
    public A setToConditions(int index,SignatureCondition item);
    public A addToConditions(SignatureCondition... items);
    public A addAllToConditions(Collection<SignatureCondition> items);
    public A removeFromConditions(SignatureCondition... items);
    public A removeAllFromConditions(Collection<SignatureCondition> items);
    
/**
 * This method has been deprecated, please use method buildConditions instead.
 * @return The buildable object.
 */
@Deprecated public List<SignatureCondition> getConditions();
    public List<SignatureCondition> buildConditions();
    public SignatureCondition buildCondition(int index);
    public SignatureCondition buildFirstCondition();
    public SignatureCondition buildLastCondition();
    public SignatureCondition buildMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<SignatureConditionBuilder> predicate);
    public A withConditions(List<SignatureCondition> conditions);
    public A withConditions(SignatureCondition... conditions);
    public Boolean hasConditions();
    public ImageSignatureFluent.ConditionsNested<A> addNewCondition();
    public ImageSignatureFluent.ConditionsNested<A> addNewConditionLike(SignatureCondition item);
    public ImageSignatureFluent.ConditionsNested<A> setNewConditionLike(int index,SignatureCondition item);
    public ImageSignatureFluent.ConditionsNested<A> editCondition(int index);
    public ImageSignatureFluent.ConditionsNested<A> editFirstCondition();
    public ImageSignatureFluent.ConditionsNested<A> editLastCondition();
    public ImageSignatureFluent.ConditionsNested<A> editMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<SignatureConditionBuilder> predicate);
    public String getContent();
    public A withContent(String content);
    public Boolean hasContent();
    public String getCreated();
    public A withCreated(String created);
    public Boolean hasCreated();
    public String getImageIdentity();
    public A withImageIdentity(String imageIdentity);
    public Boolean hasImageIdentity();
    
/**
 * This method has been deprecated, please use method buildIssuedBy instead.
 * @return The buildable object.
 */
@Deprecated public SignatureIssuer getIssuedBy();
    public SignatureIssuer buildIssuedBy();
    public A withIssuedBy(SignatureIssuer issuedBy);
    public Boolean hasIssuedBy();
    public A withNewIssuedBy(String commonName,String organization);
    public ImageSignatureFluent.IssuedByNested<A> withNewIssuedBy();
    public ImageSignatureFluent.IssuedByNested<A> withNewIssuedByLike(SignatureIssuer item);
    public ImageSignatureFluent.IssuedByNested<A> editIssuedBy();
    public ImageSignatureFluent.IssuedByNested<A> editOrNewIssuedBy();
    public ImageSignatureFluent.IssuedByNested<A> editOrNewIssuedByLike(SignatureIssuer item);
    
/**
 * This method has been deprecated, please use method buildIssuedTo instead.
 * @return The buildable object.
 */
@Deprecated public SignatureSubject getIssuedTo();
    public SignatureSubject buildIssuedTo();
    public A withIssuedTo(SignatureSubject issuedTo);
    public Boolean hasIssuedTo();
    public A withNewIssuedTo(String commonName,String organization,String publicKeyID);
    public ImageSignatureFluent.IssuedToNested<A> withNewIssuedTo();
    public ImageSignatureFluent.IssuedToNested<A> withNewIssuedToLike(SignatureSubject item);
    public ImageSignatureFluent.IssuedToNested<A> editIssuedTo();
    public ImageSignatureFluent.IssuedToNested<A> editOrNewIssuedTo();
    public ImageSignatureFluent.IssuedToNested<A> editOrNewIssuedToLike(SignatureSubject item);
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
    public ImageSignatureFluent.MetadataNested<A> withNewMetadata();
    public ImageSignatureFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public ImageSignatureFluent.MetadataNested<A> editMetadata();
    public ImageSignatureFluent.MetadataNested<A> editOrNewMetadata();
    public ImageSignatureFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    public A addToSignedClaims(String key,String value);
    public A addToSignedClaims(Map<String,String> map);
    public A removeFromSignedClaims(String key);
    public A removeFromSignedClaims(Map<String,String> map);
    public Map<String,String> getSignedClaims();
    public A withSignedClaims(Map<String,String> signedClaims);
    public Boolean hasSignedClaims();
    public String getType();
    public A withType(String type);
    public Boolean hasType();

    public interface ConditionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SignatureConditionFluent<ImageSignatureFluent.ConditionsNested<N>>{

        
    public N and();    public N endCondition();
}
    public interface IssuedByNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SignatureIssuerFluent<ImageSignatureFluent.IssuedByNested<N>>{

        
    public N and();    public N endIssuedBy();
}
    public interface IssuedToNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SignatureSubjectFluent<ImageSignatureFluent.IssuedToNested<N>>{

        
    public N and();    public N endIssuedTo();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<ImageSignatureFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
