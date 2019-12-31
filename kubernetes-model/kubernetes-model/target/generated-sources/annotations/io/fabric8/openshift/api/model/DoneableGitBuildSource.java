package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableGitBuildSource extends GitBuildSourceFluentImpl<DoneableGitBuildSource> implements Doneable<GitBuildSource>{

    private final GitBuildSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<GitBuildSource,GitBuildSource> function;

    public DoneableGitBuildSource(io.fabric8.kubernetes.api.builder.Function<GitBuildSource,GitBuildSource> function){
            super();this.builder=new GitBuildSourceBuilder(this);this.function=function;
    }
    public DoneableGitBuildSource(GitBuildSource item,io.fabric8.kubernetes.api.builder.Function<GitBuildSource,GitBuildSource> function){
            super(item);this.builder=new GitBuildSourceBuilder(this, item);this.function=function;
    }
    public DoneableGitBuildSource(GitBuildSource item){
            super(item);this.builder=new GitBuildSourceBuilder(this, item);this.function=new Function<GitBuildSource, GitBuildSource>() {
    public GitBuildSource apply(GitBuildSource item) {
        return item;
    }
}
;
    }

    public GitBuildSource done(){
             return function.apply(builder.build());
    }




}
