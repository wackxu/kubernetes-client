package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ExternalMetricSourceBuilder extends ExternalMetricSourceFluentImpl<ExternalMetricSourceBuilder> implements VisitableBuilder<ExternalMetricSource,ExternalMetricSourceBuilder>{

    ExternalMetricSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ExternalMetricSourceBuilder(){
            this(true);
    }
    public ExternalMetricSourceBuilder(Boolean validationEnabled){
            this(new ExternalMetricSource(), validationEnabled);
    }
    public ExternalMetricSourceBuilder(ExternalMetricSourceFluent<?> fluent){
            this(fluent, true);
    }
    public ExternalMetricSourceBuilder(ExternalMetricSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ExternalMetricSource(), validationEnabled);
    }
    public ExternalMetricSourceBuilder(ExternalMetricSourceFluent<?> fluent,ExternalMetricSource instance){
            this(fluent, instance, true);
    }
    public ExternalMetricSourceBuilder(ExternalMetricSourceFluent<?> fluent,ExternalMetricSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withMetricName(instance.getMetricName()); 
            fluent.withMetricSelector(instance.getMetricSelector()); 
            fluent.withTargetAverageValue(instance.getTargetAverageValue()); 
            fluent.withTargetValue(instance.getTargetValue()); 
            this.validationEnabled = validationEnabled; 
    }
    public ExternalMetricSourceBuilder(ExternalMetricSource instance){
            this(instance,true);
    }
    public ExternalMetricSourceBuilder(ExternalMetricSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withMetricName(instance.getMetricName()); 
            this.withMetricSelector(instance.getMetricSelector()); 
            this.withTargetAverageValue(instance.getTargetAverageValue()); 
            this.withTargetValue(instance.getTargetValue()); 
            this.validationEnabled = validationEnabled; 
    }
    public ExternalMetricSourceBuilder(Validator validator){
            this(new ExternalMetricSource(), true);
    }
    public ExternalMetricSourceBuilder(ExternalMetricSourceFluent<?> fluent,ExternalMetricSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withMetricName(instance.getMetricName()); 
            fluent.withMetricSelector(instance.getMetricSelector()); 
            fluent.withTargetAverageValue(instance.getTargetAverageValue()); 
            fluent.withTargetValue(instance.getTargetValue()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ExternalMetricSourceBuilder(ExternalMetricSource instance,Validator validator){
            this.fluent = this; 
            this.withMetricName(instance.getMetricName()); 
            this.withMetricSelector(instance.getMetricSelector()); 
            this.withTargetAverageValue(instance.getTargetAverageValue()); 
            this.withTargetValue(instance.getTargetValue()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ExternalMetricSource build(){
            ExternalMetricSource buildable = new ExternalMetricSource(fluent.getMetricName(),fluent.getMetricSelector(),fluent.getTargetAverageValue(),fluent.getTargetValue());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ExternalMetricSourceBuilder that = (ExternalMetricSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
