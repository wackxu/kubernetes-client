package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class CustomBuildStrategyBuilder extends CustomBuildStrategyFluentImpl<CustomBuildStrategyBuilder> implements VisitableBuilder<CustomBuildStrategy,CustomBuildStrategyBuilder>{

    CustomBuildStrategyFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public CustomBuildStrategyBuilder(){
            this(true);
    }
    public CustomBuildStrategyBuilder(Boolean validationEnabled){
            this(new CustomBuildStrategy(), validationEnabled);
    }
    public CustomBuildStrategyBuilder(CustomBuildStrategyFluent<?> fluent){
            this(fluent, true);
    }
    public CustomBuildStrategyBuilder(CustomBuildStrategyFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new CustomBuildStrategy(), validationEnabled);
    }
    public CustomBuildStrategyBuilder(CustomBuildStrategyFluent<?> fluent,CustomBuildStrategy instance){
            this(fluent, instance, true);
    }
    public CustomBuildStrategyBuilder(CustomBuildStrategyFluent<?> fluent,CustomBuildStrategy instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withBuildAPIVersion(instance.getBuildAPIVersion()); 
            fluent.withEnv(instance.getEnv()); 
            fluent.withExposeDockerSocket(instance.getExposeDockerSocket()); 
            fluent.withForcePull(instance.getForcePull()); 
            fluent.withFrom(instance.getFrom()); 
            fluent.withPullSecret(instance.getPullSecret()); 
            fluent.withSecrets(instance.getSecrets()); 
            this.validationEnabled = validationEnabled; 
    }
    public CustomBuildStrategyBuilder(CustomBuildStrategy instance){
            this(instance,true);
    }
    public CustomBuildStrategyBuilder(CustomBuildStrategy instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withBuildAPIVersion(instance.getBuildAPIVersion()); 
            this.withEnv(instance.getEnv()); 
            this.withExposeDockerSocket(instance.getExposeDockerSocket()); 
            this.withForcePull(instance.getForcePull()); 
            this.withFrom(instance.getFrom()); 
            this.withPullSecret(instance.getPullSecret()); 
            this.withSecrets(instance.getSecrets()); 
            this.validationEnabled = validationEnabled; 
    }
    public CustomBuildStrategyBuilder(Validator validator){
            this(new CustomBuildStrategy(), true);
    }
    public CustomBuildStrategyBuilder(CustomBuildStrategyFluent<?> fluent,CustomBuildStrategy instance,Validator validator){
            this.fluent = fluent; 
            fluent.withBuildAPIVersion(instance.getBuildAPIVersion()); 
            fluent.withEnv(instance.getEnv()); 
            fluent.withExposeDockerSocket(instance.getExposeDockerSocket()); 
            fluent.withForcePull(instance.getForcePull()); 
            fluent.withFrom(instance.getFrom()); 
            fluent.withPullSecret(instance.getPullSecret()); 
            fluent.withSecrets(instance.getSecrets()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public CustomBuildStrategyBuilder(CustomBuildStrategy instance,Validator validator){
            this.fluent = this; 
            this.withBuildAPIVersion(instance.getBuildAPIVersion()); 
            this.withEnv(instance.getEnv()); 
            this.withExposeDockerSocket(instance.getExposeDockerSocket()); 
            this.withForcePull(instance.getForcePull()); 
            this.withFrom(instance.getFrom()); 
            this.withPullSecret(instance.getPullSecret()); 
            this.withSecrets(instance.getSecrets()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public CustomBuildStrategy build(){
            CustomBuildStrategy buildable = new CustomBuildStrategy(fluent.getBuildAPIVersion(),fluent.getEnv(),fluent.isExposeDockerSocket(),fluent.isForcePull(),fluent.getFrom(),fluent.getPullSecret(),fluent.getSecrets());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CustomBuildStrategyBuilder that = (CustomBuildStrategyBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
