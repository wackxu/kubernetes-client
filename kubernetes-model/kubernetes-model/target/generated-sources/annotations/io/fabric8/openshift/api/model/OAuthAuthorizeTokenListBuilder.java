package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class OAuthAuthorizeTokenListBuilder extends OAuthAuthorizeTokenListFluentImpl<OAuthAuthorizeTokenListBuilder> implements VisitableBuilder<OAuthAuthorizeTokenList,OAuthAuthorizeTokenListBuilder>{

    OAuthAuthorizeTokenListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public OAuthAuthorizeTokenListBuilder(){
            this(true);
    }
    public OAuthAuthorizeTokenListBuilder(Boolean validationEnabled){
            this(new OAuthAuthorizeTokenList(), validationEnabled);
    }
    public OAuthAuthorizeTokenListBuilder(OAuthAuthorizeTokenListFluent<?> fluent){
            this(fluent, true);
    }
    public OAuthAuthorizeTokenListBuilder(OAuthAuthorizeTokenListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new OAuthAuthorizeTokenList(), validationEnabled);
    }
    public OAuthAuthorizeTokenListBuilder(OAuthAuthorizeTokenListFluent<?> fluent,OAuthAuthorizeTokenList instance){
            this(fluent, instance, true);
    }
    public OAuthAuthorizeTokenListBuilder(OAuthAuthorizeTokenListFluent<?> fluent,OAuthAuthorizeTokenList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public OAuthAuthorizeTokenListBuilder(OAuthAuthorizeTokenList instance){
            this(instance,true);
    }
    public OAuthAuthorizeTokenListBuilder(OAuthAuthorizeTokenList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public OAuthAuthorizeTokenListBuilder(Validator validator){
            this(new OAuthAuthorizeTokenList(), true);
    }
    public OAuthAuthorizeTokenListBuilder(OAuthAuthorizeTokenListFluent<?> fluent,OAuthAuthorizeTokenList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public OAuthAuthorizeTokenListBuilder(OAuthAuthorizeTokenList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public OAuthAuthorizeTokenList build(){
            OAuthAuthorizeTokenList buildable = new OAuthAuthorizeTokenList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            OAuthAuthorizeTokenListBuilder that = (OAuthAuthorizeTokenListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
