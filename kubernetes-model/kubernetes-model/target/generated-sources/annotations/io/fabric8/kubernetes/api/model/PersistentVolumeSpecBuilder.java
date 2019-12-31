package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class PersistentVolumeSpecBuilder extends PersistentVolumeSpecFluentImpl<PersistentVolumeSpecBuilder> implements VisitableBuilder<PersistentVolumeSpec,PersistentVolumeSpecBuilder>{

    PersistentVolumeSpecFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public PersistentVolumeSpecBuilder(){
            this(true);
    }
    public PersistentVolumeSpecBuilder(Boolean validationEnabled){
            this(new PersistentVolumeSpec(), validationEnabled);
    }
    public PersistentVolumeSpecBuilder(PersistentVolumeSpecFluent<?> fluent){
            this(fluent, true);
    }
    public PersistentVolumeSpecBuilder(PersistentVolumeSpecFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new PersistentVolumeSpec(), validationEnabled);
    }
    public PersistentVolumeSpecBuilder(PersistentVolumeSpecFluent<?> fluent,PersistentVolumeSpec instance){
            this(fluent, instance, true);
    }
    public PersistentVolumeSpecBuilder(PersistentVolumeSpecFluent<?> fluent,PersistentVolumeSpec instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAccessModes(instance.getAccessModes()); 
            fluent.withAwsElasticBlockStore(instance.getAwsElasticBlockStore()); 
            fluent.withAzureDisk(instance.getAzureDisk()); 
            fluent.withAzureFile(instance.getAzureFile()); 
            fluent.withCapacity(instance.getCapacity()); 
            fluent.withCephfs(instance.getCephfs()); 
            fluent.withCinder(instance.getCinder()); 
            fluent.withClaimRef(instance.getClaimRef()); 
            fluent.withCsi(instance.getCsi()); 
            fluent.withFc(instance.getFc()); 
            fluent.withFlexVolume(instance.getFlexVolume()); 
            fluent.withFlocker(instance.getFlocker()); 
            fluent.withGcePersistentDisk(instance.getGcePersistentDisk()); 
            fluent.withGlusterfs(instance.getGlusterfs()); 
            fluent.withHostPath(instance.getHostPath()); 
            fluent.withIscsi(instance.getIscsi()); 
            fluent.withLocal(instance.getLocal()); 
            fluent.withMountOptions(instance.getMountOptions()); 
            fluent.withNfs(instance.getNfs()); 
            fluent.withNodeAffinity(instance.getNodeAffinity()); 
            fluent.withPersistentVolumeReclaimPolicy(instance.getPersistentVolumeReclaimPolicy()); 
            fluent.withPhotonPersistentDisk(instance.getPhotonPersistentDisk()); 
            fluent.withPortworxVolume(instance.getPortworxVolume()); 
            fluent.withQuobyte(instance.getQuobyte()); 
            fluent.withRbd(instance.getRbd()); 
            fluent.withScaleIO(instance.getScaleIO()); 
            fluent.withStorageClassName(instance.getStorageClassName()); 
            fluent.withStorageos(instance.getStorageos()); 
            fluent.withVolumeMode(instance.getVolumeMode()); 
            fluent.withVsphereVolume(instance.getVsphereVolume()); 
            this.validationEnabled = validationEnabled; 
    }
    public PersistentVolumeSpecBuilder(PersistentVolumeSpec instance){
            this(instance,true);
    }
    public PersistentVolumeSpecBuilder(PersistentVolumeSpec instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAccessModes(instance.getAccessModes()); 
            this.withAwsElasticBlockStore(instance.getAwsElasticBlockStore()); 
            this.withAzureDisk(instance.getAzureDisk()); 
            this.withAzureFile(instance.getAzureFile()); 
            this.withCapacity(instance.getCapacity()); 
            this.withCephfs(instance.getCephfs()); 
            this.withCinder(instance.getCinder()); 
            this.withClaimRef(instance.getClaimRef()); 
            this.withCsi(instance.getCsi()); 
            this.withFc(instance.getFc()); 
            this.withFlexVolume(instance.getFlexVolume()); 
            this.withFlocker(instance.getFlocker()); 
            this.withGcePersistentDisk(instance.getGcePersistentDisk()); 
            this.withGlusterfs(instance.getGlusterfs()); 
            this.withHostPath(instance.getHostPath()); 
            this.withIscsi(instance.getIscsi()); 
            this.withLocal(instance.getLocal()); 
            this.withMountOptions(instance.getMountOptions()); 
            this.withNfs(instance.getNfs()); 
            this.withNodeAffinity(instance.getNodeAffinity()); 
            this.withPersistentVolumeReclaimPolicy(instance.getPersistentVolumeReclaimPolicy()); 
            this.withPhotonPersistentDisk(instance.getPhotonPersistentDisk()); 
            this.withPortworxVolume(instance.getPortworxVolume()); 
            this.withQuobyte(instance.getQuobyte()); 
            this.withRbd(instance.getRbd()); 
            this.withScaleIO(instance.getScaleIO()); 
            this.withStorageClassName(instance.getStorageClassName()); 
            this.withStorageos(instance.getStorageos()); 
            this.withVolumeMode(instance.getVolumeMode()); 
            this.withVsphereVolume(instance.getVsphereVolume()); 
            this.validationEnabled = validationEnabled; 
    }
    public PersistentVolumeSpecBuilder(Validator validator){
            this(new PersistentVolumeSpec(), true);
    }
    public PersistentVolumeSpecBuilder(PersistentVolumeSpecFluent<?> fluent,PersistentVolumeSpec instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAccessModes(instance.getAccessModes()); 
            fluent.withAwsElasticBlockStore(instance.getAwsElasticBlockStore()); 
            fluent.withAzureDisk(instance.getAzureDisk()); 
            fluent.withAzureFile(instance.getAzureFile()); 
            fluent.withCapacity(instance.getCapacity()); 
            fluent.withCephfs(instance.getCephfs()); 
            fluent.withCinder(instance.getCinder()); 
            fluent.withClaimRef(instance.getClaimRef()); 
            fluent.withCsi(instance.getCsi()); 
            fluent.withFc(instance.getFc()); 
            fluent.withFlexVolume(instance.getFlexVolume()); 
            fluent.withFlocker(instance.getFlocker()); 
            fluent.withGcePersistentDisk(instance.getGcePersistentDisk()); 
            fluent.withGlusterfs(instance.getGlusterfs()); 
            fluent.withHostPath(instance.getHostPath()); 
            fluent.withIscsi(instance.getIscsi()); 
            fluent.withLocal(instance.getLocal()); 
            fluent.withMountOptions(instance.getMountOptions()); 
            fluent.withNfs(instance.getNfs()); 
            fluent.withNodeAffinity(instance.getNodeAffinity()); 
            fluent.withPersistentVolumeReclaimPolicy(instance.getPersistentVolumeReclaimPolicy()); 
            fluent.withPhotonPersistentDisk(instance.getPhotonPersistentDisk()); 
            fluent.withPortworxVolume(instance.getPortworxVolume()); 
            fluent.withQuobyte(instance.getQuobyte()); 
            fluent.withRbd(instance.getRbd()); 
            fluent.withScaleIO(instance.getScaleIO()); 
            fluent.withStorageClassName(instance.getStorageClassName()); 
            fluent.withStorageos(instance.getStorageos()); 
            fluent.withVolumeMode(instance.getVolumeMode()); 
            fluent.withVsphereVolume(instance.getVsphereVolume()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public PersistentVolumeSpecBuilder(PersistentVolumeSpec instance,Validator validator){
            this.fluent = this; 
            this.withAccessModes(instance.getAccessModes()); 
            this.withAwsElasticBlockStore(instance.getAwsElasticBlockStore()); 
            this.withAzureDisk(instance.getAzureDisk()); 
            this.withAzureFile(instance.getAzureFile()); 
            this.withCapacity(instance.getCapacity()); 
            this.withCephfs(instance.getCephfs()); 
            this.withCinder(instance.getCinder()); 
            this.withClaimRef(instance.getClaimRef()); 
            this.withCsi(instance.getCsi()); 
            this.withFc(instance.getFc()); 
            this.withFlexVolume(instance.getFlexVolume()); 
            this.withFlocker(instance.getFlocker()); 
            this.withGcePersistentDisk(instance.getGcePersistentDisk()); 
            this.withGlusterfs(instance.getGlusterfs()); 
            this.withHostPath(instance.getHostPath()); 
            this.withIscsi(instance.getIscsi()); 
            this.withLocal(instance.getLocal()); 
            this.withMountOptions(instance.getMountOptions()); 
            this.withNfs(instance.getNfs()); 
            this.withNodeAffinity(instance.getNodeAffinity()); 
            this.withPersistentVolumeReclaimPolicy(instance.getPersistentVolumeReclaimPolicy()); 
            this.withPhotonPersistentDisk(instance.getPhotonPersistentDisk()); 
            this.withPortworxVolume(instance.getPortworxVolume()); 
            this.withQuobyte(instance.getQuobyte()); 
            this.withRbd(instance.getRbd()); 
            this.withScaleIO(instance.getScaleIO()); 
            this.withStorageClassName(instance.getStorageClassName()); 
            this.withStorageos(instance.getStorageos()); 
            this.withVolumeMode(instance.getVolumeMode()); 
            this.withVsphereVolume(instance.getVsphereVolume()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public PersistentVolumeSpec build(){
            PersistentVolumeSpec buildable = new PersistentVolumeSpec(fluent.getAccessModes(),fluent.getAwsElasticBlockStore(),fluent.getAzureDisk(),fluent.getAzureFile(),fluent.getCapacity(),fluent.getCephfs(),fluent.getCinder(),fluent.getClaimRef(),fluent.getCsi(),fluent.getFc(),fluent.getFlexVolume(),fluent.getFlocker(),fluent.getGcePersistentDisk(),fluent.getGlusterfs(),fluent.getHostPath(),fluent.getIscsi(),fluent.getLocal(),fluent.getMountOptions(),fluent.getNfs(),fluent.getNodeAffinity(),fluent.getPersistentVolumeReclaimPolicy(),fluent.getPhotonPersistentDisk(),fluent.getPortworxVolume(),fluent.getQuobyte(),fluent.getRbd(),fluent.getScaleIO(),fluent.getStorageClassName(),fluent.getStorageos(),fluent.getVolumeMode(),fluent.getVsphereVolume());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PersistentVolumeSpecBuilder that = (PersistentVolumeSpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
