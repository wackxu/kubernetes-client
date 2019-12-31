package io.fabric8.kubernetes.api.model.apiextensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableJSONSchemaPropsOrArray extends JSONSchemaPropsOrArrayFluentImpl<DoneableJSONSchemaPropsOrArray> implements Doneable<JSONSchemaPropsOrArray>{

    private final JSONSchemaPropsOrArrayBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<JSONSchemaPropsOrArray,JSONSchemaPropsOrArray> function;

    public DoneableJSONSchemaPropsOrArray(io.fabric8.kubernetes.api.builder.Function<JSONSchemaPropsOrArray,JSONSchemaPropsOrArray> function){
            super();this.builder=new JSONSchemaPropsOrArrayBuilder(this);this.function=function;
    }
    public DoneableJSONSchemaPropsOrArray(JSONSchemaPropsOrArray item,io.fabric8.kubernetes.api.builder.Function<JSONSchemaPropsOrArray,JSONSchemaPropsOrArray> function){
            super(item);this.builder=new JSONSchemaPropsOrArrayBuilder(this, item);this.function=function;
    }
    public DoneableJSONSchemaPropsOrArray(JSONSchemaPropsOrArray item){
            super(item);this.builder=new JSONSchemaPropsOrArrayBuilder(this, item);this.function=new Function<JSONSchemaPropsOrArray, JSONSchemaPropsOrArray>() {
    public JSONSchemaPropsOrArray apply(JSONSchemaPropsOrArray item) {
        return item;
    }
}
;
    }

    public JSONSchemaPropsOrArray done(){
             return function.apply(builder.build());
    }




}
