package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableSecretReference extends SecretReferenceFluentImpl<DoneableSecretReference> implements Doneable<SecretReference>{

    private final SecretReferenceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<SecretReference,SecretReference> function;

    public DoneableSecretReference(io.fabric8.kubernetes.api.builder.Function<SecretReference,SecretReference> function){
            super();this.builder=new SecretReferenceBuilder(this);this.function=function;
    }
    public DoneableSecretReference(SecretReference item,io.fabric8.kubernetes.api.builder.Function<SecretReference,SecretReference> function){
            super(item);this.builder=new SecretReferenceBuilder(this, item);this.function=function;
    }
    public DoneableSecretReference(SecretReference item){
            super(item);this.builder=new SecretReferenceBuilder(this, item);this.function=new Function<SecretReference, SecretReference>() {
    public SecretReference apply(SecretReference item) {
        return item;
    }
}
;
    }

    public SecretReference done(){
             return function.apply(builder.build());
    }




}
