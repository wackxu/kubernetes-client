package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableImageChangeTrigger extends ImageChangeTriggerFluentImpl<DoneableImageChangeTrigger> implements Doneable<ImageChangeTrigger>{

    private final ImageChangeTriggerBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ImageChangeTrigger,ImageChangeTrigger> function;

    public DoneableImageChangeTrigger(io.fabric8.kubernetes.api.builder.Function<ImageChangeTrigger,ImageChangeTrigger> function){
            super();this.builder=new ImageChangeTriggerBuilder(this);this.function=function;
    }
    public DoneableImageChangeTrigger(ImageChangeTrigger item,io.fabric8.kubernetes.api.builder.Function<ImageChangeTrigger,ImageChangeTrigger> function){
            super(item);this.builder=new ImageChangeTriggerBuilder(this, item);this.function=function;
    }
    public DoneableImageChangeTrigger(ImageChangeTrigger item){
            super(item);this.builder=new ImageChangeTriggerBuilder(this, item);this.function=new Function<ImageChangeTrigger, ImageChangeTrigger>() {
    public ImageChangeTrigger apply(ImageChangeTrigger item) {
        return item;
    }
}
;
    }

    public ImageChangeTrigger done(){
             return function.apply(builder.build());
    }




}
