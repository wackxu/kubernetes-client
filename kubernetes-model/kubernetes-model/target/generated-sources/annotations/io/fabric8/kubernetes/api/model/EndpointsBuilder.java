package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class EndpointsBuilder extends EndpointsFluentImpl<EndpointsBuilder> implements VisitableBuilder<Endpoints,EndpointsBuilder>{

    EndpointsFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public EndpointsBuilder(){
            this(true);
    }
    public EndpointsBuilder(Boolean validationEnabled){
            this(new Endpoints(), validationEnabled);
    }
    public EndpointsBuilder(EndpointsFluent<?> fluent){
            this(fluent, true);
    }
    public EndpointsBuilder(EndpointsFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new Endpoints(), validationEnabled);
    }
    public EndpointsBuilder(EndpointsFluent<?> fluent,Endpoints instance){
            this(fluent, instance, true);
    }
    public EndpointsBuilder(EndpointsFluent<?> fluent,Endpoints instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSubsets(instance.getSubsets()); 
            this.validationEnabled = validationEnabled; 
    }
    public EndpointsBuilder(Endpoints instance){
            this(instance,true);
    }
    public EndpointsBuilder(Endpoints instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSubsets(instance.getSubsets()); 
            this.validationEnabled = validationEnabled; 
    }
    public EndpointsBuilder(Validator validator){
            this(new Endpoints(), true);
    }
    public EndpointsBuilder(EndpointsFluent<?> fluent,Endpoints instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSubsets(instance.getSubsets()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public EndpointsBuilder(Endpoints instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSubsets(instance.getSubsets()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public Endpoints build(){
            Endpoints buildable = new Endpoints(fluent.getApiVersion(),fluent.getKind(),fluent.getMetadata(),fluent.getSubsets());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            EndpointsBuilder that = (EndpointsBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
