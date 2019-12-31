package io.fabric8.kubernetes.api.model.apiextensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableCustomResourceDefinitionStatus extends CustomResourceDefinitionStatusFluentImpl<DoneableCustomResourceDefinitionStatus> implements Doneable<CustomResourceDefinitionStatus>{

    private final CustomResourceDefinitionStatusBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<CustomResourceDefinitionStatus,CustomResourceDefinitionStatus> function;

    public DoneableCustomResourceDefinitionStatus(io.fabric8.kubernetes.api.builder.Function<CustomResourceDefinitionStatus,CustomResourceDefinitionStatus> function){
            super();this.builder=new CustomResourceDefinitionStatusBuilder(this);this.function=function;
    }
    public DoneableCustomResourceDefinitionStatus(CustomResourceDefinitionStatus item,io.fabric8.kubernetes.api.builder.Function<CustomResourceDefinitionStatus,CustomResourceDefinitionStatus> function){
            super(item);this.builder=new CustomResourceDefinitionStatusBuilder(this, item);this.function=function;
    }
    public DoneableCustomResourceDefinitionStatus(CustomResourceDefinitionStatus item){
            super(item);this.builder=new CustomResourceDefinitionStatusBuilder(this, item);this.function=new Function<CustomResourceDefinitionStatus, CustomResourceDefinitionStatus>() {
    public CustomResourceDefinitionStatus apply(CustomResourceDefinitionStatus item) {
        return item;
    }
}
;
    }

    public CustomResourceDefinitionStatus done(){
             return function.apply(builder.build());
    }




}
