package io.fabric8.kubernetes.api.model.admission;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableAdmissionRequest extends AdmissionRequestFluentImpl<DoneableAdmissionRequest> implements Doneable<AdmissionRequest>{

    private final AdmissionRequestBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<AdmissionRequest,AdmissionRequest> function;

    public DoneableAdmissionRequest(io.fabric8.kubernetes.api.builder.Function<AdmissionRequest,AdmissionRequest> function){
            super();this.builder=new AdmissionRequestBuilder(this);this.function=function;
    }
    public DoneableAdmissionRequest(AdmissionRequest item,io.fabric8.kubernetes.api.builder.Function<AdmissionRequest,AdmissionRequest> function){
            super(item);this.builder=new AdmissionRequestBuilder(this, item);this.function=function;
    }
    public DoneableAdmissionRequest(AdmissionRequest item){
            super(item);this.builder=new AdmissionRequestBuilder(this, item);this.function=new Function<AdmissionRequest, AdmissionRequest>() {
    public AdmissionRequest apply(AdmissionRequest item) {
        return item;
    }
}
;
    }

    public AdmissionRequest done(){
             return function.apply(builder.build());
    }




}
