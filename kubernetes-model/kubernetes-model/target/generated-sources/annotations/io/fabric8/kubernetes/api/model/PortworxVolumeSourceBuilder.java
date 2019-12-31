package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PortworxVolumeSourceBuilder extends PortworxVolumeSourceFluentImpl<PortworxVolumeSourceBuilder> implements VisitableBuilder<PortworxVolumeSource,PortworxVolumeSourceBuilder>{

    PortworxVolumeSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PortworxVolumeSourceBuilder(){
            this(true);
    }
    public PortworxVolumeSourceBuilder(Boolean validationEnabled){
            this(new PortworxVolumeSource(), validationEnabled);
    }
    public PortworxVolumeSourceBuilder(PortworxVolumeSourceFluent<?> fluent){
            this(fluent, true);
    }
    public PortworxVolumeSourceBuilder(PortworxVolumeSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new PortworxVolumeSource(), validationEnabled);
    }
    public PortworxVolumeSourceBuilder(PortworxVolumeSourceFluent<?> fluent,PortworxVolumeSource instance){
            this(fluent, instance, true);
    }
    public PortworxVolumeSourceBuilder(PortworxVolumeSourceFluent<?> fluent,PortworxVolumeSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withFsType(instance.getFsType()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            fluent.withVolumeID(instance.getVolumeID()); 
            this.validationEnabled = validationEnabled; 
    }
    public PortworxVolumeSourceBuilder(PortworxVolumeSource instance){
            this(instance,true);
    }
    public PortworxVolumeSourceBuilder(PortworxVolumeSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withFsType(instance.getFsType()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withVolumeID(instance.getVolumeID()); 
            this.validationEnabled = validationEnabled; 
    }
    public PortworxVolumeSourceBuilder(Validator validator){
            this(new PortworxVolumeSource(), true);
    }
    public PortworxVolumeSourceBuilder(PortworxVolumeSourceFluent<?> fluent,PortworxVolumeSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withFsType(instance.getFsType()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            fluent.withVolumeID(instance.getVolumeID()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PortworxVolumeSourceBuilder(PortworxVolumeSource instance,Validator validator){
            this.fluent = this; 
            this.withFsType(instance.getFsType()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withVolumeID(instance.getVolumeID()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public PortworxVolumeSource build(){
            PortworxVolumeSource buildable = new PortworxVolumeSource(fluent.getFsType(),fluent.isReadOnly(),fluent.getVolumeID());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PortworxVolumeSourceBuilder that = (PortworxVolumeSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
