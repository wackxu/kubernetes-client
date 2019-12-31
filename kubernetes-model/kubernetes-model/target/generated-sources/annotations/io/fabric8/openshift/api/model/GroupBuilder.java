package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class GroupBuilder extends GroupFluentImpl<GroupBuilder> implements VisitableBuilder<Group,GroupBuilder>{

    GroupFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public GroupBuilder(){
            this(true);
    }
    public GroupBuilder(Boolean validationEnabled){
            this(new Group(), validationEnabled);
    }
    public GroupBuilder(GroupFluent<?> fluent){
            this(fluent, true);
    }
    public GroupBuilder(GroupFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new Group(), validationEnabled);
    }
    public GroupBuilder(GroupFluent<?> fluent,Group instance){
            this(fluent, instance, true);
    }
    public GroupBuilder(GroupFluent<?> fluent,Group instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withUsers(instance.getUsers()); 
            this.validationEnabled = validationEnabled; 
    }
    public GroupBuilder(Group instance){
            this(instance,true);
    }
    public GroupBuilder(Group instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withUsers(instance.getUsers()); 
            this.validationEnabled = validationEnabled; 
    }
    public GroupBuilder(Validator validator){
            this(new Group(), true);
    }
    public GroupBuilder(GroupFluent<?> fluent,Group instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withUsers(instance.getUsers()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public GroupBuilder(Group instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withUsers(instance.getUsers()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public Group build(){
            Group buildable = new Group(fluent.getApiVersion(),fluent.getKind(),fluent.getMetadata(),fluent.getUsers());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            GroupBuilder that = (GroupBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
