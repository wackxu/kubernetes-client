package io.fabric8.kubernetes.api.model.certificates;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableCertificateSigningRequest extends CertificateSigningRequestFluentImpl<DoneableCertificateSigningRequest> implements Doneable<CertificateSigningRequest>{

    private final CertificateSigningRequestBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<CertificateSigningRequest,CertificateSigningRequest> function;

    public DoneableCertificateSigningRequest(io.fabric8.kubernetes.api.builder.Function<CertificateSigningRequest,CertificateSigningRequest> function){
            super();this.builder=new CertificateSigningRequestBuilder(this);this.function=function;
    }
    public DoneableCertificateSigningRequest(CertificateSigningRequest item,io.fabric8.kubernetes.api.builder.Function<CertificateSigningRequest,CertificateSigningRequest> function){
            super(item);this.builder=new CertificateSigningRequestBuilder(this, item);this.function=function;
    }
    public DoneableCertificateSigningRequest(CertificateSigningRequest item){
            super(item);this.builder=new CertificateSigningRequestBuilder(this, item);this.function=new Function<CertificateSigningRequest, CertificateSigningRequest>() {
    public CertificateSigningRequest apply(CertificateSigningRequest item) {
        return item;
    }
}
;
    }

    public CertificateSigningRequest done(){
             return function.apply(builder.build());
    }




}
