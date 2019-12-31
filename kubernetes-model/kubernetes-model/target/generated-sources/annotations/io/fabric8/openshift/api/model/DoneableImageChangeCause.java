package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableImageChangeCause extends ImageChangeCauseFluentImpl<DoneableImageChangeCause> implements Doneable<ImageChangeCause>{

    private final ImageChangeCauseBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ImageChangeCause,ImageChangeCause> function;

    public DoneableImageChangeCause(io.fabric8.kubernetes.api.builder.Function<ImageChangeCause,ImageChangeCause> function){
            super();this.builder=new ImageChangeCauseBuilder(this);this.function=function;
    }
    public DoneableImageChangeCause(ImageChangeCause item,io.fabric8.kubernetes.api.builder.Function<ImageChangeCause,ImageChangeCause> function){
            super(item);this.builder=new ImageChangeCauseBuilder(this, item);this.function=function;
    }
    public DoneableImageChangeCause(ImageChangeCause item){
            super(item);this.builder=new ImageChangeCauseBuilder(this, item);this.function=new Function<ImageChangeCause, ImageChangeCause>() {
    public ImageChangeCause apply(ImageChangeCause item) {
        return item;
    }
}
;
    }

    public ImageChangeCause done(){
             return function.apply(builder.build());
    }




}
