package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableImageLabel extends ImageLabelFluentImpl<DoneableImageLabel> implements Doneable<ImageLabel>{

    private final ImageLabelBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ImageLabel,ImageLabel> function;

    public DoneableImageLabel(io.fabric8.kubernetes.api.builder.Function<ImageLabel,ImageLabel> function){
            super();this.builder=new ImageLabelBuilder(this);this.function=function;
    }
    public DoneableImageLabel(ImageLabel item,io.fabric8.kubernetes.api.builder.Function<ImageLabel,ImageLabel> function){
            super(item);this.builder=new ImageLabelBuilder(this, item);this.function=function;
    }
    public DoneableImageLabel(ImageLabel item){
            super(item);this.builder=new ImageLabelBuilder(this, item);this.function=new Function<ImageLabel, ImageLabel>() {
    public ImageLabel apply(ImageLabel item) {
        return item;
    }
}
;
    }

    public ImageLabel done(){
             return function.apply(builder.build());
    }




}
