package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class MetricSpecBuilder extends MetricSpecFluentImpl<MetricSpecBuilder> implements VisitableBuilder<MetricSpec,MetricSpecBuilder>{

    MetricSpecFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public MetricSpecBuilder(){
            this(true);
    }
    public MetricSpecBuilder(Boolean validationEnabled){
            this(new MetricSpec(), validationEnabled);
    }
    public MetricSpecBuilder(MetricSpecFluent<?> fluent){
            this(fluent, true);
    }
    public MetricSpecBuilder(MetricSpecFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new MetricSpec(), validationEnabled);
    }
    public MetricSpecBuilder(MetricSpecFluent<?> fluent,MetricSpec instance){
            this(fluent, instance, true);
    }
    public MetricSpecBuilder(MetricSpecFluent<?> fluent,MetricSpec instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withExternal(instance.getExternal()); 
            fluent.withObject(instance.getObject()); 
            fluent.withPods(instance.getPods()); 
            fluent.withResource(instance.getResource()); 
            fluent.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public MetricSpecBuilder(MetricSpec instance){
            this(instance,true);
    }
    public MetricSpecBuilder(MetricSpec instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withExternal(instance.getExternal()); 
            this.withObject(instance.getObject()); 
            this.withPods(instance.getPods()); 
            this.withResource(instance.getResource()); 
            this.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public MetricSpecBuilder(Validator validator){
            this(new MetricSpec(), true);
    }
    public MetricSpecBuilder(MetricSpecFluent<?> fluent,MetricSpec instance,Validator validator){
            this.fluent = fluent; 
            fluent.withExternal(instance.getExternal()); 
            fluent.withObject(instance.getObject()); 
            fluent.withPods(instance.getPods()); 
            fluent.withResource(instance.getResource()); 
            fluent.withType(instance.getType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public MetricSpecBuilder(MetricSpec instance,Validator validator){
            this.fluent = this; 
            this.withExternal(instance.getExternal()); 
            this.withObject(instance.getObject()); 
            this.withPods(instance.getPods()); 
            this.withResource(instance.getResource()); 
            this.withType(instance.getType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public MetricSpec build(){
            MetricSpec buildable = new MetricSpec(fluent.getExternal(),fluent.getObject(),fluent.getPods(),fluent.getResource(),fluent.getType());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            MetricSpecBuilder that = (MetricSpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
