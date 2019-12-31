package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class DownwardAPIVolumeSourceBuilder extends DownwardAPIVolumeSourceFluentImpl<DownwardAPIVolumeSourceBuilder> implements VisitableBuilder<DownwardAPIVolumeSource,DownwardAPIVolumeSourceBuilder>{

    DownwardAPIVolumeSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public DownwardAPIVolumeSourceBuilder(){
            this(true);
    }
    public DownwardAPIVolumeSourceBuilder(Boolean validationEnabled){
            this(new DownwardAPIVolumeSource(), validationEnabled);
    }
    public DownwardAPIVolumeSourceBuilder(DownwardAPIVolumeSourceFluent<?> fluent){
            this(fluent, true);
    }
    public DownwardAPIVolumeSourceBuilder(DownwardAPIVolumeSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new DownwardAPIVolumeSource(), validationEnabled);
    }
    public DownwardAPIVolumeSourceBuilder(DownwardAPIVolumeSourceFluent<?> fluent,DownwardAPIVolumeSource instance){
            this(fluent, instance, true);
    }
    public DownwardAPIVolumeSourceBuilder(DownwardAPIVolumeSourceFluent<?> fluent,DownwardAPIVolumeSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withDefaultMode(instance.getDefaultMode()); 
            fluent.withItems(instance.getItems()); 
            this.validationEnabled = validationEnabled; 
    }
    public DownwardAPIVolumeSourceBuilder(DownwardAPIVolumeSource instance){
            this(instance,true);
    }
    public DownwardAPIVolumeSourceBuilder(DownwardAPIVolumeSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withDefaultMode(instance.getDefaultMode()); 
            this.withItems(instance.getItems()); 
            this.validationEnabled = validationEnabled; 
    }
    public DownwardAPIVolumeSourceBuilder(Validator validator){
            this(new DownwardAPIVolumeSource(), true);
    }
    public DownwardAPIVolumeSourceBuilder(DownwardAPIVolumeSourceFluent<?> fluent,DownwardAPIVolumeSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withDefaultMode(instance.getDefaultMode()); 
            fluent.withItems(instance.getItems()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public DownwardAPIVolumeSourceBuilder(DownwardAPIVolumeSource instance,Validator validator){
            this.fluent = this; 
            this.withDefaultMode(instance.getDefaultMode()); 
            this.withItems(instance.getItems()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public DownwardAPIVolumeSource build(){
            DownwardAPIVolumeSource buildable = new DownwardAPIVolumeSource(fluent.getDefaultMode(),fluent.getItems());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DownwardAPIVolumeSourceBuilder that = (DownwardAPIVolumeSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
