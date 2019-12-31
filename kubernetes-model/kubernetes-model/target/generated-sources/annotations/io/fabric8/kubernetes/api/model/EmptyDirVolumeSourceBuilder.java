package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class EmptyDirVolumeSourceBuilder extends EmptyDirVolumeSourceFluentImpl<EmptyDirVolumeSourceBuilder> implements VisitableBuilder<EmptyDirVolumeSource,EmptyDirVolumeSourceBuilder>{

    EmptyDirVolumeSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public EmptyDirVolumeSourceBuilder(){
            this(true);
    }
    public EmptyDirVolumeSourceBuilder(Boolean validationEnabled){
            this(new EmptyDirVolumeSource(), validationEnabled);
    }
    public EmptyDirVolumeSourceBuilder(EmptyDirVolumeSourceFluent<?> fluent){
            this(fluent, true);
    }
    public EmptyDirVolumeSourceBuilder(EmptyDirVolumeSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new EmptyDirVolumeSource(), validationEnabled);
    }
    public EmptyDirVolumeSourceBuilder(EmptyDirVolumeSourceFluent<?> fluent,EmptyDirVolumeSource instance){
            this(fluent, instance, true);
    }
    public EmptyDirVolumeSourceBuilder(EmptyDirVolumeSourceFluent<?> fluent,EmptyDirVolumeSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withMedium(instance.getMedium()); 
            fluent.withSizeLimit(instance.getSizeLimit()); 
            this.validationEnabled = validationEnabled; 
    }
    public EmptyDirVolumeSourceBuilder(EmptyDirVolumeSource instance){
            this(instance,true);
    }
    public EmptyDirVolumeSourceBuilder(EmptyDirVolumeSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withMedium(instance.getMedium()); 
            this.withSizeLimit(instance.getSizeLimit()); 
            this.validationEnabled = validationEnabled; 
    }
    public EmptyDirVolumeSourceBuilder(Validator validator){
            this(new EmptyDirVolumeSource(), true);
    }
    public EmptyDirVolumeSourceBuilder(EmptyDirVolumeSourceFluent<?> fluent,EmptyDirVolumeSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withMedium(instance.getMedium()); 
            fluent.withSizeLimit(instance.getSizeLimit()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public EmptyDirVolumeSourceBuilder(EmptyDirVolumeSource instance,Validator validator){
            this.fluent = this; 
            this.withMedium(instance.getMedium()); 
            this.withSizeLimit(instance.getSizeLimit()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public EmptyDirVolumeSource build(){
            EmptyDirVolumeSource buildable = new EmptyDirVolumeSource(fluent.getMedium(),fluent.getSizeLimit());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            EmptyDirVolumeSourceBuilder that = (EmptyDirVolumeSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
