package io.fabric8.kubernetes.api.model.apiextensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableCustomResourceSubresources extends CustomResourceSubresourcesFluentImpl<DoneableCustomResourceSubresources> implements Doneable<CustomResourceSubresources>{

    private final CustomResourceSubresourcesBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<CustomResourceSubresources,CustomResourceSubresources> function;

    public DoneableCustomResourceSubresources(io.fabric8.kubernetes.api.builder.Function<CustomResourceSubresources,CustomResourceSubresources> function){
            super();this.builder=new CustomResourceSubresourcesBuilder(this);this.function=function;
    }
    public DoneableCustomResourceSubresources(CustomResourceSubresources item,io.fabric8.kubernetes.api.builder.Function<CustomResourceSubresources,CustomResourceSubresources> function){
            super(item);this.builder=new CustomResourceSubresourcesBuilder(this, item);this.function=function;
    }
    public DoneableCustomResourceSubresources(CustomResourceSubresources item){
            super(item);this.builder=new CustomResourceSubresourcesBuilder(this, item);this.function=new Function<CustomResourceSubresources, CustomResourceSubresources>() {
    public CustomResourceSubresources apply(CustomResourceSubresources item) {
        return item;
    }
}
;
    }

    public CustomResourceSubresources done(){
             return function.apply(builder.build());
    }




}
