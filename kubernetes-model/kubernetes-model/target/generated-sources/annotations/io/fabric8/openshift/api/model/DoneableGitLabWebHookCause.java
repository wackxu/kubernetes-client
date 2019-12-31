package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableGitLabWebHookCause extends GitLabWebHookCauseFluentImpl<DoneableGitLabWebHookCause> implements Doneable<GitLabWebHookCause>{

    private final GitLabWebHookCauseBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<GitLabWebHookCause,GitLabWebHookCause> function;

    public DoneableGitLabWebHookCause(io.fabric8.kubernetes.api.builder.Function<GitLabWebHookCause,GitLabWebHookCause> function){
            super();this.builder=new GitLabWebHookCauseBuilder(this);this.function=function;
    }
    public DoneableGitLabWebHookCause(GitLabWebHookCause item,io.fabric8.kubernetes.api.builder.Function<GitLabWebHookCause,GitLabWebHookCause> function){
            super(item);this.builder=new GitLabWebHookCauseBuilder(this, item);this.function=function;
    }
    public DoneableGitLabWebHookCause(GitLabWebHookCause item){
            super(item);this.builder=new GitLabWebHookCauseBuilder(this, item);this.function=new Function<GitLabWebHookCause, GitLabWebHookCause>() {
    public GitLabWebHookCause apply(GitLabWebHookCause item) {
        return item;
    }
}
;
    }

    public GitLabWebHookCause done(){
             return function.apply(builder.build());
    }




}
