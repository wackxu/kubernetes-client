package io.fabric8.kubernetes.api.model.batch;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableCronJobStatus extends CronJobStatusFluentImpl<DoneableCronJobStatus> implements Doneable<CronJobStatus>{

    private final CronJobStatusBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<CronJobStatus,CronJobStatus> function;

    public DoneableCronJobStatus(io.fabric8.kubernetes.api.builder.Function<CronJobStatus,CronJobStatus> function){
            super();this.builder=new CronJobStatusBuilder(this);this.function=function;
    }
    public DoneableCronJobStatus(CronJobStatus item,io.fabric8.kubernetes.api.builder.Function<CronJobStatus,CronJobStatus> function){
            super(item);this.builder=new CronJobStatusBuilder(this, item);this.function=function;
    }
    public DoneableCronJobStatus(CronJobStatus item){
            super(item);this.builder=new CronJobStatusBuilder(this, item);this.function=new Function<CronJobStatus, CronJobStatus>() {
    public CronJobStatus apply(CronJobStatus item) {
        return item;
    }
}
;
    }

    public CronJobStatus done(){
             return function.apply(builder.build());
    }




}
