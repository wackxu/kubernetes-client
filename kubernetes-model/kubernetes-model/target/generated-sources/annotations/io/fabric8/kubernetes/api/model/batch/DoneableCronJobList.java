package io.fabric8.kubernetes.api.model.batch;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableCronJobList extends CronJobListFluentImpl<DoneableCronJobList> implements Doneable<CronJobList>{

    private final CronJobListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<CronJobList,CronJobList> function;

    public DoneableCronJobList(io.fabric8.kubernetes.api.builder.Function<CronJobList,CronJobList> function){
            super();this.builder=new CronJobListBuilder(this);this.function=function;
    }
    public DoneableCronJobList(CronJobList item,io.fabric8.kubernetes.api.builder.Function<CronJobList,CronJobList> function){
            super(item);this.builder=new CronJobListBuilder(this, item);this.function=function;
    }
    public DoneableCronJobList(CronJobList item){
            super(item);this.builder=new CronJobListBuilder(this, item);this.function=new Function<CronJobList, CronJobList>() {
    public CronJobList apply(CronJobList item) {
        return item;
    }
}
;
    }

    public CronJobList done(){
             return function.apply(builder.build());
    }




}
