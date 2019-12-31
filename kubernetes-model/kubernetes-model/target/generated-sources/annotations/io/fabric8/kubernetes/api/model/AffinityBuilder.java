package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class AffinityBuilder extends AffinityFluentImpl<AffinityBuilder> implements VisitableBuilder<Affinity,AffinityBuilder>{

    AffinityFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public AffinityBuilder(){
            this(true);
    }
    public AffinityBuilder(Boolean validationEnabled){
            this(new Affinity(), validationEnabled);
    }
    public AffinityBuilder(AffinityFluent<?> fluent){
            this(fluent, true);
    }
    public AffinityBuilder(AffinityFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new Affinity(), validationEnabled);
    }
    public AffinityBuilder(AffinityFluent<?> fluent,Affinity instance){
            this(fluent, instance, true);
    }
    public AffinityBuilder(AffinityFluent<?> fluent,Affinity instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withNodeAffinity(instance.getNodeAffinity()); 
            fluent.withPodAffinity(instance.getPodAffinity()); 
            fluent.withPodAntiAffinity(instance.getPodAntiAffinity()); 
            this.validationEnabled = validationEnabled; 
    }
    public AffinityBuilder(Affinity instance){
            this(instance,true);
    }
    public AffinityBuilder(Affinity instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withNodeAffinity(instance.getNodeAffinity()); 
            this.withPodAffinity(instance.getPodAffinity()); 
            this.withPodAntiAffinity(instance.getPodAntiAffinity()); 
            this.validationEnabled = validationEnabled; 
    }
    public AffinityBuilder(Validator validator){
            this(new Affinity(), true);
    }
    public AffinityBuilder(AffinityFluent<?> fluent,Affinity instance,Validator validator){
            this.fluent = fluent; 
            fluent.withNodeAffinity(instance.getNodeAffinity()); 
            fluent.withPodAffinity(instance.getPodAffinity()); 
            fluent.withPodAntiAffinity(instance.getPodAntiAffinity()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public AffinityBuilder(Affinity instance,Validator validator){
            this.fluent = this; 
            this.withNodeAffinity(instance.getNodeAffinity()); 
            this.withPodAffinity(instance.getPodAffinity()); 
            this.withPodAntiAffinity(instance.getPodAntiAffinity()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public Affinity build(){
            Affinity buildable = new Affinity(fluent.getNodeAffinity(),fluent.getPodAffinity(),fluent.getPodAntiAffinity());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            AffinityBuilder that = (AffinityBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
