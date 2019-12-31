package io.fabric8.kubernetes.api.model.settings;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PodPresetBuilder extends PodPresetFluentImpl<PodPresetBuilder> implements VisitableBuilder<PodPreset,PodPresetBuilder>{

    PodPresetFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PodPresetBuilder(){
            this(true);
    }
    public PodPresetBuilder(Boolean validationEnabled){
            this(new PodPreset(), validationEnabled);
    }
    public PodPresetBuilder(PodPresetFluent<?> fluent){
            this(fluent, true);
    }
    public PodPresetBuilder(PodPresetFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new PodPreset(), validationEnabled);
    }
    public PodPresetBuilder(PodPresetFluent<?> fluent,PodPreset instance){
            this(fluent, instance, true);
    }
    public PodPresetBuilder(PodPresetFluent<?> fluent,PodPreset instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodPresetBuilder(PodPreset instance){
            this(instance,true);
    }
    public PodPresetBuilder(PodPreset instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.validationEnabled = validationEnabled; 
    }
    public PodPresetBuilder(Validator validator){
            this(new PodPreset(), true);
    }
    public PodPresetBuilder(PodPresetFluent<?> fluent,PodPreset instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PodPresetBuilder(PodPreset instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public PodPreset build(){
            PodPreset buildable = new PodPreset(fluent.getApiVersion(),fluent.getKind(),fluent.getMetadata(),fluent.getSpec());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PodPresetBuilder that = (PodPresetBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
