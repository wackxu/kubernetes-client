package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableImage extends ImageFluentImpl<DoneableImage> implements Doneable<Image>{

    private final ImageBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Image,Image> function;

    public DoneableImage(io.fabric8.kubernetes.api.builder.Function<Image,Image> function){
            super();this.builder=new ImageBuilder(this);this.function=function;
    }
    public DoneableImage(Image item,io.fabric8.kubernetes.api.builder.Function<Image,Image> function){
            super(item);this.builder=new ImageBuilder(this, item);this.function=function;
    }
    public DoneableImage(Image item){
            super(item);this.builder=new ImageBuilder(this, item);this.function=new Function<Image, Image>() {
    public Image apply(Image item) {
        return item;
    }
}
;
    }

    public Image done(){
             return function.apply(builder.build());
    }




}
