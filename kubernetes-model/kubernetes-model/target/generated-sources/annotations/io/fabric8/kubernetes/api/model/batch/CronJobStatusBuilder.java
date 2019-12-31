package io.fabric8.kubernetes.api.model.batch;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class CronJobStatusBuilder extends CronJobStatusFluentImpl<CronJobStatusBuilder> implements VisitableBuilder<CronJobStatus,CronJobStatusBuilder>{

    CronJobStatusFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public CronJobStatusBuilder(){
            this(true);
    }
    public CronJobStatusBuilder(Boolean validationEnabled){
            this(new CronJobStatus(), validationEnabled);
    }
    public CronJobStatusBuilder(CronJobStatusFluent<?> fluent){
            this(fluent, true);
    }
    public CronJobStatusBuilder(CronJobStatusFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new CronJobStatus(), validationEnabled);
    }
    public CronJobStatusBuilder(CronJobStatusFluent<?> fluent,CronJobStatus instance){
            this(fluent, instance, true);
    }
    public CronJobStatusBuilder(CronJobStatusFluent<?> fluent,CronJobStatus instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withActive(instance.getActive()); 
            fluent.withLastScheduleTime(instance.getLastScheduleTime()); 
            this.validationEnabled = validationEnabled; 
    }
    public CronJobStatusBuilder(CronJobStatus instance){
            this(instance,true);
    }
    public CronJobStatusBuilder(CronJobStatus instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withActive(instance.getActive()); 
            this.withLastScheduleTime(instance.getLastScheduleTime()); 
            this.validationEnabled = validationEnabled; 
    }
    public CronJobStatusBuilder(Validator validator){
            this(new CronJobStatus(), true);
    }
    public CronJobStatusBuilder(CronJobStatusFluent<?> fluent,CronJobStatus instance,Validator validator){
            this.fluent = fluent; 
            fluent.withActive(instance.getActive()); 
            fluent.withLastScheduleTime(instance.getLastScheduleTime()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public CronJobStatusBuilder(CronJobStatus instance,Validator validator){
            this.fluent = this; 
            this.withActive(instance.getActive()); 
            this.withLastScheduleTime(instance.getLastScheduleTime()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public CronJobStatus build(){
            CronJobStatus buildable = new CronJobStatus(fluent.getActive(),fluent.getLastScheduleTime());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CronJobStatusBuilder that = (CronJobStatusBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
