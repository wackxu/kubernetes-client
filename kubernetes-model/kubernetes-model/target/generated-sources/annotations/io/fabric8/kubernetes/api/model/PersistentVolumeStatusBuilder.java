package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PersistentVolumeStatusBuilder extends PersistentVolumeStatusFluentImpl<PersistentVolumeStatusBuilder> implements VisitableBuilder<PersistentVolumeStatus,PersistentVolumeStatusBuilder>{

    PersistentVolumeStatusFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PersistentVolumeStatusBuilder(){
            this(true);
    }
    public PersistentVolumeStatusBuilder(Boolean validationEnabled){
            this(new PersistentVolumeStatus(), validationEnabled);
    }
    public PersistentVolumeStatusBuilder(PersistentVolumeStatusFluent<?> fluent){
            this(fluent, true);
    }
    public PersistentVolumeStatusBuilder(PersistentVolumeStatusFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new PersistentVolumeStatus(), validationEnabled);
    }
    public PersistentVolumeStatusBuilder(PersistentVolumeStatusFluent<?> fluent,PersistentVolumeStatus instance){
            this(fluent, instance, true);
    }
    public PersistentVolumeStatusBuilder(PersistentVolumeStatusFluent<?> fluent,PersistentVolumeStatus instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withMessage(instance.getMessage()); 
            fluent.withPhase(instance.getPhase()); 
            fluent.withReason(instance.getReason()); 
            this.validationEnabled = validationEnabled; 
    }
    public PersistentVolumeStatusBuilder(PersistentVolumeStatus instance){
            this(instance,true);
    }
    public PersistentVolumeStatusBuilder(PersistentVolumeStatus instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withMessage(instance.getMessage()); 
            this.withPhase(instance.getPhase()); 
            this.withReason(instance.getReason()); 
            this.validationEnabled = validationEnabled; 
    }
    public PersistentVolumeStatusBuilder(Validator validator){
            this(new PersistentVolumeStatus(), true);
    }
    public PersistentVolumeStatusBuilder(PersistentVolumeStatusFluent<?> fluent,PersistentVolumeStatus instance,Validator validator){
            this.fluent = fluent; 
            fluent.withMessage(instance.getMessage()); 
            fluent.withPhase(instance.getPhase()); 
            fluent.withReason(instance.getReason()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PersistentVolumeStatusBuilder(PersistentVolumeStatus instance,Validator validator){
            this.fluent = this; 
            this.withMessage(instance.getMessage()); 
            this.withPhase(instance.getPhase()); 
            this.withReason(instance.getReason()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public PersistentVolumeStatus build(){
            PersistentVolumeStatus buildable = new PersistentVolumeStatus(fluent.getMessage(),fluent.getPhase(),fluent.getReason());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PersistentVolumeStatusBuilder that = (PersistentVolumeStatusBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
