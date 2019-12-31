package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PodAffinityBuilder extends PodAffinityFluentImpl<PodAffinityBuilder> implements VisitableBuilder<PodAffinity,PodAffinityBuilder>{

    PodAffinityFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PodAffinityBuilder(){
            this(true);
    }
    public PodAffinityBuilder(Boolean validationEnabled){
            this(new PodAffinity(), validationEnabled);
    }
    public PodAffinityBuilder(PodAffinityFluent<?> fluent){
            this(fluent, true);
    }
    public PodAffinityBuilder(PodAffinityFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new PodAffinity(), validationEnabled);
    }
    public PodAffinityBuilder(PodAffinityFluent<?> fluent,PodAffinity instance){
            this(fluent, instance, true);
    }
    public PodAffinityBuilder(PodAffinityFluent<?> fluent,PodAffinity instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withPreferredDuringSchedulingIgnoredDuringExecution(instance.getPreferredDuringSchedulingIgnoredDuringExecution()); 
            fluent.withRequiredDuringSchedulingIgnoredDuringExecution(instance.getRequiredDuringSchedulingIgnoredDuringExecution()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodAffinityBuilder(PodAffinity instance){
            this(instance,true);
    }
    public PodAffinityBuilder(PodAffinity instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withPreferredDuringSchedulingIgnoredDuringExecution(instance.getPreferredDuringSchedulingIgnoredDuringExecution()); 
            this.withRequiredDuringSchedulingIgnoredDuringExecution(instance.getRequiredDuringSchedulingIgnoredDuringExecution()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodAffinityBuilder(Validator validator){
            this(new PodAffinity(), true);
    }
    public PodAffinityBuilder(PodAffinityFluent<?> fluent,PodAffinity instance,Validator validator){
            this.fluent = fluent; 
            fluent.withPreferredDuringSchedulingIgnoredDuringExecution(instance.getPreferredDuringSchedulingIgnoredDuringExecution()); 
            fluent.withRequiredDuringSchedulingIgnoredDuringExecution(instance.getRequiredDuringSchedulingIgnoredDuringExecution()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PodAffinityBuilder(PodAffinity instance,Validator validator){
            this.fluent = this; 
            this.withPreferredDuringSchedulingIgnoredDuringExecution(instance.getPreferredDuringSchedulingIgnoredDuringExecution()); 
            this.withRequiredDuringSchedulingIgnoredDuringExecution(instance.getRequiredDuringSchedulingIgnoredDuringExecution()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public PodAffinity build(){
            PodAffinity buildable = new PodAffinity(fluent.getPreferredDuringSchedulingIgnoredDuringExecution(),fluent.getRequiredDuringSchedulingIgnoredDuringExecution());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PodAffinityBuilder that = (PodAffinityBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
