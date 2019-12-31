package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableBuildConfigList extends BuildConfigListFluentImpl<DoneableBuildConfigList> implements Doneable<BuildConfigList>{

    private final BuildConfigListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<BuildConfigList,BuildConfigList> function;

    public DoneableBuildConfigList(io.fabric8.kubernetes.api.builder.Function<BuildConfigList,BuildConfigList> function){
            super();this.builder=new BuildConfigListBuilder(this);this.function=function;
    }
    public DoneableBuildConfigList(BuildConfigList item,io.fabric8.kubernetes.api.builder.Function<BuildConfigList,BuildConfigList> function){
            super(item);this.builder=new BuildConfigListBuilder(this, item);this.function=function;
    }
    public DoneableBuildConfigList(BuildConfigList item){
            super(item);this.builder=new BuildConfigListBuilder(this, item);this.function=new Function<BuildConfigList, BuildConfigList>() {
    public BuildConfigList apply(BuildConfigList item) {
        return item;
    }
}
;
    }

    public BuildConfigList done(){
             return function.apply(builder.build());
    }




}
