package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class SubjectAccessReviewResponseBuilder extends SubjectAccessReviewResponseFluentImpl<SubjectAccessReviewResponseBuilder> implements VisitableBuilder<SubjectAccessReviewResponse,SubjectAccessReviewResponseBuilder>{

    SubjectAccessReviewResponseFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public SubjectAccessReviewResponseBuilder(){
            this(true);
    }
    public SubjectAccessReviewResponseBuilder(Boolean validationEnabled){
            this(new SubjectAccessReviewResponse(), validationEnabled);
    }
    public SubjectAccessReviewResponseBuilder(SubjectAccessReviewResponseFluent<?> fluent){
            this(fluent, true);
    }
    public SubjectAccessReviewResponseBuilder(SubjectAccessReviewResponseFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new SubjectAccessReviewResponse(), validationEnabled);
    }
    public SubjectAccessReviewResponseBuilder(SubjectAccessReviewResponseFluent<?> fluent,SubjectAccessReviewResponse instance){
            this(fluent, instance, true);
    }
    public SubjectAccessReviewResponseBuilder(SubjectAccessReviewResponseFluent<?> fluent,SubjectAccessReviewResponse instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAllowed(instance.getAllowed()); 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withEvaluationError(instance.getEvaluationError()); 
            fluent.withKind(instance.getKind()); 
            fluent.withNamespace(instance.getNamespace()); 
            fluent.withReason(instance.getReason()); 
            this.validationEnabled = validationEnabled; 
    }
    public SubjectAccessReviewResponseBuilder(SubjectAccessReviewResponse instance){
            this(instance,true);
    }
    public SubjectAccessReviewResponseBuilder(SubjectAccessReviewResponse instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAllowed(instance.getAllowed()); 
            this.withApiVersion(instance.getApiVersion()); 
            this.withEvaluationError(instance.getEvaluationError()); 
            this.withKind(instance.getKind()); 
            this.withNamespace(instance.getNamespace()); 
            this.withReason(instance.getReason()); 
            this.validationEnabled = validationEnabled; 
    }
    public SubjectAccessReviewResponseBuilder(Validator validator){
            this(new SubjectAccessReviewResponse(), true);
    }
    public SubjectAccessReviewResponseBuilder(SubjectAccessReviewResponseFluent<?> fluent,SubjectAccessReviewResponse instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAllowed(instance.getAllowed()); 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withEvaluationError(instance.getEvaluationError()); 
            fluent.withKind(instance.getKind()); 
            fluent.withNamespace(instance.getNamespace()); 
            fluent.withReason(instance.getReason()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public SubjectAccessReviewResponseBuilder(SubjectAccessReviewResponse instance,Validator validator){
            this.fluent = this; 
            this.withAllowed(instance.getAllowed()); 
            this.withApiVersion(instance.getApiVersion()); 
            this.withEvaluationError(instance.getEvaluationError()); 
            this.withKind(instance.getKind()); 
            this.withNamespace(instance.getNamespace()); 
            this.withReason(instance.getReason()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public SubjectAccessReviewResponse build(){
            SubjectAccessReviewResponse buildable = new SubjectAccessReviewResponse(fluent.isAllowed(),fluent.getApiVersion(),fluent.getEvaluationError(),fluent.getKind(),fluent.getNamespace(),fluent.getReason());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SubjectAccessReviewResponseBuilder that = (SubjectAccessReviewResponseBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
