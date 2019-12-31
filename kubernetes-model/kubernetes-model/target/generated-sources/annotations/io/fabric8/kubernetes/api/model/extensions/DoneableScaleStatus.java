package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableScaleStatus extends ScaleStatusFluentImpl<DoneableScaleStatus> implements Doneable<ScaleStatus>{

    private final ScaleStatusBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ScaleStatus,ScaleStatus> function;

    public DoneableScaleStatus(io.fabric8.kubernetes.api.builder.Function<ScaleStatus,ScaleStatus> function){
            super();this.builder=new ScaleStatusBuilder(this);this.function=function;
    }
    public DoneableScaleStatus(ScaleStatus item,io.fabric8.kubernetes.api.builder.Function<ScaleStatus,ScaleStatus> function){
            super(item);this.builder=new ScaleStatusBuilder(this, item);this.function=function;
    }
    public DoneableScaleStatus(ScaleStatus item){
            super(item);this.builder=new ScaleStatusBuilder(this, item);this.function=new Function<ScaleStatus, ScaleStatus>() {
    public ScaleStatus apply(ScaleStatus item) {
        return item;
    }
}
;
    }

    public ScaleStatus done(){
             return function.apply(builder.build());
    }




}
