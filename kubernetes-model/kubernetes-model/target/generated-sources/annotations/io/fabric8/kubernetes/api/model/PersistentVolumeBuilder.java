package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PersistentVolumeBuilder extends PersistentVolumeFluentImpl<PersistentVolumeBuilder> implements VisitableBuilder<PersistentVolume,PersistentVolumeBuilder>{

    PersistentVolumeFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PersistentVolumeBuilder(){
            this(true);
    }
    public PersistentVolumeBuilder(Boolean validationEnabled){
            this(new PersistentVolume(), validationEnabled);
    }
    public PersistentVolumeBuilder(PersistentVolumeFluent<?> fluent){
            this(fluent, true);
    }
    public PersistentVolumeBuilder(PersistentVolumeFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new PersistentVolume(), validationEnabled);
    }
    public PersistentVolumeBuilder(PersistentVolumeFluent<?> fluent,PersistentVolume instance){
            this(fluent, instance, true);
    }
    public PersistentVolumeBuilder(PersistentVolumeFluent<?> fluent,PersistentVolume instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            fluent.withStatus(instance.getStatus()); 
            this.validationEnabled = validationEnabled; 
    }
    public PersistentVolumeBuilder(PersistentVolume instance){
            this(instance,true);
    }
    public PersistentVolumeBuilder(PersistentVolume instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.withStatus(instance.getStatus()); 
            this.validationEnabled = validationEnabled; 
    }
    public PersistentVolumeBuilder(Validator validator){
            this(new PersistentVolume(), true);
    }
    public PersistentVolumeBuilder(PersistentVolumeFluent<?> fluent,PersistentVolume instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            fluent.withStatus(instance.getStatus()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PersistentVolumeBuilder(PersistentVolume instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.withStatus(instance.getStatus()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public PersistentVolume build(){
            PersistentVolume buildable = new PersistentVolume(fluent.getApiVersion(),fluent.getKind(),fluent.getMetadata(),fluent.getSpec(),fluent.getStatus());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PersistentVolumeBuilder that = (PersistentVolumeBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
