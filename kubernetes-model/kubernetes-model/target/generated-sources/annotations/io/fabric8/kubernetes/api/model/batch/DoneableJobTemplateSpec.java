package io.fabric8.kubernetes.api.model.batch;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableJobTemplateSpec extends JobTemplateSpecFluentImpl<DoneableJobTemplateSpec> implements Doneable<JobTemplateSpec>{

    private final JobTemplateSpecBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<JobTemplateSpec,JobTemplateSpec> function;

    public DoneableJobTemplateSpec(io.fabric8.kubernetes.api.builder.Function<JobTemplateSpec,JobTemplateSpec> function){
            super();this.builder=new JobTemplateSpecBuilder(this);this.function=function;
    }
    public DoneableJobTemplateSpec(JobTemplateSpec item,io.fabric8.kubernetes.api.builder.Function<JobTemplateSpec,JobTemplateSpec> function){
            super(item);this.builder=new JobTemplateSpecBuilder(this, item);this.function=function;
    }
    public DoneableJobTemplateSpec(JobTemplateSpec item){
            super(item);this.builder=new JobTemplateSpecBuilder(this, item);this.function=new Function<JobTemplateSpec, JobTemplateSpec>() {
    public JobTemplateSpec apply(JobTemplateSpec item) {
        return item;
    }
}
;
    }

    public JobTemplateSpec done(){
             return function.apply(builder.build());
    }




}
