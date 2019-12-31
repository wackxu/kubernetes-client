package io.fabric8.kubernetes.api.model.batch;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class JobSpecBuilder extends JobSpecFluentImpl<JobSpecBuilder> implements VisitableBuilder<JobSpec,JobSpecBuilder>{

    JobSpecFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public JobSpecBuilder(){
            this(true);
    }
    public JobSpecBuilder(Boolean validationEnabled){
            this(new JobSpec(), validationEnabled);
    }
    public JobSpecBuilder(JobSpecFluent<?> fluent){
            this(fluent, true);
    }
    public JobSpecBuilder(JobSpecFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new JobSpec(), validationEnabled);
    }
    public JobSpecBuilder(JobSpecFluent<?> fluent,JobSpec instance){
            this(fluent, instance, true);
    }
    public JobSpecBuilder(JobSpecFluent<?> fluent,JobSpec instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withActiveDeadlineSeconds(instance.getActiveDeadlineSeconds()); 
            fluent.withBackoffLimit(instance.getBackoffLimit()); 
            fluent.withCompletions(instance.getCompletions()); 
            fluent.withManualSelector(instance.getManualSelector()); 
            fluent.withParallelism(instance.getParallelism()); 
            fluent.withSelector(instance.getSelector()); 
            fluent.withTemplate(instance.getTemplate()); 
            fluent.withTtlSecondsAfterFinished(instance.getTtlSecondsAfterFinished()); 
            this.validationEnabled = validationEnabled; 
    }
    public JobSpecBuilder(JobSpec instance){
            this(instance,true);
    }
    public JobSpecBuilder(JobSpec instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withActiveDeadlineSeconds(instance.getActiveDeadlineSeconds()); 
            this.withBackoffLimit(instance.getBackoffLimit()); 
            this.withCompletions(instance.getCompletions()); 
            this.withManualSelector(instance.getManualSelector()); 
            this.withParallelism(instance.getParallelism()); 
            this.withSelector(instance.getSelector()); 
            this.withTemplate(instance.getTemplate()); 
            this.withTtlSecondsAfterFinished(instance.getTtlSecondsAfterFinished()); 
            this.validationEnabled = validationEnabled; 
    }
    public JobSpecBuilder(Validator validator){
            this(new JobSpec(), true);
    }
    public JobSpecBuilder(JobSpecFluent<?> fluent,JobSpec instance,Validator validator){
            this.fluent = fluent; 
            fluent.withActiveDeadlineSeconds(instance.getActiveDeadlineSeconds()); 
            fluent.withBackoffLimit(instance.getBackoffLimit()); 
            fluent.withCompletions(instance.getCompletions()); 
            fluent.withManualSelector(instance.getManualSelector()); 
            fluent.withParallelism(instance.getParallelism()); 
            fluent.withSelector(instance.getSelector()); 
            fluent.withTemplate(instance.getTemplate()); 
            fluent.withTtlSecondsAfterFinished(instance.getTtlSecondsAfterFinished()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public JobSpecBuilder(JobSpec instance,Validator validator){
            this.fluent = this; 
            this.withActiveDeadlineSeconds(instance.getActiveDeadlineSeconds()); 
            this.withBackoffLimit(instance.getBackoffLimit()); 
            this.withCompletions(instance.getCompletions()); 
            this.withManualSelector(instance.getManualSelector()); 
            this.withParallelism(instance.getParallelism()); 
            this.withSelector(instance.getSelector()); 
            this.withTemplate(instance.getTemplate()); 
            this.withTtlSecondsAfterFinished(instance.getTtlSecondsAfterFinished()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public JobSpec build(){
            JobSpec buildable = new JobSpec(fluent.getActiveDeadlineSeconds(),fluent.getBackoffLimit(),fluent.getCompletions(),fluent.isManualSelector(),fluent.getParallelism(),fluent.getSelector(),fluent.getTemplate(),fluent.getTtlSecondsAfterFinished());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            JobSpecBuilder that = (JobSpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
