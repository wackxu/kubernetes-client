package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class OAuthClientAuthorizationListBuilder extends OAuthClientAuthorizationListFluentImpl<OAuthClientAuthorizationListBuilder> implements VisitableBuilder<OAuthClientAuthorizationList,OAuthClientAuthorizationListBuilder>{

    OAuthClientAuthorizationListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public OAuthClientAuthorizationListBuilder(){
            this(true);
    }
    public OAuthClientAuthorizationListBuilder(Boolean validationEnabled){
            this(new OAuthClientAuthorizationList(), validationEnabled);
    }
    public OAuthClientAuthorizationListBuilder(OAuthClientAuthorizationListFluent<?> fluent){
            this(fluent, true);
    }
    public OAuthClientAuthorizationListBuilder(OAuthClientAuthorizationListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new OAuthClientAuthorizationList(), validationEnabled);
    }
    public OAuthClientAuthorizationListBuilder(OAuthClientAuthorizationListFluent<?> fluent,OAuthClientAuthorizationList instance){
            this(fluent, instance, true);
    }
    public OAuthClientAuthorizationListBuilder(OAuthClientAuthorizationListFluent<?> fluent,OAuthClientAuthorizationList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public OAuthClientAuthorizationListBuilder(OAuthClientAuthorizationList instance){
            this(instance,true);
    }
    public OAuthClientAuthorizationListBuilder(OAuthClientAuthorizationList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public OAuthClientAuthorizationListBuilder(Validator validator){
            this(new OAuthClientAuthorizationList(), true);
    }
    public OAuthClientAuthorizationListBuilder(OAuthClientAuthorizationListFluent<?> fluent,OAuthClientAuthorizationList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public OAuthClientAuthorizationListBuilder(OAuthClientAuthorizationList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public OAuthClientAuthorizationList build(){
            OAuthClientAuthorizationList buildable = new OAuthClientAuthorizationList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            OAuthClientAuthorizationListBuilder that = (OAuthClientAuthorizationListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
