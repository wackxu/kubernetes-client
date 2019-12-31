package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class EndpointsListBuilder extends EndpointsListFluentImpl<EndpointsListBuilder> implements VisitableBuilder<EndpointsList,EndpointsListBuilder>{

    EndpointsListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public EndpointsListBuilder(){
            this(true);
    }
    public EndpointsListBuilder(Boolean validationEnabled){
            this(new EndpointsList(), validationEnabled);
    }
    public EndpointsListBuilder(EndpointsListFluent<?> fluent){
            this(fluent, true);
    }
    public EndpointsListBuilder(EndpointsListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new EndpointsList(), validationEnabled);
    }
    public EndpointsListBuilder(EndpointsListFluent<?> fluent,EndpointsList instance){
            this(fluent, instance, true);
    }
    public EndpointsListBuilder(EndpointsListFluent<?> fluent,EndpointsList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public EndpointsListBuilder(EndpointsList instance){
            this(instance,true);
    }
    public EndpointsListBuilder(EndpointsList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public EndpointsListBuilder(Validator validator){
            this(new EndpointsList(), true);
    }
    public EndpointsListBuilder(EndpointsListFluent<?> fluent,EndpointsList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public EndpointsListBuilder(EndpointsList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public EndpointsList build(){
            EndpointsList buildable = new EndpointsList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            EndpointsListBuilder that = (EndpointsListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
