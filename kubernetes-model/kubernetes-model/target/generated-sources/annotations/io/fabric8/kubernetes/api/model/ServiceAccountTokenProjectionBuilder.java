package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ServiceAccountTokenProjectionBuilder extends ServiceAccountTokenProjectionFluentImpl<ServiceAccountTokenProjectionBuilder> implements VisitableBuilder<ServiceAccountTokenProjection,ServiceAccountTokenProjectionBuilder>{

    ServiceAccountTokenProjectionFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ServiceAccountTokenProjectionBuilder(){
            this(true);
    }
    public ServiceAccountTokenProjectionBuilder(Boolean validationEnabled){
            this(new ServiceAccountTokenProjection(), validationEnabled);
    }
    public ServiceAccountTokenProjectionBuilder(ServiceAccountTokenProjectionFluent<?> fluent){
            this(fluent, true);
    }
    public ServiceAccountTokenProjectionBuilder(ServiceAccountTokenProjectionFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ServiceAccountTokenProjection(), validationEnabled);
    }
    public ServiceAccountTokenProjectionBuilder(ServiceAccountTokenProjectionFluent<?> fluent,ServiceAccountTokenProjection instance){
            this(fluent, instance, true);
    }
    public ServiceAccountTokenProjectionBuilder(ServiceAccountTokenProjectionFluent<?> fluent,ServiceAccountTokenProjection instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAudience(instance.getAudience()); 
            fluent.withExpirationSeconds(instance.getExpirationSeconds()); 
            fluent.withPath(instance.getPath()); 
            this.validationEnabled = validationEnabled; 
    }
    public ServiceAccountTokenProjectionBuilder(ServiceAccountTokenProjection instance){
            this(instance,true);
    }
    public ServiceAccountTokenProjectionBuilder(ServiceAccountTokenProjection instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAudience(instance.getAudience()); 
            this.withExpirationSeconds(instance.getExpirationSeconds()); 
            this.withPath(instance.getPath()); 
            this.validationEnabled = validationEnabled; 
    }
    public ServiceAccountTokenProjectionBuilder(Validator validator){
            this(new ServiceAccountTokenProjection(), true);
    }
    public ServiceAccountTokenProjectionBuilder(ServiceAccountTokenProjectionFluent<?> fluent,ServiceAccountTokenProjection instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAudience(instance.getAudience()); 
            fluent.withExpirationSeconds(instance.getExpirationSeconds()); 
            fluent.withPath(instance.getPath()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ServiceAccountTokenProjectionBuilder(ServiceAccountTokenProjection instance,Validator validator){
            this.fluent = this; 
            this.withAudience(instance.getAudience()); 
            this.withExpirationSeconds(instance.getExpirationSeconds()); 
            this.withPath(instance.getPath()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ServiceAccountTokenProjection build(){
            ServiceAccountTokenProjection buildable = new ServiceAccountTokenProjection(fluent.getAudience(),fluent.getExpirationSeconds(),fluent.getPath());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ServiceAccountTokenProjectionBuilder that = (ServiceAccountTokenProjectionBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
