package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class OAuthAccessTokenListBuilder extends OAuthAccessTokenListFluentImpl<OAuthAccessTokenListBuilder> implements VisitableBuilder<OAuthAccessTokenList,OAuthAccessTokenListBuilder>{

    OAuthAccessTokenListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public OAuthAccessTokenListBuilder(){
            this(true);
    }
    public OAuthAccessTokenListBuilder(Boolean validationEnabled){
            this(new OAuthAccessTokenList(), validationEnabled);
    }
    public OAuthAccessTokenListBuilder(OAuthAccessTokenListFluent<?> fluent){
            this(fluent, true);
    }
    public OAuthAccessTokenListBuilder(OAuthAccessTokenListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new OAuthAccessTokenList(), validationEnabled);
    }
    public OAuthAccessTokenListBuilder(OAuthAccessTokenListFluent<?> fluent,OAuthAccessTokenList instance){
            this(fluent, instance, true);
    }
    public OAuthAccessTokenListBuilder(OAuthAccessTokenListFluent<?> fluent,OAuthAccessTokenList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public OAuthAccessTokenListBuilder(OAuthAccessTokenList instance){
            this(instance,true);
    }
    public OAuthAccessTokenListBuilder(OAuthAccessTokenList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public OAuthAccessTokenListBuilder(Validator validator){
            this(new OAuthAccessTokenList(), true);
    }
    public OAuthAccessTokenListBuilder(OAuthAccessTokenListFluent<?> fluent,OAuthAccessTokenList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public OAuthAccessTokenListBuilder(OAuthAccessTokenList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public OAuthAccessTokenList build(){
            OAuthAccessTokenList buildable = new OAuthAccessTokenList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            OAuthAccessTokenListBuilder that = (OAuthAccessTokenListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
