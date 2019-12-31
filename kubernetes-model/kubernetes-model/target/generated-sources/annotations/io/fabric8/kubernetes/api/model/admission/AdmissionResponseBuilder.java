package io.fabric8.kubernetes.api.model.admission;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class AdmissionResponseBuilder extends AdmissionResponseFluentImpl<AdmissionResponseBuilder> implements VisitableBuilder<AdmissionResponse,AdmissionResponseBuilder>{

    AdmissionResponseFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public AdmissionResponseBuilder(){
            this(true);
    }
    public AdmissionResponseBuilder(Boolean validationEnabled){
            this(new AdmissionResponse(), validationEnabled);
    }
    public AdmissionResponseBuilder(AdmissionResponseFluent<?> fluent){
            this(fluent, true);
    }
    public AdmissionResponseBuilder(AdmissionResponseFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new AdmissionResponse(), validationEnabled);
    }
    public AdmissionResponseBuilder(AdmissionResponseFluent<?> fluent,AdmissionResponse instance){
            this(fluent, instance, true);
    }
    public AdmissionResponseBuilder(AdmissionResponseFluent<?> fluent,AdmissionResponse instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAllowed(instance.getAllowed()); 
            fluent.withAuditAnnotations(instance.getAuditAnnotations()); 
            fluent.withPatch(instance.getPatch()); 
            fluent.withPatchType(instance.getPatchType()); 
            fluent.withStatus(instance.getStatus()); 
            fluent.withUid(instance.getUid()); 
            this.validationEnabled = validationEnabled; 
    }
    public AdmissionResponseBuilder(AdmissionResponse instance){
            this(instance,true);
    }
    public AdmissionResponseBuilder(AdmissionResponse instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAllowed(instance.getAllowed()); 
            this.withAuditAnnotations(instance.getAuditAnnotations()); 
            this.withPatch(instance.getPatch()); 
            this.withPatchType(instance.getPatchType()); 
            this.withStatus(instance.getStatus()); 
            this.withUid(instance.getUid()); 
            this.validationEnabled = validationEnabled; 
    }
    public AdmissionResponseBuilder(Validator validator){
            this(new AdmissionResponse(), true);
    }
    public AdmissionResponseBuilder(AdmissionResponseFluent<?> fluent,AdmissionResponse instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAllowed(instance.getAllowed()); 
            fluent.withAuditAnnotations(instance.getAuditAnnotations()); 
            fluent.withPatch(instance.getPatch()); 
            fluent.withPatchType(instance.getPatchType()); 
            fluent.withStatus(instance.getStatus()); 
            fluent.withUid(instance.getUid()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public AdmissionResponseBuilder(AdmissionResponse instance,Validator validator){
            this.fluent = this; 
            this.withAllowed(instance.getAllowed()); 
            this.withAuditAnnotations(instance.getAuditAnnotations()); 
            this.withPatch(instance.getPatch()); 
            this.withPatchType(instance.getPatchType()); 
            this.withStatus(instance.getStatus()); 
            this.withUid(instance.getUid()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public AdmissionResponse build(){
            AdmissionResponse buildable = new AdmissionResponse(fluent.isAllowed(),fluent.getAuditAnnotations(),fluent.getPatch(),fluent.getPatchType(),fluent.getStatus(),fluent.getUid());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            AdmissionResponseBuilder that = (AdmissionResponseBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
