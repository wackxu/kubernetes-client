package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ProjectSpecBuilder extends ProjectSpecFluentImpl<ProjectSpecBuilder> implements VisitableBuilder<ProjectSpec,ProjectSpecBuilder>{

    ProjectSpecFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ProjectSpecBuilder(){
            this(true);
    }
    public ProjectSpecBuilder(Boolean validationEnabled){
            this(new ProjectSpec(), validationEnabled);
    }
    public ProjectSpecBuilder(ProjectSpecFluent<?> fluent){
            this(fluent, true);
    }
    public ProjectSpecBuilder(ProjectSpecFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ProjectSpec(), validationEnabled);
    }
    public ProjectSpecBuilder(ProjectSpecFluent<?> fluent,ProjectSpec instance){
            this(fluent, instance, true);
    }
    public ProjectSpecBuilder(ProjectSpecFluent<?> fluent,ProjectSpec instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withFinalizers(instance.getFinalizers()); 
            this.validationEnabled = validationEnabled; 
    }
    public ProjectSpecBuilder(ProjectSpec instance){
            this(instance,true);
    }
    public ProjectSpecBuilder(ProjectSpec instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withFinalizers(instance.getFinalizers()); 
            this.validationEnabled = validationEnabled; 
    }
    public ProjectSpecBuilder(Validator validator){
            this(new ProjectSpec(), true);
    }
    public ProjectSpecBuilder(ProjectSpecFluent<?> fluent,ProjectSpec instance,Validator validator){
            this.fluent = fluent; 
            fluent.withFinalizers(instance.getFinalizers()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ProjectSpecBuilder(ProjectSpec instance,Validator validator){
            this.fluent = this; 
            this.withFinalizers(instance.getFinalizers()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ProjectSpec build(){
            ProjectSpec buildable = new ProjectSpec(fluent.getFinalizers());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ProjectSpecBuilder that = (ProjectSpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
