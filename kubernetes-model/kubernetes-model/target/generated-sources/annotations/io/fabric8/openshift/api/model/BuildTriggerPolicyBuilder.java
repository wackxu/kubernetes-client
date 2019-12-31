package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class BuildTriggerPolicyBuilder extends BuildTriggerPolicyFluentImpl<BuildTriggerPolicyBuilder> implements VisitableBuilder<BuildTriggerPolicy,BuildTriggerPolicyBuilder>{

    BuildTriggerPolicyFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public BuildTriggerPolicyBuilder(){
            this(true);
    }
    public BuildTriggerPolicyBuilder(Boolean validationEnabled){
            this(new BuildTriggerPolicy(), validationEnabled);
    }
    public BuildTriggerPolicyBuilder(BuildTriggerPolicyFluent<?> fluent){
            this(fluent, true);
    }
    public BuildTriggerPolicyBuilder(BuildTriggerPolicyFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new BuildTriggerPolicy(), validationEnabled);
    }
    public BuildTriggerPolicyBuilder(BuildTriggerPolicyFluent<?> fluent,BuildTriggerPolicy instance){
            this(fluent, instance, true);
    }
    public BuildTriggerPolicyBuilder(BuildTriggerPolicyFluent<?> fluent,BuildTriggerPolicy instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withBitbucket(instance.getBitbucket()); 
            fluent.withGeneric(instance.getGeneric()); 
            fluent.withGithub(instance.getGithub()); 
            fluent.withGitlab(instance.getGitlab()); 
            fluent.withImageChange(instance.getImageChange()); 
            fluent.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public BuildTriggerPolicyBuilder(BuildTriggerPolicy instance){
            this(instance,true);
    }
    public BuildTriggerPolicyBuilder(BuildTriggerPolicy instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withBitbucket(instance.getBitbucket()); 
            this.withGeneric(instance.getGeneric()); 
            this.withGithub(instance.getGithub()); 
            this.withGitlab(instance.getGitlab()); 
            this.withImageChange(instance.getImageChange()); 
            this.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public BuildTriggerPolicyBuilder(Validator validator){
            this(new BuildTriggerPolicy(), true);
    }
    public BuildTriggerPolicyBuilder(BuildTriggerPolicyFluent<?> fluent,BuildTriggerPolicy instance,Validator validator){
            this.fluent = fluent; 
            fluent.withBitbucket(instance.getBitbucket()); 
            fluent.withGeneric(instance.getGeneric()); 
            fluent.withGithub(instance.getGithub()); 
            fluent.withGitlab(instance.getGitlab()); 
            fluent.withImageChange(instance.getImageChange()); 
            fluent.withType(instance.getType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public BuildTriggerPolicyBuilder(BuildTriggerPolicy instance,Validator validator){
            this.fluent = this; 
            this.withBitbucket(instance.getBitbucket()); 
            this.withGeneric(instance.getGeneric()); 
            this.withGithub(instance.getGithub()); 
            this.withGitlab(instance.getGitlab()); 
            this.withImageChange(instance.getImageChange()); 
            this.withType(instance.getType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public BuildTriggerPolicy build(){
            BuildTriggerPolicy buildable = new BuildTriggerPolicy(fluent.getBitbucket(),fluent.getGeneric(),fluent.getGithub(),fluent.getGitlab(),fluent.getImageChange(),fluent.getType());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            BuildTriggerPolicyBuilder that = (BuildTriggerPolicyBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
