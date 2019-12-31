package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PersistentVolumeClaimConditionBuilder extends PersistentVolumeClaimConditionFluentImpl<PersistentVolumeClaimConditionBuilder> implements VisitableBuilder<PersistentVolumeClaimCondition,PersistentVolumeClaimConditionBuilder>{

    PersistentVolumeClaimConditionFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PersistentVolumeClaimConditionBuilder(){
            this(true);
    }
    public PersistentVolumeClaimConditionBuilder(Boolean validationEnabled){
            this(new PersistentVolumeClaimCondition(), validationEnabled);
    }
    public PersistentVolumeClaimConditionBuilder(PersistentVolumeClaimConditionFluent<?> fluent){
            this(fluent, true);
    }
    public PersistentVolumeClaimConditionBuilder(PersistentVolumeClaimConditionFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new PersistentVolumeClaimCondition(), validationEnabled);
    }
    public PersistentVolumeClaimConditionBuilder(PersistentVolumeClaimConditionFluent<?> fluent,PersistentVolumeClaimCondition instance){
            this(fluent, instance, true);
    }
    public PersistentVolumeClaimConditionBuilder(PersistentVolumeClaimConditionFluent<?> fluent,PersistentVolumeClaimCondition instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withLastProbeTime(instance.getLastProbeTime()); 
            fluent.withLastTransitionTime(instance.getLastTransitionTime()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withReason(instance.getReason()); 
            fluent.withStatus(instance.getStatus()); 
            fluent.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public PersistentVolumeClaimConditionBuilder(PersistentVolumeClaimCondition instance){
            this(instance,true);
    }
    public PersistentVolumeClaimConditionBuilder(PersistentVolumeClaimCondition instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withLastProbeTime(instance.getLastProbeTime()); 
            this.withLastTransitionTime(instance.getLastTransitionTime()); 
            this.withMessage(instance.getMessage()); 
            this.withReason(instance.getReason()); 
            this.withStatus(instance.getStatus()); 
            this.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public PersistentVolumeClaimConditionBuilder(Validator validator){
            this(new PersistentVolumeClaimCondition(), true);
    }
    public PersistentVolumeClaimConditionBuilder(PersistentVolumeClaimConditionFluent<?> fluent,PersistentVolumeClaimCondition instance,Validator validator){
            this.fluent = fluent; 
            fluent.withLastProbeTime(instance.getLastProbeTime()); 
            fluent.withLastTransitionTime(instance.getLastTransitionTime()); 
            fluent.withMessage(instance.getMessage()); 
            fluent.withReason(instance.getReason()); 
            fluent.withStatus(instance.getStatus()); 
            fluent.withType(instance.getType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PersistentVolumeClaimConditionBuilder(PersistentVolumeClaimCondition instance,Validator validator){
            this.fluent = this; 
            this.withLastProbeTime(instance.getLastProbeTime()); 
            this.withLastTransitionTime(instance.getLastTransitionTime()); 
            this.withMessage(instance.getMessage()); 
            this.withReason(instance.getReason()); 
            this.withStatus(instance.getStatus()); 
            this.withType(instance.getType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public PersistentVolumeClaimCondition build(){
            PersistentVolumeClaimCondition buildable = new PersistentVolumeClaimCondition(fluent.getLastProbeTime(),fluent.getLastTransitionTime(),fluent.getMessage(),fluent.getReason(),fluent.getStatus(),fluent.getType());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PersistentVolumeClaimConditionBuilder that = (PersistentVolumeClaimConditionBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
