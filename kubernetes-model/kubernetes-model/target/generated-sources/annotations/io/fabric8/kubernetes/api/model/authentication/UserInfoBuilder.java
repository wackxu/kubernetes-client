package io.fabric8.kubernetes.api.model.authentication;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class UserInfoBuilder extends UserInfoFluentImpl<UserInfoBuilder> implements VisitableBuilder<UserInfo,UserInfoBuilder>{

    UserInfoFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public UserInfoBuilder(){
            this(true);
    }
    public UserInfoBuilder(Boolean validationEnabled){
            this(new UserInfo(), validationEnabled);
    }
    public UserInfoBuilder(UserInfoFluent<?> fluent){
            this(fluent, true);
    }
    public UserInfoBuilder(UserInfoFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new UserInfo(), validationEnabled);
    }
    public UserInfoBuilder(UserInfoFluent<?> fluent,UserInfo instance){
            this(fluent, instance, true);
    }
    public UserInfoBuilder(UserInfoFluent<?> fluent,UserInfo instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withExtra(instance.getExtra()); 
            fluent.withGroups(instance.getGroups()); 
            fluent.withUid(instance.getUid()); 
            fluent.withUsername(instance.getUsername()); 
            this.validationEnabled = validationEnabled; 
    }
    public UserInfoBuilder(UserInfo instance){
            this(instance,true);
    }
    public UserInfoBuilder(UserInfo instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withExtra(instance.getExtra()); 
            this.withGroups(instance.getGroups()); 
            this.withUid(instance.getUid()); 
            this.withUsername(instance.getUsername()); 
            this.validationEnabled = validationEnabled; 
    }
    public UserInfoBuilder(Validator validator){
            this(new UserInfo(), true);
    }
    public UserInfoBuilder(UserInfoFluent<?> fluent,UserInfo instance,Validator validator){
            this.fluent = fluent; 
            fluent.withExtra(instance.getExtra()); 
            fluent.withGroups(instance.getGroups()); 
            fluent.withUid(instance.getUid()); 
            fluent.withUsername(instance.getUsername()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public UserInfoBuilder(UserInfo instance,Validator validator){
            this.fluent = this; 
            this.withExtra(instance.getExtra()); 
            this.withGroups(instance.getGroups()); 
            this.withUid(instance.getUid()); 
            this.withUsername(instance.getUsername()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public UserInfo build(){
            UserInfo buildable = new UserInfo(fluent.getExtra(),fluent.getGroups(),fluent.getUid(),fluent.getUsername());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            UserInfoBuilder that = (UserInfoBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
