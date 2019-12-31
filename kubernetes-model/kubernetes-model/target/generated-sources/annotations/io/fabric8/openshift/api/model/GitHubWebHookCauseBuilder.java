package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class GitHubWebHookCauseBuilder extends GitHubWebHookCauseFluentImpl<GitHubWebHookCauseBuilder> implements VisitableBuilder<GitHubWebHookCause,GitHubWebHookCauseBuilder>{

    GitHubWebHookCauseFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public GitHubWebHookCauseBuilder(){
            this(true);
    }
    public GitHubWebHookCauseBuilder(Boolean validationEnabled){
            this(new GitHubWebHookCause(), validationEnabled);
    }
    public GitHubWebHookCauseBuilder(GitHubWebHookCauseFluent<?> fluent){
            this(fluent, true);
    }
    public GitHubWebHookCauseBuilder(GitHubWebHookCauseFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new GitHubWebHookCause(), validationEnabled);
    }
    public GitHubWebHookCauseBuilder(GitHubWebHookCauseFluent<?> fluent,GitHubWebHookCause instance){
            this(fluent, instance, true);
    }
    public GitHubWebHookCauseBuilder(GitHubWebHookCauseFluent<?> fluent,GitHubWebHookCause instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withRevision(instance.getRevision()); 
            fluent.withSecret(instance.getSecret()); 
            this.validationEnabled = validationEnabled; 
    }
    public GitHubWebHookCauseBuilder(GitHubWebHookCause instance){
            this(instance,true);
    }
    public GitHubWebHookCauseBuilder(GitHubWebHookCause instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withRevision(instance.getRevision()); 
            this.withSecret(instance.getSecret()); 
            this.validationEnabled = validationEnabled; 
    }
    public GitHubWebHookCauseBuilder(Validator validator){
            this(new GitHubWebHookCause(), true);
    }
    public GitHubWebHookCauseBuilder(GitHubWebHookCauseFluent<?> fluent,GitHubWebHookCause instance,Validator validator){
            this.fluent = fluent; 
            fluent.withRevision(instance.getRevision()); 
            fluent.withSecret(instance.getSecret()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public GitHubWebHookCauseBuilder(GitHubWebHookCause instance,Validator validator){
            this.fluent = this; 
            this.withRevision(instance.getRevision()); 
            this.withSecret(instance.getSecret()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public GitHubWebHookCause build(){
            GitHubWebHookCause buildable = new GitHubWebHookCause(fluent.getRevision(),fluent.getSecret());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            GitHubWebHookCauseBuilder that = (GitHubWebHookCauseBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
