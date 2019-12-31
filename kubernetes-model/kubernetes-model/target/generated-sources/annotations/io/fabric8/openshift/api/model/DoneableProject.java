package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableProject extends ProjectFluentImpl<DoneableProject> implements Doneable<Project>{

    private final ProjectBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Project,Project> function;

    public DoneableProject(io.fabric8.kubernetes.api.builder.Function<Project,Project> function){
            super();this.builder=new ProjectBuilder(this);this.function=function;
    }
    public DoneableProject(Project item,io.fabric8.kubernetes.api.builder.Function<Project,Project> function){
            super(item);this.builder=new ProjectBuilder(this, item);this.function=function;
    }
    public DoneableProject(Project item){
            super(item);this.builder=new ProjectBuilder(this, item);this.function=new Function<Project, Project>() {
    public Project apply(Project item) {
        return item;
    }
}
;
    }

    public Project done(){
             return function.apply(builder.build());
    }




}
