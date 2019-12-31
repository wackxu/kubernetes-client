package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableComponentCondition extends ComponentConditionFluentImpl<DoneableComponentCondition> implements Doneable<ComponentCondition>{

    private final ComponentConditionBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ComponentCondition,ComponentCondition> function;

    public DoneableComponentCondition(io.fabric8.kubernetes.api.builder.Function<ComponentCondition,ComponentCondition> function){
            super();this.builder=new ComponentConditionBuilder(this);this.function=function;
    }
    public DoneableComponentCondition(ComponentCondition item,io.fabric8.kubernetes.api.builder.Function<ComponentCondition,ComponentCondition> function){
            super(item);this.builder=new ComponentConditionBuilder(this, item);this.function=function;
    }
    public DoneableComponentCondition(ComponentCondition item){
            super(item);this.builder=new ComponentConditionBuilder(this, item);this.function=new Function<ComponentCondition, ComponentCondition>() {
    public ComponentCondition apply(ComponentCondition item) {
        return item;
    }
}
;
    }

    public ComponentCondition done(){
             return function.apply(builder.build());
    }




}
