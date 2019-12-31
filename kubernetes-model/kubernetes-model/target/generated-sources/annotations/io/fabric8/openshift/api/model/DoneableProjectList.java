package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableProjectList extends ProjectListFluentImpl<DoneableProjectList> implements Doneable<ProjectList>{

    private final ProjectListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ProjectList,ProjectList> function;

    public DoneableProjectList(io.fabric8.kubernetes.api.builder.Function<ProjectList,ProjectList> function){
            super();this.builder=new ProjectListBuilder(this);this.function=function;
    }
    public DoneableProjectList(ProjectList item,io.fabric8.kubernetes.api.builder.Function<ProjectList,ProjectList> function){
            super(item);this.builder=new ProjectListBuilder(this, item);this.function=function;
    }
    public DoneableProjectList(ProjectList item){
            super(item);this.builder=new ProjectListBuilder(this, item);this.function=new Function<ProjectList, ProjectList>() {
    public ProjectList apply(ProjectList item) {
        return item;
    }
}
;
    }

    public ProjectList done(){
             return function.apply(builder.build());
    }




}
