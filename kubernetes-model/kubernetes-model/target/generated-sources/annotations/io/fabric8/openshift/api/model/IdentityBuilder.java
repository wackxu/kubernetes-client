package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class IdentityBuilder extends IdentityFluentImpl<IdentityBuilder> implements VisitableBuilder<Identity,IdentityBuilder>{

    IdentityFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public IdentityBuilder(){
            this(true);
    }
    public IdentityBuilder(Boolean validationEnabled){
            this(new Identity(), validationEnabled);
    }
    public IdentityBuilder(IdentityFluent<?> fluent){
            this(fluent, true);
    }
    public IdentityBuilder(IdentityFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new Identity(), validationEnabled);
    }
    public IdentityBuilder(IdentityFluent<?> fluent,Identity instance){
            this(fluent, instance, true);
    }
    public IdentityBuilder(IdentityFluent<?> fluent,Identity instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withExtra(instance.getExtra()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withProviderName(instance.getProviderName()); 
            fluent.withProviderUserName(instance.getProviderUserName()); 
            fluent.withUser(instance.getUser()); 
            this.validationEnabled = validationEnabled; 
    }
    public IdentityBuilder(Identity instance){
            this(instance,true);
    }
    public IdentityBuilder(Identity instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withExtra(instance.getExtra()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withProviderName(instance.getProviderName()); 
            this.withProviderUserName(instance.getProviderUserName()); 
            this.withUser(instance.getUser()); 
            this.validationEnabled = validationEnabled; 
    }
    public IdentityBuilder(Validator validator){
            this(new Identity(), true);
    }
    public IdentityBuilder(IdentityFluent<?> fluent,Identity instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withExtra(instance.getExtra()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withProviderName(instance.getProviderName()); 
            fluent.withProviderUserName(instance.getProviderUserName()); 
            fluent.withUser(instance.getUser()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public IdentityBuilder(Identity instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withExtra(instance.getExtra()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withProviderName(instance.getProviderName()); 
            this.withProviderUserName(instance.getProviderUserName()); 
            this.withUser(instance.getUser()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public Identity build(){
            Identity buildable = new Identity(fluent.getApiVersion(),fluent.getExtra(),fluent.getKind(),fluent.getMetadata(),fluent.getProviderName(),fluent.getProviderUserName(),fluent.getUser());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            IdentityBuilder that = (IdentityBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
