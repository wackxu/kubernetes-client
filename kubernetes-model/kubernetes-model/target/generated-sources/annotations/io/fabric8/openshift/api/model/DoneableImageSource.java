package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableImageSource extends ImageSourceFluentImpl<DoneableImageSource> implements Doneable<ImageSource>{

    private final ImageSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ImageSource,ImageSource> function;

    public DoneableImageSource(io.fabric8.kubernetes.api.builder.Function<ImageSource,ImageSource> function){
            super();this.builder=new ImageSourceBuilder(this);this.function=function;
    }
    public DoneableImageSource(ImageSource item,io.fabric8.kubernetes.api.builder.Function<ImageSource,ImageSource> function){
            super(item);this.builder=new ImageSourceBuilder(this, item);this.function=function;
    }
    public DoneableImageSource(ImageSource item){
            super(item);this.builder=new ImageSourceBuilder(this, item);this.function=new Function<ImageSource, ImageSource>() {
    public ImageSource apply(ImageSource item) {
        return item;
    }
}
;
    }

    public ImageSource done(){
             return function.apply(builder.build());
    }




}
