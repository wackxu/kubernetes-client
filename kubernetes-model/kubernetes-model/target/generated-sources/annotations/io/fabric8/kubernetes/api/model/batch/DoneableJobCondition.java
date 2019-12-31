package io.fabric8.kubernetes.api.model.batch;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableJobCondition extends JobConditionFluentImpl<DoneableJobCondition> implements Doneable<JobCondition>{

    private final JobConditionBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<JobCondition,JobCondition> function;

    public DoneableJobCondition(io.fabric8.kubernetes.api.builder.Function<JobCondition,JobCondition> function){
            super();this.builder=new JobConditionBuilder(this);this.function=function;
    }
    public DoneableJobCondition(JobCondition item,io.fabric8.kubernetes.api.builder.Function<JobCondition,JobCondition> function){
            super(item);this.builder=new JobConditionBuilder(this, item);this.function=function;
    }
    public DoneableJobCondition(JobCondition item){
            super(item);this.builder=new JobConditionBuilder(this, item);this.function=new Function<JobCondition, JobCondition>() {
    public JobCondition apply(JobCondition item) {
        return item;
    }
}
;
    }

    public JobCondition done(){
             return function.apply(builder.build());
    }




}
