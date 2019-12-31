package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PodTemplateSpecBuilder extends PodTemplateSpecFluentImpl<PodTemplateSpecBuilder> implements VisitableBuilder<PodTemplateSpec,PodTemplateSpecBuilder>{

    PodTemplateSpecFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PodTemplateSpecBuilder(){
            this(true);
    }
    public PodTemplateSpecBuilder(Boolean validationEnabled){
            this(new PodTemplateSpec(), validationEnabled);
    }
    public PodTemplateSpecBuilder(PodTemplateSpecFluent<?> fluent){
            this(fluent, true);
    }
    public PodTemplateSpecBuilder(PodTemplateSpecFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new PodTemplateSpec(), validationEnabled);
    }
    public PodTemplateSpecBuilder(PodTemplateSpecFluent<?> fluent,PodTemplateSpec instance){
            this(fluent, instance, true);
    }
    public PodTemplateSpecBuilder(PodTemplateSpecFluent<?> fluent,PodTemplateSpec instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodTemplateSpecBuilder(PodTemplateSpec instance){
            this(instance,true);
    }
    public PodTemplateSpecBuilder(PodTemplateSpec instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodTemplateSpecBuilder(Validator validator){
            this(new PodTemplateSpec(), true);
    }
    public PodTemplateSpecBuilder(PodTemplateSpecFluent<?> fluent,PodTemplateSpec instance,Validator validator){
            this.fluent = fluent; 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PodTemplateSpecBuilder(PodTemplateSpec instance,Validator validator){
            this.fluent = this; 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public PodTemplateSpec build(){
            PodTemplateSpec buildable = new PodTemplateSpec(fluent.getMetadata(),fluent.getSpec());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PodTemplateSpecBuilder that = (PodTemplateSpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
