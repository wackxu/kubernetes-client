package io.fabric8.kubernetes.api.model.apiextensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableCustomResourceSubresourceStatus extends CustomResourceSubresourceStatusFluentImpl<DoneableCustomResourceSubresourceStatus> implements Doneable<CustomResourceSubresourceStatus>{

    private final CustomResourceSubresourceStatusBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<CustomResourceSubresourceStatus,CustomResourceSubresourceStatus> function;

    public DoneableCustomResourceSubresourceStatus(io.fabric8.kubernetes.api.builder.Function<CustomResourceSubresourceStatus,CustomResourceSubresourceStatus> function){
            super();this.builder=new CustomResourceSubresourceStatusBuilder(this);this.function=function;
    }
    public DoneableCustomResourceSubresourceStatus(CustomResourceSubresourceStatus item,io.fabric8.kubernetes.api.builder.Function<CustomResourceSubresourceStatus,CustomResourceSubresourceStatus> function){
            super(item);this.builder=new CustomResourceSubresourceStatusBuilder(this, item);this.function=function;
    }
    public DoneableCustomResourceSubresourceStatus(CustomResourceSubresourceStatus item){
            super(item);this.builder=new CustomResourceSubresourceStatusBuilder(this, item);this.function=new Function<CustomResourceSubresourceStatus, CustomResourceSubresourceStatus>() {
    public CustomResourceSubresourceStatus apply(CustomResourceSubresourceStatus item) {
        return item;
    }
}
;
    }

    public CustomResourceSubresourceStatus done(){
             return function.apply(builder.build());
    }




}
