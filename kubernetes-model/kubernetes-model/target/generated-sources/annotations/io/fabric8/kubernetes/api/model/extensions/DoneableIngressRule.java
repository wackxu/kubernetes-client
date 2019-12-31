package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableIngressRule extends IngressRuleFluentImpl<DoneableIngressRule> implements Doneable<IngressRule>{

    private final IngressRuleBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<IngressRule,IngressRule> function;

    public DoneableIngressRule(io.fabric8.kubernetes.api.builder.Function<IngressRule,IngressRule> function){
            super();this.builder=new IngressRuleBuilder(this);this.function=function;
    }
    public DoneableIngressRule(IngressRule item,io.fabric8.kubernetes.api.builder.Function<IngressRule,IngressRule> function){
            super(item);this.builder=new IngressRuleBuilder(this, item);this.function=function;
    }
    public DoneableIngressRule(IngressRule item){
            super(item);this.builder=new IngressRuleBuilder(this, item);this.function=new Function<IngressRule, IngressRule>() {
    public IngressRule apply(IngressRule item) {
        return item;
    }
}
;
    }

    public IngressRule done(){
             return function.apply(builder.build());
    }




}
