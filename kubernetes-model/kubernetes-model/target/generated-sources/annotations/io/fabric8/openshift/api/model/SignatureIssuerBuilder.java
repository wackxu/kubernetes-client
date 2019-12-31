package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class SignatureIssuerBuilder extends SignatureIssuerFluentImpl<SignatureIssuerBuilder> implements VisitableBuilder<SignatureIssuer,SignatureIssuerBuilder>{

    SignatureIssuerFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public SignatureIssuerBuilder(){
            this(true);
    }
    public SignatureIssuerBuilder(Boolean validationEnabled){
            this(new SignatureIssuer(), validationEnabled);
    }
    public SignatureIssuerBuilder(SignatureIssuerFluent<?> fluent){
            this(fluent, true);
    }
    public SignatureIssuerBuilder(SignatureIssuerFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new SignatureIssuer(), validationEnabled);
    }
    public SignatureIssuerBuilder(SignatureIssuerFluent<?> fluent,SignatureIssuer instance){
            this(fluent, instance, true);
    }
    public SignatureIssuerBuilder(SignatureIssuerFluent<?> fluent,SignatureIssuer instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withCommonName(instance.getCommonName()); 
            fluent.withOrganization(instance.getOrganization()); 
            this.validationEnabled = validationEnabled; 
    }
    public SignatureIssuerBuilder(SignatureIssuer instance){
            this(instance,true);
    }
    public SignatureIssuerBuilder(SignatureIssuer instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withCommonName(instance.getCommonName()); 
            this.withOrganization(instance.getOrganization()); 
            this.validationEnabled = validationEnabled; 
    }
    public SignatureIssuerBuilder(Validator validator){
            this(new SignatureIssuer(), true);
    }
    public SignatureIssuerBuilder(SignatureIssuerFluent<?> fluent,SignatureIssuer instance,Validator validator){
            this.fluent = fluent; 
            fluent.withCommonName(instance.getCommonName()); 
            fluent.withOrganization(instance.getOrganization()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public SignatureIssuerBuilder(SignatureIssuer instance,Validator validator){
            this.fluent = this; 
            this.withCommonName(instance.getCommonName()); 
            this.withOrganization(instance.getOrganization()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public SignatureIssuer build(){
            SignatureIssuer buildable = new SignatureIssuer(fluent.getCommonName(),fluent.getOrganization());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SignatureIssuerBuilder that = (SignatureIssuerBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
