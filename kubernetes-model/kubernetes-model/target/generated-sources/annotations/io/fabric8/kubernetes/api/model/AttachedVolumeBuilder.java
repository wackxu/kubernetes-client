package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class AttachedVolumeBuilder extends AttachedVolumeFluentImpl<AttachedVolumeBuilder> implements VisitableBuilder<AttachedVolume,AttachedVolumeBuilder>{

    AttachedVolumeFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public AttachedVolumeBuilder(){
            this(true);
    }
    public AttachedVolumeBuilder(Boolean validationEnabled){
            this(new AttachedVolume(), validationEnabled);
    }
    public AttachedVolumeBuilder(AttachedVolumeFluent<?> fluent){
            this(fluent, true);
    }
    public AttachedVolumeBuilder(AttachedVolumeFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new AttachedVolume(), validationEnabled);
    }
    public AttachedVolumeBuilder(AttachedVolumeFluent<?> fluent,AttachedVolume instance){
            this(fluent, instance, true);
    }
    public AttachedVolumeBuilder(AttachedVolumeFluent<?> fluent,AttachedVolume instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withDevicePath(instance.getDevicePath()); 
            fluent.withName(instance.getName()); 
            this.validationEnabled = validationEnabled; 
    }
    public AttachedVolumeBuilder(AttachedVolume instance){
            this(instance,true);
    }
    public AttachedVolumeBuilder(AttachedVolume instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withDevicePath(instance.getDevicePath()); 
            this.withName(instance.getName()); 
            this.validationEnabled = validationEnabled; 
    }
    public AttachedVolumeBuilder(Validator validator){
            this(new AttachedVolume(), true);
    }
    public AttachedVolumeBuilder(AttachedVolumeFluent<?> fluent,AttachedVolume instance,Validator validator){
            this.fluent = fluent; 
            fluent.withDevicePath(instance.getDevicePath()); 
            fluent.withName(instance.getName()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public AttachedVolumeBuilder(AttachedVolume instance,Validator validator){
            this.fluent = this; 
            this.withDevicePath(instance.getDevicePath()); 
            this.withName(instance.getName()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public AttachedVolume build(){
            AttachedVolume buildable = new AttachedVolume(fluent.getDevicePath(),fluent.getName());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            AttachedVolumeBuilder that = (AttachedVolumeBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
