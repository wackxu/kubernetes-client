package io.fabric8.kubernetes.api.model.apiextensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableCustomResourceDefinition extends CustomResourceDefinitionFluentImpl<DoneableCustomResourceDefinition> implements Doneable<CustomResourceDefinition>{

    private final CustomResourceDefinitionBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<CustomResourceDefinition,CustomResourceDefinition> function;

    public DoneableCustomResourceDefinition(io.fabric8.kubernetes.api.builder.Function<CustomResourceDefinition,CustomResourceDefinition> function){
            super();this.builder=new CustomResourceDefinitionBuilder(this);this.function=function;
    }
    public DoneableCustomResourceDefinition(CustomResourceDefinition item,io.fabric8.kubernetes.api.builder.Function<CustomResourceDefinition,CustomResourceDefinition> function){
            super(item);this.builder=new CustomResourceDefinitionBuilder(this, item);this.function=function;
    }
    public DoneableCustomResourceDefinition(CustomResourceDefinition item){
            super(item);this.builder=new CustomResourceDefinitionBuilder(this, item);this.function=new Function<CustomResourceDefinition, CustomResourceDefinition>() {
    public CustomResourceDefinition apply(CustomResourceDefinition item) {
        return item;
    }
}
;
    }

    public CustomResourceDefinition done(){
             return function.apply(builder.build());
    }




}
