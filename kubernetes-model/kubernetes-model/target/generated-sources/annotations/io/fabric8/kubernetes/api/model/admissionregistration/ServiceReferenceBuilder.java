package io.fabric8.kubernetes.api.model.admissionregistration;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ServiceReferenceBuilder extends ServiceReferenceFluentImpl<ServiceReferenceBuilder> implements VisitableBuilder<ServiceReference,ServiceReferenceBuilder>{

    ServiceReferenceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ServiceReferenceBuilder(){
            this(true);
    }
    public ServiceReferenceBuilder(Boolean validationEnabled){
            this(new ServiceReference(), validationEnabled);
    }
    public ServiceReferenceBuilder(ServiceReferenceFluent<?> fluent){
            this(fluent, true);
    }
    public ServiceReferenceBuilder(ServiceReferenceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ServiceReference(), validationEnabled);
    }
    public ServiceReferenceBuilder(ServiceReferenceFluent<?> fluent,ServiceReference instance){
            this(fluent, instance, true);
    }
    public ServiceReferenceBuilder(ServiceReferenceFluent<?> fluent,ServiceReference instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withName(instance.getName()); 
            fluent.withNamespace(instance.getNamespace()); 
            fluent.withPath(instance.getPath()); 
            this.validationEnabled = validationEnabled; 
    }
    public ServiceReferenceBuilder(ServiceReference instance){
            this(instance,true);
    }
    public ServiceReferenceBuilder(ServiceReference instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withName(instance.getName()); 
            this.withNamespace(instance.getNamespace()); 
            this.withPath(instance.getPath()); 
            this.validationEnabled = validationEnabled; 
    }
    public ServiceReferenceBuilder(Validator validator){
            this(new ServiceReference(), true);
    }
    public ServiceReferenceBuilder(ServiceReferenceFluent<?> fluent,ServiceReference instance,Validator validator){
            this.fluent = fluent; 
            fluent.withName(instance.getName()); 
            fluent.withNamespace(instance.getNamespace()); 
            fluent.withPath(instance.getPath()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ServiceReferenceBuilder(ServiceReference instance,Validator validator){
            this.fluent = this; 
            this.withName(instance.getName()); 
            this.withNamespace(instance.getNamespace()); 
            this.withPath(instance.getPath()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ServiceReference build(){
            ServiceReference buildable = new ServiceReference(fluent.getName(),fluent.getNamespace(),fluent.getPath());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ServiceReferenceBuilder that = (ServiceReferenceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
