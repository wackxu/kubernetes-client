package io.fabric8.kubernetes.api.model.admissionregistration;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ValidatingWebhookConfigurationBuilder extends ValidatingWebhookConfigurationFluentImpl<ValidatingWebhookConfigurationBuilder> implements VisitableBuilder<ValidatingWebhookConfiguration,ValidatingWebhookConfigurationBuilder>{

    ValidatingWebhookConfigurationFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ValidatingWebhookConfigurationBuilder(){
            this(true);
    }
    public ValidatingWebhookConfigurationBuilder(Boolean validationEnabled){
            this(new ValidatingWebhookConfiguration(), validationEnabled);
    }
    public ValidatingWebhookConfigurationBuilder(ValidatingWebhookConfigurationFluent<?> fluent){
            this(fluent, true);
    }
    public ValidatingWebhookConfigurationBuilder(ValidatingWebhookConfigurationFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ValidatingWebhookConfiguration(), validationEnabled);
    }
    public ValidatingWebhookConfigurationBuilder(ValidatingWebhookConfigurationFluent<?> fluent,ValidatingWebhookConfiguration instance){
            this(fluent, instance, true);
    }
    public ValidatingWebhookConfigurationBuilder(ValidatingWebhookConfigurationFluent<?> fluent,ValidatingWebhookConfiguration instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withWebhooks(instance.getWebhooks()); 
            this.validationEnabled = validationEnabled; 
    }
    public ValidatingWebhookConfigurationBuilder(ValidatingWebhookConfiguration instance){
            this(instance,true);
    }
    public ValidatingWebhookConfigurationBuilder(ValidatingWebhookConfiguration instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withWebhooks(instance.getWebhooks()); 
            this.validationEnabled = validationEnabled; 
    }
    public ValidatingWebhookConfigurationBuilder(Validator validator){
            this(new ValidatingWebhookConfiguration(), true);
    }
    public ValidatingWebhookConfigurationBuilder(ValidatingWebhookConfigurationFluent<?> fluent,ValidatingWebhookConfiguration instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withWebhooks(instance.getWebhooks()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ValidatingWebhookConfigurationBuilder(ValidatingWebhookConfiguration instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withWebhooks(instance.getWebhooks()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ValidatingWebhookConfiguration build(){
            ValidatingWebhookConfiguration buildable = new ValidatingWebhookConfiguration(fluent.getApiVersion(),fluent.getKind(),fluent.getMetadata(),fluent.getWebhooks());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ValidatingWebhookConfigurationBuilder that = (ValidatingWebhookConfigurationBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
