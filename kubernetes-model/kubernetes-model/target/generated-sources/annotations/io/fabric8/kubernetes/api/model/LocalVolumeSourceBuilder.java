package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class LocalVolumeSourceBuilder extends LocalVolumeSourceFluentImpl<LocalVolumeSourceBuilder> implements VisitableBuilder<LocalVolumeSource,LocalVolumeSourceBuilder>{

    LocalVolumeSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public LocalVolumeSourceBuilder(){
            this(true);
    }
    public LocalVolumeSourceBuilder(Boolean validationEnabled){
            this(new LocalVolumeSource(), validationEnabled);
    }
    public LocalVolumeSourceBuilder(LocalVolumeSourceFluent<?> fluent){
            this(fluent, true);
    }
    public LocalVolumeSourceBuilder(LocalVolumeSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new LocalVolumeSource(), validationEnabled);
    }
    public LocalVolumeSourceBuilder(LocalVolumeSourceFluent<?> fluent,LocalVolumeSource instance){
            this(fluent, instance, true);
    }
    public LocalVolumeSourceBuilder(LocalVolumeSourceFluent<?> fluent,LocalVolumeSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withFsType(instance.getFsType()); 
            fluent.withPath(instance.getPath()); 
            this.validationEnabled = validationEnabled; 
    }
    public LocalVolumeSourceBuilder(LocalVolumeSource instance){
            this(instance,true);
    }
    public LocalVolumeSourceBuilder(LocalVolumeSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withFsType(instance.getFsType()); 
            this.withPath(instance.getPath()); 
            this.validationEnabled = validationEnabled; 
    }
    public LocalVolumeSourceBuilder(Validator validator){
            this(new LocalVolumeSource(), true);
    }
    public LocalVolumeSourceBuilder(LocalVolumeSourceFluent<?> fluent,LocalVolumeSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withFsType(instance.getFsType()); 
            fluent.withPath(instance.getPath()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public LocalVolumeSourceBuilder(LocalVolumeSource instance,Validator validator){
            this.fluent = this; 
            this.withFsType(instance.getFsType()); 
            this.withPath(instance.getPath()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public LocalVolumeSource build(){
            LocalVolumeSource buildable = new LocalVolumeSource(fluent.getFsType(),fluent.getPath());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            LocalVolumeSourceBuilder that = (LocalVolumeSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
