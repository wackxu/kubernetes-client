package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ProjectStatusBuilder extends ProjectStatusFluentImpl<ProjectStatusBuilder> implements VisitableBuilder<ProjectStatus,ProjectStatusBuilder>{

    ProjectStatusFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ProjectStatusBuilder(){
            this(true);
    }
    public ProjectStatusBuilder(Boolean validationEnabled){
            this(new ProjectStatus(), validationEnabled);
    }
    public ProjectStatusBuilder(ProjectStatusFluent<?> fluent){
            this(fluent, true);
    }
    public ProjectStatusBuilder(ProjectStatusFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ProjectStatus(), validationEnabled);
    }
    public ProjectStatusBuilder(ProjectStatusFluent<?> fluent,ProjectStatus instance){
            this(fluent, instance, true);
    }
    public ProjectStatusBuilder(ProjectStatusFluent<?> fluent,ProjectStatus instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withPhase(instance.getPhase()); 
            this.validationEnabled = validationEnabled; 
    }
    public ProjectStatusBuilder(ProjectStatus instance){
            this(instance,true);
    }
    public ProjectStatusBuilder(ProjectStatus instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withPhase(instance.getPhase()); 
            this.validationEnabled = validationEnabled; 
    }
    public ProjectStatusBuilder(Validator validator){
            this(new ProjectStatus(), true);
    }
    public ProjectStatusBuilder(ProjectStatusFluent<?> fluent,ProjectStatus instance,Validator validator){
            this.fluent = fluent; 
            fluent.withPhase(instance.getPhase()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ProjectStatusBuilder(ProjectStatus instance,Validator validator){
            this.fluent = this; 
            this.withPhase(instance.getPhase()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ProjectStatus build(){
            ProjectStatus buildable = new ProjectStatus(fluent.getPhase());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ProjectStatusBuilder that = (ProjectStatusBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
