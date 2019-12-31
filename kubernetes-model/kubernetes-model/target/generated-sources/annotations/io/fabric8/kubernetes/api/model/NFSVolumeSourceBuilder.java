package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class NFSVolumeSourceBuilder extends NFSVolumeSourceFluentImpl<NFSVolumeSourceBuilder> implements VisitableBuilder<NFSVolumeSource,NFSVolumeSourceBuilder>{

    NFSVolumeSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public NFSVolumeSourceBuilder(){
            this(true);
    }
    public NFSVolumeSourceBuilder(Boolean validationEnabled){
            this(new NFSVolumeSource(), validationEnabled);
    }
    public NFSVolumeSourceBuilder(NFSVolumeSourceFluent<?> fluent){
            this(fluent, true);
    }
    public NFSVolumeSourceBuilder(NFSVolumeSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new NFSVolumeSource(), validationEnabled);
    }
    public NFSVolumeSourceBuilder(NFSVolumeSourceFluent<?> fluent,NFSVolumeSource instance){
            this(fluent, instance, true);
    }
    public NFSVolumeSourceBuilder(NFSVolumeSourceFluent<?> fluent,NFSVolumeSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withPath(instance.getPath()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            fluent.withServer(instance.getServer()); 
            this.validationEnabled = validationEnabled; 
    }
    public NFSVolumeSourceBuilder(NFSVolumeSource instance){
            this(instance,true);
    }
    public NFSVolumeSourceBuilder(NFSVolumeSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withPath(instance.getPath()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withServer(instance.getServer()); 
            this.validationEnabled = validationEnabled; 
    }
    public NFSVolumeSourceBuilder(Validator validator){
            this(new NFSVolumeSource(), true);
    }
    public NFSVolumeSourceBuilder(NFSVolumeSourceFluent<?> fluent,NFSVolumeSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withPath(instance.getPath()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            fluent.withServer(instance.getServer()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public NFSVolumeSourceBuilder(NFSVolumeSource instance,Validator validator){
            this.fluent = this; 
            this.withPath(instance.getPath()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withServer(instance.getServer()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public NFSVolumeSource build(){
            NFSVolumeSource buildable = new NFSVolumeSource(fluent.getPath(),fluent.isReadOnly(),fluent.getServer());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NFSVolumeSourceBuilder that = (NFSVolumeSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
