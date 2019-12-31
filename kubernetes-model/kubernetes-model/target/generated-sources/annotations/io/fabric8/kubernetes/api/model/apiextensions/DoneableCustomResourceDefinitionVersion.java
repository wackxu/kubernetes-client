package io.fabric8.kubernetes.api.model.apiextensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableCustomResourceDefinitionVersion extends CustomResourceDefinitionVersionFluentImpl<DoneableCustomResourceDefinitionVersion> implements Doneable<CustomResourceDefinitionVersion>{

    private final CustomResourceDefinitionVersionBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<CustomResourceDefinitionVersion,CustomResourceDefinitionVersion> function;

    public DoneableCustomResourceDefinitionVersion(io.fabric8.kubernetes.api.builder.Function<CustomResourceDefinitionVersion,CustomResourceDefinitionVersion> function){
            super();this.builder=new CustomResourceDefinitionVersionBuilder(this);this.function=function;
    }
    public DoneableCustomResourceDefinitionVersion(CustomResourceDefinitionVersion item,io.fabric8.kubernetes.api.builder.Function<CustomResourceDefinitionVersion,CustomResourceDefinitionVersion> function){
            super(item);this.builder=new CustomResourceDefinitionVersionBuilder(this, item);this.function=function;
    }
    public DoneableCustomResourceDefinitionVersion(CustomResourceDefinitionVersion item){
            super(item);this.builder=new CustomResourceDefinitionVersionBuilder(this, item);this.function=new Function<CustomResourceDefinitionVersion, CustomResourceDefinitionVersion>() {
    public CustomResourceDefinitionVersion apply(CustomResourceDefinitionVersion item) {
        return item;
    }
}
;
    }

    public CustomResourceDefinitionVersion done(){
             return function.apply(builder.build());
    }




}
