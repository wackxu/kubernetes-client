package io.fabric8.kubernetes.api.model.networking;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableIPBlock extends IPBlockFluentImpl<DoneableIPBlock> implements Doneable<IPBlock>{

    private final IPBlockBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<IPBlock,IPBlock> function;

    public DoneableIPBlock(io.fabric8.kubernetes.api.builder.Function<IPBlock,IPBlock> function){
            super();this.builder=new IPBlockBuilder(this);this.function=function;
    }
    public DoneableIPBlock(IPBlock item,io.fabric8.kubernetes.api.builder.Function<IPBlock,IPBlock> function){
            super(item);this.builder=new IPBlockBuilder(this, item);this.function=function;
    }
    public DoneableIPBlock(IPBlock item){
            super(item);this.builder=new IPBlockBuilder(this, item);this.function=new Function<IPBlock, IPBlock>() {
    public IPBlock apply(IPBlock item) {
        return item;
    }
}
;
    }

    public IPBlock done(){
             return function.apply(builder.build());
    }




}
