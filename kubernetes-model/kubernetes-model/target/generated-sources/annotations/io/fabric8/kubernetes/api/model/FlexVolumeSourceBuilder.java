package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class FlexVolumeSourceBuilder extends FlexVolumeSourceFluentImpl<FlexVolumeSourceBuilder> implements VisitableBuilder<FlexVolumeSource,FlexVolumeSourceBuilder>{

    FlexVolumeSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public FlexVolumeSourceBuilder(){
            this(true);
    }
    public FlexVolumeSourceBuilder(Boolean validationEnabled){
            this(new FlexVolumeSource(), validationEnabled);
    }
    public FlexVolumeSourceBuilder(FlexVolumeSourceFluent<?> fluent){
            this(fluent, true);
    }
    public FlexVolumeSourceBuilder(FlexVolumeSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new FlexVolumeSource(), validationEnabled);
    }
    public FlexVolumeSourceBuilder(FlexVolumeSourceFluent<?> fluent,FlexVolumeSource instance){
            this(fluent, instance, true);
    }
    public FlexVolumeSourceBuilder(FlexVolumeSourceFluent<?> fluent,FlexVolumeSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withDriver(instance.getDriver()); 
            fluent.withFsType(instance.getFsType()); 
            fluent.withOptions(instance.getOptions()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            fluent.withSecretRef(instance.getSecretRef()); 
            this.validationEnabled = validationEnabled; 
    }
    public FlexVolumeSourceBuilder(FlexVolumeSource instance){
            this(instance,true);
    }
    public FlexVolumeSourceBuilder(FlexVolumeSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withDriver(instance.getDriver()); 
            this.withFsType(instance.getFsType()); 
            this.withOptions(instance.getOptions()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withSecretRef(instance.getSecretRef()); 
            this.validationEnabled = validationEnabled; 
    }
    public FlexVolumeSourceBuilder(Validator validator){
            this(new FlexVolumeSource(), true);
    }
    public FlexVolumeSourceBuilder(FlexVolumeSourceFluent<?> fluent,FlexVolumeSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withDriver(instance.getDriver()); 
            fluent.withFsType(instance.getFsType()); 
            fluent.withOptions(instance.getOptions()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            fluent.withSecretRef(instance.getSecretRef()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public FlexVolumeSourceBuilder(FlexVolumeSource instance,Validator validator){
            this.fluent = this; 
            this.withDriver(instance.getDriver()); 
            this.withFsType(instance.getFsType()); 
            this.withOptions(instance.getOptions()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withSecretRef(instance.getSecretRef()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public FlexVolumeSource build(){
            FlexVolumeSource buildable = new FlexVolumeSource(fluent.getDriver(),fluent.getFsType(),fluent.getOptions(),fluent.isReadOnly(),fluent.getSecretRef());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            FlexVolumeSourceBuilder that = (FlexVolumeSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
