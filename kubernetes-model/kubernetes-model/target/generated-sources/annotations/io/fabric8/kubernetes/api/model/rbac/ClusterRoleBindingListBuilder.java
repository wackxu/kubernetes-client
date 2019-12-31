package io.fabric8.kubernetes.api.model.rbac;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ClusterRoleBindingListBuilder extends ClusterRoleBindingListFluentImpl<ClusterRoleBindingListBuilder> implements VisitableBuilder<ClusterRoleBindingList,ClusterRoleBindingListBuilder>{

    ClusterRoleBindingListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ClusterRoleBindingListBuilder(){
            this(true);
    }
    public ClusterRoleBindingListBuilder(Boolean validationEnabled){
            this(new ClusterRoleBindingList(), validationEnabled);
    }
    public ClusterRoleBindingListBuilder(ClusterRoleBindingListFluent<?> fluent){
            this(fluent, true);
    }
    public ClusterRoleBindingListBuilder(ClusterRoleBindingListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ClusterRoleBindingList(), validationEnabled);
    }
    public ClusterRoleBindingListBuilder(ClusterRoleBindingListFluent<?> fluent,ClusterRoleBindingList instance){
            this(fluent, instance, true);
    }
    public ClusterRoleBindingListBuilder(ClusterRoleBindingListFluent<?> fluent,ClusterRoleBindingList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public ClusterRoleBindingListBuilder(ClusterRoleBindingList instance){
            this(instance,true);
    }
    public ClusterRoleBindingListBuilder(ClusterRoleBindingList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public ClusterRoleBindingListBuilder(Validator validator){
            this(new ClusterRoleBindingList(), true);
    }
    public ClusterRoleBindingListBuilder(ClusterRoleBindingListFluent<?> fluent,ClusterRoleBindingList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ClusterRoleBindingListBuilder(ClusterRoleBindingList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ClusterRoleBindingList build(){
            ClusterRoleBindingList buildable = new ClusterRoleBindingList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ClusterRoleBindingListBuilder that = (ClusterRoleBindingListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
