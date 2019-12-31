package io.fabric8.kubernetes.api.model.admissionregistration;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class RuleBuilder extends RuleFluentImpl<RuleBuilder> implements VisitableBuilder<Rule,RuleBuilder>{

    RuleFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public RuleBuilder(){
            this(true);
    }
    public RuleBuilder(Boolean validationEnabled){
            this(new Rule(), validationEnabled);
    }
    public RuleBuilder(RuleFluent<?> fluent){
            this(fluent, true);
    }
    public RuleBuilder(RuleFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new Rule(), validationEnabled);
    }
    public RuleBuilder(RuleFluent<?> fluent,Rule instance){
            this(fluent, instance, true);
    }
    public RuleBuilder(RuleFluent<?> fluent,Rule instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiGroups(instance.getApiGroups()); 
            fluent.withApiVersions(instance.getApiVersions()); 
            fluent.withResources(instance.getResources()); 
            this.validationEnabled = validationEnabled; 
    }
    public RuleBuilder(Rule instance){
            this(instance,true);
    }
    public RuleBuilder(Rule instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiGroups(instance.getApiGroups()); 
            this.withApiVersions(instance.getApiVersions()); 
            this.withResources(instance.getResources()); 
            this.validationEnabled = validationEnabled; 
    }
    public RuleBuilder(Validator validator){
            this(new Rule(), true);
    }
    public RuleBuilder(RuleFluent<?> fluent,Rule instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiGroups(instance.getApiGroups()); 
            fluent.withApiVersions(instance.getApiVersions()); 
            fluent.withResources(instance.getResources()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public RuleBuilder(Rule instance,Validator validator){
            this.fluent = this; 
            this.withApiGroups(instance.getApiGroups()); 
            this.withApiVersions(instance.getApiVersions()); 
            this.withResources(instance.getResources()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public Rule build(){
            Rule buildable = new Rule(fluent.getApiGroups(),fluent.getApiVersions(),fluent.getResources());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RuleBuilder that = (RuleBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
