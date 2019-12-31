package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableTagImportPolicy extends TagImportPolicyFluentImpl<DoneableTagImportPolicy> implements Doneable<TagImportPolicy>{

    private final TagImportPolicyBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<TagImportPolicy,TagImportPolicy> function;

    public DoneableTagImportPolicy(io.fabric8.kubernetes.api.builder.Function<TagImportPolicy,TagImportPolicy> function){
            super();this.builder=new TagImportPolicyBuilder(this);this.function=function;
    }
    public DoneableTagImportPolicy(TagImportPolicy item,io.fabric8.kubernetes.api.builder.Function<TagImportPolicy,TagImportPolicy> function){
            super(item);this.builder=new TagImportPolicyBuilder(this, item);this.function=function;
    }
    public DoneableTagImportPolicy(TagImportPolicy item){
            super(item);this.builder=new TagImportPolicyBuilder(this, item);this.function=new Function<TagImportPolicy, TagImportPolicy>() {
    public TagImportPolicy apply(TagImportPolicy item) {
        return item;
    }
}
;
    }

    public TagImportPolicy done(){
             return function.apply(builder.build());
    }




}
