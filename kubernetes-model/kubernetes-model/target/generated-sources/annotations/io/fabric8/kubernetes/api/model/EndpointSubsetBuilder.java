package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class EndpointSubsetBuilder extends EndpointSubsetFluentImpl<EndpointSubsetBuilder> implements VisitableBuilder<EndpointSubset,EndpointSubsetBuilder>{

    EndpointSubsetFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public EndpointSubsetBuilder(){
            this(true);
    }
    public EndpointSubsetBuilder(Boolean validationEnabled){
            this(new EndpointSubset(), validationEnabled);
    }
    public EndpointSubsetBuilder(EndpointSubsetFluent<?> fluent){
            this(fluent, true);
    }
    public EndpointSubsetBuilder(EndpointSubsetFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new EndpointSubset(), validationEnabled);
    }
    public EndpointSubsetBuilder(EndpointSubsetFluent<?> fluent,EndpointSubset instance){
            this(fluent, instance, true);
    }
    public EndpointSubsetBuilder(EndpointSubsetFluent<?> fluent,EndpointSubset instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAddresses(instance.getAddresses()); 
            fluent.withNotReadyAddresses(instance.getNotReadyAddresses()); 
            fluent.withPorts(instance.getPorts()); 
            this.validationEnabled = validationEnabled; 
    }
    public EndpointSubsetBuilder(EndpointSubset instance){
            this(instance,true);
    }
    public EndpointSubsetBuilder(EndpointSubset instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAddresses(instance.getAddresses()); 
            this.withNotReadyAddresses(instance.getNotReadyAddresses()); 
            this.withPorts(instance.getPorts()); 
            this.validationEnabled = validationEnabled; 
    }
    public EndpointSubsetBuilder(Validator validator){
            this(new EndpointSubset(), true);
    }
    public EndpointSubsetBuilder(EndpointSubsetFluent<?> fluent,EndpointSubset instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAddresses(instance.getAddresses()); 
            fluent.withNotReadyAddresses(instance.getNotReadyAddresses()); 
            fluent.withPorts(instance.getPorts()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public EndpointSubsetBuilder(EndpointSubset instance,Validator validator){
            this.fluent = this; 
            this.withAddresses(instance.getAddresses()); 
            this.withNotReadyAddresses(instance.getNotReadyAddresses()); 
            this.withPorts(instance.getPorts()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public EndpointSubset build(){
            EndpointSubset buildable = new EndpointSubset(fluent.getAddresses(),fluent.getNotReadyAddresses(),fluent.getPorts());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            EndpointSubsetBuilder that = (EndpointSubsetBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
