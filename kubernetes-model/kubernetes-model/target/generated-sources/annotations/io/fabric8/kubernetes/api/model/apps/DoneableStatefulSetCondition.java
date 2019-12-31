package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableStatefulSetCondition extends StatefulSetConditionFluentImpl<DoneableStatefulSetCondition> implements Doneable<StatefulSetCondition>{

    private final StatefulSetConditionBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<StatefulSetCondition,StatefulSetCondition> function;

    public DoneableStatefulSetCondition(io.fabric8.kubernetes.api.builder.Function<StatefulSetCondition,StatefulSetCondition> function){
            super();this.builder=new StatefulSetConditionBuilder(this);this.function=function;
    }
    public DoneableStatefulSetCondition(StatefulSetCondition item,io.fabric8.kubernetes.api.builder.Function<StatefulSetCondition,StatefulSetCondition> function){
            super(item);this.builder=new StatefulSetConditionBuilder(this, item);this.function=function;
    }
    public DoneableStatefulSetCondition(StatefulSetCondition item){
            super(item);this.builder=new StatefulSetConditionBuilder(this, item);this.function=new Function<StatefulSetCondition, StatefulSetCondition>() {
    public StatefulSetCondition apply(StatefulSetCondition item) {
        return item;
    }
}
;
    }

    public StatefulSetCondition done(){
             return function.apply(builder.build());
    }




}
