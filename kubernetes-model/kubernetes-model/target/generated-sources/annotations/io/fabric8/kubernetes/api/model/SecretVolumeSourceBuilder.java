package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class SecretVolumeSourceBuilder extends SecretVolumeSourceFluentImpl<SecretVolumeSourceBuilder> implements VisitableBuilder<SecretVolumeSource,SecretVolumeSourceBuilder>{

    SecretVolumeSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public SecretVolumeSourceBuilder(){
            this(true);
    }
    public SecretVolumeSourceBuilder(Boolean validationEnabled){
            this(new SecretVolumeSource(), validationEnabled);
    }
    public SecretVolumeSourceBuilder(SecretVolumeSourceFluent<?> fluent){
            this(fluent, true);
    }
    public SecretVolumeSourceBuilder(SecretVolumeSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new SecretVolumeSource(), validationEnabled);
    }
    public SecretVolumeSourceBuilder(SecretVolumeSourceFluent<?> fluent,SecretVolumeSource instance){
            this(fluent, instance, true);
    }
    public SecretVolumeSourceBuilder(SecretVolumeSourceFluent<?> fluent,SecretVolumeSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withDefaultMode(instance.getDefaultMode()); 
            fluent.withItems(instance.getItems()); 
            fluent.withOptional(instance.getOptional()); 
            fluent.withSecretName(instance.getSecretName()); 
            this.validationEnabled = validationEnabled; 
    }
    public SecretVolumeSourceBuilder(SecretVolumeSource instance){
            this(instance,true);
    }
    public SecretVolumeSourceBuilder(SecretVolumeSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withDefaultMode(instance.getDefaultMode()); 
            this.withItems(instance.getItems()); 
            this.withOptional(instance.getOptional()); 
            this.withSecretName(instance.getSecretName()); 
            this.validationEnabled = validationEnabled; 
    }
    public SecretVolumeSourceBuilder(Validator validator){
            this(new SecretVolumeSource(), true);
    }
    public SecretVolumeSourceBuilder(SecretVolumeSourceFluent<?> fluent,SecretVolumeSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withDefaultMode(instance.getDefaultMode()); 
            fluent.withItems(instance.getItems()); 
            fluent.withOptional(instance.getOptional()); 
            fluent.withSecretName(instance.getSecretName()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public SecretVolumeSourceBuilder(SecretVolumeSource instance,Validator validator){
            this.fluent = this; 
            this.withDefaultMode(instance.getDefaultMode()); 
            this.withItems(instance.getItems()); 
            this.withOptional(instance.getOptional()); 
            this.withSecretName(instance.getSecretName()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public SecretVolumeSource build(){
            SecretVolumeSource buildable = new SecretVolumeSource(fluent.getDefaultMode(),fluent.getItems(),fluent.isOptional(),fluent.getSecretName());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SecretVolumeSourceBuilder that = (SecretVolumeSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
