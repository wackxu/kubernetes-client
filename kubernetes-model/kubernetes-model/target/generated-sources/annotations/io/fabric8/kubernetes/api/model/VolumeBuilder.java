package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class VolumeBuilder extends VolumeFluentImpl<VolumeBuilder> implements VisitableBuilder<Volume,VolumeBuilder>{

    VolumeFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public VolumeBuilder(){
            this(true);
    }
    public VolumeBuilder(Boolean validationEnabled){
            this(new Volume(), validationEnabled);
    }
    public VolumeBuilder(VolumeFluent<?> fluent){
            this(fluent, true);
    }
    public VolumeBuilder(VolumeFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new Volume(), validationEnabled);
    }
    public VolumeBuilder(VolumeFluent<?> fluent,Volume instance){
            this(fluent, instance, true);
    }
    public VolumeBuilder(VolumeFluent<?> fluent,Volume instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAwsElasticBlockStore(instance.getAwsElasticBlockStore()); 
            fluent.withAzureDisk(instance.getAzureDisk()); 
            fluent.withAzureFile(instance.getAzureFile()); 
            fluent.withCephfs(instance.getCephfs()); 
            fluent.withCinder(instance.getCinder()); 
            fluent.withConfigMap(instance.getConfigMap()); 
            fluent.withDownwardAPI(instance.getDownwardAPI()); 
            fluent.withEmptyDir(instance.getEmptyDir()); 
            fluent.withFc(instance.getFc()); 
            fluent.withFlexVolume(instance.getFlexVolume()); 
            fluent.withFlocker(instance.getFlocker()); 
            fluent.withGcePersistentDisk(instance.getGcePersistentDisk()); 
            fluent.withGitRepo(instance.getGitRepo()); 
            fluent.withGlusterfs(instance.getGlusterfs()); 
            fluent.withHostPath(instance.getHostPath()); 
            fluent.withIscsi(instance.getIscsi()); 
            fluent.withName(instance.getName()); 
            fluent.withNfs(instance.getNfs()); 
            fluent.withPersistentVolumeClaim(instance.getPersistentVolumeClaim()); 
            fluent.withPhotonPersistentDisk(instance.getPhotonPersistentDisk()); 
            fluent.withPortworxVolume(instance.getPortworxVolume()); 
            fluent.withProjected(instance.getProjected()); 
            fluent.withQuobyte(instance.getQuobyte()); 
            fluent.withRbd(instance.getRbd()); 
            fluent.withScaleIO(instance.getScaleIO()); 
            fluent.withSecret(instance.getSecret()); 
            fluent.withStorageos(instance.getStorageos()); 
            fluent.withVsphereVolume(instance.getVsphereVolume()); 
            this.validationEnabled = validationEnabled; 
    }
    public VolumeBuilder(Volume instance){
            this(instance,true);
    }
    public VolumeBuilder(Volume instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withAwsElasticBlockStore(instance.getAwsElasticBlockStore()); 
            this.withAzureDisk(instance.getAzureDisk()); 
            this.withAzureFile(instance.getAzureFile()); 
            this.withCephfs(instance.getCephfs()); 
            this.withCinder(instance.getCinder()); 
            this.withConfigMap(instance.getConfigMap()); 
            this.withDownwardAPI(instance.getDownwardAPI()); 
            this.withEmptyDir(instance.getEmptyDir()); 
            this.withFc(instance.getFc()); 
            this.withFlexVolume(instance.getFlexVolume()); 
            this.withFlocker(instance.getFlocker()); 
            this.withGcePersistentDisk(instance.getGcePersistentDisk()); 
            this.withGitRepo(instance.getGitRepo()); 
            this.withGlusterfs(instance.getGlusterfs()); 
            this.withHostPath(instance.getHostPath()); 
            this.withIscsi(instance.getIscsi()); 
            this.withName(instance.getName()); 
            this.withNfs(instance.getNfs()); 
            this.withPersistentVolumeClaim(instance.getPersistentVolumeClaim()); 
            this.withPhotonPersistentDisk(instance.getPhotonPersistentDisk()); 
            this.withPortworxVolume(instance.getPortworxVolume()); 
            this.withProjected(instance.getProjected()); 
            this.withQuobyte(instance.getQuobyte()); 
            this.withRbd(instance.getRbd()); 
            this.withScaleIO(instance.getScaleIO()); 
            this.withSecret(instance.getSecret()); 
            this.withStorageos(instance.getStorageos()); 
            this.withVsphereVolume(instance.getVsphereVolume()); 
            this.validationEnabled = validationEnabled; 
    }
    public VolumeBuilder(Validator validator){
            this(new Volume(), true);
    }
    public VolumeBuilder(VolumeFluent<?> fluent,Volume instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAwsElasticBlockStore(instance.getAwsElasticBlockStore()); 
            fluent.withAzureDisk(instance.getAzureDisk()); 
            fluent.withAzureFile(instance.getAzureFile()); 
            fluent.withCephfs(instance.getCephfs()); 
            fluent.withCinder(instance.getCinder()); 
            fluent.withConfigMap(instance.getConfigMap()); 
            fluent.withDownwardAPI(instance.getDownwardAPI()); 
            fluent.withEmptyDir(instance.getEmptyDir()); 
            fluent.withFc(instance.getFc()); 
            fluent.withFlexVolume(instance.getFlexVolume()); 
            fluent.withFlocker(instance.getFlocker()); 
            fluent.withGcePersistentDisk(instance.getGcePersistentDisk()); 
            fluent.withGitRepo(instance.getGitRepo()); 
            fluent.withGlusterfs(instance.getGlusterfs()); 
            fluent.withHostPath(instance.getHostPath()); 
            fluent.withIscsi(instance.getIscsi()); 
            fluent.withName(instance.getName()); 
            fluent.withNfs(instance.getNfs()); 
            fluent.withPersistentVolumeClaim(instance.getPersistentVolumeClaim()); 
            fluent.withPhotonPersistentDisk(instance.getPhotonPersistentDisk()); 
            fluent.withPortworxVolume(instance.getPortworxVolume()); 
            fluent.withProjected(instance.getProjected()); 
            fluent.withQuobyte(instance.getQuobyte()); 
            fluent.withRbd(instance.getRbd()); 
            fluent.withScaleIO(instance.getScaleIO()); 
            fluent.withSecret(instance.getSecret()); 
            fluent.withStorageos(instance.getStorageos()); 
            fluent.withVsphereVolume(instance.getVsphereVolume()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public VolumeBuilder(Volume instance,Validator validator){
            this.fluent = this; 
            this.withAwsElasticBlockStore(instance.getAwsElasticBlockStore()); 
            this.withAzureDisk(instance.getAzureDisk()); 
            this.withAzureFile(instance.getAzureFile()); 
            this.withCephfs(instance.getCephfs()); 
            this.withCinder(instance.getCinder()); 
            this.withConfigMap(instance.getConfigMap()); 
            this.withDownwardAPI(instance.getDownwardAPI()); 
            this.withEmptyDir(instance.getEmptyDir()); 
            this.withFc(instance.getFc()); 
            this.withFlexVolume(instance.getFlexVolume()); 
            this.withFlocker(instance.getFlocker()); 
            this.withGcePersistentDisk(instance.getGcePersistentDisk()); 
            this.withGitRepo(instance.getGitRepo()); 
            this.withGlusterfs(instance.getGlusterfs()); 
            this.withHostPath(instance.getHostPath()); 
            this.withIscsi(instance.getIscsi()); 
            this.withName(instance.getName()); 
            this.withNfs(instance.getNfs()); 
            this.withPersistentVolumeClaim(instance.getPersistentVolumeClaim()); 
            this.withPhotonPersistentDisk(instance.getPhotonPersistentDisk()); 
            this.withPortworxVolume(instance.getPortworxVolume()); 
            this.withProjected(instance.getProjected()); 
            this.withQuobyte(instance.getQuobyte()); 
            this.withRbd(instance.getRbd()); 
            this.withScaleIO(instance.getScaleIO()); 
            this.withSecret(instance.getSecret()); 
            this.withStorageos(instance.getStorageos()); 
            this.withVsphereVolume(instance.getVsphereVolume()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public Volume build(){
            Volume buildable = new Volume(fluent.getAwsElasticBlockStore(),fluent.getAzureDisk(),fluent.getAzureFile(),fluent.getCephfs(),fluent.getCinder(),fluent.getConfigMap(),fluent.getDownwardAPI(),fluent.getEmptyDir(),fluent.getFc(),fluent.getFlexVolume(),fluent.getFlocker(),fluent.getGcePersistentDisk(),fluent.getGitRepo(),fluent.getGlusterfs(),fluent.getHostPath(),fluent.getIscsi(),fluent.getName(),fluent.getNfs(),fluent.getPersistentVolumeClaim(),fluent.getPhotonPersistentDisk(),fluent.getPortworxVolume(),fluent.getProjected(),fluent.getQuobyte(),fluent.getRbd(),fluent.getScaleIO(),fluent.getSecret(),fluent.getStorageos(),fluent.getVsphereVolume());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            VolumeBuilder that = (VolumeBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
