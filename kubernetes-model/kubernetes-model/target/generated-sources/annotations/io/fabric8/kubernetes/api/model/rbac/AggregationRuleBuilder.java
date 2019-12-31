package io.fabric8.kubernetes.api.model.rbac;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class AggregationRuleBuilder extends AggregationRuleFluentImpl<AggregationRuleBuilder> implements VisitableBuilder<AggregationRule,AggregationRuleBuilder>{

    AggregationRuleFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public AggregationRuleBuilder(){
            this(true);
    }
    public AggregationRuleBuilder(Boolean validationEnabled){
            this(new AggregationRule(), validationEnabled);
    }
    public AggregationRuleBuilder(AggregationRuleFluent<?> fluent){
            this(fluent, true);
    }
    public AggregationRuleBuilder(AggregationRuleFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new AggregationRule(), validationEnabled);
    }
    public AggregationRuleBuilder(AggregationRuleFluent<?> fluent,AggregationRule instance){
            this(fluent, instance, true);
    }
    public AggregationRuleBuilder(AggregationRuleFluent<?> fluent,AggregationRule instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withClusterRoleSelectors(instance.getClusterRoleSelectors()); 
            this.validationEnabled = validationEnabled; 
    }
    public AggregationRuleBuilder(AggregationRule instance){
            this(instance,true);
    }
    public AggregationRuleBuilder(AggregationRule instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withClusterRoleSelectors(instance.getClusterRoleSelectors()); 
            this.validationEnabled = validationEnabled; 
    }
    public AggregationRuleBuilder(Validator validator){
            this(new AggregationRule(), true);
    }
    public AggregationRuleBuilder(AggregationRuleFluent<?> fluent,AggregationRule instance,Validator validator){
            this.fluent = fluent; 
            fluent.withClusterRoleSelectors(instance.getClusterRoleSelectors()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public AggregationRuleBuilder(AggregationRule instance,Validator validator){
            this.fluent = this; 
            this.withClusterRoleSelectors(instance.getClusterRoleSelectors()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public AggregationRule build(){
            AggregationRule buildable = new AggregationRule(fluent.getClusterRoleSelectors());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            AggregationRuleBuilder that = (AggregationRuleBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
