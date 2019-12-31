package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class UserListBuilder extends UserListFluentImpl<UserListBuilder> implements VisitableBuilder<UserList,UserListBuilder>{

    UserListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public UserListBuilder(){
            this(true);
    }
    public UserListBuilder(Boolean validationEnabled){
            this(new UserList(), validationEnabled);
    }
    public UserListBuilder(UserListFluent<?> fluent){
            this(fluent, true);
    }
    public UserListBuilder(UserListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new UserList(), validationEnabled);
    }
    public UserListBuilder(UserListFluent<?> fluent,UserList instance){
            this(fluent, instance, true);
    }
    public UserListBuilder(UserListFluent<?> fluent,UserList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public UserListBuilder(UserList instance){
            this(instance,true);
    }
    public UserListBuilder(UserList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public UserListBuilder(Validator validator){
            this(new UserList(), true);
    }
    public UserListBuilder(UserListFluent<?> fluent,UserList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public UserListBuilder(UserList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public UserList build(){
            UserList buildable = new UserList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            UserListBuilder that = (UserListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
