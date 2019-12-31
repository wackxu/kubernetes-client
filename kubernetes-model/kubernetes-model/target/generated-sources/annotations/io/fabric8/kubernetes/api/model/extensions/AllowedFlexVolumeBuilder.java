package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class AllowedFlexVolumeBuilder extends AllowedFlexVolumeFluentImpl<AllowedFlexVolumeBuilder> implements VisitableBuilder<AllowedFlexVolume,AllowedFlexVolumeBuilder>{

    AllowedFlexVolumeFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public AllowedFlexVolumeBuilder(){
            this(true);
    }
    public AllowedFlexVolumeBuilder(Boolean validationEnabled){
            this(new AllowedFlexVolume(), validationEnabled);
    }
    public AllowedFlexVolumeBuilder(AllowedFlexVolumeFluent<?> fluent){
            this(fluent, true);
    }
    public AllowedFlexVolumeBuilder(AllowedFlexVolumeFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new AllowedFlexVolume(), validationEnabled);
    }
    public AllowedFlexVolumeBuilder(AllowedFlexVolumeFluent<?> fluent,AllowedFlexVolume instance){
            this(fluent, instance, true);
    }
    public AllowedFlexVolumeBuilder(AllowedFlexVolumeFluent<?> fluent,AllowedFlexVolume instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withDriver(instance.getDriver()); 
            this.validationEnabled = validationEnabled; 
    }
    public AllowedFlexVolumeBuilder(AllowedFlexVolume instance){
            this(instance,true);
    }
    public AllowedFlexVolumeBuilder(AllowedFlexVolume instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withDriver(instance.getDriver()); 
            this.validationEnabled = validationEnabled; 
    }
    public AllowedFlexVolumeBuilder(Validator validator){
            this(new AllowedFlexVolume(), true);
    }
    public AllowedFlexVolumeBuilder(AllowedFlexVolumeFluent<?> fluent,AllowedFlexVolume instance,Validator validator){
            this.fluent = fluent; 
            fluent.withDriver(instance.getDriver()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public AllowedFlexVolumeBuilder(AllowedFlexVolume instance,Validator validator){
            this.fluent = this; 
            this.withDriver(instance.getDriver()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public AllowedFlexVolume build(){
            AllowedFlexVolume buildable = new AllowedFlexVolume(fluent.getDriver());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            AllowedFlexVolumeBuilder that = (AllowedFlexVolumeBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
