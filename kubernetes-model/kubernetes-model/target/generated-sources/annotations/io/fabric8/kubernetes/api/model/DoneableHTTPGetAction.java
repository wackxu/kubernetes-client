package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableHTTPGetAction extends HTTPGetActionFluentImpl<DoneableHTTPGetAction> implements Doneable<HTTPGetAction>{

    private final HTTPGetActionBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<HTTPGetAction,HTTPGetAction> function;

    public DoneableHTTPGetAction(io.fabric8.kubernetes.api.builder.Function<HTTPGetAction,HTTPGetAction> function){
            super();this.builder=new HTTPGetActionBuilder(this);this.function=function;
    }
    public DoneableHTTPGetAction(HTTPGetAction item,io.fabric8.kubernetes.api.builder.Function<HTTPGetAction,HTTPGetAction> function){
            super(item);this.builder=new HTTPGetActionBuilder(this, item);this.function=function;
    }
    public DoneableHTTPGetAction(HTTPGetAction item){
            super(item);this.builder=new HTTPGetActionBuilder(this, item);this.function=new Function<HTTPGetAction, HTTPGetAction>() {
    public HTTPGetAction apply(HTTPGetAction item) {
        return item;
    }
}
;
    }

    public HTTPGetAction done(){
             return function.apply(builder.build());
    }




}
