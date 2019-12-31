package io.fabric8.kubernetes.api.model.settings;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PodPresetSpecBuilder extends PodPresetSpecFluentImpl<PodPresetSpecBuilder> implements VisitableBuilder<PodPresetSpec,PodPresetSpecBuilder>{

    PodPresetSpecFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PodPresetSpecBuilder(){
            this(true);
    }
    public PodPresetSpecBuilder(Boolean validationEnabled){
            this(new PodPresetSpec(), validationEnabled);
    }
    public PodPresetSpecBuilder(PodPresetSpecFluent<?> fluent){
            this(fluent, true);
    }
    public PodPresetSpecBuilder(PodPresetSpecFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new PodPresetSpec(), validationEnabled);
    }
    public PodPresetSpecBuilder(PodPresetSpecFluent<?> fluent,PodPresetSpec instance){
            this(fluent, instance, true);
    }
    public PodPresetSpecBuilder(PodPresetSpecFluent<?> fluent,PodPresetSpec instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withEnv(instance.getEnv()); 
            fluent.withEnvFrom(instance.getEnvFrom()); 
            fluent.withSelector(instance.getSelector()); 
            fluent.withVolumeMounts(instance.getVolumeMounts()); 
            fluent.withVolumes(instance.getVolumes()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodPresetSpecBuilder(PodPresetSpec instance){
            this(instance,true);
    }
    public PodPresetSpecBuilder(PodPresetSpec instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withEnv(instance.getEnv()); 
            this.withEnvFrom(instance.getEnvFrom()); 
            this.withSelector(instance.getSelector()); 
            this.withVolumeMounts(instance.getVolumeMounts()); 
            this.withVolumes(instance.getVolumes()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodPresetSpecBuilder(Validator validator){
            this(new PodPresetSpec(), true);
    }
    public PodPresetSpecBuilder(PodPresetSpecFluent<?> fluent,PodPresetSpec instance,Validator validator){
            this.fluent = fluent; 
            fluent.withEnv(instance.getEnv()); 
            fluent.withEnvFrom(instance.getEnvFrom()); 
            fluent.withSelector(instance.getSelector()); 
            fluent.withVolumeMounts(instance.getVolumeMounts()); 
            fluent.withVolumes(instance.getVolumes()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PodPresetSpecBuilder(PodPresetSpec instance,Validator validator){
            this.fluent = this; 
            this.withEnv(instance.getEnv()); 
            this.withEnvFrom(instance.getEnvFrom()); 
            this.withSelector(instance.getSelector()); 
            this.withVolumeMounts(instance.getVolumeMounts()); 
            this.withVolumes(instance.getVolumes()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public PodPresetSpec build(){
            PodPresetSpec buildable = new PodPresetSpec(fluent.getEnv(),fluent.getEnvFrom(),fluent.getSelector(),fluent.getVolumeMounts(),fluent.getVolumes());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PodPresetSpecBuilder that = (PodPresetSpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
