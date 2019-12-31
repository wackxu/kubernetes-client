package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ResourceMetricStatusBuilder extends ResourceMetricStatusFluentImpl<ResourceMetricStatusBuilder> implements VisitableBuilder<ResourceMetricStatus,ResourceMetricStatusBuilder>{

    ResourceMetricStatusFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ResourceMetricStatusBuilder(){
            this(true);
    }
    public ResourceMetricStatusBuilder(Boolean validationEnabled){
            this(new ResourceMetricStatus(), validationEnabled);
    }
    public ResourceMetricStatusBuilder(ResourceMetricStatusFluent<?> fluent){
            this(fluent, true);
    }
    public ResourceMetricStatusBuilder(ResourceMetricStatusFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ResourceMetricStatus(), validationEnabled);
    }
    public ResourceMetricStatusBuilder(ResourceMetricStatusFluent<?> fluent,ResourceMetricStatus instance){
            this(fluent, instance, true);
    }
    public ResourceMetricStatusBuilder(ResourceMetricStatusFluent<?> fluent,ResourceMetricStatus instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withCurrentAverageUtilization(instance.getCurrentAverageUtilization()); 
            fluent.withCurrentAverageValue(instance.getCurrentAverageValue()); 
            fluent.withName(instance.getName()); 
            this.validationEnabled = validationEnabled; 
    }
    public ResourceMetricStatusBuilder(ResourceMetricStatus instance){
            this(instance,true);
    }
    public ResourceMetricStatusBuilder(ResourceMetricStatus instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withCurrentAverageUtilization(instance.getCurrentAverageUtilization()); 
            this.withCurrentAverageValue(instance.getCurrentAverageValue()); 
            this.withName(instance.getName()); 
            this.validationEnabled = validationEnabled; 
    }
    public ResourceMetricStatusBuilder(Validator validator){
            this(new ResourceMetricStatus(), true);
    }
    public ResourceMetricStatusBuilder(ResourceMetricStatusFluent<?> fluent,ResourceMetricStatus instance,Validator validator){
            this.fluent = fluent; 
            fluent.withCurrentAverageUtilization(instance.getCurrentAverageUtilization()); 
            fluent.withCurrentAverageValue(instance.getCurrentAverageValue()); 
            fluent.withName(instance.getName()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ResourceMetricStatusBuilder(ResourceMetricStatus instance,Validator validator){
            this.fluent = this; 
            this.withCurrentAverageUtilization(instance.getCurrentAverageUtilization()); 
            this.withCurrentAverageValue(instance.getCurrentAverageValue()); 
            this.withName(instance.getName()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ResourceMetricStatus build(){
            ResourceMetricStatus buildable = new ResourceMetricStatus(fluent.getCurrentAverageUtilization(),fluent.getCurrentAverageValue(),fluent.getName());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ResourceMetricStatusBuilder that = (ResourceMetricStatusBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
