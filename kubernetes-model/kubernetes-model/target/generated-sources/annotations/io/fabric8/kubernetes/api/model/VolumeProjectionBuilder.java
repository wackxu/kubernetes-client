package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class VolumeProjectionBuilder extends VolumeProjectionFluentImpl<VolumeProjectionBuilder> implements VisitableBuilder<VolumeProjection,VolumeProjectionBuilder>{

    VolumeProjectionFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public VolumeProjectionBuilder(){
            this(true);
    }
    public VolumeProjectionBuilder(Boolean validationEnabled){
            this(new VolumeProjection(), validationEnabled);
    }
    public VolumeProjectionBuilder(VolumeProjectionFluent<?> fluent){
            this(fluent, true);
    }
    public VolumeProjectionBuilder(VolumeProjectionFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new VolumeProjection(), validationEnabled);
    }
    public VolumeProjectionBuilder(VolumeProjectionFluent<?> fluent,VolumeProjection instance){
            this(fluent, instance, true);
    }
    public VolumeProjectionBuilder(VolumeProjectionFluent<?> fluent,VolumeProjection instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withConfigMap(instance.getConfigMap()); 
            fluent.withDownwardAPI(instance.getDownwardAPI()); 
            fluent.withSecret(instance.getSecret()); 
            fluent.withServiceAccountToken(instance.getServiceAccountToken()); 
            this.validationEnabled = validationEnabled; 
    }
    public VolumeProjectionBuilder(VolumeProjection instance){
            this(instance,true);
    }
    public VolumeProjectionBuilder(VolumeProjection instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withConfigMap(instance.getConfigMap()); 
            this.withDownwardAPI(instance.getDownwardAPI()); 
            this.withSecret(instance.getSecret()); 
            this.withServiceAccountToken(instance.getServiceAccountToken()); 
            this.validationEnabled = validationEnabled; 
    }
    public VolumeProjectionBuilder(Validator validator){
            this(new VolumeProjection(), true);
    }
    public VolumeProjectionBuilder(VolumeProjectionFluent<?> fluent,VolumeProjection instance,Validator validator){
            this.fluent = fluent; 
            fluent.withConfigMap(instance.getConfigMap()); 
            fluent.withDownwardAPI(instance.getDownwardAPI()); 
            fluent.withSecret(instance.getSecret()); 
            fluent.withServiceAccountToken(instance.getServiceAccountToken()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public VolumeProjectionBuilder(VolumeProjection instance,Validator validator){
            this.fluent = this; 
            this.withConfigMap(instance.getConfigMap()); 
            this.withDownwardAPI(instance.getDownwardAPI()); 
            this.withSecret(instance.getSecret()); 
            this.withServiceAccountToken(instance.getServiceAccountToken()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public VolumeProjection build(){
            VolumeProjection buildable = new VolumeProjection(fluent.getConfigMap(),fluent.getDownwardAPI(),fluent.getSecret(),fluent.getServiceAccountToken());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            VolumeProjectionBuilder that = (VolumeProjectionBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
