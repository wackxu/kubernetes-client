package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableExecNewPodHook extends ExecNewPodHookFluentImpl<DoneableExecNewPodHook> implements Doneable<ExecNewPodHook>{

    private final ExecNewPodHookBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ExecNewPodHook,ExecNewPodHook> function;

    public DoneableExecNewPodHook(io.fabric8.kubernetes.api.builder.Function<ExecNewPodHook,ExecNewPodHook> function){
            super();this.builder=new ExecNewPodHookBuilder(this);this.function=function;
    }
    public DoneableExecNewPodHook(ExecNewPodHook item,io.fabric8.kubernetes.api.builder.Function<ExecNewPodHook,ExecNewPodHook> function){
            super(item);this.builder=new ExecNewPodHookBuilder(this, item);this.function=function;
    }
    public DoneableExecNewPodHook(ExecNewPodHook item){
            super(item);this.builder=new ExecNewPodHookBuilder(this, item);this.function=new Function<ExecNewPodHook, ExecNewPodHook>() {
    public ExecNewPodHook apply(ExecNewPodHook item) {
        return item;
    }
}
;
    }

    public ExecNewPodHook done(){
             return function.apply(builder.build());
    }




}
