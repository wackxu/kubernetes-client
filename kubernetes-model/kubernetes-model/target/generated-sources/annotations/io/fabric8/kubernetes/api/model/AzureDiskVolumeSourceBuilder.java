package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class AzureDiskVolumeSourceBuilder extends AzureDiskVolumeSourceFluentImpl<AzureDiskVolumeSourceBuilder> implements VisitableBuilder<AzureDiskVolumeSource,AzureDiskVolumeSourceBuilder>{

    AzureDiskVolumeSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public AzureDiskVolumeSourceBuilder(){
            this(true);
    }
    public AzureDiskVolumeSourceBuilder(Boolean validationEnabled){
            this(new AzureDiskVolumeSource(), validationEnabled);
    }
    public AzureDiskVolumeSourceBuilder(AzureDiskVolumeSourceFluent<?> fluent){
            this(fluent, true);
    }
    public AzureDiskVolumeSourceBuilder(AzureDiskVolumeSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new AzureDiskVolumeSource(), validationEnabled);
    }
    public AzureDiskVolumeSourceBuilder(AzureDiskVolumeSourceFluent<?> fluent,AzureDiskVolumeSource instance){
            this(fluent, instance, true);
    }
    public AzureDiskVolumeSourceBuilder(AzureDiskVolumeSourceFluent<?> fluent,AzureDiskVolumeSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withCachingMode(instance.getCachingMode()); 
            fluent.withDiskName(instance.getDiskName()); 
            fluent.withDiskURI(instance.getDiskURI()); 
            fluent.withFsType(instance.getFsType()); 
            fluent.withKind(instance.getKind()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            this.validationEnabled = validationEnabled; 
    }
    public AzureDiskVolumeSourceBuilder(AzureDiskVolumeSource instance){
            this(instance,true);
    }
    public AzureDiskVolumeSourceBuilder(AzureDiskVolumeSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withCachingMode(instance.getCachingMode()); 
            this.withDiskName(instance.getDiskName()); 
            this.withDiskURI(instance.getDiskURI()); 
            this.withFsType(instance.getFsType()); 
            this.withKind(instance.getKind()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.validationEnabled = validationEnabled; 
    }
    public AzureDiskVolumeSourceBuilder(Validator validator){
            this(new AzureDiskVolumeSource(), true);
    }
    public AzureDiskVolumeSourceBuilder(AzureDiskVolumeSourceFluent<?> fluent,AzureDiskVolumeSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withCachingMode(instance.getCachingMode()); 
            fluent.withDiskName(instance.getDiskName()); 
            fluent.withDiskURI(instance.getDiskURI()); 
            fluent.withFsType(instance.getFsType()); 
            fluent.withKind(instance.getKind()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public AzureDiskVolumeSourceBuilder(AzureDiskVolumeSource instance,Validator validator){
            this.fluent = this; 
            this.withCachingMode(instance.getCachingMode()); 
            this.withDiskName(instance.getDiskName()); 
            this.withDiskURI(instance.getDiskURI()); 
            this.withFsType(instance.getFsType()); 
            this.withKind(instance.getKind()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public AzureDiskVolumeSource build(){
            AzureDiskVolumeSource buildable = new AzureDiskVolumeSource(fluent.getCachingMode(),fluent.getDiskName(),fluent.getDiskURI(),fluent.getFsType(),fluent.getKind(),fluent.isReadOnly());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            AzureDiskVolumeSourceBuilder that = (AzureDiskVolumeSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
