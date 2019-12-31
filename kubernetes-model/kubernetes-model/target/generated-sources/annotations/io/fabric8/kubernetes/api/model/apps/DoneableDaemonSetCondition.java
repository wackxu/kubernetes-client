package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableDaemonSetCondition extends DaemonSetConditionFluentImpl<DoneableDaemonSetCondition> implements Doneable<DaemonSetCondition>{

    private final DaemonSetConditionBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<DaemonSetCondition,DaemonSetCondition> function;

    public DoneableDaemonSetCondition(io.fabric8.kubernetes.api.builder.Function<DaemonSetCondition,DaemonSetCondition> function){
            super();this.builder=new DaemonSetConditionBuilder(this);this.function=function;
    }
    public DoneableDaemonSetCondition(DaemonSetCondition item,io.fabric8.kubernetes.api.builder.Function<DaemonSetCondition,DaemonSetCondition> function){
            super(item);this.builder=new DaemonSetConditionBuilder(this, item);this.function=function;
    }
    public DoneableDaemonSetCondition(DaemonSetCondition item){
            super(item);this.builder=new DaemonSetConditionBuilder(this, item);this.function=new Function<DaemonSetCondition, DaemonSetCondition>() {
    public DaemonSetCondition apply(DaemonSetCondition item) {
        return item;
    }
}
;
    }

    public DaemonSetCondition done(){
             return function.apply(builder.build());
    }




}
