package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class StorageOSVolumeSourceBuilder extends StorageOSVolumeSourceFluentImpl<StorageOSVolumeSourceBuilder> implements VisitableBuilder<StorageOSVolumeSource,StorageOSVolumeSourceBuilder>{

    StorageOSVolumeSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public StorageOSVolumeSourceBuilder(){
            this(true);
    }
    public StorageOSVolumeSourceBuilder(Boolean validationEnabled){
            this(new StorageOSVolumeSource(), validationEnabled);
    }
    public StorageOSVolumeSourceBuilder(StorageOSVolumeSourceFluent<?> fluent){
            this(fluent, true);
    }
    public StorageOSVolumeSourceBuilder(StorageOSVolumeSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new StorageOSVolumeSource(), validationEnabled);
    }
    public StorageOSVolumeSourceBuilder(StorageOSVolumeSourceFluent<?> fluent,StorageOSVolumeSource instance){
            this(fluent, instance, true);
    }
    public StorageOSVolumeSourceBuilder(StorageOSVolumeSourceFluent<?> fluent,StorageOSVolumeSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withFsType(instance.getFsType()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            fluent.withSecretRef(instance.getSecretRef()); 
            fluent.withVolumeName(instance.getVolumeName()); 
            fluent.withVolumeNamespace(instance.getVolumeNamespace()); 
            this.validationEnabled = validationEnabled; 
    }
    public StorageOSVolumeSourceBuilder(StorageOSVolumeSource instance){
            this(instance,true);
    }
    public StorageOSVolumeSourceBuilder(StorageOSVolumeSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withFsType(instance.getFsType()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withSecretRef(instance.getSecretRef()); 
            this.withVolumeName(instance.getVolumeName()); 
            this.withVolumeNamespace(instance.getVolumeNamespace()); 
            this.validationEnabled = validationEnabled; 
    }
    public StorageOSVolumeSourceBuilder(Validator validator){
            this(new StorageOSVolumeSource(), true);
    }
    public StorageOSVolumeSourceBuilder(StorageOSVolumeSourceFluent<?> fluent,StorageOSVolumeSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withFsType(instance.getFsType()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            fluent.withSecretRef(instance.getSecretRef()); 
            fluent.withVolumeName(instance.getVolumeName()); 
            fluent.withVolumeNamespace(instance.getVolumeNamespace()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public StorageOSVolumeSourceBuilder(StorageOSVolumeSource instance,Validator validator){
            this.fluent = this; 
            this.withFsType(instance.getFsType()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withSecretRef(instance.getSecretRef()); 
            this.withVolumeName(instance.getVolumeName()); 
            this.withVolumeNamespace(instance.getVolumeNamespace()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public StorageOSVolumeSource build(){
            StorageOSVolumeSource buildable = new StorageOSVolumeSource(fluent.getFsType(),fluent.isReadOnly(),fluent.getSecretRef(),fluent.getVolumeName(),fluent.getVolumeNamespace());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            StorageOSVolumeSourceBuilder that = (StorageOSVolumeSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
