package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class OpenshiftClusterRoleBuilder extends OpenshiftClusterRoleFluentImpl<OpenshiftClusterRoleBuilder> implements VisitableBuilder<OpenshiftClusterRole,OpenshiftClusterRoleBuilder>{

    OpenshiftClusterRoleFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public OpenshiftClusterRoleBuilder(){
            this(true);
    }
    public OpenshiftClusterRoleBuilder(Boolean validationEnabled){
            this(new OpenshiftClusterRole(), validationEnabled);
    }
    public OpenshiftClusterRoleBuilder(OpenshiftClusterRoleFluent<?> fluent){
            this(fluent, true);
    }
    public OpenshiftClusterRoleBuilder(OpenshiftClusterRoleFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new OpenshiftClusterRole(), validationEnabled);
    }
    public OpenshiftClusterRoleBuilder(OpenshiftClusterRoleFluent<?> fluent,OpenshiftClusterRole instance){
            this(fluent, instance, true);
    }
    public OpenshiftClusterRoleBuilder(OpenshiftClusterRoleFluent<?> fluent,OpenshiftClusterRole instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAggregationRule(instance.getAggregationRule()); 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withRules(instance.getRules()); 
            this.validationEnabled = validationEnabled; 
    }
    public OpenshiftClusterRoleBuilder(OpenshiftClusterRole instance){
            this(instance,true);
    }
    public OpenshiftClusterRoleBuilder(OpenshiftClusterRole instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAggregationRule(instance.getAggregationRule()); 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withRules(instance.getRules()); 
            this.validationEnabled = validationEnabled; 
    }
    public OpenshiftClusterRoleBuilder(Validator validator){
            this(new OpenshiftClusterRole(), true);
    }
    public OpenshiftClusterRoleBuilder(OpenshiftClusterRoleFluent<?> fluent,OpenshiftClusterRole instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAggregationRule(instance.getAggregationRule()); 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withRules(instance.getRules()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public OpenshiftClusterRoleBuilder(OpenshiftClusterRole instance,Validator validator){
            this.fluent = this; 
            this.withAggregationRule(instance.getAggregationRule()); 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withRules(instance.getRules()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public OpenshiftClusterRole build(){
            OpenshiftClusterRole buildable = new OpenshiftClusterRole(fluent.getAggregationRule(),fluent.getApiVersion(),fluent.getKind(),fluent.getMetadata(),fluent.getRules());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            OpenshiftClusterRoleBuilder that = (OpenshiftClusterRoleBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
