package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ScaleIOPersistentVolumeSourceBuilder extends ScaleIOPersistentVolumeSourceFluentImpl<ScaleIOPersistentVolumeSourceBuilder> implements VisitableBuilder<ScaleIOPersistentVolumeSource,ScaleIOPersistentVolumeSourceBuilder>{

    ScaleIOPersistentVolumeSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ScaleIOPersistentVolumeSourceBuilder(){
            this(true);
    }
    public ScaleIOPersistentVolumeSourceBuilder(Boolean validationEnabled){
            this(new ScaleIOPersistentVolumeSource(), validationEnabled);
    }
    public ScaleIOPersistentVolumeSourceBuilder(ScaleIOPersistentVolumeSourceFluent<?> fluent){
            this(fluent, true);
    }
    public ScaleIOPersistentVolumeSourceBuilder(ScaleIOPersistentVolumeSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ScaleIOPersistentVolumeSource(), validationEnabled);
    }
    public ScaleIOPersistentVolumeSourceBuilder(ScaleIOPersistentVolumeSourceFluent<?> fluent,ScaleIOPersistentVolumeSource instance){
            this(fluent, instance, true);
    }
    public ScaleIOPersistentVolumeSourceBuilder(ScaleIOPersistentVolumeSourceFluent<?> fluent,ScaleIOPersistentVolumeSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withFsType(instance.getFsType()); 
            fluent.withGateway(instance.getGateway()); 
            fluent.withProtectionDomain(instance.getProtectionDomain()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            fluent.withSecretRef(instance.getSecretRef()); 
            fluent.withSslEnabled(instance.getSslEnabled()); 
            fluent.withStorageMode(instance.getStorageMode()); 
            fluent.withStoragePool(instance.getStoragePool()); 
            fluent.withSystem(instance.getSystem()); 
            fluent.withVolumeName(instance.getVolumeName()); 
            this.validationEnabled = validationEnabled; 
    }
    public ScaleIOPersistentVolumeSourceBuilder(ScaleIOPersistentVolumeSource instance){
            this(instance,true);
    }
    public ScaleIOPersistentVolumeSourceBuilder(ScaleIOPersistentVolumeSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withFsType(instance.getFsType()); 
            this.withGateway(instance.getGateway()); 
            this.withProtectionDomain(instance.getProtectionDomain()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withSecretRef(instance.getSecretRef()); 
            this.withSslEnabled(instance.getSslEnabled()); 
            this.withStorageMode(instance.getStorageMode()); 
            this.withStoragePool(instance.getStoragePool()); 
            this.withSystem(instance.getSystem()); 
            this.withVolumeName(instance.getVolumeName()); 
            this.validationEnabled = validationEnabled; 
    }
    public ScaleIOPersistentVolumeSourceBuilder(Validator validator){
            this(new ScaleIOPersistentVolumeSource(), true);
    }
    public ScaleIOPersistentVolumeSourceBuilder(ScaleIOPersistentVolumeSourceFluent<?> fluent,ScaleIOPersistentVolumeSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withFsType(instance.getFsType()); 
            fluent.withGateway(instance.getGateway()); 
            fluent.withProtectionDomain(instance.getProtectionDomain()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            fluent.withSecretRef(instance.getSecretRef()); 
            fluent.withSslEnabled(instance.getSslEnabled()); 
            fluent.withStorageMode(instance.getStorageMode()); 
            fluent.withStoragePool(instance.getStoragePool()); 
            fluent.withSystem(instance.getSystem()); 
            fluent.withVolumeName(instance.getVolumeName()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ScaleIOPersistentVolumeSourceBuilder(ScaleIOPersistentVolumeSource instance,Validator validator){
            this.fluent = this; 
            this.withFsType(instance.getFsType()); 
            this.withGateway(instance.getGateway()); 
            this.withProtectionDomain(instance.getProtectionDomain()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withSecretRef(instance.getSecretRef()); 
            this.withSslEnabled(instance.getSslEnabled()); 
            this.withStorageMode(instance.getStorageMode()); 
            this.withStoragePool(instance.getStoragePool()); 
            this.withSystem(instance.getSystem()); 
            this.withVolumeName(instance.getVolumeName()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ScaleIOPersistentVolumeSource build(){
            ScaleIOPersistentVolumeSource buildable = new ScaleIOPersistentVolumeSource(fluent.getFsType(),fluent.getGateway(),fluent.getProtectionDomain(),fluent.isReadOnly(),fluent.getSecretRef(),fluent.isSslEnabled(),fluent.getStorageMode(),fluent.getStoragePool(),fluent.getSystem(),fluent.getVolumeName());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ScaleIOPersistentVolumeSourceBuilder that = (ScaleIOPersistentVolumeSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
