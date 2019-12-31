package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class WeightedPodAffinityTermBuilder extends WeightedPodAffinityTermFluentImpl<WeightedPodAffinityTermBuilder> implements VisitableBuilder<WeightedPodAffinityTerm,WeightedPodAffinityTermBuilder>{

    WeightedPodAffinityTermFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public WeightedPodAffinityTermBuilder(){
            this(true);
    }
    public WeightedPodAffinityTermBuilder(Boolean validationEnabled){
            this(new WeightedPodAffinityTerm(), validationEnabled);
    }
    public WeightedPodAffinityTermBuilder(WeightedPodAffinityTermFluent<?> fluent){
            this(fluent, true);
    }
    public WeightedPodAffinityTermBuilder(WeightedPodAffinityTermFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new WeightedPodAffinityTerm(), validationEnabled);
    }
    public WeightedPodAffinityTermBuilder(WeightedPodAffinityTermFluent<?> fluent,WeightedPodAffinityTerm instance){
            this(fluent, instance, true);
    }
    public WeightedPodAffinityTermBuilder(WeightedPodAffinityTermFluent<?> fluent,WeightedPodAffinityTerm instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withPodAffinityTerm(instance.getPodAffinityTerm()); 
            fluent.withWeight(instance.getWeight()); 
            this.validationEnabled = validationEnabled; 
    }
    public WeightedPodAffinityTermBuilder(WeightedPodAffinityTerm instance){
            this(instance,true);
    }
    public WeightedPodAffinityTermBuilder(WeightedPodAffinityTerm instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withPodAffinityTerm(instance.getPodAffinityTerm()); 
            this.withWeight(instance.getWeight()); 
            this.validationEnabled = validationEnabled; 
    }
    public WeightedPodAffinityTermBuilder(Validator validator){
            this(new WeightedPodAffinityTerm(), true);
    }
    public WeightedPodAffinityTermBuilder(WeightedPodAffinityTermFluent<?> fluent,WeightedPodAffinityTerm instance,Validator validator){
            this.fluent = fluent; 
            fluent.withPodAffinityTerm(instance.getPodAffinityTerm()); 
            fluent.withWeight(instance.getWeight()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public WeightedPodAffinityTermBuilder(WeightedPodAffinityTerm instance,Validator validator){
            this.fluent = this; 
            this.withPodAffinityTerm(instance.getPodAffinityTerm()); 
            this.withWeight(instance.getWeight()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public WeightedPodAffinityTerm build(){
            WeightedPodAffinityTerm buildable = new WeightedPodAffinityTerm(fluent.getPodAffinityTerm(),fluent.getWeight());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            WeightedPodAffinityTermBuilder that = (WeightedPodAffinityTermBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
