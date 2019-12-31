package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class OAuthAuthorizeTokenBuilder extends OAuthAuthorizeTokenFluentImpl<OAuthAuthorizeTokenBuilder> implements VisitableBuilder<OAuthAuthorizeToken,OAuthAuthorizeTokenBuilder>{

    OAuthAuthorizeTokenFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public OAuthAuthorizeTokenBuilder(){
            this(true);
    }
    public OAuthAuthorizeTokenBuilder(Boolean validationEnabled){
            this(new OAuthAuthorizeToken(), validationEnabled);
    }
    public OAuthAuthorizeTokenBuilder(OAuthAuthorizeTokenFluent<?> fluent){
            this(fluent, true);
    }
    public OAuthAuthorizeTokenBuilder(OAuthAuthorizeTokenFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new OAuthAuthorizeToken(), validationEnabled);
    }
    public OAuthAuthorizeTokenBuilder(OAuthAuthorizeTokenFluent<?> fluent,OAuthAuthorizeToken instance){
            this(fluent, instance, true);
    }
    public OAuthAuthorizeTokenBuilder(OAuthAuthorizeTokenFluent<?> fluent,OAuthAuthorizeToken instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withClientName(instance.getClientName()); 
            fluent.withCodeChallenge(instance.getCodeChallenge()); 
            fluent.withCodeChallengeMethod(instance.getCodeChallengeMethod()); 
            fluent.withExpiresIn(instance.getExpiresIn()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withRedirectURI(instance.getRedirectURI()); 
            fluent.withScopes(instance.getScopes()); 
            fluent.withState(instance.getState()); 
            fluent.withUserName(instance.getUserName()); 
            fluent.withUserUID(instance.getUserUID()); 
            this.validationEnabled = validationEnabled; 
    }
    public OAuthAuthorizeTokenBuilder(OAuthAuthorizeToken instance){
            this(instance,true);
    }
    public OAuthAuthorizeTokenBuilder(OAuthAuthorizeToken instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withClientName(instance.getClientName()); 
            this.withCodeChallenge(instance.getCodeChallenge()); 
            this.withCodeChallengeMethod(instance.getCodeChallengeMethod()); 
            this.withExpiresIn(instance.getExpiresIn()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withRedirectURI(instance.getRedirectURI()); 
            this.withScopes(instance.getScopes()); 
            this.withState(instance.getState()); 
            this.withUserName(instance.getUserName()); 
            this.withUserUID(instance.getUserUID()); 
            this.validationEnabled = validationEnabled; 
    }
    public OAuthAuthorizeTokenBuilder(Validator validator){
            this(new OAuthAuthorizeToken(), true);
    }
    public OAuthAuthorizeTokenBuilder(OAuthAuthorizeTokenFluent<?> fluent,OAuthAuthorizeToken instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withClientName(instance.getClientName()); 
            fluent.withCodeChallenge(instance.getCodeChallenge()); 
            fluent.withCodeChallengeMethod(instance.getCodeChallengeMethod()); 
            fluent.withExpiresIn(instance.getExpiresIn()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withRedirectURI(instance.getRedirectURI()); 
            fluent.withScopes(instance.getScopes()); 
            fluent.withState(instance.getState()); 
            fluent.withUserName(instance.getUserName()); 
            fluent.withUserUID(instance.getUserUID()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public OAuthAuthorizeTokenBuilder(OAuthAuthorizeToken instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withClientName(instance.getClientName()); 
            this.withCodeChallenge(instance.getCodeChallenge()); 
            this.withCodeChallengeMethod(instance.getCodeChallengeMethod()); 
            this.withExpiresIn(instance.getExpiresIn()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withRedirectURI(instance.getRedirectURI()); 
            this.withScopes(instance.getScopes()); 
            this.withState(instance.getState()); 
            this.withUserName(instance.getUserName()); 
            this.withUserUID(instance.getUserUID()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public OAuthAuthorizeToken build(){
            OAuthAuthorizeToken buildable = new OAuthAuthorizeToken(fluent.getApiVersion(),fluent.getClientName(),fluent.getCodeChallenge(),fluent.getCodeChallengeMethod(),fluent.getExpiresIn(),fluent.getKind(),fluent.getMetadata(),fluent.getRedirectURI(),fluent.getScopes(),fluent.getState(),fluent.getUserName(),fluent.getUserUID());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            OAuthAuthorizeTokenBuilder that = (OAuthAuthorizeTokenBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
