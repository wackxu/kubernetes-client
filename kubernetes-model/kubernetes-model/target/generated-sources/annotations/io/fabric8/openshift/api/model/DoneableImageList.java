package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableImageList extends ImageListFluentImpl<DoneableImageList> implements Doneable<ImageList>{

    private final ImageListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ImageList,ImageList> function;

    public DoneableImageList(io.fabric8.kubernetes.api.builder.Function<ImageList,ImageList> function){
            super();this.builder=new ImageListBuilder(this);this.function=function;
    }
    public DoneableImageList(ImageList item,io.fabric8.kubernetes.api.builder.Function<ImageList,ImageList> function){
            super(item);this.builder=new ImageListBuilder(this, item);this.function=function;
    }
    public DoneableImageList(ImageList item){
            super(item);this.builder=new ImageListBuilder(this, item);this.function=new Function<ImageList, ImageList>() {
    public ImageList apply(ImageList item) {
        return item;
    }
}
;
    }

    public ImageList done(){
             return function.apply(builder.build());
    }




}
