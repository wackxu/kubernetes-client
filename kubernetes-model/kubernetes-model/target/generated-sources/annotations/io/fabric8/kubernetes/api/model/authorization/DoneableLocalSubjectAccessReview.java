package io.fabric8.kubernetes.api.model.authorization;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableLocalSubjectAccessReview extends LocalSubjectAccessReviewFluentImpl<DoneableLocalSubjectAccessReview> implements Doneable<LocalSubjectAccessReview>{

    private final LocalSubjectAccessReviewBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<LocalSubjectAccessReview,LocalSubjectAccessReview> function;

    public DoneableLocalSubjectAccessReview(io.fabric8.kubernetes.api.builder.Function<LocalSubjectAccessReview,LocalSubjectAccessReview> function){
            super();this.builder=new LocalSubjectAccessReviewBuilder(this);this.function=function;
    }
    public DoneableLocalSubjectAccessReview(LocalSubjectAccessReview item,io.fabric8.kubernetes.api.builder.Function<LocalSubjectAccessReview,LocalSubjectAccessReview> function){
            super(item);this.builder=new LocalSubjectAccessReviewBuilder(this, item);this.function=function;
    }
    public DoneableLocalSubjectAccessReview(LocalSubjectAccessReview item){
            super(item);this.builder=new LocalSubjectAccessReviewBuilder(this, item);this.function=new Function<LocalSubjectAccessReview, LocalSubjectAccessReview>() {
    public LocalSubjectAccessReview apply(LocalSubjectAccessReview item) {
        return item;
    }
}
;
    }

    public LocalSubjectAccessReview done(){
             return function.apply(builder.build());
    }




}
