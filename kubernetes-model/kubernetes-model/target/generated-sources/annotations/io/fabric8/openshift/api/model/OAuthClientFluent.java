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
import io.fabric8.kubernetes.api.model.ObjectMetaFluent;
import java.lang.Deprecated;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import java.lang.Integer;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public interface OAuthClientFluent<A extends OAuthClientFluent<A>> extends Fluent<A>{


    public Integer getAccessTokenInactivityTimeoutSeconds();
    public A withAccessTokenInactivityTimeoutSeconds(Integer accessTokenInactivityTimeoutSeconds);
    public Boolean hasAccessTokenInactivityTimeoutSeconds();
    public Integer getAccessTokenMaxAgeSeconds();
    public A withAccessTokenMaxAgeSeconds(Integer accessTokenMaxAgeSeconds);
    public Boolean hasAccessTokenMaxAgeSeconds();
    public A addToAdditionalSecrets(int index,String item);
    public A setToAdditionalSecrets(int index,String item);
    public A addToAdditionalSecrets(String... items);
    public A addAllToAdditionalSecrets(Collection<String> items);
    public A removeFromAdditionalSecrets(String... items);
    public A removeAllFromAdditionalSecrets(Collection<String> items);
    public List<String> getAdditionalSecrets();
    public String getAdditionalSecret(int index);
    public String getFirstAdditionalSecret();
    public String getLastAdditionalSecret();
    public String getMatchingAdditionalSecret(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withAdditionalSecrets(List<String> additionalSecrets);
    public A withAdditionalSecrets(String... additionalSecrets);
    public Boolean hasAdditionalSecrets();
    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public String getGrantMethod();
    public A withGrantMethod(String grantMethod);
    public Boolean hasGrantMethod();
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
    public OAuthClientFluent.MetadataNested<A> withNewMetadata();
    public OAuthClientFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public OAuthClientFluent.MetadataNested<A> editMetadata();
    public OAuthClientFluent.MetadataNested<A> editOrNewMetadata();
    public OAuthClientFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    public A addToRedirectURIs(int index,String item);
    public A setToRedirectURIs(int index,String item);
    public A addToRedirectURIs(String... items);
    public A addAllToRedirectURIs(Collection<String> items);
    public A removeFromRedirectURIs(String... items);
    public A removeAllFromRedirectURIs(Collection<String> items);
    public List<String> getRedirectURIs();
    public String getRedirectURI(int index);
    public String getFirstRedirectURI();
    public String getLastRedirectURI();
    public String getMatchingRedirectURI(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withRedirectURIs(List<String> redirectURIs);
    public A withRedirectURIs(String... redirectURIs);
    public Boolean hasRedirectURIs();
    public Boolean isRespondWithChallenges();
    public A withRespondWithChallenges(Boolean respondWithChallenges);
    public Boolean hasRespondWithChallenges();
    public A withNewRespondWithChallenges(String arg1);
    public A withNewRespondWithChallenges(boolean arg1);
    public A addToScopeRestrictions(int index,ScopeRestriction item);
    public A setToScopeRestrictions(int index,ScopeRestriction item);
    public A addToScopeRestrictions(ScopeRestriction... items);
    public A addAllToScopeRestrictions(Collection<ScopeRestriction> items);
    public A removeFromScopeRestrictions(ScopeRestriction... items);
    public A removeAllFromScopeRestrictions(Collection<ScopeRestriction> items);
    
/**
 * This method has been deprecated, please use method buildScopeRestrictions instead.
 * @return The buildable object.
 */
@Deprecated public List<ScopeRestriction> getScopeRestrictions();
    public List<ScopeRestriction> buildScopeRestrictions();
    public ScopeRestriction buildScopeRestriction(int index);
    public ScopeRestriction buildFirstScopeRestriction();
    public ScopeRestriction buildLastScopeRestriction();
    public ScopeRestriction buildMatchingScopeRestriction(io.fabric8.kubernetes.api.builder.Predicate<ScopeRestrictionBuilder> predicate);
    public A withScopeRestrictions(List<ScopeRestriction> scopeRestrictions);
    public A withScopeRestrictions(ScopeRestriction... scopeRestrictions);
    public Boolean hasScopeRestrictions();
    public OAuthClientFluent.ScopeRestrictionsNested<A> addNewScopeRestriction();
    public OAuthClientFluent.ScopeRestrictionsNested<A> addNewScopeRestrictionLike(ScopeRestriction item);
    public OAuthClientFluent.ScopeRestrictionsNested<A> setNewScopeRestrictionLike(int index,ScopeRestriction item);
    public OAuthClientFluent.ScopeRestrictionsNested<A> editScopeRestriction(int index);
    public OAuthClientFluent.ScopeRestrictionsNested<A> editFirstScopeRestriction();
    public OAuthClientFluent.ScopeRestrictionsNested<A> editLastScopeRestriction();
    public OAuthClientFluent.ScopeRestrictionsNested<A> editMatchingScopeRestriction(io.fabric8.kubernetes.api.builder.Predicate<ScopeRestrictionBuilder> predicate);
    public String getSecret();
    public A withSecret(String secret);
    public Boolean hasSecret();

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<OAuthClientFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface ScopeRestrictionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ScopeRestrictionFluent<OAuthClientFluent.ScopeRestrictionsNested<N>>{

        
    public N and();    public N endScopeRestriction();
}


}
