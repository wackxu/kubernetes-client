package io.fabric8.kubernetes.api.model.apiextensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableCustomResourceDefinitionList extends CustomResourceDefinitionListFluentImpl<DoneableCustomResourceDefinitionList> implements Doneable<CustomResourceDefinitionList>{

    private final CustomResourceDefinitionListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<CustomResourceDefinitionList,CustomResourceDefinitionList> function;

    public DoneableCustomResourceDefinitionList(io.fabric8.kubernetes.api.builder.Function<CustomResourceDefinitionList,CustomResourceDefinitionList> function){
            super();this.builder=new CustomResourceDefinitionListBuilder(this);this.function=function;
    }
    public DoneableCustomResourceDefinitionList(CustomResourceDefinitionList item,io.fabric8.kubernetes.api.builder.Function<CustomResourceDefinitionList,CustomResourceDefinitionList> function){
            super(item);this.builder=new CustomResourceDefinitionListBuilder(this, item);this.function=function;
    }
    public DoneableCustomResourceDefinitionList(CustomResourceDefinitionList item){
            super(item);this.builder=new CustomResourceDefinitionListBuilder(this, item);this.function=new Function<CustomResourceDefinitionList, CustomResourceDefinitionList>() {
    public CustomResourceDefinitionList apply(CustomResourceDefinitionList item) {
        return item;
    }
}
;
    }

    public CustomResourceDefinitionList done(){
             return function.apply(builder.build());
    }




}
