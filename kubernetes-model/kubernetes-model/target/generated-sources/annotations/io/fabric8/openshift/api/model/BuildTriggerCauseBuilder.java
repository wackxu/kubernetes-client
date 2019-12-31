package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class BuildTriggerCauseBuilder extends BuildTriggerCauseFluentImpl<BuildTriggerCauseBuilder> implements VisitableBuilder<BuildTriggerCause,BuildTriggerCauseBuilder>{

    BuildTriggerCauseFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public BuildTriggerCauseBuilder(){
            this(true);
    }
    public BuildTriggerCauseBuilder(Boolean validationEnabled){
            this(new BuildTriggerCause(), validationEnabled);
    }
    public BuildTriggerCauseBuilder(BuildTriggerCauseFluent<?> fluent){
            this(fluent, true);
    }
    public BuildTriggerCauseBuilder(BuildTriggerCauseFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new BuildTriggerCause(), validationEnabled);
    }
    public BuildTriggerCauseBuilder(BuildTriggerCauseFluent<?> fluent,BuildTriggerCause instance){
            this(fluent, instance, true);
    }
    public BuildTriggerCauseBuilder(BuildTriggerCauseFluent<?> fluent,BuildTriggerCause instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withBitbucketWebHook(instance.getBitbucketWebHook()); 
            fluent.withGenericWebHook(instance.getGenericWebHook()); 
            fluent.withGithubWebHook(instance.getGithubWebHook()); 
            fluent.withGitlabWebHook(instance.getGitlabWebHook()); 
            fluent.withImageChangeBuild(instance.getImageChangeBuild()); 
            fluent.withMessage(instance.getMessage()); 
            this.validationEnabled = validationEnabled; 
    }
    public BuildTriggerCauseBuilder(BuildTriggerCause instance){
            this(instance,true);
    }
    public BuildTriggerCauseBuilder(BuildTriggerCause instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withBitbucketWebHook(instance.getBitbucketWebHook()); 
            this.withGenericWebHook(instance.getGenericWebHook()); 
            this.withGithubWebHook(instance.getGithubWebHook()); 
            this.withGitlabWebHook(instance.getGitlabWebHook()); 
            this.withImageChangeBuild(instance.getImageChangeBuild()); 
            this.withMessage(instance.getMessage()); 
            this.validationEnabled = validationEnabled; 
    }
    public BuildTriggerCauseBuilder(Validator validator){
            this(new BuildTriggerCause(), true);
    }
    public BuildTriggerCauseBuilder(BuildTriggerCauseFluent<?> fluent,BuildTriggerCause instance,Validator validator){
            this.fluent = fluent; 
            fluent.withBitbucketWebHook(instance.getBitbucketWebHook()); 
            fluent.withGenericWebHook(instance.getGenericWebHook()); 
            fluent.withGithubWebHook(instance.getGithubWebHook()); 
            fluent.withGitlabWebHook(instance.getGitlabWebHook()); 
            fluent.withImageChangeBuild(instance.getImageChangeBuild()); 
            fluent.withMessage(instance.getMessage()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public BuildTriggerCauseBuilder(BuildTriggerCause instance,Validator validator){
            this.fluent = this; 
            this.withBitbucketWebHook(instance.getBitbucketWebHook()); 
            this.withGenericWebHook(instance.getGenericWebHook()); 
            this.withGithubWebHook(instance.getGithubWebHook()); 
            this.withGitlabWebHook(instance.getGitlabWebHook()); 
            this.withImageChangeBuild(instance.getImageChangeBuild()); 
            this.withMessage(instance.getMessage()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public BuildTriggerCause build(){
            BuildTriggerCause buildable = new BuildTriggerCause(fluent.getBitbucketWebHook(),fluent.getGenericWebHook(),fluent.getGithubWebHook(),fluent.getGitlabWebHook(),fluent.getImageChangeBuild(),fluent.getMessage());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            BuildTriggerCauseBuilder that = (BuildTriggerCauseBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
