package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class GitLabWebHookCauseBuilder extends GitLabWebHookCauseFluentImpl<GitLabWebHookCauseBuilder> implements VisitableBuilder<GitLabWebHookCause,GitLabWebHookCauseBuilder>{

    GitLabWebHookCauseFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public GitLabWebHookCauseBuilder(){
            this(true);
    }
    public GitLabWebHookCauseBuilder(Boolean validationEnabled){
            this(new GitLabWebHookCause(), validationEnabled);
    }
    public GitLabWebHookCauseBuilder(GitLabWebHookCauseFluent<?> fluent){
            this(fluent, true);
    }
    public GitLabWebHookCauseBuilder(GitLabWebHookCauseFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new GitLabWebHookCause(), validationEnabled);
    }
    public GitLabWebHookCauseBuilder(GitLabWebHookCauseFluent<?> fluent,GitLabWebHookCause instance){
            this(fluent, instance, true);
    }
    public GitLabWebHookCauseBuilder(GitLabWebHookCauseFluent<?> fluent,GitLabWebHookCause instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withRevision(instance.getRevision()); 
            fluent.withSecret(instance.getSecret()); 
            this.validationEnabled = validationEnabled; 
    }
    public GitLabWebHookCauseBuilder(GitLabWebHookCause instance){
            this(instance,true);
    }
    public GitLabWebHookCauseBuilder(GitLabWebHookCause instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withRevision(instance.getRevision()); 
            this.withSecret(instance.getSecret()); 
            this.validationEnabled = validationEnabled; 
    }
    public GitLabWebHookCauseBuilder(Validator validator){
            this(new GitLabWebHookCause(), true);
    }
    public GitLabWebHookCauseBuilder(GitLabWebHookCauseFluent<?> fluent,GitLabWebHookCause instance,Validator validator){
            this.fluent = fluent; 
            fluent.withRevision(instance.getRevision()); 
            fluent.withSecret(instance.getSecret()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public GitLabWebHookCauseBuilder(GitLabWebHookCause instance,Validator validator){
            this.fluent = this; 
            this.withRevision(instance.getRevision()); 
            this.withSecret(instance.getSecret()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public GitLabWebHookCause build(){
            GitLabWebHookCause buildable = new GitLabWebHookCause(fluent.getRevision(),fluent.getSecret());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            GitLabWebHookCauseBuilder that = (GitLabWebHookCauseBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
