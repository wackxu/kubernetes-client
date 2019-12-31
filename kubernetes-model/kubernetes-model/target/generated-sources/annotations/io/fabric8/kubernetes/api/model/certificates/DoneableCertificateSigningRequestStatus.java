package io.fabric8.kubernetes.api.model.certificates;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableCertificateSigningRequestStatus extends CertificateSigningRequestStatusFluentImpl<DoneableCertificateSigningRequestStatus> implements Doneable<CertificateSigningRequestStatus>{

    private final CertificateSigningRequestStatusBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<CertificateSigningRequestStatus,CertificateSigningRequestStatus> function;

    public DoneableCertificateSigningRequestStatus(io.fabric8.kubernetes.api.builder.Function<CertificateSigningRequestStatus,CertificateSigningRequestStatus> function){
            super();this.builder=new CertificateSigningRequestStatusBuilder(this);this.function=function;
    }
    public DoneableCertificateSigningRequestStatus(CertificateSigningRequestStatus item,io.fabric8.kubernetes.api.builder.Function<CertificateSigningRequestStatus,CertificateSigningRequestStatus> function){
            super(item);this.builder=new CertificateSigningRequestStatusBuilder(this, item);this.function=function;
    }
    public DoneableCertificateSigningRequestStatus(CertificateSigningRequestStatus item){
            super(item);this.builder=new CertificateSigningRequestStatusBuilder(this, item);this.function=new Function<CertificateSigningRequestStatus, CertificateSigningRequestStatus>() {
    public CertificateSigningRequestStatus apply(CertificateSigningRequestStatus item) {
        return item;
    }
}
;
    }

    public CertificateSigningRequestStatus done(){
             return function.apply(builder.build());
    }




}
