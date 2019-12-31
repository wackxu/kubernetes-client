package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class EndpointPortBuilder extends EndpointPortFluentImpl<EndpointPortBuilder> implements VisitableBuilder<EndpointPort,EndpointPortBuilder>{

    EndpointPortFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public EndpointPortBuilder(){
            this(true);
    }
    public EndpointPortBuilder(Boolean validationEnabled){
            this(new EndpointPort(), validationEnabled);
    }
    public EndpointPortBuilder(EndpointPortFluent<?> fluent){
            this(fluent, true);
    }
    public EndpointPortBuilder(EndpointPortFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new EndpointPort(), validationEnabled);
    }
    public EndpointPortBuilder(EndpointPortFluent<?> fluent,EndpointPort instance){
            this(fluent, instance, true);
    }
    public EndpointPortBuilder(EndpointPortFluent<?> fluent,EndpointPort instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withName(instance.getName()); 
            fluent.withPort(instance.getPort()); 
            fluent.withProtocol(instance.getProtocol()); 
            this.validationEnabled = validationEnabled; 
    }
    public EndpointPortBuilder(EndpointPort instance){
            this(instance,true);
    }
    public EndpointPortBuilder(EndpointPort instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withName(instance.getName()); 
            this.withPort(instance.getPort()); 
            this.withProtocol(instance.getProtocol()); 
            this.validationEnabled = validationEnabled; 
    }
    public EndpointPortBuilder(Validator validator){
            this(new EndpointPort(), true);
    }
    public EndpointPortBuilder(EndpointPortFluent<?> fluent,EndpointPort instance,Validator validator){
            this.fluent = fluent; 
            fluent.withName(instance.getName()); 
            fluent.withPort(instance.getPort()); 
            fluent.withProtocol(instance.getProtocol()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public EndpointPortBuilder(EndpointPort instance,Validator validator){
            this.fluent = this; 
            this.withName(instance.getName()); 
            this.withPort(instance.getPort()); 
            this.withProtocol(instance.getProtocol()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public EndpointPort build(){
            EndpointPort buildable = new EndpointPort(fluent.getName(),fluent.getPort(),fluent.getProtocol());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            EndpointPortBuilder that = (EndpointPortBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
