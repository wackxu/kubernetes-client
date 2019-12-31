package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class DeploymentStrategyBuilder extends io.fabric8.openshift.api.model.DeploymentStrategyFluentImpl<io.fabric8.openshift.api.model.DeploymentStrategyBuilder> implements VisitableBuilder<io.fabric8.openshift.api.model.DeploymentStrategy,io.fabric8.openshift.api.model.DeploymentStrategyBuilder>{

    io.fabric8.openshift.api.model.DeploymentStrategyFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public DeploymentStrategyBuilder(){
            this(true);
    }
    public DeploymentStrategyBuilder(Boolean validationEnabled){
            this(new DeploymentStrategy(), validationEnabled);
    }
    public DeploymentStrategyBuilder(io.fabric8.openshift.api.model.DeploymentStrategyFluent<?> fluent){
            this(fluent, true);
    }
    public DeploymentStrategyBuilder(io.fabric8.openshift.api.model.DeploymentStrategyFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new DeploymentStrategy(), validationEnabled);
    }
    public DeploymentStrategyBuilder(io.fabric8.openshift.api.model.DeploymentStrategyFluent<?> fluent,io.fabric8.openshift.api.model.DeploymentStrategy instance){
            this(fluent, instance, true);
    }
    public DeploymentStrategyBuilder(io.fabric8.openshift.api.model.DeploymentStrategyFluent<?> fluent,io.fabric8.openshift.api.model.DeploymentStrategy instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withActiveDeadlineSeconds(instance.getActiveDeadlineSeconds()); 
            fluent.withAnnotations(instance.getAnnotations()); 
            fluent.withCustomParams(instance.getCustomParams()); 
            fluent.withLabels(instance.getLabels()); 
            fluent.withRecreateParams(instance.getRecreateParams()); 
            fluent.withResources(instance.getResources()); 
            fluent.withRollingParams(instance.getRollingParams()); 
            fluent.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public DeploymentStrategyBuilder(io.fabric8.openshift.api.model.DeploymentStrategy instance){
            this(instance,true);
    }
    public DeploymentStrategyBuilder(io.fabric8.openshift.api.model.DeploymentStrategy instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withActiveDeadlineSeconds(instance.getActiveDeadlineSeconds()); 
            this.withAnnotations(instance.getAnnotations()); 
            this.withCustomParams(instance.getCustomParams()); 
            this.withLabels(instance.getLabels()); 
            this.withRecreateParams(instance.getRecreateParams()); 
            this.withResources(instance.getResources()); 
            this.withRollingParams(instance.getRollingParams()); 
            this.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public DeploymentStrategyBuilder(Validator validator){
            this(new DeploymentStrategy(), true);
    }
    public DeploymentStrategyBuilder(io.fabric8.openshift.api.model.DeploymentStrategyFluent<?> fluent,io.fabric8.openshift.api.model.DeploymentStrategy instance,Validator validator){
            this.fluent = fluent; 
            fluent.withActiveDeadlineSeconds(instance.getActiveDeadlineSeconds()); 
            fluent.withAnnotations(instance.getAnnotations()); 
            fluent.withCustomParams(instance.getCustomParams()); 
            fluent.withLabels(instance.getLabels()); 
            fluent.withRecreateParams(instance.getRecreateParams()); 
            fluent.withResources(instance.getResources()); 
            fluent.withRollingParams(instance.getRollingParams()); 
            fluent.withType(instance.getType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public DeploymentStrategyBuilder(io.fabric8.openshift.api.model.DeploymentStrategy instance,Validator validator){
            this.fluent = this; 
            this.withActiveDeadlineSeconds(instance.getActiveDeadlineSeconds()); 
            this.withAnnotations(instance.getAnnotations()); 
            this.withCustomParams(instance.getCustomParams()); 
            this.withLabels(instance.getLabels()); 
            this.withRecreateParams(instance.getRecreateParams()); 
            this.withResources(instance.getResources()); 
            this.withRollingParams(instance.getRollingParams()); 
            this.withType(instance.getType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public io.fabric8.openshift.api.model.DeploymentStrategy build(){
            DeploymentStrategy buildable = new DeploymentStrategy(fluent.getActiveDeadlineSeconds(),fluent.getAnnotations(),fluent.getCustomParams(),fluent.getLabels(),fluent.getRecreateParams(),fluent.getResources(),fluent.getRollingParams(),fluent.getType());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DeploymentStrategyBuilder that = (DeploymentStrategyBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
