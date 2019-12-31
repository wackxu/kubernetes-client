package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableSecurityContext extends SecurityContextFluentImpl<DoneableSecurityContext> implements Doneable<SecurityContext>{

    private final SecurityContextBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<SecurityContext,SecurityContext> function;

    public DoneableSecurityContext(io.fabric8.kubernetes.api.builder.Function<SecurityContext,SecurityContext> function){
            super();this.builder=new SecurityContextBuilder(this);this.function=function;
    }
    public DoneableSecurityContext(SecurityContext item,io.fabric8.kubernetes.api.builder.Function<SecurityContext,SecurityContext> function){
            super(item);this.builder=new SecurityContextBuilder(this, item);this.function=function;
    }
    public DoneableSecurityContext(SecurityContext item){
            super(item);this.builder=new SecurityContextBuilder(this, item);this.function=new Function<SecurityContext, SecurityContext>() {
    public SecurityContext apply(SecurityContext item) {
        return item;
    }
}
;
    }

    public SecurityContext done(){
             return function.apply(builder.build());
    }




}
