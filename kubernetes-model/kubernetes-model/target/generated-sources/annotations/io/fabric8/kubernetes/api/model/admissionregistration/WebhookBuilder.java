package io.fabric8.kubernetes.api.model.admissionregistration;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class WebhookBuilder extends WebhookFluentImpl<WebhookBuilder> implements VisitableBuilder<Webhook,WebhookBuilder>{

    WebhookFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public WebhookBuilder(){
            this(true);
    }
    public WebhookBuilder(Boolean validationEnabled){
            this(new Webhook(), validationEnabled);
    }
    public WebhookBuilder(WebhookFluent<?> fluent){
            this(fluent, true);
    }
    public WebhookBuilder(WebhookFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new Webhook(), validationEnabled);
    }
    public WebhookBuilder(WebhookFluent<?> fluent,Webhook instance){
            this(fluent, instance, true);
    }
    public WebhookBuilder(WebhookFluent<?> fluent,Webhook instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withClientConfig(instance.getClientConfig()); 
            fluent.withFailurePolicy(instance.getFailurePolicy()); 
            fluent.withName(instance.getName()); 
            fluent.withNamespaceSelector(instance.getNamespaceSelector()); 
            fluent.withRules(instance.getRules()); 
            fluent.withSideEffects(instance.getSideEffects()); 
            this.validationEnabled = validationEnabled; 
    }
    public WebhookBuilder(Webhook instance){
            this(instance,true);
    }
    public WebhookBuilder(Webhook instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withClientConfig(instance.getClientConfig()); 
            this.withFailurePolicy(instance.getFailurePolicy()); 
            this.withName(instance.getName()); 
            this.withNamespaceSelector(instance.getNamespaceSelector()); 
            this.withRules(instance.getRules()); 
            this.withSideEffects(instance.getSideEffects()); 
            this.validationEnabled = validationEnabled; 
    }
    public WebhookBuilder(Validator validator){
            this(new Webhook(), true);
    }
    public WebhookBuilder(WebhookFluent<?> fluent,Webhook instance,Validator validator){
            this.fluent = fluent; 
            fluent.withClientConfig(instance.getClientConfig()); 
            fluent.withFailurePolicy(instance.getFailurePolicy()); 
            fluent.withName(instance.getName()); 
            fluent.withNamespaceSelector(instance.getNamespaceSelector()); 
            fluent.withRules(instance.getRules()); 
            fluent.withSideEffects(instance.getSideEffects()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public WebhookBuilder(Webhook instance,Validator validator){
            this.fluent = this; 
            this.withClientConfig(instance.getClientConfig()); 
            this.withFailurePolicy(instance.getFailurePolicy()); 
            this.withName(instance.getName()); 
            this.withNamespaceSelector(instance.getNamespaceSelector()); 
            this.withRules(instance.getRules()); 
            this.withSideEffects(instance.getSideEffects()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public Webhook build(){
            Webhook buildable = new Webhook(fluent.getClientConfig(),fluent.getFailurePolicy(),fluent.getName(),fluent.getNamespaceSelector(),fluent.getRules(),fluent.getSideEffects());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            WebhookBuilder that = (WebhookBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
