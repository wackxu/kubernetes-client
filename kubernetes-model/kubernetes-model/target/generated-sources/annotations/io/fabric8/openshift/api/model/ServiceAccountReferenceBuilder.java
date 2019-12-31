package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ServiceAccountReferenceBuilder extends ServiceAccountReferenceFluentImpl<ServiceAccountReferenceBuilder> implements VisitableBuilder<ServiceAccountReference,ServiceAccountReferenceBuilder>{

    ServiceAccountReferenceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ServiceAccountReferenceBuilder(){
            this(true);
    }
    public ServiceAccountReferenceBuilder(Boolean validationEnabled){
            this(new ServiceAccountReference(), validationEnabled);
    }
    public ServiceAccountReferenceBuilder(ServiceAccountReferenceFluent<?> fluent){
            this(fluent, true);
    }
    public ServiceAccountReferenceBuilder(ServiceAccountReferenceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ServiceAccountReference(), validationEnabled);
    }
    public ServiceAccountReferenceBuilder(ServiceAccountReferenceFluent<?> fluent,ServiceAccountReference instance){
            this(fluent, instance, true);
    }
    public ServiceAccountReferenceBuilder(ServiceAccountReferenceFluent<?> fluent,ServiceAccountReference instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withName(instance.getName()); 
            fluent.withNamespace(instance.getNamespace()); 
            this.validationEnabled = validationEnabled; 
    }
    public ServiceAccountReferenceBuilder(ServiceAccountReference instance){
            this(instance,true);
    }
    public ServiceAccountReferenceBuilder(ServiceAccountReference instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withName(instance.getName()); 
            this.withNamespace(instance.getNamespace()); 
            this.validationEnabled = validationEnabled; 
    }
    public ServiceAccountReferenceBuilder(Validator validator){
            this(new ServiceAccountReference(), true);
    }
    public ServiceAccountReferenceBuilder(ServiceAccountReferenceFluent<?> fluent,ServiceAccountReference instance,Validator validator){
            this.fluent = fluent; 
            fluent.withName(instance.getName()); 
            fluent.withNamespace(instance.getNamespace()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ServiceAccountReferenceBuilder(ServiceAccountReference instance,Validator validator){
            this.fluent = this; 
            this.withName(instance.getName()); 
            this.withNamespace(instance.getNamespace()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ServiceAccountReference build(){
            ServiceAccountReference buildable = new ServiceAccountReference(fluent.getName(),fluent.getNamespace());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ServiceAccountReferenceBuilder that = (ServiceAccountReferenceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
