package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableGitSourceRevision extends GitSourceRevisionFluentImpl<DoneableGitSourceRevision> implements Doneable<GitSourceRevision>{

    private final GitSourceRevisionBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<GitSourceRevision,GitSourceRevision> function;

    public DoneableGitSourceRevision(io.fabric8.kubernetes.api.builder.Function<GitSourceRevision,GitSourceRevision> function){
            super();this.builder=new GitSourceRevisionBuilder(this);this.function=function;
    }
    public DoneableGitSourceRevision(GitSourceRevision item,io.fabric8.kubernetes.api.builder.Function<GitSourceRevision,GitSourceRevision> function){
            super(item);this.builder=new GitSourceRevisionBuilder(this, item);this.function=function;
    }
    public DoneableGitSourceRevision(GitSourceRevision item){
            super(item);this.builder=new GitSourceRevisionBuilder(this, item);this.function=new Function<GitSourceRevision, GitSourceRevision>() {
    public GitSourceRevision apply(GitSourceRevision item) {
        return item;
    }
}
;
    }

    public GitSourceRevision done(){
             return function.apply(builder.build());
    }




}
