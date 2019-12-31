package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableBuildSpec extends BuildSpecFluentImpl<DoneableBuildSpec> implements Doneable<BuildSpec>{

    private final BuildSpecBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<BuildSpec,BuildSpec> function;

    public DoneableBuildSpec(io.fabric8.kubernetes.api.builder.Function<BuildSpec,BuildSpec> function){
            super();this.builder=new BuildSpecBuilder(this);this.function=function;
    }
    public DoneableBuildSpec(BuildSpec item,io.fabric8.kubernetes.api.builder.Function<BuildSpec,BuildSpec> function){
            super(item);this.builder=new BuildSpecBuilder(this, item);this.function=function;
    }
    public DoneableBuildSpec(BuildSpec item){
            super(item);this.builder=new BuildSpecBuilder(this, item);this.function=new Function<BuildSpec, BuildSpec>() {
    public BuildSpec apply(BuildSpec item) {
        return item;
    }
}
;
    }

    public BuildSpec done(){
             return function.apply(builder.build());
    }




}
