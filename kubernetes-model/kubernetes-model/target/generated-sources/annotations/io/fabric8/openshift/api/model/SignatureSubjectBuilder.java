package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class SignatureSubjectBuilder extends SignatureSubjectFluentImpl<SignatureSubjectBuilder> implements VisitableBuilder<SignatureSubject,SignatureSubjectBuilder>{

    SignatureSubjectFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public SignatureSubjectBuilder(){
            this(true);
    }
    public SignatureSubjectBuilder(Boolean validationEnabled){
            this(new SignatureSubject(), validationEnabled);
    }
    public SignatureSubjectBuilder(SignatureSubjectFluent<?> fluent){
            this(fluent, true);
    }
    public SignatureSubjectBuilder(SignatureSubjectFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new SignatureSubject(), validationEnabled);
    }
    public SignatureSubjectBuilder(SignatureSubjectFluent<?> fluent,SignatureSubject instance){
            this(fluent, instance, true);
    }
    public SignatureSubjectBuilder(SignatureSubjectFluent<?> fluent,SignatureSubject instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withCommonName(instance.getCommonName()); 
            fluent.withOrganization(instance.getOrganization()); 
            fluent.withPublicKeyID(instance.getPublicKeyID()); 
            this.validationEnabled = validationEnabled; 
    }
    public SignatureSubjectBuilder(SignatureSubject instance){
            this(instance,true);
    }
    public SignatureSubjectBuilder(SignatureSubject instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withCommonName(instance.getCommonName()); 
            this.withOrganization(instance.getOrganization()); 
            this.withPublicKeyID(instance.getPublicKeyID()); 
            this.validationEnabled = validationEnabled; 
    }
    public SignatureSubjectBuilder(Validator validator){
            this(new SignatureSubject(), true);
    }
    public SignatureSubjectBuilder(SignatureSubjectFluent<?> fluent,SignatureSubject instance,Validator validator){
            this.fluent = fluent; 
            fluent.withCommonName(instance.getCommonName()); 
            fluent.withOrganization(instance.getOrganization()); 
            fluent.withPublicKeyID(instance.getPublicKeyID()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public SignatureSubjectBuilder(SignatureSubject instance,Validator validator){
            this.fluent = this; 
            this.withCommonName(instance.getCommonName()); 
            this.withOrganization(instance.getOrganization()); 
            this.withPublicKeyID(instance.getPublicKeyID()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public SignatureSubject build(){
            SignatureSubject buildable = new SignatureSubject(fluent.getCommonName(),fluent.getOrganization(),fluent.getPublicKeyID());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SignatureSubjectBuilder that = (SignatureSubjectBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
