package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableImageStreamTagList extends ImageStreamTagListFluentImpl<DoneableImageStreamTagList> implements Doneable<ImageStreamTagList>{

    private final ImageStreamTagListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ImageStreamTagList,ImageStreamTagList> function;

    public DoneableImageStreamTagList(io.fabric8.kubernetes.api.builder.Function<ImageStreamTagList,ImageStreamTagList> function){
            super();this.builder=new ImageStreamTagListBuilder(this);this.function=function;
    }
    public DoneableImageStreamTagList(ImageStreamTagList item,io.fabric8.kubernetes.api.builder.Function<ImageStreamTagList,ImageStreamTagList> function){
            super(item);this.builder=new ImageStreamTagListBuilder(this, item);this.function=function;
    }
    public DoneableImageStreamTagList(ImageStreamTagList item){
            super(item);this.builder=new ImageStreamTagListBuilder(this, item);this.function=new Function<ImageStreamTagList, ImageStreamTagList>() {
    public ImageStreamTagList apply(ImageStreamTagList item) {
        return item;
    }
}
;
    }

    public ImageStreamTagList done(){
             return function.apply(builder.build());
    }




}
