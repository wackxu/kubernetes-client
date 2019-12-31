package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class AzureFileVolumeSourceBuilder extends AzureFileVolumeSourceFluentImpl<AzureFileVolumeSourceBuilder> implements VisitableBuilder<AzureFileVolumeSource,AzureFileVolumeSourceBuilder>{

    AzureFileVolumeSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public AzureFileVolumeSourceBuilder(){
            this(true);
    }
    public AzureFileVolumeSourceBuilder(Boolean validationEnabled){
            this(new AzureFileVolumeSource(), validationEnabled);
    }
    public AzureFileVolumeSourceBuilder(AzureFileVolumeSourceFluent<?> fluent){
            this(fluent, true);
    }
    public AzureFileVolumeSourceBuilder(AzureFileVolumeSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new AzureFileVolumeSource(), validationEnabled);
    }
    public AzureFileVolumeSourceBuilder(AzureFileVolumeSourceFluent<?> fluent,AzureFileVolumeSource instance){
            this(fluent, instance, true);
    }
    public AzureFileVolumeSourceBuilder(AzureFileVolumeSourceFluent<?> fluent,AzureFileVolumeSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withReadOnly(instance.getReadOnly()); 
            fluent.withSecretName(instance.getSecretName()); 
            fluent.withShareName(instance.getShareName()); 
            this.validationEnabled = validationEnabled; 
    }
    public AzureFileVolumeSourceBuilder(AzureFileVolumeSource instance){
            this(instance,true);
    }
    public AzureFileVolumeSourceBuilder(AzureFileVolumeSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withReadOnly(instance.getReadOnly()); 
            this.withSecretName(instance.getSecretName()); 
            this.withShareName(instance.getShareName()); 
            this.validationEnabled = validationEnabled; 
    }
    public AzureFileVolumeSourceBuilder(Validator validator){
            this(new AzureFileVolumeSource(), true);
    }
    public AzureFileVolumeSourceBuilder(AzureFileVolumeSourceFluent<?> fluent,AzureFileVolumeSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withReadOnly(instance.getReadOnly()); 
            fluent.withSecretName(instance.getSecretName()); 
            fluent.withShareName(instance.getShareName()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public AzureFileVolumeSourceBuilder(AzureFileVolumeSource instance,Validator validator){
            this.fluent = this; 
            this.withReadOnly(instance.getReadOnly()); 
            this.withSecretName(instance.getSecretName()); 
            this.withShareName(instance.getShareName()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public AzureFileVolumeSource build(){
            AzureFileVolumeSource buildable = new AzureFileVolumeSource(fluent.isReadOnly(),fluent.getSecretName(),fluent.getShareName());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            AzureFileVolumeSourceBuilder that = (AzureFileVolumeSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
