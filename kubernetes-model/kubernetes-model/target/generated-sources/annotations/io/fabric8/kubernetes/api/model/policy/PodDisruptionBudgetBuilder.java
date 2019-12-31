package io.fabric8.kubernetes.api.model.policy;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PodDisruptionBudgetBuilder extends PodDisruptionBudgetFluentImpl<PodDisruptionBudgetBuilder> implements VisitableBuilder<PodDisruptionBudget,PodDisruptionBudgetBuilder>{

    PodDisruptionBudgetFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PodDisruptionBudgetBuilder(){
            this(true);
    }
    public PodDisruptionBudgetBuilder(Boolean validationEnabled){
            this(new PodDisruptionBudget(), validationEnabled);
    }
    public PodDisruptionBudgetBuilder(PodDisruptionBudgetFluent<?> fluent){
            this(fluent, true);
    }
    public PodDisruptionBudgetBuilder(PodDisruptionBudgetFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new PodDisruptionBudget(), validationEnabled);
    }
    public PodDisruptionBudgetBuilder(PodDisruptionBudgetFluent<?> fluent,PodDisruptionBudget instance){
            this(fluent, instance, true);
    }
    public PodDisruptionBudgetBuilder(PodDisruptionBudgetFluent<?> fluent,PodDisruptionBudget instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            fluent.withStatus(instance.getStatus()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodDisruptionBudgetBuilder(PodDisruptionBudget instance){
            this(instance,true);
    }
    public PodDisruptionBudgetBuilder(PodDisruptionBudget instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.withStatus(instance.getStatus()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodDisruptionBudgetBuilder(Validator validator){
            this(new PodDisruptionBudget(), true);
    }
    public PodDisruptionBudgetBuilder(PodDisruptionBudgetFluent<?> fluent,PodDisruptionBudget instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            fluent.withStatus(instance.getStatus()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PodDisruptionBudgetBuilder(PodDisruptionBudget instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.withStatus(instance.getStatus()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public PodDisruptionBudget build(){
            PodDisruptionBudget buildable = new PodDisruptionBudget(fluent.getApiVersion(),fluent.getKind(),fluent.getMetadata(),fluent.getSpec(),fluent.getStatus());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PodDisruptionBudgetBuilder that = (PodDisruptionBudgetBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
