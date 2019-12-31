package io.fabric8.kubernetes.api.model.apiextensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableJSONSchemaProps extends JSONSchemaPropsFluentImpl<DoneableJSONSchemaProps> implements Doneable<JSONSchemaProps>{

    private final JSONSchemaPropsBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<JSONSchemaProps,JSONSchemaProps> function;

    public DoneableJSONSchemaProps(io.fabric8.kubernetes.api.builder.Function<JSONSchemaProps,JSONSchemaProps> function){
            super();this.builder=new JSONSchemaPropsBuilder(this);this.function=function;
    }
    public DoneableJSONSchemaProps(JSONSchemaProps item,io.fabric8.kubernetes.api.builder.Function<JSONSchemaProps,JSONSchemaProps> function){
            super(item);this.builder=new JSONSchemaPropsBuilder(this, item);this.function=function;
    }
    public DoneableJSONSchemaProps(JSONSchemaProps item){
            super(item);this.builder=new JSONSchemaPropsBuilder(this, item);this.function=new Function<JSONSchemaProps, JSONSchemaProps>() {
    public JSONSchemaProps apply(JSONSchemaProps item) {
        return item;
    }
}
;
    }

    public JSONSchemaProps done(){
             return function.apply(builder.build());
    }




}
