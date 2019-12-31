package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableSecretList extends SecretListFluentImpl<DoneableSecretList> implements Doneable<SecretList>{

    private final SecretListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<SecretList,SecretList> function;

    public DoneableSecretList(io.fabric8.kubernetes.api.builder.Function<SecretList,SecretList> function){
            super();this.builder=new SecretListBuilder(this);this.function=function;
    }
    public DoneableSecretList(SecretList item,io.fabric8.kubernetes.api.builder.Function<SecretList,SecretList> function){
            super(item);this.builder=new SecretListBuilder(this, item);this.function=function;
    }
    public DoneableSecretList(SecretList item){
            super(item);this.builder=new SecretListBuilder(this, item);this.function=new Function<SecretList, SecretList>() {
    public SecretList apply(SecretList item) {
        return item;
    }
}
;
    }

    public SecretList done(){
             return function.apply(builder.build());
    }




}
