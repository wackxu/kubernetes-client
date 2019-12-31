package io.fabric8.kubernetes.api.model.apiextensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableJSONSchemaPropsOrStringArray extends JSONSchemaPropsOrStringArrayFluentImpl<DoneableJSONSchemaPropsOrStringArray> implements Doneable<JSONSchemaPropsOrStringArray>{

    private final JSONSchemaPropsOrStringArrayBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<JSONSchemaPropsOrStringArray,JSONSchemaPropsOrStringArray> function;

    public DoneableJSONSchemaPropsOrStringArray(io.fabric8.kubernetes.api.builder.Function<JSONSchemaPropsOrStringArray,JSONSchemaPropsOrStringArray> function){
            super();this.builder=new JSONSchemaPropsOrStringArrayBuilder(this);this.function=function;
    }
    public DoneableJSONSchemaPropsOrStringArray(JSONSchemaPropsOrStringArray item,io.fabric8.kubernetes.api.builder.Function<JSONSchemaPropsOrStringArray,JSONSchemaPropsOrStringArray> function){
            super(item);this.builder=new JSONSchemaPropsOrStringArrayBuilder(this, item);this.function=function;
    }
    public DoneableJSONSchemaPropsOrStringArray(JSONSchemaPropsOrStringArray item){
            super(item);this.builder=new JSONSchemaPropsOrStringArrayBuilder(this, item);this.function=new Function<JSONSchemaPropsOrStringArray, JSONSchemaPropsOrStringArray>() {
    public JSONSchemaPropsOrStringArray apply(JSONSchemaPropsOrStringArray item) {
        return item;
    }
}
;
    }

    public JSONSchemaPropsOrStringArray done(){
             return function.apply(builder.build());
    }




}
