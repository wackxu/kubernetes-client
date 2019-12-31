package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableStepInfo extends StepInfoFluentImpl<DoneableStepInfo> implements Doneable<StepInfo>{

    private final StepInfoBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<StepInfo,StepInfo> function;

    public DoneableStepInfo(io.fabric8.kubernetes.api.builder.Function<StepInfo,StepInfo> function){
            super();this.builder=new StepInfoBuilder(this);this.function=function;
    }
    public DoneableStepInfo(StepInfo item,io.fabric8.kubernetes.api.builder.Function<StepInfo,StepInfo> function){
            super(item);this.builder=new StepInfoBuilder(this, item);this.function=function;
    }
    public DoneableStepInfo(StepInfo item){
            super(item);this.builder=new StepInfoBuilder(this, item);this.function=new Function<StepInfo, StepInfo>() {
    public StepInfo apply(StepInfo item) {
        return item;
    }
}
;
    }

    public StepInfo done(){
             return function.apply(builder.build());
    }




}
