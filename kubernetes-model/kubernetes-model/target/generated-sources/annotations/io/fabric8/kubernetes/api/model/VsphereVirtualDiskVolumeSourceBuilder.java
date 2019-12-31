package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class VsphereVirtualDiskVolumeSourceBuilder extends VsphereVirtualDiskVolumeSourceFluentImpl<VsphereVirtualDiskVolumeSourceBuilder> implements VisitableBuilder<VsphereVirtualDiskVolumeSource,VsphereVirtualDiskVolumeSourceBuilder>{

    VsphereVirtualDiskVolumeSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public VsphereVirtualDiskVolumeSourceBuilder(){
            this(true);
    }
    public VsphereVirtualDiskVolumeSourceBuilder(Boolean validationEnabled){
            this(new VsphereVirtualDiskVolumeSource(), validationEnabled);
    }
    public VsphereVirtualDiskVolumeSourceBuilder(VsphereVirtualDiskVolumeSourceFluent<?> fluent){
            this(fluent, true);
    }
    public VsphereVirtualDiskVolumeSourceBuilder(VsphereVirtualDiskVolumeSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new VsphereVirtualDiskVolumeSource(), validationEnabled);
    }
    public VsphereVirtualDiskVolumeSourceBuilder(VsphereVirtualDiskVolumeSourceFluent<?> fluent,VsphereVirtualDiskVolumeSource instance){
            this(fluent, instance, true);
    }
    public VsphereVirtualDiskVolumeSourceBuilder(VsphereVirtualDiskVolumeSourceFluent<?> fluent,VsphereVirtualDiskVolumeSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withFsType(instance.getFsType()); 
            fluent.withStoragePolicyID(instance.getStoragePolicyID()); 
            fluent.withStoragePolicyName(instance.getStoragePolicyName()); 
            fluent.withVolumePath(instance.getVolumePath()); 
            this.validationEnabled = validationEnabled; 
    }
    public VsphereVirtualDiskVolumeSourceBuilder(VsphereVirtualDiskVolumeSource instance){
            this(instance,true);
    }
    public VsphereVirtualDiskVolumeSourceBuilder(VsphereVirtualDiskVolumeSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withFsType(instance.getFsType()); 
            this.withStoragePolicyID(instance.getStoragePolicyID()); 
            this.withStoragePolicyName(instance.getStoragePolicyName()); 
            this.withVolumePath(instance.getVolumePath()); 
            this.validationEnabled = validationEnabled; 
    }
    public VsphereVirtualDiskVolumeSourceBuilder(Validator validator){
            this(new VsphereVirtualDiskVolumeSource(), true);
    }
    public VsphereVirtualDiskVolumeSourceBuilder(VsphereVirtualDiskVolumeSourceFluent<?> fluent,VsphereVirtualDiskVolumeSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withFsType(instance.getFsType()); 
            fluent.withStoragePolicyID(instance.getStoragePolicyID()); 
            fluent.withStoragePolicyName(instance.getStoragePolicyName()); 
            fluent.withVolumePath(instance.getVolumePath()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public VsphereVirtualDiskVolumeSourceBuilder(VsphereVirtualDiskVolumeSource instance,Validator validator){
            this.fluent = this; 
            this.withFsType(instance.getFsType()); 
            this.withStoragePolicyID(instance.getStoragePolicyID()); 
            this.withStoragePolicyName(instance.getStoragePolicyName()); 
            this.withVolumePath(instance.getVolumePath()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public VsphereVirtualDiskVolumeSource build(){
            VsphereVirtualDiskVolumeSource buildable = new VsphereVirtualDiskVolumeSource(fluent.getFsType(),fluent.getStoragePolicyID(),fluent.getStoragePolicyName(),fluent.getVolumePath());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            VsphereVirtualDiskVolumeSourceBuilder that = (VsphereVirtualDiskVolumeSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
