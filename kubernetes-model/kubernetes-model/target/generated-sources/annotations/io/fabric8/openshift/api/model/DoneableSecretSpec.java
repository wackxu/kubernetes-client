package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableSecretSpec extends SecretSpecFluentImpl<DoneableSecretSpec> implements Doneable<SecretSpec>{

    private final SecretSpecBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<SecretSpec,SecretSpec> function;

    public DoneableSecretSpec(io.fabric8.kubernetes.api.builder.Function<SecretSpec,SecretSpec> function){
            super();this.builder=new SecretSpecBuilder(this);this.function=function;
    }
    public DoneableSecretSpec(SecretSpec item,io.fabric8.kubernetes.api.builder.Function<SecretSpec,SecretSpec> function){
            super(item);this.builder=new SecretSpecBuilder(this, item);this.function=function;
    }
    public DoneableSecretSpec(SecretSpec item){
            super(item);this.builder=new SecretSpecBuilder(this, item);this.function=new Function<SecretSpec, SecretSpec>() {
    public SecretSpec apply(SecretSpec item) {
        return item;
    }
}
;
    }

    public SecretSpec done(){
             return function.apply(builder.build());
    }




}
