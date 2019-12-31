package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class GroupListBuilder extends GroupListFluentImpl<GroupListBuilder> implements VisitableBuilder<GroupList,GroupListBuilder>{

    GroupListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public GroupListBuilder(){
            this(true);
    }
    public GroupListBuilder(Boolean validationEnabled){
            this(new GroupList(), validationEnabled);
    }
    public GroupListBuilder(GroupListFluent<?> fluent){
            this(fluent, true);
    }
    public GroupListBuilder(GroupListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new GroupList(), validationEnabled);
    }
    public GroupListBuilder(GroupListFluent<?> fluent,GroupList instance){
            this(fluent, instance, true);
    }
    public GroupListBuilder(GroupListFluent<?> fluent,GroupList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public GroupListBuilder(GroupList instance){
            this(instance,true);
    }
    public GroupListBuilder(GroupList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public GroupListBuilder(Validator validator){
            this(new GroupList(), true);
    }
    public GroupListBuilder(GroupListFluent<?> fluent,GroupList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public GroupListBuilder(GroupList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public GroupList build(){
            GroupList buildable = new GroupList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            GroupListBuilder that = (GroupListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
