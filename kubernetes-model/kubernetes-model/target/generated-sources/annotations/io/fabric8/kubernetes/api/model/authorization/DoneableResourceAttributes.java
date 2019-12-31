package io.fabric8.kubernetes.api.model.authorization;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableResourceAttributes extends ResourceAttributesFluentImpl<DoneableResourceAttributes> implements Doneable<ResourceAttributes>{

    private final ResourceAttributesBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ResourceAttributes,ResourceAttributes> function;

    public DoneableResourceAttributes(io.fabric8.kubernetes.api.builder.Function<ResourceAttributes,ResourceAttributes> function){
            super();this.builder=new ResourceAttributesBuilder(this);this.function=function;
    }
    public DoneableResourceAttributes(ResourceAttributes item,io.fabric8.kubernetes.api.builder.Function<ResourceAttributes,ResourceAttributes> function){
            super(item);this.builder=new ResourceAttributesBuilder(this, item);this.function=function;
    }
    public DoneableResourceAttributes(ResourceAttributes item){
            super(item);this.builder=new ResourceAttributesBuilder(this, item);this.function=new Function<ResourceAttributes, ResourceAttributes>() {
    public ResourceAttributes apply(ResourceAttributes item) {
        return item;
    }
}
;
    }

    public ResourceAttributes done(){
             return function.apply(builder.build());
    }




}
