package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PersistentVolumeClaimStatusBuilder extends PersistentVolumeClaimStatusFluentImpl<PersistentVolumeClaimStatusBuilder> implements VisitableBuilder<PersistentVolumeClaimStatus,PersistentVolumeClaimStatusBuilder>{

    PersistentVolumeClaimStatusFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PersistentVolumeClaimStatusBuilder(){
            this(true);
    }
    public PersistentVolumeClaimStatusBuilder(Boolean validationEnabled){
            this(new PersistentVolumeClaimStatus(), validationEnabled);
    }
    public PersistentVolumeClaimStatusBuilder(PersistentVolumeClaimStatusFluent<?> fluent){
            this(fluent, true);
    }
    public PersistentVolumeClaimStatusBuilder(PersistentVolumeClaimStatusFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new PersistentVolumeClaimStatus(), validationEnabled);
    }
    public PersistentVolumeClaimStatusBuilder(PersistentVolumeClaimStatusFluent<?> fluent,PersistentVolumeClaimStatus instance){
            this(fluent, instance, true);
    }
    public PersistentVolumeClaimStatusBuilder(PersistentVolumeClaimStatusFluent<?> fluent,PersistentVolumeClaimStatus instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAccessModes(instance.getAccessModes()); 
            fluent.withCapacity(instance.getCapacity()); 
            fluent.withConditions(instance.getConditions()); 
            fluent.withPhase(instance.getPhase()); 
            this.validationEnabled = validationEnabled; 
    }
    public PersistentVolumeClaimStatusBuilder(PersistentVolumeClaimStatus instance){
            this(instance,true);
    }
    public PersistentVolumeClaimStatusBuilder(PersistentVolumeClaimStatus instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAccessModes(instance.getAccessModes()); 
            this.withCapacity(instance.getCapacity()); 
            this.withConditions(instance.getConditions()); 
            this.withPhase(instance.getPhase()); 
            this.validationEnabled = validationEnabled; 
    }
    public PersistentVolumeClaimStatusBuilder(Validator validator){
            this(new PersistentVolumeClaimStatus(), true);
    }
    public PersistentVolumeClaimStatusBuilder(PersistentVolumeClaimStatusFluent<?> fluent,PersistentVolumeClaimStatus instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAccessModes(instance.getAccessModes()); 
            fluent.withCapacity(instance.getCapacity()); 
            fluent.withConditions(instance.getConditions()); 
            fluent.withPhase(instance.getPhase()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PersistentVolumeClaimStatusBuilder(PersistentVolumeClaimStatus instance,Validator validator){
            this.fluent = this; 
            this.withAccessModes(instance.getAccessModes()); 
            this.withCapacity(instance.getCapacity()); 
            this.withConditions(instance.getConditions()); 
            this.withPhase(instance.getPhase()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public PersistentVolumeClaimStatus build(){
            PersistentVolumeClaimStatus buildable = new PersistentVolumeClaimStatus(fluent.getAccessModes(),fluent.getCapacity(),fluent.getConditions(),fluent.getPhase());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PersistentVolumeClaimStatusBuilder that = (PersistentVolumeClaimStatusBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
