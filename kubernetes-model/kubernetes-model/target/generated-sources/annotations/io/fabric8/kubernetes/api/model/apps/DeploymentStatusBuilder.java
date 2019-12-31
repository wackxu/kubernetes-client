package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class DeploymentStatusBuilder extends DeploymentStatusFluentImpl<DeploymentStatusBuilder> implements VisitableBuilder<DeploymentStatus,DeploymentStatusBuilder>{

    DeploymentStatusFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public DeploymentStatusBuilder(){
            this(true);
    }
    public DeploymentStatusBuilder(Boolean validationEnabled){
            this(new DeploymentStatus(), validationEnabled);
    }
    public DeploymentStatusBuilder(DeploymentStatusFluent<?> fluent){
            this(fluent, true);
    }
    public DeploymentStatusBuilder(DeploymentStatusFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new DeploymentStatus(), validationEnabled);
    }
    public DeploymentStatusBuilder(DeploymentStatusFluent<?> fluent,DeploymentStatus instance){
            this(fluent, instance, true);
    }
    public DeploymentStatusBuilder(DeploymentStatusFluent<?> fluent,DeploymentStatus instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAvailableReplicas(instance.getAvailableReplicas()); 
            fluent.withCollisionCount(instance.getCollisionCount()); 
            fluent.withConditions(instance.getConditions()); 
            fluent.withObservedGeneration(instance.getObservedGeneration()); 
            fluent.withReadyReplicas(instance.getReadyReplicas()); 
            fluent.withReplicas(instance.getReplicas()); 
            fluent.withUnavailableReplicas(instance.getUnavailableReplicas()); 
            fluent.withUpdatedReplicas(instance.getUpdatedReplicas()); 
            this.validationEnabled = validationEnabled; 
    }
    public DeploymentStatusBuilder(DeploymentStatus instance){
            this(instance,true);
    }
    public DeploymentStatusBuilder(DeploymentStatus instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAvailableReplicas(instance.getAvailableReplicas()); 
            this.withCollisionCount(instance.getCollisionCount()); 
            this.withConditions(instance.getConditions()); 
            this.withObservedGeneration(instance.getObservedGeneration()); 
            this.withReadyReplicas(instance.getReadyReplicas()); 
            this.withReplicas(instance.getReplicas()); 
            this.withUnavailableReplicas(instance.getUnavailableReplicas()); 
            this.withUpdatedReplicas(instance.getUpdatedReplicas()); 
            this.validationEnabled = validationEnabled; 
    }
    public DeploymentStatusBuilder(Validator validator){
            this(new DeploymentStatus(), true);
    }
    public DeploymentStatusBuilder(DeploymentStatusFluent<?> fluent,DeploymentStatus instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAvailableReplicas(instance.getAvailableReplicas()); 
            fluent.withCollisionCount(instance.getCollisionCount()); 
            fluent.withConditions(instance.getConditions()); 
            fluent.withObservedGeneration(instance.getObservedGeneration()); 
            fluent.withReadyReplicas(instance.getReadyReplicas()); 
            fluent.withReplicas(instance.getReplicas()); 
            fluent.withUnavailableReplicas(instance.getUnavailableReplicas()); 
            fluent.withUpdatedReplicas(instance.getUpdatedReplicas()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public DeploymentStatusBuilder(DeploymentStatus instance,Validator validator){
            this.fluent = this; 
            this.withAvailableReplicas(instance.getAvailableReplicas()); 
            this.withCollisionCount(instance.getCollisionCount()); 
            this.withConditions(instance.getConditions()); 
            this.withObservedGeneration(instance.getObservedGeneration()); 
            this.withReadyReplicas(instance.getReadyReplicas()); 
            this.withReplicas(instance.getReplicas()); 
            this.withUnavailableReplicas(instance.getUnavailableReplicas()); 
            this.withUpdatedReplicas(instance.getUpdatedReplicas()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public DeploymentStatus build(){
            DeploymentStatus buildable = new DeploymentStatus(fluent.getAvailableReplicas(),fluent.getCollisionCount(),fluent.getConditions(),fluent.getObservedGeneration(),fluent.getReadyReplicas(),fluent.getReplicas(),fluent.getUnavailableReplicas(),fluent.getUpdatedReplicas());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DeploymentStatusBuilder that = (DeploymentStatusBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
