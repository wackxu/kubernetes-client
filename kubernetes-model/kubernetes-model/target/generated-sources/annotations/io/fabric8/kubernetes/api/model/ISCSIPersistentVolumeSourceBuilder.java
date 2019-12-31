package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ISCSIPersistentVolumeSourceBuilder extends ISCSIPersistentVolumeSourceFluentImpl<ISCSIPersistentVolumeSourceBuilder> implements VisitableBuilder<ISCSIPersistentVolumeSource,ISCSIPersistentVolumeSourceBuilder>{

    ISCSIPersistentVolumeSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ISCSIPersistentVolumeSourceBuilder(){
            this(true);
    }
    public ISCSIPersistentVolumeSourceBuilder(Boolean validationEnabled){
            this(new ISCSIPersistentVolumeSource(), validationEnabled);
    }
    public ISCSIPersistentVolumeSourceBuilder(ISCSIPersistentVolumeSourceFluent<?> fluent){
            this(fluent, true);
    }
    public ISCSIPersistentVolumeSourceBuilder(ISCSIPersistentVolumeSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ISCSIPersistentVolumeSource(), validationEnabled);
    }
    public ISCSIPersistentVolumeSourceBuilder(ISCSIPersistentVolumeSourceFluent<?> fluent,ISCSIPersistentVolumeSource instance){
            this(fluent, instance, true);
    }
    public ISCSIPersistentVolumeSourceBuilder(ISCSIPersistentVolumeSourceFluent<?> fluent,ISCSIPersistentVolumeSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withChapAuthDiscovery(instance.getChapAuthDiscovery()); 
            fluent.withChapAuthSession(instance.getChapAuthSession()); 
            fluent.withFsType(instance.getFsType()); 
            fluent.withInitiatorName(instance.getInitiatorName()); 
            fluent.withIqn(instance.getIqn()); 
            fluent.withIscsiInterface(instance.getIscsiInterface()); 
            fluent.withLun(instance.getLun()); 
            fluent.withPortals(instance.getPortals()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            fluent.withSecretRef(instance.getSecretRef()); 
            fluent.withTargetPortal(instance.getTargetPortal()); 
            this.validationEnabled = validationEnabled; 
    }
    public ISCSIPersistentVolumeSourceBuilder(ISCSIPersistentVolumeSource instance){
            this(instance,true);
    }
    public ISCSIPersistentVolumeSourceBuilder(ISCSIPersistentVolumeSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withChapAuthDiscovery(instance.getChapAuthDiscovery()); 
            this.withChapAuthSession(instance.getChapAuthSession()); 
            this.withFsType(instance.getFsType()); 
            this.withInitiatorName(instance.getInitiatorName()); 
            this.withIqn(instance.getIqn()); 
            this.withIscsiInterface(instance.getIscsiInterface()); 
            this.withLun(instance.getLun()); 
            this.withPortals(instance.getPortals()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withSecretRef(instance.getSecretRef()); 
            this.withTargetPortal(instance.getTargetPortal()); 
            this.validationEnabled = validationEnabled; 
    }
    public ISCSIPersistentVolumeSourceBuilder(Validator validator){
            this(new ISCSIPersistentVolumeSource(), true);
    }
    public ISCSIPersistentVolumeSourceBuilder(ISCSIPersistentVolumeSourceFluent<?> fluent,ISCSIPersistentVolumeSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withChapAuthDiscovery(instance.getChapAuthDiscovery()); 
            fluent.withChapAuthSession(instance.getChapAuthSession()); 
            fluent.withFsType(instance.getFsType()); 
            fluent.withInitiatorName(instance.getInitiatorName()); 
            fluent.withIqn(instance.getIqn()); 
            fluent.withIscsiInterface(instance.getIscsiInterface()); 
            fluent.withLun(instance.getLun()); 
            fluent.withPortals(instance.getPortals()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            fluent.withSecretRef(instance.getSecretRef()); 
            fluent.withTargetPortal(instance.getTargetPortal()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ISCSIPersistentVolumeSourceBuilder(ISCSIPersistentVolumeSource instance,Validator validator){
            this.fluent = this; 
            this.withChapAuthDiscovery(instance.getChapAuthDiscovery()); 
            this.withChapAuthSession(instance.getChapAuthSession()); 
            this.withFsType(instance.getFsType()); 
            this.withInitiatorName(instance.getInitiatorName()); 
            this.withIqn(instance.getIqn()); 
            this.withIscsiInterface(instance.getIscsiInterface()); 
            this.withLun(instance.getLun()); 
            this.withPortals(instance.getPortals()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withSecretRef(instance.getSecretRef()); 
            this.withTargetPortal(instance.getTargetPortal()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ISCSIPersistentVolumeSource build(){
            ISCSIPersistentVolumeSource buildable = new ISCSIPersistentVolumeSource(fluent.isChapAuthDiscovery(),fluent.isChapAuthSession(),fluent.getFsType(),fluent.getInitiatorName(),fluent.getIqn(),fluent.getIscsiInterface(),fluent.getLun(),fluent.getPortals(),fluent.isReadOnly(),fluent.getSecretRef(),fluent.getTargetPortal());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ISCSIPersistentVolumeSourceBuilder that = (ISCSIPersistentVolumeSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
