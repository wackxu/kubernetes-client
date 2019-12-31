package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableBuild extends BuildFluentImpl<DoneableBuild> implements Doneable<Build>{

    private final BuildBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Build,Build> function;

    public DoneableBuild(io.fabric8.kubernetes.api.builder.Function<Build,Build> function){
            super();this.builder=new BuildBuilder(this);this.function=function;
    }
    public DoneableBuild(Build item,io.fabric8.kubernetes.api.builder.Function<Build,Build> function){
            super(item);this.builder=new BuildBuilder(this, item);this.function=function;
    }
    public DoneableBuild(Build item){
            super(item);this.builder=new BuildBuilder(this, item);this.function=new Function<Build, Build>() {
    public Build apply(Build item) {
        return item;
    }
}
;
    }

    public Build done(){
             return function.apply(builder.build());
    }




}
