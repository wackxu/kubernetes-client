package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableSubjectAccessReview extends io.fabric8.openshift.api.model.SubjectAccessReviewFluentImpl<DoneableSubjectAccessReview> implements Doneable<io.fabric8.openshift.api.model.SubjectAccessReview>{

    private final io.fabric8.openshift.api.model.SubjectAccessReviewBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<io.fabric8.openshift.api.model.SubjectAccessReview,io.fabric8.openshift.api.model.SubjectAccessReview> function;

    public DoneableSubjectAccessReview(io.fabric8.kubernetes.api.builder.Function<io.fabric8.openshift.api.model.SubjectAccessReview,io.fabric8.openshift.api.model.SubjectAccessReview> function){
            super();this.builder=new SubjectAccessReviewBuilder(this);this.function=function;
    }
    public DoneableSubjectAccessReview(io.fabric8.openshift.api.model.SubjectAccessReview item,io.fabric8.kubernetes.api.builder.Function<io.fabric8.openshift.api.model.SubjectAccessReview,io.fabric8.openshift.api.model.SubjectAccessReview> function){
            super(item);this.builder=new SubjectAccessReviewBuilder(this, item);this.function=function;
    }
    public DoneableSubjectAccessReview(io.fabric8.openshift.api.model.SubjectAccessReview item){
            super(item);this.builder=new SubjectAccessReviewBuilder(this, item);this.function=new Function<io.fabric8.openshift.api.model.SubjectAccessReview, io.fabric8.openshift.api.model.SubjectAccessReview>() {
    public io.fabric8.openshift.api.model.SubjectAccessReview apply(io.fabric8.openshift.api.model.SubjectAccessReview item) {
        return item;
    }
}
;
    }

    public io.fabric8.openshift.api.model.SubjectAccessReview done(){
             return function.apply(builder.build());
    }




}
