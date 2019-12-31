package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableImageSignature extends ImageSignatureFluentImpl<DoneableImageSignature> implements Doneable<ImageSignature>{

    private final ImageSignatureBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ImageSignature,ImageSignature> function;

    public DoneableImageSignature(io.fabric8.kubernetes.api.builder.Function<ImageSignature,ImageSignature> function){
            super();this.builder=new ImageSignatureBuilder(this);this.function=function;
    }
    public DoneableImageSignature(ImageSignature item,io.fabric8.kubernetes.api.builder.Function<ImageSignature,ImageSignature> function){
            super(item);this.builder=new ImageSignatureBuilder(this, item);this.function=function;
    }
    public DoneableImageSignature(ImageSignature item){
            super(item);this.builder=new ImageSignatureBuilder(this, item);this.function=new Function<ImageSignature, ImageSignature>() {
    public ImageSignature apply(ImageSignature item) {
        return item;
    }
}
;
    }

    public ImageSignature done(){
             return function.apply(builder.build());
    }




}
