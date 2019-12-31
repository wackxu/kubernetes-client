package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableSourceRevision extends SourceRevisionFluentImpl<DoneableSourceRevision> implements Doneable<SourceRevision>{

    private final SourceRevisionBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<SourceRevision,SourceRevision> function;

    public DoneableSourceRevision(io.fabric8.kubernetes.api.builder.Function<SourceRevision,SourceRevision> function){
            super();this.builder=new SourceRevisionBuilder(this);this.function=function;
    }
    public DoneableSourceRevision(SourceRevision item,io.fabric8.kubernetes.api.builder.Function<SourceRevision,SourceRevision> function){
            super(item);this.builder=new SourceRevisionBuilder(this, item);this.function=function;
    }
    public DoneableSourceRevision(SourceRevision item){
            super(item);this.builder=new SourceRevisionBuilder(this, item);this.function=new Function<SourceRevision, SourceRevision>() {
    public SourceRevision apply(SourceRevision item) {
        return item;
    }
}
;
    }

    public SourceRevision done(){
             return function.apply(builder.build());
    }




}
