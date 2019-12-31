package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PodAntiAffinityBuilder extends PodAntiAffinityFluentImpl<PodAntiAffinityBuilder> implements VisitableBuilder<PodAntiAffinity,PodAntiAffinityBuilder>{

    PodAntiAffinityFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PodAntiAffinityBuilder(){
            this(true);
    }
    public PodAntiAffinityBuilder(Boolean validationEnabled){
            this(new PodAntiAffinity(), validationEnabled);
    }
    public PodAntiAffinityBuilder(PodAntiAffinityFluent<?> fluent){
            this(fluent, true);
    }
    public PodAntiAffinityBuilder(PodAntiAffinityFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new PodAntiAffinity(), validationEnabled);
    }
    public PodAntiAffinityBuilder(PodAntiAffinityFluent<?> fluent,PodAntiAffinity instance){
            this(fluent, instance, true);
    }
    public PodAntiAffinityBuilder(PodAntiAffinityFluent<?> fluent,PodAntiAffinity instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withPreferredDuringSchedulingIgnoredDuringExecution(instance.getPreferredDuringSchedulingIgnoredDuringExecution()); 
            fluent.withRequiredDuringSchedulingIgnoredDuringExecution(instance.getRequiredDuringSchedulingIgnoredDuringExecution()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodAntiAffinityBuilder(PodAntiAffinity instance){
            this(instance,true);
    }
    public PodAntiAffinityBuilder(PodAntiAffinity instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withPreferredDuringSchedulingIgnoredDuringExecution(instance.getPreferredDuringSchedulingIgnoredDuringExecution()); 
            this.withRequiredDuringSchedulingIgnoredDuringExecution(instance.getRequiredDuringSchedulingIgnoredDuringExecution()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodAntiAffinityBuilder(Validator validator){
            this(new PodAntiAffinity(), true);
    }
    public PodAntiAffinityBuilder(PodAntiAffinityFluent<?> fluent,PodAntiAffinity instance,Validator validator){
            this.fluent = fluent; 
            fluent.withPreferredDuringSchedulingIgnoredDuringExecution(instance.getPreferredDuringSchedulingIgnoredDuringExecution()); 
            fluent.withRequiredDuringSchedulingIgnoredDuringExecution(instance.getRequiredDuringSchedulingIgnoredDuringExecution()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PodAntiAffinityBuilder(PodAntiAffinity instance,Validator validator){
            this.fluent = this; 
            this.withPreferredDuringSchedulingIgnoredDuringExecution(instance.getPreferredDuringSchedulingIgnoredDuringExecution()); 
            this.withRequiredDuringSchedulingIgnoredDuringExecution(instance.getRequiredDuringSchedulingIgnoredDuringExecution()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public PodAntiAffinity build(){
            PodAntiAffinity buildable = new PodAntiAffinity(fluent.getPreferredDuringSchedulingIgnoredDuringExecution(),fluent.getRequiredDuringSchedulingIgnoredDuringExecution());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PodAntiAffinityBuilder that = (PodAntiAffinityBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
