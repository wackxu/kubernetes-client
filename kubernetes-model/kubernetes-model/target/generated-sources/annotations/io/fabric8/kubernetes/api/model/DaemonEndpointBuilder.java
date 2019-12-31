package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class DaemonEndpointBuilder extends DaemonEndpointFluentImpl<DaemonEndpointBuilder> implements VisitableBuilder<DaemonEndpoint,DaemonEndpointBuilder>{

    DaemonEndpointFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public DaemonEndpointBuilder(){
            this(true);
    }
    public DaemonEndpointBuilder(Boolean validationEnabled){
            this(new DaemonEndpoint(), validationEnabled);
    }
    public DaemonEndpointBuilder(DaemonEndpointFluent<?> fluent){
            this(fluent, true);
    }
    public DaemonEndpointBuilder(DaemonEndpointFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new DaemonEndpoint(), validationEnabled);
    }
    public DaemonEndpointBuilder(DaemonEndpointFluent<?> fluent,DaemonEndpoint instance){
            this(fluent, instance, true);
    }
    public DaemonEndpointBuilder(DaemonEndpointFluent<?> fluent,DaemonEndpoint instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withPort(instance.getPort()); 
            this.validationEnabled = validationEnabled; 
    }
    public DaemonEndpointBuilder(DaemonEndpoint instance){
            this(instance,true);
    }
    public DaemonEndpointBuilder(DaemonEndpoint instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withPort(instance.getPort()); 
            this.validationEnabled = validationEnabled; 
    }
    public DaemonEndpointBuilder(Validator validator){
            this(new DaemonEndpoint(), true);
    }
    public DaemonEndpointBuilder(DaemonEndpointFluent<?> fluent,DaemonEndpoint instance,Validator validator){
            this.fluent = fluent; 
            fluent.withPort(instance.getPort()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public DaemonEndpointBuilder(DaemonEndpoint instance,Validator validator){
            this.fluent = this; 
            this.withPort(instance.getPort()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public DaemonEndpoint build(){
            DaemonEndpoint buildable = new DaemonEndpoint(fluent.getPort());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DaemonEndpointBuilder that = (DaemonEndpointBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
