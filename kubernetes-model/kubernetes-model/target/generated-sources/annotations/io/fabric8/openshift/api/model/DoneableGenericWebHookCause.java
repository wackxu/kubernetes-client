package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableGenericWebHookCause extends GenericWebHookCauseFluentImpl<DoneableGenericWebHookCause> implements Doneable<GenericWebHookCause>{

    private final GenericWebHookCauseBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<GenericWebHookCause,GenericWebHookCause> function;

    public DoneableGenericWebHookCause(io.fabric8.kubernetes.api.builder.Function<GenericWebHookCause,GenericWebHookCause> function){
            super();this.builder=new GenericWebHookCauseBuilder(this);this.function=function;
    }
    public DoneableGenericWebHookCause(GenericWebHookCause item,io.fabric8.kubernetes.api.builder.Function<GenericWebHookCause,GenericWebHookCause> function){
            super(item);this.builder=new GenericWebHookCauseBuilder(this, item);this.function=function;
    }
    public DoneableGenericWebHookCause(GenericWebHookCause item){
            super(item);this.builder=new GenericWebHookCauseBuilder(this, item);this.function=new Function<GenericWebHookCause, GenericWebHookCause>() {
    public GenericWebHookCause apply(GenericWebHookCause item) {
        return item;
    }
}
;
    }

    public GenericWebHookCause done(){
             return function.apply(builder.build());
    }




}
