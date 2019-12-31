package io.fabric8.kubernetes.api.model.networking;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class NetworkPolicyIngressRuleBuilder extends NetworkPolicyIngressRuleFluentImpl<NetworkPolicyIngressRuleBuilder> implements VisitableBuilder<NetworkPolicyIngressRule,NetworkPolicyIngressRuleBuilder>{

    NetworkPolicyIngressRuleFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public NetworkPolicyIngressRuleBuilder(){
            this(true);
    }
    public NetworkPolicyIngressRuleBuilder(Boolean validationEnabled){
            this(new NetworkPolicyIngressRule(), validationEnabled);
    }
    public NetworkPolicyIngressRuleBuilder(NetworkPolicyIngressRuleFluent<?> fluent){
            this(fluent, true);
    }
    public NetworkPolicyIngressRuleBuilder(NetworkPolicyIngressRuleFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new NetworkPolicyIngressRule(), validationEnabled);
    }
    public NetworkPolicyIngressRuleBuilder(NetworkPolicyIngressRuleFluent<?> fluent,NetworkPolicyIngressRule instance){
            this(fluent, instance, true);
    }
    public NetworkPolicyIngressRuleBuilder(NetworkPolicyIngressRuleFluent<?> fluent,NetworkPolicyIngressRule instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withFrom(instance.getFrom()); 
            fluent.withPorts(instance.getPorts()); 
            this.validationEnabled = validationEnabled; 
    }
    public NetworkPolicyIngressRuleBuilder(NetworkPolicyIngressRule instance){
            this(instance,true);
    }
    public NetworkPolicyIngressRuleBuilder(NetworkPolicyIngressRule instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withFrom(instance.getFrom()); 
            this.withPorts(instance.getPorts()); 
            this.validationEnabled = validationEnabled; 
    }
    public NetworkPolicyIngressRuleBuilder(Validator validator){
            this(new NetworkPolicyIngressRule(), true);
    }
    public NetworkPolicyIngressRuleBuilder(NetworkPolicyIngressRuleFluent<?> fluent,NetworkPolicyIngressRule instance,Validator validator){
            this.fluent = fluent; 
            fluent.withFrom(instance.getFrom()); 
            fluent.withPorts(instance.getPorts()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public NetworkPolicyIngressRuleBuilder(NetworkPolicyIngressRule instance,Validator validator){
            this.fluent = this; 
            this.withFrom(instance.getFrom()); 
            this.withPorts(instance.getPorts()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public NetworkPolicyIngressRule build(){
            NetworkPolicyIngressRule buildable = new NetworkPolicyIngressRule(fluent.getFrom(),fluent.getPorts());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NetworkPolicyIngressRuleBuilder that = (NetworkPolicyIngressRuleBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
