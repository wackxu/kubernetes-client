package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ScaleIOVolumeSourceBuilder extends ScaleIOVolumeSourceFluentImpl<ScaleIOVolumeSourceBuilder> implements VisitableBuilder<ScaleIOVolumeSource,ScaleIOVolumeSourceBuilder>{

    ScaleIOVolumeSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ScaleIOVolumeSourceBuilder(){
            this(true);
    }
    public ScaleIOVolumeSourceBuilder(Boolean validationEnabled){
            this(new ScaleIOVolumeSource(), validationEnabled);
    }
    public ScaleIOVolumeSourceBuilder(ScaleIOVolumeSourceFluent<?> fluent){
            this(fluent, true);
    }
    public ScaleIOVolumeSourceBuilder(ScaleIOVolumeSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ScaleIOVolumeSource(), validationEnabled);
    }
    public ScaleIOVolumeSourceBuilder(ScaleIOVolumeSourceFluent<?> fluent,ScaleIOVolumeSource instance){
            this(fluent, instance, true);
    }
    public ScaleIOVolumeSourceBuilder(ScaleIOVolumeSourceFluent<?> fluent,ScaleIOVolumeSource instance,Boolean validationEnabled){
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
    public ScaleIOVolumeSourceBuilder(ScaleIOVolumeSource instance){
            this(instance,true);
    }
    public ScaleIOVolumeSourceBuilder(ScaleIOVolumeSource instance,Boolean validationEnabled){
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
    public ScaleIOVolumeSourceBuilder(Validator validator){
            this(new ScaleIOVolumeSource(), true);
    }
    public ScaleIOVolumeSourceBuilder(ScaleIOVolumeSourceFluent<?> fluent,ScaleIOVolumeSource instance,Validator validator){
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
    public ScaleIOVolumeSourceBuilder(ScaleIOVolumeSource instance,Validator validator){
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

    public ScaleIOVolumeSource build(){
            ScaleIOVolumeSource buildable = new ScaleIOVolumeSource(fluent.getFsType(),fluent.getGateway(),fluent.getProtectionDomain(),fluent.isReadOnly(),fluent.getSecretRef(),fluent.isSslEnabled(),fluent.getStorageMode(),fluent.getStoragePool(),fluent.getSystem(),fluent.getVolumeName());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ScaleIOVolumeSourceBuilder that = (ScaleIOVolumeSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
