package io.fabric8.kubernetes.api.model.batch;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableCronJob extends CronJobFluentImpl<DoneableCronJob> implements Doneable<CronJob>{

    private final CronJobBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<CronJob,CronJob> function;

    public DoneableCronJob(io.fabric8.kubernetes.api.builder.Function<CronJob,CronJob> function){
            super();this.builder=new CronJobBuilder(this);this.function=function;
    }
    public DoneableCronJob(CronJob item,io.fabric8.kubernetes.api.builder.Function<CronJob,CronJob> function){
            super(item);this.builder=new CronJobBuilder(this, item);this.function=function;
    }
    public DoneableCronJob(CronJob item){
            super(item);this.builder=new CronJobBuilder(this, item);this.function=new Function<CronJob, CronJob>() {
    public CronJob apply(CronJob item) {
        return item;
    }
}
;
    }

    public CronJob done(){
             return function.apply(builder.build());
    }




}
