package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableBuildList extends BuildListFluentImpl<DoneableBuildList> implements Doneable<BuildList>{

    private final BuildListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<BuildList,BuildList> function;

    public DoneableBuildList(io.fabric8.kubernetes.api.builder.Function<BuildList,BuildList> function){
            super();this.builder=new BuildListBuilder(this);this.function=function;
    }
    public DoneableBuildList(BuildList item,io.fabric8.kubernetes.api.builder.Function<BuildList,BuildList> function){
            super(item);this.builder=new BuildListBuilder(this, item);this.function=function;
    }
    public DoneableBuildList(BuildList item){
            super(item);this.builder=new BuildListBuilder(this, item);this.function=new Function<BuildList, BuildList>() {
    public BuildList apply(BuildList item) {
        return item;
    }
}
;
    }

    public BuildList done(){
             return function.apply(builder.build());
    }




}
