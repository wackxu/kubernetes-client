package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableTagImageHook extends TagImageHookFluentImpl<DoneableTagImageHook> implements Doneable<TagImageHook>{

    private final TagImageHookBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<TagImageHook,TagImageHook> function;

    public DoneableTagImageHook(io.fabric8.kubernetes.api.builder.Function<TagImageHook,TagImageHook> function){
            super();this.builder=new TagImageHookBuilder(this);this.function=function;
    }
    public DoneableTagImageHook(TagImageHook item,io.fabric8.kubernetes.api.builder.Function<TagImageHook,TagImageHook> function){
            super(item);this.builder=new TagImageHookBuilder(this, item);this.function=function;
    }
    public DoneableTagImageHook(TagImageHook item){
            super(item);this.builder=new TagImageHookBuilder(this, item);this.function=new Function<TagImageHook, TagImageHook>() {
    public TagImageHook apply(TagImageHook item) {
        return item;
    }
}
;
    }

    public TagImageHook done(){
             return function.apply(builder.build());
    }




}
