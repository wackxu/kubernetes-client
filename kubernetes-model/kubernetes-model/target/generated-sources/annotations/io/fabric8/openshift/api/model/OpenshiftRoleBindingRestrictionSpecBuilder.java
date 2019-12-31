package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class OpenshiftRoleBindingRestrictionSpecBuilder extends OpenshiftRoleBindingRestrictionSpecFluentImpl<OpenshiftRoleBindingRestrictionSpecBuilder> implements VisitableBuilder<OpenshiftRoleBindingRestrictionSpec,OpenshiftRoleBindingRestrictionSpecBuilder>{

    OpenshiftRoleBindingRestrictionSpecFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public OpenshiftRoleBindingRestrictionSpecBuilder(){
            this(true);
    }
    public OpenshiftRoleBindingRestrictionSpecBuilder(Boolean validationEnabled){
            this(new OpenshiftRoleBindingRestrictionSpec(), validationEnabled);
    }
    public OpenshiftRoleBindingRestrictionSpecBuilder(OpenshiftRoleBindingRestrictionSpecFluent<?> fluent){
            this(fluent, true);
    }
    public OpenshiftRoleBindingRestrictionSpecBuilder(OpenshiftRoleBindingRestrictionSpecFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new OpenshiftRoleBindingRestrictionSpec(), validationEnabled);
    }
    public OpenshiftRoleBindingRestrictionSpecBuilder(OpenshiftRoleBindingRestrictionSpecFluent<?> fluent,OpenshiftRoleBindingRestrictionSpec instance){
            this(fluent, instance, true);
    }
    public OpenshiftRoleBindingRestrictionSpecBuilder(OpenshiftRoleBindingRestrictionSpecFluent<?> fluent,OpenshiftRoleBindingRestrictionSpec instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withGrouprestriction(instance.getGrouprestriction()); 
            fluent.withServiceaccountrestriction(instance.getServiceaccountrestriction()); 
            fluent.withUserrestriction(instance.getUserrestriction()); 
            this.validationEnabled = validationEnabled; 
    }
    public OpenshiftRoleBindingRestrictionSpecBuilder(OpenshiftRoleBindingRestrictionSpec instance){
            this(instance,true);
    }
    public OpenshiftRoleBindingRestrictionSpecBuilder(OpenshiftRoleBindingRestrictionSpec instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withGrouprestriction(instance.getGrouprestriction()); 
            this.withServiceaccountrestriction(instance.getServiceaccountrestriction()); 
            this.withUserrestriction(instance.getUserrestriction()); 
            this.validationEnabled = validationEnabled; 
    }
    public OpenshiftRoleBindingRestrictionSpecBuilder(Validator validator){
            this(new OpenshiftRoleBindingRestrictionSpec(), true);
    }
    public OpenshiftRoleBindingRestrictionSpecBuilder(OpenshiftRoleBindingRestrictionSpecFluent<?> fluent,OpenshiftRoleBindingRestrictionSpec instance,Validator validator){
            this.fluent = fluent; 
            fluent.withGrouprestriction(instance.getGrouprestriction()); 
            fluent.withServiceaccountrestriction(instance.getServiceaccountrestriction()); 
            fluent.withUserrestriction(instance.getUserrestriction()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public OpenshiftRoleBindingRestrictionSpecBuilder(OpenshiftRoleBindingRestrictionSpec instance,Validator validator){
            this.fluent = this; 
            this.withGrouprestriction(instance.getGrouprestriction()); 
            this.withServiceaccountrestriction(instance.getServiceaccountrestriction()); 
            this.withUserrestriction(instance.getUserrestriction()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public OpenshiftRoleBindingRestrictionSpec build(){
            OpenshiftRoleBindingRestrictionSpec buildable = new OpenshiftRoleBindingRestrictionSpec(fluent.getGrouprestriction(),fluent.getServiceaccountrestriction(),fluent.getUserrestriction());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            OpenshiftRoleBindingRestrictionSpecBuilder that = (OpenshiftRoleBindingRestrictionSpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
