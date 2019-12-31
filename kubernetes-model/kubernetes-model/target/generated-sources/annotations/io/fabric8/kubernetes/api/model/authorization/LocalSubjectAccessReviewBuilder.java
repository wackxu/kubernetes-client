package io.fabric8.kubernetes.api.model.authorization;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class LocalSubjectAccessReviewBuilder extends LocalSubjectAccessReviewFluentImpl<LocalSubjectAccessReviewBuilder> implements VisitableBuilder<LocalSubjectAccessReview,LocalSubjectAccessReviewBuilder>{

    LocalSubjectAccessReviewFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public LocalSubjectAccessReviewBuilder(){
            this(true);
    }
    public LocalSubjectAccessReviewBuilder(Boolean validationEnabled){
            this(new LocalSubjectAccessReview(), validationEnabled);
    }
    public LocalSubjectAccessReviewBuilder(LocalSubjectAccessReviewFluent<?> fluent){
            this(fluent, true);
    }
    public LocalSubjectAccessReviewBuilder(LocalSubjectAccessReviewFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new LocalSubjectAccessReview(), validationEnabled);
    }
    public LocalSubjectAccessReviewBuilder(LocalSubjectAccessReviewFluent<?> fluent,LocalSubjectAccessReview instance){
            this(fluent, instance, true);
    }
    public LocalSubjectAccessReviewBuilder(LocalSubjectAccessReviewFluent<?> fluent,LocalSubjectAccessReview instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            fluent.withStatus(instance.getStatus()); 
            this.validationEnabled = validationEnabled; 
    }
    public LocalSubjectAccessReviewBuilder(LocalSubjectAccessReview instance){
            this(instance,true);
    }
    public LocalSubjectAccessReviewBuilder(LocalSubjectAccessReview instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.withStatus(instance.getStatus()); 
            this.validationEnabled = validationEnabled; 
    }
    public LocalSubjectAccessReviewBuilder(Validator validator){
            this(new LocalSubjectAccessReview(), true);
    }
    public LocalSubjectAccessReviewBuilder(LocalSubjectAccessReviewFluent<?> fluent,LocalSubjectAccessReview instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            fluent.withStatus(instance.getStatus()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public LocalSubjectAccessReviewBuilder(LocalSubjectAccessReview instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.withStatus(instance.getStatus()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public LocalSubjectAccessReview build(){
            LocalSubjectAccessReview buildable = new LocalSubjectAccessReview(fluent.getApiVersion(),fluent.getKind(),fluent.getMetadata(),fluent.getSpec(),fluent.getStatus());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            LocalSubjectAccessReviewBuilder that = (LocalSubjectAccessReviewBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
