package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ServiceAccountListBuilder extends ServiceAccountListFluentImpl<ServiceAccountListBuilder> implements VisitableBuilder<ServiceAccountList,ServiceAccountListBuilder>{

    ServiceAccountListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ServiceAccountListBuilder(){
            this(true);
    }
    public ServiceAccountListBuilder(Boolean validationEnabled){
            this(new ServiceAccountList(), validationEnabled);
    }
    public ServiceAccountListBuilder(ServiceAccountListFluent<?> fluent){
            this(fluent, true);
    }
    public ServiceAccountListBuilder(ServiceAccountListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ServiceAccountList(), validationEnabled);
    }
    public ServiceAccountListBuilder(ServiceAccountListFluent<?> fluent,ServiceAccountList instance){
            this(fluent, instance, true);
    }
    public ServiceAccountListBuilder(ServiceAccountListFluent<?> fluent,ServiceAccountList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public ServiceAccountListBuilder(ServiceAccountList instance){
            this(instance,true);
    }
    public ServiceAccountListBuilder(ServiceAccountList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public ServiceAccountListBuilder(Validator validator){
            this(new ServiceAccountList(), true);
    }
    public ServiceAccountListBuilder(ServiceAccountListFluent<?> fluent,ServiceAccountList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ServiceAccountListBuilder(ServiceAccountList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ServiceAccountList build(){
            ServiceAccountList buildable = new ServiceAccountList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ServiceAccountListBuilder that = (ServiceAccountListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
