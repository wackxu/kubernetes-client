package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ResourceQuotaBuilder extends ResourceQuotaFluentImpl<ResourceQuotaBuilder> implements VisitableBuilder<ResourceQuota,ResourceQuotaBuilder>{

    ResourceQuotaFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ResourceQuotaBuilder(){
            this(true);
    }
    public ResourceQuotaBuilder(Boolean validationEnabled){
            this(new ResourceQuota(), validationEnabled);
    }
    public ResourceQuotaBuilder(ResourceQuotaFluent<?> fluent){
            this(fluent, true);
    }
    public ResourceQuotaBuilder(ResourceQuotaFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ResourceQuota(), validationEnabled);
    }
    public ResourceQuotaBuilder(ResourceQuotaFluent<?> fluent,ResourceQuota instance){
            this(fluent, instance, true);
    }
    public ResourceQuotaBuilder(ResourceQuotaFluent<?> fluent,ResourceQuota instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            fluent.withStatus(instance.getStatus()); 
            this.validationEnabled = validationEnabled; 
    }
    public ResourceQuotaBuilder(ResourceQuota instance){
            this(instance,true);
    }
    public ResourceQuotaBuilder(ResourceQuota instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.withStatus(instance.getStatus()); 
            this.validationEnabled = validationEnabled; 
    }
    public ResourceQuotaBuilder(Validator validator){
            this(new ResourceQuota(), true);
    }
    public ResourceQuotaBuilder(ResourceQuotaFluent<?> fluent,ResourceQuota instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            fluent.withStatus(instance.getStatus()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ResourceQuotaBuilder(ResourceQuota instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.withStatus(instance.getStatus()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ResourceQuota build(){
            ResourceQuota buildable = new ResourceQuota(fluent.getApiVersion(),fluent.getKind(),fluent.getMetadata(),fluent.getSpec(),fluent.getStatus());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ResourceQuotaBuilder that = (ResourceQuotaBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
