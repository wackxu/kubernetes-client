package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class CSIPersistentVolumeSourceBuilder extends CSIPersistentVolumeSourceFluentImpl<CSIPersistentVolumeSourceBuilder> implements VisitableBuilder<CSIPersistentVolumeSource,CSIPersistentVolumeSourceBuilder>{

    CSIPersistentVolumeSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public CSIPersistentVolumeSourceBuilder(){
            this(true);
    }
    public CSIPersistentVolumeSourceBuilder(Boolean validationEnabled){
            this(new CSIPersistentVolumeSource(), validationEnabled);
    }
    public CSIPersistentVolumeSourceBuilder(CSIPersistentVolumeSourceFluent<?> fluent){
            this(fluent, true);
    }
    public CSIPersistentVolumeSourceBuilder(CSIPersistentVolumeSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new CSIPersistentVolumeSource(), validationEnabled);
    }
    public CSIPersistentVolumeSourceBuilder(CSIPersistentVolumeSourceFluent<?> fluent,CSIPersistentVolumeSource instance){
            this(fluent, instance, true);
    }
    public CSIPersistentVolumeSourceBuilder(CSIPersistentVolumeSourceFluent<?> fluent,CSIPersistentVolumeSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withControllerPublishSecretRef(instance.getControllerPublishSecretRef()); 
            fluent.withDriver(instance.getDriver()); 
            fluent.withFsType(instance.getFsType()); 
            fluent.withNodePublishSecretRef(instance.getNodePublishSecretRef()); 
            fluent.withNodeStageSecretRef(instance.getNodeStageSecretRef()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            fluent.withVolumeAttributes(instance.getVolumeAttributes()); 
            fluent.withVolumeHandle(instance.getVolumeHandle()); 
            this.validationEnabled = validationEnabled; 
    }
    public CSIPersistentVolumeSourceBuilder(CSIPersistentVolumeSource instance){
            this(instance,true);
    }
    public CSIPersistentVolumeSourceBuilder(CSIPersistentVolumeSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withControllerPublishSecretRef(instance.getControllerPublishSecretRef()); 
            this.withDriver(instance.getDriver()); 
            this.withFsType(instance.getFsType()); 
            this.withNodePublishSecretRef(instance.getNodePublishSecretRef()); 
            this.withNodeStageSecretRef(instance.getNodeStageSecretRef()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withVolumeAttributes(instance.getVolumeAttributes()); 
            this.withVolumeHandle(instance.getVolumeHandle()); 
            this.validationEnabled = validationEnabled; 
    }
    public CSIPersistentVolumeSourceBuilder(Validator validator){
            this(new CSIPersistentVolumeSource(), true);
    }
    public CSIPersistentVolumeSourceBuilder(CSIPersistentVolumeSourceFluent<?> fluent,CSIPersistentVolumeSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withControllerPublishSecretRef(instance.getControllerPublishSecretRef()); 
            fluent.withDriver(instance.getDriver()); 
            fluent.withFsType(instance.getFsType()); 
            fluent.withNodePublishSecretRef(instance.getNodePublishSecretRef()); 
            fluent.withNodeStageSecretRef(instance.getNodeStageSecretRef()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            fluent.withVolumeAttributes(instance.getVolumeAttributes()); 
            fluent.withVolumeHandle(instance.getVolumeHandle()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public CSIPersistentVolumeSourceBuilder(CSIPersistentVolumeSource instance,Validator validator){
            this.fluent = this; 
            this.withControllerPublishSecretRef(instance.getControllerPublishSecretRef()); 
            this.withDriver(instance.getDriver()); 
            this.withFsType(instance.getFsType()); 
            this.withNodePublishSecretRef(instance.getNodePublishSecretRef()); 
            this.withNodeStageSecretRef(instance.getNodeStageSecretRef()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withVolumeAttributes(instance.getVolumeAttributes()); 
            this.withVolumeHandle(instance.getVolumeHandle()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public CSIPersistentVolumeSource build(){
            CSIPersistentVolumeSource buildable = new CSIPersistentVolumeSource(fluent.getControllerPublishSecretRef(),fluent.getDriver(),fluent.getFsType(),fluent.getNodePublishSecretRef(),fluent.getNodeStageSecretRef(),fluent.isReadOnly(),fluent.getVolumeAttributes(),fluent.getVolumeHandle());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CSIPersistentVolumeSourceBuilder that = (CSIPersistentVolumeSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
