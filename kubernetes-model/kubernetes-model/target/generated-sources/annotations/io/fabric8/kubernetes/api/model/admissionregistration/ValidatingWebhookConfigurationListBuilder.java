package io.fabric8.kubernetes.api.model.admissionregistration;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ValidatingWebhookConfigurationListBuilder extends ValidatingWebhookConfigurationListFluentImpl<ValidatingWebhookConfigurationListBuilder> implements VisitableBuilder<ValidatingWebhookConfigurationList,ValidatingWebhookConfigurationListBuilder>{

    ValidatingWebhookConfigurationListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ValidatingWebhookConfigurationListBuilder(){
            this(true);
    }
    public ValidatingWebhookConfigurationListBuilder(Boolean validationEnabled){
            this(new ValidatingWebhookConfigurationList(), validationEnabled);
    }
    public ValidatingWebhookConfigurationListBuilder(ValidatingWebhookConfigurationListFluent<?> fluent){
            this(fluent, true);
    }
    public ValidatingWebhookConfigurationListBuilder(ValidatingWebhookConfigurationListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ValidatingWebhookConfigurationList(), validationEnabled);
    }
    public ValidatingWebhookConfigurationListBuilder(ValidatingWebhookConfigurationListFluent<?> fluent,ValidatingWebhookConfigurationList instance){
            this(fluent, instance, true);
    }
    public ValidatingWebhookConfigurationListBuilder(ValidatingWebhookConfigurationListFluent<?> fluent,ValidatingWebhookConfigurationList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public ValidatingWebhookConfigurationListBuilder(ValidatingWebhookConfigurationList instance){
            this(instance,true);
    }
    public ValidatingWebhookConfigurationListBuilder(ValidatingWebhookConfigurationList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public ValidatingWebhookConfigurationListBuilder(Validator validator){
            this(new ValidatingWebhookConfigurationList(), true);
    }
    public ValidatingWebhookConfigurationListBuilder(ValidatingWebhookConfigurationListFluent<?> fluent,ValidatingWebhookConfigurationList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ValidatingWebhookConfigurationListBuilder(ValidatingWebhookConfigurationList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ValidatingWebhookConfigurationList build(){
            ValidatingWebhookConfigurationList buildable = new ValidatingWebhookConfigurationList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ValidatingWebhookConfigurationListBuilder that = (ValidatingWebhookConfigurationListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
