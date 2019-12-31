package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ReplicationControllerStatusBuilder extends ReplicationControllerStatusFluentImpl<ReplicationControllerStatusBuilder> implements VisitableBuilder<ReplicationControllerStatus,ReplicationControllerStatusBuilder>{

    ReplicationControllerStatusFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ReplicationControllerStatusBuilder(){
            this(true);
    }
    public ReplicationControllerStatusBuilder(Boolean validationEnabled){
            this(new ReplicationControllerStatus(), validationEnabled);
    }
    public ReplicationControllerStatusBuilder(ReplicationControllerStatusFluent<?> fluent){
            this(fluent, true);
    }
    public ReplicationControllerStatusBuilder(ReplicationControllerStatusFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ReplicationControllerStatus(), validationEnabled);
    }
    public ReplicationControllerStatusBuilder(ReplicationControllerStatusFluent<?> fluent,ReplicationControllerStatus instance){
            this(fluent, instance, true);
    }
    public ReplicationControllerStatusBuilder(ReplicationControllerStatusFluent<?> fluent,ReplicationControllerStatus instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAvailableReplicas(instance.getAvailableReplicas()); 
            fluent.withConditions(instance.getConditions()); 
            fluent.withFullyLabeledReplicas(instance.getFullyLabeledReplicas()); 
            fluent.withObservedGeneration(instance.getObservedGeneration()); 
            fluent.withReadyReplicas(instance.getReadyReplicas()); 
            fluent.withReplicas(instance.getReplicas()); 
            this.validationEnabled = validationEnabled; 
    }
    public ReplicationControllerStatusBuilder(ReplicationControllerStatus instance){
            this(instance,true);
    }
    public ReplicationControllerStatusBuilder(ReplicationControllerStatus instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAvailableReplicas(instance.getAvailableReplicas()); 
            this.withConditions(instance.getConditions()); 
            this.withFullyLabeledReplicas(instance.getFullyLabeledReplicas()); 
            this.withObservedGeneration(instance.getObservedGeneration()); 
            this.withReadyReplicas(instance.getReadyReplicas()); 
            this.withReplicas(instance.getReplicas()); 
            this.validationEnabled = validationEnabled; 
    }
    public ReplicationControllerStatusBuilder(Validator validator){
            this(new ReplicationControllerStatus(), true);
    }
    public ReplicationControllerStatusBuilder(ReplicationControllerStatusFluent<?> fluent,ReplicationControllerStatus instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAvailableReplicas(instance.getAvailableReplicas()); 
            fluent.withConditions(instance.getConditions()); 
            fluent.withFullyLabeledReplicas(instance.getFullyLabeledReplicas()); 
            fluent.withObservedGeneration(instance.getObservedGeneration()); 
            fluent.withReadyReplicas(instance.getReadyReplicas()); 
            fluent.withReplicas(instance.getReplicas()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ReplicationControllerStatusBuilder(ReplicationControllerStatus instance,Validator validator){
            this.fluent = this; 
            this.withAvailableReplicas(instance.getAvailableReplicas()); 
            this.withConditions(instance.getConditions()); 
            this.withFullyLabeledReplicas(instance.getFullyLabeledReplicas()); 
            this.withObservedGeneration(instance.getObservedGeneration()); 
            this.withReadyReplicas(instance.getReadyReplicas()); 
            this.withReplicas(instance.getReplicas()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ReplicationControllerStatus build(){
            ReplicationControllerStatus buildable = new ReplicationControllerStatus(fluent.getAvailableReplicas(),fluent.getConditions(),fluent.getFullyLabeledReplicas(),fluent.getObservedGeneration(),fluent.getReadyReplicas(),fluent.getReplicas());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ReplicationControllerStatusBuilder that = (ReplicationControllerStatusBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
