package io.fabric8.kubernetes.api.model.authorization;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableSubjectAccessReviewStatus extends SubjectAccessReviewStatusFluentImpl<DoneableSubjectAccessReviewStatus> implements Doneable<SubjectAccessReviewStatus>{

    private final SubjectAccessReviewStatusBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<SubjectAccessReviewStatus,SubjectAccessReviewStatus> function;

    public DoneableSubjectAccessReviewStatus(io.fabric8.kubernetes.api.builder.Function<SubjectAccessReviewStatus,SubjectAccessReviewStatus> function){
            super();this.builder=new SubjectAccessReviewStatusBuilder(this);this.function=function;
    }
    public DoneableSubjectAccessReviewStatus(SubjectAccessReviewStatus item,io.fabric8.kubernetes.api.builder.Function<SubjectAccessReviewStatus,SubjectAccessReviewStatus> function){
            super(item);this.builder=new SubjectAccessReviewStatusBuilder(this, item);this.function=function;
    }
    public DoneableSubjectAccessReviewStatus(SubjectAccessReviewStatus item){
            super(item);this.builder=new SubjectAccessReviewStatusBuilder(this, item);this.function=new Function<SubjectAccessReviewStatus, SubjectAccessReviewStatus>() {
    public SubjectAccessReviewStatus apply(SubjectAccessReviewStatus item) {
        return item;
    }
}
;
    }

    public SubjectAccessReviewStatus done(){
             return function.apply(builder.build());
    }




}
