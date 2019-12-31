package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableImageStreamList extends ImageStreamListFluentImpl<DoneableImageStreamList> implements Doneable<ImageStreamList>{

    private final ImageStreamListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ImageStreamList,ImageStreamList> function;

    public DoneableImageStreamList(io.fabric8.kubernetes.api.builder.Function<ImageStreamList,ImageStreamList> function){
            super();this.builder=new ImageStreamListBuilder(this);this.function=function;
    }
    public DoneableImageStreamList(ImageStreamList item,io.fabric8.kubernetes.api.builder.Function<ImageStreamList,ImageStreamList> function){
            super(item);this.builder=new ImageStreamListBuilder(this, item);this.function=function;
    }
    public DoneableImageStreamList(ImageStreamList item){
            super(item);this.builder=new ImageStreamListBuilder(this, item);this.function=new Function<ImageStreamList, ImageStreamList>() {
    public ImageStreamList apply(ImageStreamList item) {
        return item;
    }
}
;
    }

    public ImageStreamList done(){
             return function.apply(builder.build());
    }




}
