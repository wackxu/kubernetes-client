package io.fabric8.kubernetes.api.model.rbac;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class RoleListBuilder extends RoleListFluentImpl<RoleListBuilder> implements VisitableBuilder<RoleList,RoleListBuilder>{

    RoleListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public RoleListBuilder(){
            this(true);
    }
    public RoleListBuilder(Boolean validationEnabled){
            this(new RoleList(), validationEnabled);
    }
    public RoleListBuilder(RoleListFluent<?> fluent){
            this(fluent, true);
    }
    public RoleListBuilder(RoleListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new RoleList(), validationEnabled);
    }
    public RoleListBuilder(RoleListFluent<?> fluent,RoleList instance){
            this(fluent, instance, true);
    }
    public RoleListBuilder(RoleListFluent<?> fluent,RoleList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public RoleListBuilder(RoleList instance){
            this(instance,true);
    }
    public RoleListBuilder(RoleList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public RoleListBuilder(Validator validator){
            this(new RoleList(), true);
    }
    public RoleListBuilder(RoleListFluent<?> fluent,RoleList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public RoleListBuilder(RoleList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public RoleList build(){
            RoleList buildable = new RoleList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RoleListBuilder that = (RoleListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
