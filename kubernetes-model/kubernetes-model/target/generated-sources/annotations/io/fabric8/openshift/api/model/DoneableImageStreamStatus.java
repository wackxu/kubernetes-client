package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableImageStreamStatus extends ImageStreamStatusFluentImpl<DoneableImageStreamStatus> implements Doneable<ImageStreamStatus>{

    private final ImageStreamStatusBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ImageStreamStatus,ImageStreamStatus> function;

    public DoneableImageStreamStatus(io.fabric8.kubernetes.api.builder.Function<ImageStreamStatus,ImageStreamStatus> function){
            super();this.builder=new ImageStreamStatusBuilder(this);this.function=function;
    }
    public DoneableImageStreamStatus(ImageStreamStatus item,io.fabric8.kubernetes.api.builder.Function<ImageStreamStatus,ImageStreamStatus> function){
            super(item);this.builder=new ImageStreamStatusBuilder(this, item);this.function=function;
    }
    public DoneableImageStreamStatus(ImageStreamStatus item){
            super(item);this.builder=new ImageStreamStatusBuilder(this, item);this.function=new Function<ImageStreamStatus, ImageStreamStatus>() {
    public ImageStreamStatus apply(ImageStreamStatus item) {
        return item;
    }
}
;
    }

    public ImageStreamStatus done(){
             return function.apply(builder.build());
    }




}
