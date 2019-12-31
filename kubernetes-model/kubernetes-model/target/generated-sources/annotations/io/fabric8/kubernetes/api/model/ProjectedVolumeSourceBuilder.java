package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ProjectedVolumeSourceBuilder extends ProjectedVolumeSourceFluentImpl<ProjectedVolumeSourceBuilder> implements VisitableBuilder<ProjectedVolumeSource,ProjectedVolumeSourceBuilder>{

    ProjectedVolumeSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ProjectedVolumeSourceBuilder(){
            this(true);
    }
    public ProjectedVolumeSourceBuilder(Boolean validationEnabled){
            this(new ProjectedVolumeSource(), validationEnabled);
    }
    public ProjectedVolumeSourceBuilder(ProjectedVolumeSourceFluent<?> fluent){
            this(fluent, true);
    }
    public ProjectedVolumeSourceBuilder(ProjectedVolumeSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ProjectedVolumeSource(), validationEnabled);
    }
    public ProjectedVolumeSourceBuilder(ProjectedVolumeSourceFluent<?> fluent,ProjectedVolumeSource instance){
            this(fluent, instance, true);
    }
    public ProjectedVolumeSourceBuilder(ProjectedVolumeSourceFluent<?> fluent,ProjectedVolumeSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withDefaultMode(instance.getDefaultMode()); 
            fluent.withSources(instance.getSources()); 
            this.validationEnabled = validationEnabled; 
    }
    public ProjectedVolumeSourceBuilder(ProjectedVolumeSource instance){
            this(instance,true);
    }
    public ProjectedVolumeSourceBuilder(ProjectedVolumeSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withDefaultMode(instance.getDefaultMode()); 
            this.withSources(instance.getSources()); 
            this.validationEnabled = validationEnabled; 
    }
    public ProjectedVolumeSourceBuilder(Validator validator){
            this(new ProjectedVolumeSource(), true);
    }
    public ProjectedVolumeSourceBuilder(ProjectedVolumeSourceFluent<?> fluent,ProjectedVolumeSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withDefaultMode(instance.getDefaultMode()); 
            fluent.withSources(instance.getSources()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ProjectedVolumeSourceBuilder(ProjectedVolumeSource instance,Validator validator){
            this.fluent = this; 
            this.withDefaultMode(instance.getDefaultMode()); 
            this.withSources(instance.getSources()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ProjectedVolumeSource build(){
            ProjectedVolumeSource buildable = new ProjectedVolumeSource(fluent.getDefaultMode(),fluent.getSources());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ProjectedVolumeSourceBuilder that = (ProjectedVolumeSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
