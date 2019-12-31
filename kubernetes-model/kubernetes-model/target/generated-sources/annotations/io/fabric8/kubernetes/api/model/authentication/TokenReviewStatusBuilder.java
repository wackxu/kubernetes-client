package io.fabric8.kubernetes.api.model.authentication;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class TokenReviewStatusBuilder extends TokenReviewStatusFluentImpl<TokenReviewStatusBuilder> implements VisitableBuilder<TokenReviewStatus,TokenReviewStatusBuilder>{

    TokenReviewStatusFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public TokenReviewStatusBuilder(){
            this(true);
    }
    public TokenReviewStatusBuilder(Boolean validationEnabled){
            this(new TokenReviewStatus(), validationEnabled);
    }
    public TokenReviewStatusBuilder(TokenReviewStatusFluent<?> fluent){
            this(fluent, true);
    }
    public TokenReviewStatusBuilder(TokenReviewStatusFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new TokenReviewStatus(), validationEnabled);
    }
    public TokenReviewStatusBuilder(TokenReviewStatusFluent<?> fluent,TokenReviewStatus instance){
            this(fluent, instance, true);
    }
    public TokenReviewStatusBuilder(TokenReviewStatusFluent<?> fluent,TokenReviewStatus instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAudiences(instance.getAudiences()); 
            fluent.withAuthenticated(instance.getAuthenticated()); 
            fluent.withError(instance.getError()); 
            fluent.withUser(instance.getUser()); 
            this.validationEnabled = validationEnabled; 
    }
    public TokenReviewStatusBuilder(TokenReviewStatus instance){
            this(instance,true);
    }
    public TokenReviewStatusBuilder(TokenReviewStatus instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAudiences(instance.getAudiences()); 
            this.withAuthenticated(instance.getAuthenticated()); 
            this.withError(instance.getError()); 
            this.withUser(instance.getUser()); 
            this.validationEnabled = validationEnabled; 
    }
    public TokenReviewStatusBuilder(Validator validator){
            this(new TokenReviewStatus(), true);
    }
    public TokenReviewStatusBuilder(TokenReviewStatusFluent<?> fluent,TokenReviewStatus instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAudiences(instance.getAudiences()); 
            fluent.withAuthenticated(instance.getAuthenticated()); 
            fluent.withError(instance.getError()); 
            fluent.withUser(instance.getUser()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public TokenReviewStatusBuilder(TokenReviewStatus instance,Validator validator){
            this.fluent = this; 
            this.withAudiences(instance.getAudiences()); 
            this.withAuthenticated(instance.getAuthenticated()); 
            this.withError(instance.getError()); 
            this.withUser(instance.getUser()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public TokenReviewStatus build(){
            TokenReviewStatus buildable = new TokenReviewStatus(fluent.getAudiences(),fluent.isAuthenticated(),fluent.getError(),fluent.getUser());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            TokenReviewStatusBuilder that = (TokenReviewStatusBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
