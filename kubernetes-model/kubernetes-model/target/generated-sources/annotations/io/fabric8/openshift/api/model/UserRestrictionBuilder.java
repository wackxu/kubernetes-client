package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class UserRestrictionBuilder extends UserRestrictionFluentImpl<UserRestrictionBuilder> implements VisitableBuilder<UserRestriction,UserRestrictionBuilder>{

    UserRestrictionFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public UserRestrictionBuilder(){
            this(true);
    }
    public UserRestrictionBuilder(Boolean validationEnabled){
            this(new UserRestriction(), validationEnabled);
    }
    public UserRestrictionBuilder(UserRestrictionFluent<?> fluent){
            this(fluent, true);
    }
    public UserRestrictionBuilder(UserRestrictionFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new UserRestriction(), validationEnabled);
    }
    public UserRestrictionBuilder(UserRestrictionFluent<?> fluent,UserRestriction instance){
            this(fluent, instance, true);
    }
    public UserRestrictionBuilder(UserRestrictionFluent<?> fluent,UserRestriction instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withGroups(instance.getGroups()); 
            fluent.withLabels(instance.getLabels()); 
            fluent.withUsers(instance.getUsers()); 
            this.validationEnabled = validationEnabled; 
    }
    public UserRestrictionBuilder(UserRestriction instance){
            this(instance,true);
    }
    public UserRestrictionBuilder(UserRestriction instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withGroups(instance.getGroups()); 
            this.withLabels(instance.getLabels()); 
            this.withUsers(instance.getUsers()); 
            this.validationEnabled = validationEnabled; 
    }
    public UserRestrictionBuilder(Validator validator){
            this(new UserRestriction(), true);
    }
    public UserRestrictionBuilder(UserRestrictionFluent<?> fluent,UserRestriction instance,Validator validator){
            this.fluent = fluent; 
            fluent.withGroups(instance.getGroups()); 
            fluent.withLabels(instance.getLabels()); 
            fluent.withUsers(instance.getUsers()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public UserRestrictionBuilder(UserRestriction instance,Validator validator){
            this.fluent = this; 
            this.withGroups(instance.getGroups()); 
            this.withLabels(instance.getLabels()); 
            this.withUsers(instance.getUsers()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public UserRestriction build(){
            UserRestriction buildable = new UserRestriction(fluent.getGroups(),fluent.getLabels(),fluent.getUsers());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            UserRestrictionBuilder that = (UserRestrictionBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
