package io.fabric8.kubernetes.api.model.batch;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class JobConditionBuilder extends JobConditionFluentImpl<JobConditionBuilder> implements VisitableBuilder<JobCondition,JobConditionBuilder>{

    JobConditionFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public JobConditionBuilder(){
            this(true);
    }
    public JobConditionBuilder(Boolean validationEnabled){
            this(new JobCondition(), validationEnabled);
    }
    public JobConditionBuilder(JobConditionFluent<?> fluent){
            this(fluent, true);
    }
    public JobConditionBuilder(JobConditionFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new JobCondition(), validationEnabled);
    }
    public JobConditionBuilder(JobConditionFluent<?> fluent,JobCondition instance){
            this(fluent, instance, true);
    }
    public JobConditionBuilder(JobConditionFluent<?> fluent,JobCondition instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withLastProbeTime(instance.getLastProbeTime()); 
            fluent.withLastTransitionTime(instance.getLastTransitionTime()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withReason(instance.getReason()); 
            fluent.withStatus(instance.getStatus()); 
            fluent.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public JobConditionBuilder(JobCondition instance){
            this(instance,true);
    }
    public JobConditionBuilder(JobCondition instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withLastProbeTime(instance.getLastProbeTime()); 
            this.withLastTransitionTime(instance.getLastTransitionTime()); 
            this.withMessage(instance.getMessage()); 
            this.withReason(instance.getReason()); 
            this.withStatus(instance.getStatus()); 
            this.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public JobConditionBuilder(Validator validator){
            this(new JobCondition(), true);
    }
    public JobConditionBuilder(JobConditionFluent<?> fluent,JobCondition instance,Validator validator){
            this.fluent = fluent; 
            fluent.withLastProbeTime(instance.getLastProbeTime()); 
            fluent.withLastTransitionTime(instance.getLastTransitionTime()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withReason(instance.getReason()); 
            fluent.withStatus(instance.getStatus()); 
            fluent.withType(instance.getType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public JobConditionBuilder(JobCondition instance,Validator validator){
            this.fluent = this; 
            this.withLastProbeTime(instance.getLastProbeTime()); 
            this.withLastTransitionTime(instance.getLastTransitionTime()); 
            this.withMessage(instance.getMessage()); 
            this.withReason(instance.getReason()); 
            this.withStatus(instance.getStatus()); 
            this.withType(instance.getType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public JobCondition build(){
            JobCondition buildable = new JobCondition(fluent.getLastProbeTime(),fluent.getLastTransitionTime(),fluent.getMessage(),fluent.getReason(),fluent.getStatus(),fluent.getType());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            JobConditionBuilder that = (JobConditionBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
