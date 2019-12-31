package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class OpenshiftClusterRoleBindingListBuilder extends OpenshiftClusterRoleBindingListFluentImpl<OpenshiftClusterRoleBindingListBuilder> implements VisitableBuilder<OpenshiftClusterRoleBindingList,OpenshiftClusterRoleBindingListBuilder>{

    OpenshiftClusterRoleBindingListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public OpenshiftClusterRoleBindingListBuilder(){
            this(true);
    }
    public OpenshiftClusterRoleBindingListBuilder(Boolean validationEnabled){
            this(new OpenshiftClusterRoleBindingList(), validationEnabled);
    }
    public OpenshiftClusterRoleBindingListBuilder(OpenshiftClusterRoleBindingListFluent<?> fluent){
            this(fluent, true);
    }
    public OpenshiftClusterRoleBindingListBuilder(OpenshiftClusterRoleBindingListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new OpenshiftClusterRoleBindingList(), validationEnabled);
    }
    public OpenshiftClusterRoleBindingListBuilder(OpenshiftClusterRoleBindingListFluent<?> fluent,OpenshiftClusterRoleBindingList instance){
            this(fluent, instance, true);
    }
    public OpenshiftClusterRoleBindingListBuilder(OpenshiftClusterRoleBindingListFluent<?> fluent,OpenshiftClusterRoleBindingList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public OpenshiftClusterRoleBindingListBuilder(OpenshiftClusterRoleBindingList instance){
            this(instance,true);
    }
    public OpenshiftClusterRoleBindingListBuilder(OpenshiftClusterRoleBindingList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public OpenshiftClusterRoleBindingListBuilder(Validator validator){
            this(new OpenshiftClusterRoleBindingList(), true);
    }
    public OpenshiftClusterRoleBindingListBuilder(OpenshiftClusterRoleBindingListFluent<?> fluent,OpenshiftClusterRoleBindingList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public OpenshiftClusterRoleBindingListBuilder(OpenshiftClusterRoleBindingList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public OpenshiftClusterRoleBindingList build(){
            OpenshiftClusterRoleBindingList buildable = new OpenshiftClusterRoleBindingList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            OpenshiftClusterRoleBindingListBuilder that = (OpenshiftClusterRoleBindingListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
