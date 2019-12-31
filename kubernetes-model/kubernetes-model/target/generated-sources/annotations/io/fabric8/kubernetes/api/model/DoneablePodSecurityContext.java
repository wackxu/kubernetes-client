package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneablePodSecurityContext extends PodSecurityContextFluentImpl<DoneablePodSecurityContext> implements Doneable<PodSecurityContext>{

    private final PodSecurityContextBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<PodSecurityContext,PodSecurityContext> function;

    public DoneablePodSecurityContext(io.fabric8.kubernetes.api.builder.Function<PodSecurityContext,PodSecurityContext> function){
            super();this.builder=new PodSecurityContextBuilder(this);this.function=function;
    }
    public DoneablePodSecurityContext(PodSecurityContext item,io.fabric8.kubernetes.api.builder.Function<PodSecurityContext,PodSecurityContext> function){
            super(item);this.builder=new PodSecurityContextBuilder(this, item);this.function=function;
    }
    public DoneablePodSecurityContext(PodSecurityContext item){
            super(item);this.builder=new PodSecurityContextBuilder(this, item);this.function=new Function<PodSecurityContext, PodSecurityContext>() {
    public PodSecurityContext apply(PodSecurityContext item) {
        return item;
    }
}
;
    }

    public PodSecurityContext done(){
             return function.apply(builder.build());
    }




}
