package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ProjectRequestBuilder extends ProjectRequestFluentImpl<ProjectRequestBuilder> implements VisitableBuilder<ProjectRequest,ProjectRequestBuilder>{

    ProjectRequestFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ProjectRequestBuilder(){
            this(true);
    }
    public ProjectRequestBuilder(Boolean validationEnabled){
            this(new ProjectRequest(), validationEnabled);
    }
    public ProjectRequestBuilder(ProjectRequestFluent<?> fluent){
            this(fluent, true);
    }
    public ProjectRequestBuilder(ProjectRequestFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ProjectRequest(), validationEnabled);
    }
    public ProjectRequestBuilder(ProjectRequestFluent<?> fluent,ProjectRequest instance){
            this(fluent, instance, true);
    }
    public ProjectRequestBuilder(ProjectRequestFluent<?> fluent,ProjectRequest instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withDescription(instance.getDescription()); 
            fluent.withDisplayName(instance.getDisplayName()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public ProjectRequestBuilder(ProjectRequest instance){
            this(instance,true);
    }
    public ProjectRequestBuilder(ProjectRequest instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withDescription(instance.getDescription()); 
            this.withDisplayName(instance.getDisplayName()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public ProjectRequestBuilder(Validator validator){
            this(new ProjectRequest(), true);
    }
    public ProjectRequestBuilder(ProjectRequestFluent<?> fluent,ProjectRequest instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withDescription(instance.getDescription()); 
            fluent.withDisplayName(instance.getDisplayName()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ProjectRequestBuilder(ProjectRequest instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withDescription(instance.getDescription()); 
            this.withDisplayName(instance.getDisplayName()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ProjectRequest build(){
            ProjectRequest buildable = new ProjectRequest(fluent.getApiVersion(),fluent.getDescription(),fluent.getDisplayName(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ProjectRequestBuilder that = (ProjectRequestBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
