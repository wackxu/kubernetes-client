package io.fabric8.kubernetes.api.model.apiextensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableJSON extends JSONFluentImpl<DoneableJSON> implements Doneable<JSON>{

    private final JSONBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<JSON,JSON> function;

    public DoneableJSON(io.fabric8.kubernetes.api.builder.Function<JSON,JSON> function){
            super();this.builder=new JSONBuilder(this);this.function=function;
    }
    public DoneableJSON(JSON item,io.fabric8.kubernetes.api.builder.Function<JSON,JSON> function){
            super(item);this.builder=new JSONBuilder(this, item);this.function=function;
    }
    public DoneableJSON(JSON item){
            super(item);this.builder=new JSONBuilder(this, item);this.function=new Function<JSON, JSON>() {
    public JSON apply(JSON item) {
        return item;
    }
}
;
    }

    public JSON done(){
             return function.apply(builder.build());
    }




}
