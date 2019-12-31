package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class AllowedFlexVolumeBuilder extends io.fabric8.openshift.api.model.AllowedFlexVolumeFluentImpl<io.fabric8.openshift.api.model.AllowedFlexVolumeBuilder> implements VisitableBuilder<io.fabric8.openshift.api.model.AllowedFlexVolume,io.fabric8.openshift.api.model.AllowedFlexVolumeBuilder>{

    io.fabric8.openshift.api.model.AllowedFlexVolumeFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public AllowedFlexVolumeBuilder(){
            this(true);
    }
    public AllowedFlexVolumeBuilder(Boolean validationEnabled){
            this(new AllowedFlexVolume(), validationEnabled);
    }
    public AllowedFlexVolumeBuilder(io.fabric8.openshift.api.model.AllowedFlexVolumeFluent<?> fluent){
            this(fluent, true);
    }
    public AllowedFlexVolumeBuilder(io.fabric8.openshift.api.model.AllowedFlexVolumeFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new AllowedFlexVolume(), validationEnabled);
    }
    public AllowedFlexVolumeBuilder(io.fabric8.openshift.api.model.AllowedFlexVolumeFluent<?> fluent,io.fabric8.openshift.api.model.AllowedFlexVolume instance){
            this(fluent, instance, true);
    }
    public AllowedFlexVolumeBuilder(io.fabric8.openshift.api.model.AllowedFlexVolumeFluent<?> fluent,io.fabric8.openshift.api.model.AllowedFlexVolume instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withDriver(instance.getDriver()); 
            this.validationEnabled = validationEnabled; 
    }
    public AllowedFlexVolumeBuilder(io.fabric8.openshift.api.model.AllowedFlexVolume instance){
            this(instance,true);
    }
    public AllowedFlexVolumeBuilder(io.fabric8.openshift.api.model.AllowedFlexVolume instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withDriver(instance.getDriver()); 
            this.validationEnabled = validationEnabled; 
    }
    public AllowedFlexVolumeBuilder(Validator validator){
            this(new AllowedFlexVolume(), true);
    }
    public AllowedFlexVolumeBuilder(io.fabric8.openshift.api.model.AllowedFlexVolumeFluent<?> fluent,io.fabric8.openshift.api.model.AllowedFlexVolume instance,Validator validator){
            this.fluent = fluent; 
            fluent.withDriver(instance.getDriver()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public AllowedFlexVolumeBuilder(io.fabric8.openshift.api.model.AllowedFlexVolume instance,Validator validator){
            this.fluent = this; 
            this.withDriver(instance.getDriver()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public io.fabric8.openshift.api.model.AllowedFlexVolume build(){
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
