package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PhotonPersistentDiskVolumeSourceBuilder extends PhotonPersistentDiskVolumeSourceFluentImpl<PhotonPersistentDiskVolumeSourceBuilder> implements VisitableBuilder<PhotonPersistentDiskVolumeSource,PhotonPersistentDiskVolumeSourceBuilder>{

    PhotonPersistentDiskVolumeSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PhotonPersistentDiskVolumeSourceBuilder(){
            this(true);
    }
    public PhotonPersistentDiskVolumeSourceBuilder(Boolean validationEnabled){
            this(new PhotonPersistentDiskVolumeSource(), validationEnabled);
    }
    public PhotonPersistentDiskVolumeSourceBuilder(PhotonPersistentDiskVolumeSourceFluent<?> fluent){
            this(fluent, true);
    }
    public PhotonPersistentDiskVolumeSourceBuilder(PhotonPersistentDiskVolumeSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new PhotonPersistentDiskVolumeSource(), validationEnabled);
    }
    public PhotonPersistentDiskVolumeSourceBuilder(PhotonPersistentDiskVolumeSourceFluent<?> fluent,PhotonPersistentDiskVolumeSource instance){
            this(fluent, instance, true);
    }
    public PhotonPersistentDiskVolumeSourceBuilder(PhotonPersistentDiskVolumeSourceFluent<?> fluent,PhotonPersistentDiskVolumeSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withFsType(instance.getFsType()); 
            fluent.withPdID(instance.getPdID()); 
            this.validationEnabled = validationEnabled; 
    }
    public PhotonPersistentDiskVolumeSourceBuilder(PhotonPersistentDiskVolumeSource instance){
            this(instance,true);
    }
    public PhotonPersistentDiskVolumeSourceBuilder(PhotonPersistentDiskVolumeSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withFsType(instance.getFsType()); 
            this.withPdID(instance.getPdID()); 
            this.validationEnabled = validationEnabled; 
    }
    public PhotonPersistentDiskVolumeSourceBuilder(Validator validator){
            this(new PhotonPersistentDiskVolumeSource(), true);
    }
    public PhotonPersistentDiskVolumeSourceBuilder(PhotonPersistentDiskVolumeSourceFluent<?> fluent,PhotonPersistentDiskVolumeSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withFsType(instance.getFsType()); 
            fluent.withPdID(instance.getPdID()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PhotonPersistentDiskVolumeSourceBuilder(PhotonPersistentDiskVolumeSource instance,Validator validator){
            this.fluent = this; 
            this.withFsType(instance.getFsType()); 
            this.withPdID(instance.getPdID()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public PhotonPersistentDiskVolumeSource build(){
            PhotonPersistentDiskVolumeSource buildable = new PhotonPersistentDiskVolumeSource(fluent.getFsType(),fluent.getPdID());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PhotonPersistentDiskVolumeSourceBuilder that = (PhotonPersistentDiskVolumeSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
