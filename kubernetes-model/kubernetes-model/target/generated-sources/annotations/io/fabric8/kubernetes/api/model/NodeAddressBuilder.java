package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class NodeAddressBuilder extends NodeAddressFluentImpl<NodeAddressBuilder> implements VisitableBuilder<NodeAddress,NodeAddressBuilder>{

    NodeAddressFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public NodeAddressBuilder(){
            this(true);
    }
    public NodeAddressBuilder(Boolean validationEnabled){
            this(new NodeAddress(), validationEnabled);
    }
    public NodeAddressBuilder(NodeAddressFluent<?> fluent){
            this(fluent, true);
    }
    public NodeAddressBuilder(NodeAddressFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new NodeAddress(), validationEnabled);
    }
    public NodeAddressBuilder(NodeAddressFluent<?> fluent,NodeAddress instance){
            this(fluent, instance, true);
    }
    public NodeAddressBuilder(NodeAddressFluent<?> fluent,NodeAddress instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAddress(instance.getAddress()); 
            fluent.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public NodeAddressBuilder(NodeAddress instance){
            this(instance,true);
    }
    public NodeAddressBuilder(NodeAddress instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAddress(instance.getAddress()); 
            this.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public NodeAddressBuilder(Validator validator){
            this(new NodeAddress(), true);
    }
    public NodeAddressBuilder(NodeAddressFluent<?> fluent,NodeAddress instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAddress(instance.getAddress()); 
            fluent.withType(instance.getType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public NodeAddressBuilder(NodeAddress instance,Validator validator){
            this.fluent = this; 
            this.withAddress(instance.getAddress()); 
            this.withType(instance.getType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public NodeAddress build(){
            NodeAddress buildable = new NodeAddress(fluent.getAddress(),fluent.getType());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NodeAddressBuilder that = (NodeAddressBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
