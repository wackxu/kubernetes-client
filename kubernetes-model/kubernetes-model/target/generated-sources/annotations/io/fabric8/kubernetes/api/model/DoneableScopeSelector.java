package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableScopeSelector extends ScopeSelectorFluentImpl<DoneableScopeSelector> implements Doneable<ScopeSelector>{

    private final ScopeSelectorBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ScopeSelector,ScopeSelector> function;

    public DoneableScopeSelector(io.fabric8.kubernetes.api.builder.Function<ScopeSelector,ScopeSelector> function){
            super();this.builder=new ScopeSelectorBuilder(this);this.function=function;
    }
    public DoneableScopeSelector(ScopeSelector item,io.fabric8.kubernetes.api.builder.Function<ScopeSelector,ScopeSelector> function){
            super(item);this.builder=new ScopeSelectorBuilder(this, item);this.function=function;
    }
    public DoneableScopeSelector(ScopeSelector item){
            super(item);this.builder=new ScopeSelectorBuilder(this, item);this.function=new Function<ScopeSelector, ScopeSelector>() {
    public ScopeSelector apply(ScopeSelector item) {
        return item;
    }
}
;
    }

    public ScopeSelector done(){
             return function.apply(builder.build());
    }




}
