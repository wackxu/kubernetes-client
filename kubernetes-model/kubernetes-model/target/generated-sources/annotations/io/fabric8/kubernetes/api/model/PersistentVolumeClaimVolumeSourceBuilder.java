package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PersistentVolumeClaimVolumeSourceBuilder extends PersistentVolumeClaimVolumeSourceFluentImpl<PersistentVolumeClaimVolumeSourceBuilder> implements VisitableBuilder<PersistentVolumeClaimVolumeSource,PersistentVolumeClaimVolumeSourceBuilder>{

    PersistentVolumeClaimVolumeSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PersistentVolumeClaimVolumeSourceBuilder(){
            this(true);
    }
    public PersistentVolumeClaimVolumeSourceBuilder(Boolean validationEnabled){
            this(new PersistentVolumeClaimVolumeSource(), validationEnabled);
    }
    public PersistentVolumeClaimVolumeSourceBuilder(PersistentVolumeClaimVolumeSourceFluent<?> fluent){
            this(fluent, true);
    }
    public PersistentVolumeClaimVolumeSourceBuilder(PersistentVolumeClaimVolumeSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new PersistentVolumeClaimVolumeSource(), validationEnabled);
    }
    public PersistentVolumeClaimVolumeSourceBuilder(PersistentVolumeClaimVolumeSourceFluent<?> fluent,PersistentVolumeClaimVolumeSource instance){
            this(fluent, instance, true);
    }
    public PersistentVolumeClaimVolumeSourceBuilder(PersistentVolumeClaimVolumeSourceFluent<?> fluent,PersistentVolumeClaimVolumeSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withClaimName(instance.getClaimName()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            this.validationEnabled = validationEnabled; 
    }
    public PersistentVolumeClaimVolumeSourceBuilder(PersistentVolumeClaimVolumeSource instance){
            this(instance,true);
    }
    public PersistentVolumeClaimVolumeSourceBuilder(PersistentVolumeClaimVolumeSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withClaimName(instance.getClaimName()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.validationEnabled = validationEnabled; 
    }
    public PersistentVolumeClaimVolumeSourceBuilder(Validator validator){
            this(new PersistentVolumeClaimVolumeSource(), true);
    }
    public PersistentVolumeClaimVolumeSourceBuilder(PersistentVolumeClaimVolumeSourceFluent<?> fluent,PersistentVolumeClaimVolumeSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withClaimName(instance.getClaimName()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PersistentVolumeClaimVolumeSourceBuilder(PersistentVolumeClaimVolumeSource instance,Validator validator){
            this.fluent = this; 
            this.withClaimName(instance.getClaimName()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public PersistentVolumeClaimVolumeSource build(){
            PersistentVolumeClaimVolumeSource buildable = new PersistentVolumeClaimVolumeSource(fluent.getClaimName(),fluent.isReadOnly());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PersistentVolumeClaimVolumeSourceBuilder that = (PersistentVolumeClaimVolumeSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
