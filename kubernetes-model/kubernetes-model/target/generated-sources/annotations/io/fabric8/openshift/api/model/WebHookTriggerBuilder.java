package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class WebHookTriggerBuilder extends WebHookTriggerFluentImpl<WebHookTriggerBuilder> implements VisitableBuilder<WebHookTrigger,WebHookTriggerBuilder>{

    WebHookTriggerFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public WebHookTriggerBuilder(){
            this(true);
    }
    public WebHookTriggerBuilder(Boolean validationEnabled){
            this(new WebHookTrigger(), validationEnabled);
    }
    public WebHookTriggerBuilder(WebHookTriggerFluent<?> fluent){
            this(fluent, true);
    }
    public WebHookTriggerBuilder(WebHookTriggerFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new WebHookTrigger(), validationEnabled);
    }
    public WebHookTriggerBuilder(WebHookTriggerFluent<?> fluent,WebHookTrigger instance){
            this(fluent, instance, true);
    }
    public WebHookTriggerBuilder(WebHookTriggerFluent<?> fluent,WebHookTrigger instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAllowEnv(instance.getAllowEnv()); 
            fluent.withSecret(instance.getSecret()); 
            fluent.withSecretReference(instance.getSecretReference()); 
            this.validationEnabled = validationEnabled; 
    }
    public WebHookTriggerBuilder(WebHookTrigger instance){
            this(instance,true);
    }
    public WebHookTriggerBuilder(WebHookTrigger instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAllowEnv(instance.getAllowEnv()); 
            this.withSecret(instance.getSecret()); 
            this.withSecretReference(instance.getSecretReference()); 
            this.validationEnabled = validationEnabled; 
    }
    public WebHookTriggerBuilder(Validator validator){
            this(new WebHookTrigger(), true);
    }
    public WebHookTriggerBuilder(WebHookTriggerFluent<?> fluent,WebHookTrigger instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAllowEnv(instance.getAllowEnv()); 
            fluent.withSecret(instance.getSecret()); 
            fluent.withSecretReference(instance.getSecretReference()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public WebHookTriggerBuilder(WebHookTrigger instance,Validator validator){
            this.fluent = this; 
            this.withAllowEnv(instance.getAllowEnv()); 
            this.withSecret(instance.getSecret()); 
            this.withSecretReference(instance.getSecretReference()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public WebHookTrigger build(){
            WebHookTrigger buildable = new WebHookTrigger(fluent.isAllowEnv(),fluent.getSecret(),fluent.getSecretReference());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            WebHookTriggerBuilder that = (WebHookTriggerBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
