package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableTCPSocketAction extends TCPSocketActionFluentImpl<DoneableTCPSocketAction> implements Doneable<TCPSocketAction>{

    private final TCPSocketActionBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<TCPSocketAction,TCPSocketAction> function;

    public DoneableTCPSocketAction(io.fabric8.kubernetes.api.builder.Function<TCPSocketAction,TCPSocketAction> function){
            super();this.builder=new TCPSocketActionBuilder(this);this.function=function;
    }
    public DoneableTCPSocketAction(TCPSocketAction item,io.fabric8.kubernetes.api.builder.Function<TCPSocketAction,TCPSocketAction> function){
            super(item);this.builder=new TCPSocketActionBuilder(this, item);this.function=function;
    }
    public DoneableTCPSocketAction(TCPSocketAction item){
            super(item);this.builder=new TCPSocketActionBuilder(this, item);this.function=new Function<TCPSocketAction, TCPSocketAction>() {
    public TCPSocketAction apply(TCPSocketAction item) {
        return item;
    }
}
;
    }

    public TCPSocketAction done(){
             return function.apply(builder.build());
    }




}
