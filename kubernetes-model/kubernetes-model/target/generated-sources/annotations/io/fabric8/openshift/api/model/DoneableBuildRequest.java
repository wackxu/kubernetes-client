package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableBuildRequest extends BuildRequestFluentImpl<DoneableBuildRequest> implements Doneable<BuildRequest>{

    private final BuildRequestBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<BuildRequest,BuildRequest> function;

    public DoneableBuildRequest(io.fabric8.kubernetes.api.builder.Function<BuildRequest,BuildRequest> function){
            super();this.builder=new BuildRequestBuilder(this);this.function=function;
    }
    public DoneableBuildRequest(BuildRequest item,io.fabric8.kubernetes.api.builder.Function<BuildRequest,BuildRequest> function){
            super(item);this.builder=new BuildRequestBuilder(this, item);this.function=function;
    }
    public DoneableBuildRequest(BuildRequest item){
            super(item);this.builder=new BuildRequestBuilder(this, item);this.function=new Function<BuildRequest, BuildRequest>() {
    public BuildRequest apply(BuildRequest item) {
        return item;
    }
}
;
    }

    public BuildRequest done(){
             return function.apply(builder.build());
    }




}
