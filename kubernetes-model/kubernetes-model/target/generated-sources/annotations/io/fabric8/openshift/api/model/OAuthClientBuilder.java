package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class OAuthClientBuilder extends OAuthClientFluentImpl<OAuthClientBuilder> implements VisitableBuilder<OAuthClient,OAuthClientBuilder>{

    OAuthClientFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public OAuthClientBuilder(){
            this(true);
    }
    public OAuthClientBuilder(Boolean validationEnabled){
            this(new OAuthClient(), validationEnabled);
    }
    public OAuthClientBuilder(OAuthClientFluent<?> fluent){
            this(fluent, true);
    }
    public OAuthClientBuilder(OAuthClientFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new OAuthClient(), validationEnabled);
    }
    public OAuthClientBuilder(OAuthClientFluent<?> fluent,OAuthClient instance){
            this(fluent, instance, true);
    }
    public OAuthClientBuilder(OAuthClientFluent<?> fluent,OAuthClient instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAccessTokenInactivityTimeoutSeconds(instance.getAccessTokenInactivityTimeoutSeconds()); 
            fluent.withAccessTokenMaxAgeSeconds(instance.getAccessTokenMaxAgeSeconds()); 
            fluent.withAdditionalSecrets(instance.getAdditionalSecrets()); 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withGrantMethod(instance.getGrantMethod()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withRedirectURIs(instance.getRedirectURIs()); 
            fluent.withRespondWithChallenges(instance.getRespondWithChallenges()); 
            fluent.withScopeRestrictions(instance.getScopeRestrictions()); 
            fluent.withSecret(instance.getSecret()); 
            this.validationEnabled = validationEnabled; 
    }
    public OAuthClientBuilder(OAuthClient instance){
            this(instance,true);
    }
    public OAuthClientBuilder(OAuthClient instance,Boolean validationEnabled){
            this.fluent = this; 
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
            this.validationEnabled = validationEnabled; 
    }
    public OAuthClientBuilder(Validator validator){
            this(new OAuthClient(), true);
    }
    public OAuthClientBuilder(OAuthClientFluent<?> fluent,OAuthClient instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAccessTokenInactivityTimeoutSeconds(instance.getAccessTokenInactivityTimeoutSeconds()); 
            fluent.withAccessTokenMaxAgeSeconds(instance.getAccessTokenMaxAgeSeconds()); 
            fluent.withAdditionalSecrets(instance.getAdditionalSecrets()); 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withGrantMethod(instance.getGrantMethod()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withRedirectURIs(instance.getRedirectURIs()); 
            fluent.withRespondWithChallenges(instance.getRespondWithChallenges()); 
            fluent.withScopeRestrictions(instance.getScopeRestrictions()); 
            fluent.withSecret(instance.getSecret()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public OAuthClientBuilder(OAuthClient instance,Validator validator){
            this.fluent = this; 
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
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public OAuthClient build(){
            OAuthClient buildable = new OAuthClient(fluent.getAccessTokenInactivityTimeoutSeconds(),fluent.getAccessTokenMaxAgeSeconds(),fluent.getAdditionalSecrets(),fluent.getApiVersion(),fluent.getGrantMethod(),fluent.getKind(),fluent.getMetadata(),fluent.getRedirectURIs(),fluent.isRespondWithChallenges(),fluent.getScopeRestrictions(),fluent.getSecret());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            OAuthClientBuilder that = (OAuthClientBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
