package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableParameter extends ParameterFluentImpl<DoneableParameter> implements Doneable<Parameter>{

    private final ParameterBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Parameter,Parameter> function;

    public DoneableParameter(io.fabric8.kubernetes.api.builder.Function<Parameter,Parameter> function){
            super();this.builder=new ParameterBuilder(this);this.function=function;
    }
    public DoneableParameter(Parameter item,io.fabric8.kubernetes.api.builder.Function<Parameter,Parameter> function){
            super(item);this.builder=new ParameterBuilder(this, item);this.function=function;
    }
    public DoneableParameter(Parameter item){
            super(item);this.builder=new ParameterBuilder(this, item);this.function=new Function<Parameter, Parameter>() {
    public Parameter apply(Parameter item) {
        return item;
    }
}
;
    }

    public Parameter done(){
             return function.apply(builder.build());
    }




}
