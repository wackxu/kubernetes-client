package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableProjectedVolumeSource extends ProjectedVolumeSourceFluentImpl<DoneableProjectedVolumeSource> implements Doneable<ProjectedVolumeSource>{

    private final ProjectedVolumeSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ProjectedVolumeSource,ProjectedVolumeSource> function;

    public DoneableProjectedVolumeSource(io.fabric8.kubernetes.api.builder.Function<ProjectedVolumeSource,ProjectedVolumeSource> function){
            super();this.builder=new ProjectedVolumeSourceBuilder(this);this.function=function;
    }
    public DoneableProjectedVolumeSource(ProjectedVolumeSource item,io.fabric8.kubernetes.api.builder.Function<ProjectedVolumeSource,ProjectedVolumeSource> function){
            super(item);this.builder=new ProjectedVolumeSourceBuilder(this, item);this.function=function;
    }
    public DoneableProjectedVolumeSource(ProjectedVolumeSource item){
            super(item);this.builder=new ProjectedVolumeSourceBuilder(this, item);this.function=new Function<ProjectedVolumeSource, ProjectedVolumeSource>() {
    public ProjectedVolumeSource apply(ProjectedVolumeSource item) {
        return item;
    }
}
;
    }

    public ProjectedVolumeSource done(){
             return function.apply(builder.build());
    }




}
