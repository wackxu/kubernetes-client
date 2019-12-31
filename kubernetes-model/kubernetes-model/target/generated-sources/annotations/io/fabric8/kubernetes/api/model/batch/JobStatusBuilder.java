package io.fabric8.kubernetes.api.model.batch;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class JobStatusBuilder extends JobStatusFluentImpl<JobStatusBuilder> implements VisitableBuilder<JobStatus,JobStatusBuilder>{

    JobStatusFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public JobStatusBuilder(){
            this(true);
    }
    public JobStatusBuilder(Boolean validationEnabled){
            this(new JobStatus(), validationEnabled);
    }
    public JobStatusBuilder(JobStatusFluent<?> fluent){
            this(fluent, true);
    }
    public JobStatusBuilder(JobStatusFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new JobStatus(), validationEnabled);
    }
    public JobStatusBuilder(JobStatusFluent<?> fluent,JobStatus instance){
            this(fluent, instance, true);
    }
    public JobStatusBuilder(JobStatusFluent<?> fluent,JobStatus instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withActive(instance.getActive()); 
            fluent.withCompletionTime(instance.getCompletionTime()); 
            fluent.withConditions(instance.getConditions()); 
            fluent.withFailed(instance.getFailed()); 
            fluent.withStartTime(instance.getStartTime()); 
            fluent.withSucceeded(instance.getSucceeded()); 
            this.validationEnabled = validationEnabled; 
    }
    public JobStatusBuilder(JobStatus instance){
            this(instance,true);
    }
    public JobStatusBuilder(JobStatus instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withActive(instance.getActive()); 
            this.withCompletionTime(instance.getCompletionTime()); 
            this.withConditions(instance.getConditions()); 
            this.withFailed(instance.getFailed()); 
            this.withStartTime(instance.getStartTime()); 
            this.withSucceeded(instance.getSucceeded()); 
            this.validationEnabled = validationEnabled; 
    }
    public JobStatusBuilder(Validator validator){
            this(new JobStatus(), true);
    }
    public JobStatusBuilder(JobStatusFluent<?> fluent,JobStatus instance,Validator validator){
            this.fluent = fluent; 
            fluent.withActive(instance.getActive()); 
            fluent.withCompletionTime(instance.getCompletionTime()); 
            fluent.withConditions(instance.getConditions()); 
            fluent.withFailed(instance.getFailed()); 
            fluent.withStartTime(instance.getStartTime()); 
            fluent.withSucceeded(instance.getSucceeded()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public JobStatusBuilder(JobStatus instance,Validator validator){
            this.fluent = this; 
            this.withActive(instance.getActive()); 
            this.withCompletionTime(instance.getCompletionTime()); 
            this.withConditions(instance.getConditions()); 
            this.withFailed(instance.getFailed()); 
            this.withStartTime(instance.getStartTime()); 
            this.withSucceeded(instance.getSucceeded()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public JobStatus build(){
            JobStatus buildable = new JobStatus(fluent.getActive(),fluent.getCompletionTime(),fluent.getConditions(),fluent.getFailed(),fluent.getStartTime(),fluent.getSucceeded());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            JobStatusBuilder that = (JobStatusBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
