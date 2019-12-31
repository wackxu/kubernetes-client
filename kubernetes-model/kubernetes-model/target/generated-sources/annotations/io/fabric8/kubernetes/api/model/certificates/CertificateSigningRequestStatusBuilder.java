package io.fabric8.kubernetes.api.model.certificates;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class CertificateSigningRequestStatusBuilder extends CertificateSigningRequestStatusFluentImpl<CertificateSigningRequestStatusBuilder> implements VisitableBuilder<CertificateSigningRequestStatus,CertificateSigningRequestStatusBuilder>{

    CertificateSigningRequestStatusFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public CertificateSigningRequestStatusBuilder(){
            this(true);
    }
    public CertificateSigningRequestStatusBuilder(Boolean validationEnabled){
            this(new CertificateSigningRequestStatus(), validationEnabled);
    }
    public CertificateSigningRequestStatusBuilder(CertificateSigningRequestStatusFluent<?> fluent){
            this(fluent, true);
    }
    public CertificateSigningRequestStatusBuilder(CertificateSigningRequestStatusFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new CertificateSigningRequestStatus(), validationEnabled);
    }
    public CertificateSigningRequestStatusBuilder(CertificateSigningRequestStatusFluent<?> fluent,CertificateSigningRequestStatus instance){
            this(fluent, instance, true);
    }
    public CertificateSigningRequestStatusBuilder(CertificateSigningRequestStatusFluent<?> fluent,CertificateSigningRequestStatus instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withCertificate(instance.getCertificate()); 
            fluent.withConditions(instance.getConditions()); 
            this.validationEnabled = validationEnabled; 
    }
    public CertificateSigningRequestStatusBuilder(CertificateSigningRequestStatus instance){
            this(instance,true);
    }
    public CertificateSigningRequestStatusBuilder(CertificateSigningRequestStatus instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withCertificate(instance.getCertificate()); 
            this.withConditions(instance.getConditions()); 
            this.validationEnabled = validationEnabled; 
    }
    public CertificateSigningRequestStatusBuilder(Validator validator){
            this(new CertificateSigningRequestStatus(), true);
    }
    public CertificateSigningRequestStatusBuilder(CertificateSigningRequestStatusFluent<?> fluent,CertificateSigningRequestStatus instance,Validator validator){
            this.fluent = fluent; 
            fluent.withCertificate(instance.getCertificate()); 
            fluent.withConditions(instance.getConditions()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public CertificateSigningRequestStatusBuilder(CertificateSigningRequestStatus instance,Validator validator){
            this.fluent = this; 
            this.withCertificate(instance.getCertificate()); 
            this.withConditions(instance.getConditions()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public CertificateSigningRequestStatus build(){
            CertificateSigningRequestStatus buildable = new CertificateSigningRequestStatus(fluent.getCertificate(),fluent.getConditions());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CertificateSigningRequestStatusBuilder that = (CertificateSigningRequestStatusBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
