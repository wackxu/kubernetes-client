package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class CinderVolumeSourceBuilder extends CinderVolumeSourceFluentImpl<CinderVolumeSourceBuilder> implements VisitableBuilder<CinderVolumeSource,CinderVolumeSourceBuilder>{

    CinderVolumeSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public CinderVolumeSourceBuilder(){
            this(true);
    }
    public CinderVolumeSourceBuilder(Boolean validationEnabled){
            this(new CinderVolumeSource(), validationEnabled);
    }
    public CinderVolumeSourceBuilder(CinderVolumeSourceFluent<?> fluent){
            this(fluent, true);
    }
    public CinderVolumeSourceBuilder(CinderVolumeSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new CinderVolumeSource(), validationEnabled);
    }
    public CinderVolumeSourceBuilder(CinderVolumeSourceFluent<?> fluent,CinderVolumeSource instance){
            this(fluent, instance, true);
    }
    public CinderVolumeSourceBuilder(CinderVolumeSourceFluent<?> fluent,CinderVolumeSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withFsType(instance.getFsType()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            fluent.withSecretRef(instance.getSecretRef()); 
            fluent.withVolumeID(instance.getVolumeID()); 
            this.validationEnabled = validationEnabled; 
    }
    public CinderVolumeSourceBuilder(CinderVolumeSource instance){
            this(instance,true);
    }
    public CinderVolumeSourceBuilder(CinderVolumeSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withFsType(instance.getFsType()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withSecretRef(instance.getSecretRef()); 
            this.withVolumeID(instance.getVolumeID()); 
            this.validationEnabled = validationEnabled; 
    }
    public CinderVolumeSourceBuilder(Validator validator){
            this(new CinderVolumeSource(), true);
    }
    public CinderVolumeSourceBuilder(CinderVolumeSourceFluent<?> fluent,CinderVolumeSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withFsType(instance.getFsType()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            fluent.withSecretRef(instance.getSecretRef()); 
            fluent.withVolumeID(instance.getVolumeID()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public CinderVolumeSourceBuilder(CinderVolumeSource instance,Validator validator){
            this.fluent = this; 
            this.withFsType(instance.getFsType()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withSecretRef(instance.getSecretRef()); 
            this.withVolumeID(instance.getVolumeID()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public CinderVolumeSource build(){
            CinderVolumeSource buildable = new CinderVolumeSource(fluent.getFsType(),fluent.isReadOnly(),fluent.getSecretRef(),fluent.getVolumeID());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CinderVolumeSourceBuilder that = (CinderVolumeSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
