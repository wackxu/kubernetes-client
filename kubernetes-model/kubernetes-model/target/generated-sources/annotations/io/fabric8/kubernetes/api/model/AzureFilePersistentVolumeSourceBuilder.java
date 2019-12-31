package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class AzureFilePersistentVolumeSourceBuilder extends AzureFilePersistentVolumeSourceFluentImpl<AzureFilePersistentVolumeSourceBuilder> implements VisitableBuilder<AzureFilePersistentVolumeSource,AzureFilePersistentVolumeSourceBuilder>{

    AzureFilePersistentVolumeSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public AzureFilePersistentVolumeSourceBuilder(){
            this(true);
    }
    public AzureFilePersistentVolumeSourceBuilder(Boolean validationEnabled){
            this(new AzureFilePersistentVolumeSource(), validationEnabled);
    }
    public AzureFilePersistentVolumeSourceBuilder(AzureFilePersistentVolumeSourceFluent<?> fluent){
            this(fluent, true);
    }
    public AzureFilePersistentVolumeSourceBuilder(AzureFilePersistentVolumeSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new AzureFilePersistentVolumeSource(), validationEnabled);
    }
    public AzureFilePersistentVolumeSourceBuilder(AzureFilePersistentVolumeSourceFluent<?> fluent,AzureFilePersistentVolumeSource instance){
            this(fluent, instance, true);
    }
    public AzureFilePersistentVolumeSourceBuilder(AzureFilePersistentVolumeSourceFluent<?> fluent,AzureFilePersistentVolumeSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withReadOnly(instance.getReadOnly()); 
            fluent.withSecretName(instance.getSecretName()); 
            fluent.withSecretNamespace(instance.getSecretNamespace()); 
            fluent.withShareName(instance.getShareName()); 
            this.validationEnabled = validationEnabled; 
    }
    public AzureFilePersistentVolumeSourceBuilder(AzureFilePersistentVolumeSource instance){
            this(instance,true);
    }
    public AzureFilePersistentVolumeSourceBuilder(AzureFilePersistentVolumeSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withReadOnly(instance.getReadOnly()); 
            this.withSecretName(instance.getSecretName()); 
            this.withSecretNamespace(instance.getSecretNamespace()); 
            this.withShareName(instance.getShareName()); 
            this.validationEnabled = validationEnabled; 
    }
    public AzureFilePersistentVolumeSourceBuilder(Validator validator){
            this(new AzureFilePersistentVolumeSource(), true);
    }
    public AzureFilePersistentVolumeSourceBuilder(AzureFilePersistentVolumeSourceFluent<?> fluent,AzureFilePersistentVolumeSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withReadOnly(instance.getReadOnly()); 
            fluent.withSecretName(instance.getSecretName()); 
            fluent.withSecretNamespace(instance.getSecretNamespace()); 
            fluent.withShareName(instance.getShareName()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public AzureFilePersistentVolumeSourceBuilder(AzureFilePersistentVolumeSource instance,Validator validator){
            this.fluent = this; 
            this.withReadOnly(instance.getReadOnly()); 
            this.withSecretName(instance.getSecretName()); 
            this.withSecretNamespace(instance.getSecretNamespace()); 
            this.withShareName(instance.getShareName()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public AzureFilePersistentVolumeSource build(){
            AzureFilePersistentVolumeSource buildable = new AzureFilePersistentVolumeSource(fluent.isReadOnly(),fluent.getSecretName(),fluent.getSecretNamespace(),fluent.getShareName());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            AzureFilePersistentVolumeSourceBuilder that = (AzureFilePersistentVolumeSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
