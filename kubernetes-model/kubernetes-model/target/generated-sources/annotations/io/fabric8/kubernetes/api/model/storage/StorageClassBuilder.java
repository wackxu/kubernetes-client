package io.fabric8.kubernetes.api.model.storage;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class StorageClassBuilder extends StorageClassFluentImpl<StorageClassBuilder> implements VisitableBuilder<StorageClass,StorageClassBuilder>{

    StorageClassFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public StorageClassBuilder(){
            this(true);
    }
    public StorageClassBuilder(Boolean validationEnabled){
            this(new StorageClass(), validationEnabled);
    }
    public StorageClassBuilder(StorageClassFluent<?> fluent){
            this(fluent, true);
    }
    public StorageClassBuilder(StorageClassFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new StorageClass(), validationEnabled);
    }
    public StorageClassBuilder(StorageClassFluent<?> fluent,StorageClass instance){
            this(fluent, instance, true);
    }
    public StorageClassBuilder(StorageClassFluent<?> fluent,StorageClass instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAllowVolumeExpansion(instance.getAllowVolumeExpansion()); 
            fluent.withAllowedTopologies(instance.getAllowedTopologies()); 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withMountOptions(instance.getMountOptions()); 
            fluent.withParameters(instance.getParameters()); 
            fluent.withProvisioner(instance.getProvisioner()); 
            fluent.withReclaimPolicy(instance.getReclaimPolicy()); 
            fluent.withVolumeBindingMode(instance.getVolumeBindingMode()); 
            this.validationEnabled = validationEnabled; 
    }
    public StorageClassBuilder(StorageClass instance){
            this(instance,true);
    }
    public StorageClassBuilder(StorageClass instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAllowVolumeExpansion(instance.getAllowVolumeExpansion()); 
            this.withAllowedTopologies(instance.getAllowedTopologies()); 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withMountOptions(instance.getMountOptions()); 
            this.withParameters(instance.getParameters()); 
            this.withProvisioner(instance.getProvisioner()); 
            this.withReclaimPolicy(instance.getReclaimPolicy()); 
            this.withVolumeBindingMode(instance.getVolumeBindingMode()); 
            this.validationEnabled = validationEnabled; 
    }
    public StorageClassBuilder(Validator validator){
            this(new StorageClass(), true);
    }
    public StorageClassBuilder(StorageClassFluent<?> fluent,StorageClass instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAllowVolumeExpansion(instance.getAllowVolumeExpansion()); 
            fluent.withAllowedTopologies(instance.getAllowedTopologies()); 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withMountOptions(instance.getMountOptions()); 
            fluent.withParameters(instance.getParameters()); 
            fluent.withProvisioner(instance.getProvisioner()); 
            fluent.withReclaimPolicy(instance.getReclaimPolicy()); 
            fluent.withVolumeBindingMode(instance.getVolumeBindingMode()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public StorageClassBuilder(StorageClass instance,Validator validator){
            this.fluent = this; 
            this.withAllowVolumeExpansion(instance.getAllowVolumeExpansion()); 
            this.withAllowedTopologies(instance.getAllowedTopologies()); 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withMountOptions(instance.getMountOptions()); 
            this.withParameters(instance.getParameters()); 
            this.withProvisioner(instance.getProvisioner()); 
            this.withReclaimPolicy(instance.getReclaimPolicy()); 
            this.withVolumeBindingMode(instance.getVolumeBindingMode()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public StorageClass build(){
            StorageClass buildable = new StorageClass(fluent.isAllowVolumeExpansion(),fluent.getAllowedTopologies(),fluent.getApiVersion(),fluent.getKind(),fluent.getMetadata(),fluent.getMountOptions(),fluent.getParameters(),fluent.getProvisioner(),fluent.getReclaimPolicy(),fluent.getVolumeBindingMode());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            StorageClassBuilder that = (StorageClassBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
