package io.fabric8.kubernetes.api.model.admissionregistration;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableRuleWithOperations extends RuleWithOperationsFluentImpl<DoneableRuleWithOperations> implements Doneable<RuleWithOperations>{

    private final RuleWithOperationsBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<RuleWithOperations,RuleWithOperations> function;

    public DoneableRuleWithOperations(io.fabric8.kubernetes.api.builder.Function<RuleWithOperations,RuleWithOperations> function){
            super();this.builder=new RuleWithOperationsBuilder(this);this.function=function;
    }
    public DoneableRuleWithOperations(RuleWithOperations item,io.fabric8.kubernetes.api.builder.Function<RuleWithOperations,RuleWithOperations> function){
            super(item);this.builder=new RuleWithOperationsBuilder(this, item);this.function=function;
    }
    public DoneableRuleWithOperations(RuleWithOperations item){
            super(item);this.builder=new RuleWithOperationsBuilder(this, item);this.function=new Function<RuleWithOperations, RuleWithOperations>() {
    public RuleWithOperations apply(RuleWithOperations item) {
        return item;
    }
}
;
    }

    public RuleWithOperations done(){
             return function.apply(builder.build());
    }




}
