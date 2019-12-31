package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableProbe extends ProbeFluentImpl<DoneableProbe> implements Doneable<Probe>{

    private final ProbeBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Probe,Probe> function;

    public DoneableProbe(io.fabric8.kubernetes.api.builder.Function<Probe,Probe> function){
            super();this.builder=new ProbeBuilder(this);this.function=function;
    }
    public DoneableProbe(Probe item,io.fabric8.kubernetes.api.builder.Function<Probe,Probe> function){
            super(item);this.builder=new ProbeBuilder(this, item);this.function=function;
    }
    public DoneableProbe(Probe item){
            super(item);this.builder=new ProbeBuilder(this, item);this.function=new Function<Probe, Probe>() {
    public Probe apply(Probe item) {
        return item;
    }
}
;
    }

    public Probe done(){
             return function.apply(builder.build());
    }




}
