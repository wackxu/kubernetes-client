package io.fabric8.kubernetes.api.model.batch;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableJobList extends JobListFluentImpl<DoneableJobList> implements Doneable<JobList>{

    private final JobListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<JobList,JobList> function;

    public DoneableJobList(io.fabric8.kubernetes.api.builder.Function<JobList,JobList> function){
            super();this.builder=new JobListBuilder(this);this.function=function;
    }
    public DoneableJobList(JobList item,io.fabric8.kubernetes.api.builder.Function<JobList,JobList> function){
            super(item);this.builder=new JobListBuilder(this, item);this.function=function;
    }
    public DoneableJobList(JobList item){
            super(item);this.builder=new JobListBuilder(this, item);this.function=new Function<JobList, JobList>() {
    public JobList apply(JobList item) {
        return item;
    }
}
;
    }

    public JobList done(){
             return function.apply(builder.build());
    }




}
