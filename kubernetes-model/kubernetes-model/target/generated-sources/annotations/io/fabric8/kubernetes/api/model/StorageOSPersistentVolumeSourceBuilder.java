package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class StorageOSPersistentVolumeSourceBuilder extends StorageOSPersistentVolumeSourceFluentImpl<StorageOSPersistentVolumeSourceBuilder> implements VisitableBuilder<StorageOSPersistentVolumeSource,StorageOSPersistentVolumeSourceBuilder>{

    StorageOSPersistentVolumeSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public StorageOSPersistentVolumeSourceBuilder(){
            this(true);
    }
    public StorageOSPersistentVolumeSourceBuilder(Boolean validationEnabled){
            this(new StorageOSPersistentVolumeSource(), validationEnabled);
    }
    public StorageOSPersistentVolumeSourceBuilder(StorageOSPersistentVolumeSourceFluent<?> fluent){
            this(fluent, true);
    }
    public StorageOSPersistentVolumeSourceBuilder(StorageOSPersistentVolumeSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new StorageOSPersistentVolumeSource(), validationEnabled);
    }
    public StorageOSPersistentVolumeSourceBuilder(StorageOSPersistentVolumeSourceFluent<?> fluent,StorageOSPersistentVolumeSource instance){
            this(fluent, instance, true);
    }
    public StorageOSPersistentVolumeSourceBuilder(StorageOSPersistentVolumeSourceFluent<?> fluent,StorageOSPersistentVolumeSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withFsType(instance.getFsType()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            fluent.withSecretRef(instance.getSecretRef()); 
            fluent.withVolumeName(instance.getVolumeName()); 
            fluent.withVolumeNamespace(instance.getVolumeNamespace()); 
            this.validationEnabled = validationEnabled; 
    }
    public StorageOSPersistentVolumeSourceBuilder(StorageOSPersistentVolumeSource instance){
            this(instance,true);
    }
    public StorageOSPersistentVolumeSourceBuilder(StorageOSPersistentVolumeSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withFsType(instance.getFsType()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withSecretRef(instance.getSecretRef()); 
            this.withVolumeName(instance.getVolumeName()); 
            this.withVolumeNamespace(instance.getVolumeNamespace()); 
            this.validationEnabled = validationEnabled; 
    }
    public StorageOSPersistentVolumeSourceBuilder(Validator validator){
            this(new StorageOSPersistentVolumeSource(), true);
    }
    public StorageOSPersistentVolumeSourceBuilder(StorageOSPersistentVolumeSourceFluent<?> fluent,StorageOSPersistentVolumeSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withFsType(instance.getFsType()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            fluent.withSecretRef(instance.getSecretRef()); 
            fluent.withVolumeName(instance.getVolumeName()); 
            fluent.withVolumeNamespace(instance.getVolumeNamespace()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public StorageOSPersistentVolumeSourceBuilder(StorageOSPersistentVolumeSource instance,Validator validator){
            this.fluent = this; 
            this.withFsType(instance.getFsType()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withSecretRef(instance.getSecretRef()); 
            this.withVolumeName(instance.getVolumeName()); 
            this.withVolumeNamespace(instance.getVolumeNamespace()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public StorageOSPersistentVolumeSource build(){
            StorageOSPersistentVolumeSource buildable = new StorageOSPersistentVolumeSource(fluent.getFsType(),fluent.isReadOnly(),fluent.getSecretRef(),fluent.getVolumeName(),fluent.getVolumeNamespace());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            StorageOSPersistentVolumeSourceBuilder that = (StorageOSPersistentVolumeSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
