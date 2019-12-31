package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableGitRepoVolumeSource extends GitRepoVolumeSourceFluentImpl<DoneableGitRepoVolumeSource> implements Doneable<GitRepoVolumeSource>{

    private final GitRepoVolumeSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<GitRepoVolumeSource,GitRepoVolumeSource> function;

    public DoneableGitRepoVolumeSource(io.fabric8.kubernetes.api.builder.Function<GitRepoVolumeSource,GitRepoVolumeSource> function){
            super();this.builder=new GitRepoVolumeSourceBuilder(this);this.function=function;
    }
    public DoneableGitRepoVolumeSource(GitRepoVolumeSource item,io.fabric8.kubernetes.api.builder.Function<GitRepoVolumeSource,GitRepoVolumeSource> function){
            super(item);this.builder=new GitRepoVolumeSourceBuilder(this, item);this.function=function;
    }
    public DoneableGitRepoVolumeSource(GitRepoVolumeSource item){
            super(item);this.builder=new GitRepoVolumeSourceBuilder(this, item);this.function=new Function<GitRepoVolumeSource, GitRepoVolumeSource>() {
    public GitRepoVolumeSource apply(GitRepoVolumeSource item) {
        return item;
    }
}
;
    }

    public GitRepoVolumeSource done(){
             return function.apply(builder.build());
    }




}
