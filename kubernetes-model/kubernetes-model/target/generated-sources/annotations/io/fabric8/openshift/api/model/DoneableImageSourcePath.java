package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableImageSourcePath extends ImageSourcePathFluentImpl<DoneableImageSourcePath> implements Doneable<ImageSourcePath>{

    private final ImageSourcePathBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ImageSourcePath,ImageSourcePath> function;

    public DoneableImageSourcePath(io.fabric8.kubernetes.api.builder.Function<ImageSourcePath,ImageSourcePath> function){
            super();this.builder=new ImageSourcePathBuilder(this);this.function=function;
    }
    public DoneableImageSourcePath(ImageSourcePath item,io.fabric8.kubernetes.api.builder.Function<ImageSourcePath,ImageSourcePath> function){
            super(item);this.builder=new ImageSourcePathBuilder(this, item);this.function=function;
    }
    public DoneableImageSourcePath(ImageSourcePath item){
            super(item);this.builder=new ImageSourcePathBuilder(this, item);this.function=new Function<ImageSourcePath, ImageSourcePath>() {
    public ImageSourcePath apply(ImageSourcePath item) {
        return item;
    }
}
;
    }

    public ImageSourcePath done(){
             return function.apply(builder.build());
    }




}
