package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableTagReferencePolicy extends TagReferencePolicyFluentImpl<DoneableTagReferencePolicy> implements Doneable<TagReferencePolicy>{

    private final TagReferencePolicyBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<TagReferencePolicy,TagReferencePolicy> function;

    public DoneableTagReferencePolicy(io.fabric8.kubernetes.api.builder.Function<TagReferencePolicy,TagReferencePolicy> function){
            super();this.builder=new TagReferencePolicyBuilder(this);this.function=function;
    }
    public DoneableTagReferencePolicy(TagReferencePolicy item,io.fabric8.kubernetes.api.builder.Function<TagReferencePolicy,TagReferencePolicy> function){
            super(item);this.builder=new TagReferencePolicyBuilder(this, item);this.function=function;
    }
    public DoneableTagReferencePolicy(TagReferencePolicy item){
            super(item);this.builder=new TagReferencePolicyBuilder(this, item);this.function=new Function<TagReferencePolicy, TagReferencePolicy>() {
    public TagReferencePolicy apply(TagReferencePolicy item) {
        return item;
    }
}
;
    }

    public TagReferencePolicy done(){
             return function.apply(builder.build());
    }




}
