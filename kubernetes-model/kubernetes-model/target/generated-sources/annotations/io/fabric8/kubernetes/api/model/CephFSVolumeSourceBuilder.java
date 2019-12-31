package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class CephFSVolumeSourceBuilder extends CephFSVolumeSourceFluentImpl<CephFSVolumeSourceBuilder> implements VisitableBuilder<CephFSVolumeSource,CephFSVolumeSourceBuilder>{

    CephFSVolumeSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public CephFSVolumeSourceBuilder(){
            this(true);
    }
    public CephFSVolumeSourceBuilder(Boolean validationEnabled){
            this(new CephFSVolumeSource(), validationEnabled);
    }
    public CephFSVolumeSourceBuilder(CephFSVolumeSourceFluent<?> fluent){
            this(fluent, true);
    }
    public CephFSVolumeSourceBuilder(CephFSVolumeSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new CephFSVolumeSource(), validationEnabled);
    }
    public CephFSVolumeSourceBuilder(CephFSVolumeSourceFluent<?> fluent,CephFSVolumeSource instance){
            this(fluent, instance, true);
    }
    public CephFSVolumeSourceBuilder(CephFSVolumeSourceFluent<?> fluent,CephFSVolumeSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withMonitors(instance.getMonitors()); 
            fluent.withPath(instance.getPath()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            fluent.withSecretFile(instance.getSecretFile()); 
            fluent.withSecretRef(instance.getSecretRef()); 
            fluent.withUser(instance.getUser()); 
            this.validationEnabled = validationEnabled; 
    }
    public CephFSVolumeSourceBuilder(CephFSVolumeSource instance){
            this(instance,true);
    }
    public CephFSVolumeSourceBuilder(CephFSVolumeSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withMonitors(instance.getMonitors()); 
            this.withPath(instance.getPath()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withSecretFile(instance.getSecretFile()); 
            this.withSecretRef(instance.getSecretRef()); 
            this.withUser(instance.getUser()); 
            this.validationEnabled = validationEnabled; 
    }
    public CephFSVolumeSourceBuilder(Validator validator){
            this(new CephFSVolumeSource(), true);
    }
    public CephFSVolumeSourceBuilder(CephFSVolumeSourceFluent<?> fluent,CephFSVolumeSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withMonitors(instance.getMonitors()); 
            fluent.withPath(instance.getPath()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            fluent.withSecretFile(instance.getSecretFile()); 
            fluent.withSecretRef(instance.getSecretRef()); 
            fluent.withUser(instance.getUser()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public CephFSVolumeSourceBuilder(CephFSVolumeSource instance,Validator validator){
            this.fluent = this; 
            this.withMonitors(instance.getMonitors()); 
            this.withPath(instance.getPath()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withSecretFile(instance.getSecretFile()); 
            this.withSecretRef(instance.getSecretRef()); 
            this.withUser(instance.getUser()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public CephFSVolumeSource build(){
            CephFSVolumeSource buildable = new CephFSVolumeSource(fluent.getMonitors(),fluent.getPath(),fluent.isReadOnly(),fluent.getSecretFile(),fluent.getSecretRef(),fluent.getUser());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CephFSVolumeSourceBuilder that = (CephFSVolumeSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
