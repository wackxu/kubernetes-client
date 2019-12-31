package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ReplicaSetStatusBuilder extends ReplicaSetStatusFluentImpl<ReplicaSetStatusBuilder> implements VisitableBuilder<ReplicaSetStatus,ReplicaSetStatusBuilder>{

    ReplicaSetStatusFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ReplicaSetStatusBuilder(){
            this(true);
    }
    public ReplicaSetStatusBuilder(Boolean validationEnabled){
            this(new ReplicaSetStatus(), validationEnabled);
    }
    public ReplicaSetStatusBuilder(ReplicaSetStatusFluent<?> fluent){
            this(fluent, true);
    }
    public ReplicaSetStatusBuilder(ReplicaSetStatusFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ReplicaSetStatus(), validationEnabled);
    }
    public ReplicaSetStatusBuilder(ReplicaSetStatusFluent<?> fluent,ReplicaSetStatus instance){
            this(fluent, instance, true);
    }
    public ReplicaSetStatusBuilder(ReplicaSetStatusFluent<?> fluent,ReplicaSetStatus instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAvailableReplicas(instance.getAvailableReplicas()); 
            fluent.withConditions(instance.getConditions()); 
            fluent.withFullyLabeledReplicas(instance.getFullyLabeledReplicas()); 
            fluent.withObservedGeneration(instance.getObservedGeneration()); 
            fluent.withReadyReplicas(instance.getReadyReplicas()); 
            fluent.withReplicas(instance.getReplicas()); 
            this.validationEnabled = validationEnabled; 
    }
    public ReplicaSetStatusBuilder(ReplicaSetStatus instance){
            this(instance,true);
    }
    public ReplicaSetStatusBuilder(ReplicaSetStatus instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAvailableReplicas(instance.getAvailableReplicas()); 
            this.withConditions(instance.getConditions()); 
            this.withFullyLabeledReplicas(instance.getFullyLabeledReplicas()); 
            this.withObservedGeneration(instance.getObservedGeneration()); 
            this.withReadyReplicas(instance.getReadyReplicas()); 
            this.withReplicas(instance.getReplicas()); 
            this.validationEnabled = validationEnabled; 
    }
    public ReplicaSetStatusBuilder(Validator validator){
            this(new ReplicaSetStatus(), true);
    }
    public ReplicaSetStatusBuilder(ReplicaSetStatusFluent<?> fluent,ReplicaSetStatus instance,Validator validator){
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
    public ReplicaSetStatusBuilder(ReplicaSetStatus instance,Validator validator){
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

    public ReplicaSetStatus build(){
            ReplicaSetStatus buildable = new ReplicaSetStatus(fluent.getAvailableReplicas(),fluent.getConditions(),fluent.getFullyLabeledReplicas(),fluent.getObservedGeneration(),fluent.getReadyReplicas(),fluent.getReplicas());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ReplicaSetStatusBuilder that = (ReplicaSetStatusBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
