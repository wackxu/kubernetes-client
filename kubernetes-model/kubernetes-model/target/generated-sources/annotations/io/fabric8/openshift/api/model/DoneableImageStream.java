package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableImageStream extends ImageStreamFluentImpl<DoneableImageStream> implements Doneable<ImageStream>{

    private final ImageStreamBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ImageStream,ImageStream> function;

    public DoneableImageStream(io.fabric8.kubernetes.api.builder.Function<ImageStream,ImageStream> function){
            super();this.builder=new ImageStreamBuilder(this);this.function=function;
    }
    public DoneableImageStream(ImageStream item,io.fabric8.kubernetes.api.builder.Function<ImageStream,ImageStream> function){
            super(item);this.builder=new ImageStreamBuilder(this, item);this.function=function;
    }
    public DoneableImageStream(ImageStream item){
            super(item);this.builder=new ImageStreamBuilder(this, item);this.function=new Function<ImageStream, ImageStream>() {
    public ImageStream apply(ImageStream item) {
        return item;
    }
}
;
    }

    public ImageStream done(){
             return function.apply(builder.build());
    }




}
