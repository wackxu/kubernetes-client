package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class RBDVolumeSourceBuilder extends RBDVolumeSourceFluentImpl<RBDVolumeSourceBuilder> implements VisitableBuilder<RBDVolumeSource,RBDVolumeSourceBuilder>{

    RBDVolumeSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public RBDVolumeSourceBuilder(){
            this(true);
    }
    public RBDVolumeSourceBuilder(Boolean validationEnabled){
            this(new RBDVolumeSource(), validationEnabled);
    }
    public RBDVolumeSourceBuilder(RBDVolumeSourceFluent<?> fluent){
            this(fluent, true);
    }
    public RBDVolumeSourceBuilder(RBDVolumeSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new RBDVolumeSource(), validationEnabled);
    }
    public RBDVolumeSourceBuilder(RBDVolumeSourceFluent<?> fluent,RBDVolumeSource instance){
            this(fluent, instance, true);
    }
    public RBDVolumeSourceBuilder(RBDVolumeSourceFluent<?> fluent,RBDVolumeSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withFsType(instance.getFsType()); 
            fluent.withImage(instance.getImage()); 
            fluent.withKeyring(instance.getKeyring()); 
            fluent.withMonitors(instance.getMonitors()); 
            fluent.withPool(instance.getPool()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            fluent.withSecretRef(instance.getSecretRef()); 
            fluent.withUser(instance.getUser()); 
            this.validationEnabled = validationEnabled; 
    }
    public RBDVolumeSourceBuilder(RBDVolumeSource instance){
            this(instance,true);
    }
    public RBDVolumeSourceBuilder(RBDVolumeSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withFsType(instance.getFsType()); 
            this.withImage(instance.getImage()); 
            this.withKeyring(instance.getKeyring()); 
            this.withMonitors(instance.getMonitors()); 
            this.withPool(instance.getPool()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withSecretRef(instance.getSecretRef()); 
            this.withUser(instance.getUser()); 
            this.validationEnabled = validationEnabled; 
    }
    public RBDVolumeSourceBuilder(Validator validator){
            this(new RBDVolumeSource(), true);
    }
    public RBDVolumeSourceBuilder(RBDVolumeSourceFluent<?> fluent,RBDVolumeSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withFsType(instance.getFsType()); 
            fluent.withImage(instance.getImage()); 
            fluent.withKeyring(instance.getKeyring()); 
            fluent.withMonitors(instance.getMonitors()); 
            fluent.withPool(instance.getPool()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            fluent.withSecretRef(instance.getSecretRef()); 
            fluent.withUser(instance.getUser()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public RBDVolumeSourceBuilder(RBDVolumeSource instance,Validator validator){
            this.fluent = this; 
            this.withFsType(instance.getFsType()); 
            this.withImage(instance.getImage()); 
            this.withKeyring(instance.getKeyring()); 
            this.withMonitors(instance.getMonitors()); 
            this.withPool(instance.getPool()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withSecretRef(instance.getSecretRef()); 
            this.withUser(instance.getUser()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public RBDVolumeSource build(){
            RBDVolumeSource buildable = new RBDVolumeSource(fluent.getFsType(),fluent.getImage(),fluent.getKeyring(),fluent.getMonitors(),fluent.getPool(),fluent.isReadOnly(),fluent.getSecretRef(),fluent.getUser());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RBDVolumeSourceBuilder that = (RBDVolumeSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
