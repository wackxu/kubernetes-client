package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneablePod extends PodFluentImpl<DoneablePod> implements Doneable<Pod>{

    private final PodBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Pod,Pod> function;

    public DoneablePod(io.fabric8.kubernetes.api.builder.Function<Pod,Pod> function){
            super();this.builder=new PodBuilder(this);this.function=function;
    }
    public DoneablePod(Pod item,io.fabric8.kubernetes.api.builder.Function<Pod,Pod> function){
            super(item);this.builder=new PodBuilder(this, item);this.function=function;
    }
    public DoneablePod(Pod item){
            super(item);this.builder=new PodBuilder(this, item);this.function=new Function<Pod, Pod>() {
    public Pod apply(Pod item) {
        return item;
    }
}
;
    }

    public Pod done(){
             return function.apply(builder.build());
    }




}
