package io.fabric8.kubernetes.api.model.apiextensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableCustomResourceSubresourceScale extends CustomResourceSubresourceScaleFluentImpl<DoneableCustomResourceSubresourceScale> implements Doneable<CustomResourceSubresourceScale>{

    private final CustomResourceSubresourceScaleBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<CustomResourceSubresourceScale,CustomResourceSubresourceScale> function;

    public DoneableCustomResourceSubresourceScale(io.fabric8.kubernetes.api.builder.Function<CustomResourceSubresourceScale,CustomResourceSubresourceScale> function){
            super();this.builder=new CustomResourceSubresourceScaleBuilder(this);this.function=function;
    }
    public DoneableCustomResourceSubresourceScale(CustomResourceSubresourceScale item,io.fabric8.kubernetes.api.builder.Function<CustomResourceSubresourceScale,CustomResourceSubresourceScale> function){
            super(item);this.builder=new CustomResourceSubresourceScaleBuilder(this, item);this.function=function;
    }
    public DoneableCustomResourceSubresourceScale(CustomResourceSubresourceScale item){
            super(item);this.builder=new CustomResourceSubresourceScaleBuilder(this, item);this.function=new Function<CustomResourceSubresourceScale, CustomResourceSubresourceScale>() {
    public CustomResourceSubresourceScale apply(CustomResourceSubresourceScale item) {
        return item;
    }
}
;
    }

    public CustomResourceSubresourceScale done(){
             return function.apply(builder.build());
    }




}
