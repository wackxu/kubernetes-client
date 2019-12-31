package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class OpenshiftRoleBindingRestrictionBuilder extends OpenshiftRoleBindingRestrictionFluentImpl<OpenshiftRoleBindingRestrictionBuilder> implements VisitableBuilder<OpenshiftRoleBindingRestriction,OpenshiftRoleBindingRestrictionBuilder>{

    OpenshiftRoleBindingRestrictionFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public OpenshiftRoleBindingRestrictionBuilder(){
            this(true);
    }
    public OpenshiftRoleBindingRestrictionBuilder(Boolean validationEnabled){
            this(new OpenshiftRoleBindingRestriction(), validationEnabled);
    }
    public OpenshiftRoleBindingRestrictionBuilder(OpenshiftRoleBindingRestrictionFluent<?> fluent){
            this(fluent, true);
    }
    public OpenshiftRoleBindingRestrictionBuilder(OpenshiftRoleBindingRestrictionFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new OpenshiftRoleBindingRestriction(), validationEnabled);
    }
    public OpenshiftRoleBindingRestrictionBuilder(OpenshiftRoleBindingRestrictionFluent<?> fluent,OpenshiftRoleBindingRestriction instance){
            this(fluent, instance, true);
    }
    public OpenshiftRoleBindingRestrictionBuilder(OpenshiftRoleBindingRestrictionFluent<?> fluent,OpenshiftRoleBindingRestriction instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            this.validationEnabled = validationEnabled; 
    }
    public OpenshiftRoleBindingRestrictionBuilder(OpenshiftRoleBindingRestriction instance){
            this(instance,true);
    }
    public OpenshiftRoleBindingRestrictionBuilder(OpenshiftRoleBindingRestriction instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.validationEnabled = validationEnabled; 
    }
    public OpenshiftRoleBindingRestrictionBuilder(Validator validator){
            this(new OpenshiftRoleBindingRestriction(), true);
    }
    public OpenshiftRoleBindingRestrictionBuilder(OpenshiftRoleBindingRestrictionFluent<?> fluent,OpenshiftRoleBindingRestriction instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public OpenshiftRoleBindingRestrictionBuilder(OpenshiftRoleBindingRestriction instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public OpenshiftRoleBindingRestriction build(){
            OpenshiftRoleBindingRestriction buildable = new OpenshiftRoleBindingRestriction(fluent.getApiVersion(),fluent.getKind(),fluent.getMetadata(),fluent.getSpec());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            OpenshiftRoleBindingRestrictionBuilder that = (OpenshiftRoleBindingRestrictionBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
