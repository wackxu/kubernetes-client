package io.fabric8.kubernetes.api.model.networking;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class NetworkPolicyPeerBuilder extends NetworkPolicyPeerFluentImpl<NetworkPolicyPeerBuilder> implements VisitableBuilder<NetworkPolicyPeer,NetworkPolicyPeerBuilder>{

    NetworkPolicyPeerFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public NetworkPolicyPeerBuilder(){
            this(true);
    }
    public NetworkPolicyPeerBuilder(Boolean validationEnabled){
            this(new NetworkPolicyPeer(), validationEnabled);
    }
    public NetworkPolicyPeerBuilder(NetworkPolicyPeerFluent<?> fluent){
            this(fluent, true);
    }
    public NetworkPolicyPeerBuilder(NetworkPolicyPeerFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new NetworkPolicyPeer(), validationEnabled);
    }
    public NetworkPolicyPeerBuilder(NetworkPolicyPeerFluent<?> fluent,NetworkPolicyPeer instance){
            this(fluent, instance, true);
    }
    public NetworkPolicyPeerBuilder(NetworkPolicyPeerFluent<?> fluent,NetworkPolicyPeer instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withIpBlock(instance.getIpBlock()); 
            fluent.withNamespaceSelector(instance.getNamespaceSelector()); 
            fluent.withPodSelector(instance.getPodSelector()); 
            this.validationEnabled = validationEnabled; 
    }
    public NetworkPolicyPeerBuilder(NetworkPolicyPeer instance){
            this(instance,true);
    }
    public NetworkPolicyPeerBuilder(NetworkPolicyPeer instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withIpBlock(instance.getIpBlock()); 
            this.withNamespaceSelector(instance.getNamespaceSelector()); 
            this.withPodSelector(instance.getPodSelector()); 
            this.validationEnabled = validationEnabled; 
    }
    public NetworkPolicyPeerBuilder(Validator validator){
            this(new NetworkPolicyPeer(), true);
    }
    public NetworkPolicyPeerBuilder(NetworkPolicyPeerFluent<?> fluent,NetworkPolicyPeer instance,Validator validator){
            this.fluent = fluent; 
            fluent.withIpBlock(instance.getIpBlock()); 
            fluent.withNamespaceSelector(instance.getNamespaceSelector()); 
            fluent.withPodSelector(instance.getPodSelector()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public NetworkPolicyPeerBuilder(NetworkPolicyPeer instance,Validator validator){
            this.fluent = this; 
            this.withIpBlock(instance.getIpBlock()); 
            this.withNamespaceSelector(instance.getNamespaceSelector()); 
            this.withPodSelector(instance.getPodSelector()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public NetworkPolicyPeer build(){
            NetworkPolicyPeer buildable = new NetworkPolicyPeer(fluent.getIpBlock(),fluent.getNamespaceSelector(),fluent.getPodSelector());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NetworkPolicyPeerBuilder that = (NetworkPolicyPeerBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
