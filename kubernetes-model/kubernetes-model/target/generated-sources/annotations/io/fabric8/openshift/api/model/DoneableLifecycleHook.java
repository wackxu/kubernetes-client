package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableLifecycleHook extends LifecycleHookFluentImpl<DoneableLifecycleHook> implements Doneable<LifecycleHook>{

    private final LifecycleHookBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<LifecycleHook,LifecycleHook> function;

    public DoneableLifecycleHook(io.fabric8.kubernetes.api.builder.Function<LifecycleHook,LifecycleHook> function){
            super();this.builder=new LifecycleHookBuilder(this);this.function=function;
    }
    public DoneableLifecycleHook(LifecycleHook item,io.fabric8.kubernetes.api.builder.Function<LifecycleHook,LifecycleHook> function){
            super(item);this.builder=new LifecycleHookBuilder(this, item);this.function=function;
    }
    public DoneableLifecycleHook(LifecycleHook item){
            super(item);this.builder=new LifecycleHookBuilder(this, item);this.function=new Function<LifecycleHook, LifecycleHook>() {
    public LifecycleHook apply(LifecycleHook item) {
        return item;
    }
}
;
    }

    public LifecycleHook done(){
             return function.apply(builder.build());
    }




}
