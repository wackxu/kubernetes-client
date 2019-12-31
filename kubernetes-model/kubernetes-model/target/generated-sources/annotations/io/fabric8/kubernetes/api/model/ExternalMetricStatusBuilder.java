package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ExternalMetricStatusBuilder extends ExternalMetricStatusFluentImpl<ExternalMetricStatusBuilder> implements VisitableBuilder<ExternalMetricStatus,ExternalMetricStatusBuilder>{

    ExternalMetricStatusFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ExternalMetricStatusBuilder(){
            this(true);
    }
    public ExternalMetricStatusBuilder(Boolean validationEnabled){
            this(new ExternalMetricStatus(), validationEnabled);
    }
    public ExternalMetricStatusBuilder(ExternalMetricStatusFluent<?> fluent){
            this(fluent, true);
    }
    public ExternalMetricStatusBuilder(ExternalMetricStatusFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ExternalMetricStatus(), validationEnabled);
    }
    public ExternalMetricStatusBuilder(ExternalMetricStatusFluent<?> fluent,ExternalMetricStatus instance){
            this(fluent, instance, true);
    }
    public ExternalMetricStatusBuilder(ExternalMetricStatusFluent<?> fluent,ExternalMetricStatus instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withCurrentAverageValue(instance.getCurrentAverageValue()); 
            fluent.withCurrentValue(instance.getCurrentValue()); 
            fluent.withMetricName(instance.getMetricName()); 
            fluent.withMetricSelector(instance.getMetricSelector()); 
            this.validationEnabled = validationEnabled; 
    }
    public ExternalMetricStatusBuilder(ExternalMetricStatus instance){
            this(instance,true);
    }
    public ExternalMetricStatusBuilder(ExternalMetricStatus instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withCurrentAverageValue(instance.getCurrentAverageValue()); 
            this.withCurrentValue(instance.getCurrentValue()); 
            this.withMetricName(instance.getMetricName()); 
            this.withMetricSelector(instance.getMetricSelector()); 
            this.validationEnabled = validationEnabled; 
    }
    public ExternalMetricStatusBuilder(Validator validator){
            this(new ExternalMetricStatus(), true);
    }
    public ExternalMetricStatusBuilder(ExternalMetricStatusFluent<?> fluent,ExternalMetricStatus instance,Validator validator){
            this.fluent = fluent; 
            fluent.withCurrentAverageValue(instance.getCurrentAverageValue()); 
            fluent.withCurrentValue(instance.getCurrentValue()); 
            fluent.withMetricName(instance.getMetricName()); 
            fluent.withMetricSelector(instance.getMetricSelector()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ExternalMetricStatusBuilder(ExternalMetricStatus instance,Validator validator){
            this.fluent = this; 
            this.withCurrentAverageValue(instance.getCurrentAverageValue()); 
            this.withCurrentValue(instance.getCurrentValue()); 
            this.withMetricName(instance.getMetricName()); 
            this.withMetricSelector(instance.getMetricSelector()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ExternalMetricStatus build(){
            ExternalMetricStatus buildable = new ExternalMetricStatus(fluent.getCurrentAverageValue(),fluent.getCurrentValue(),fluent.getMetricName(),fluent.getMetricSelector());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ExternalMetricStatusBuilder that = (ExternalMetricStatusBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
