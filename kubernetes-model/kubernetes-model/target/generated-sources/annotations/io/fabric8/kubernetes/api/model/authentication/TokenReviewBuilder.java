package io.fabric8.kubernetes.api.model.authentication;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class TokenReviewBuilder extends TokenReviewFluentImpl<TokenReviewBuilder> implements VisitableBuilder<TokenReview,TokenReviewBuilder>{

    TokenReviewFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public TokenReviewBuilder(){
            this(true);
    }
    public TokenReviewBuilder(Boolean validationEnabled){
            this(new TokenReview(), validationEnabled);
    }
    public TokenReviewBuilder(TokenReviewFluent<?> fluent){
            this(fluent, true);
    }
    public TokenReviewBuilder(TokenReviewFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new TokenReview(), validationEnabled);
    }
    public TokenReviewBuilder(TokenReviewFluent<?> fluent,TokenReview instance){
            this(fluent, instance, true);
    }
    public TokenReviewBuilder(TokenReviewFluent<?> fluent,TokenReview instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            fluent.withStatus(instance.getStatus()); 
            this.validationEnabled = validationEnabled; 
    }
    public TokenReviewBuilder(TokenReview instance){
            this(instance,true);
    }
    public TokenReviewBuilder(TokenReview instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.withStatus(instance.getStatus()); 
            this.validationEnabled = validationEnabled; 
    }
    public TokenReviewBuilder(Validator validator){
            this(new TokenReview(), true);
    }
    public TokenReviewBuilder(TokenReviewFluent<?> fluent,TokenReview instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            fluent.withStatus(instance.getStatus()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public TokenReviewBuilder(TokenReview instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.withStatus(instance.getStatus()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public TokenReview build(){
            TokenReview buildable = new TokenReview(fluent.getApiVersion(),fluent.getKind(),fluent.getMetadata(),fluent.getSpec(),fluent.getStatus());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            TokenReviewBuilder that = (TokenReviewBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
