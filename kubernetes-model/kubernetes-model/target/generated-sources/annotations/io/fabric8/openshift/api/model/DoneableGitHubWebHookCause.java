package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableGitHubWebHookCause extends GitHubWebHookCauseFluentImpl<DoneableGitHubWebHookCause> implements Doneable<GitHubWebHookCause>{

    private final GitHubWebHookCauseBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<GitHubWebHookCause,GitHubWebHookCause> function;

    public DoneableGitHubWebHookCause(io.fabric8.kubernetes.api.builder.Function<GitHubWebHookCause,GitHubWebHookCause> function){
            super();this.builder=new GitHubWebHookCauseBuilder(this);this.function=function;
    }
    public DoneableGitHubWebHookCause(GitHubWebHookCause item,io.fabric8.kubernetes.api.builder.Function<GitHubWebHookCause,GitHubWebHookCause> function){
            super(item);this.builder=new GitHubWebHookCauseBuilder(this, item);this.function=function;
    }
    public DoneableGitHubWebHookCause(GitHubWebHookCause item){
            super(item);this.builder=new GitHubWebHookCauseBuilder(this, item);this.function=new Function<GitHubWebHookCause, GitHubWebHookCause>() {
    public GitHubWebHookCause apply(GitHubWebHookCause item) {
        return item;
    }
}
;
    }

    public GitHubWebHookCause done(){
             return function.apply(builder.build());
    }




}
