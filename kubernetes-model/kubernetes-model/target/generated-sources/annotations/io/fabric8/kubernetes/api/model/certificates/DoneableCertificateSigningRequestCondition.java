package io.fabric8.kubernetes.api.model.certificates;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableCertificateSigningRequestCondition extends CertificateSigningRequestConditionFluentImpl<DoneableCertificateSigningRequestCondition> implements Doneable<CertificateSigningRequestCondition>{

    private final CertificateSigningRequestConditionBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<CertificateSigningRequestCondition,CertificateSigningRequestCondition> function;

    public DoneableCertificateSigningRequestCondition(io.fabric8.kubernetes.api.builder.Function<CertificateSigningRequestCondition,CertificateSigningRequestCondition> function){
            super();this.builder=new CertificateSigningRequestConditionBuilder(this);this.function=function;
    }
    public DoneableCertificateSigningRequestCondition(CertificateSigningRequestCondition item,io.fabric8.kubernetes.api.builder.Function<CertificateSigningRequestCondition,CertificateSigningRequestCondition> function){
            super(item);this.builder=new CertificateSigningRequestConditionBuilder(this, item);this.function=function;
    }
    public DoneableCertificateSigningRequestCondition(CertificateSigningRequestCondition item){
            super(item);this.builder=new CertificateSigningRequestConditionBuilder(this, item);this.function=new Function<CertificateSigningRequestCondition, CertificateSigningRequestCondition>() {
    public CertificateSigningRequestCondition apply(CertificateSigningRequestCondition item) {
        return item;
    }
}
;
    }

    public CertificateSigningRequestCondition done(){
             return function.apply(builder.build());
    }




}
