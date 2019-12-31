package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ObjectMetricSourceBuilder extends ObjectMetricSourceFluentImpl<ObjectMetricSourceBuilder> implements VisitableBuilder<ObjectMetricSource,ObjectMetricSourceBuilder>{

    ObjectMetricSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ObjectMetricSourceBuilder(){
            this(true);
    }
    public ObjectMetricSourceBuilder(Boolean validationEnabled){
            this(new ObjectMetricSource(), validationEnabled);
    }
    public ObjectMetricSourceBuilder(ObjectMetricSourceFluent<?> fluent){
            this(fluent, true);
    }
    public ObjectMetricSourceBuilder(ObjectMetricSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new ObjectMetricSource(), validationEnabled);
    }
    public ObjectMetricSourceBuilder(ObjectMetricSourceFluent<?> fluent,ObjectMetricSource instance){
            this(fluent, instance, true);
    }
    public ObjectMetricSourceBuilder(ObjectMetricSourceFluent<?> fluent,ObjectMetricSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAverageValue(instance.getAverageValue()); 
            fluent.withMetricName(instance.getMetricName()); 
            fluent.withSelector(instance.getSelector()); 
            fluent.withTarget(instance.getTarget()); 
            fluent.withTargetValue(instance.getTargetValue()); 
            this.validationEnabled = validationEnabled; 
    }
    public ObjectMetricSourceBuilder(ObjectMetricSource instance){
            this(instance,true);
    }
    public ObjectMetricSourceBuilder(ObjectMetricSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAverageValue(instance.getAverageValue()); 
            this.withMetricName(instance.getMetricName()); 
            this.withSelector(instance.getSelector()); 
            this.withTarget(instance.getTarget()); 
            this.withTargetValue(instance.getTargetValue()); 
            this.validationEnabled = validationEnabled; 
    }
    public ObjectMetricSourceBuilder(Validator validator){
            this(new ObjectMetricSource(), true);
    }
    public ObjectMetricSourceBuilder(ObjectMetricSourceFluent<?> fluent,ObjectMetricSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAverageValue(instance.getAverageValue()); 
            fluent.withMetricName(instance.getMetricName()); 
            fluent.withSelector(instance.getSelector()); 
            fluent.withTarget(instance.getTarget()); 
            fluent.withTargetValue(instance.getTargetValue()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ObjectMetricSourceBuilder(ObjectMetricSource instance,Validator validator){
            this.fluent = this; 
            this.withAverageValue(instance.getAverageValue()); 
            this.withMetricName(instance.getMetricName()); 
            this.withSelector(instance.getSelector()); 
            this.withTarget(instance.getTarget()); 
            this.withTargetValue(instance.getTargetValue()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public ObjectMetricSource build(){
            ObjectMetricSource buildable = new ObjectMetricSource(fluent.getAverageValue(),fluent.getMetricName(),fluent.getSelector(),fluent.getTarget(),fluent.getTargetValue());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ObjectMetricSourceBuilder that = (ObjectMetricSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
