package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableHTTPHeader extends HTTPHeaderFluentImpl<DoneableHTTPHeader> implements Doneable<HTTPHeader>{

    private final HTTPHeaderBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<HTTPHeader,HTTPHeader> function;

    public DoneableHTTPHeader(io.fabric8.kubernetes.api.builder.Function<HTTPHeader,HTTPHeader> function){
            super();this.builder=new HTTPHeaderBuilder(this);this.function=function;
    }
    public DoneableHTTPHeader(HTTPHeader item,io.fabric8.kubernetes.api.builder.Function<HTTPHeader,HTTPHeader> function){
            super(item);this.builder=new HTTPHeaderBuilder(this, item);this.function=function;
    }
    public DoneableHTTPHeader(HTTPHeader item){
            super(item);this.builder=new HTTPHeaderBuilder(this, item);this.function=new Function<HTTPHeader, HTTPHeader>() {
    public HTTPHeader apply(HTTPHeader item) {
        return item;
    }
}
;
    }

    public HTTPHeader done(){
             return function.apply(builder.build());
    }




}
