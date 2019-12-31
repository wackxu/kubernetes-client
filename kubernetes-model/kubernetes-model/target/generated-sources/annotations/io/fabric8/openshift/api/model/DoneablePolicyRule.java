package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneablePolicyRule extends io.fabric8.openshift.api.model.PolicyRuleFluentImpl<DoneablePolicyRule> implements Doneable<io.fabric8.openshift.api.model.PolicyRule>{

    private final io.fabric8.openshift.api.model.PolicyRuleBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<io.fabric8.openshift.api.model.PolicyRule,io.fabric8.openshift.api.model.PolicyRule> function;

    public DoneablePolicyRule(io.fabric8.kubernetes.api.builder.Function<io.fabric8.openshift.api.model.PolicyRule,io.fabric8.openshift.api.model.PolicyRule> function){
            super();this.builder=new PolicyRuleBuilder(this);this.function=function;
    }
    public DoneablePolicyRule(io.fabric8.openshift.api.model.PolicyRule item,io.fabric8.kubernetes.api.builder.Function<io.fabric8.openshift.api.model.PolicyRule,io.fabric8.openshift.api.model.PolicyRule> function){
            super(item);this.builder=new PolicyRuleBuilder(this, item);this.function=function;
    }
    public DoneablePolicyRule(io.fabric8.openshift.api.model.PolicyRule item){
            super(item);this.builder=new PolicyRuleBuilder(this, item);this.function=new Function<io.fabric8.openshift.api.model.PolicyRule, io.fabric8.openshift.api.model.PolicyRule>() {
    public io.fabric8.openshift.api.model.PolicyRule apply(io.fabric8.openshift.api.model.PolicyRule item) {
        return item;
    }
}
;
    }

    public io.fabric8.openshift.api.model.PolicyRule done(){
             return function.apply(builder.build());
    }




}
