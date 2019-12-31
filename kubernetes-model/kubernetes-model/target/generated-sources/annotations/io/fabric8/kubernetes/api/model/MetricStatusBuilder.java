package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class MetricStatusBuilder extends MetricStatusFluentImpl<MetricStatusBuilder> implements VisitableBuilder<MetricStatus,MetricStatusBuilder>{

    MetricStatusFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public MetricStatusBuilder(){
            this(true);
    }
    public MetricStatusBuilder(Boolean validationEnabled){
            this(new MetricStatus(), validationEnabled);
    }
    public MetricStatusBuilder(MetricStatusFluent<?> fluent){
            this(fluent, true);
    }
    public MetricStatusBuilder(MetricStatusFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new MetricStatus(), validationEnabled);
    }
    public MetricStatusBuilder(MetricStatusFluent<?> fluent,MetricStatus instance){
            this(fluent, instance, true);
    }
    public MetricStatusBuilder(MetricStatusFluent<?> fluent,MetricStatus instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withExternal(instance.getExternal()); 
            fluent.withObject(instance.getObject()); 
            fluent.withPods(instance.getPods()); 
            fluent.withResource(instance.getResource()); 
            fluent.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public MetricStatusBuilder(MetricStatus instance){
            this(instance,true);
    }
    public MetricStatusBuilder(MetricStatus instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withExternal(instance.getExternal()); 
            this.withObject(instance.getObject()); 
            this.withPods(instance.getPods()); 
            this.withResource(instance.getResource()); 
            this.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public MetricStatusBuilder(Validator validator){
            this(new MetricStatus(), true);
    }
    public MetricStatusBuilder(MetricStatusFluent<?> fluent,MetricStatus instance,Validator validator){
            this.fluent = fluent; 
            fluent.withExternal(instance.getExternal()); 
            fluent.withObject(instance.getObject()); 
            fluent.withPods(instance.getPods()); 
            fluent.withResource(instance.getResource()); 
            fluent.withType(instance.getType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public MetricStatusBuilder(MetricStatus instance,Validator validator){
            this.fluent = this; 
            this.withExternal(instance.getExternal()); 
            this.withObject(instance.getObject()); 
            this.withPods(instance.getPods()); 
            this.withResource(instance.getResource()); 
            this.withType(instance.getType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public MetricStatus build(){
            MetricStatus buildable = new MetricStatus(fluent.getExternal(),fluent.getObject(),fluent.getPods(),fluent.getResource(),fluent.getType());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            MetricStatusBuilder that = (MetricStatusBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
