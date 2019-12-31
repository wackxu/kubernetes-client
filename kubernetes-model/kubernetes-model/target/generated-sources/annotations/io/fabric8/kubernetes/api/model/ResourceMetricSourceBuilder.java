package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ResourceMetricSourceBuilder extends ResourceMetricSourceFluentImpl<ResourceMetricSourceBuilder> implements VisitableBuilder<ResourceMetricSource,ResourceMetricSourceBuilder>{

    ResourceMetricSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ResourceMetricSourceBuilder(){
            this(true);
    }
    public ResourceMetricSourceBuilder(Boolean validationEnabled){
            this(new ResourceMetricSource(), validationEnabled);
    }
    public ResourceMetricSourceBuilder(ResourceMetricSourceFluent<?> fluent){
            this(fluent, true);
    }
    public ResourceMetricSourceBuilder(ResourceMetricSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ResourceMetricSource(), validationEnabled);
    }
    public ResourceMetricSourceBuilder(ResourceMetricSourceFluent<?> fluent,ResourceMetricSource instance){
            this(fluent, instance, true);
    }
    public ResourceMetricSourceBuilder(ResourceMetricSourceFluent<?> fluent,ResourceMetricSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withName(instance.getName()); 
            fluent.withTargetAverageUtilization(instance.getTargetAverageUtilization()); 
            fluent.withTargetAverageValue(instance.getTargetAverageValue()); 
            this.validationEnabled = validationEnabled; 
    }
    public ResourceMetricSourceBuilder(ResourceMetricSource instance){
            this(instance,true);
    }
    public ResourceMetricSourceBuilder(ResourceMetricSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withName(instance.getName()); 
            this.withTargetAverageUtilization(instance.getTargetAverageUtilization()); 
            this.withTargetAverageValue(instance.getTargetAverageValue()); 
            this.validationEnabled = validationEnabled; 
    }
    public ResourceMetricSourceBuilder(Validator validator){
            this(new ResourceMetricSource(), true);
    }
    public ResourceMetricSourceBuilder(ResourceMetricSourceFluent<?> fluent,ResourceMetricSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withName(instance.getName()); 
            fluent.withTargetAverageUtilization(instance.getTargetAverageUtilization()); 
            fluent.withTargetAverageValue(instance.getTargetAverageValue()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ResourceMetricSourceBuilder(ResourceMetricSource instance,Validator validator){
            this.fluent = this; 
            this.withName(instance.getName()); 
            this.withTargetAverageUtilization(instance.getTargetAverageUtilization()); 
            this.withTargetAverageValue(instance.getTargetAverageValue()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ResourceMetricSource build(){
            ResourceMetricSource buildable = new ResourceMetricSource(fluent.getName(),fluent.getTargetAverageUtilization(),fluent.getTargetAverageValue());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ResourceMetricSourceBuilder that = (ResourceMetricSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
