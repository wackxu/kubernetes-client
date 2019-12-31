package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableSignatureIssuer extends SignatureIssuerFluentImpl<DoneableSignatureIssuer> implements Doneable<SignatureIssuer>{

    private final SignatureIssuerBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<SignatureIssuer,SignatureIssuer> function;

    public DoneableSignatureIssuer(io.fabric8.kubernetes.api.builder.Function<SignatureIssuer,SignatureIssuer> function){
            super();this.builder=new SignatureIssuerBuilder(this);this.function=function;
    }
    public DoneableSignatureIssuer(SignatureIssuer item,io.fabric8.kubernetes.api.builder.Function<SignatureIssuer,SignatureIssuer> function){
            super(item);this.builder=new SignatureIssuerBuilder(this, item);this.function=function;
    }
    public DoneableSignatureIssuer(SignatureIssuer item){
            super(item);this.builder=new SignatureIssuerBuilder(this, item);this.function=new Function<SignatureIssuer, SignatureIssuer>() {
    public SignatureIssuer apply(SignatureIssuer item) {
        return item;
    }
}
;
    }

    public SignatureIssuer done(){
             return function.apply(builder.build());
    }




}
