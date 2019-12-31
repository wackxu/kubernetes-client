package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableImageLayer extends ImageLayerFluentImpl<DoneableImageLayer> implements Doneable<ImageLayer>{

    private final ImageLayerBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ImageLayer,ImageLayer> function;

    public DoneableImageLayer(io.fabric8.kubernetes.api.builder.Function<ImageLayer,ImageLayer> function){
            super();this.builder=new ImageLayerBuilder(this);this.function=function;
    }
    public DoneableImageLayer(ImageLayer item,io.fabric8.kubernetes.api.builder.Function<ImageLayer,ImageLayer> function){
            super(item);this.builder=new ImageLayerBuilder(this, item);this.function=function;
    }
    public DoneableImageLayer(ImageLayer item){
            super(item);this.builder=new ImageLayerBuilder(this, item);this.function=new Function<ImageLayer, ImageLayer>() {
    public ImageLayer apply(ImageLayer item) {
        return item;
    }
}
;
    }

    public ImageLayer done(){
             return function.apply(builder.build());
    }




}
