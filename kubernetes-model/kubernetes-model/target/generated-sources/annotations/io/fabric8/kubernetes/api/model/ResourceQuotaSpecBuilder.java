package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ResourceQuotaSpecBuilder extends ResourceQuotaSpecFluentImpl<ResourceQuotaSpecBuilder> implements VisitableBuilder<ResourceQuotaSpec,ResourceQuotaSpecBuilder>{

    ResourceQuotaSpecFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ResourceQuotaSpecBuilder(){
            this(true);
    }
    public ResourceQuotaSpecBuilder(Boolean validationEnabled){
            this(new ResourceQuotaSpec(), validationEnabled);
    }
    public ResourceQuotaSpecBuilder(ResourceQuotaSpecFluent<?> fluent){
            this(fluent, true);
    }
    public ResourceQuotaSpecBuilder(ResourceQuotaSpecFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ResourceQuotaSpec(), validationEnabled);
    }
    public ResourceQuotaSpecBuilder(ResourceQuotaSpecFluent<?> fluent,ResourceQuotaSpec instance){
            this(fluent, instance, true);
    }
    public ResourceQuotaSpecBuilder(ResourceQuotaSpecFluent<?> fluent,ResourceQuotaSpec instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withHard(instance.getHard()); 
            fluent.withScopeSelector(instance.getScopeSelector()); 
            fluent.withScopes(instance.getScopes()); 
            this.validationEnabled = validationEnabled; 
    }
    public ResourceQuotaSpecBuilder(ResourceQuotaSpec instance){
            this(instance,true);
    }
    public ResourceQuotaSpecBuilder(ResourceQuotaSpec instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withHard(instance.getHard()); 
            this.withScopeSelector(instance.getScopeSelector()); 
            this.withScopes(instance.getScopes()); 
            this.validationEnabled = validationEnabled; 
    }
    public ResourceQuotaSpecBuilder(Validator validator){
            this(new ResourceQuotaSpec(), true);
    }
    public ResourceQuotaSpecBuilder(ResourceQuotaSpecFluent<?> fluent,ResourceQuotaSpec instance,Validator validator){
            this.fluent = fluent; 
            fluent.withHard(instance.getHard()); 
            fluent.withScopeSelector(instance.getScopeSelector()); 
            fluent.withScopes(instance.getScopes()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ResourceQuotaSpecBuilder(ResourceQuotaSpec instance,Validator validator){
            this.fluent = this; 
            this.withHard(instance.getHard()); 
            this.withScopeSelector(instance.getScopeSelector()); 
            this.withScopes(instance.getScopes()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ResourceQuotaSpec build(){
            ResourceQuotaSpec buildable = new ResourceQuotaSpec(fluent.getHard(),fluent.getScopeSelector(),fluent.getScopes());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ResourceQuotaSpecBuilder that = (ResourceQuotaSpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
