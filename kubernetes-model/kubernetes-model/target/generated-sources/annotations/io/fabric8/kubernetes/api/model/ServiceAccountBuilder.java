package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ServiceAccountBuilder extends ServiceAccountFluentImpl<ServiceAccountBuilder> implements VisitableBuilder<ServiceAccount,ServiceAccountBuilder>{

    ServiceAccountFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ServiceAccountBuilder(){
            this(true);
    }
    public ServiceAccountBuilder(Boolean validationEnabled){
            this(new ServiceAccount(), validationEnabled);
    }
    public ServiceAccountBuilder(ServiceAccountFluent<?> fluent){
            this(fluent, true);
    }
    public ServiceAccountBuilder(ServiceAccountFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ServiceAccount(), validationEnabled);
    }
    public ServiceAccountBuilder(ServiceAccountFluent<?> fluent,ServiceAccount instance){
            this(fluent, instance, true);
    }
    public ServiceAccountBuilder(ServiceAccountFluent<?> fluent,ServiceAccount instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withAutomountServiceAccountToken(instance.getAutomountServiceAccountToken()); 
            fluent.withImagePullSecrets(instance.getImagePullSecrets()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSecrets(instance.getSecrets()); 
            this.validationEnabled = validationEnabled; 
    }
    public ServiceAccountBuilder(ServiceAccount instance){
            this(instance,true);
    }
    public ServiceAccountBuilder(ServiceAccount instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withAutomountServiceAccountToken(instance.getAutomountServiceAccountToken()); 
            this.withImagePullSecrets(instance.getImagePullSecrets()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSecrets(instance.getSecrets()); 
            this.validationEnabled = validationEnabled; 
    }
    public ServiceAccountBuilder(Validator validator){
            this(new ServiceAccount(), true);
    }
    public ServiceAccountBuilder(ServiceAccountFluent<?> fluent,ServiceAccount instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withAutomountServiceAccountToken(instance.getAutomountServiceAccountToken()); 
            fluent.withImagePullSecrets(instance.getImagePullSecrets()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSecrets(instance.getSecrets()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ServiceAccountBuilder(ServiceAccount instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withAutomountServiceAccountToken(instance.getAutomountServiceAccountToken()); 
            this.withImagePullSecrets(instance.getImagePullSecrets()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSecrets(instance.getSecrets()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ServiceAccount build(){
            ServiceAccount buildable = new ServiceAccount(fluent.getApiVersion(),fluent.isAutomountServiceAccountToken(),fluent.getImagePullSecrets(),fluent.getKind(),fluent.getMetadata(),fluent.getSecrets());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ServiceAccountBuilder that = (ServiceAccountBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
