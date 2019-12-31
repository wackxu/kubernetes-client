package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.model.ObjectMeta;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Integer;
import io.fabric8.kubernetes.api.model.ObjectMetaFluent;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface OAuthAccessTokenFluent<A extends OAuthAccessTokenFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public String getAuthorizeToken();
    public A withAuthorizeToken(String authorizeToken);
    public Boolean hasAuthorizeToken();
    public String getClientName();
    public A withClientName(String clientName);
    public Boolean hasClientName();
    public Long getExpiresIn();
    public A withExpiresIn(Long expiresIn);
    public Boolean hasExpiresIn();
    public A withNewExpiresIn(String arg1);
    public A withNewExpiresIn(long arg1);
    public Integer getInactivityTimeoutSeconds();
    public A withInactivityTimeoutSeconds(Integer inactivityTimeoutSeconds);
    public Boolean hasInactivityTimeoutSeconds();
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
    public OAuthAccessTokenFluent.MetadataNested<A> withNewMetadata();
    public OAuthAccessTokenFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public OAuthAccessTokenFluent.MetadataNested<A> editMetadata();
    public OAuthAccessTokenFluent.MetadataNested<A> editOrNewMetadata();
    public OAuthAccessTokenFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    public String getRedirectURI();
    public A withRedirectURI(String redirectURI);
    public Boolean hasRedirectURI();
    public String getRefreshToken();
    public A withRefreshToken(String refreshToken);
    public Boolean hasRefreshToken();
    public A addToScopes(int index,String item);
    public A setToScopes(int index,String item);
    public A addToScopes(String... items);
    public A addAllToScopes(Collection<String> items);
    public A removeFromScopes(String... items);
    public A removeAllFromScopes(Collection<String> items);
    public List<String> getScopes();
    public String getScope(int index);
    public String getFirstScope();
    public String getLastScope();
    public String getMatchingScope(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withScopes(List<String> scopes);
    public A withScopes(String... scopes);
    public Boolean hasScopes();
    public String getUserName();
    public A withUserName(String userName);
    public Boolean hasUserName();
    public String getUserUID();
    public A withUserUID(String userUID);
    public Boolean hasUserUID();

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<OAuthAccessTokenFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
