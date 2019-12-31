package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableHTTPIngressPath extends HTTPIngressPathFluentImpl<DoneableHTTPIngressPath> implements Doneable<HTTPIngressPath>{

    private final HTTPIngressPathBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<HTTPIngressPath,HTTPIngressPath> function;

    public DoneableHTTPIngressPath(io.fabric8.kubernetes.api.builder.Function<HTTPIngressPath,HTTPIngressPath> function){
            super();this.builder=new HTTPIngressPathBuilder(this);this.function=function;
    }
    public DoneableHTTPIngressPath(HTTPIngressPath item,io.fabric8.kubernetes.api.builder.Function<HTTPIngressPath,HTTPIngressPath> function){
            super(item);this.builder=new HTTPIngressPathBuilder(this, item);this.function=function;
    }
    public DoneableHTTPIngressPath(HTTPIngressPath item){
            super(item);this.builder=new HTTPIngressPathBuilder(this, item);this.function=new Function<HTTPIngressPath, HTTPIngressPath>() {
    public HTTPIngressPath apply(HTTPIngressPath item) {
        return item;
    }
}
;
    }

    public HTTPIngressPath done(){
             return function.apply(builder.build());
    }




}
