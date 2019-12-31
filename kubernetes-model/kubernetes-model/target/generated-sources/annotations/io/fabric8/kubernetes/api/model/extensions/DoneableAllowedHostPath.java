package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableAllowedHostPath extends AllowedHostPathFluentImpl<DoneableAllowedHostPath> implements Doneable<AllowedHostPath>{

    private final AllowedHostPathBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<AllowedHostPath,AllowedHostPath> function;

    public DoneableAllowedHostPath(io.fabric8.kubernetes.api.builder.Function<AllowedHostPath,AllowedHostPath> function){
            super();this.builder=new AllowedHostPathBuilder(this);this.function=function;
    }
    public DoneableAllowedHostPath(AllowedHostPath item,io.fabric8.kubernetes.api.builder.Function<AllowedHostPath,AllowedHostPath> function){
            super(item);this.builder=new AllowedHostPathBuilder(this, item);this.function=function;
    }
    public DoneableAllowedHostPath(AllowedHostPath item){
            super(item);this.builder=new AllowedHostPathBuilder(this, item);this.function=new Function<AllowedHostPath, AllowedHostPath>() {
    public AllowedHostPath apply(AllowedHostPath item) {
        return item;
    }
}
;
    }

    public AllowedHostPath done(){
             return function.apply(builder.build());
    }




}
