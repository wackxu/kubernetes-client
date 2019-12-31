package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableLabelSelector extends LabelSelectorFluentImpl<DoneableLabelSelector> implements Doneable<LabelSelector>{

    private final LabelSelectorBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<LabelSelector,LabelSelector> function;

    public DoneableLabelSelector(io.fabric8.kubernetes.api.builder.Function<LabelSelector,LabelSelector> function){
            super();this.builder=new LabelSelectorBuilder(this);this.function=function;
    }
    public DoneableLabelSelector(LabelSelector item,io.fabric8.kubernetes.api.builder.Function<LabelSelector,LabelSelector> function){
            super(item);this.builder=new LabelSelectorBuilder(this, item);this.function=function;
    }
    public DoneableLabelSelector(LabelSelector item){
            super(item);this.builder=new LabelSelectorBuilder(this, item);this.function=new Function<LabelSelector, LabelSelector>() {
    public LabelSelector apply(LabelSelector item) {
        return item;
    }
}
;
    }

    public LabelSelector done(){
             return function.apply(builder.build());
    }




}
