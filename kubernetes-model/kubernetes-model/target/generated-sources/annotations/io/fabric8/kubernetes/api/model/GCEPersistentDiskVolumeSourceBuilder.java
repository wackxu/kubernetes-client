package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class GCEPersistentDiskVolumeSourceBuilder extends GCEPersistentDiskVolumeSourceFluentImpl<GCEPersistentDiskVolumeSourceBuilder> implements VisitableBuilder<GCEPersistentDiskVolumeSource,GCEPersistentDiskVolumeSourceBuilder>{

    GCEPersistentDiskVolumeSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public GCEPersistentDiskVolumeSourceBuilder(){
            this(true);
    }
    public GCEPersistentDiskVolumeSourceBuilder(Boolean validationEnabled){
            this(new GCEPersistentDiskVolumeSource(), validationEnabled);
    }
    public GCEPersistentDiskVolumeSourceBuilder(GCEPersistentDiskVolumeSourceFluent<?> fluent){
            this(fluent, true);
    }
    public GCEPersistentDiskVolumeSourceBuilder(GCEPersistentDiskVolumeSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new GCEPersistentDiskVolumeSource(), validationEnabled);
    }
    public GCEPersistentDiskVolumeSourceBuilder(GCEPersistentDiskVolumeSourceFluent<?> fluent,GCEPersistentDiskVolumeSource instance){
            this(fluent, instance, true);
    }
    public GCEPersistentDiskVolumeSourceBuilder(GCEPersistentDiskVolumeSourceFluent<?> fluent,GCEPersistentDiskVolumeSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withFsType(instance.getFsType()); 
            fluent.withPartition(instance.getPartition()); 
            fluent.withPdName(instance.getPdName()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            this.validationEnabled = validationEnabled; 
    }
    public GCEPersistentDiskVolumeSourceBuilder(GCEPersistentDiskVolumeSource instance){
            this(instance,true);
    }
    public GCEPersistentDiskVolumeSourceBuilder(GCEPersistentDiskVolumeSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withFsType(instance.getFsType()); 
            this.withPartition(instance.getPartition()); 
            this.withPdName(instance.getPdName()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.validationEnabled = validationEnabled; 
    }
    public GCEPersistentDiskVolumeSourceBuilder(Validator validator){
            this(new GCEPersistentDiskVolumeSource(), true);
    }
    public GCEPersistentDiskVolumeSourceBuilder(GCEPersistentDiskVolumeSourceFluent<?> fluent,GCEPersistentDiskVolumeSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withFsType(instance.getFsType()); 
            fluent.withPartition(instance.getPartition()); 
            fluent.withPdName(instance.getPdName()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public GCEPersistentDiskVolumeSourceBuilder(GCEPersistentDiskVolumeSource instance,Validator validator){
            this.fluent = this; 
            this.withFsType(instance.getFsType()); 
            this.withPartition(instance.getPartition()); 
            this.withPdName(instance.getPdName()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public GCEPersistentDiskVolumeSource build(){
            GCEPersistentDiskVolumeSource buildable = new GCEPersistentDiskVolumeSource(fluent.getFsType(),fluent.getPartition(),fluent.getPdName(),fluent.isReadOnly());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            GCEPersistentDiskVolumeSourceBuilder that = (GCEPersistentDiskVolumeSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
