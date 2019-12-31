package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class FlockerVolumeSourceBuilder extends FlockerVolumeSourceFluentImpl<FlockerVolumeSourceBuilder> implements VisitableBuilder<FlockerVolumeSource,FlockerVolumeSourceBuilder>{

    FlockerVolumeSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public FlockerVolumeSourceBuilder(){
            this(true);
    }
    public FlockerVolumeSourceBuilder(Boolean validationEnabled){
            this(new FlockerVolumeSource(), validationEnabled);
    }
    public FlockerVolumeSourceBuilder(FlockerVolumeSourceFluent<?> fluent){
            this(fluent, true);
    }
    public FlockerVolumeSourceBuilder(FlockerVolumeSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new FlockerVolumeSource(), validationEnabled);
    }
    public FlockerVolumeSourceBuilder(FlockerVolumeSourceFluent<?> fluent,FlockerVolumeSource instance){
            this(fluent, instance, true);
    }
    public FlockerVolumeSourceBuilder(FlockerVolumeSourceFluent<?> fluent,FlockerVolumeSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withDatasetName(instance.getDatasetName()); 
            fluent.withDatasetUUID(instance.getDatasetUUID()); 
            this.validationEnabled = validationEnabled; 
    }
    public FlockerVolumeSourceBuilder(FlockerVolumeSource instance){
            this(instance,true);
    }
    public FlockerVolumeSourceBuilder(FlockerVolumeSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withDatasetName(instance.getDatasetName()); 
            this.withDatasetUUID(instance.getDatasetUUID()); 
            this.validationEnabled = validationEnabled; 
    }
    public FlockerVolumeSourceBuilder(Validator validator){
            this(new FlockerVolumeSource(), true);
    }
    public FlockerVolumeSourceBuilder(FlockerVolumeSourceFluent<?> fluent,FlockerVolumeSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withDatasetName(instance.getDatasetName()); 
            fluent.withDatasetUUID(instance.getDatasetUUID()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public FlockerVolumeSourceBuilder(FlockerVolumeSource instance,Validator validator){
            this.fluent = this; 
            this.withDatasetName(instance.getDatasetName()); 
            this.withDatasetUUID(instance.getDatasetUUID()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public FlockerVolumeSource build(){
            FlockerVolumeSource buildable = new FlockerVolumeSource(fluent.getDatasetName(),fluent.getDatasetUUID());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            FlockerVolumeSourceBuilder that = (FlockerVolumeSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
