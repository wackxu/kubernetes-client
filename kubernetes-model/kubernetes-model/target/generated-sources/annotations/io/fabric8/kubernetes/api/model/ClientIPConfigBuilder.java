package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ClientIPConfigBuilder extends ClientIPConfigFluentImpl<ClientIPConfigBuilder> implements VisitableBuilder<ClientIPConfig,ClientIPConfigBuilder>{

    ClientIPConfigFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ClientIPConfigBuilder(){
            this(true);
    }
    public ClientIPConfigBuilder(Boolean validationEnabled){
            this(new ClientIPConfig(), validationEnabled);
    }
    public ClientIPConfigBuilder(ClientIPConfigFluent<?> fluent){
            this(fluent, true);
    }
    public ClientIPConfigBuilder(ClientIPConfigFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ClientIPConfig(), validationEnabled);
    }
    public ClientIPConfigBuilder(ClientIPConfigFluent<?> fluent,ClientIPConfig instance){
            this(fluent, instance, true);
    }
    public ClientIPConfigBuilder(ClientIPConfigFluent<?> fluent,ClientIPConfig instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withTimeoutSeconds(instance.getTimeoutSeconds()); 
            this.validationEnabled = validationEnabled; 
    }
    public ClientIPConfigBuilder(ClientIPConfig instance){
            this(instance,true);
    }
    public ClientIPConfigBuilder(ClientIPConfig instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withTimeoutSeconds(instance.getTimeoutSeconds()); 
            this.validationEnabled = validationEnabled; 
    }
    public ClientIPConfigBuilder(Validator validator){
            this(new ClientIPConfig(), true);
    }
    public ClientIPConfigBuilder(ClientIPConfigFluent<?> fluent,ClientIPConfig instance,Validator validator){
            this.fluent = fluent; 
            fluent.withTimeoutSeconds(instance.getTimeoutSeconds()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ClientIPConfigBuilder(ClientIPConfig instance,Validator validator){
            this.fluent = this; 
            this.withTimeoutSeconds(instance.getTimeoutSeconds()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ClientIPConfig build(){
            ClientIPConfig buildable = new ClientIPConfig(fluent.getTimeoutSeconds());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ClientIPConfigBuilder that = (ClientIPConfigBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
