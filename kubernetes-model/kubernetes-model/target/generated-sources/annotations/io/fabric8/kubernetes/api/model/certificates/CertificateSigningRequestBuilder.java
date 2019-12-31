package io.fabric8.kubernetes.api.model.certificates;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class CertificateSigningRequestBuilder extends CertificateSigningRequestFluentImpl<CertificateSigningRequestBuilder> implements VisitableBuilder<CertificateSigningRequest,CertificateSigningRequestBuilder>{

    CertificateSigningRequestFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public CertificateSigningRequestBuilder(){
            this(true);
    }
    public CertificateSigningRequestBuilder(Boolean validationEnabled){
            this(new CertificateSigningRequest(), validationEnabled);
    }
    public CertificateSigningRequestBuilder(CertificateSigningRequestFluent<?> fluent){
            this(fluent, true);
    }
    public CertificateSigningRequestBuilder(CertificateSigningRequestFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new CertificateSigningRequest(), validationEnabled);
    }
    public CertificateSigningRequestBuilder(CertificateSigningRequestFluent<?> fluent,CertificateSigningRequest instance){
            this(fluent, instance, true);
    }
    public CertificateSigningRequestBuilder(CertificateSigningRequestFluent<?> fluent,CertificateSigningRequest instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            fluent.withStatus(instance.getStatus()); 
            this.validationEnabled = validationEnabled; 
    }
    public CertificateSigningRequestBuilder(CertificateSigningRequest instance){
            this(instance,true);
    }
    public CertificateSigningRequestBuilder(CertificateSigningRequest instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.withStatus(instance.getStatus()); 
            this.validationEnabled = validationEnabled; 
    }
    public CertificateSigningRequestBuilder(Validator validator){
            this(new CertificateSigningRequest(), true);
    }
    public CertificateSigningRequestBuilder(CertificateSigningRequestFluent<?> fluent,CertificateSigningRequest instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            fluent.withStatus(instance.getStatus()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public CertificateSigningRequestBuilder(CertificateSigningRequest instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.withStatus(instance.getStatus()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public CertificateSigningRequest build(){
            CertificateSigningRequest buildable = new CertificateSigningRequest(fluent.getApiVersion(),fluent.getKind(),fluent.getMetadata(),fluent.getSpec(),fluent.getStatus());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CertificateSigningRequestBuilder that = (CertificateSigningRequestBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
