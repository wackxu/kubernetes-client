package io.fabric8.kubernetes.api.model.apiextensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableCustomResourceDefinitionCondition extends CustomResourceDefinitionConditionFluentImpl<DoneableCustomResourceDefinitionCondition> implements Doneable<CustomResourceDefinitionCondition>{

    private final CustomResourceDefinitionConditionBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<CustomResourceDefinitionCondition,CustomResourceDefinitionCondition> function;

    public DoneableCustomResourceDefinitionCondition(io.fabric8.kubernetes.api.builder.Function<CustomResourceDefinitionCondition,CustomResourceDefinitionCondition> function){
            super();this.builder=new CustomResourceDefinitionConditionBuilder(this);this.function=function;
    }
    public DoneableCustomResourceDefinitionCondition(CustomResourceDefinitionCondition item,io.fabric8.kubernetes.api.builder.Function<CustomResourceDefinitionCondition,CustomResourceDefinitionCondition> function){
            super(item);this.builder=new CustomResourceDefinitionConditionBuilder(this, item);this.function=function;
    }
    public DoneableCustomResourceDefinitionCondition(CustomResourceDefinitionCondition item){
            super(item);this.builder=new CustomResourceDefinitionConditionBuilder(this, item);this.function=new Function<CustomResourceDefinitionCondition, CustomResourceDefinitionCondition>() {
    public CustomResourceDefinitionCondition apply(CustomResourceDefinitionCondition item) {
        return item;
    }
}
;
    }

    public CustomResourceDefinitionCondition done(){
             return function.apply(builder.build());
    }




}
