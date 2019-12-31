package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableProjectRequest extends ProjectRequestFluentImpl<DoneableProjectRequest> implements Doneable<ProjectRequest>{

    private final ProjectRequestBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ProjectRequest,ProjectRequest> function;

    public DoneableProjectRequest(io.fabric8.kubernetes.api.builder.Function<ProjectRequest,ProjectRequest> function){
            super();this.builder=new ProjectRequestBuilder(this);this.function=function;
    }
    public DoneableProjectRequest(ProjectRequest item,io.fabric8.kubernetes.api.builder.Function<ProjectRequest,ProjectRequest> function){
            super(item);this.builder=new ProjectRequestBuilder(this, item);this.function=function;
    }
    public DoneableProjectRequest(ProjectRequest item){
            super(item);this.builder=new ProjectRequestBuilder(this, item);this.function=new Function<ProjectRequest, ProjectRequest>() {
    public ProjectRequest apply(ProjectRequest item) {
        return item;
    }
}
;
    }

    public ProjectRequest done(){
             return function.apply(builder.build());
    }




}
