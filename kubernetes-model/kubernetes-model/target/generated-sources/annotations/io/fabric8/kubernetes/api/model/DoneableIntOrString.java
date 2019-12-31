package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableIntOrString extends IntOrStringFluentImpl<DoneableIntOrString> implements Doneable<IntOrString>{

    private final IntOrStringBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<IntOrString,IntOrString> function;

    public DoneableIntOrString(io.fabric8.kubernetes.api.builder.Function<IntOrString,IntOrString> function){
            super();this.builder=new IntOrStringBuilder(this);this.function=function;
    }
    public DoneableIntOrString(IntOrString item,io.fabric8.kubernetes.api.builder.Function<IntOrString,IntOrString> function){
            super(item);this.builder=new IntOrStringBuilder(this, item);this.function=function;
    }
    public DoneableIntOrString(IntOrString item){
            super(item);this.builder=new IntOrStringBuilder(this, item);this.function=new Function<IntOrString, IntOrString>() {
    public IntOrString apply(IntOrString item) {
        return item;
    }
}
;
    }

    public IntOrString done(){
             return function.apply(builder.build());
    }




}
