package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class OAuthClientListBuilder extends OAuthClientListFluentImpl<OAuthClientListBuilder> implements VisitableBuilder<OAuthClientList,OAuthClientListBuilder>{

    OAuthClientListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public OAuthClientListBuilder(){
            this(true);
    }
    public OAuthClientListBuilder(Boolean validationEnabled){
            this(new OAuthClientList(), validationEnabled);
    }
    public OAuthClientListBuilder(OAuthClientListFluent<?> fluent){
            this(fluent, true);
    }
    public OAuthClientListBuilder(OAuthClientListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new OAuthClientList(), validationEnabled);
    }
    public OAuthClientListBuilder(OAuthClientListFluent<?> fluent,OAuthClientList instance){
            this(fluent, instance, true);
    }
    public OAuthClientListBuilder(OAuthClientListFluent<?> fluent,OAuthClientList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public OAuthClientListBuilder(OAuthClientList instance){
            this(instance,true);
    }
    public OAuthClientListBuilder(OAuthClientList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public OAuthClientListBuilder(Validator validator){
            this(new OAuthClientList(), true);
    }
    public OAuthClientListBuilder(OAuthClientListFluent<?> fluent,OAuthClientList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public OAuthClientListBuilder(OAuthClientList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public OAuthClientList build(){
            OAuthClientList buildable = new OAuthClientList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            OAuthClientListBuilder that = (OAuthClientListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
