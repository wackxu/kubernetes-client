package io.fabric8.kubernetes.api.model.authorization;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class SubjectAccessReviewBuilder extends SubjectAccessReviewFluentImpl<SubjectAccessReviewBuilder> implements VisitableBuilder<SubjectAccessReview,SubjectAccessReviewBuilder>{

    SubjectAccessReviewFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public SubjectAccessReviewBuilder(){
            this(true);
    }
    public SubjectAccessReviewBuilder(Boolean validationEnabled){
            this(new SubjectAccessReview(), validationEnabled);
    }
    public SubjectAccessReviewBuilder(SubjectAccessReviewFluent<?> fluent){
            this(fluent, true);
    }
    public SubjectAccessReviewBuilder(SubjectAccessReviewFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new SubjectAccessReview(), validationEnabled);
    }
    public SubjectAccessReviewBuilder(SubjectAccessReviewFluent<?> fluent,SubjectAccessReview instance){
            this(fluent, instance, true);
    }
    public SubjectAccessReviewBuilder(SubjectAccessReviewFluent<?> fluent,SubjectAccessReview instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            fluent.withStatus(instance.getStatus()); 
            this.validationEnabled = validationEnabled; 
    }
    public SubjectAccessReviewBuilder(SubjectAccessReview instance){
            this(instance,true);
    }
    public SubjectAccessReviewBuilder(SubjectAccessReview instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.withStatus(instance.getStatus()); 
            this.validationEnabled = validationEnabled; 
    }
    public SubjectAccessReviewBuilder(Validator validator){
            this(new SubjectAccessReview(), true);
    }
    public SubjectAccessReviewBuilder(SubjectAccessReviewFluent<?> fluent,SubjectAccessReview instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            fluent.withStatus(instance.getStatus()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public SubjectAccessReviewBuilder(SubjectAccessReview instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.withStatus(instance.getStatus()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public SubjectAccessReview build(){
            SubjectAccessReview buildable = new SubjectAccessReview(fluent.getApiVersion(),fluent.getKind(),fluent.getMetadata(),fluent.getSpec(),fluent.getStatus());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SubjectAccessReviewBuilder that = (SubjectAccessReviewBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
