package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableBuildConfig extends BuildConfigFluentImpl<DoneableBuildConfig> implements Doneable<BuildConfig>{

    private final BuildConfigBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<BuildConfig,BuildConfig> function;

    public DoneableBuildConfig(io.fabric8.kubernetes.api.builder.Function<BuildConfig,BuildConfig> function){
            super();this.builder=new BuildConfigBuilder(this);this.function=function;
    }
    public DoneableBuildConfig(BuildConfig item,io.fabric8.kubernetes.api.builder.Function<BuildConfig,BuildConfig> function){
            super(item);this.builder=new BuildConfigBuilder(this, item);this.function=function;
    }
    public DoneableBuildConfig(BuildConfig item){
            super(item);this.builder=new BuildConfigBuilder(this, item);this.function=new Function<BuildConfig, BuildConfig>() {
    public BuildConfig apply(BuildConfig item) {
        return item;
    }
}
;
    }

    public BuildConfig done(){
             return function.apply(builder.build());
    }




}
