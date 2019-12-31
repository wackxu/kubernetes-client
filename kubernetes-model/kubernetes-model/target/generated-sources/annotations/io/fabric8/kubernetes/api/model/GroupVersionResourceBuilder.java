package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class GroupVersionResourceBuilder extends GroupVersionResourceFluentImpl<GroupVersionResourceBuilder> implements VisitableBuilder<GroupVersionResource,GroupVersionResourceBuilder>{

    GroupVersionResourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public GroupVersionResourceBuilder(){
            this(true);
    }
    public GroupVersionResourceBuilder(Boolean validationEnabled){
            this(new GroupVersionResource(), validationEnabled);
    }
    public GroupVersionResourceBuilder(GroupVersionResourceFluent<?> fluent){
            this(fluent, true);
    }
    public GroupVersionResourceBuilder(GroupVersionResourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new GroupVersionResource(), validationEnabled);
    }
    public GroupVersionResourceBuilder(GroupVersionResourceFluent<?> fluent,GroupVersionResource instance){
            this(fluent, instance, true);
    }
    public GroupVersionResourceBuilder(GroupVersionResourceFluent<?> fluent,GroupVersionResource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withGroup(instance.getGroup()); 
            fluent.withResource(instance.getResource()); 
            fluent.withVersion(instance.getVersion()); 
            this.validationEnabled = validationEnabled; 
    }
    public GroupVersionResourceBuilder(GroupVersionResource instance){
            this(instance,true);
    }
    public GroupVersionResourceBuilder(GroupVersionResource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withGroup(instance.getGroup()); 
            this.withResource(instance.getResource()); 
            this.withVersion(instance.getVersion()); 
            this.validationEnabled = validationEnabled; 
    }
    public GroupVersionResourceBuilder(Validator validator){
            this(new GroupVersionResource(), true);
    }
    public GroupVersionResourceBuilder(GroupVersionResourceFluent<?> fluent,GroupVersionResource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withGroup(instance.getGroup()); 
            fluent.withResource(instance.getResource()); 
            fluent.withVersion(instance.getVersion()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public GroupVersionResourceBuilder(GroupVersionResource instance,Validator validator){
            this.fluent = this; 
            this.withGroup(instance.getGroup()); 
            this.withResource(instance.getResource()); 
            this.withVersion(instance.getVersion()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public GroupVersionResource build(){
            GroupVersionResource buildable = new GroupVersionResource(fluent.getGroup(),fluent.getResource(),fluent.getVersion());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            GroupVersionResourceBuilder that = (GroupVersionResourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
