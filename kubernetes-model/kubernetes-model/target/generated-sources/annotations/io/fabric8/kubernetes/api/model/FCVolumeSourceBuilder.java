package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class FCVolumeSourceBuilder extends FCVolumeSourceFluentImpl<FCVolumeSourceBuilder> implements VisitableBuilder<FCVolumeSource,FCVolumeSourceBuilder>{

    FCVolumeSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public FCVolumeSourceBuilder(){
            this(true);
    }
    public FCVolumeSourceBuilder(Boolean validationEnabled){
            this(new FCVolumeSource(), validationEnabled);
    }
    public FCVolumeSourceBuilder(FCVolumeSourceFluent<?> fluent){
            this(fluent, true);
    }
    public FCVolumeSourceBuilder(FCVolumeSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new FCVolumeSource(), validationEnabled);
    }
    public FCVolumeSourceBuilder(FCVolumeSourceFluent<?> fluent,FCVolumeSource instance){
            this(fluent, instance, true);
    }
    public FCVolumeSourceBuilder(FCVolumeSourceFluent<?> fluent,FCVolumeSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withFsType(instance.getFsType()); 
            fluent.withLun(instance.getLun()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            fluent.withTargetWWNs(instance.getTargetWWNs()); 
            fluent.withWwids(instance.getWwids()); 
            this.validationEnabled = validationEnabled; 
    }
    public FCVolumeSourceBuilder(FCVolumeSource instance){
            this(instance,true);
    }
    public FCVolumeSourceBuilder(FCVolumeSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withFsType(instance.getFsType()); 
            this.withLun(instance.getLun()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withTargetWWNs(instance.getTargetWWNs()); 
            this.withWwids(instance.getWwids()); 
            this.validationEnabled = validationEnabled; 
    }
    public FCVolumeSourceBuilder(Validator validator){
            this(new FCVolumeSource(), true);
    }
    public FCVolumeSourceBuilder(FCVolumeSourceFluent<?> fluent,FCVolumeSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withFsType(instance.getFsType()); 
            fluent.withLun(instance.getLun()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            fluent.withTargetWWNs(instance.getTargetWWNs()); 
            fluent.withWwids(instance.getWwids()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public FCVolumeSourceBuilder(FCVolumeSource instance,Validator validator){
            this.fluent = this; 
            this.withFsType(instance.getFsType()); 
            this.withLun(instance.getLun()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withTargetWWNs(instance.getTargetWWNs()); 
            this.withWwids(instance.getWwids()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public FCVolumeSource build(){
            FCVolumeSource buildable = new FCVolumeSource(fluent.getFsType(),fluent.getLun(),fluent.isReadOnly(),fluent.getTargetWWNs(),fluent.getWwids());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            FCVolumeSourceBuilder that = (FCVolumeSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
