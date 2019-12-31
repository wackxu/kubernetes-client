package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class FlexPersistentVolumeSourceBuilder extends FlexPersistentVolumeSourceFluentImpl<FlexPersistentVolumeSourceBuilder> implements VisitableBuilder<FlexPersistentVolumeSource,FlexPersistentVolumeSourceBuilder>{

    FlexPersistentVolumeSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public FlexPersistentVolumeSourceBuilder(){
            this(true);
    }
    public FlexPersistentVolumeSourceBuilder(Boolean validationEnabled){
            this(new FlexPersistentVolumeSource(), validationEnabled);
    }
    public FlexPersistentVolumeSourceBuilder(FlexPersistentVolumeSourceFluent<?> fluent){
            this(fluent, true);
    }
    public FlexPersistentVolumeSourceBuilder(FlexPersistentVolumeSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new FlexPersistentVolumeSource(), validationEnabled);
    }
    public FlexPersistentVolumeSourceBuilder(FlexPersistentVolumeSourceFluent<?> fluent,FlexPersistentVolumeSource instance){
            this(fluent, instance, true);
    }
    public FlexPersistentVolumeSourceBuilder(FlexPersistentVolumeSourceFluent<?> fluent,FlexPersistentVolumeSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withDriver(instance.getDriver()); 
            fluent.withFsType(instance.getFsType()); 
            fluent.withOptions(instance.getOptions()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            fluent.withSecretRef(instance.getSecretRef()); 
            this.validationEnabled = validationEnabled; 
    }
    public FlexPersistentVolumeSourceBuilder(FlexPersistentVolumeSource instance){
            this(instance,true);
    }
    public FlexPersistentVolumeSourceBuilder(FlexPersistentVolumeSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withDriver(instance.getDriver()); 
            this.withFsType(instance.getFsType()); 
            this.withOptions(instance.getOptions()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withSecretRef(instance.getSecretRef()); 
            this.validationEnabled = validationEnabled; 
    }
    public FlexPersistentVolumeSourceBuilder(Validator validator){
            this(new FlexPersistentVolumeSource(), true);
    }
    public FlexPersistentVolumeSourceBuilder(FlexPersistentVolumeSourceFluent<?> fluent,FlexPersistentVolumeSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withDriver(instance.getDriver()); 
            fluent.withFsType(instance.getFsType()); 
            fluent.withOptions(instance.getOptions()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            fluent.withSecretRef(instance.getSecretRef()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public FlexPersistentVolumeSourceBuilder(FlexPersistentVolumeSource instance,Validator validator){
            this.fluent = this; 
            this.withDriver(instance.getDriver()); 
            this.withFsType(instance.getFsType()); 
            this.withOptions(instance.getOptions()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withSecretRef(instance.getSecretRef()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public FlexPersistentVolumeSource build(){
            FlexPersistentVolumeSource buildable = new FlexPersistentVolumeSource(fluent.getDriver(),fluent.getFsType(),fluent.getOptions(),fluent.isReadOnly(),fluent.getSecretRef());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            FlexPersistentVolumeSourceBuilder that = (FlexPersistentVolumeSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
