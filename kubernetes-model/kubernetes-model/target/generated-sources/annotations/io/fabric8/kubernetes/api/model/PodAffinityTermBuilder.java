package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PodAffinityTermBuilder extends PodAffinityTermFluentImpl<PodAffinityTermBuilder> implements VisitableBuilder<PodAffinityTerm,PodAffinityTermBuilder>{

    PodAffinityTermFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PodAffinityTermBuilder(){
            this(true);
    }
    public PodAffinityTermBuilder(Boolean validationEnabled){
            this(new PodAffinityTerm(), validationEnabled);
    }
    public PodAffinityTermBuilder(PodAffinityTermFluent<?> fluent){
            this(fluent, true);
    }
    public PodAffinityTermBuilder(PodAffinityTermFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new PodAffinityTerm(), validationEnabled);
    }
    public PodAffinityTermBuilder(PodAffinityTermFluent<?> fluent,PodAffinityTerm instance){
            this(fluent, instance, true);
    }
    public PodAffinityTermBuilder(PodAffinityTermFluent<?> fluent,PodAffinityTerm instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withLabelSelector(instance.getLabelSelector()); 
            fluent.withNamespaces(instance.getNamespaces()); 
            fluent.withTopologyKey(instance.getTopologyKey()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodAffinityTermBuilder(PodAffinityTerm instance){
            this(instance,true);
    }
    public PodAffinityTermBuilder(PodAffinityTerm instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withLabelSelector(instance.getLabelSelector()); 
            this.withNamespaces(instance.getNamespaces()); 
            this.withTopologyKey(instance.getTopologyKey()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodAffinityTermBuilder(Validator validator){
            this(new PodAffinityTerm(), true);
    }
    public PodAffinityTermBuilder(PodAffinityTermFluent<?> fluent,PodAffinityTerm instance,Validator validator){
            this.fluent = fluent; 
            fluent.withLabelSelector(instance.getLabelSelector()); 
            fluent.withNamespaces(instance.getNamespaces()); 
            fluent.withTopologyKey(instance.getTopologyKey()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PodAffinityTermBuilder(PodAffinityTerm instance,Validator validator){
            this.fluent = this; 
            this.withLabelSelector(instance.getLabelSelector()); 
            this.withNamespaces(instance.getNamespaces()); 
            this.withTopologyKey(instance.getTopologyKey()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public PodAffinityTerm build(){
            PodAffinityTerm buildable = new PodAffinityTerm(fluent.getLabelSelector(),fluent.getNamespaces(),fluent.getTopologyKey());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PodAffinityTermBuilder that = (PodAffinityTermBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
