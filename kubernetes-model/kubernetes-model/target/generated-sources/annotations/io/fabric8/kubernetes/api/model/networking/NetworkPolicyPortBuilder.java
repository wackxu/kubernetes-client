package io.fabric8.kubernetes.api.model.networking;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class NetworkPolicyPortBuilder extends NetworkPolicyPortFluentImpl<NetworkPolicyPortBuilder> implements VisitableBuilder<NetworkPolicyPort,NetworkPolicyPortBuilder>{

    NetworkPolicyPortFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public NetworkPolicyPortBuilder(){
            this(true);
    }
    public NetworkPolicyPortBuilder(Boolean validationEnabled){
            this(new NetworkPolicyPort(), validationEnabled);
    }
    public NetworkPolicyPortBuilder(NetworkPolicyPortFluent<?> fluent){
            this(fluent, true);
    }
    public NetworkPolicyPortBuilder(NetworkPolicyPortFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new NetworkPolicyPort(), validationEnabled);
    }
    public NetworkPolicyPortBuilder(NetworkPolicyPortFluent<?> fluent,NetworkPolicyPort instance){
            this(fluent, instance, true);
    }
    public NetworkPolicyPortBuilder(NetworkPolicyPortFluent<?> fluent,NetworkPolicyPort instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withPort(instance.getPort()); 
            fluent.withProtocol(instance.getProtocol()); 
            this.validationEnabled = validationEnabled; 
    }
    public NetworkPolicyPortBuilder(NetworkPolicyPort instance){
            this(instance,true);
    }
    public NetworkPolicyPortBuilder(NetworkPolicyPort instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withPort(instance.getPort()); 
            this.withProtocol(instance.getProtocol()); 
            this.validationEnabled = validationEnabled; 
    }
    public NetworkPolicyPortBuilder(Validator validator){
            this(new NetworkPolicyPort(), true);
    }
    public NetworkPolicyPortBuilder(NetworkPolicyPortFluent<?> fluent,NetworkPolicyPort instance,Validator validator){
            this.fluent = fluent; 
            fluent.withPort(instance.getPort()); 
            fluent.withProtocol(instance.getProtocol()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public NetworkPolicyPortBuilder(NetworkPolicyPort instance,Validator validator){
            this.fluent = this; 
            this.withPort(instance.getPort()); 
            this.withProtocol(instance.getProtocol()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public NetworkPolicyPort build(){
            NetworkPolicyPort buildable = new NetworkPolicyPort(fluent.getPort(),fluent.getProtocol());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NetworkPolicyPortBuilder that = (NetworkPolicyPortBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
