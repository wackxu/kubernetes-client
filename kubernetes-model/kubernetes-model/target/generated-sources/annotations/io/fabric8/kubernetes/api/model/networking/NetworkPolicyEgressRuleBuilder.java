package io.fabric8.kubernetes.api.model.networking;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class NetworkPolicyEgressRuleBuilder extends NetworkPolicyEgressRuleFluentImpl<NetworkPolicyEgressRuleBuilder> implements VisitableBuilder<NetworkPolicyEgressRule,NetworkPolicyEgressRuleBuilder>{

    NetworkPolicyEgressRuleFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public NetworkPolicyEgressRuleBuilder(){
            this(true);
    }
    public NetworkPolicyEgressRuleBuilder(Boolean validationEnabled){
            this(new NetworkPolicyEgressRule(), validationEnabled);
    }
    public NetworkPolicyEgressRuleBuilder(NetworkPolicyEgressRuleFluent<?> fluent){
            this(fluent, true);
    }
    public NetworkPolicyEgressRuleBuilder(NetworkPolicyEgressRuleFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new NetworkPolicyEgressRule(), validationEnabled);
    }
    public NetworkPolicyEgressRuleBuilder(NetworkPolicyEgressRuleFluent<?> fluent,NetworkPolicyEgressRule instance){
            this(fluent, instance, true);
    }
    public NetworkPolicyEgressRuleBuilder(NetworkPolicyEgressRuleFluent<?> fluent,NetworkPolicyEgressRule instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withPorts(instance.getPorts()); 
            fluent.withTo(instance.getTo()); 
            this.validationEnabled = validationEnabled; 
    }
    public NetworkPolicyEgressRuleBuilder(NetworkPolicyEgressRule instance){
            this(instance,true);
    }
    public NetworkPolicyEgressRuleBuilder(NetworkPolicyEgressRule instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withPorts(instance.getPorts()); 
            this.withTo(instance.getTo()); 
            this.validationEnabled = validationEnabled; 
    }
    public NetworkPolicyEgressRuleBuilder(Validator validator){
            this(new NetworkPolicyEgressRule(), true);
    }
    public NetworkPolicyEgressRuleBuilder(NetworkPolicyEgressRuleFluent<?> fluent,NetworkPolicyEgressRule instance,Validator validator){
            this.fluent = fluent; 
            fluent.withPorts(instance.getPorts()); 
            fluent.withTo(instance.getTo()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public NetworkPolicyEgressRuleBuilder(NetworkPolicyEgressRule instance,Validator validator){
            this.fluent = this; 
            this.withPorts(instance.getPorts()); 
            this.withTo(instance.getTo()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public NetworkPolicyEgressRule build(){
            NetworkPolicyEgressRule buildable = new NetworkPolicyEgressRule(fluent.getPorts(),fluent.getTo());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NetworkPolicyEgressRuleBuilder that = (NetworkPolicyEgressRuleBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
