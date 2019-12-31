package io.fabric8.kubernetes.api.model.batch;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class JobListBuilder extends JobListFluentImpl<JobListBuilder> implements VisitableBuilder<JobList,JobListBuilder>{

    JobListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public JobListBuilder(){
            this(true);
    }
    public JobListBuilder(Boolean validationEnabled){
            this(new JobList(), validationEnabled);
    }
    public JobListBuilder(JobListFluent<?> fluent){
            this(fluent, true);
    }
    public JobListBuilder(JobListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new JobList(), validationEnabled);
    }
    public JobListBuilder(JobListFluent<?> fluent,JobList instance){
            this(fluent, instance, true);
    }
    public JobListBuilder(JobListFluent<?> fluent,JobList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public JobListBuilder(JobList instance){
            this(instance,true);
    }
    public JobListBuilder(JobList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public JobListBuilder(Validator validator){
            this(new JobList(), true);
    }
    public JobListBuilder(JobListFluent<?> fluent,JobList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public JobListBuilder(JobList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public JobList build(){
            JobList buildable = new JobList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            JobListBuilder that = (JobListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
