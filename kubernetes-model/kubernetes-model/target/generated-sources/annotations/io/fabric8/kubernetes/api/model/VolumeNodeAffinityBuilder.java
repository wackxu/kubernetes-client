package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class VolumeNodeAffinityBuilder extends VolumeNodeAffinityFluentImpl<VolumeNodeAffinityBuilder> implements VisitableBuilder<VolumeNodeAffinity,VolumeNodeAffinityBuilder>{

    VolumeNodeAffinityFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public VolumeNodeAffinityBuilder(){
            this(true);
    }
    public VolumeNodeAffinityBuilder(Boolean validationEnabled){
            this(new VolumeNodeAffinity(), validationEnabled);
    }
    public VolumeNodeAffinityBuilder(VolumeNodeAffinityFluent<?> fluent){
            this(fluent, true);
    }
    public VolumeNodeAffinityBuilder(VolumeNodeAffinityFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new VolumeNodeAffinity(), validationEnabled);
    }
    public VolumeNodeAffinityBuilder(VolumeNodeAffinityFluent<?> fluent,VolumeNodeAffinity instance){
            this(fluent, instance, true);
    }
    public VolumeNodeAffinityBuilder(VolumeNodeAffinityFluent<?> fluent,VolumeNodeAffinity instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withRequired(instance.getRequired()); 
            this.validationEnabled = validationEnabled; 
    }
    public VolumeNodeAffinityBuilder(VolumeNodeAffinity instance){
            this(instance,true);
    }
    public VolumeNodeAffinityBuilder(VolumeNodeAffinity instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withRequired(instance.getRequired()); 
            this.validationEnabled = validationEnabled; 
    }
    public VolumeNodeAffinityBuilder(Validator validator){
            this(new VolumeNodeAffinity(), true);
    }
    public VolumeNodeAffinityBuilder(VolumeNodeAffinityFluent<?> fluent,VolumeNodeAffinity instance,Validator validator){
            this.fluent = fluent; 
            fluent.withRequired(instance.getRequired()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public VolumeNodeAffinityBuilder(VolumeNodeAffinity instance,Validator validator){
            this.fluent = this; 
            this.withRequired(instance.getRequired()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public VolumeNodeAffinity build(){
            VolumeNodeAffinity buildable = new VolumeNodeAffinity(fluent.getRequired());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            VolumeNodeAffinityBuilder that = (VolumeNodeAffinityBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
