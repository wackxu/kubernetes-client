package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class EndpointAddressBuilder extends EndpointAddressFluentImpl<EndpointAddressBuilder> implements VisitableBuilder<EndpointAddress,EndpointAddressBuilder>{

    EndpointAddressFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public EndpointAddressBuilder(){
            this(true);
    }
    public EndpointAddressBuilder(Boolean validationEnabled){
            this(new EndpointAddress(), validationEnabled);
    }
    public EndpointAddressBuilder(EndpointAddressFluent<?> fluent){
            this(fluent, true);
    }
    public EndpointAddressBuilder(EndpointAddressFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new EndpointAddress(), validationEnabled);
    }
    public EndpointAddressBuilder(EndpointAddressFluent<?> fluent,EndpointAddress instance){
            this(fluent, instance, true);
    }
    public EndpointAddressBuilder(EndpointAddressFluent<?> fluent,EndpointAddress instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withHostname(instance.getHostname()); 
            fluent.withIp(instance.getIp()); 
            fluent.withNodeName(instance.getNodeName()); 
            fluent.withTargetRef(instance.getTargetRef()); 
            this.validationEnabled = validationEnabled; 
    }
    public EndpointAddressBuilder(EndpointAddress instance){
            this(instance,true);
    }
    public EndpointAddressBuilder(EndpointAddress instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withHostname(instance.getHostname()); 
            this.withIp(instance.getIp()); 
            this.withNodeName(instance.getNodeName()); 
            this.withTargetRef(instance.getTargetRef()); 
            this.validationEnabled = validationEnabled; 
    }
    public EndpointAddressBuilder(Validator validator){
            this(new EndpointAddress(), true);
    }
    public EndpointAddressBuilder(EndpointAddressFluent<?> fluent,EndpointAddress instance,Validator validator){
            this.fluent = fluent; 
            fluent.withHostname(instance.getHostname()); 
            fluent.withIp(instance.getIp()); 
            fluent.withNodeName(instance.getNodeName()); 
            fluent.withTargetRef(instance.getTargetRef()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public EndpointAddressBuilder(EndpointAddress instance,Validator validator){
            this.fluent = this; 
            this.withHostname(instance.getHostname()); 
            this.withIp(instance.getIp()); 
            this.withNodeName(instance.getNodeName()); 
            this.withTargetRef(instance.getTargetRef()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public EndpointAddress build(){
            EndpointAddress buildable = new EndpointAddress(fluent.getHostname(),fluent.getIp(),fluent.getNodeName(),fluent.getTargetRef());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            EndpointAddressBuilder that = (EndpointAddressBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
