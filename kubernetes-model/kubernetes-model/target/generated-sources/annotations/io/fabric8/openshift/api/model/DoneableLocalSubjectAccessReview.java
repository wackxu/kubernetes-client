package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableLocalSubjectAccessReview extends io.fabric8.openshift.api.model.LocalSubjectAccessReviewFluentImpl<DoneableLocalSubjectAccessReview> implements Doneable<io.fabric8.openshift.api.model.LocalSubjectAccessReview>{

    private final io.fabric8.openshift.api.model.LocalSubjectAccessReviewBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<io.fabric8.openshift.api.model.LocalSubjectAccessReview,io.fabric8.openshift.api.model.LocalSubjectAccessReview> function;

    public DoneableLocalSubjectAccessReview(io.fabric8.kubernetes.api.builder.Function<io.fabric8.openshift.api.model.LocalSubjectAccessReview,io.fabric8.openshift.api.model.LocalSubjectAccessReview> function){
            super();this.builder=new LocalSubjectAccessReviewBuilder(this);this.function=function;
    }
    public DoneableLocalSubjectAccessReview(io.fabric8.openshift.api.model.LocalSubjectAccessReview item,io.fabric8.kubernetes.api.builder.Function<io.fabric8.openshift.api.model.LocalSubjectAccessReview,io.fabric8.openshift.api.model.LocalSubjectAccessReview> function){
            super(item);this.builder=new LocalSubjectAccessReviewBuilder(this, item);this.function=function;
    }
    public DoneableLocalSubjectAccessReview(io.fabric8.openshift.api.model.LocalSubjectAccessReview item){
            super(item);this.builder=new LocalSubjectAccessReviewBuilder(this, item);this.function=new Function<io.fabric8.openshift.api.model.LocalSubjectAccessReview, io.fabric8.openshift.api.model.LocalSubjectAccessReview>() {
    public io.fabric8.openshift.api.model.LocalSubjectAccessReview apply(io.fabric8.openshift.api.model.LocalSubjectAccessReview item) {
        return item;
    }
}
;
    }

    public io.fabric8.openshift.api.model.LocalSubjectAccessReview done(){
             return function.apply(builder.build());
    }




}
