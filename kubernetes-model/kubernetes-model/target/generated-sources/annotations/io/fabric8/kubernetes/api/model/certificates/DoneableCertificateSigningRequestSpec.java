package io.fabric8.kubernetes.api.model.certificates;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableCertificateSigningRequestSpec extends CertificateSigningRequestSpecFluentImpl<DoneableCertificateSigningRequestSpec> implements Doneable<CertificateSigningRequestSpec>{

    private final CertificateSigningRequestSpecBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<CertificateSigningRequestSpec,CertificateSigningRequestSpec> function;

    public DoneableCertificateSigningRequestSpec(io.fabric8.kubernetes.api.builder.Function<CertificateSigningRequestSpec,CertificateSigningRequestSpec> function){
            super();this.builder=new CertificateSigningRequestSpecBuilder(this);this.function=function;
    }
    public DoneableCertificateSigningRequestSpec(CertificateSigningRequestSpec item,io.fabric8.kubernetes.api.builder.Function<CertificateSigningRequestSpec,CertificateSigningRequestSpec> function){
            super(item);this.builder=new CertificateSigningRequestSpecBuilder(this, item);this.function=function;
    }
    public DoneableCertificateSigningRequestSpec(CertificateSigningRequestSpec item){
            super(item);this.builder=new CertificateSigningRequestSpecBuilder(this, item);this.function=new Function<CertificateSigningRequestSpec, CertificateSigningRequestSpec>() {
    public CertificateSigningRequestSpec apply(CertificateSigningRequestSpec item) {
        return item;
    }
}
;
    }

    public CertificateSigningRequestSpec done(){
             return function.apply(builder.build());
    }




}
