package io.fabric8.kubernetes.api.model.networking;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class NetworkPolicyListBuilder extends NetworkPolicyListFluentImpl<NetworkPolicyListBuilder> implements VisitableBuilder<NetworkPolicyList,NetworkPolicyListBuilder>{

    NetworkPolicyListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public NetworkPolicyListBuilder(){
            this(true);
    }
    public NetworkPolicyListBuilder(Boolean validationEnabled){
            this(new NetworkPolicyList(), validationEnabled);
    }
    public NetworkPolicyListBuilder(NetworkPolicyListFluent<?> fluent){
            this(fluent, true);
    }
    public NetworkPolicyListBuilder(NetworkPolicyListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new NetworkPolicyList(), validationEnabled);
    }
    public NetworkPolicyListBuilder(NetworkPolicyListFluent<?> fluent,NetworkPolicyList instance){
            this(fluent, instance, true);
    }
    public NetworkPolicyListBuilder(NetworkPolicyListFluent<?> fluent,NetworkPolicyList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public NetworkPolicyListBuilder(NetworkPolicyList instance){
            this(instance,true);
    }
    public NetworkPolicyListBuilder(NetworkPolicyList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public NetworkPolicyListBuilder(Validator validator){
            this(new NetworkPolicyList(), true);
    }
    public NetworkPolicyListBuilder(NetworkPolicyListFluent<?> fluent,NetworkPolicyList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public NetworkPolicyListBuilder(NetworkPolicyList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public NetworkPolicyList build(){
            NetworkPolicyList buildable = new NetworkPolicyList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NetworkPolicyListBuilder that = (NetworkPolicyListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
