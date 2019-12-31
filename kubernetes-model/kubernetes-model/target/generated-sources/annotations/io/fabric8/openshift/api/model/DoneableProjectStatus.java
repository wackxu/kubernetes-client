package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableProjectStatus extends ProjectStatusFluentImpl<DoneableProjectStatus> implements Doneable<ProjectStatus>{

    private final ProjectStatusBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ProjectStatus,ProjectStatus> function;

    public DoneableProjectStatus(io.fabric8.kubernetes.api.builder.Function<ProjectStatus,ProjectStatus> function){
            super();this.builder=new ProjectStatusBuilder(this);this.function=function;
    }
    public DoneableProjectStatus(ProjectStatus item,io.fabric8.kubernetes.api.builder.Function<ProjectStatus,ProjectStatus> function){
            super(item);this.builder=new ProjectStatusBuilder(this, item);this.function=function;
    }
    public DoneableProjectStatus(ProjectStatus item){
            super(item);this.builder=new ProjectStatusBuilder(this, item);this.function=new Function<ProjectStatus, ProjectStatus>() {
    public ProjectStatus apply(ProjectStatus item) {
        return item;
    }
}
;
    }

    public ProjectStatus done(){
             return function.apply(builder.build());
    }




}
