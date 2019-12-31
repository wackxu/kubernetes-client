package io.fabric8.kubernetes.api.model.batch;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableCronJobSpec extends CronJobSpecFluentImpl<DoneableCronJobSpec> implements Doneable<CronJobSpec>{

    private final CronJobSpecBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<CronJobSpec,CronJobSpec> function;

    public DoneableCronJobSpec(io.fabric8.kubernetes.api.builder.Function<CronJobSpec,CronJobSpec> function){
            super();this.builder=new CronJobSpecBuilder(this);this.function=function;
    }
    public DoneableCronJobSpec(CronJobSpec item,io.fabric8.kubernetes.api.builder.Function<CronJobSpec,CronJobSpec> function){
            super(item);this.builder=new CronJobSpecBuilder(this, item);this.function=function;
    }
    public DoneableCronJobSpec(CronJobSpec item){
            super(item);this.builder=new CronJobSpecBuilder(this, item);this.function=new Function<CronJobSpec, CronJobSpec>() {
    public CronJobSpec apply(CronJobSpec item) {
        return item;
    }
}
;
    }

    public CronJobSpec done(){
             return function.apply(builder.build());
    }




}
