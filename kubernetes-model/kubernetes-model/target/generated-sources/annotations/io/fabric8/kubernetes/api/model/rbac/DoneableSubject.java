package io.fabric8.kubernetes.api.model.rbac;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableSubject extends SubjectFluentImpl<DoneableSubject> implements Doneable<Subject>{

    private final SubjectBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Subject,Subject> function;

    public DoneableSubject(io.fabric8.kubernetes.api.builder.Function<Subject,Subject> function){
            super();this.builder=new SubjectBuilder(this);this.function=function;
    }
    public DoneableSubject(Subject item,io.fabric8.kubernetes.api.builder.Function<Subject,Subject> function){
            super(item);this.builder=new SubjectBuilder(this, item);this.function=function;
    }
    public DoneableSubject(Subject item){
            super(item);this.builder=new SubjectBuilder(this, item);this.function=new Function<Subject, Subject>() {
    public Subject apply(Subject item) {
        return item;
    }
}
;
    }

    public Subject done(){
             return function.apply(builder.build());
    }




}
