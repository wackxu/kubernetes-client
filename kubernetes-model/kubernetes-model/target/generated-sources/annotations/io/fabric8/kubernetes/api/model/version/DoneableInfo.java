package io.fabric8.kubernetes.api.model.version;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableInfo extends InfoFluentImpl<DoneableInfo> implements Doneable<Info>{

    private final InfoBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Info,Info> function;

    public DoneableInfo(io.fabric8.kubernetes.api.builder.Function<Info,Info> function){
            super();this.builder=new InfoBuilder(this);this.function=function;
    }
    public DoneableInfo(Info item,io.fabric8.kubernetes.api.builder.Function<Info,Info> function){
            super(item);this.builder=new InfoBuilder(this, item);this.function=function;
    }
    public DoneableInfo(Info item){
            super(item);this.builder=new InfoBuilder(this, item);this.function=new Function<Info, Info>() {
    public Info apply(Info item) {
        return item;
    }
}
;
    }

    public Info done(){
             return function.apply(builder.build());
    }




}
