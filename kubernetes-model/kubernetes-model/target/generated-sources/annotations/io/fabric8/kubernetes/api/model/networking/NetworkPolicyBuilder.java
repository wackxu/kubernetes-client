package io.fabric8.kubernetes.api.model.networking;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class NetworkPolicyBuilder extends NetworkPolicyFluentImpl<NetworkPolicyBuilder> implements VisitableBuilder<NetworkPolicy,NetworkPolicyBuilder>{

    NetworkPolicyFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public NetworkPolicyBuilder(){
            this(true);
    }
    public NetworkPolicyBuilder(Boolean validationEnabled){
            this(new NetworkPolicy(), validationEnabled);
    }
    public NetworkPolicyBuilder(NetworkPolicyFluent<?> fluent){
            this(fluent, true);
    }
    public NetworkPolicyBuilder(NetworkPolicyFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new NetworkPolicy(), validationEnabled);
    }
    public NetworkPolicyBuilder(NetworkPolicyFluent<?> fluent,NetworkPolicy instance){
            this(fluent, instance, true);
    }
    public NetworkPolicyBuilder(NetworkPolicyFluent<?> fluent,NetworkPolicy instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            this.validationEnabled = validationEnabled; 
    }
    public NetworkPolicyBuilder(NetworkPolicy instance){
            this(instance,true);
    }
    public NetworkPolicyBuilder(NetworkPolicy instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.validationEnabled = validationEnabled; 
    }
    public NetworkPolicyBuilder(Validator validator){
            this(new NetworkPolicy(), true);
    }
    public NetworkPolicyBuilder(NetworkPolicyFluent<?> fluent,NetworkPolicy instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public NetworkPolicyBuilder(NetworkPolicy instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public NetworkPolicy build(){
            NetworkPolicy buildable = new NetworkPolicy(fluent.getApiVersion(),fluent.getKind(),fluent.getMetadata(),fluent.getSpec());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NetworkPolicyBuilder that = (NetworkPolicyBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
