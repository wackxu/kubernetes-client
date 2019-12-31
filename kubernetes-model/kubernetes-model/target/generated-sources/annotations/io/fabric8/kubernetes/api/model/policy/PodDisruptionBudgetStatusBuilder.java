package io.fabric8.kubernetes.api.model.policy;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PodDisruptionBudgetStatusBuilder extends PodDisruptionBudgetStatusFluentImpl<PodDisruptionBudgetStatusBuilder> implements VisitableBuilder<PodDisruptionBudgetStatus,PodDisruptionBudgetStatusBuilder>{

    PodDisruptionBudgetStatusFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PodDisruptionBudgetStatusBuilder(){
            this(true);
    }
    public PodDisruptionBudgetStatusBuilder(Boolean validationEnabled){
            this(new PodDisruptionBudgetStatus(), validationEnabled);
    }
    public PodDisruptionBudgetStatusBuilder(PodDisruptionBudgetStatusFluent<?> fluent){
            this(fluent, true);
    }
    public PodDisruptionBudgetStatusBuilder(PodDisruptionBudgetStatusFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new PodDisruptionBudgetStatus(), validationEnabled);
    }
    public PodDisruptionBudgetStatusBuilder(PodDisruptionBudgetStatusFluent<?> fluent,PodDisruptionBudgetStatus instance){
            this(fluent, instance, true);
    }
    public PodDisruptionBudgetStatusBuilder(PodDisruptionBudgetStatusFluent<?> fluent,PodDisruptionBudgetStatus instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withCurrentHealthy(instance.getCurrentHealthy()); 
            fluent.withDesiredHealthy(instance.getDesiredHealthy()); 
            fluent.withDisruptedPods(instance.getDisruptedPods()); 
            fluent.withDisruptionsAllowed(instance.getDisruptionsAllowed()); 
            fluent.withExpectedPods(instance.getExpectedPods()); 
            fluent.withObservedGeneration(instance.getObservedGeneration()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodDisruptionBudgetStatusBuilder(PodDisruptionBudgetStatus instance){
            this(instance,true);
    }
    public PodDisruptionBudgetStatusBuilder(PodDisruptionBudgetStatus instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withCurrentHealthy(instance.getCurrentHealthy()); 
            this.withDesiredHealthy(instance.getDesiredHealthy()); 
            this.withDisruptedPods(instance.getDisruptedPods()); 
            this.withDisruptionsAllowed(instance.getDisruptionsAllowed()); 
            this.withExpectedPods(instance.getExpectedPods()); 
            this.withObservedGeneration(instance.getObservedGeneration()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodDisruptionBudgetStatusBuilder(Validator validator){
            this(new PodDisruptionBudgetStatus(), true);
    }
    public PodDisruptionBudgetStatusBuilder(PodDisruptionBudgetStatusFluent<?> fluent,PodDisruptionBudgetStatus instance,Validator validator){
            this.fluent = fluent; 
            fluent.withCurrentHealthy(instance.getCurrentHealthy()); 
            fluent.withDesiredHealthy(instance.getDesiredHealthy()); 
            fluent.withDisruptedPods(instance.getDisruptedPods()); 
            fluent.withDisruptionsAllowed(instance.getDisruptionsAllowed()); 
            fluent.withExpectedPods(instance.getExpectedPods()); 
            fluent.withObservedGeneration(instance.getObservedGeneration()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PodDisruptionBudgetStatusBuilder(PodDisruptionBudgetStatus instance,Validator validator){
            this.fluent = this; 
            this.withCurrentHealthy(instance.getCurrentHealthy()); 
            this.withDesiredHealthy(instance.getDesiredHealthy()); 
            this.withDisruptedPods(instance.getDisruptedPods()); 
            this.withDisruptionsAllowed(instance.getDisruptionsAllowed()); 
            this.withExpectedPods(instance.getExpectedPods()); 
            this.withObservedGeneration(instance.getObservedGeneration()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public PodDisruptionBudgetStatus build(){
            PodDisruptionBudgetStatus buildable = new PodDisruptionBudgetStatus(fluent.getCurrentHealthy(),fluent.getDesiredHealthy(),fluent.getDisruptedPods(),fluent.getDisruptionsAllowed(),fluent.getExpectedPods(),fluent.getObservedGeneration());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PodDisruptionBudgetStatusBuilder that = (PodDisruptionBudgetStatusBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
