package io.fabric8.kubernetes.api.model.admission;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class AdmissionReviewBuilder extends AdmissionReviewFluentImpl<AdmissionReviewBuilder> implements VisitableBuilder<AdmissionReview,AdmissionReviewBuilder>{

    AdmissionReviewFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public AdmissionReviewBuilder(){
            this(true);
    }
    public AdmissionReviewBuilder(Boolean validationEnabled){
            this(new AdmissionReview(), validationEnabled);
    }
    public AdmissionReviewBuilder(AdmissionReviewFluent<?> fluent){
            this(fluent, true);
    }
    public AdmissionReviewBuilder(AdmissionReviewFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new AdmissionReview(), validationEnabled);
    }
    public AdmissionReviewBuilder(AdmissionReviewFluent<?> fluent,AdmissionReview instance){
            this(fluent, instance, true);
    }
    public AdmissionReviewBuilder(AdmissionReviewFluent<?> fluent,AdmissionReview instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withRequest(instance.getRequest()); 
            fluent.withResponse(instance.getResponse()); 
            this.validationEnabled = validationEnabled; 
    }
    public AdmissionReviewBuilder(AdmissionReview instance){
            this(instance,true);
    }
    public AdmissionReviewBuilder(AdmissionReview instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withRequest(instance.getRequest()); 
            this.withResponse(instance.getResponse()); 
            this.validationEnabled = validationEnabled; 
    }
    public AdmissionReviewBuilder(Validator validator){
            this(new AdmissionReview(), true);
    }
    public AdmissionReviewBuilder(AdmissionReviewFluent<?> fluent,AdmissionReview instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withRequest(instance.getRequest()); 
            fluent.withResponse(instance.getResponse()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public AdmissionReviewBuilder(AdmissionReview instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withRequest(instance.getRequest()); 
            this.withResponse(instance.getResponse()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public AdmissionReview build(){
            AdmissionReview buildable = new AdmissionReview(fluent.getApiVersion(),fluent.getKind(),fluent.getRequest(),fluent.getResponse());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            AdmissionReviewBuilder that = (AdmissionReviewBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
