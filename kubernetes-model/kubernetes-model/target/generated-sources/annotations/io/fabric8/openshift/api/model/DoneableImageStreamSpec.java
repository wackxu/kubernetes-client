package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableImageStreamSpec extends ImageStreamSpecFluentImpl<DoneableImageStreamSpec> implements Doneable<ImageStreamSpec>{

    private final ImageStreamSpecBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ImageStreamSpec,ImageStreamSpec> function;

    public DoneableImageStreamSpec(io.fabric8.kubernetes.api.builder.Function<ImageStreamSpec,ImageStreamSpec> function){
            super();this.builder=new ImageStreamSpecBuilder(this);this.function=function;
    }
    public DoneableImageStreamSpec(ImageStreamSpec item,io.fabric8.kubernetes.api.builder.Function<ImageStreamSpec,ImageStreamSpec> function){
            super(item);this.builder=new ImageStreamSpecBuilder(this, item);this.function=function;
    }
    public DoneableImageStreamSpec(ImageStreamSpec item){
            super(item);this.builder=new ImageStreamSpecBuilder(this, item);this.function=new Function<ImageStreamSpec, ImageStreamSpec>() {
    public ImageStreamSpec apply(ImageStreamSpec item) {
        return item;
    }
}
;
    }

    public ImageStreamSpec done(){
             return function.apply(builder.build());
    }




}
