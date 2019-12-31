package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableBinaryBuildSource extends BinaryBuildSourceFluentImpl<DoneableBinaryBuildSource> implements Doneable<BinaryBuildSource>{

    private final BinaryBuildSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<BinaryBuildSource,BinaryBuildSource> function;

    public DoneableBinaryBuildSource(io.fabric8.kubernetes.api.builder.Function<BinaryBuildSource,BinaryBuildSource> function){
            super();this.builder=new BinaryBuildSourceBuilder(this);this.function=function;
    }
    public DoneableBinaryBuildSource(BinaryBuildSource item,io.fabric8.kubernetes.api.builder.Function<BinaryBuildSource,BinaryBuildSource> function){
            super(item);this.builder=new BinaryBuildSourceBuilder(this, item);this.function=function;
    }
    public DoneableBinaryBuildSource(BinaryBuildSource item){
            super(item);this.builder=new BinaryBuildSourceBuilder(this, item);this.function=new Function<BinaryBuildSource, BinaryBuildSource>() {
    public BinaryBuildSource apply(BinaryBuildSource item) {
        return item;
    }
}
;
    }

    public BinaryBuildSource done(){
             return function.apply(builder.build());
    }




}
