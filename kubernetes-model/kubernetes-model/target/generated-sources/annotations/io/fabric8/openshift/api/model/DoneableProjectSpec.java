package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableProjectSpec extends ProjectSpecFluentImpl<DoneableProjectSpec> implements Doneable<ProjectSpec>{

    private final ProjectSpecBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ProjectSpec,ProjectSpec> function;

    public DoneableProjectSpec(io.fabric8.kubernetes.api.builder.Function<ProjectSpec,ProjectSpec> function){
            super();this.builder=new ProjectSpecBuilder(this);this.function=function;
    }
    public DoneableProjectSpec(ProjectSpec item,io.fabric8.kubernetes.api.builder.Function<ProjectSpec,ProjectSpec> function){
            super(item);this.builder=new ProjectSpecBuilder(this, item);this.function=function;
    }
    public DoneableProjectSpec(ProjectSpec item){
            super(item);this.builder=new ProjectSpecBuilder(this, item);this.function=new Function<ProjectSpec, ProjectSpec>() {
    public ProjectSpec apply(ProjectSpec item) {
        return item;
    }
}
;
    }

    public ProjectSpec done(){
             return function.apply(builder.build());
    }




}
