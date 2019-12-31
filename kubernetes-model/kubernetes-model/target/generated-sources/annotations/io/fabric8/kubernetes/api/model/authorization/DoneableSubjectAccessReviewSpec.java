package io.fabric8.kubernetes.api.model.authorization;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableSubjectAccessReviewSpec extends SubjectAccessReviewSpecFluentImpl<DoneableSubjectAccessReviewSpec> implements Doneable<SubjectAccessReviewSpec>{

    private final SubjectAccessReviewSpecBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<SubjectAccessReviewSpec,SubjectAccessReviewSpec> function;

    public DoneableSubjectAccessReviewSpec(io.fabric8.kubernetes.api.builder.Function<SubjectAccessReviewSpec,SubjectAccessReviewSpec> function){
            super();this.builder=new SubjectAccessReviewSpecBuilder(this);this.function=function;
    }
    public DoneableSubjectAccessReviewSpec(SubjectAccessReviewSpec item,io.fabric8.kubernetes.api.builder.Function<SubjectAccessReviewSpec,SubjectAccessReviewSpec> function){
            super(item);this.builder=new SubjectAccessReviewSpecBuilder(this, item);this.function=function;
    }
    public DoneableSubjectAccessReviewSpec(SubjectAccessReviewSpec item){
            super(item);this.builder=new SubjectAccessReviewSpecBuilder(this, item);this.function=new Function<SubjectAccessReviewSpec, SubjectAccessReviewSpec>() {
    public SubjectAccessReviewSpec apply(SubjectAccessReviewSpec item) {
        return item;
    }
}
;
    }

    public SubjectAccessReviewSpec done(){
             return function.apply(builder.build());
    }




}
