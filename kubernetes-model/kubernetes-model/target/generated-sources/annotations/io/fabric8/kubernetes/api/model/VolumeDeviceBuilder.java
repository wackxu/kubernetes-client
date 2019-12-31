package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class VolumeDeviceBuilder extends VolumeDeviceFluentImpl<VolumeDeviceBuilder> implements VisitableBuilder<VolumeDevice,VolumeDeviceBuilder>{

    VolumeDeviceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public VolumeDeviceBuilder(){
            this(true);
    }
    public VolumeDeviceBuilder(Boolean validationEnabled){
            this(new VolumeDevice(), validationEnabled);
    }
    public VolumeDeviceBuilder(VolumeDeviceFluent<?> fluent){
            this(fluent, true);
    }
    public VolumeDeviceBuilder(VolumeDeviceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new VolumeDevice(), validationEnabled);
    }
    public VolumeDeviceBuilder(VolumeDeviceFluent<?> fluent,VolumeDevice instance){
            this(fluent, instance, true);
    }
    public VolumeDeviceBuilder(VolumeDeviceFluent<?> fluent,VolumeDevice instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withDevicePath(instance.getDevicePath()); 
            fluent.withName(instance.getName()); 
            this.validationEnabled = validationEnabled; 
    }
    public VolumeDeviceBuilder(VolumeDevice instance){
            this(instance,true);
    }
    public VolumeDeviceBuilder(VolumeDevice instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withDevicePath(instance.getDevicePath()); 
            this.withName(instance.getName()); 
            this.validationEnabled = validationEnabled; 
    }
    public VolumeDeviceBuilder(Validator validator){
            this(new VolumeDevice(), true);
    }
    public VolumeDeviceBuilder(VolumeDeviceFluent<?> fluent,VolumeDevice instance,Validator validator){
            this.fluent = fluent; 
            fluent.withDevicePath(instance.getDevicePath()); 
            fluent.withName(instance.getName()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public VolumeDeviceBuilder(VolumeDevice instance,Validator validator){
            this.fluent = this; 
            this.withDevicePath(instance.getDevicePath()); 
            this.withName(instance.getName()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public VolumeDevice build(){
            VolumeDevice buildable = new VolumeDevice(fluent.getDevicePath(),fluent.getName());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            VolumeDeviceBuilder that = (VolumeDeviceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
