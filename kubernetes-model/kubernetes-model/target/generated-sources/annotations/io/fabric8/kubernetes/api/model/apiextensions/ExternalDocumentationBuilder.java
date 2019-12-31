package io.fabric8.kubernetes.api.model.apiextensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ExternalDocumentationBuilder extends ExternalDocumentationFluentImpl<ExternalDocumentationBuilder> implements VisitableBuilder<ExternalDocumentation,ExternalDocumentationBuilder>{

    ExternalDocumentationFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ExternalDocumentationBuilder(){
            this(true);
    }
    public ExternalDocumentationBuilder(Boolean validationEnabled){
            this(new ExternalDocumentation(), validationEnabled);
    }
    public ExternalDocumentationBuilder(ExternalDocumentationFluent<?> fluent){
            this(fluent, true);
    }
    public ExternalDocumentationBuilder(ExternalDocumentationFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ExternalDocumentation(), validationEnabled);
    }
    public ExternalDocumentationBuilder(ExternalDocumentationFluent<?> fluent,ExternalDocumentation instance){
            this(fluent, instance, true);
    }
    public ExternalDocumentationBuilder(ExternalDocumentationFluent<?> fluent,ExternalDocumentation instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withDescription(instance.getDescription()); 
            fluent.withUrl(instance.getUrl()); 
            this.validationEnabled = validationEnabled; 
    }
    public ExternalDocumentationBuilder(ExternalDocumentation instance){
            this(instance,true);
    }
    public ExternalDocumentationBuilder(ExternalDocumentation instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withDescription(instance.getDescription()); 
            this.withUrl(instance.getUrl()); 
            this.validationEnabled = validationEnabled; 
    }
    public ExternalDocumentationBuilder(Validator validator){
            this(new ExternalDocumentation(), true);
    }
    public ExternalDocumentationBuilder(ExternalDocumentationFluent<?> fluent,ExternalDocumentation instance,Validator validator){
            this.fluent = fluent; 
            fluent.withDescription(instance.getDescription()); 
            fluent.withUrl(instance.getUrl()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ExternalDocumentationBuilder(ExternalDocumentation instance,Validator validator){
            this.fluent = this; 
            this.withDescription(instance.getDescription()); 
            this.withUrl(instance.getUrl()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ExternalDocumentation build(){
            ExternalDocumentation buildable = new ExternalDocumentation(fluent.getDescription(),fluent.getUrl());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ExternalDocumentationBuilder that = (ExternalDocumentationBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
