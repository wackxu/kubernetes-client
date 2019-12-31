package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class DeploymentConfigStatusBuilder extends DeploymentConfigStatusFluentImpl<DeploymentConfigStatusBuilder> implements VisitableBuilder<DeploymentConfigStatus,DeploymentConfigStatusBuilder>{

    DeploymentConfigStatusFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public DeploymentConfigStatusBuilder(){
            this(true);
    }
    public DeploymentConfigStatusBuilder(Boolean validationEnabled){
            this(new DeploymentConfigStatus(), validationEnabled);
    }
    public DeploymentConfigStatusBuilder(DeploymentConfigStatusFluent<?> fluent){
            this(fluent, true);
    }
    public DeploymentConfigStatusBuilder(DeploymentConfigStatusFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new DeploymentConfigStatus(), validationEnabled);
    }
    public DeploymentConfigStatusBuilder(DeploymentConfigStatusFluent<?> fluent,DeploymentConfigStatus instance){
            this(fluent, instance, true);
    }
    public DeploymentConfigStatusBuilder(DeploymentConfigStatusFluent<?> fluent,DeploymentConfigStatus instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAvailableReplicas(instance.getAvailableReplicas()); 
            fluent.withConditions(instance.getConditions()); 
            fluent.withDetails(instance.getDetails()); 
            fluent.withLatestVersion(instance.getLatestVersion()); 
            fluent.withObservedGeneration(instance.getObservedGeneration()); 
            fluent.withReadyReplicas(instance.getReadyReplicas()); 
            fluent.withReplicas(instance.getReplicas()); 
            fluent.withUnavailableReplicas(instance.getUnavailableReplicas()); 
            fluent.withUpdatedReplicas(instance.getUpdatedReplicas()); 
            this.validationEnabled = validationEnabled; 
    }
    public DeploymentConfigStatusBuilder(DeploymentConfigStatus instance){
            this(instance,true);
    }
    public DeploymentConfigStatusBuilder(DeploymentConfigStatus instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAvailableReplicas(instance.getAvailableReplicas()); 
            this.withConditions(instance.getConditions()); 
            this.withDetails(instance.getDetails()); 
            this.withLatestVersion(instance.getLatestVersion()); 
            this.withObservedGeneration(instance.getObservedGeneration()); 
            this.withReadyReplicas(instance.getReadyReplicas()); 
            this.withReplicas(instance.getReplicas()); 
            this.withUnavailableReplicas(instance.getUnavailableReplicas()); 
            this.withUpdatedReplicas(instance.getUpdatedReplicas()); 
            this.validationEnabled = validationEnabled; 
    }
    public DeploymentConfigStatusBuilder(Validator validator){
            this(new DeploymentConfigStatus(), true);
    }
    public DeploymentConfigStatusBuilder(DeploymentConfigStatusFluent<?> fluent,DeploymentConfigStatus instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAvailableReplicas(instance.getAvailableReplicas()); 
            fluent.withConditions(instance.getConditions()); 
            fluent.withDetails(instance.getDetails()); 
            fluent.withLatestVersion(instance.getLatestVersion()); 
            fluent.withObservedGeneration(instance.getObservedGeneration()); 
            fluent.withReadyReplicas(instance.getReadyReplicas()); 
            fluent.withReplicas(instance.getReplicas()); 
            fluent.withUnavailableReplicas(instance.getUnavailableReplicas()); 
            fluent.withUpdatedReplicas(instance.getUpdatedReplicas()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public DeploymentConfigStatusBuilder(DeploymentConfigStatus instance,Validator validator){
            this.fluent = this; 
            this.withAvailableReplicas(instance.getAvailableReplicas()); 
            this.withConditions(instance.getConditions()); 
            this.withDetails(instance.getDetails()); 
            this.withLatestVersion(instance.getLatestVersion()); 
            this.withObservedGeneration(instance.getObservedGeneration()); 
            this.withReadyReplicas(instance.getReadyReplicas()); 
            this.withReplicas(instance.getReplicas()); 
            this.withUnavailableReplicas(instance.getUnavailableReplicas()); 
            this.withUpdatedReplicas(instance.getUpdatedReplicas()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public DeploymentConfigStatus build(){
            DeploymentConfigStatus buildable = new DeploymentConfigStatus(fluent.getAvailableReplicas(),fluent.getConditions(),fluent.getDetails(),fluent.getLatestVersion(),fluent.getObservedGeneration(),fluent.getReadyReplicas(),fluent.getReplicas(),fluent.getUnavailableReplicas(),fluent.getUpdatedReplicas());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DeploymentConfigStatusBuilder that = (DeploymentConfigStatusBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
