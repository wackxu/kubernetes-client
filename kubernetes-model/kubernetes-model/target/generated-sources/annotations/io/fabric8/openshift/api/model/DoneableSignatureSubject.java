package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableSignatureSubject extends SignatureSubjectFluentImpl<DoneableSignatureSubject> implements Doneable<SignatureSubject>{

    private final SignatureSubjectBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<SignatureSubject,SignatureSubject> function;

    public DoneableSignatureSubject(io.fabric8.kubernetes.api.builder.Function<SignatureSubject,SignatureSubject> function){
            super();this.builder=new SignatureSubjectBuilder(this);this.function=function;
    }
    public DoneableSignatureSubject(SignatureSubject item,io.fabric8.kubernetes.api.builder.Function<SignatureSubject,SignatureSubject> function){
            super(item);this.builder=new SignatureSubjectBuilder(this, item);this.function=function;
    }
    public DoneableSignatureSubject(SignatureSubject item){
            super(item);this.builder=new SignatureSubjectBuilder(this, item);this.function=new Function<SignatureSubject, SignatureSubject>() {
    public SignatureSubject apply(SignatureSubject item) {
        return item;
    }
}
;
    }

    public SignatureSubject done(){
             return function.apply(builder.build());
    }




}
