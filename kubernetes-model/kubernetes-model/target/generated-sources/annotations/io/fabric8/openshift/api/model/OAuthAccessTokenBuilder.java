package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class OAuthAccessTokenBuilder extends OAuthAccessTokenFluentImpl<OAuthAccessTokenBuilder> implements VisitableBuilder<OAuthAccessToken,OAuthAccessTokenBuilder>{

    OAuthAccessTokenFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public OAuthAccessTokenBuilder(){
            this(true);
    }
    public OAuthAccessTokenBuilder(Boolean validationEnabled){
            this(new OAuthAccessToken(), validationEnabled);
    }
    public OAuthAccessTokenBuilder(OAuthAccessTokenFluent<?> fluent){
            this(fluent, true);
    }
    public OAuthAccessTokenBuilder(OAuthAccessTokenFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new OAuthAccessToken(), validationEnabled);
    }
    public OAuthAccessTokenBuilder(OAuthAccessTokenFluent<?> fluent,OAuthAccessToken instance){
            this(fluent, instance, true);
    }
    public OAuthAccessTokenBuilder(OAuthAccessTokenFluent<?> fluent,OAuthAccessToken instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withAuthorizeToken(instance.getAuthorizeToken()); 
            fluent.withClientName(instance.getClientName()); 
            fluent.withExpiresIn(instance.getExpiresIn()); 
            fluent.withInactivityTimeoutSeconds(instance.getInactivityTimeoutSeconds()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withRedirectURI(instance.getRedirectURI()); 
            fluent.withRefreshToken(instance.getRefreshToken()); 
            fluent.withScopes(instance.getScopes()); 
            fluent.withUserName(instance.getUserName()); 
            fluent.withUserUID(instance.getUserUID()); 
            this.validationEnabled = validationEnabled; 
    }
    public OAuthAccessTokenBuilder(OAuthAccessToken instance){
            this(instance,true);
    }
    public OAuthAccessTokenBuilder(OAuthAccessToken instance,Boolean validationEnabled){
            this.fluent = this; 
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
            this.validationEnabled = validationEnabled; 
    }
    public OAuthAccessTokenBuilder(Validator validator){
            this(new OAuthAccessToken(), true);
    }
    public OAuthAccessTokenBuilder(OAuthAccessTokenFluent<?> fluent,OAuthAccessToken instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withAuthorizeToken(instance.getAuthorizeToken()); 
            fluent.withClientName(instance.getClientName()); 
            fluent.withExpiresIn(instance.getExpiresIn()); 
            fluent.withInactivityTimeoutSeconds(instance.getInactivityTimeoutSeconds()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withRedirectURI(instance.getRedirectURI()); 
            fluent.withRefreshToken(instance.getRefreshToken()); 
            fluent.withScopes(instance.getScopes()); 
            fluent.withUserName(instance.getUserName()); 
            fluent.withUserUID(instance.getUserUID()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public OAuthAccessTokenBuilder(OAuthAccessToken instance,Validator validator){
            this.fluent = this; 
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
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public OAuthAccessToken build(){
            OAuthAccessToken buildable = new OAuthAccessToken(fluent.getApiVersion(),fluent.getAuthorizeToken(),fluent.getClientName(),fluent.getExpiresIn(),fluent.getInactivityTimeoutSeconds(),fluent.getKind(),fluent.getMetadata(),fluent.getRedirectURI(),fluent.getRefreshToken(),fluent.getScopes(),fluent.getUserName(),fluent.getUserUID());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            OAuthAccessTokenBuilder that = (OAuthAccessTokenBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
