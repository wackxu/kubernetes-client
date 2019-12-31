package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableTagEventCondition extends TagEventConditionFluentImpl<DoneableTagEventCondition> implements Doneable<TagEventCondition>{

    private final TagEventConditionBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<TagEventCondition,TagEventCondition> function;

    public DoneableTagEventCondition(io.fabric8.kubernetes.api.builder.Function<TagEventCondition,TagEventCondition> function){
            super();this.builder=new TagEventConditionBuilder(this);this.function=function;
    }
    public DoneableTagEventCondition(TagEventCondition item,io.fabric8.kubernetes.api.builder.Function<TagEventCondition,TagEventCondition> function){
            super(item);this.builder=new TagEventConditionBuilder(this, item);this.function=function;
    }
    public DoneableTagEventCondition(TagEventCondition item){
            super(item);this.builder=new TagEventConditionBuilder(this, item);this.function=new Function<TagEventCondition, TagEventCondition>() {
    public TagEventCondition apply(TagEventCondition item) {
        return item;
    }
}
;
    }

    public TagEventCondition done(){
             return function.apply(builder.build());
    }




}
