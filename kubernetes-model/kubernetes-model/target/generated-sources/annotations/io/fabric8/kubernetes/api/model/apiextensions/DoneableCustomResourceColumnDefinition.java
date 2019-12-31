package io.fabric8.kubernetes.api.model.apiextensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableCustomResourceColumnDefinition extends CustomResourceColumnDefinitionFluentImpl<DoneableCustomResourceColumnDefinition> implements Doneable<CustomResourceColumnDefinition>{

    private final CustomResourceColumnDefinitionBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<CustomResourceColumnDefinition,CustomResourceColumnDefinition> function;

    public DoneableCustomResourceColumnDefinition(io.fabric8.kubernetes.api.builder.Function<CustomResourceColumnDefinition,CustomResourceColumnDefinition> function){
            super();this.builder=new CustomResourceColumnDefinitionBuilder(this);this.function=function;
    }
    public DoneableCustomResourceColumnDefinition(CustomResourceColumnDefinition item,io.fabric8.kubernetes.api.builder.Function<CustomResourceColumnDefinition,CustomResourceColumnDefinition> function){
            super(item);this.builder=new CustomResourceColumnDefinitionBuilder(this, item);this.function=function;
    }
    public DoneableCustomResourceColumnDefinition(CustomResourceColumnDefinition item){
            super(item);this.builder=new CustomResourceColumnDefinitionBuilder(this, item);this.function=new Function<CustomResourceColumnDefinition, CustomResourceColumnDefinition>() {
    public CustomResourceColumnDefinition apply(CustomResourceColumnDefinition item) {
        return item;
    }
}
;
    }

    public CustomResourceColumnDefinition done(){
             return function.apply(builder.build());
    }




}
