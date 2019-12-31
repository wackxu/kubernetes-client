package io.fabric8.kubernetes.api.model.rbac;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ClusterRoleBuilder extends ClusterRoleFluentImpl<ClusterRoleBuilder> implements VisitableBuilder<ClusterRole,ClusterRoleBuilder>{

    ClusterRoleFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ClusterRoleBuilder(){
            this(true);
    }
    public ClusterRoleBuilder(Boolean validationEnabled){
            this(new ClusterRole(), validationEnabled);
    }
    public ClusterRoleBuilder(ClusterRoleFluent<?> fluent){
            this(fluent, true);
    }
    public ClusterRoleBuilder(ClusterRoleFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ClusterRole(), validationEnabled);
    }
    public ClusterRoleBuilder(ClusterRoleFluent<?> fluent,ClusterRole instance){
            this(fluent, instance, true);
    }
    public ClusterRoleBuilder(ClusterRoleFluent<?> fluent,ClusterRole instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAggregationRule(instance.getAggregationRule()); 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withRules(instance.getRules()); 
            this.validationEnabled = validationEnabled; 
    }
    public ClusterRoleBuilder(ClusterRole instance){
            this(instance,true);
    }
    public ClusterRoleBuilder(ClusterRole instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAggregationRule(instance.getAggregationRule()); 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withRules(instance.getRules()); 
            this.validationEnabled = validationEnabled; 
    }
    public ClusterRoleBuilder(Validator validator){
            this(new ClusterRole(), true);
    }
    public ClusterRoleBuilder(ClusterRoleFluent<?> fluent,ClusterRole instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAggregationRule(instance.getAggregationRule()); 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withRules(instance.getRules()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ClusterRoleBuilder(ClusterRole instance,Validator validator){
            this.fluent = this; 
            this.withAggregationRule(instance.getAggregationRule()); 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withRules(instance.getRules()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ClusterRole build(){
            ClusterRole buildable = new ClusterRole(fluent.getAggregationRule(),fluent.getApiVersion(),fluent.getKind(),fluent.getMetadata(),fluent.getRules());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ClusterRoleBuilder that = (ClusterRoleBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
