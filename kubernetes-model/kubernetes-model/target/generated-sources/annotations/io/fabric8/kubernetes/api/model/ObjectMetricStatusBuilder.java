package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ObjectMetricStatusBuilder extends ObjectMetricStatusFluentImpl<ObjectMetricStatusBuilder> implements VisitableBuilder<ObjectMetricStatus,ObjectMetricStatusBuilder>{

    ObjectMetricStatusFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ObjectMetricStatusBuilder(){
            this(true);
    }
    public ObjectMetricStatusBuilder(Boolean validationEnabled){
            this(new ObjectMetricStatus(), validationEnabled);
    }
    public ObjectMetricStatusBuilder(ObjectMetricStatusFluent<?> fluent){
            this(fluent, true);
    }
    public ObjectMetricStatusBuilder(ObjectMetricStatusFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ObjectMetricStatus(), validationEnabled);
    }
    public ObjectMetricStatusBuilder(ObjectMetricStatusFluent<?> fluent,ObjectMetricStatus instance){
            this(fluent, instance, true);
    }
    public ObjectMetricStatusBuilder(ObjectMetricStatusFluent<?> fluent,ObjectMetricStatus instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAverageValue(instance.getAverageValue()); 
            fluent.withCurrentValue(instance.getCurrentValue()); 
            fluent.withMetricName(instance.getMetricName()); 
            fluent.withSelector(instance.getSelector()); 
            fluent.withTarget(instance.getTarget()); 
            this.validationEnabled = validationEnabled; 
    }
    public ObjectMetricStatusBuilder(ObjectMetricStatus instance){
            this(instance,true);
    }
    public ObjectMetricStatusBuilder(ObjectMetricStatus instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAverageValue(instance.getAverageValue()); 
            this.withCurrentValue(instance.getCurrentValue()); 
            this.withMetricName(instance.getMetricName()); 
            this.withSelector(instance.getSelector()); 
            this.withTarget(instance.getTarget()); 
            this.validationEnabled = validationEnabled; 
    }
    public ObjectMetricStatusBuilder(Validator validator){
            this(new ObjectMetricStatus(), true);
    }
    public ObjectMetricStatusBuilder(ObjectMetricStatusFluent<?> fluent,ObjectMetricStatus instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAverageValue(instance.getAverageValue()); 
            fluent.withCurrentValue(instance.getCurrentValue()); 
            fluent.withMetricName(instance.getMetricName()); 
            fluent.withSelector(instance.getSelector()); 
            fluent.withTarget(instance.getTarget()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ObjectMetricStatusBuilder(ObjectMetricStatus instance,Validator validator){
            this.fluent = this; 
            this.withAverageValue(instance.getAverageValue()); 
            this.withCurrentValue(instance.getCurrentValue()); 
            this.withMetricName(instance.getMetricName()); 
            this.withSelector(instance.getSelector()); 
            this.withTarget(instance.getTarget()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ObjectMetricStatus build(){
            ObjectMetricStatus buildable = new ObjectMetricStatus(fluent.getAverageValue(),fluent.getCurrentValue(),fluent.getMetricName(),fluent.getSelector(),fluent.getTarget());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ObjectMetricStatusBuilder that = (ObjectMetricStatusBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
