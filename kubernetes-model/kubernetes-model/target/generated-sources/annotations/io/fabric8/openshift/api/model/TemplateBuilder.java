package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class TemplateBuilder extends TemplateFluentImpl<TemplateBuilder> implements VisitableBuilder<Template,TemplateBuilder>{

    TemplateFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public TemplateBuilder(){
            this(true);
    }
    public TemplateBuilder(Boolean validationEnabled){
            this(new Template(), validationEnabled);
    }
    public TemplateBuilder(TemplateFluent<?> fluent){
            this(fluent, true);
    }
    public TemplateBuilder(TemplateFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new Template(), validationEnabled);
    }
    public TemplateBuilder(TemplateFluent<?> fluent,Template instance){
            this(fluent, instance, true);
    }
    public TemplateBuilder(TemplateFluent<?> fluent,Template instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withLabels(instance.getLabels()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withObjects(instance.getObjects()); 
            fluent.withParameters(instance.getParameters()); 
            this.validationEnabled = validationEnabled; 
    }
    public TemplateBuilder(Template instance){
            this(instance,true);
    }
    public TemplateBuilder(Template instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withLabels(instance.getLabels()); 
            this.withMetadata(instance.getMetadata()); 
            this.withObjects(instance.getObjects()); 
            this.withParameters(instance.getParameters()); 
            this.validationEnabled = validationEnabled; 
    }
    public TemplateBuilder(Validator validator){
            this(new Template(), true);
    }
    public TemplateBuilder(TemplateFluent<?> fluent,Template instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withLabels(instance.getLabels()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withObjects(instance.getObjects()); 
            fluent.withParameters(instance.getParameters()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public TemplateBuilder(Template instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withLabels(instance.getLabels()); 
            this.withMetadata(instance.getMetadata()); 
            this.withObjects(instance.getObjects()); 
            this.withParameters(instance.getParameters()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public Template build(){
            Template buildable = new Template(fluent.getApiVersion(),fluent.getKind(),fluent.getLabels(),fluent.getMetadata(),fluent.getObjects(),fluent.getParameters());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            TemplateBuilder that = (TemplateBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
