package io.fabric8.kubernetes.api.model.batch;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableJobStatus extends JobStatusFluentImpl<DoneableJobStatus> implements Doneable<JobStatus>{

    private final JobStatusBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<JobStatus,JobStatus> function;

    public DoneableJobStatus(io.fabric8.kubernetes.api.builder.Function<JobStatus,JobStatus> function){
            super();this.builder=new JobStatusBuilder(this);this.function=function;
    }
    public DoneableJobStatus(JobStatus item,io.fabric8.kubernetes.api.builder.Function<JobStatus,JobStatus> function){
            super(item);this.builder=new JobStatusBuilder(this, item);this.function=function;
    }
    public DoneableJobStatus(JobStatus item){
            super(item);this.builder=new JobStatusBuilder(this, item);this.function=new Function<JobStatus, JobStatus>() {
    public JobStatus apply(JobStatus item) {
        return item;
    }
}
;
    }

    public JobStatus done(){
             return function.apply(builder.build());
    }




}
