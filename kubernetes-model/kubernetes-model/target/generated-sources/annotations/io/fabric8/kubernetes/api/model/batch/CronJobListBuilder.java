package io.fabric8.kubernetes.api.model.batch;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class CronJobListBuilder extends CronJobListFluentImpl<CronJobListBuilder> implements VisitableBuilder<CronJobList,CronJobListBuilder>{

    CronJobListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public CronJobListBuilder(){
            this(true);
    }
    public CronJobListBuilder(Boolean validationEnabled){
            this(new CronJobList(), validationEnabled);
    }
    public CronJobListBuilder(CronJobListFluent<?> fluent){
            this(fluent, true);
    }
    public CronJobListBuilder(CronJobListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new CronJobList(), validationEnabled);
    }
    public CronJobListBuilder(CronJobListFluent<?> fluent,CronJobList instance){
            this(fluent, instance, true);
    }
    public CronJobListBuilder(CronJobListFluent<?> fluent,CronJobList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public CronJobListBuilder(CronJobList instance){
            this(instance,true);
    }
    public CronJobListBuilder(CronJobList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public CronJobListBuilder(Validator validator){
            this(new CronJobList(), true);
    }
    public CronJobListBuilder(CronJobListFluent<?> fluent,CronJobList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public CronJobListBuilder(CronJobList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public CronJobList build(){
            CronJobList buildable = new CronJobList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CronJobListBuilder that = (CronJobListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
