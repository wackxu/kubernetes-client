package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class VolumeMountBuilder extends VolumeMountFluentImpl<VolumeMountBuilder> implements VisitableBuilder<VolumeMount,VolumeMountBuilder>{

    VolumeMountFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public VolumeMountBuilder(){
            this(true);
    }
    public VolumeMountBuilder(Boolean validationEnabled){
            this(new VolumeMount(), validationEnabled);
    }
    public VolumeMountBuilder(VolumeMountFluent<?> fluent){
            this(fluent, true);
    }
    public VolumeMountBuilder(VolumeMountFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new VolumeMount(), validationEnabled);
    }
    public VolumeMountBuilder(VolumeMountFluent<?> fluent,VolumeMount instance){
            this(fluent, instance, true);
    }
    public VolumeMountBuilder(VolumeMountFluent<?> fluent,VolumeMount instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withMountPath(instance.getMountPath()); 
            fluent.withMountPropagation(instance.getMountPropagation()); 
            fluent.withName(instance.getName()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            fluent.withSubPath(instance.getSubPath()); 
            this.validationEnabled = validationEnabled; 
    }
    public VolumeMountBuilder(VolumeMount instance){
            this(instance,true);
    }
    public VolumeMountBuilder(VolumeMount instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withMountPath(instance.getMountPath()); 
            this.withMountPropagation(instance.getMountPropagation()); 
            this.withName(instance.getName()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withSubPath(instance.getSubPath()); 
            this.validationEnabled = validationEnabled; 
    }
    public VolumeMountBuilder(Validator validator){
            this(new VolumeMount(), true);
    }
    public VolumeMountBuilder(VolumeMountFluent<?> fluent,VolumeMount instance,Validator validator){
            this.fluent = fluent; 
            fluent.withMountPath(instance.getMountPath()); 
            fluent.withMountPropagation(instance.getMountPropagation()); 
            fluent.withName(instance.getName()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            fluent.withSubPath(instance.getSubPath()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public VolumeMountBuilder(VolumeMount instance,Validator validator){
            this.fluent = this; 
            this.withMountPath(instance.getMountPath()); 
            this.withMountPropagation(instance.getMountPropagation()); 
            this.withName(instance.getName()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withSubPath(instance.getSubPath()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public VolumeMount build(){
            VolumeMount buildable = new VolumeMount(fluent.getMountPath(),fluent.getMountPropagation(),fluent.getName(),fluent.isReadOnly(),fluent.getSubPath());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            VolumeMountBuilder that = (VolumeMountBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
