package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PersistentVolumeClaimSpecBuilder extends PersistentVolumeClaimSpecFluentImpl<PersistentVolumeClaimSpecBuilder> implements VisitableBuilder<PersistentVolumeClaimSpec,PersistentVolumeClaimSpecBuilder>{

    PersistentVolumeClaimSpecFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PersistentVolumeClaimSpecBuilder(){
            this(true);
    }
    public PersistentVolumeClaimSpecBuilder(Boolean validationEnabled){
            this(new PersistentVolumeClaimSpec(), validationEnabled);
    }
    public PersistentVolumeClaimSpecBuilder(PersistentVolumeClaimSpecFluent<?> fluent){
            this(fluent, true);
    }
    public PersistentVolumeClaimSpecBuilder(PersistentVolumeClaimSpecFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new PersistentVolumeClaimSpec(), validationEnabled);
    }
    public PersistentVolumeClaimSpecBuilder(PersistentVolumeClaimSpecFluent<?> fluent,PersistentVolumeClaimSpec instance){
            this(fluent, instance, true);
    }
    public PersistentVolumeClaimSpecBuilder(PersistentVolumeClaimSpecFluent<?> fluent,PersistentVolumeClaimSpec instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAccessModes(instance.getAccessModes()); 
            fluent.withDataSource(instance.getDataSource()); 
            fluent.withResources(instance.getResources()); 
            fluent.withSelector(instance.getSelector()); 
            fluent.withStorageClassName(instance.getStorageClassName()); 
            fluent.withVolumeMode(instance.getVolumeMode()); 
            fluent.withVolumeName(instance.getVolumeName()); 
            this.validationEnabled = validationEnabled; 
    }
    public PersistentVolumeClaimSpecBuilder(PersistentVolumeClaimSpec instance){
            this(instance,true);
    }
    public PersistentVolumeClaimSpecBuilder(PersistentVolumeClaimSpec instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAccessModes(instance.getAccessModes()); 
            this.withDataSource(instance.getDataSource()); 
            this.withResources(instance.getResources()); 
            this.withSelector(instance.getSelector()); 
            this.withStorageClassName(instance.getStorageClassName()); 
            this.withVolumeMode(instance.getVolumeMode()); 
            this.withVolumeName(instance.getVolumeName()); 
            this.validationEnabled = validationEnabled; 
    }
    public PersistentVolumeClaimSpecBuilder(Validator validator){
            this(new PersistentVolumeClaimSpec(), true);
    }
    public PersistentVolumeClaimSpecBuilder(PersistentVolumeClaimSpecFluent<?> fluent,PersistentVolumeClaimSpec instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAccessModes(instance.getAccessModes()); 
            fluent.withDataSource(instance.getDataSource()); 
            fluent.withResources(instance.getResources()); 
            fluent.withSelector(instance.getSelector()); 
            fluent.withStorageClassName(instance.getStorageClassName()); 
            fluent.withVolumeMode(instance.getVolumeMode()); 
            fluent.withVolumeName(instance.getVolumeName()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PersistentVolumeClaimSpecBuilder(PersistentVolumeClaimSpec instance,Validator validator){
            this.fluent = this; 
            this.withAccessModes(instance.getAccessModes()); 
            this.withDataSource(instance.getDataSource()); 
            this.withResources(instance.getResources()); 
            this.withSelector(instance.getSelector()); 
            this.withStorageClassName(instance.getStorageClassName()); 
            this.withVolumeMode(instance.getVolumeMode()); 
            this.withVolumeName(instance.getVolumeName()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public PersistentVolumeClaimSpec build(){
            PersistentVolumeClaimSpec buildable = new PersistentVolumeClaimSpec(fluent.getAccessModes(),fluent.getDataSource(),fluent.getResources(),fluent.getSelector(),fluent.getStorageClassName(),fluent.getVolumeMode(),fluent.getVolumeName());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PersistentVolumeClaimSpecBuilder that = (PersistentVolumeClaimSpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
