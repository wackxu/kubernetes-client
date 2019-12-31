package io.fabric8.kubernetes.api.model.rbac;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableAggregationRule extends AggregationRuleFluentImpl<DoneableAggregationRule> implements Doneable<AggregationRule>{

    private final AggregationRuleBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<AggregationRule,AggregationRule> function;

    public DoneableAggregationRule(io.fabric8.kubernetes.api.builder.Function<AggregationRule,AggregationRule> function){
            super();this.builder=new AggregationRuleBuilder(this);this.function=function;
    }
    public DoneableAggregationRule(AggregationRule item,io.fabric8.kubernetes.api.builder.Function<AggregationRule,AggregationRule> function){
            super(item);this.builder=new AggregationRuleBuilder(this, item);this.function=function;
    }
    public DoneableAggregationRule(AggregationRule item){
            super(item);this.builder=new AggregationRuleBuilder(this, item);this.function=new Function<AggregationRule, AggregationRule>() {
    public AggregationRule apply(AggregationRule item) {
        return item;
    }
}
;
    }

    public AggregationRule done(){
             return function.apply(builder.build());
    }




}
