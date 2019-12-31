package io.fabric8.kubernetes.api.model.admissionregistration;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class MutatingWebhookConfigurationBuilder extends MutatingWebhookConfigurationFluentImpl<MutatingWebhookConfigurationBuilder> implements VisitableBuilder<MutatingWebhookConfiguration,MutatingWebhookConfigurationBuilder>{

    MutatingWebhookConfigurationFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public MutatingWebhookConfigurationBuilder(){
            this(true);
    }
    public MutatingWebhookConfigurationBuilder(Boolean validationEnabled){
            this(new MutatingWebhookConfiguration(), validationEnabled);
    }
    public MutatingWebhookConfigurationBuilder(MutatingWebhookConfigurationFluent<?> fluent){
            this(fluent, true);
    }
    public MutatingWebhookConfigurationBuilder(MutatingWebhookConfigurationFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new MutatingWebhookConfiguration(), validationEnabled);
    }
    public MutatingWebhookConfigurationBuilder(MutatingWebhookConfigurationFluent<?> fluent,MutatingWebhookConfiguration instance){
            this(fluent, instance, true);
    }
    public MutatingWebhookConfigurationBuilder(MutatingWebhookConfigurationFluent<?> fluent,MutatingWebhookConfiguration instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withWebhooks(instance.getWebhooks()); 
            this.validationEnabled = validationEnabled; 
    }
    public MutatingWebhookConfigurationBuilder(MutatingWebhookConfiguration instance){
            this(instance,true);
    }
    public MutatingWebhookConfigurationBuilder(MutatingWebhookConfiguration instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withWebhooks(instance.getWebhooks()); 
            this.validationEnabled = validationEnabled; 
    }
    public MutatingWebhookConfigurationBuilder(Validator validator){
            this(new MutatingWebhookConfiguration(), true);
    }
    public MutatingWebhookConfigurationBuilder(MutatingWebhookConfigurationFluent<?> fluent,MutatingWebhookConfiguration instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withWebhooks(instance.getWebhooks()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public MutatingWebhookConfigurationBuilder(MutatingWebhookConfiguration instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withWebhooks(instance.getWebhooks()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public MutatingWebhookConfiguration build(){
            MutatingWebhookConfiguration buildable = new MutatingWebhookConfiguration(fluent.getApiVersion(),fluent.getKind(),fluent.getMetadata(),fluent.getWebhooks());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            MutatingWebhookConfigurationBuilder that = (MutatingWebhookConfigurationBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
