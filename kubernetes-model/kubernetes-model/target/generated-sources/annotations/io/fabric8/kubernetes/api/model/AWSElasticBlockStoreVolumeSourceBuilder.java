package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class AWSElasticBlockStoreVolumeSourceBuilder extends AWSElasticBlockStoreVolumeSourceFluentImpl<AWSElasticBlockStoreVolumeSourceBuilder> implements VisitableBuilder<AWSElasticBlockStoreVolumeSource,AWSElasticBlockStoreVolumeSourceBuilder>{

    AWSElasticBlockStoreVolumeSourceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public AWSElasticBlockStoreVolumeSourceBuilder(){
            this(true);
    }
    public AWSElasticBlockStoreVolumeSourceBuilder(Boolean validationEnabled){
            this(new AWSElasticBlockStoreVolumeSource(), validationEnabled);
    }
    public AWSElasticBlockStoreVolumeSourceBuilder(AWSElasticBlockStoreVolumeSourceFluent<?> fluent){
            this(fluent, true);
    }
    public AWSElasticBlockStoreVolumeSourceBuilder(AWSElasticBlockStoreVolumeSourceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new AWSElasticBlockStoreVolumeSource(), validationEnabled);
    }
    public AWSElasticBlockStoreVolumeSourceBuilder(AWSElasticBlockStoreVolumeSourceFluent<?> fluent,AWSElasticBlockStoreVolumeSource instance){
            this(fluent, instance, true);
    }
    public AWSElasticBlockStoreVolumeSourceBuilder(AWSElasticBlockStoreVolumeSourceFluent<?> fluent,AWSElasticBlockStoreVolumeSource instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withFsType(instance.getFsType()); 
            fluent.withPartition(instance.getPartition()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            fluent.withVolumeID(instance.getVolumeID()); 
            this.validationEnabled = validationEnabled; 
    }
    public AWSElasticBlockStoreVolumeSourceBuilder(AWSElasticBlockStoreVolumeSource instance){
            this(instance,true);
    }
    public AWSElasticBlockStoreVolumeSourceBuilder(AWSElasticBlockStoreVolumeSource instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withFsType(instance.getFsType()); 
            this.withPartition(instance.getPartition()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withVolumeID(instance.getVolumeID()); 
            this.validationEnabled = validationEnabled; 
    }
    public AWSElasticBlockStoreVolumeSourceBuilder(Validator validator){
            this(new AWSElasticBlockStoreVolumeSource(), true);
    }
    public AWSElasticBlockStoreVolumeSourceBuilder(AWSElasticBlockStoreVolumeSourceFluent<?> fluent,AWSElasticBlockStoreVolumeSource instance,Validator validator){
            this.fluent = fluent; 
            fluent.withFsType(instance.getFsType()); 
            fluent.withPartition(instance.getPartition()); 
            fluent.withReadOnly(instance.getReadOnly()); 
            fluent.withVolumeID(instance.getVolumeID()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public AWSElasticBlockStoreVolumeSourceBuilder(AWSElasticBlockStoreVolumeSource instance,Validator validator){
            this.fluent = this; 
            this.withFsType(instance.getFsType()); 
            this.withPartition(instance.getPartition()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withVolumeID(instance.getVolumeID()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public AWSElasticBlockStoreVolumeSource build(){
            AWSElasticBlockStoreVolumeSource buildable = new AWSElasticBlockStoreVolumeSource(fluent.getFsType(),fluent.getPartition(),fluent.isReadOnly(),fluent.getVolumeID());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            AWSElasticBlockStoreVolumeSourceBuilder that = (AWSElasticBlockStoreVolumeSourceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
