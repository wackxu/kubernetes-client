package io.fabric8.kubernetes.api.model.batch;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class JobTemplateSpecBuilder extends JobTemplateSpecFluentImpl<JobTemplateSpecBuilder> implements VisitableBuilder<JobTemplateSpec,JobTemplateSpecBuilder>{

    JobTemplateSpecFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public JobTemplateSpecBuilder(){
            this(true);
    }
    public JobTemplateSpecBuilder(Boolean validationEnabled){
            this(new JobTemplateSpec(), validationEnabled);
    }
    public JobTemplateSpecBuilder(JobTemplateSpecFluent<?> fluent){
            this(fluent, true);
    }
    public JobTemplateSpecBuilder(JobTemplateSpecFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new JobTemplateSpec(), validationEnabled);
    }
    public JobTemplateSpecBuilder(JobTemplateSpecFluent<?> fluent,JobTemplateSpec instance){
            this(fluent, instance, true);
    }
    public JobTemplateSpecBuilder(JobTemplateSpecFluent<?> fluent,JobTemplateSpec instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            this.validationEnabled = validationEnabled; 
    }
    public JobTemplateSpecBuilder(JobTemplateSpec instance){
            this(instance,true);
    }
    public JobTemplateSpecBuilder(JobTemplateSpec instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.validationEnabled = validationEnabled; 
    }
    public JobTemplateSpecBuilder(Validator validator){
            this(new JobTemplateSpec(), true);
    }
    public JobTemplateSpecBuilder(JobTemplateSpecFluent<?> fluent,JobTemplateSpec instance,Validator validator){
            this.fluent = fluent; 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public JobTemplateSpecBuilder(JobTemplateSpec instance,Validator validator){
            this.fluent = this; 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public JobTemplateSpec build(){
            JobTemplateSpec buildable = new JobTemplateSpec(fluent.getMetadata(),fluent.getSpec());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            JobTemplateSpecBuilder that = (JobTemplateSpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
