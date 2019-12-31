package io.fabric8.kubernetes.api.model.authorization;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class SubjectAccessReviewStatusBuilder extends SubjectAccessReviewStatusFluentImpl<SubjectAccessReviewStatusBuilder> implements VisitableBuilder<SubjectAccessReviewStatus,SubjectAccessReviewStatusBuilder>{

    SubjectAccessReviewStatusFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public SubjectAccessReviewStatusBuilder(){
            this(true);
    }
    public SubjectAccessReviewStatusBuilder(Boolean validationEnabled){
            this(new SubjectAccessReviewStatus(), validationEnabled);
    }
    public SubjectAccessReviewStatusBuilder(SubjectAccessReviewStatusFluent<?> fluent){
            this(fluent, true);
    }
    public SubjectAccessReviewStatusBuilder(SubjectAccessReviewStatusFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new SubjectAccessReviewStatus(), validationEnabled);
    }
    public SubjectAccessReviewStatusBuilder(SubjectAccessReviewStatusFluent<?> fluent,SubjectAccessReviewStatus instance){
            this(fluent, instance, true);
    }
    public SubjectAccessReviewStatusBuilder(SubjectAccessReviewStatusFluent<?> fluent,SubjectAccessReviewStatus instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAllowed(instance.getAllowed()); 
            fluent.withDenied(instance.getDenied()); 
            fluent.withEvaluationError(instance.getEvaluationError()); 
            fluent.withReason(instance.getReason()); 
            this.validationEnabled = validationEnabled; 
    }
    public SubjectAccessReviewStatusBuilder(SubjectAccessReviewStatus instance){
            this(instance,true);
    }
    public SubjectAccessReviewStatusBuilder(SubjectAccessReviewStatus instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAllowed(instance.getAllowed()); 
            this.withDenied(instance.getDenied()); 
            this.withEvaluationError(instance.getEvaluationError()); 
            this.withReason(instance.getReason()); 
            this.validationEnabled = validationEnabled; 
    }
    public SubjectAccessReviewStatusBuilder(Validator validator){
            this(new SubjectAccessReviewStatus(), true);
    }
    public SubjectAccessReviewStatusBuilder(SubjectAccessReviewStatusFluent<?> fluent,SubjectAccessReviewStatus instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAllowed(instance.getAllowed()); 
            fluent.withDenied(instance.getDenied()); 
            fluent.withEvaluationError(instance.getEvaluationError()); 
            fluent.withReason(instance.getReason()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public SubjectAccessReviewStatusBuilder(SubjectAccessReviewStatus instance,Validator validator){
            this.fluent = this; 
            this.withAllowed(instance.getAllowed()); 
            this.withDenied(instance.getDenied()); 
            this.withEvaluationError(instance.getEvaluationError()); 
            this.withReason(instance.getReason()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public SubjectAccessReviewStatus build(){
            SubjectAccessReviewStatus buildable = new SubjectAccessReviewStatus(fluent.isAllowed(),fluent.isDenied(),fluent.getEvaluationError(),fluent.getReason());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SubjectAccessReviewStatusBuilder that = (SubjectAccessReviewStatusBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
