package io.fabric8.kubernetes.api.model.authorization;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableNonResourceAttributes extends NonResourceAttributesFluentImpl<DoneableNonResourceAttributes> implements Doneable<NonResourceAttributes>{

    private final NonResourceAttributesBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<NonResourceAttributes,NonResourceAttributes> function;

    public DoneableNonResourceAttributes(io.fabric8.kubernetes.api.builder.Function<NonResourceAttributes,NonResourceAttributes> function){
            super();this.builder=new NonResourceAttributesBuilder(this);this.function=function;
    }
    public DoneableNonResourceAttributes(NonResourceAttributes item,io.fabric8.kubernetes.api.builder.Function<NonResourceAttributes,NonResourceAttributes> function){
            super(item);this.builder=new NonResourceAttributesBuilder(this, item);this.function=function;
    }
    public DoneableNonResourceAttributes(NonResourceAttributes item){
            super(item);this.builder=new NonResourceAttributesBuilder(this, item);this.function=new Function<NonResourceAttributes, NonResourceAttributes>() {
    public NonResourceAttributes apply(NonResourceAttributes item) {
        return item;
    }
}
;
    }

    public NonResourceAttributes done(){
             return function.apply(builder.build());
    }




}
