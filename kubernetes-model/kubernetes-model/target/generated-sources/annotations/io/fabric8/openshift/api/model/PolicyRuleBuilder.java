package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PolicyRuleBuilder extends io.fabric8.openshift.api.model.PolicyRuleFluentImpl<io.fabric8.openshift.api.model.PolicyRuleBuilder> implements VisitableBuilder<io.fabric8.openshift.api.model.PolicyRule,io.fabric8.openshift.api.model.PolicyRuleBuilder>{

    io.fabric8.openshift.api.model.PolicyRuleFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PolicyRuleBuilder(){
            this(true);
    }
    public PolicyRuleBuilder(Boolean validationEnabled){
            this(new PolicyRule(), validationEnabled);
    }
    public PolicyRuleBuilder(io.fabric8.openshift.api.model.PolicyRuleFluent<?> fluent){
            this(fluent, true);
    }
    public PolicyRuleBuilder(io.fabric8.openshift.api.model.PolicyRuleFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new PolicyRule(), validationEnabled);
    }
    public PolicyRuleBuilder(io.fabric8.openshift.api.model.PolicyRuleFluent<?> fluent,io.fabric8.openshift.api.model.PolicyRule instance){
            this(fluent, instance, true);
    }
    public PolicyRuleBuilder(io.fabric8.openshift.api.model.PolicyRuleFluent<?> fluent,io.fabric8.openshift.api.model.PolicyRule instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiGroups(instance.getApiGroups()); 
            fluent.withAttributeRestrictions(instance.getAttributeRestrictions()); 
            fluent.withNonResourceURLs(instance.getNonResourceURLs()); 
            fluent.withResourceNames(instance.getResourceNames()); 
            fluent.withResources(instance.getResources()); 
            fluent.withVerbs(instance.getVerbs()); 
            this.validationEnabled = validationEnabled; 
    }
    public PolicyRuleBuilder(io.fabric8.openshift.api.model.PolicyRule instance){
            this(instance,true);
    }
    public PolicyRuleBuilder(io.fabric8.openshift.api.model.PolicyRule instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiGroups(instance.getApiGroups()); 
            this.withAttributeRestrictions(instance.getAttributeRestrictions()); 
            this.withNonResourceURLs(instance.getNonResourceURLs()); 
            this.withResourceNames(instance.getResourceNames()); 
            this.withResources(instance.getResources()); 
            this.withVerbs(instance.getVerbs()); 
            this.validationEnabled = validationEnabled; 
    }
    public PolicyRuleBuilder(Validator validator){
            this(new PolicyRule(), true);
    }
    public PolicyRuleBuilder(io.fabric8.openshift.api.model.PolicyRuleFluent<?> fluent,io.fabric8.openshift.api.model.PolicyRule instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiGroups(instance.getApiGroups()); 
            fluent.withAttributeRestrictions(instance.getAttributeRestrictions()); 
            fluent.withNonResourceURLs(instance.getNonResourceURLs()); 
            fluent.withResourceNames(instance.getResourceNames()); 
            fluent.withResources(instance.getResources()); 
            fluent.withVerbs(instance.getVerbs()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PolicyRuleBuilder(io.fabric8.openshift.api.model.PolicyRule instance,Validator validator){
            this.fluent = this; 
            this.withApiGroups(instance.getApiGroups()); 
            this.withAttributeRestrictions(instance.getAttributeRestrictions()); 
            this.withNonResourceURLs(instance.getNonResourceURLs()); 
            this.withResourceNames(instance.getResourceNames()); 
            this.withResources(instance.getResources()); 
            this.withVerbs(instance.getVerbs()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public io.fabric8.openshift.api.model.PolicyRule build(){
            PolicyRule buildable = new PolicyRule(fluent.getApiGroups(),fluent.getAttributeRestrictions(),fluent.getNonResourceURLs(),fluent.getResourceNames(),fluent.getResources(),fluent.getVerbs());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PolicyRuleBuilder that = (PolicyRuleBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
