package io.fabric8.kubernetes.api.model.rbac;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class RoleBindingListBuilder extends RoleBindingListFluentImpl<RoleBindingListBuilder> implements VisitableBuilder<RoleBindingList,RoleBindingListBuilder>{

    RoleBindingListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public RoleBindingListBuilder(){
            this(true);
    }
    public RoleBindingListBuilder(Boolean validationEnabled){
            this(new RoleBindingList(), validationEnabled);
    }
    public RoleBindingListBuilder(RoleBindingListFluent<?> fluent){
            this(fluent, true);
    }
    public RoleBindingListBuilder(RoleBindingListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new RoleBindingList(), validationEnabled);
    }
    public RoleBindingListBuilder(RoleBindingListFluent<?> fluent,RoleBindingList instance){
            this(fluent, instance, true);
    }
    public RoleBindingListBuilder(RoleBindingListFluent<?> fluent,RoleBindingList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public RoleBindingListBuilder(RoleBindingList instance){
            this(instance,true);
    }
    public RoleBindingListBuilder(RoleBindingList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public RoleBindingListBuilder(Validator validator){
            this(new RoleBindingList(), true);
    }
    public RoleBindingListBuilder(RoleBindingListFluent<?> fluent,RoleBindingList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public RoleBindingListBuilder(RoleBindingList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public RoleBindingList build(){
            RoleBindingList buildable = new RoleBindingList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RoleBindingListBuilder that = (RoleBindingListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
