package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableDownwardAPIVolumeFile extends DownwardAPIVolumeFileFluentImpl<DoneableDownwardAPIVolumeFile> implements Doneable<DownwardAPIVolumeFile>{

    private final DownwardAPIVolumeFileBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<DownwardAPIVolumeFile,DownwardAPIVolumeFile> function;

    public DoneableDownwardAPIVolumeFile(io.fabric8.kubernetes.api.builder.Function<DownwardAPIVolumeFile,DownwardAPIVolumeFile> function){
            super();this.builder=new DownwardAPIVolumeFileBuilder(this);this.function=function;
    }
    public DoneableDownwardAPIVolumeFile(DownwardAPIVolumeFile item,io.fabric8.kubernetes.api.builder.Function<DownwardAPIVolumeFile,DownwardAPIVolumeFile> function){
            super(item);this.builder=new DownwardAPIVolumeFileBuilder(this, item);this.function=function;
    }
    public DoneableDownwardAPIVolumeFile(DownwardAPIVolumeFile item){
            super(item);this.builder=new DownwardAPIVolumeFileBuilder(this, item);this.function=new Function<DownwardAPIVolumeFile, DownwardAPIVolumeFile>() {
    public DownwardAPIVolumeFile apply(DownwardAPIVolumeFile item) {
        return item;
    }
}
;
    }

    public DownwardAPIVolumeFile done(){
             return function.apply(builder.build());
    }




}
