package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ProjectListBuilder extends ProjectListFluentImpl<ProjectListBuilder> implements VisitableBuilder<ProjectList,ProjectListBuilder>{

    ProjectListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ProjectListBuilder(){
            this(true);
    }
    public ProjectListBuilder(Boolean validationEnabled){
            this(new ProjectList(), validationEnabled);
    }
    public ProjectListBuilder(ProjectListFluent<?> fluent){
            this(fluent, true);
    }
    public ProjectListBuilder(ProjectListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ProjectList(), validationEnabled);
    }
    public ProjectListBuilder(ProjectListFluent<?> fluent,ProjectList instance){
            this(fluent, instance, true);
    }
    public ProjectListBuilder(ProjectListFluent<?> fluent,ProjectList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public ProjectListBuilder(ProjectList instance){
            this(instance,true);
    }
    public ProjectListBuilder(ProjectList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public ProjectListBuilder(Validator validator){
            this(new ProjectList(), true);
    }
    public ProjectListBuilder(ProjectListFluent<?> fluent,ProjectList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ProjectListBuilder(ProjectList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ProjectList build(){
            ProjectList buildable = new ProjectList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ProjectListBuilder that = (ProjectListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
