package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class GlusterfsPersistentVolumeSourceBuilder extends GlusterfsPersistentVolumeSourceFluentImpl<GlusterfsPersistentVolumeSourceBuilder> implements VisitableBuilder<GlusterfsPersistentVolumeSource,GlusterfsPersistentVolumeSourceBuilder>{

    GlusterfsPersistentVolumeSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public GlusterfsPersistentVolumeSourceBuilder(){
            this(true);
    }
    public GlusterfsPersistentVolumeSourceBuilder(Boolean validationEnabled){
            this(new GlusterfsPersistentVolumeSource(), validationEnabled);
    }
    public GlusterfsPersistentVolumeSourceBuilder(GlusterfsPersistentVolumeSourceFluent<?> fluent){
            this(fluent, true);
    }
    public GlusterfsPersistentVolumeSourceBuilder(GlusterfsPersistentVolumeSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new GlusterfsPersistentVolumeSource(), validationEnabled);
    }
    public GlusterfsPersistentVolumeSourceBuilder(GlusterfsPersistentVolumeSourceFluent<?> fluent,GlusterfsPersistentVolumeSource instance){
            this(fluent, instance, true);
    }
    public GlusterfsPersistentVolumeSourceBuilder(GlusterfsPersistentVolumeSourceFluent<?> fluent,GlusterfsPersistentVolumeSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withEndpoints(instance.getEndpoints()); 
            fluent.withEndpointsNamespace(instance.getEndpointsNamespace()); 
            fluent.withPath(instance.getPath()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            this.validationEnabled = validationEnabled; 
    }
    public GlusterfsPersistentVolumeSourceBuilder(GlusterfsPersistentVolumeSource instance){
            this(instance,true);
    }
    public GlusterfsPersistentVolumeSourceBuilder(GlusterfsPersistentVolumeSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withEndpoints(instance.getEndpoints()); 
            this.withEndpointsNamespace(instance.getEndpointsNamespace()); 
            this.withPath(instance.getPath()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.validationEnabled = validationEnabled; 
    }
    public GlusterfsPersistentVolumeSourceBuilder(Validator validator){
            this(new GlusterfsPersistentVolumeSource(), true);
    }
    public GlusterfsPersistentVolumeSourceBuilder(GlusterfsPersistentVolumeSourceFluent<?> fluent,GlusterfsPersistentVolumeSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withEndpoints(instance.getEndpoints()); 
            fluent.withEndpointsNamespace(instance.getEndpointsNamespace()); 
            fluent.withPath(instance.getPath()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public GlusterfsPersistentVolumeSourceBuilder(GlusterfsPersistentVolumeSource instance,Validator validator){
            this.fluent = this; 
            this.withEndpoints(instance.getEndpoints()); 
            this.withEndpointsNamespace(instance.getEndpointsNamespace()); 
            this.withPath(instance.getPath()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public GlusterfsPersistentVolumeSource build(){
            GlusterfsPersistentVolumeSource buildable = new GlusterfsPersistentVolumeSource(fluent.getEndpoints(),fluent.getEndpointsNamespace(),fluent.getPath(),fluent.isReadOnly());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            GlusterfsPersistentVolumeSourceBuilder that = (GlusterfsPersistentVolumeSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
