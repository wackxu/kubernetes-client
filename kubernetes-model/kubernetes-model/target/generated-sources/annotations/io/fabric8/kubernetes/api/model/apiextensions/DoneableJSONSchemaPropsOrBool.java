package io.fabric8.kubernetes.api.model.apiextensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableJSONSchemaPropsOrBool extends JSONSchemaPropsOrBoolFluentImpl<DoneableJSONSchemaPropsOrBool> implements Doneable<JSONSchemaPropsOrBool>{

    private final JSONSchemaPropsOrBoolBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<JSONSchemaPropsOrBool,JSONSchemaPropsOrBool> function;

    public DoneableJSONSchemaPropsOrBool(io.fabric8.kubernetes.api.builder.Function<JSONSchemaPropsOrBool,JSONSchemaPropsOrBool> function){
            super();this.builder=new JSONSchemaPropsOrBoolBuilder(this);this.function=function;
    }
    public DoneableJSONSchemaPropsOrBool(JSONSchemaPropsOrBool item,io.fabric8.kubernetes.api.builder.Function<JSONSchemaPropsOrBool,JSONSchemaPropsOrBool> function){
            super(item);this.builder=new JSONSchemaPropsOrBoolBuilder(this, item);this.function=function;
    }
    public DoneableJSONSchemaPropsOrBool(JSONSchemaPropsOrBool item){
            super(item);this.builder=new JSONSchemaPropsOrBoolBuilder(this, item);this.function=new Function<JSONSchemaPropsOrBool, JSONSchemaPropsOrBool>() {
    public JSONSchemaPropsOrBool apply(JSONSchemaPropsOrBool item) {
        return item;
    }
}
;
    }

    public JSONSchemaPropsOrBool done(){
             return function.apply(builder.build());
    }




}
