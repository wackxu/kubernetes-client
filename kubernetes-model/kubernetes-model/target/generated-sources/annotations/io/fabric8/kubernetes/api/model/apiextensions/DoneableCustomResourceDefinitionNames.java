package io.fabric8.kubernetes.api.model.apiextensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableCustomResourceDefinitionNames extends CustomResourceDefinitionNamesFluentImpl<DoneableCustomResourceDefinitionNames> implements Doneable<CustomResourceDefinitionNames>{

    private final CustomResourceDefinitionNamesBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<CustomResourceDefinitionNames,CustomResourceDefinitionNames> function;

    public DoneableCustomResourceDefinitionNames(io.fabric8.kubernetes.api.builder.Function<CustomResourceDefinitionNames,CustomResourceDefinitionNames> function){
            super();this.builder=new CustomResourceDefinitionNamesBuilder(this);this.function=function;
    }
    public DoneableCustomResourceDefinitionNames(CustomResourceDefinitionNames item,io.fabric8.kubernetes.api.builder.Function<CustomResourceDefinitionNames,CustomResourceDefinitionNames> function){
            super(item);this.builder=new CustomResourceDefinitionNamesBuilder(this, item);this.function=function;
    }
    public DoneableCustomResourceDefinitionNames(CustomResourceDefinitionNames item){
            super(item);this.builder=new CustomResourceDefinitionNamesBuilder(this, item);this.function=new Function<CustomResourceDefinitionNames, CustomResourceDefinitionNames>() {
    public CustomResourceDefinitionNames apply(CustomResourceDefinitionNames item) {
        return item;
    }
}
;
    }

    public CustomResourceDefinitionNames done(){
             return function.apply(builder.build());
    }




}
