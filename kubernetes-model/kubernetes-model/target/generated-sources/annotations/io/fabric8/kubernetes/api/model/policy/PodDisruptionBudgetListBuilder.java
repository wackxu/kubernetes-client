package io.fabric8.kubernetes.api.model.policy;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PodDisruptionBudgetListBuilder extends PodDisruptionBudgetListFluentImpl<PodDisruptionBudgetListBuilder> implements VisitableBuilder<PodDisruptionBudgetList,PodDisruptionBudgetListBuilder>{

    PodDisruptionBudgetListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PodDisruptionBudgetListBuilder(){
            this(true);
    }
    public PodDisruptionBudgetListBuilder(Boolean validationEnabled){
            this(new PodDisruptionBudgetList(), validationEnabled);
    }
    public PodDisruptionBudgetListBuilder(PodDisruptionBudgetListFluent<?> fluent){
            this(fluent, true);
    }
    public PodDisruptionBudgetListBuilder(PodDisruptionBudgetListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new PodDisruptionBudgetList(), validationEnabled);
    }
    public PodDisruptionBudgetListBuilder(PodDisruptionBudgetListFluent<?> fluent,PodDisruptionBudgetList instance){
            this(fluent, instance, true);
    }
    public PodDisruptionBudgetListBuilder(PodDisruptionBudgetListFluent<?> fluent,PodDisruptionBudgetList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodDisruptionBudgetListBuilder(PodDisruptionBudgetList instance){
            this(instance,true);
    }
    public PodDisruptionBudgetListBuilder(PodDisruptionBudgetList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodDisruptionBudgetListBuilder(Validator validator){
            this(new PodDisruptionBudgetList(), true);
    }
    public PodDisruptionBudgetListBuilder(PodDisruptionBudgetListFluent<?> fluent,PodDisruptionBudgetList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PodDisruptionBudgetListBuilder(PodDisruptionBudgetList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public PodDisruptionBudgetList build(){
            PodDisruptionBudgetList buildable = new PodDisruptionBudgetList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PodDisruptionBudgetListBuilder that = (PodDisruptionBudgetListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
