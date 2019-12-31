package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ResourceQuotaStatusBuilder extends ResourceQuotaStatusFluentImpl<ResourceQuotaStatusBuilder> implements VisitableBuilder<ResourceQuotaStatus,ResourceQuotaStatusBuilder>{

    ResourceQuotaStatusFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ResourceQuotaStatusBuilder(){
            this(true);
    }
    public ResourceQuotaStatusBuilder(Boolean validationEnabled){
            this(new ResourceQuotaStatus(), validationEnabled);
    }
    public ResourceQuotaStatusBuilder(ResourceQuotaStatusFluent<?> fluent){
            this(fluent, true);
    }
    public ResourceQuotaStatusBuilder(ResourceQuotaStatusFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ResourceQuotaStatus(), validationEnabled);
    }
    public ResourceQuotaStatusBuilder(ResourceQuotaStatusFluent<?> fluent,ResourceQuotaStatus instance){
            this(fluent, instance, true);
    }
    public ResourceQuotaStatusBuilder(ResourceQuotaStatusFluent<?> fluent,ResourceQuotaStatus instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withHard(instance.getHard()); 
            fluent.withUsed(instance.getUsed()); 
            this.validationEnabled = validationEnabled; 
    }
    public ResourceQuotaStatusBuilder(ResourceQuotaStatus instance){
            this(instance,true);
    }
    public ResourceQuotaStatusBuilder(ResourceQuotaStatus instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withHard(instance.getHard()); 
            this.withUsed(instance.getUsed()); 
            this.validationEnabled = validationEnabled; 
    }
    public ResourceQuotaStatusBuilder(Validator validator){
            this(new ResourceQuotaStatus(), true);
    }
    public ResourceQuotaStatusBuilder(ResourceQuotaStatusFluent<?> fluent,ResourceQuotaStatus instance,Validator validator){
            this.fluent = fluent; 
            fluent.withHard(instance.getHard()); 
            fluent.withUsed(instance.getUsed()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ResourceQuotaStatusBuilder(ResourceQuotaStatus instance,Validator validator){
            this.fluent = this; 
            this.withHard(instance.getHard()); 
            this.withUsed(instance.getUsed()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ResourceQuotaStatus build(){
            ResourceQuotaStatus buildable = new ResourceQuotaStatus(fluent.getHard(),fluent.getUsed());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ResourceQuotaStatusBuilder that = (ResourceQuotaStatusBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
