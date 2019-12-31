package io.fabric8.kubernetes.api.model.admissionregistration;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class WebhookClientConfigBuilder extends WebhookClientConfigFluentImpl<WebhookClientConfigBuilder> implements VisitableBuilder<WebhookClientConfig,WebhookClientConfigBuilder>{

    WebhookClientConfigFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public WebhookClientConfigBuilder(){
            this(true);
    }
    public WebhookClientConfigBuilder(Boolean validationEnabled){
            this(new WebhookClientConfig(), validationEnabled);
    }
    public WebhookClientConfigBuilder(WebhookClientConfigFluent<?> fluent){
            this(fluent, true);
    }
    public WebhookClientConfigBuilder(WebhookClientConfigFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new WebhookClientConfig(), validationEnabled);
    }
    public WebhookClientConfigBuilder(WebhookClientConfigFluent<?> fluent,WebhookClientConfig instance){
            this(fluent, instance, true);
    }
    public WebhookClientConfigBuilder(WebhookClientConfigFluent<?> fluent,WebhookClientConfig instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withCaBundle(instance.getCaBundle()); 
            fluent.withService(instance.getService()); 
            fluent.withUrl(instance.getUrl()); 
            this.validationEnabled = validationEnabled; 
    }
    public WebhookClientConfigBuilder(WebhookClientConfig instance){
            this(instance,true);
    }
    public WebhookClientConfigBuilder(WebhookClientConfig instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withCaBundle(instance.getCaBundle()); 
            this.withService(instance.getService()); 
            this.withUrl(instance.getUrl()); 
            this.validationEnabled = validationEnabled; 
    }
    public WebhookClientConfigBuilder(Validator validator){
            this(new WebhookClientConfig(), true);
    }
    public WebhookClientConfigBuilder(WebhookClientConfigFluent<?> fluent,WebhookClientConfig instance,Validator validator){
            this.fluent = fluent; 
            fluent.withCaBundle(instance.getCaBundle()); 
            fluent.withService(instance.getService()); 
            fluent.withUrl(instance.getUrl()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public WebhookClientConfigBuilder(WebhookClientConfig instance,Validator validator){
            this.fluent = this; 
            this.withCaBundle(instance.getCaBundle()); 
            this.withService(instance.getService()); 
            this.withUrl(instance.getUrl()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public WebhookClientConfig build(){
            WebhookClientConfig buildable = new WebhookClientConfig(fluent.getCaBundle(),fluent.getService(),fluent.getUrl());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            WebhookClientConfigBuilder that = (WebhookClientConfigBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
