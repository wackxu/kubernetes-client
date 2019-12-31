package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableScaleSpec extends ScaleSpecFluentImpl<DoneableScaleSpec> implements Doneable<ScaleSpec>{

    private final ScaleSpecBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ScaleSpec,ScaleSpec> function;

    public DoneableScaleSpec(io.fabric8.kubernetes.api.builder.Function<ScaleSpec,ScaleSpec> function){
            super();this.builder=new ScaleSpecBuilder(this);this.function=function;
    }
    public DoneableScaleSpec(ScaleSpec item,io.fabric8.kubernetes.api.builder.Function<ScaleSpec,ScaleSpec> function){
            super(item);this.builder=new ScaleSpecBuilder(this, item);this.function=function;
    }
    public DoneableScaleSpec(ScaleSpec item){
            super(item);this.builder=new ScaleSpecBuilder(this, item);this.function=new Function<ScaleSpec, ScaleSpec>() {
    public ScaleSpec apply(ScaleSpec item) {
        return item;
    }
}
;
    }

    public ScaleSpec done(){
             return function.apply(builder.build());
    }




}
