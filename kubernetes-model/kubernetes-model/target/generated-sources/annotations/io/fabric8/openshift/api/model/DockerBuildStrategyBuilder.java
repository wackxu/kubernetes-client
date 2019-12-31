package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class DockerBuildStrategyBuilder extends DockerBuildStrategyFluentImpl<DockerBuildStrategyBuilder> implements VisitableBuilder<DockerBuildStrategy,DockerBuildStrategyBuilder>{

    DockerBuildStrategyFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public DockerBuildStrategyBuilder(){
            this(true);
    }
    public DockerBuildStrategyBuilder(Boolean validationEnabled){
            this(new DockerBuildStrategy(), validationEnabled);
    }
    public DockerBuildStrategyBuilder(DockerBuildStrategyFluent<?> fluent){
            this(fluent, true);
    }
    public DockerBuildStrategyBuilder(DockerBuildStrategyFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new DockerBuildStrategy(), validationEnabled);
    }
    public DockerBuildStrategyBuilder(DockerBuildStrategyFluent<?> fluent,DockerBuildStrategy instance){
            this(fluent, instance, true);
    }
    public DockerBuildStrategyBuilder(DockerBuildStrategyFluent<?> fluent,DockerBuildStrategy instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withBuildArgs(instance.getBuildArgs()); 
            fluent.withDockerfilePath(instance.getDockerfilePath()); 
            fluent.withEnv(instance.getEnv()); 
            fluent.withForcePull(instance.getForcePull()); 
            fluent.withFrom(instance.getFrom()); 
            fluent.withImageOptimizationPolicy(instance.getImageOptimizationPolicy()); 
            fluent.withNoCache(instance.getNoCache()); 
            fluent.withPullSecret(instance.getPullSecret()); 
            this.validationEnabled = validationEnabled; 
    }
    public DockerBuildStrategyBuilder(DockerBuildStrategy instance){
            this(instance,true);
    }
    public DockerBuildStrategyBuilder(DockerBuildStrategy instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withBuildArgs(instance.getBuildArgs()); 
            this.withDockerfilePath(instance.getDockerfilePath()); 
            this.withEnv(instance.getEnv()); 
            this.withForcePull(instance.getForcePull()); 
            this.withFrom(instance.getFrom()); 
            this.withImageOptimizationPolicy(instance.getImageOptimizationPolicy()); 
            this.withNoCache(instance.getNoCache()); 
            this.withPullSecret(instance.getPullSecret()); 
            this.validationEnabled = validationEnabled; 
    }
    public DockerBuildStrategyBuilder(Validator validator){
            this(new DockerBuildStrategy(), true);
    }
    public DockerBuildStrategyBuilder(DockerBuildStrategyFluent<?> fluent,DockerBuildStrategy instance,Validator validator){
            this.fluent = fluent; 
            fluent.withBuildArgs(instance.getBuildArgs()); 
            fluent.withDockerfilePath(instance.getDockerfilePath()); 
            fluent.withEnv(instance.getEnv()); 
            fluent.withForcePull(instance.getForcePull()); 
            fluent.withFrom(instance.getFrom()); 
            fluent.withImageOptimizationPolicy(instance.getImageOptimizationPolicy()); 
            fluent.withNoCache(instance.getNoCache()); 
            fluent.withPullSecret(instance.getPullSecret()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public DockerBuildStrategyBuilder(DockerBuildStrategy instance,Validator validator){
            this.fluent = this; 
            this.withBuildArgs(instance.getBuildArgs()); 
            this.withDockerfilePath(instance.getDockerfilePath()); 
            this.withEnv(instance.getEnv()); 
            this.withForcePull(instance.getForcePull()); 
            this.withFrom(instance.getFrom()); 
            this.withImageOptimizationPolicy(instance.getImageOptimizationPolicy()); 
            this.withNoCache(instance.getNoCache()); 
            this.withPullSecret(instance.getPullSecret()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public DockerBuildStrategy build(){
            DockerBuildStrategy buildable = new DockerBuildStrategy(fluent.getBuildArgs(),fluent.getDockerfilePath(),fluent.getEnv(),fluent.isForcePull(),fluent.getFrom(),fluent.getImageOptimizationPolicy(),fluent.isNoCache(),fluent.getPullSecret());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DockerBuildStrategyBuilder that = (DockerBuildStrategyBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
