package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableSecretLocalReference extends SecretLocalReferenceFluentImpl<DoneableSecretLocalReference> implements Doneable<SecretLocalReference>{

    private final SecretLocalReferenceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<SecretLocalReference,SecretLocalReference> function;

    public DoneableSecretLocalReference(io.fabric8.kubernetes.api.builder.Function<SecretLocalReference,SecretLocalReference> function){
            super();this.builder=new SecretLocalReferenceBuilder(this);this.function=function;
    }
    public DoneableSecretLocalReference(SecretLocalReference item,io.fabric8.kubernetes.api.builder.Function<SecretLocalReference,SecretLocalReference> function){
            super(item);this.builder=new SecretLocalReferenceBuilder(this, item);this.function=function;
    }
    public DoneableSecretLocalReference(SecretLocalReference item){
            super(item);this.builder=new SecretLocalReferenceBuilder(this, item);this.function=new Function<SecretLocalReference, SecretLocalReference>() {
    public SecretLocalReference apply(SecretLocalReference item) {
        return item;
    }
}
;
    }

    public SecretLocalReference done(){
             return function.apply(builder.build());
    }




}
