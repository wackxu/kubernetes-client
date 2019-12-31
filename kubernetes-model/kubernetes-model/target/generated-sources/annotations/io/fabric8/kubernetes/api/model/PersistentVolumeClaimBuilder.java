package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PersistentVolumeClaimBuilder extends PersistentVolumeClaimFluentImpl<PersistentVolumeClaimBuilder> implements VisitableBuilder<PersistentVolumeClaim,PersistentVolumeClaimBuilder>{

    PersistentVolumeClaimFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PersistentVolumeClaimBuilder(){
            this(true);
    }
    public PersistentVolumeClaimBuilder(Boolean validationEnabled){
            this(new PersistentVolumeClaim(), validationEnabled);
    }
    public PersistentVolumeClaimBuilder(PersistentVolumeClaimFluent<?> fluent){
            this(fluent, true);
    }
    public PersistentVolumeClaimBuilder(PersistentVolumeClaimFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new PersistentVolumeClaim(), validationEnabled);
    }
    public PersistentVolumeClaimBuilder(PersistentVolumeClaimFluent<?> fluent,PersistentVolumeClaim instance){
            this(fluent, instance, true);
    }
    public PersistentVolumeClaimBuilder(PersistentVolumeClaimFluent<?> fluent,PersistentVolumeClaim instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            fluent.withStatus(instance.getStatus()); 
            this.validationEnabled = validationEnabled; 
    }
    public PersistentVolumeClaimBuilder(PersistentVolumeClaim instance){
            this(instance,true);
    }
    public PersistentVolumeClaimBuilder(PersistentVolumeClaim instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.withStatus(instance.getStatus()); 
            this.validationEnabled = validationEnabled; 
    }
    public PersistentVolumeClaimBuilder(Validator validator){
            this(new PersistentVolumeClaim(), true);
    }
    public PersistentVolumeClaimBuilder(PersistentVolumeClaimFluent<?> fluent,PersistentVolumeClaim instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withSpec(instance.getSpec()); 
            fluent.withStatus(instance.getStatus()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PersistentVolumeClaimBuilder(PersistentVolumeClaim instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.withStatus(instance.getStatus()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public PersistentVolumeClaim build(){
            PersistentVolumeClaim buildable = new PersistentVolumeClaim(fluent.getApiVersion(),fluent.getKind(),fluent.getMetadata(),fluent.getSpec(),fluent.getStatus());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PersistentVolumeClaimBuilder that = (PersistentVolumeClaimBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
