package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class BuildStatusBuilder extends BuildStatusFluentImpl<BuildStatusBuilder> implements VisitableBuilder<BuildStatus,BuildStatusBuilder>{

    BuildStatusFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public BuildStatusBuilder(){
            this(true);
    }
    public BuildStatusBuilder(Boolean validationEnabled){
            this(new BuildStatus(), validationEnabled);
    }
    public BuildStatusBuilder(BuildStatusFluent<?> fluent){
            this(fluent, true);
    }
    public BuildStatusBuilder(BuildStatusFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new BuildStatus(), validationEnabled);
    }
    public BuildStatusBuilder(BuildStatusFluent<?> fluent,BuildStatus instance){
            this(fluent, instance, true);
    }
    public BuildStatusBuilder(BuildStatusFluent<?> fluent,BuildStatus instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withCancelled(instance.getCancelled()); 
            fluent.withCompletionTimestamp(instance.getCompletionTimestamp()); 
            fluent.withConfig(instance.getConfig()); 
            fluent.withDuration(instance.getDuration()); 
            fluent.withLogSnippet(instance.getLogSnippet()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withOutput(instance.getOutput()); 
            fluent.withOutputDockerImageReference(instance.getOutputDockerImageReference()); 
            fluent.withPhase(instance.getPhase()); 
            fluent.withReason(instance.getReason()); 
            fluent.withStages(instance.getStages()); 
            fluent.withStartTimestamp(instance.getStartTimestamp()); 
            this.validationEnabled = validationEnabled; 
    }
    public BuildStatusBuilder(BuildStatus instance){
            this(instance,true);
    }
    public BuildStatusBuilder(BuildStatus instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withCancelled(instance.getCancelled()); 
            this.withCompletionTimestamp(instance.getCompletionTimestamp()); 
            this.withConfig(instance.getConfig()); 
            this.withDuration(instance.getDuration()); 
            this.withLogSnippet(instance.getLogSnippet()); 
            this.withMessage(instance.getMessage()); 
            this.withOutput(instance.getOutput()); 
            this.withOutputDockerImageReference(instance.getOutputDockerImageReference()); 
            this.withPhase(instance.getPhase()); 
            this.withReason(instance.getReason()); 
            this.withStages(instance.getStages()); 
            this.withStartTimestamp(instance.getStartTimestamp()); 
            this.validationEnabled = validationEnabled; 
    }
    public BuildStatusBuilder(Validator validator){
            this(new BuildStatus(), true);
    }
    public BuildStatusBuilder(BuildStatusFluent<?> fluent,BuildStatus instance,Validator validator){
            this.fluent = fluent; 
            fluent.withCancelled(instance.getCancelled()); 
            fluent.withCompletionTimestamp(instance.getCompletionTimestamp()); 
            fluent.withConfig(instance.getConfig()); 
            fluent.withDuration(instance.getDuration()); 
            fluent.withLogSnippet(instance.getLogSnippet()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withOutput(instance.getOutput()); 
            fluent.withOutputDockerImageReference(instance.getOutputDockerImageReference()); 
            fluent.withPhase(instance.getPhase()); 
            fluent.withReason(instance.getReason()); 
            fluent.withStages(instance.getStages()); 
            fluent.withStartTimestamp(instance.getStartTimestamp()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public BuildStatusBuilder(BuildStatus instance,Validator validator){
            this.fluent = this; 
            this.withCancelled(instance.getCancelled()); 
            this.withCompletionTimestamp(instance.getCompletionTimestamp()); 
            this.withConfig(instance.getConfig()); 
            this.withDuration(instance.getDuration()); 
            this.withLogSnippet(instance.getLogSnippet()); 
            this.withMessage(instance.getMessage()); 
            this.withOutput(instance.getOutput()); 
            this.withOutputDockerImageReference(instance.getOutputDockerImageReference()); 
            this.withPhase(instance.getPhase()); 
            this.withReason(instance.getReason()); 
            this.withStages(instance.getStages()); 
            this.withStartTimestamp(instance.getStartTimestamp()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public BuildStatus build(){
            BuildStatus buildable = new BuildStatus(fluent.isCancelled(),fluent.getCompletionTimestamp(),fluent.getConfig(),fluent.getDuration(),fluent.getLogSnippet(),fluent.getMessage(),fluent.getOutput(),fluent.getOutputDockerImageReference(),fluent.getPhase(),fluent.getReason(),fluent.getStages(),fluent.getStartTimestamp());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            BuildStatusBuilder that = (BuildStatusBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
