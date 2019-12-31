package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PodsMetricStatusBuilder extends PodsMetricStatusFluentImpl<PodsMetricStatusBuilder> implements VisitableBuilder<PodsMetricStatus,PodsMetricStatusBuilder>{

    PodsMetricStatusFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PodsMetricStatusBuilder(){
            this(true);
    }
    public PodsMetricStatusBuilder(Boolean validationEnabled){
            this(new PodsMetricStatus(), validationEnabled);
    }
    public PodsMetricStatusBuilder(PodsMetricStatusFluent<?> fluent){
            this(fluent, true);
    }
    public PodsMetricStatusBuilder(PodsMetricStatusFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new PodsMetricStatus(), validationEnabled);
    }
    public PodsMetricStatusBuilder(PodsMetricStatusFluent<?> fluent,PodsMetricStatus instance){
            this(fluent, instance, true);
    }
    public PodsMetricStatusBuilder(PodsMetricStatusFluent<?> fluent,PodsMetricStatus instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withCurrentAverageValue(instance.getCurrentAverageValue()); 
            fluent.withMetricName(instance.getMetricName()); 
            fluent.withSelector(instance.getSelector()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodsMetricStatusBuilder(PodsMetricStatus instance){
            this(instance,true);
    }
    public PodsMetricStatusBuilder(PodsMetricStatus instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withCurrentAverageValue(instance.getCurrentAverageValue()); 
            this.withMetricName(instance.getMetricName()); 
            this.withSelector(instance.getSelector()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodsMetricStatusBuilder(Validator validator){
            this(new PodsMetricStatus(), true);
    }
    public PodsMetricStatusBuilder(PodsMetricStatusFluent<?> fluent,PodsMetricStatus instance,Validator validator){
            this.fluent = fluent; 
            fluent.withCurrentAverageValue(instance.getCurrentAverageValue()); 
            fluent.withMetricName(instance.getMetricName()); 
            fluent.withSelector(instance.getSelector()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PodsMetricStatusBuilder(PodsMetricStatus instance,Validator validator){
            this.fluent = this; 
            this.withCurrentAverageValue(instance.getCurrentAverageValue()); 
            this.withMetricName(instance.getMetricName()); 
            this.withSelector(instance.getSelector()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public PodsMetricStatus build(){
            PodsMetricStatus buildable = new PodsMetricStatus(fluent.getCurrentAverageValue(),fluent.getMetricName(),fluent.getSelector());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PodsMetricStatusBuilder that = (PodsMetricStatusBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
