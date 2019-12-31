package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ServiceListBuilder extends ServiceListFluentImpl<ServiceListBuilder> implements VisitableBuilder<ServiceList,ServiceListBuilder>{

    ServiceListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ServiceListBuilder(){
            this(true);
    }
    public ServiceListBuilder(Boolean validationEnabled){
            this(new ServiceList(), validationEnabled);
    }
    public ServiceListBuilder(ServiceListFluent<?> fluent){
            this(fluent, true);
    }
    public ServiceListBuilder(ServiceListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ServiceList(), validationEnabled);
    }
    public ServiceListBuilder(ServiceListFluent<?> fluent,ServiceList instance){
            this(fluent, instance, true);
    }
    public ServiceListBuilder(ServiceListFluent<?> fluent,ServiceList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public ServiceListBuilder(ServiceList instance){
            this(instance,true);
    }
    public ServiceListBuilder(ServiceList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public ServiceListBuilder(Validator validator){
            this(new ServiceList(), true);
    }
    public ServiceListBuilder(ServiceListFluent<?> fluent,ServiceList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ServiceListBuilder(ServiceList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ServiceList build(){
            ServiceList buildable = new ServiceList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ServiceListBuilder that = (ServiceListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
