package io.fabric8.kubernetes.api.model.authorization;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableSubjectAccessReview extends SubjectAccessReviewFluentImpl<DoneableSubjectAccessReview> implements Doneable<SubjectAccessReview>{

    private final SubjectAccessReviewBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<SubjectAccessReview,SubjectAccessReview> function;

    public DoneableSubjectAccessReview(io.fabric8.kubernetes.api.builder.Function<SubjectAccessReview,SubjectAccessReview> function){
            super();this.builder=new SubjectAccessReviewBuilder(this);this.function=function;
    }
    public DoneableSubjectAccessReview(SubjectAccessReview item,io.fabric8.kubernetes.api.builder.Function<SubjectAccessReview,SubjectAccessReview> function){
            super(item);this.builder=new SubjectAccessReviewBuilder(this, item);this.function=function;
    }
    public DoneableSubjectAccessReview(SubjectAccessReview item){
            super(item);this.builder=new SubjectAccessReviewBuilder(this, item);this.function=new Function<SubjectAccessReview, SubjectAccessReview>() {
    public SubjectAccessReview apply(SubjectAccessReview item) {
        return item;
    }
}
;
    }

    public SubjectAccessReview done(){
             return function.apply(builder.build());
    }




}
