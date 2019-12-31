package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class CinderPersistentVolumeSourceBuilder extends CinderPersistentVolumeSourceFluentImpl<CinderPersistentVolumeSourceBuilder> implements VisitableBuilder<CinderPersistentVolumeSource,CinderPersistentVolumeSourceBuilder>{

    CinderPersistentVolumeSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public CinderPersistentVolumeSourceBuilder(){
            this(true);
    }
    public CinderPersistentVolumeSourceBuilder(Boolean validationEnabled){
            this(new CinderPersistentVolumeSource(), validationEnabled);
    }
    public CinderPersistentVolumeSourceBuilder(CinderPersistentVolumeSourceFluent<?> fluent){
            this(fluent, true);
    }
    public CinderPersistentVolumeSourceBuilder(CinderPersistentVolumeSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new CinderPersistentVolumeSource(), validationEnabled);
    }
    public CinderPersistentVolumeSourceBuilder(CinderPersistentVolumeSourceFluent<?> fluent,CinderPersistentVolumeSource instance){
            this(fluent, instance, true);
    }
    public CinderPersistentVolumeSourceBuilder(CinderPersistentVolumeSourceFluent<?> fluent,CinderPersistentVolumeSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withFsType(instance.getFsType()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            fluent.withSecretRef(instance.getSecretRef()); 
            fluent.withVolumeID(instance.getVolumeID()); 
            this.validationEnabled = validationEnabled; 
    }
    public CinderPersistentVolumeSourceBuilder(CinderPersistentVolumeSource instance){
            this(instance,true);
    }
    public CinderPersistentVolumeSourceBuilder(CinderPersistentVolumeSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withFsType(instance.getFsType()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withSecretRef(instance.getSecretRef()); 
            this.withVolumeID(instance.getVolumeID()); 
            this.validationEnabled = validationEnabled; 
    }
    public CinderPersistentVolumeSourceBuilder(Validator validator){
            this(new CinderPersistentVolumeSource(), true);
    }
    public CinderPersistentVolumeSourceBuilder(CinderPersistentVolumeSourceFluent<?> fluent,CinderPersistentVolumeSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withFsType(instance.getFsType()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            fluent.withSecretRef(instance.getSecretRef()); 
            fluent.withVolumeID(instance.getVolumeID()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public CinderPersistentVolumeSourceBuilder(CinderPersistentVolumeSource instance,Validator validator){
            this.fluent = this; 
            this.withFsType(instance.getFsType()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withSecretRef(instance.getSecretRef()); 
            this.withVolumeID(instance.getVolumeID()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public CinderPersistentVolumeSource build(){
            CinderPersistentVolumeSource buildable = new CinderPersistentVolumeSource(fluent.getFsType(),fluent.isReadOnly(),fluent.getSecretRef(),fluent.getVolumeID());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CinderPersistentVolumeSourceBuilder that = (CinderPersistentVolumeSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
