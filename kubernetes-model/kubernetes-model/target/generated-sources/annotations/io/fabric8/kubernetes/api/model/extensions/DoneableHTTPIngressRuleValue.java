package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableHTTPIngressRuleValue extends HTTPIngressRuleValueFluentImpl<DoneableHTTPIngressRuleValue> implements Doneable<HTTPIngressRuleValue>{

    private final HTTPIngressRuleValueBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<HTTPIngressRuleValue,HTTPIngressRuleValue> function;

    public DoneableHTTPIngressRuleValue(io.fabric8.kubernetes.api.builder.Function<HTTPIngressRuleValue,HTTPIngressRuleValue> function){
            super();this.builder=new HTTPIngressRuleValueBuilder(this);this.function=function;
    }
    public DoneableHTTPIngressRuleValue(HTTPIngressRuleValue item,io.fabric8.kubernetes.api.builder.Function<HTTPIngressRuleValue,HTTPIngressRuleValue> function){
            super(item);this.builder=new HTTPIngressRuleValueBuilder(this, item);this.function=function;
    }
    public DoneableHTTPIngressRuleValue(HTTPIngressRuleValue item){
            super(item);this.builder=new HTTPIngressRuleValueBuilder(this, item);this.function=new Function<HTTPIngressRuleValue, HTTPIngressRuleValue>() {
    public HTTPIngressRuleValue apply(HTTPIngressRuleValue item) {
        return item;
    }
}
;
    }

    public HTTPIngressRuleValue done(){
             return function.apply(builder.build());
    }




}
