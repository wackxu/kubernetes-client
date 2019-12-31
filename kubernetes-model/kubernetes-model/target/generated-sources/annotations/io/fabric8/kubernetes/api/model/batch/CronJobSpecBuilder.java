package io.fabric8.kubernetes.api.model.batch;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class CronJobSpecBuilder extends CronJobSpecFluentImpl<CronJobSpecBuilder> implements VisitableBuilder<CronJobSpec,CronJobSpecBuilder>{

    CronJobSpecFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public CronJobSpecBuilder(){
            this(true);
    }
    public CronJobSpecBuilder(Boolean validationEnabled){
            this(new CronJobSpec(), validationEnabled);
    }
    public CronJobSpecBuilder(CronJobSpecFluent<?> fluent){
            this(fluent, true);
    }
    public CronJobSpecBuilder(CronJobSpecFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new CronJobSpec(), validationEnabled);
    }
    public CronJobSpecBuilder(CronJobSpecFluent<?> fluent,CronJobSpec instance){
            this(fluent, instance, true);
    }
    public CronJobSpecBuilder(CronJobSpecFluent<?> fluent,CronJobSpec instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withConcurrencyPolicy(instance.getConcurrencyPolicy()); 
            fluent.withFailedJobsHistoryLimit(instance.getFailedJobsHistoryLimit()); 
            fluent.withJobTemplate(instance.getJobTemplate()); 
            fluent.withSchedule(instance.getSchedule()); 
            fluent.withStartingDeadlineSeconds(instance.getStartingDeadlineSeconds()); 
            fluent.withSuccessfulJobsHistoryLimit(instance.getSuccessfulJobsHistoryLimit()); 
            fluent.withSuspend(instance.getSuspend()); 
            this.validationEnabled = validationEnabled; 
    }
    public CronJobSpecBuilder(CronJobSpec instance){
            this(instance,true);
    }
    public CronJobSpecBuilder(CronJobSpec instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withConcurrencyPolicy(instance.getConcurrencyPolicy()); 
            this.withFailedJobsHistoryLimit(instance.getFailedJobsHistoryLimit()); 
            this.withJobTemplate(instance.getJobTemplate()); 
            this.withSchedule(instance.getSchedule()); 
            this.withStartingDeadlineSeconds(instance.getStartingDeadlineSeconds()); 
            this.withSuccessfulJobsHistoryLimit(instance.getSuccessfulJobsHistoryLimit()); 
            this.withSuspend(instance.getSuspend()); 
            this.validationEnabled = validationEnabled; 
    }
    public CronJobSpecBuilder(Validator validator){
            this(new CronJobSpec(), true);
    }
    public CronJobSpecBuilder(CronJobSpecFluent<?> fluent,CronJobSpec instance,Validator validator){
            this.fluent = fluent; 
            fluent.withConcurrencyPolicy(instance.getConcurrencyPolicy()); 
            fluent.withFailedJobsHistoryLimit(instance.getFailedJobsHistoryLimit()); 
            fluent.withJobTemplate(instance.getJobTemplate()); 
            fluent.withSchedule(instance.getSchedule()); 
            fluent.withStartingDeadlineSeconds(instance.getStartingDeadlineSeconds()); 
            fluent.withSuccessfulJobsHistoryLimit(instance.getSuccessfulJobsHistoryLimit()); 
            fluent.withSuspend(instance.getSuspend()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public CronJobSpecBuilder(CronJobSpec instance,Validator validator){
            this.fluent = this; 
            this.withConcurrencyPolicy(instance.getConcurrencyPolicy()); 
            this.withFailedJobsHistoryLimit(instance.getFailedJobsHistoryLimit()); 
            this.withJobTemplate(instance.getJobTemplate()); 
            this.withSchedule(instance.getSchedule()); 
            this.withStartingDeadlineSeconds(instance.getStartingDeadlineSeconds()); 
            this.withSuccessfulJobsHistoryLimit(instance.getSuccessfulJobsHistoryLimit()); 
            this.withSuspend(instance.getSuspend()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public CronJobSpec build(){
            CronJobSpec buildable = new CronJobSpec(fluent.getConcurrencyPolicy(),fluent.getFailedJobsHistoryLimit(),fluent.getJobTemplate(),fluent.getSchedule(),fluent.getStartingDeadlineSeconds(),fluent.getSuccessfulJobsHistoryLimit(),fluent.isSuspend());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CronJobSpecBuilder that = (CronJobSpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
