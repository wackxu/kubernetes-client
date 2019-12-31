package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class AuthProviderConfigBuilder extends AuthProviderConfigFluentImpl<AuthProviderConfigBuilder> implements VisitableBuilder<AuthProviderConfig,AuthProviderConfigBuilder>{

    AuthProviderConfigFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public AuthProviderConfigBuilder(){
            this(true);
    }
    public AuthProviderConfigBuilder(Boolean validationEnabled){
            this(new AuthProviderConfig(), validationEnabled);
    }
    public AuthProviderConfigBuilder(AuthProviderConfigFluent<?> fluent){
            this(fluent, true);
    }
    public AuthProviderConfigBuilder(AuthProviderConfigFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new AuthProviderConfig(), validationEnabled);
    }
    public AuthProviderConfigBuilder(AuthProviderConfigFluent<?> fluent,AuthProviderConfig instance){
            this(fluent, instance, true);
    }
    public AuthProviderConfigBuilder(AuthProviderConfigFluent<?> fluent,AuthProviderConfig instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withConfig(instance.getConfig()); 
            fluent.withName(instance.getName()); 
            this.validationEnabled = validationEnabled; 
    }
    public AuthProviderConfigBuilder(AuthProviderConfig instance){
            this(instance,true);
    }
    public AuthProviderConfigBuilder(AuthProviderConfig instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withConfig(instance.getConfig()); 
            this.withName(instance.getName()); 
            this.validationEnabled = validationEnabled; 
    }
    public AuthProviderConfigBuilder(Validator validator){
            this(new AuthProviderConfig(), true);
    }
    public AuthProviderConfigBuilder(AuthProviderConfigFluent<?> fluent,AuthProviderConfig instance,Validator validator){
            this.fluent = fluent; 
            fluent.withConfig(instance.getConfig()); 
            fluent.withName(instance.getName()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public AuthProviderConfigBuilder(AuthProviderConfig instance,Validator validator){
            this.fluent = this; 
            this.withConfig(instance.getConfig()); 
            this.withName(instance.getName()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public AuthProviderConfig build(){
            AuthProviderConfig buildable = new AuthProviderConfig(fluent.getConfig(),fluent.getName());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            AuthProviderConfigBuilder that = (AuthProviderConfigBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
