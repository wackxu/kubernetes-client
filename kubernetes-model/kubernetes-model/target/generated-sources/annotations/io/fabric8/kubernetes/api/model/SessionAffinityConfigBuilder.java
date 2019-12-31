package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class SessionAffinityConfigBuilder extends SessionAffinityConfigFluentImpl<SessionAffinityConfigBuilder> implements VisitableBuilder<SessionAffinityConfig,SessionAffinityConfigBuilder>{

    SessionAffinityConfigFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public SessionAffinityConfigBuilder(){
            this(true);
    }
    public SessionAffinityConfigBuilder(Boolean validationEnabled){
            this(new SessionAffinityConfig(), validationEnabled);
    }
    public SessionAffinityConfigBuilder(SessionAffinityConfigFluent<?> fluent){
            this(fluent, true);
    }
    public SessionAffinityConfigBuilder(SessionAffinityConfigFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new SessionAffinityConfig(), validationEnabled);
    }
    public SessionAffinityConfigBuilder(SessionAffinityConfigFluent<?> fluent,SessionAffinityConfig instance){
            this(fluent, instance, true);
    }
    public SessionAffinityConfigBuilder(SessionAffinityConfigFluent<?> fluent,SessionAffinityConfig instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withClientIP(instance.getClientIP()); 
            this.validationEnabled = validationEnabled; 
    }
    public SessionAffinityConfigBuilder(SessionAffinityConfig instance){
            this(instance,true);
    }
    public SessionAffinityConfigBuilder(SessionAffinityConfig instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withClientIP(instance.getClientIP()); 
            this.validationEnabled = validationEnabled; 
    }
    public SessionAffinityConfigBuilder(Validator validator){
            this(new SessionAffinityConfig(), true);
    }
    public SessionAffinityConfigBuilder(SessionAffinityConfigFluent<?> fluent,SessionAffinityConfig instance,Validator validator){
            this.fluent = fluent; 
            fluent.withClientIP(instance.getClientIP()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public SessionAffinityConfigBuilder(SessionAffinityConfig instance,Validator validator){
            this.fluent = this; 
            this.withClientIP(instance.getClientIP()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public SessionAffinityConfig build(){
            SessionAffinityConfig buildable = new SessionAffinityConfig(fluent.getClientIP());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SessionAffinityConfigBuilder that = (SessionAffinityConfigBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
