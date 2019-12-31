package io.fabric8.kubernetes.api.model.certificates;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableCertificateSigningRequestList extends CertificateSigningRequestListFluentImpl<DoneableCertificateSigningRequestList> implements Doneable<CertificateSigningRequestList>{

    private final CertificateSigningRequestListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<CertificateSigningRequestList,CertificateSigningRequestList> function;

    public DoneableCertificateSigningRequestList(io.fabric8.kubernetes.api.builder.Function<CertificateSigningRequestList,CertificateSigningRequestList> function){
            super();this.builder=new CertificateSigningRequestListBuilder(this);this.function=function;
    }
    public DoneableCertificateSigningRequestList(CertificateSigningRequestList item,io.fabric8.kubernetes.api.builder.Function<CertificateSigningRequestList,CertificateSigningRequestList> function){
            super(item);this.builder=new CertificateSigningRequestListBuilder(this, item);this.function=function;
    }
    public DoneableCertificateSigningRequestList(CertificateSigningRequestList item){
            super(item);this.builder=new CertificateSigningRequestListBuilder(this, item);this.function=new Function<CertificateSigningRequestList, CertificateSigningRequestList>() {
    public CertificateSigningRequestList apply(CertificateSigningRequestList item) {
        return item;
    }
}
;
    }

    public CertificateSigningRequestList done(){
             return function.apply(builder.build());
    }




}
