package io.fabric8.kubernetes.api.model.batch;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableJobSpec extends JobSpecFluentImpl<DoneableJobSpec> implements Doneable<JobSpec>{

    private final JobSpecBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<JobSpec,JobSpec> function;

    public DoneableJobSpec(io.fabric8.kubernetes.api.builder.Function<JobSpec,JobSpec> function){
            super();this.builder=new JobSpecBuilder(this);this.function=function;
    }
    public DoneableJobSpec(JobSpec item,io.fabric8.kubernetes.api.builder.Function<JobSpec,JobSpec> function){
            super(item);this.builder=new JobSpecBuilder(this, item);this.function=function;
    }
    public DoneableJobSpec(JobSpec item){
            super(item);this.builder=new JobSpecBuilder(this, item);this.function=new Function<JobSpec, JobSpec>() {
    public JobSpec apply(JobSpec item) {
        return item;
    }
}
;
    }

    public JobSpec done(){
             return function.apply(builder.build());
    }




}
