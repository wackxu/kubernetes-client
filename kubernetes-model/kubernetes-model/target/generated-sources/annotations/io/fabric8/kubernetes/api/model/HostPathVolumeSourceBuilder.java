package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class HostPathVolumeSourceBuilder extends HostPathVolumeSourceFluentImpl<HostPathVolumeSourceBuilder> implements VisitableBuilder<HostPathVolumeSource,HostPathVolumeSourceBuilder>{

    HostPathVolumeSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public HostPathVolumeSourceBuilder(){
            this(true);
    }
    public HostPathVolumeSourceBuilder(Boolean validationEnabled){
            this(new HostPathVolumeSource(), validationEnabled);
    }
    public HostPathVolumeSourceBuilder(HostPathVolumeSourceFluent<?> fluent){
            this(fluent, true);
    }
    public HostPathVolumeSourceBuilder(HostPathVolumeSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new HostPathVolumeSource(), validationEnabled);
    }
    public HostPathVolumeSourceBuilder(HostPathVolumeSourceFluent<?> fluent,HostPathVolumeSource instance){
            this(fluent, instance, true);
    }
    public HostPathVolumeSourceBuilder(HostPathVolumeSourceFluent<?> fluent,HostPathVolumeSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withPath(instance.getPath()); 
            fluent.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public HostPathVolumeSourceBuilder(HostPathVolumeSource instance){
            this(instance,true);
    }
    public HostPathVolumeSourceBuilder(HostPathVolumeSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withPath(instance.getPath()); 
            this.withType(instance.getType()); 
            this.validationEnabled = validationEnabled; 
    }
    public HostPathVolumeSourceBuilder(Validator validator){
            this(new HostPathVolumeSource(), true);
    }
    public HostPathVolumeSourceBuilder(HostPathVolumeSourceFluent<?> fluent,HostPathVolumeSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withPath(instance.getPath()); 
            fluent.withType(instance.getType()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public HostPathVolumeSourceBuilder(HostPathVolumeSource instance,Validator validator){
            this.fluent = this; 
            this.withPath(instance.getPath()); 
            this.withType(instance.getType()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public HostPathVolumeSource build(){
            HostPathVolumeSource buildable = new HostPathVolumeSource(fluent.getPath(),fluent.getType());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            HostPathVolumeSourceBuilder that = (HostPathVolumeSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
