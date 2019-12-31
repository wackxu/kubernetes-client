package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class OpenshiftRoleBindingListBuilder extends OpenshiftRoleBindingListFluentImpl<OpenshiftRoleBindingListBuilder> implements VisitableBuilder<OpenshiftRoleBindingList,OpenshiftRoleBindingListBuilder>{

    OpenshiftRoleBindingListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public OpenshiftRoleBindingListBuilder(){
            this(true);
    }
    public OpenshiftRoleBindingListBuilder(Boolean validationEnabled){
            this(new OpenshiftRoleBindingList(), validationEnabled);
    }
    public OpenshiftRoleBindingListBuilder(OpenshiftRoleBindingListFluent<?> fluent){
            this(fluent, true);
    }
    public OpenshiftRoleBindingListBuilder(OpenshiftRoleBindingListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new OpenshiftRoleBindingList(), validationEnabled);
    }
    public OpenshiftRoleBindingListBuilder(OpenshiftRoleBindingListFluent<?> fluent,OpenshiftRoleBindingList instance){
            this(fluent, instance, true);
    }
    public OpenshiftRoleBindingListBuilder(OpenshiftRoleBindingListFluent<?> fluent,OpenshiftRoleBindingList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public OpenshiftRoleBindingListBuilder(OpenshiftRoleBindingList instance){
            this(instance,true);
    }
    public OpenshiftRoleBindingListBuilder(OpenshiftRoleBindingList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public OpenshiftRoleBindingListBuilder(Validator validator){
            this(new OpenshiftRoleBindingList(), true);
    }
    public OpenshiftRoleBindingListBuilder(OpenshiftRoleBindingListFluent<?> fluent,OpenshiftRoleBindingList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public OpenshiftRoleBindingListBuilder(OpenshiftRoleBindingList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public OpenshiftRoleBindingList build(){
            OpenshiftRoleBindingList buildable = new OpenshiftRoleBindingList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            OpenshiftRoleBindingListBuilder that = (OpenshiftRoleBindingListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
