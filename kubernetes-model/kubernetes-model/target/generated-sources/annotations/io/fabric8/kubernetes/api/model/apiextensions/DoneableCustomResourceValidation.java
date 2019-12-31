package io.fabric8.kubernetes.api.model.apiextensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableCustomResourceValidation extends CustomResourceValidationFluentImpl<DoneableCustomResourceValidation> implements Doneable<CustomResourceValidation>{

    private final CustomResourceValidationBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<CustomResourceValidation,CustomResourceValidation> function;

    public DoneableCustomResourceValidation(io.fabric8.kubernetes.api.builder.Function<CustomResourceValidation,CustomResourceValidation> function){
            super();this.builder=new CustomResourceValidationBuilder(this);this.function=function;
    }
    public DoneableCustomResourceValidation(CustomResourceValidation item,io.fabric8.kubernetes.api.builder.Function<CustomResourceValidation,CustomResourceValidation> function){
            super(item);this.builder=new CustomResourceValidationBuilder(this, item);this.function=function;
    }
    public DoneableCustomResourceValidation(CustomResourceValidation item){
            super(item);this.builder=new CustomResourceValidationBuilder(this, item);this.function=new Function<CustomResourceValidation, CustomResourceValidation>() {
    public CustomResourceValidation apply(CustomResourceValidation item) {
        return item;
    }
}
;
    }

    public CustomResourceValidation done(){
             return function.apply(builder.build());
    }




}
