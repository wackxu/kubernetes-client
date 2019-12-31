package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableExecAction extends ExecActionFluentImpl<DoneableExecAction> implements Doneable<ExecAction>{

    private final ExecActionBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ExecAction,ExecAction> function;

    public DoneableExecAction(io.fabric8.kubernetes.api.builder.Function<ExecAction,ExecAction> function){
            super();this.builder=new ExecActionBuilder(this);this.function=function;
    }
    public DoneableExecAction(ExecAction item,io.fabric8.kubernetes.api.builder.Function<ExecAction,ExecAction> function){
            super(item);this.builder=new ExecActionBuilder(this, item);this.function=function;
    }
    public DoneableExecAction(ExecAction item){
            super(item);this.builder=new ExecActionBuilder(this, item);this.function=new Function<ExecAction, ExecAction>() {
    public ExecAction apply(ExecAction item) {
        return item;
    }
}
;
    }

    public ExecAction done(){
             return function.apply(builder.build());
    }




}
