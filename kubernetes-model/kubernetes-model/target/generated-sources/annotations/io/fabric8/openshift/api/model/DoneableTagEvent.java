package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableTagEvent extends TagEventFluentImpl<DoneableTagEvent> implements Doneable<TagEvent>{

    private final TagEventBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<TagEvent,TagEvent> function;

    public DoneableTagEvent(io.fabric8.kubernetes.api.builder.Function<TagEvent,TagEvent> function){
            super();this.builder=new TagEventBuilder(this);this.function=function;
    }
    public DoneableTagEvent(TagEvent item,io.fabric8.kubernetes.api.builder.Function<TagEvent,TagEvent> function){
            super(item);this.builder=new TagEventBuilder(this, item);this.function=function;
    }
    public DoneableTagEvent(TagEvent item){
            super(item);this.builder=new TagEventBuilder(this, item);this.function=new Function<TagEvent, TagEvent>() {
    public TagEvent apply(TagEvent item) {
        return item;
    }
}
;
    }

    public TagEvent done(){
             return function.apply(builder.build());
    }




}
