package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectMetaFluentImpl;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import java.lang.Integer;
import javax.validation.Valid;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;

public class OAuthAccessTokenFluentImpl<A extends OAuthAccessTokenFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements OAuthAccessTokenFluent<A>{

    private String apiVersion;
    private String authorizeToken;
    private String clientName;
    private Long expiresIn;
    private Integer inactivityTimeoutSeconds;
    private String kind;
    private ObjectMetaBuilder metadata;
    private String redirectURI;
    private String refreshToken;
    private List<String> scopes;
    private String userName;
    private String userUID;

    public OAuthAccessTokenFluentImpl(){
    }
    public OAuthAccessTokenFluentImpl(OAuthAccessToken instance){
            this.withApiVersion(instance.getApiVersion()); 
            this.withAuthorizeToken(instance.getAuthorizeToken()); 
            this.withClientName(instance.getClientName()); 
            this.withExpiresIn(instance.getExpiresIn()); 
            this.withInactivityTimeoutSeconds(instance.getInactivityTimeoutSeconds()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withRedirectURI(instance.getRedirectURI()); 
            this.withRefreshToken(instance.getRefreshToken()); 
            this.withScopes(instance.getScopes()); 
            this.withUserName(instance.getUserName()); 
            this.withUserUID(instance.getUserUID()); 
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

    public String getAuthorizeToken(){
            return this.authorizeToken;
    }

    public A withAuthorizeToken(String authorizeToken){
            this.authorizeToken=authorizeToken; return (A) this;
    }

    public Boolean hasAuthorizeToken(){
            return this.authorizeToken != null;
    }

    public String getClientName(){
            return this.clientName;
    }

    public A withClientName(String clientName){
            this.clientName=clientName; return (A) this;
    }

    public Boolean hasClientName(){
            return this.clientName != null;
    }

    public Long getExpiresIn(){
            return this.expiresIn;
    }

    public A withExpiresIn(Long expiresIn){
            this.expiresIn=expiresIn; return (A) this;
    }

    public Boolean hasExpiresIn(){
            return this.expiresIn != null;
    }

    public A withNewExpiresIn(String arg1){
            return (A)withExpiresIn(new Long(arg1));
    }

    public A withNewExpiresIn(long arg1){
            return (A)withExpiresIn(new Long(arg1));
    }

    public Integer getInactivityTimeoutSeconds(){
            return this.inactivityTimeoutSeconds;
    }

    public A withInactivityTimeoutSeconds(Integer inactivityTimeoutSeconds){
            this.inactivityTimeoutSeconds=inactivityTimeoutSeconds; return (A) this;
    }

    public Boolean hasInactivityTimeoutSeconds(){
            return this.inactivityTimeoutSeconds != null;
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

    public OAuthAccessTokenFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public OAuthAccessTokenFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public OAuthAccessTokenFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public OAuthAccessTokenFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public OAuthAccessTokenFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    public String getRedirectURI(){
            return this.redirectURI;
    }

    public A withRedirectURI(String redirectURI){
            this.redirectURI=redirectURI; return (A) this;
    }

    public Boolean hasRedirectURI(){
            return this.redirectURI != null;
    }

    public String getRefreshToken(){
            return this.refreshToken;
    }

    public A withRefreshToken(String refreshToken){
            this.refreshToken=refreshToken; return (A) this;
    }

    public Boolean hasRefreshToken(){
            return this.refreshToken != null;
    }

    public A addToScopes(int index,String item){
            if (this.scopes == null) {this.scopes = new ArrayList<String>();}
            this.scopes.add(index, item);
            return (A)this;
    }

    public A setToScopes(int index,String item){
            if (this.scopes == null) {this.scopes = new ArrayList<String>();}
            this.scopes.set(index, item); return (A)this;
    }

    public A addToScopes(String... items){
            if (this.scopes == null) {this.scopes = new ArrayList<String>();}
            for (String item : items) {this.scopes.add(item);} return (A)this;
    }

    public A addAllToScopes(Collection<String> items){
            if (this.scopes == null) {this.scopes = new ArrayList<String>();}
            for (String item : items) {this.scopes.add(item);} return (A)this;
    }

    public A removeFromScopes(String... items){
            for (String item : items) {if (this.scopes!= null){ this.scopes.remove(item);}} return (A)this;
    }

    public A removeAllFromScopes(Collection<String> items){
            for (String item : items) {if (this.scopes!= null){ this.scopes.remove(item);}} return (A)this;
    }

    public List<String> getScopes(){
            return this.scopes;
    }

    public String getScope(int index){
            return this.scopes.get(index);
    }

    public String getFirstScope(){
            return this.scopes.get(0);
    }

    public String getLastScope(){
            return this.scopes.get(scopes.size() - 1);
    }

    public String getMatchingScope(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: scopes) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withScopes(List<String> scopes){
            if (this.scopes != null) { _visitables.removeAll(this.scopes);}
            if (scopes != null) {this.scopes = new ArrayList<String>(); for (String item : scopes){this.addToScopes(item);}} else { this.scopes = new ArrayList<String>();} return (A) this;
    }

    public A withScopes(String... scopes){
            if (this.scopes != null) {this.scopes.clear();}
            if (scopes != null) {for (String item :scopes){ this.addToScopes(item);}} return (A) this;
    }

    public Boolean hasScopes(){
            return scopes != null && !scopes.isEmpty();
    }

    public String getUserName(){
            return this.userName;
    }

    public A withUserName(String userName){
            this.userName=userName; return (A) this;
    }

    public Boolean hasUserName(){
            return this.userName != null;
    }

    public String getUserUID(){
            return this.userUID;
    }

    public A withUserUID(String userUID){
            this.userUID=userUID; return (A) this;
    }

    public Boolean hasUserUID(){
            return this.userUID != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            OAuthAccessTokenFluentImpl that = (OAuthAccessTokenFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (authorizeToken != null ? !authorizeToken.equals(that.authorizeToken) :that.authorizeToken != null) return false;
            if (clientName != null ? !clientName.equals(that.clientName) :that.clientName != null) return false;
            if (expiresIn != null ? !expiresIn.equals(that.expiresIn) :that.expiresIn != null) return false;
            if (inactivityTimeoutSeconds != null ? !inactivityTimeoutSeconds.equals(that.inactivityTimeoutSeconds) :that.inactivityTimeoutSeconds != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (redirectURI != null ? !redirectURI.equals(that.redirectURI) :that.redirectURI != null) return false;
            if (refreshToken != null ? !refreshToken.equals(that.refreshToken) :that.refreshToken != null) return false;
            if (scopes != null ? !scopes.equals(that.scopes) :that.scopes != null) return false;
            if (userName != null ? !userName.equals(that.userName) :that.userName != null) return false;
            if (userUID != null ? !userUID.equals(that.userUID) :that.userUID != null) return false;
            return true;
    }


    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<OAuthAccessTokenFluent.MetadataNested<N>> implements OAuthAccessTokenFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) OAuthAccessTokenFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}


}
