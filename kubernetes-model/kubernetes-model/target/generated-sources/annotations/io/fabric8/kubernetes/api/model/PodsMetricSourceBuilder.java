package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PodsMetricSourceBuilder extends PodsMetricSourceFluentImpl<PodsMetricSourceBuilder> implements VisitableBuilder<PodsMetricSource,PodsMetricSourceBuilder>{

    PodsMetricSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PodsMetricSourceBuilder(){
            this(true);
    }
    public PodsMetricSourceBuilder(Boolean validationEnabled){
            this(new PodsMetricSource(), validationEnabled);
    }
    public PodsMetricSourceBuilder(PodsMetricSourceFluent<?> fluent){
            this(fluent, true);
    }
    public PodsMetricSourceBuilder(PodsMetricSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new PodsMetricSource(), validationEnabled);
    }
    public PodsMetricSourceBuilder(PodsMetricSourceFluent<?> fluent,PodsMetricSource instance){
            this(fluent, instance, true);
    }
    public PodsMetricSourceBuilder(PodsMetricSourceFluent<?> fluent,PodsMetricSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withMetricName(instance.getMetricName()); 
            fluent.withSelector(instance.getSelector()); 
            fluent.withTargetAverageValue(instance.getTargetAverageValue()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodsMetricSourceBuilder(PodsMetricSource instance){
            this(instance,true);
    }
    public PodsMetricSourceBuilder(PodsMetricSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withMetricName(instance.getMetricName()); 
            this.withSelector(instance.getSelector()); 
            this.withTargetAverageValue(instance.getTargetAverageValue()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodsMetricSourceBuilder(Validator validator){
            this(new PodsMetricSource(), true);
    }
    public PodsMetricSourceBuilder(PodsMetricSourceFluent<?> fluent,PodsMetricSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withMetricName(instance.getMetricName()); 
            fluent.withSelector(instance.getSelector()); 
            fluent.withTargetAverageValue(instance.getTargetAverageValue()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PodsMetricSourceBuilder(PodsMetricSource instance,Validator validator){
            this.fluent = this; 
            this.withMetricName(instance.getMetricName()); 
            this.withSelector(instance.getSelector()); 
            this.withTargetAverageValue(instance.getTargetAverageValue()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public PodsMetricSource build(){
            PodsMetricSource buildable = new PodsMetricSource(fluent.getMetricName(),fluent.getSelector(),fluent.getTargetAverageValue());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PodsMetricSourceBuilder that = (PodsMetricSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
