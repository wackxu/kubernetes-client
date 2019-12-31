package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class OpenshiftClusterRoleScopeRestrictionBuilder extends OpenshiftClusterRoleScopeRestrictionFluentImpl<OpenshiftClusterRoleScopeRestrictionBuilder> implements VisitableBuilder<OpenshiftClusterRoleScopeRestriction,OpenshiftClusterRoleScopeRestrictionBuilder>{

    OpenshiftClusterRoleScopeRestrictionFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public OpenshiftClusterRoleScopeRestrictionBuilder(){
            this(true);
    }
    public OpenshiftClusterRoleScopeRestrictionBuilder(Boolean validationEnabled){
            this(new OpenshiftClusterRoleScopeRestriction(), validationEnabled);
    }
    public OpenshiftClusterRoleScopeRestrictionBuilder(OpenshiftClusterRoleScopeRestrictionFluent<?> fluent){
            this(fluent, true);
    }
    public OpenshiftClusterRoleScopeRestrictionBuilder(OpenshiftClusterRoleScopeRestrictionFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new OpenshiftClusterRoleScopeRestriction(), validationEnabled);
    }
    public OpenshiftClusterRoleScopeRestrictionBuilder(OpenshiftClusterRoleScopeRestrictionFluent<?> fluent,OpenshiftClusterRoleScopeRestriction instance){
            this(fluent, instance, true);
    }
    public OpenshiftClusterRoleScopeRestrictionBuilder(OpenshiftClusterRoleScopeRestrictionFluent<?> fluent,OpenshiftClusterRoleScopeRestriction instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAllowEscalation(instance.getAllowEscalation()); 
            fluent.withNamespaces(instance.getNamespaces()); 
            fluent.withRoleNames(instance.getRoleNames()); 
            this.validationEnabled = validationEnabled; 
    }
    public OpenshiftClusterRoleScopeRestrictionBuilder(OpenshiftClusterRoleScopeRestriction instance){
            this(instance,true);
    }
    public OpenshiftClusterRoleScopeRestrictionBuilder(OpenshiftClusterRoleScopeRestriction instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAllowEscalation(instance.getAllowEscalation()); 
            this.withNamespaces(instance.getNamespaces()); 
            this.withRoleNames(instance.getRoleNames()); 
            this.validationEnabled = validationEnabled; 
    }
    public OpenshiftClusterRoleScopeRestrictionBuilder(Validator validator){
            this(new OpenshiftClusterRoleScopeRestriction(), true);
    }
    public OpenshiftClusterRoleScopeRestrictionBuilder(OpenshiftClusterRoleScopeRestrictionFluent<?> fluent,OpenshiftClusterRoleScopeRestriction instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAllowEscalation(instance.getAllowEscalation()); 
            fluent.withNamespaces(instance.getNamespaces()); 
            fluent.withRoleNames(instance.getRoleNames()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public OpenshiftClusterRoleScopeRestrictionBuilder(OpenshiftClusterRoleScopeRestriction instance,Validator validator){
            this.fluent = this; 
            this.withAllowEscalation(instance.getAllowEscalation()); 
            this.withNamespaces(instance.getNamespaces()); 
            this.withRoleNames(instance.getRoleNames()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public OpenshiftClusterRoleScopeRestriction build(){
            OpenshiftClusterRoleScopeRestriction buildable = new OpenshiftClusterRoleScopeRestriction(fluent.isAllowEscalation(),fluent.getNamespaces(),fluent.getRoleNames());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            OpenshiftClusterRoleScopeRestrictionBuilder that = (OpenshiftClusterRoleScopeRestrictionBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
