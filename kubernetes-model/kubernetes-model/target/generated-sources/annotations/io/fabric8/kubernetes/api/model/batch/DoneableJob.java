package io.fabric8.kubernetes.api.model.batch;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableJob extends JobFluentImpl<DoneableJob> implements Doneable<Job>{

    private final JobBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<Job,Job> function;

    public DoneableJob(io.fabric8.kubernetes.api.builder.Function<Job,Job> function){
            super();this.builder=new JobBuilder(this);this.function=function;
    }
    public DoneableJob(Job item,io.fabric8.kubernetes.api.builder.Function<Job,Job> function){
            super(item);this.builder=new JobBuilder(this, item);this.function=function;
    }
    public DoneableJob(Job item){
            super(item);this.builder=new JobBuilder(this, item);this.function=new Function<Job, Job>() {
    public Job apply(Job item) {
        return item;
    }
}
;
    }

    public Job done(){
             return function.apply(builder.build());
    }




}
