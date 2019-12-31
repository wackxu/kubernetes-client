package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class OAuthClientAuthorizationBuilder extends OAuthClientAuthorizationFluentImpl<OAuthClientAuthorizationBuilder> implements VisitableBuilder<OAuthClientAuthorization,OAuthClientAuthorizationBuilder>{

    OAuthClientAuthorizationFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public OAuthClientAuthorizationBuilder(){
            this(true);
    }
    public OAuthClientAuthorizationBuilder(Boolean validationEnabled){
            this(new OAuthClientAuthorization(), validationEnabled);
    }
    public OAuthClientAuthorizationBuilder(OAuthClientAuthorizationFluent<?> fluent){
            this(fluent, true);
    }
    public OAuthClientAuthorizationBuilder(OAuthClientAuthorizationFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new OAuthClientAuthorization(), validationEnabled);
    }
    public OAuthClientAuthorizationBuilder(OAuthClientAuthorizationFluent<?> fluent,OAuthClientAuthorization instance){
            this(fluent, instance, true);
    }
    public OAuthClientAuthorizationBuilder(OAuthClientAuthorizationFluent<?> fluent,OAuthClientAuthorization instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withClientName(instance.getClientName()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withScopes(instance.getScopes()); 
            fluent.withUserName(instance.getUserName()); 
            fluent.withUserUID(instance.getUserUID()); 
            this.validationEnabled = validationEnabled; 
    }
    public OAuthClientAuthorizationBuilder(OAuthClientAuthorization instance){
            this(instance,true);
    }
    public OAuthClientAuthorizationBuilder(OAuthClientAuthorization instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withClientName(instance.getClientName()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withScopes(instance.getScopes()); 
            this.withUserName(instance.getUserName()); 
            this.withUserUID(instance.getUserUID()); 
            this.validationEnabled = validationEnabled; 
    }
    public OAuthClientAuthorizationBuilder(Validator validator){
            this(new OAuthClientAuthorization(), true);
    }
    public OAuthClientAuthorizationBuilder(OAuthClientAuthorizationFluent<?> fluent,OAuthClientAuthorization instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withClientName(instance.getClientName()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withScopes(instance.getScopes()); 
            fluent.withUserName(instance.getUserName()); 
            fluent.withUserUID(instance.getUserUID()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public OAuthClientAuthorizationBuilder(OAuthClientAuthorization instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withClientName(instance.getClientName()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withScopes(instance.getScopes()); 
            this.withUserName(instance.getUserName()); 
            this.withUserUID(instance.getUserUID()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public OAuthClientAuthorization build(){
            OAuthClientAuthorization buildable = new OAuthClientAuthorization(fluent.getApiVersion(),fluent.getClientName(),fluent.getKind(),fluent.getMetadata(),fluent.getScopes(),fluent.getUserName(),fluent.getUserUID());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            OAuthClientAuthorizationBuilder that = (OAuthClientAuthorizationBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
