package io.fabric8.kubernetes.api.model.apiextensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableCustomResourceConversion extends CustomResourceConversionFluentImpl<DoneableCustomResourceConversion> implements Doneable<CustomResourceConversion>{

    private final CustomResourceConversionBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<CustomResourceConversion,CustomResourceConversion> function;

    public DoneableCustomResourceConversion(io.fabric8.kubernetes.api.builder.Function<CustomResourceConversion,CustomResourceConversion> function){
            super();this.builder=new CustomResourceConversionBuilder(this);this.function=function;
    }
    public DoneableCustomResourceConversion(CustomResourceConversion item,io.fabric8.kubernetes.api.builder.Function<CustomResourceConversion,CustomResourceConversion> function){
            super(item);this.builder=new CustomResourceConversionBuilder(this, item);this.function=function;
    }
    public DoneableCustomResourceConversion(CustomResourceConversion item){
            super(item);this.builder=new CustomResourceConversionBuilder(this, item);this.function=new Function<CustomResourceConversion, CustomResourceConversion>() {
    public CustomResourceConversion apply(CustomResourceConversion item) {
        return item;
    }
}
;
    }

    public CustomResourceConversion done(){
             return function.apply(builder.build());
    }




}
