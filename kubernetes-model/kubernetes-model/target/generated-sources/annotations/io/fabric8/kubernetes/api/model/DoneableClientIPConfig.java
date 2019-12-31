package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableClientIPConfig extends ClientIPConfigFluentImpl<DoneableClientIPConfig> implements Doneable<ClientIPConfig>{

    private final ClientIPConfigBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<ClientIPConfig,ClientIPConfig> function;

    public DoneableClientIPConfig(io.fabric8.kubernetes.api.builder.Function<ClientIPConfig,ClientIPConfig> function){
            super();this.builder=new ClientIPConfigBuilder(this);this.function=function;
    }
    public DoneableClientIPConfig(ClientIPConfig item,io.fabric8.kubernetes.api.builder.Function<ClientIPConfig,ClientIPConfig> function){
            super(item);this.builder=new ClientIPConfigBuilder(this, item);this.function=function;
    }
    public DoneableClientIPConfig(ClientIPConfig item){
            super(item);this.builder=new ClientIPConfigBuilder(this, item);this.function=new Function<ClientIPConfig, ClientIPConfig>() {
    public ClientIPConfig apply(ClientIPConfig item) {
        return item;
    }
}
;
    }

    public ClientIPConfig done(){
             return function.apply(builder.build());
    }




}
