package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class GitRepoVolumeSourceBuilder extends GitRepoVolumeSourceFluentImpl<GitRepoVolumeSourceBuilder> implements VisitableBuilder<GitRepoVolumeSource,GitRepoVolumeSourceBuilder>{

    GitRepoVolumeSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public GitRepoVolumeSourceBuilder(){
            this(true);
    }
    public GitRepoVolumeSourceBuilder(Boolean validationEnabled){
            this(new GitRepoVolumeSource(), validationEnabled);
    }
    public GitRepoVolumeSourceBuilder(GitRepoVolumeSourceFluent<?> fluent){
            this(fluent, true);
    }
    public GitRepoVolumeSourceBuilder(GitRepoVolumeSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new GitRepoVolumeSource(), validationEnabled);
    }
    public GitRepoVolumeSourceBuilder(GitRepoVolumeSourceFluent<?> fluent,GitRepoVolumeSource instance){
            this(fluent, instance, true);
    }
    public GitRepoVolumeSourceBuilder(GitRepoVolumeSourceFluent<?> fluent,GitRepoVolumeSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withDirectory(instance.getDirectory()); 
            fluent.withRepository(instance.getRepository()); 
            fluent.withRevision(instance.getRevision()); 
            this.validationEnabled = validationEnabled; 
    }
    public GitRepoVolumeSourceBuilder(GitRepoVolumeSource instance){
            this(instance,true);
    }
    public GitRepoVolumeSourceBuilder(GitRepoVolumeSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withDirectory(instance.getDirectory()); 
            this.withRepository(instance.getRepository()); 
            this.withRevision(instance.getRevision()); 
            this.validationEnabled = validationEnabled; 
    }
    public GitRepoVolumeSourceBuilder(Validator validator){
            this(new GitRepoVolumeSource(), true);
    }
    public GitRepoVolumeSourceBuilder(GitRepoVolumeSourceFluent<?> fluent,GitRepoVolumeSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withDirectory(instance.getDirectory()); 
            fluent.withRepository(instance.getRepository()); 
            fluent.withRevision(instance.getRevision()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public GitRepoVolumeSourceBuilder(GitRepoVolumeSource instance,Validator validator){
            this.fluent = this; 
            this.withDirectory(instance.getDirectory()); 
            this.withRepository(instance.getRepository()); 
            this.withRevision(instance.getRevision()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public GitRepoVolumeSource build(){
            GitRepoVolumeSource buildable = new GitRepoVolumeSource(fluent.getDirectory(),fluent.getRepository(),fluent.getRevision());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            GitRepoVolumeSourceBuilder that = (GitRepoVolumeSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
