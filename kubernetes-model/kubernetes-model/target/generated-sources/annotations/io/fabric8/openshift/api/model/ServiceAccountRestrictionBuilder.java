package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ServiceAccountRestrictionBuilder extends ServiceAccountRestrictionFluentImpl<ServiceAccountRestrictionBuilder> implements VisitableBuilder<ServiceAccountRestriction,ServiceAccountRestrictionBuilder>{

    ServiceAccountRestrictionFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ServiceAccountRestrictionBuilder(){
            this(true);
    }
    public ServiceAccountRestrictionBuilder(Boolean validationEnabled){
            this(new ServiceAccountRestriction(), validationEnabled);
    }
    public ServiceAccountRestrictionBuilder(ServiceAccountRestrictionFluent<?> fluent){
            this(fluent, true);
    }
    public ServiceAccountRestrictionBuilder(ServiceAccountRestrictionFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ServiceAccountRestriction(), validationEnabled);
    }
    public ServiceAccountRestrictionBuilder(ServiceAccountRestrictionFluent<?> fluent,ServiceAccountRestriction instance){
            this(fluent, instance, true);
    }
    public ServiceAccountRestrictionBuilder(ServiceAccountRestrictionFluent<?> fluent,ServiceAccountRestriction instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withNamespaces(instance.getNamespaces()); 
            fluent.withServiceaccounts(instance.getServiceaccounts()); 
            this.validationEnabled = validationEnabled; 
    }
    public ServiceAccountRestrictionBuilder(ServiceAccountRestriction instance){
            this(instance,true);
    }
    public ServiceAccountRestrictionBuilder(ServiceAccountRestriction instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withNamespaces(instance.getNamespaces()); 
            this.withServiceaccounts(instance.getServiceaccounts()); 
            this.validationEnabled = validationEnabled; 
    }
    public ServiceAccountRestrictionBuilder(Validator validator){
            this(new ServiceAccountRestriction(), true);
    }
    public ServiceAccountRestrictionBuilder(ServiceAccountRestrictionFluent<?> fluent,ServiceAccountRestriction instance,Validator validator){
            this.fluent = fluent; 
            fluent.withNamespaces(instance.getNamespaces()); 
            fluent.withServiceaccounts(instance.getServiceaccounts()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ServiceAccountRestrictionBuilder(ServiceAccountRestriction instance,Validator validator){
            this.fluent = this; 
            this.withNamespaces(instance.getNamespaces()); 
            this.withServiceaccounts(instance.getServiceaccounts()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ServiceAccountRestriction build(){
            ServiceAccountRestriction buildable = new ServiceAccountRestriction(fluent.getNamespaces(),fluent.getServiceaccounts());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ServiceAccountRestrictionBuilder that = (ServiceAccountRestrictionBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
