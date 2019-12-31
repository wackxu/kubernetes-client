package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableObjectFieldSelector extends ObjectFieldSelectorFluentImpl<DoneableObjectFieldSelector> implements Doneable<ObjectFieldSelector>{

    private final ObjectFieldSelectorBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ObjectFieldSelector,ObjectFieldSelector> function;

    public DoneableObjectFieldSelector(io.fabric8.kubernetes.api.builder.Function<ObjectFieldSelector,ObjectFieldSelector> function){
            super();this.builder=new ObjectFieldSelectorBuilder(this);this.function=function;
    }
    public DoneableObjectFieldSelector(ObjectFieldSelector item,io.fabric8.kubernetes.api.builder.Function<ObjectFieldSelector,ObjectFieldSelector> function){
            super(item);this.builder=new ObjectFieldSelectorBuilder(this, item);this.function=function;
    }
    public DoneableObjectFieldSelector(ObjectFieldSelector item){
            super(item);this.builder=new ObjectFieldSelectorBuilder(this, item);this.function=new Function<ObjectFieldSelector, ObjectFieldSelector>() {
    public ObjectFieldSelector apply(ObjectFieldSelector item) {
        return item;
    }
}
;
    }

    public ObjectFieldSelector done(){
             return function.apply(builder.build());
    }




}
