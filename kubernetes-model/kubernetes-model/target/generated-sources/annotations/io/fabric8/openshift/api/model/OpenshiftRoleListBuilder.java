package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class OpenshiftRoleListBuilder extends OpenshiftRoleListFluentImpl<OpenshiftRoleListBuilder> implements VisitableBuilder<OpenshiftRoleList,OpenshiftRoleListBuilder>{

    OpenshiftRoleListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public OpenshiftRoleListBuilder(){
            this(true);
    }
    public OpenshiftRoleListBuilder(Boolean validationEnabled){
            this(new OpenshiftRoleList(), validationEnabled);
    }
    public OpenshiftRoleListBuilder(OpenshiftRoleListFluent<?> fluent){
            this(fluent, true);
    }
    public OpenshiftRoleListBuilder(OpenshiftRoleListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new OpenshiftRoleList(), validationEnabled);
    }
    public OpenshiftRoleListBuilder(OpenshiftRoleListFluent<?> fluent,OpenshiftRoleList instance){
            this(fluent, instance, true);
    }
    public OpenshiftRoleListBuilder(OpenshiftRoleListFluent<?> fluent,OpenshiftRoleList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public OpenshiftRoleListBuilder(OpenshiftRoleList instance){
            this(instance,true);
    }
    public OpenshiftRoleListBuilder(OpenshiftRoleList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public OpenshiftRoleListBuilder(Validator validator){
            this(new OpenshiftRoleList(), true);
    }
    public OpenshiftRoleListBuilder(OpenshiftRoleListFluent<?> fluent,OpenshiftRoleList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public OpenshiftRoleListBuilder(OpenshiftRoleList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public OpenshiftRoleList build(){
            OpenshiftRoleList buildable = new OpenshiftRoleList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            OpenshiftRoleListBuilder that = (OpenshiftRoleListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
