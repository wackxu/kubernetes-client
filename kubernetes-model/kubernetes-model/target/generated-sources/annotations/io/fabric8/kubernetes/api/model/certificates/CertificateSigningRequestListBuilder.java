package io.fabric8.kubernetes.api.model.certificates;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class CertificateSigningRequestListBuilder extends CertificateSigningRequestListFluentImpl<CertificateSigningRequestListBuilder> implements VisitableBuilder<CertificateSigningRequestList,CertificateSigningRequestListBuilder>{

    CertificateSigningRequestListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public CertificateSigningRequestListBuilder(){
            this(true);
    }
    public CertificateSigningRequestListBuilder(Boolean validationEnabled){
            this(new CertificateSigningRequestList(), validationEnabled);
    }
    public CertificateSigningRequestListBuilder(CertificateSigningRequestListFluent<?> fluent){
            this(fluent, true);
    }
    public CertificateSigningRequestListBuilder(CertificateSigningRequestListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new CertificateSigningRequestList(), validationEnabled);
    }
    public CertificateSigningRequestListBuilder(CertificateSigningRequestListFluent<?> fluent,CertificateSigningRequestList instance){
            this(fluent, instance, true);
    }
    public CertificateSigningRequestListBuilder(CertificateSigningRequestListFluent<?> fluent,CertificateSigningRequestList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public CertificateSigningRequestListBuilder(CertificateSigningRequestList instance){
            this(instance,true);
    }
    public CertificateSigningRequestListBuilder(CertificateSigningRequestList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public CertificateSigningRequestListBuilder(Validator validator){
            this(new CertificateSigningRequestList(), true);
    }
    public CertificateSigningRequestListBuilder(CertificateSigningRequestListFluent<?> fluent,CertificateSigningRequestList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public CertificateSigningRequestListBuilder(CertificateSigningRequestList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public CertificateSigningRequestList build(){
            CertificateSigningRequestList buildable = new CertificateSigningRequestList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CertificateSigningRequestListBuilder that = (CertificateSigningRequestListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
