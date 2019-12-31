package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ISCSIVolumeSourceBuilder extends ISCSIVolumeSourceFluentImpl<ISCSIVolumeSourceBuilder> implements VisitableBuilder<ISCSIVolumeSource,ISCSIVolumeSourceBuilder>{

    ISCSIVolumeSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ISCSIVolumeSourceBuilder(){
            this(true);
    }
    public ISCSIVolumeSourceBuilder(Boolean validationEnabled){
            this(new ISCSIVolumeSource(), validationEnabled);
    }
    public ISCSIVolumeSourceBuilder(ISCSIVolumeSourceFluent<?> fluent){
            this(fluent, true);
    }
    public ISCSIVolumeSourceBuilder(ISCSIVolumeSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ISCSIVolumeSource(), validationEnabled);
    }
    public ISCSIVolumeSourceBuilder(ISCSIVolumeSourceFluent<?> fluent,ISCSIVolumeSource instance){
            this(fluent, instance, true);
    }
    public ISCSIVolumeSourceBuilder(ISCSIVolumeSourceFluent<?> fluent,ISCSIVolumeSource instance,Boolean validationEnabled){
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
    public ISCSIVolumeSourceBuilder(ISCSIVolumeSource instance){
            this(instance,true);
    }
    public ISCSIVolumeSourceBuilder(ISCSIVolumeSource instance,Boolean validationEnabled){
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
    public ISCSIVolumeSourceBuilder(Validator validator){
            this(new ISCSIVolumeSource(), true);
    }
    public ISCSIVolumeSourceBuilder(ISCSIVolumeSourceFluent<?> fluent,ISCSIVolumeSource instance,Validator validator){
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
    public ISCSIVolumeSourceBuilder(ISCSIVolumeSource instance,Validator validator){
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

    public ISCSIVolumeSource build(){
            ISCSIVolumeSource buildable = new ISCSIVolumeSource(fluent.isChapAuthDiscovery(),fluent.isChapAuthSession(),fluent.getFsType(),fluent.getInitiatorName(),fluent.getIqn(),fluent.getIscsiInterface(),fluent.getLun(),fluent.getPortals(),fluent.isReadOnly(),fluent.getSecretRef(),fluent.getTargetPortal());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ISCSIVolumeSourceBuilder that = (ISCSIVolumeSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
