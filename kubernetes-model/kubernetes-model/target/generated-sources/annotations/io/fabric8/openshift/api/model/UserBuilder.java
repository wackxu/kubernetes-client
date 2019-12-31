package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class UserBuilder extends UserFluentImpl<UserBuilder> implements VisitableBuilder<User,UserBuilder>{

    UserFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public UserBuilder(){
            this(true);
    }
    public UserBuilder(Boolean validationEnabled){
            this(new User(), validationEnabled);
    }
    public UserBuilder(UserFluent<?> fluent){
            this(fluent, true);
    }
    public UserBuilder(UserFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new User(), validationEnabled);
    }
    public UserBuilder(UserFluent<?> fluent,User instance){
            this(fluent, instance, true);
    }
    public UserBuilder(UserFluent<?> fluent,User instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withFullName(instance.getFullName()); 
            fluent.withGroups(instance.getGroups()); 
            fluent.withIdentities(instance.getIdentities()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public UserBuilder(User instance){
            this(instance,true);
    }
    public UserBuilder(User instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withFullName(instance.getFullName()); 
            this.withGroups(instance.getGroups()); 
            this.withIdentities(instance.getIdentities()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public UserBuilder(Validator validator){
            this(new User(), true);
    }
    public UserBuilder(UserFluent<?> fluent,User instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withFullName(instance.getFullName()); 
            fluent.withGroups(instance.getGroups()); 
            fluent.withIdentities(instance.getIdentities()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public UserBuilder(User instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withFullName(instance.getFullName()); 
            this.withGroups(instance.getGroups()); 
            this.withIdentities(instance.getIdentities()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public User build(){
            User buildable = new User(fluent.getApiVersion(),fluent.getFullName(),fluent.getGroups(),fluent.getIdentities(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            UserBuilder that = (UserBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
