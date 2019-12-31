package io.fabric8.kubernetes.api.model.policy;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PodDisruptionBudgetSpecBuilder extends PodDisruptionBudgetSpecFluentImpl<PodDisruptionBudgetSpecBuilder> implements VisitableBuilder<PodDisruptionBudgetSpec,PodDisruptionBudgetSpecBuilder>{

    PodDisruptionBudgetSpecFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PodDisruptionBudgetSpecBuilder(){
            this(true);
    }
    public PodDisruptionBudgetSpecBuilder(Boolean validationEnabled){
            this(new PodDisruptionBudgetSpec(), validationEnabled);
    }
    public PodDisruptionBudgetSpecBuilder(PodDisruptionBudgetSpecFluent<?> fluent){
            this(fluent, true);
    }
    public PodDisruptionBudgetSpecBuilder(PodDisruptionBudgetSpecFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new PodDisruptionBudgetSpec(), validationEnabled);
    }
    public PodDisruptionBudgetSpecBuilder(PodDisruptionBudgetSpecFluent<?> fluent,PodDisruptionBudgetSpec instance){
            this(fluent, instance, true);
    }
    public PodDisruptionBudgetSpecBuilder(PodDisruptionBudgetSpecFluent<?> fluent,PodDisruptionBudgetSpec instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withMaxUnavailable(instance.getMaxUnavailable()); 
            fluent.withMinAvailable(instance.getMinAvailable()); 
            fluent.withSelector(instance.getSelector()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodDisruptionBudgetSpecBuilder(PodDisruptionBudgetSpec instance){
            this(instance,true);
    }
    public PodDisruptionBudgetSpecBuilder(PodDisruptionBudgetSpec instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withMaxUnavailable(instance.getMaxUnavailable()); 
            this.withMinAvailable(instance.getMinAvailable()); 
            this.withSelector(instance.getSelector()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodDisruptionBudgetSpecBuilder(Validator validator){
            this(new PodDisruptionBudgetSpec(), true);
    }
    public PodDisruptionBudgetSpecBuilder(PodDisruptionBudgetSpecFluent<?> fluent,PodDisruptionBudgetSpec instance,Validator validator){
            this.fluent = fluent; 
            fluent.withMaxUnavailable(instance.getMaxUnavailable()); 
            fluent.withMinAvailable(instance.getMinAvailable()); 
            fluent.withSelector(instance.getSelector()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PodDisruptionBudgetSpecBuilder(PodDisruptionBudgetSpec instance,Validator validator){
            this.fluent = this; 
            this.withMaxUnavailable(instance.getMaxUnavailable()); 
            this.withMinAvailable(instance.getMinAvailable()); 
            this.withSelector(instance.getSelector()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public PodDisruptionBudgetSpec build(){
            PodDisruptionBudgetSpec buildable = new PodDisruptionBudgetSpec(fluent.getMaxUnavailable(),fluent.getMinAvailable(),fluent.getSelector());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PodDisruptionBudgetSpecBuilder that = (PodDisruptionBudgetSpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
