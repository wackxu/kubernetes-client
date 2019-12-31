package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PodTemplateBuilder extends PodTemplateFluentImpl<PodTemplateBuilder> implements VisitableBuilder<PodTemplate,PodTemplateBuilder>{

    PodTemplateFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PodTemplateBuilder(){
            this(true);
    }
    public PodTemplateBuilder(Boolean validationEnabled){
            this(new PodTemplate(), validationEnabled);
    }
    public PodTemplateBuilder(PodTemplateFluent<?> fluent){
            this(fluent, true);
    }
    public PodTemplateBuilder(PodTemplateFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new PodTemplate(), validationEnabled);
    }
    public PodTemplateBuilder(PodTemplateFluent<?> fluent,PodTemplate instance){
            this(fluent, instance, true);
    }
    public PodTemplateBuilder(PodTemplateFluent<?> fluent,PodTemplate instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withTemplate(instance.getTemplate()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodTemplateBuilder(PodTemplate instance){
            this(instance,true);
    }
    public PodTemplateBuilder(PodTemplate instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withTemplate(instance.getTemplate()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodTemplateBuilder(Validator validator){
            this(new PodTemplate(), true);
    }
    public PodTemplateBuilder(PodTemplateFluent<?> fluent,PodTemplate instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withTemplate(instance.getTemplate()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PodTemplateBuilder(PodTemplate instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withTemplate(instance.getTemplate()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public PodTemplate build(){
            PodTemplate buildable = new PodTemplate(fluent.getApiVersion(),fluent.getKind(),fluent.getMetadata(),fluent.getTemplate());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PodTemplateBuilder that = (PodTemplateBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
