package io.fabric8.kubernetes.api.model.networking;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class NetworkPolicySpecBuilder extends NetworkPolicySpecFluentImpl<NetworkPolicySpecBuilder> implements VisitableBuilder<NetworkPolicySpec,NetworkPolicySpecBuilder>{

    NetworkPolicySpecFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public NetworkPolicySpecBuilder(){
            this(true);
    }
    public NetworkPolicySpecBuilder(Boolean validationEnabled){
            this(new NetworkPolicySpec(), validationEnabled);
    }
    public NetworkPolicySpecBuilder(NetworkPolicySpecFluent<?> fluent){
            this(fluent, true);
    }
    public NetworkPolicySpecBuilder(NetworkPolicySpecFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new NetworkPolicySpec(), validationEnabled);
    }
    public NetworkPolicySpecBuilder(NetworkPolicySpecFluent<?> fluent,NetworkPolicySpec instance){
            this(fluent, instance, true);
    }
    public NetworkPolicySpecBuilder(NetworkPolicySpecFluent<?> fluent,NetworkPolicySpec instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withEgress(instance.getEgress()); 
            fluent.withIngress(instance.getIngress()); 
            fluent.withPodSelector(instance.getPodSelector()); 
            fluent.withPolicyTypes(instance.getPolicyTypes()); 
            this.validationEnabled = validationEnabled; 
    }
    public NetworkPolicySpecBuilder(NetworkPolicySpec instance){
            this(instance,true);
    }
    public NetworkPolicySpecBuilder(NetworkPolicySpec instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withEgress(instance.getEgress()); 
            this.withIngress(instance.getIngress()); 
            this.withPodSelector(instance.getPodSelector()); 
            this.withPolicyTypes(instance.getPolicyTypes()); 
            this.validationEnabled = validationEnabled; 
    }
    public NetworkPolicySpecBuilder(Validator validator){
            this(new NetworkPolicySpec(), true);
    }
    public NetworkPolicySpecBuilder(NetworkPolicySpecFluent<?> fluent,NetworkPolicySpec instance,Validator validator){
            this.fluent = fluent; 
            fluent.withEgress(instance.getEgress()); 
            fluent.withIngress(instance.getIngress()); 
            fluent.withPodSelector(instance.getPodSelector()); 
            fluent.withPolicyTypes(instance.getPolicyTypes()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public NetworkPolicySpecBuilder(NetworkPolicySpec instance,Validator validator){
            this.fluent = this; 
            this.withEgress(instance.getEgress()); 
            this.withIngress(instance.getIngress()); 
            this.withPodSelector(instance.getPodSelector()); 
            this.withPolicyTypes(instance.getPolicyTypes()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public NetworkPolicySpec build(){
            NetworkPolicySpec buildable = new NetworkPolicySpec(fluent.getEgress(),fluent.getIngress(),fluent.getPodSelector(),fluent.getPolicyTypes());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NetworkPolicySpecBuilder that = (NetworkPolicySpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
