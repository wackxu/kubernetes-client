package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class DaemonSetStatusBuilder extends DaemonSetStatusFluentImpl<DaemonSetStatusBuilder> implements VisitableBuilder<DaemonSetStatus,DaemonSetStatusBuilder>{

    DaemonSetStatusFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public DaemonSetStatusBuilder(){
            this(true);
    }
    public DaemonSetStatusBuilder(Boolean validationEnabled){
            this(new DaemonSetStatus(), validationEnabled);
    }
    public DaemonSetStatusBuilder(DaemonSetStatusFluent<?> fluent){
            this(fluent, true);
    }
    public DaemonSetStatusBuilder(DaemonSetStatusFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new DaemonSetStatus(), validationEnabled);
    }
    public DaemonSetStatusBuilder(DaemonSetStatusFluent<?> fluent,DaemonSetStatus instance){
            this(fluent, instance, true);
    }
    public DaemonSetStatusBuilder(DaemonSetStatusFluent<?> fluent,DaemonSetStatus instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withCollisionCount(instance.getCollisionCount()); 
            fluent.withConditions(instance.getConditions()); 
            fluent.withCurrentNumberScheduled(instance.getCurrentNumberScheduled()); 
            fluent.withDesiredNumberScheduled(instance.getDesiredNumberScheduled()); 
            fluent.withNumberAvailable(instance.getNumberAvailable()); 
            fluent.withNumberMisscheduled(instance.getNumberMisscheduled()); 
            fluent.withNumberReady(instance.getNumberReady()); 
            fluent.withNumberUnavailable(instance.getNumberUnavailable()); 
            fluent.withObservedGeneration(instance.getObservedGeneration()); 
            fluent.withUpdatedNumberScheduled(instance.getUpdatedNumberScheduled()); 
            this.validationEnabled = validationEnabled; 
    }
    public DaemonSetStatusBuilder(DaemonSetStatus instance){
            this(instance,true);
    }
    public DaemonSetStatusBuilder(DaemonSetStatus instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withCollisionCount(instance.getCollisionCount()); 
            this.withConditions(instance.getConditions()); 
            this.withCurrentNumberScheduled(instance.getCurrentNumberScheduled()); 
            this.withDesiredNumberScheduled(instance.getDesiredNumberScheduled()); 
            this.withNumberAvailable(instance.getNumberAvailable()); 
            this.withNumberMisscheduled(instance.getNumberMisscheduled()); 
            this.withNumberReady(instance.getNumberReady()); 
            this.withNumberUnavailable(instance.getNumberUnavailable()); 
            this.withObservedGeneration(instance.getObservedGeneration()); 
            this.withUpdatedNumberScheduled(instance.getUpdatedNumberScheduled()); 
            this.validationEnabled = validationEnabled; 
    }
    public DaemonSetStatusBuilder(Validator validator){
            this(new DaemonSetStatus(), true);
    }
    public DaemonSetStatusBuilder(DaemonSetStatusFluent<?> fluent,DaemonSetStatus instance,Validator validator){
            this.fluent = fluent; 
            fluent.withCollisionCount(instance.getCollisionCount()); 
            fluent.withConditions(instance.getConditions()); 
            fluent.withCurrentNumberScheduled(instance.getCurrentNumberScheduled()); 
            fluent.withDesiredNumberScheduled(instance.getDesiredNumberScheduled()); 
            fluent.withNumberAvailable(instance.getNumberAvailable()); 
            fluent.withNumberMisscheduled(instance.getNumberMisscheduled()); 
            fluent.withNumberReady(instance.getNumberReady()); 
            fluent.withNumberUnavailable(instance.getNumberUnavailable()); 
            fluent.withObservedGeneration(instance.getObservedGeneration()); 
            fluent.withUpdatedNumberScheduled(instance.getUpdatedNumberScheduled()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public DaemonSetStatusBuilder(DaemonSetStatus instance,Validator validator){
            this.fluent = this; 
            this.withCollisionCount(instance.getCollisionCount()); 
            this.withConditions(instance.getConditions()); 
            this.withCurrentNumberScheduled(instance.getCurrentNumberScheduled()); 
            this.withDesiredNumberScheduled(instance.getDesiredNumberScheduled()); 
            this.withNumberAvailable(instance.getNumberAvailable()); 
            this.withNumberMisscheduled(instance.getNumberMisscheduled()); 
            this.withNumberReady(instance.getNumberReady()); 
            this.withNumberUnavailable(instance.getNumberUnavailable()); 
            this.withObservedGeneration(instance.getObservedGeneration()); 
            this.withUpdatedNumberScheduled(instance.getUpdatedNumberScheduled()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public DaemonSetStatus build(){
            DaemonSetStatus buildable = new DaemonSetStatus(fluent.getCollisionCount(),fluent.getConditions(),fluent.getCurrentNumberScheduled(),fluent.getDesiredNumberScheduled(),fluent.getNumberAvailable(),fluent.getNumberMisscheduled(),fluent.getNumberReady(),fluent.getNumberUnavailable(),fluent.getObservedGeneration(),fluent.getUpdatedNumberScheduled());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DaemonSetStatusBuilder that = (DaemonSetStatusBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
