package io.fabric8.kubernetes.api.model.certificates;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class CertificateSigningRequestSpecBuilder extends CertificateSigningRequestSpecFluentImpl<CertificateSigningRequestSpecBuilder> implements VisitableBuilder<CertificateSigningRequestSpec,CertificateSigningRequestSpecBuilder>{

    CertificateSigningRequestSpecFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public CertificateSigningRequestSpecBuilder(){
            this(true);
    }
    public CertificateSigningRequestSpecBuilder(Boolean validationEnabled){
            this(new CertificateSigningRequestSpec(), validationEnabled);
    }
    public CertificateSigningRequestSpecBuilder(CertificateSigningRequestSpecFluent<?> fluent){
            this(fluent, true);
    }
    public CertificateSigningRequestSpecBuilder(CertificateSigningRequestSpecFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new CertificateSigningRequestSpec(), validationEnabled);
    }
    public CertificateSigningRequestSpecBuilder(CertificateSigningRequestSpecFluent<?> fluent,CertificateSigningRequestSpec instance){
            this(fluent, instance, true);
    }
    public CertificateSigningRequestSpecBuilder(CertificateSigningRequestSpecFluent<?> fluent,CertificateSigningRequestSpec instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withExtra(instance.getExtra()); 
            fluent.withGroups(instance.getGroups()); 
            fluent.withRequest(instance.getRequest()); 
            fluent.withUid(instance.getUid()); 
            fluent.withUsages(instance.getUsages()); 
            fluent.withUsername(instance.getUsername()); 
            this.validationEnabled = validationEnabled; 
    }
    public CertificateSigningRequestSpecBuilder(CertificateSigningRequestSpec instance){
            this(instance,true);
    }
    public CertificateSigningRequestSpecBuilder(CertificateSigningRequestSpec instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withExtra(instance.getExtra()); 
            this.withGroups(instance.getGroups()); 
            this.withRequest(instance.getRequest()); 
            this.withUid(instance.getUid()); 
            this.withUsages(instance.getUsages()); 
            this.withUsername(instance.getUsername()); 
            this.validationEnabled = validationEnabled; 
    }
    public CertificateSigningRequestSpecBuilder(Validator validator){
            this(new CertificateSigningRequestSpec(), true);
    }
    public CertificateSigningRequestSpecBuilder(CertificateSigningRequestSpecFluent<?> fluent,CertificateSigningRequestSpec instance,Validator validator){
            this.fluent = fluent; 
            fluent.withExtra(instance.getExtra()); 
            fluent.withGroups(instance.getGroups()); 
            fluent.withRequest(instance.getRequest()); 
            fluent.withUid(instance.getUid()); 
            fluent.withUsages(instance.getUsages()); 
            fluent.withUsername(instance.getUsername()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public CertificateSigningRequestSpecBuilder(CertificateSigningRequestSpec instance,Validator validator){
            this.fluent = this; 
            this.withExtra(instance.getExtra()); 
            this.withGroups(instance.getGroups()); 
            this.withRequest(instance.getRequest()); 
            this.withUid(instance.getUid()); 
            this.withUsages(instance.getUsages()); 
            this.withUsername(instance.getUsername()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public CertificateSigningRequestSpec build(){
            CertificateSigningRequestSpec buildable = new CertificateSigningRequestSpec(fluent.getExtra(),fluent.getGroups(),fluent.getRequest(),fluent.getUid(),fluent.getUsages(),fluent.getUsername());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CertificateSigningRequestSpecBuilder that = (CertificateSigningRequestSpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
