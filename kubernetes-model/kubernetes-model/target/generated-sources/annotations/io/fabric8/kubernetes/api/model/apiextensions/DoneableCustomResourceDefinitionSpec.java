package io.fabric8.kubernetes.api.model.apiextensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableCustomResourceDefinitionSpec extends CustomResourceDefinitionSpecFluentImpl<DoneableCustomResourceDefinitionSpec> implements Doneable<CustomResourceDefinitionSpec>{

    private final CustomResourceDefinitionSpecBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<CustomResourceDefinitionSpec,CustomResourceDefinitionSpec> function;

    public DoneableCustomResourceDefinitionSpec(io.fabric8.kubernetes.api.builder.Function<CustomResourceDefinitionSpec,CustomResourceDefinitionSpec> function){
            super();this.builder=new CustomResourceDefinitionSpecBuilder(this);this.function=function;
    }
    public DoneableCustomResourceDefinitionSpec(CustomResourceDefinitionSpec item,io.fabric8.kubernetes.api.builder.Function<CustomResourceDefinitionSpec,CustomResourceDefinitionSpec> function){
            super(item);this.builder=new CustomResourceDefinitionSpecBuilder(this, item);this.function=function;
    }
    public DoneableCustomResourceDefinitionSpec(CustomResourceDefinitionSpec item){
            super(item);this.builder=new CustomResourceDefinitionSpecBuilder(this, item);this.function=new Function<CustomResourceDefinitionSpec, CustomResourceDefinitionSpec>() {
    public CustomResourceDefinitionSpec apply(CustomResourceDefinitionSpec item) {
        return item;
    }
}
;
    }

    public CustomResourceDefinitionSpec done(){
             return function.apply(builder.build());
    }




}
