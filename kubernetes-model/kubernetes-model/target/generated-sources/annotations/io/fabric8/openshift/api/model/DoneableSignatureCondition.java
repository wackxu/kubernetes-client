package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableSignatureCondition extends SignatureConditionFluentImpl<DoneableSignatureCondition> implements Doneable<SignatureCondition>{

    private final SignatureConditionBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<SignatureCondition,SignatureCondition> function;

    public DoneableSignatureCondition(io.fabric8.kubernetes.api.builder.Function<SignatureCondition,SignatureCondition> function){
            super();this.builder=new SignatureConditionBuilder(this);this.function=function;
    }
    public DoneableSignatureCondition(SignatureCondition item,io.fabric8.kubernetes.api.builder.Function<SignatureCondition,SignatureCondition> function){
            super(item);this.builder=new SignatureConditionBuilder(this, item);this.function=function;
    }
    public DoneableSignatureCondition(SignatureCondition item){
            super(item);this.builder=new SignatureConditionBuilder(this, item);this.function=new Function<SignatureCondition, SignatureCondition>() {
    public SignatureCondition apply(SignatureCondition item) {
        return item;
    }
}
;
    }

    public SignatureCondition done(){
             return function.apply(builder.build());
    }




}
