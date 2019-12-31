package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class StatefulSetStatusBuilder extends StatefulSetStatusFluentImpl<StatefulSetStatusBuilder> implements VisitableBuilder<StatefulSetStatus,StatefulSetStatusBuilder>{

    StatefulSetStatusFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public StatefulSetStatusBuilder(){
            this(true);
    }
    public StatefulSetStatusBuilder(Boolean validationEnabled){
            this(new StatefulSetStatus(), validationEnabled);
    }
    public StatefulSetStatusBuilder(StatefulSetStatusFluent<?> fluent){
            this(fluent, true);
    }
    public StatefulSetStatusBuilder(StatefulSetStatusFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new StatefulSetStatus(), validationEnabled);
    }
    public StatefulSetStatusBuilder(StatefulSetStatusFluent<?> fluent,StatefulSetStatus instance){
            this(fluent, instance, true);
    }
    public StatefulSetStatusBuilder(StatefulSetStatusFluent<?> fluent,StatefulSetStatus instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withCollisionCount(instance.getCollisionCount()); 
            fluent.withConditions(instance.getConditions()); 
            fluent.withCurrentReplicas(instance.getCurrentReplicas()); 
            fluent.withCurrentRevision(instance.getCurrentRevision()); 
            fluent.withObservedGeneration(instance.getObservedGeneration()); 
            fluent.withReadyReplicas(instance.getReadyReplicas()); 
            fluent.withReplicas(instance.getReplicas()); 
            fluent.withUpdateRevision(instance.getUpdateRevision()); 
            fluent.withUpdatedReplicas(instance.getUpdatedReplicas()); 
            this.validationEnabled = validationEnabled; 
    }
    public StatefulSetStatusBuilder(StatefulSetStatus instance){
            this(instance,true);
    }
    public StatefulSetStatusBuilder(StatefulSetStatus instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withCollisionCount(instance.getCollisionCount()); 
            this.withConditions(instance.getConditions()); 
            this.withCurrentReplicas(instance.getCurrentReplicas()); 
            this.withCurrentRevision(instance.getCurrentRevision()); 
            this.withObservedGeneration(instance.getObservedGeneration()); 
            this.withReadyReplicas(instance.getReadyReplicas()); 
            this.withReplicas(instance.getReplicas()); 
            this.withUpdateRevision(instance.getUpdateRevision()); 
            this.withUpdatedReplicas(instance.getUpdatedReplicas()); 
            this.validationEnabled = validationEnabled; 
    }
    public StatefulSetStatusBuilder(Validator validator){
            this(new StatefulSetStatus(), true);
    }
    public StatefulSetStatusBuilder(StatefulSetStatusFluent<?> fluent,StatefulSetStatus instance,Validator validator){
            this.fluent = fluent; 
            fluent.withCollisionCount(instance.getCollisionCount()); 
            fluent.withConditions(instance.getConditions()); 
            fluent.withCurrentReplicas(instance.getCurrentReplicas()); 
            fluent.withCurrentRevision(instance.getCurrentRevision()); 
            fluent.withObservedGeneration(instance.getObservedGeneration()); 
            fluent.withReadyReplicas(instance.getReadyReplicas()); 
            fluent.withReplicas(instance.getReplicas()); 
            fluent.withUpdateRevision(instance.getUpdateRevision()); 
            fluent.withUpdatedReplicas(instance.getUpdatedReplicas()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public StatefulSetStatusBuilder(StatefulSetStatus instance,Validator validator){
            this.fluent = this; 
            this.withCollisionCount(instance.getCollisionCount()); 
            this.withConditions(instance.getConditions()); 
            this.withCurrentReplicas(instance.getCurrentReplicas()); 
            this.withCurrentRevision(instance.getCurrentRevision()); 
            this.withObservedGeneration(instance.getObservedGeneration()); 
            this.withReadyReplicas(instance.getReadyReplicas()); 
            this.withReplicas(instance.getReplicas()); 
            this.withUpdateRevision(instance.getUpdateRevision()); 
            this.withUpdatedReplicas(instance.getUpdatedReplicas()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public StatefulSetStatus build(){
            StatefulSetStatus buildable = new StatefulSetStatus(fluent.getCollisionCount(),fluent.getConditions(),fluent.getCurrentReplicas(),fluent.getCurrentRevision(),fluent.getObservedGeneration(),fluent.getReadyReplicas(),fluent.getReplicas(),fluent.getUpdateRevision(),fluent.getUpdatedReplicas());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            StatefulSetStatusBuilder that = (StatefulSetStatusBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
