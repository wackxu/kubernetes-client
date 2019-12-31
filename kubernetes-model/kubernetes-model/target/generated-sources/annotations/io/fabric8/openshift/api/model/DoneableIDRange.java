package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableIDRange extends io.fabric8.openshift.api.model.IDRangeFluentImpl<DoneableIDRange> implements Doneable<io.fabric8.openshift.api.model.IDRange>{

    private final io.fabric8.openshift.api.model.IDRangeBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<io.fabric8.openshift.api.model.IDRange,io.fabric8.openshift.api.model.IDRange> function;

    public DoneableIDRange(io.fabric8.kubernetes.api.builder.Function<io.fabric8.openshift.api.model.IDRange,io.fabric8.openshift.api.model.IDRange> function){
            super();this.builder=new IDRangeBuilder(this);this.function=function;
    }
    public DoneableIDRange(io.fabric8.openshift.api.model.IDRange item,io.fabric8.kubernetes.api.builder.Function<io.fabric8.openshift.api.model.IDRange,io.fabric8.openshift.api.model.IDRange> function){
            super(item);this.builder=new IDRangeBuilder(this, item);this.function=function;
    }
    public DoneableIDRange(io.fabric8.openshift.api.model.IDRange item){
            super(item);this.builder=new IDRangeBuilder(this, item);this.function=new Function<io.fabric8.openshift.api.model.IDRange, io.fabric8.openshift.api.model.IDRange>() {
    public io.fabric8.openshift.api.model.IDRange apply(io.fabric8.openshift.api.model.IDRange item) {
        return item;
    }
}
;
    }

    public io.fabric8.openshift.api.model.IDRange done(){
             return function.apply(builder.build());
    }




}
