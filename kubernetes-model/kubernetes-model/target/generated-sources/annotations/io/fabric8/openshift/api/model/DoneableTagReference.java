package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableTagReference extends TagReferenceFluentImpl<DoneableTagReference> implements Doneable<TagReference>{

    private final TagReferenceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<TagReference,TagReference> function;

    public DoneableTagReference(io.fabric8.kubernetes.api.builder.Function<TagReference,TagReference> function){
            super();this.builder=new TagReferenceBuilder(this);this.function=function;
    }
    public DoneableTagReference(TagReference item,io.fabric8.kubernetes.api.builder.Function<TagReference,TagReference> function){
            super(item);this.builder=new TagReferenceBuilder(this, item);this.function=function;
    }
    public DoneableTagReference(TagReference item){
            super(item);this.builder=new TagReferenceBuilder(this, item);this.function=new Function<TagReference, TagReference>() {
    public TagReference apply(TagReference item) {
        return item;
    }
}
;
    }

    public TagReference done(){
             return function.apply(builder.build());
    }




}
