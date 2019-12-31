package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableNamespaceSpec extends NamespaceSpecFluentImpl<DoneableNamespaceSpec> implements Doneable<NamespaceSpec>{

    private final NamespaceSpecBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<NamespaceSpec,NamespaceSpec> function;

    public DoneableNamespaceSpec(io.fabric8.kubernetes.api.builder.Function<NamespaceSpec,NamespaceSpec> function){
            super();this.builder=new NamespaceSpecBuilder(this);this.function=function;
    }
    public DoneableNamespaceSpec(NamespaceSpec item,io.fabric8.kubernetes.api.builder.Function<NamespaceSpec,NamespaceSpec> function){
            super(item);this.builder=new NamespaceSpecBuilder(this, item);this.function=function;
    }
    public DoneableNamespaceSpec(NamespaceSpec item){
            super(item);this.builder=new NamespaceSpecBuilder(this, item);this.function=new Function<NamespaceSpec, NamespaceSpec>() {
    public NamespaceSpec apply(NamespaceSpec item) {
        return item;
    }
}
;
    }

    public NamespaceSpec done(){
             return function.apply(builder.build());
    }




}
