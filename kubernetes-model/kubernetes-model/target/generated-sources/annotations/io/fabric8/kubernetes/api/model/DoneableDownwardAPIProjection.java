package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableDownwardAPIProjection extends DownwardAPIProjectionFluentImpl<DoneableDownwardAPIProjection> implements Doneable<DownwardAPIProjection>{

    private final DownwardAPIProjectionBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<DownwardAPIProjection,DownwardAPIProjection> function;

    public DoneableDownwardAPIProjection(io.fabric8.kubernetes.api.builder.Function<DownwardAPIProjection,DownwardAPIProjection> function){
            super();this.builder=new DownwardAPIProjectionBuilder(this);this.function=function;
    }
    public DoneableDownwardAPIProjection(DownwardAPIProjection item,io.fabric8.kubernetes.api.builder.Function<DownwardAPIProjection,DownwardAPIProjection> function){
            super(item);this.builder=new DownwardAPIProjectionBuilder(this, item);this.function=function;
    }
    public DoneableDownwardAPIProjection(DownwardAPIProjection item){
            super(item);this.builder=new DownwardAPIProjectionBuilder(this, item);this.function=new Function<DownwardAPIProjection, DownwardAPIProjection>() {
    public DownwardAPIProjection apply(DownwardAPIProjection item) {
        return item;
    }
}
;
    }

    public DownwardAPIProjection done(){
             return function.apply(builder.build());
    }




}
