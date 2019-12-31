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
import java.util.Collection;
import java.lang.Object;

public class OAuthClientFluentImpl<A extends OAuthClientFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements OAuthClientFluent<A>{

    private Integer accessTokenInactivityTimeoutSeconds;
    private Integer accessTokenMaxAgeSeconds;
    private List<String> additionalSecrets;
    private String apiVersion;
    private String grantMethod;
    private String kind;
    private ObjectMetaBuilder metadata;
    private List<String> redirectURIs;
    private Boolean respondWithChallenges;
    private List<ScopeRestrictionBuilder> scopeRestrictions;
    private String secret;

    public OAuthClientFluentImpl(){
    }
    public OAuthClientFluentImpl(OAuthClient instance){
            this.withAccessTokenInactivityTimeoutSeconds(instance.getAccessTokenInactivityTimeoutSeconds()); 
            this.withAccessTokenMaxAgeSeconds(instance.getAccessTokenMaxAgeSeconds()); 
            this.withAdditionalSecrets(instance.getAdditionalSecrets()); 
            this.withApiVersion(instance.getApiVersion()); 
            this.withGrantMethod(instance.getGrantMethod()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withRedirectURIs(instance.getRedirectURIs()); 
            this.withRespondWithChallenges(instance.getRespondWithChallenges()); 
            this.withScopeRestrictions(instance.getScopeRestrictions()); 
            this.withSecret(instance.getSecret()); 
    }

    public Integer getAccessTokenInactivityTimeoutSeconds(){
            return this.accessTokenInactivityTimeoutSeconds;
    }

    public A withAccessTokenInactivityTimeoutSeconds(Integer accessTokenInactivityTimeoutSeconds){
            this.accessTokenInactivityTimeoutSeconds=accessTokenInactivityTimeoutSeconds; return (A) this;
    }

    public Boolean hasAccessTokenInactivityTimeoutSeconds(){
            return this.accessTokenInactivityTimeoutSeconds != null;
    }

    public Integer getAccessTokenMaxAgeSeconds(){
            return this.accessTokenMaxAgeSeconds;
    }

    public A withAccessTokenMaxAgeSeconds(Integer accessTokenMaxAgeSeconds){
            this.accessTokenMaxAgeSeconds=accessTokenMaxAgeSeconds; return (A) this;
    }

    public Boolean hasAccessTokenMaxAgeSeconds(){
            return this.accessTokenMaxAgeSeconds != null;
    }

    public A addToAdditionalSecrets(int index,String item){
            if (this.additionalSecrets == null) {this.additionalSecrets = new ArrayList<String>();}
            this.additionalSecrets.add(index, item);
            return (A)this;
    }

    public A setToAdditionalSecrets(int index,String item){
            if (this.additionalSecrets == null) {this.additionalSecrets = new ArrayList<String>();}
            this.additionalSecrets.set(index, item); return (A)this;
    }

    public A addToAdditionalSecrets(String... items){
            if (this.additionalSecrets == null) {this.additionalSecrets = new ArrayList<String>();}
            for (String item : items) {this.additionalSecrets.add(item);} return (A)this;
    }

    public A addAllToAdditionalSecrets(Collection<String> items){
            if (this.additionalSecrets == null) {this.additionalSecrets = new ArrayList<String>();}
            for (String item : items) {this.additionalSecrets.add(item);} return (A)this;
    }

    public A removeFromAdditionalSecrets(String... items){
            for (String item : items) {if (this.additionalSecrets!= null){ this.additionalSecrets.remove(item);}} return (A)this;
    }

    public A removeAllFromAdditionalSecrets(Collection<String> items){
            for (String item : items) {if (this.additionalSecrets!= null){ this.additionalSecrets.remove(item);}} return (A)this;
    }

    public List<String> getAdditionalSecrets(){
            return this.additionalSecrets;
    }

    public String getAdditionalSecret(int index){
            return this.additionalSecrets.get(index);
    }

    public String getFirstAdditionalSecret(){
            return this.additionalSecrets.get(0);
    }

    public String getLastAdditionalSecret(){
            return this.additionalSecrets.get(additionalSecrets.size() - 1);
    }

    public String getMatchingAdditionalSecret(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: additionalSecrets) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withAdditionalSecrets(List<String> additionalSecrets){
            if (this.additionalSecrets != null) { _visitables.removeAll(this.additionalSecrets);}
            if (additionalSecrets != null) {this.additionalSecrets = new ArrayList<String>(); for (String item : additionalSecrets){this.addToAdditionalSecrets(item);}} else { this.additionalSecrets = new ArrayList<String>();} return (A) this;
    }

    public A withAdditionalSecrets(String... additionalSecrets){
            if (this.additionalSecrets != null) {this.additionalSecrets.clear();}
            if (additionalSecrets != null) {for (String item :additionalSecrets){ this.addToAdditionalSecrets(item);}} return (A) this;
    }

    public Boolean hasAdditionalSecrets(){
            return additionalSecrets != null && !additionalSecrets.isEmpty();
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

    public String getGrantMethod(){
            return this.grantMethod;
    }

    public A withGrantMethod(String grantMethod){
            this.grantMethod=grantMethod; return (A) this;
    }

    public Boolean hasGrantMethod(){
            return this.grantMethod != null;
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

    public OAuthClientFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public OAuthClientFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public OAuthClientFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public OAuthClientFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public OAuthClientFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    public A addToRedirectURIs(int index,String item){
            if (this.redirectURIs == null) {this.redirectURIs = new ArrayList<String>();}
            this.redirectURIs.add(index, item);
            return (A)this;
    }

    public A setToRedirectURIs(int index,String item){
            if (this.redirectURIs == null) {this.redirectURIs = new ArrayList<String>();}
            this.redirectURIs.set(index, item); return (A)this;
    }

    public A addToRedirectURIs(String... items){
            if (this.redirectURIs == null) {this.redirectURIs = new ArrayList<String>();}
            for (String item : items) {this.redirectURIs.add(item);} return (A)this;
    }

    public A addAllToRedirectURIs(Collection<String> items){
            if (this.redirectURIs == null) {this.redirectURIs = new ArrayList<String>();}
            for (String item : items) {this.redirectURIs.add(item);} return (A)this;
    }

    public A removeFromRedirectURIs(String... items){
            for (String item : items) {if (this.redirectURIs!= null){ this.redirectURIs.remove(item);}} return (A)this;
    }

    public A removeAllFromRedirectURIs(Collection<String> items){
            for (String item : items) {if (this.redirectURIs!= null){ this.redirectURIs.remove(item);}} return (A)this;
    }

    public List<String> getRedirectURIs(){
            return this.redirectURIs;
    }

    public String getRedirectURI(int index){
            return this.redirectURIs.get(index);
    }

    public String getFirstRedirectURI(){
            return this.redirectURIs.get(0);
    }

    public String getLastRedirectURI(){
            return this.redirectURIs.get(redirectURIs.size() - 1);
    }

    public String getMatchingRedirectURI(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: redirectURIs) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withRedirectURIs(List<String> redirectURIs){
            if (this.redirectURIs != null) { _visitables.removeAll(this.redirectURIs);}
            if (redirectURIs != null) {this.redirectURIs = new ArrayList<String>(); for (String item : redirectURIs){this.addToRedirectURIs(item);}} else { this.redirectURIs = new ArrayList<String>();} return (A) this;
    }

    public A withRedirectURIs(String... redirectURIs){
            if (this.redirectURIs != null) {this.redirectURIs.clear();}
            if (redirectURIs != null) {for (String item :redirectURIs){ this.addToRedirectURIs(item);}} return (A) this;
    }

    public Boolean hasRedirectURIs(){
            return redirectURIs != null && !redirectURIs.isEmpty();
    }

    public Boolean isRespondWithChallenges(){
            return this.respondWithChallenges;
    }

    public A withRespondWithChallenges(Boolean respondWithChallenges){
            this.respondWithChallenges=respondWithChallenges; return (A) this;
    }

    public Boolean hasRespondWithChallenges(){
            return this.respondWithChallenges != null;
    }

    public A withNewRespondWithChallenges(String arg1){
            return (A)withRespondWithChallenges(new Boolean(arg1));
    }

    public A withNewRespondWithChallenges(boolean arg1){
            return (A)withRespondWithChallenges(new Boolean(arg1));
    }

    public A addToScopeRestrictions(int index,ScopeRestriction item){
            if (this.scopeRestrictions == null) {this.scopeRestrictions = new ArrayList<ScopeRestrictionBuilder>();}
            ScopeRestrictionBuilder builder = new ScopeRestrictionBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.scopeRestrictions.add(index >= 0 ? index : scopeRestrictions.size(), builder); return (A)this;
    }

    public A setToScopeRestrictions(int index,ScopeRestriction item){
            if (this.scopeRestrictions == null) {this.scopeRestrictions = new ArrayList<ScopeRestrictionBuilder>();}
            ScopeRestrictionBuilder builder = new ScopeRestrictionBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= scopeRestrictions.size()) { scopeRestrictions.add(builder); } else { scopeRestrictions.set(index, builder);}
             return (A)this;
    }

    public A addToScopeRestrictions(ScopeRestriction... items){
            if (this.scopeRestrictions == null) {this.scopeRestrictions = new ArrayList<ScopeRestrictionBuilder>();}
            for (ScopeRestriction item : items) {ScopeRestrictionBuilder builder = new ScopeRestrictionBuilder(item);_visitables.add(builder);this.scopeRestrictions.add(builder);} return (A)this;
    }

    public A addAllToScopeRestrictions(Collection<ScopeRestriction> items){
            if (this.scopeRestrictions == null) {this.scopeRestrictions = new ArrayList<ScopeRestrictionBuilder>();}
            for (ScopeRestriction item : items) {ScopeRestrictionBuilder builder = new ScopeRestrictionBuilder(item);_visitables.add(builder);this.scopeRestrictions.add(builder);} return (A)this;
    }

    public A removeFromScopeRestrictions(ScopeRestriction... items){
            for (ScopeRestriction item : items) {ScopeRestrictionBuilder builder = new ScopeRestrictionBuilder(item);_visitables.remove(builder);if (this.scopeRestrictions != null) {this.scopeRestrictions.remove(builder);}} return (A)this;
    }

    public A removeAllFromScopeRestrictions(Collection<ScopeRestriction> items){
            for (ScopeRestriction item : items) {ScopeRestrictionBuilder builder = new ScopeRestrictionBuilder(item);_visitables.remove(builder);if (this.scopeRestrictions != null) {this.scopeRestrictions.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildScopeRestrictions instead.
 * @return The buildable object.
 */
@Deprecated public List<ScopeRestriction> getScopeRestrictions(){
            return build(scopeRestrictions);
    }

    public List<ScopeRestriction> buildScopeRestrictions(){
            return build(scopeRestrictions);
    }

    public ScopeRestriction buildScopeRestriction(int index){
            return this.scopeRestrictions.get(index).build();
    }

    public ScopeRestriction buildFirstScopeRestriction(){
            return this.scopeRestrictions.get(0).build();
    }

    public ScopeRestriction buildLastScopeRestriction(){
            return this.scopeRestrictions.get(scopeRestrictions.size() - 1).build();
    }

    public ScopeRestriction buildMatchingScopeRestriction(io.fabric8.kubernetes.api.builder.Predicate<ScopeRestrictionBuilder> predicate){
            for (ScopeRestrictionBuilder item: scopeRestrictions) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withScopeRestrictions(List<ScopeRestriction> scopeRestrictions){
            if (this.scopeRestrictions != null) { _visitables.removeAll(this.scopeRestrictions);}
            if (scopeRestrictions != null) {this.scopeRestrictions = new ArrayList<ScopeRestrictionBuilder>(); for (ScopeRestriction item : scopeRestrictions){this.addToScopeRestrictions(item);}} else { this.scopeRestrictions = new ArrayList<ScopeRestrictionBuilder>();} return (A) this;
    }

    public A withScopeRestrictions(ScopeRestriction... scopeRestrictions){
            if (this.scopeRestrictions != null) {this.scopeRestrictions.clear();}
            if (scopeRestrictions != null) {for (ScopeRestriction item :scopeRestrictions){ this.addToScopeRestrictions(item);}} return (A) this;
    }

    public Boolean hasScopeRestrictions(){
            return scopeRestrictions != null && !scopeRestrictions.isEmpty();
    }

    public OAuthClientFluent.ScopeRestrictionsNested<A> addNewScopeRestriction(){
            return new ScopeRestrictionsNestedImpl();
    }

    public OAuthClientFluent.ScopeRestrictionsNested<A> addNewScopeRestrictionLike(ScopeRestriction item){
            return new ScopeRestrictionsNestedImpl(-1, item);
    }

    public OAuthClientFluent.ScopeRestrictionsNested<A> setNewScopeRestrictionLike(int index,ScopeRestriction item){
            return new ScopeRestrictionsNestedImpl(index, item);
    }

    public OAuthClientFluent.ScopeRestrictionsNested<A> editScopeRestriction(int index){
            if (scopeRestrictions.size() <= index) throw new RuntimeException("Can't edit scopeRestrictions. Index exceeds size.");
            return setNewScopeRestrictionLike(index, buildScopeRestriction(index));
    }

    public OAuthClientFluent.ScopeRestrictionsNested<A> editFirstScopeRestriction(){
            if (scopeRestrictions.size() == 0) throw new RuntimeException("Can't edit first scopeRestrictions. The list is empty.");
            return setNewScopeRestrictionLike(0, buildScopeRestriction(0));
    }

    public OAuthClientFluent.ScopeRestrictionsNested<A> editLastScopeRestriction(){
            int index = scopeRestrictions.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last scopeRestrictions. The list is empty.");
            return setNewScopeRestrictionLike(index, buildScopeRestriction(index));
    }

    public OAuthClientFluent.ScopeRestrictionsNested<A> editMatchingScopeRestriction(io.fabric8.kubernetes.api.builder.Predicate<ScopeRestrictionBuilder> predicate){
            int index = -1;
            for (int i=0;i<scopeRestrictions.size();i++) { 
            if (predicate.apply(scopeRestrictions.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching scopeRestrictions. No match found.");
            return setNewScopeRestrictionLike(index, buildScopeRestriction(index));
    }

    public String getSecret(){
            return this.secret;
    }

    public A withSecret(String secret){
            this.secret=secret; return (A) this;
    }

    public Boolean hasSecret(){
            return this.secret != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            OAuthClientFluentImpl that = (OAuthClientFluentImpl) o;
            if (accessTokenInactivityTimeoutSeconds != null ? !accessTokenInactivityTimeoutSeconds.equals(that.accessTokenInactivityTimeoutSeconds) :that.accessTokenInactivityTimeoutSeconds != null) return false;
            if (accessTokenMaxAgeSeconds != null ? !accessTokenMaxAgeSeconds.equals(that.accessTokenMaxAgeSeconds) :that.accessTokenMaxAgeSeconds != null) return false;
            if (additionalSecrets != null ? !additionalSecrets.equals(that.additionalSecrets) :that.additionalSecrets != null) return false;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (grantMethod != null ? !grantMethod.equals(that.grantMethod) :that.grantMethod != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (redirectURIs != null ? !redirectURIs.equals(that.redirectURIs) :that.redirectURIs != null) return false;
            if (respondWithChallenges != null ? !respondWithChallenges.equals(that.respondWithChallenges) :that.respondWithChallenges != null) return false;
            if (scopeRestrictions != null ? !scopeRestrictions.equals(that.scopeRestrictions) :that.scopeRestrictions != null) return false;
            if (secret != null ? !secret.equals(that.secret) :that.secret != null) return false;
            return true;
    }


    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<OAuthClientFluent.MetadataNested<N>> implements OAuthClientFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) OAuthClientFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}
    public class ScopeRestrictionsNestedImpl<N> extends ScopeRestrictionFluentImpl<OAuthClientFluent.ScopeRestrictionsNested<N>> implements OAuthClientFluent.ScopeRestrictionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ScopeRestrictionBuilder builder;
        private final int index;
    
            ScopeRestrictionsNestedImpl(int index,ScopeRestriction item){
                    this.index = index;
                    this.builder = new ScopeRestrictionBuilder(this, item);
            }
            ScopeRestrictionsNestedImpl(){
                    this.index = -1;
                    this.builder = new ScopeRestrictionBuilder(this);
            }
    
    public N and(){
            return (N) OAuthClientFluentImpl.this.setToScopeRestrictions(index, builder.build());
    }
    public N endScopeRestriction(){
            return and();
    }

}


}
