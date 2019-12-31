package io.fabric8.kubernetes.api.model.rbac;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ClusterRoleListBuilder extends ClusterRoleListFluentImpl<ClusterRoleListBuilder> implements VisitableBuilder<ClusterRoleList,ClusterRoleListBuilder>{

    ClusterRoleListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ClusterRoleListBuilder(){
            this(true);
    }
    public ClusterRoleListBuilder(Boolean validationEnabled){
            this(new ClusterRoleList(), validationEnabled);
    }
    public ClusterRoleListBuilder(ClusterRoleListFluent<?> fluent){
            this(fluent, true);
    }
    public ClusterRoleListBuilder(ClusterRoleListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ClusterRoleList(), validationEnabled);
    }
    public ClusterRoleListBuilder(ClusterRoleListFluent<?> fluent,ClusterRoleList instance){
            this(fluent, instance, true);
    }
    public ClusterRoleListBuilder(ClusterRoleListFluent<?> fluent,ClusterRoleList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public ClusterRoleListBuilder(ClusterRoleList instance){
            this(instance,true);
    }
    public ClusterRoleListBuilder(ClusterRoleList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public ClusterRoleListBuilder(Validator validator){
            this(new ClusterRoleList(), true);
    }
    public ClusterRoleListBuilder(ClusterRoleListFluent<?> fluent,ClusterRoleList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ClusterRoleListBuilder(ClusterRoleList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ClusterRoleList build(){
            ClusterRoleList buildable = new ClusterRoleList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ClusterRoleListBuilder that = (ClusterRoleListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
