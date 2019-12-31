package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableSubjectAccessReviewResponse extends SubjectAccessReviewResponseFluentImpl<DoneableSubjectAccessReviewResponse> implements Doneable<SubjectAccessReviewResponse>{

    private final SubjectAccessReviewResponseBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<SubjectAccessReviewResponse,SubjectAccessReviewResponse> function;

    public DoneableSubjectAccessReviewResponse(io.fabric8.kubernetes.api.builder.Function<SubjectAccessReviewResponse,SubjectAccessReviewResponse> function){
            super();this.builder=new SubjectAccessReviewResponseBuilder(this);this.function=function;
    }
    public DoneableSubjectAccessReviewResponse(SubjectAccessReviewResponse item,io.fabric8.kubernetes.api.builder.Function<SubjectAccessReviewResponse,SubjectAccessReviewResponse> function){
            super(item);this.builder=new SubjectAccessReviewResponseBuilder(this, item);this.function=function;
    }
    public DoneableSubjectAccessReviewResponse(SubjectAccessReviewResponse item){
            super(item);this.builder=new SubjectAccessReviewResponseBuilder(this, item);this.function=new Function<SubjectAccessReviewResponse, SubjectAccessReviewResponse>() {
    public SubjectAccessReviewResponse apply(SubjectAccessReviewResponse item) {
        return item;
    }
}
;
    }

    public SubjectAccessReviewResponse done(){
             return function.apply(builder.build());
    }




}
