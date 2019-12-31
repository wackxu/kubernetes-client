package io.fabric8.kubernetes.api.model.batch;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class CronJobBuilder extends CronJobFluentImpl<CronJobBuilder> implements VisitableBuilder<CronJob,CronJobBuilder>{

    CronJobFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public CronJobBuilder(){
            this(true);
    }
    public CronJobBuilder(Boolean validationEnabled){
            this(new CronJob(), validationEnabled);
    }
    public CronJobBuilder(CronJobFluent<?> fluent){
            this(fluent, true);
    }
    public CronJobBuilder(CronJobFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new CronJob(), validationEnabled);
    }
    public CronJobBuilder(CronJobFluent<?> fluent,CronJob instance){
            this(fluent, instance, true);
    }
    public CronJobBuilder(CronJobFluent<?> fluent,CronJob instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            fluent.withStatus(instance.getStatus()); 
            this.validationEnabled = validationEnabled; 
    }
    public CronJobBuilder(CronJob instance){
            this(instance,true);
    }
    public CronJobBuilder(CronJob instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.withStatus(instance.getStatus()); 
            this.validationEnabled = validationEnabled; 
    }
    public CronJobBuilder(Validator validator){
            this(new CronJob(), true);
    }
    public CronJobBuilder(CronJobFluent<?> fluent,CronJob instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            fluent.withStatus(instance.getStatus()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public CronJobBuilder(CronJob instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.withStatus(instance.getStatus()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public CronJob build(){
            CronJob buildable = new CronJob(fluent.getApiVersion(),fluent.getKind(),fluent.getMetadata(),fluent.getSpec(),fluent.getStatus());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CronJobBuilder that = (CronJobBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
