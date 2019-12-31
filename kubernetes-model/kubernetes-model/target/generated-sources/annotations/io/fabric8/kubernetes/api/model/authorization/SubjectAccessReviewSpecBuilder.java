package io.fabric8.kubernetes.api.model.authorization;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class SubjectAccessReviewSpecBuilder extends SubjectAccessReviewSpecFluentImpl<SubjectAccessReviewSpecBuilder> implements VisitableBuilder<SubjectAccessReviewSpec,SubjectAccessReviewSpecBuilder>{

    SubjectAccessReviewSpecFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public SubjectAccessReviewSpecBuilder(){
            this(true);
    }
    public SubjectAccessReviewSpecBuilder(Boolean validationEnabled){
            this(new SubjectAccessReviewSpec(), validationEnabled);
    }
    public SubjectAccessReviewSpecBuilder(SubjectAccessReviewSpecFluent<?> fluent){
            this(fluent, true);
    }
    public SubjectAccessReviewSpecBuilder(SubjectAccessReviewSpecFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new SubjectAccessReviewSpec(), validationEnabled);
    }
    public SubjectAccessReviewSpecBuilder(SubjectAccessReviewSpecFluent<?> fluent,SubjectAccessReviewSpec instance){
            this(fluent, instance, true);
    }
    public SubjectAccessReviewSpecBuilder(SubjectAccessReviewSpecFluent<?> fluent,SubjectAccessReviewSpec instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withExtra(instance.getExtra()); 
            fluent.withGroups(instance.getGroups()); 
            fluent.withNonResourceAttributes(instance.getNonResourceAttributes()); 
            fluent.withResourceAttributes(instance.getResourceAttributes()); 
            fluent.withUid(instance.getUid()); 
            fluent.withUser(instance.getUser()); 
            this.validationEnabled = validationEnabled; 
    }
    public SubjectAccessReviewSpecBuilder(SubjectAccessReviewSpec instance){
            this(instance,true);
    }
    public SubjectAccessReviewSpecBuilder(SubjectAccessReviewSpec instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withExtra(instance.getExtra()); 
            this.withGroups(instance.getGroups()); 
            this.withNonResourceAttributes(instance.getNonResourceAttributes()); 
            this.withResourceAttributes(instance.getResourceAttributes()); 
            this.withUid(instance.getUid()); 
            this.withUser(instance.getUser()); 
            this.validationEnabled = validationEnabled; 
    }
    public SubjectAccessReviewSpecBuilder(Validator validator){
            this(new SubjectAccessReviewSpec(), true);
    }
    public SubjectAccessReviewSpecBuilder(SubjectAccessReviewSpecFluent<?> fluent,SubjectAccessReviewSpec instance,Validator validator){
            this.fluent = fluent; 
            fluent.withExtra(instance.getExtra()); 
            fluent.withGroups(instance.getGroups()); 
            fluent.withNonResourceAttributes(instance.getNonResourceAttributes()); 
            fluent.withResourceAttributes(instance.getResourceAttributes()); 
            fluent.withUid(instance.getUid()); 
            fluent.withUser(instance.getUser()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public SubjectAccessReviewSpecBuilder(SubjectAccessReviewSpec instance,Validator validator){
            this.fluent = this; 
            this.withExtra(instance.getExtra()); 
            this.withGroups(instance.getGroups()); 
            this.withNonResourceAttributes(instance.getNonResourceAttributes()); 
            this.withResourceAttributes(instance.getResourceAttributes()); 
            this.withUid(instance.getUid()); 
            this.withUser(instance.getUser()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public SubjectAccessReviewSpec build(){
            SubjectAccessReviewSpec buildable = new SubjectAccessReviewSpec(fluent.getExtra(),fluent.getGroups(),fluent.getNonResourceAttributes(),fluent.getResourceAttributes(),fluent.getUid(),fluent.getUser());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SubjectAccessReviewSpecBuilder that = (SubjectAccessReviewSpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
