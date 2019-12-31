package io.fabric8.kubernetes.api.model.certificates;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class CertificateSigningRequestConditionBuilder extends CertificateSigningRequestConditionFluentImpl<CertificateSigningRequestConditionBuilder> implements VisitableBuilder<CertificateSigningRequestCondition,CertificateSigningRequestConditionBuilder>{

    CertificateSigningRequestConditionFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public CertificateSigningRequestConditionBuilder(){
            this(true);
    }
    public CertificateSigningRequestConditionBuilder(Boolean validationEnabled){
            this(new CertificateSigningRequestCondition(), validationEnabled);
    }
    public CertificateSigningRequestConditionBuilder(CertificateSigningRequestConditionFluent<?> fluent){
            this(fluent, true);
    }
    public CertificateSigningRequestConditionBuilder(CertificateSigningRequestConditionFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new CertificateSigningRequestCondition(), validationEnabled);
    }
    public CertificateSigningRequestConditionBuilder(CertificateSigningRequestConditionFluent<?> fluent,CertificateSigningRequestCondition instance){
            this(fluent, instance, true);
    }
    public CertificateSigningRequestConditionBuilder(CertificateSigningRequestConditionFluent<?> fluent,CertificateSigningRequestCondition instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withLastUpdateTime(instance.getLastUpdateTime()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withReason(instance.getReason()); 
            fluent.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public CertificateSigningRequestConditionBuilder(CertificateSigningRequestCondition instance){
            this(instance,true);
    }
    public CertificateSigningRequestConditionBuilder(CertificateSigningRequestCondition instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withLastUpdateTime(instance.getLastUpdateTime()); 
            this.withMessage(instance.getMessage()); 
            this.withReason(instance.getReason()); 
            this.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public CertificateSigningRequestConditionBuilder(Validator validator){
            this(new CertificateSigningRequestCondition(), true);
    }
    public CertificateSigningRequestConditionBuilder(CertificateSigningRequestConditionFluent<?> fluent,CertificateSigningRequestCondition instance,Validator validator){
            this.fluent = fluent; 
            fluent.withLastUpdateTime(instance.getLastUpdateTime()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withReason(instance.getReason()); 
            fluent.withType(instance.getType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public CertificateSigningRequestConditionBuilder(CertificateSigningRequestCondition instance,Validator validator){
            this.fluent = this; 
            this.withLastUpdateTime(instance.getLastUpdateTime()); 
            this.withMessage(instance.getMessage()); 
            this.withReason(instance.getReason()); 
            this.withType(instance.getType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public CertificateSigningRequestCondition build(){
            CertificateSigningRequestCondition buildable = new CertificateSigningRequestCondition(fluent.getLastUpdateTime(),fluent.getMessage(),fluent.getReason(),fluent.getType());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CertificateSigningRequestConditionBuilder that = (CertificateSigningRequestConditionBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
