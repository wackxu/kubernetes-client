package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableSysctl extends SysctlFluentImpl<DoneableSysctl> implements Doneable<Sysctl>{

    private final SysctlBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Sysctl,Sysctl> function;

    public DoneableSysctl(io.fabric8.kubernetes.api.builder.Function<Sysctl,Sysctl> function){
            super();this.builder=new SysctlBuilder(this);this.function=function;
    }
    public DoneableSysctl(Sysctl item,io.fabric8.kubernetes.api.builder.Function<Sysctl,Sysctl> function){
            super(item);this.builder=new SysctlBuilder(this, item);this.function=function;
    }
    public DoneableSysctl(Sysctl item){
            super(item);this.builder=new SysctlBuilder(this, item);this.function=new Function<Sysctl, Sysctl>() {
    public Sysctl apply(Sysctl item) {
        return item;
    }
}
;
    }

    public Sysctl done(){
             return function.apply(builder.build());
    }




}
