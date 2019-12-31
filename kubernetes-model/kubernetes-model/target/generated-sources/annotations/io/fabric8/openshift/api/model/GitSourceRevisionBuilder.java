package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class GitSourceRevisionBuilder extends GitSourceRevisionFluentImpl<GitSourceRevisionBuilder> implements VisitableBuilder<GitSourceRevision,GitSourceRevisionBuilder>{

    GitSourceRevisionFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public GitSourceRevisionBuilder(){
            this(true);
    }
    public GitSourceRevisionBuilder(Boolean validationEnabled){
            this(new GitSourceRevision(), validationEnabled);
    }
    public GitSourceRevisionBuilder(GitSourceRevisionFluent<?> fluent){
            this(fluent, true);
    }
    public GitSourceRevisionBuilder(GitSourceRevisionFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new GitSourceRevision(), validationEnabled);
    }
    public GitSourceRevisionBuilder(GitSourceRevisionFluent<?> fluent,GitSourceRevision instance){
            this(fluent, instance, true);
    }
    public GitSourceRevisionBuilder(GitSourceRevisionFluent<?> fluent,GitSourceRevision instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAuthor(instance.getAuthor()); 
            fluent.withCommit(instance.getCommit()); 
            fluent.withCommitter(instance.getCommitter()); 
            fluent.withMessage(instance.getMessage()); 
            this.validationEnabled = validationEnabled; 
    }
    public GitSourceRevisionBuilder(GitSourceRevision instance){
            this(instance,true);
    }
    public GitSourceRevisionBuilder(GitSourceRevision instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAuthor(instance.getAuthor()); 
            this.withCommit(instance.getCommit()); 
            this.withCommitter(instance.getCommitter()); 
            this.withMessage(instance.getMessage()); 
            this.validationEnabled = validationEnabled; 
    }
    public GitSourceRevisionBuilder(Validator validator){
            this(new GitSourceRevision(), true);
    }
    public GitSourceRevisionBuilder(GitSourceRevisionFluent<?> fluent,GitSourceRevision instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAuthor(instance.getAuthor()); 
            fluent.withCommit(instance.getCommit()); 
            fluent.withCommitter(instance.getCommitter()); 
            fluent.withMessage(instance.getMessage()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public GitSourceRevisionBuilder(GitSourceRevision instance,Validator validator){
            this.fluent = this; 
            this.withAuthor(instance.getAuthor()); 
            this.withCommit(instance.getCommit()); 
            this.withCommitter(instance.getCommitter()); 
            this.withMessage(instance.getMessage()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public GitSourceRevision build(){
            GitSourceRevision buildable = new GitSourceRevision(fluent.getAuthor(),fluent.getCommit(),fluent.getCommitter(),fluent.getMessage());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            GitSourceRevisionBuilder that = (GitSourceRevisionBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
