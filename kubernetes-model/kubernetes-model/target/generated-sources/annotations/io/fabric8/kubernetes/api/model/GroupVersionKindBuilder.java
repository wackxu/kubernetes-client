package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class GroupVersionKindBuilder extends GroupVersionKindFluentImpl<GroupVersionKindBuilder> implements VisitableBuilder<GroupVersionKind,GroupVersionKindBuilder>{

    GroupVersionKindFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public GroupVersionKindBuilder(){
            this(true);
    }
    public GroupVersionKindBuilder(Boolean validationEnabled){
            this(new GroupVersionKind(), validationEnabled);
    }
    public GroupVersionKindBuilder(GroupVersionKindFluent<?> fluent){
            this(fluent, true);
    }
    public GroupVersionKindBuilder(GroupVersionKindFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new GroupVersionKind(), validationEnabled);
    }
    public GroupVersionKindBuilder(GroupVersionKindFluent<?> fluent,GroupVersionKind instance){
            this(fluent, instance, true);
    }
    public GroupVersionKindBuilder(GroupVersionKindFluent<?> fluent,GroupVersionKind instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withGroup(instance.getGroup()); 
            fluent.withKind(instance.getKind()); 
            fluent.withVersion(instance.getVersion()); 
            this.validationEnabled = validationEnabled; 
    }
    public GroupVersionKindBuilder(GroupVersionKind instance){
            this(instance,true);
    }
    public GroupVersionKindBuilder(GroupVersionKind instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withGroup(instance.getGroup()); 
            this.withKind(instance.getKind()); 
            this.withVersion(instance.getVersion()); 
            this.validationEnabled = validationEnabled; 
    }
    public GroupVersionKindBuilder(Validator validator){
            this(new GroupVersionKind(), true);
    }
    public GroupVersionKindBuilder(GroupVersionKindFluent<?> fluent,GroupVersionKind instance,Validator validator){
            this.fluent = fluent; 
            fluent.withGroup(instance.getGroup()); 
            fluent.withKind(instance.getKind()); 
            fluent.withVersion(instance.getVersion()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public GroupVersionKindBuilder(GroupVersionKind instance,Validator validator){
            this.fluent = this; 
            this.withGroup(instance.getGroup()); 
            this.withKind(instance.getKind()); 
            this.withVersion(instance.getVersion()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public GroupVersionKind build(){
            GroupVersionKind buildable = new GroupVersionKind(fluent.getGroup(),fluent.getKind(),fluent.getVersion());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            GroupVersionKindBuilder that = (GroupVersionKindBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
