package io.fabric8.kubernetes.api.model.authentication;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class TokenReviewSpecBuilder extends TokenReviewSpecFluentImpl<TokenReviewSpecBuilder> implements VisitableBuilder<TokenReviewSpec,TokenReviewSpecBuilder>{

    TokenReviewSpecFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public TokenReviewSpecBuilder(){
            this(true);
    }
    public TokenReviewSpecBuilder(Boolean validationEnabled){
            this(new TokenReviewSpec(), validationEnabled);
    }
    public TokenReviewSpecBuilder(TokenReviewSpecFluent<?> fluent){
            this(fluent, true);
    }
    public TokenReviewSpecBuilder(TokenReviewSpecFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new TokenReviewSpec(), validationEnabled);
    }
    public TokenReviewSpecBuilder(TokenReviewSpecFluent<?> fluent,TokenReviewSpec instance){
            this(fluent, instance, true);
    }
    public TokenReviewSpecBuilder(TokenReviewSpecFluent<?> fluent,TokenReviewSpec instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAudiences(instance.getAudiences()); 
            fluent.withToken(instance.getToken()); 
            this.validationEnabled = validationEnabled; 
    }
    public TokenReviewSpecBuilder(TokenReviewSpec instance){
            this(instance,true);
    }
    public TokenReviewSpecBuilder(TokenReviewSpec instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAudiences(instance.getAudiences()); 
            this.withToken(instance.getToken()); 
            this.validationEnabled = validationEnabled; 
    }
    public TokenReviewSpecBuilder(Validator validator){
            this(new TokenReviewSpec(), true);
    }
    public TokenReviewSpecBuilder(TokenReviewSpecFluent<?> fluent,TokenReviewSpec instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAudiences(instance.getAudiences()); 
            fluent.withToken(instance.getToken()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public TokenReviewSpecBuilder(TokenReviewSpec instance,Validator validator){
            this.fluent = this; 
            this.withAudiences(instance.getAudiences()); 
            this.withToken(instance.getToken()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public TokenReviewSpec build(){
            TokenReviewSpec buildable = new TokenReviewSpec(fluent.getAudiences(),fluent.getToken());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            TokenReviewSpecBuilder that = (TokenReviewSpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
