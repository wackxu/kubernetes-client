package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableBuildConfigSpec extends BuildConfigSpecFluentImpl<DoneableBuildConfigSpec> implements Doneable<BuildConfigSpec>{

    private final BuildConfigSpecBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<BuildConfigSpec,BuildConfigSpec> function;

    public DoneableBuildConfigSpec(io.fabric8.kubernetes.api.builder.Function<BuildConfigSpec,BuildConfigSpec> function){
            super();this.builder=new BuildConfigSpecBuilder(this);this.function=function;
    }
    public DoneableBuildConfigSpec(BuildConfigSpec item,io.fabric8.kubernetes.api.builder.Function<BuildConfigSpec,BuildConfigSpec> function){
            super(item);this.builder=new BuildConfigSpecBuilder(this, item);this.function=function;
    }
    public DoneableBuildConfigSpec(BuildConfigSpec item){
            super(item);this.builder=new BuildConfigSpecBuilder(this, item);this.function=new Function<BuildConfigSpec, BuildConfigSpec>() {
    public BuildConfigSpec apply(BuildConfigSpec item) {
        return item;
    }
}
;
    }

    public BuildConfigSpec done(){
             return function.apply(builder.build());
    }




}
