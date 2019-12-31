package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableStageInfo extends StageInfoFluentImpl<DoneableStageInfo> implements Doneable<StageInfo>{

    private final StageInfoBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<StageInfo,StageInfo> function;

    public DoneableStageInfo(io.fabric8.kubernetes.api.builder.Function<StageInfo,StageInfo> function){
            super();this.builder=new StageInfoBuilder(this);this.function=function;
    }
    public DoneableStageInfo(StageInfo item,io.fabric8.kubernetes.api.builder.Function<StageInfo,StageInfo> function){
            super(item);this.builder=new StageInfoBuilder(this, item);this.function=function;
    }
    public DoneableStageInfo(StageInfo item){
            super(item);this.builder=new StageInfoBuilder(this, item);this.function=new Function<StageInfo, StageInfo>() {
    public StageInfo apply(StageInfo item) {
        return item;
    }
}
;
    }

    public StageInfo done(){
             return function.apply(builder.build());
    }




}
