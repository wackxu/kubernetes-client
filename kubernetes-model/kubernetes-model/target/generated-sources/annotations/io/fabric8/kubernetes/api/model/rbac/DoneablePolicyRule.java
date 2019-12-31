package io.fabric8.kubernetes.api.model.rbac;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneablePolicyRule extends PolicyRuleFluentImpl<DoneablePolicyRule> implements Doneable<PolicyRule>{

    private final PolicyRuleBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<PolicyRule,PolicyRule> function;

    public DoneablePolicyRule(io.fabric8.kubernetes.api.builder.Function<PolicyRule,PolicyRule> function){
            super();this.builder=new PolicyRuleBuilder(this);this.function=function;
    }
    public DoneablePolicyRule(PolicyRule item,io.fabric8.kubernetes.api.builder.Function<PolicyRule,PolicyRule> function){
            super(item);this.builder=new PolicyRuleBuilder(this, item);this.function=function;
    }
    public DoneablePolicyRule(PolicyRule item){
            super(item);this.builder=new PolicyRuleBuilder(this, item);this.function=new Function<PolicyRule, PolicyRule>() {
    public PolicyRule apply(PolicyRule item) {
        return item;
    }
}
;
    }

    public PolicyRule done(){
             return function.apply(builder.build());
    }




}
