package io.fabric8.kubernetes.api.model.admissionregistration;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableRule extends RuleFluentImpl<DoneableRule> implements Doneable<Rule>{

    private final RuleBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Rule,Rule> function;

    public DoneableRule(io.fabric8.kubernetes.api.builder.Function<Rule,Rule> function){
            super();this.builder=new RuleBuilder(this);this.function=function;
    }
    public DoneableRule(Rule item,io.fabric8.kubernetes.api.builder.Function<Rule,Rule> function){
            super(item);this.builder=new RuleBuilder(this, item);this.function=function;
    }
    public DoneableRule(Rule item){
            super(item);this.builder=new RuleBuilder(this, item);this.function=new Function<Rule, Rule>() {
    public Rule apply(Rule item) {
        return item;
    }
}
;
    }

    public Rule done(){
             return function.apply(builder.build());
    }




}
