package io.fabric8.kubernetes.api.model.admission;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableAdmissionResponse extends AdmissionResponseFluentImpl<DoneableAdmissionResponse> implements Doneable<AdmissionResponse>{

    private final AdmissionResponseBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<AdmissionResponse,AdmissionResponse> function;

    public DoneableAdmissionResponse(io.fabric8.kubernetes.api.builder.Function<AdmissionResponse,AdmissionResponse> function){
            super();this.builder=new AdmissionResponseBuilder(this);this.function=function;
    }
    public DoneableAdmissionResponse(AdmissionResponse item,io.fabric8.kubernetes.api.builder.Function<AdmissionResponse,AdmissionResponse> function){
            super(item);this.builder=new AdmissionResponseBuilder(this, item);this.function=function;
    }
    public DoneableAdmissionResponse(AdmissionResponse item){
            super(item);this.builder=new AdmissionResponseBuilder(this, item);this.function=new Function<AdmissionResponse, AdmissionResponse>() {
    public AdmissionResponse apply(AdmissionResponse item) {
        return item;
    }
}
;
    }

    public AdmissionResponse done(){
             return function.apply(builder.build());
    }




}
