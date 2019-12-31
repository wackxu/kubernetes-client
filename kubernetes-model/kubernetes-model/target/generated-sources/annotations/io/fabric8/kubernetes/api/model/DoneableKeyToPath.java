package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableKeyToPath extends KeyToPathFluentImpl<DoneableKeyToPath> implements Doneable<KeyToPath>{

    private final KeyToPathBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<KeyToPath,KeyToPath> function;

    public DoneableKeyToPath(io.fabric8.kubernetes.api.builder.Function<KeyToPath,KeyToPath> function){
            super();this.builder=new KeyToPathBuilder(this);this.function=function;
    }
    public DoneableKeyToPath(KeyToPath item,io.fabric8.kubernetes.api.builder.Function<KeyToPath,KeyToPath> function){
            super(item);this.builder=new KeyToPathBuilder(this, item);this.function=function;
    }
    public DoneableKeyToPath(KeyToPath item){
            super(item);this.builder=new KeyToPathBuilder(this, item);this.function=new Function<KeyToPath, KeyToPath>() {
    public KeyToPath apply(KeyToPath item) {
        return item;
    }
}
;
    }

    public KeyToPath done(){
             return function.apply(builder.build());
    }




}
