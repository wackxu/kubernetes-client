package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class GlusterfsVolumeSourceBuilder extends GlusterfsVolumeSourceFluentImpl<GlusterfsVolumeSourceBuilder> implements VisitableBuilder<GlusterfsVolumeSource,GlusterfsVolumeSourceBuilder>{

    GlusterfsVolumeSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public GlusterfsVolumeSourceBuilder(){
            this(true);
    }
    public GlusterfsVolumeSourceBuilder(Boolean validationEnabled){
            this(new GlusterfsVolumeSource(), validationEnabled);
    }
    public GlusterfsVolumeSourceBuilder(GlusterfsVolumeSourceFluent<?> fluent){
            this(fluent, true);
    }
    public GlusterfsVolumeSourceBuilder(GlusterfsVolumeSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new GlusterfsVolumeSource(), validationEnabled);
    }
    public GlusterfsVolumeSourceBuilder(GlusterfsVolumeSourceFluent<?> fluent,GlusterfsVolumeSource instance){
            this(fluent, instance, true);
    }
    public GlusterfsVolumeSourceBuilder(GlusterfsVolumeSourceFluent<?> fluent,GlusterfsVolumeSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withEndpoints(instance.getEndpoints()); 
            fluent.withPath(instance.getPath()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            this.validationEnabled = validationEnabled; 
    }
    public GlusterfsVolumeSourceBuilder(GlusterfsVolumeSource instance){
            this(instance,true);
    }
    public GlusterfsVolumeSourceBuilder(GlusterfsVolumeSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withEndpoints(instance.getEndpoints()); 
            this.withPath(instance.getPath()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.validationEnabled = validationEnabled; 
    }
    public GlusterfsVolumeSourceBuilder(Validator validator){
            this(new GlusterfsVolumeSource(), true);
    }
    public GlusterfsVolumeSourceBuilder(GlusterfsVolumeSourceFluent<?> fluent,GlusterfsVolumeSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withEndpoints(instance.getEndpoints()); 
            fluent.withPath(instance.getPath()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public GlusterfsVolumeSourceBuilder(GlusterfsVolumeSource instance,Validator validator){
            this.fluent = this; 
            this.withEndpoints(instance.getEndpoints()); 
            this.withPath(instance.getPath()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public GlusterfsVolumeSource build(){
            GlusterfsVolumeSource buildable = new GlusterfsVolumeSource(fluent.getEndpoints(),fluent.getPath(),fluent.isReadOnly());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            GlusterfsVolumeSourceBuilder that = (GlusterfsVolumeSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
