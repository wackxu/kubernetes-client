package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableImageStreamTag extends ImageStreamTagFluentImpl<DoneableImageStreamTag> implements Doneable<ImageStreamTag>{

    private final ImageStreamTagBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ImageStreamTag,ImageStreamTag> function;

    public DoneableImageStreamTag(io.fabric8.kubernetes.api.builder.Function<ImageStreamTag,ImageStreamTag> function){
            super();this.builder=new ImageStreamTagBuilder(this);this.function=function;
    }
    public DoneableImageStreamTag(ImageStreamTag item,io.fabric8.kubernetes.api.builder.Function<ImageStreamTag,ImageStreamTag> function){
            super(item);this.builder=new ImageStreamTagBuilder(this, item);this.function=function;
    }
    public DoneableImageStreamTag(ImageStreamTag item){
            super(item);this.builder=new ImageStreamTagBuilder(this, item);this.function=new Function<ImageStreamTag, ImageStreamTag>() {
    public ImageStreamTag apply(ImageStreamTag item) {
        return item;
    }
}
;
    }

    public ImageStreamTag done(){
             return function.apply(builder.build());
    }




}
