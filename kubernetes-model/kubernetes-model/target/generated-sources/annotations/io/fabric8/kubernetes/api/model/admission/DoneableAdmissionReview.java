package io.fabric8.kubernetes.api.model.admission;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableAdmissionReview extends AdmissionReviewFluentImpl<DoneableAdmissionReview> implements Doneable<AdmissionReview>{

    private final AdmissionReviewBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<AdmissionReview,AdmissionReview> function;

    public DoneableAdmissionReview(io.fabric8.kubernetes.api.builder.Function<AdmissionReview,AdmissionReview> function){
            super();this.builder=new AdmissionReviewBuilder(this);this.function=function;
    }
    public DoneableAdmissionReview(AdmissionReview item,io.fabric8.kubernetes.api.builder.Function<AdmissionReview,AdmissionReview> function){
            super(item);this.builder=new AdmissionReviewBuilder(this, item);this.function=function;
    }
    public DoneableAdmissionReview(AdmissionReview item){
            super(item);this.builder=new AdmissionReviewBuilder(this, item);this.function=new Function<AdmissionReview, AdmissionReview>() {
    public AdmissionReview apply(AdmissionReview item) {
        return item;
    }
}
;
    }

    public AdmissionReview done(){
             return function.apply(builder.build());
    }




}
