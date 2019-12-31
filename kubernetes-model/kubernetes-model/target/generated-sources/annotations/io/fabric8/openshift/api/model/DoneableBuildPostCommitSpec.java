package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableBuildPostCommitSpec extends BuildPostCommitSpecFluentImpl<DoneableBuildPostCommitSpec> implements Doneable<BuildPostCommitSpec>{

    private final BuildPostCommitSpecBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<BuildPostCommitSpec,BuildPostCommitSpec> function;

    public DoneableBuildPostCommitSpec(io.fabric8.kubernetes.api.builder.Function<BuildPostCommitSpec,BuildPostCommitSpec> function){
            super();this.builder=new BuildPostCommitSpecBuilder(this);this.function=function;
    }
    public DoneableBuildPostCommitSpec(BuildPostCommitSpec item,io.fabric8.kubernetes.api.builder.Function<BuildPostCommitSpec,BuildPostCommitSpec> function){
            super(item);this.builder=new BuildPostCommitSpecBuilder(this, item);this.function=function;
    }
    public DoneableBuildPostCommitSpec(BuildPostCommitSpec item){
            super(item);this.builder=new BuildPostCommitSpecBuilder(this, item);this.function=new Function<BuildPostCommitSpec, BuildPostCommitSpec>() {
    public BuildPostCommitSpec apply(BuildPostCommitSpec item) {
        return item;
    }
}
;
    }

    public BuildPostCommitSpec done(){
             return function.apply(builder.build());
    }




}
