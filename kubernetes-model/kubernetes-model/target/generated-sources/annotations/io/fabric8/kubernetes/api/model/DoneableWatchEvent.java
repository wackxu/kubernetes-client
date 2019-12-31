package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableWatchEvent extends WatchEventFluentImpl<DoneableWatchEvent> implements Doneable<WatchEvent>{

    private final WatchEventBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<WatchEvent,WatchEvent> function;

    public DoneableWatchEvent(io.fabric8.kubernetes.api.builder.Function<WatchEvent,WatchEvent> function){
            super();this.builder=new WatchEventBuilder(this);this.function=function;
    }
    public DoneableWatchEvent(WatchEvent item,io.fabric8.kubernetes.api.builder.Function<WatchEvent,WatchEvent> function){
            super(item);this.builder=new WatchEventBuilder(this, item);this.function=function;
    }
    public DoneableWatchEvent(WatchEvent item){
            super(item);this.builder=new WatchEventBuilder(this, item);this.function=new Function<WatchEvent, WatchEvent>() {
    public WatchEvent apply(WatchEvent item) {
        return item;
    }
}
;
    }

    public WatchEvent done(){
             return function.apply(builder.build());
    }




}
