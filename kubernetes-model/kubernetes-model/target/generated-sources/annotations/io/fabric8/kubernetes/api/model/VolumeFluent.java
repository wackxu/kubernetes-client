package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.Size;
import java.lang.String;
import java.lang.Boolean;
import javax.validation.Valid;
import java.lang.Object;
import java.util.Map;
import java.lang.Deprecated;
import javax.validation.constraints.Pattern;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.Integer;

public interface VolumeFluent<A extends VolumeFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildAwsElasticBlockStore instead.
 * @return The buildable object.
 */
@Deprecated public AWSElasticBlockStoreVolumeSource getAwsElasticBlockStore();
    public AWSElasticBlockStoreVolumeSource buildAwsElasticBlockStore();
    public A withAwsElasticBlockStore(AWSElasticBlockStoreVolumeSource awsElasticBlockStore);
    public Boolean hasAwsElasticBlockStore();
    public A withNewAwsElasticBlockStore(String fsType,Integer partition,Boolean readOnly,String volumeID);
    public VolumeFluent.AwsElasticBlockStoreNested<A> withNewAwsElasticBlockStore();
    public VolumeFluent.AwsElasticBlockStoreNested<A> withNewAwsElasticBlockStoreLike(AWSElasticBlockStoreVolumeSource item);
    public VolumeFluent.AwsElasticBlockStoreNested<A> editAwsElasticBlockStore();
    public VolumeFluent.AwsElasticBlockStoreNested<A> editOrNewAwsElasticBlockStore();
    public VolumeFluent.AwsElasticBlockStoreNested<A> editOrNewAwsElasticBlockStoreLike(AWSElasticBlockStoreVolumeSource item);
    
/**
 * This method has been deprecated, please use method buildAzureDisk instead.
 * @return The buildable object.
 */
@Deprecated public AzureDiskVolumeSource getAzureDisk();
    public AzureDiskVolumeSource buildAzureDisk();
    public A withAzureDisk(AzureDiskVolumeSource azureDisk);
    public Boolean hasAzureDisk();
    public VolumeFluent.AzureDiskNested<A> withNewAzureDisk();
    public VolumeFluent.AzureDiskNested<A> withNewAzureDiskLike(AzureDiskVolumeSource item);
    public VolumeFluent.AzureDiskNested<A> editAzureDisk();
    public VolumeFluent.AzureDiskNested<A> editOrNewAzureDisk();
    public VolumeFluent.AzureDiskNested<A> editOrNewAzureDiskLike(AzureDiskVolumeSource item);
    
/**
 * This method has been deprecated, please use method buildAzureFile instead.
 * @return The buildable object.
 */
@Deprecated public AzureFileVolumeSource getAzureFile();
    public AzureFileVolumeSource buildAzureFile();
    public A withAzureFile(AzureFileVolumeSource azureFile);
    public Boolean hasAzureFile();
    public A withNewAzureFile(Boolean readOnly,String secretName,String shareName);
    public VolumeFluent.AzureFileNested<A> withNewAzureFile();
    public VolumeFluent.AzureFileNested<A> withNewAzureFileLike(AzureFileVolumeSource item);
    public VolumeFluent.AzureFileNested<A> editAzureFile();
    public VolumeFluent.AzureFileNested<A> editOrNewAzureFile();
    public VolumeFluent.AzureFileNested<A> editOrNewAzureFileLike(AzureFileVolumeSource item);
    
/**
 * This method has been deprecated, please use method buildCephfs instead.
 * @return The buildable object.
 */
@Deprecated public CephFSVolumeSource getCephfs();
    public CephFSVolumeSource buildCephfs();
    public A withCephfs(CephFSVolumeSource cephfs);
    public Boolean hasCephfs();
    public VolumeFluent.CephfsNested<A> withNewCephfs();
    public VolumeFluent.CephfsNested<A> withNewCephfsLike(CephFSVolumeSource item);
    public VolumeFluent.CephfsNested<A> editCephfs();
    public VolumeFluent.CephfsNested<A> editOrNewCephfs();
    public VolumeFluent.CephfsNested<A> editOrNewCephfsLike(CephFSVolumeSource item);
    
/**
 * This method has been deprecated, please use method buildCinder instead.
 * @return The buildable object.
 */
@Deprecated public CinderVolumeSource getCinder();
    public CinderVolumeSource buildCinder();
    public A withCinder(CinderVolumeSource cinder);
    public Boolean hasCinder();
    public VolumeFluent.CinderNested<A> withNewCinder();
    public VolumeFluent.CinderNested<A> withNewCinderLike(CinderVolumeSource item);
    public VolumeFluent.CinderNested<A> editCinder();
    public VolumeFluent.CinderNested<A> editOrNewCinder();
    public VolumeFluent.CinderNested<A> editOrNewCinderLike(CinderVolumeSource item);
    
/**
 * This method has been deprecated, please use method buildConfigMap instead.
 * @return The buildable object.
 */
@Deprecated public ConfigMapVolumeSource getConfigMap();
    public ConfigMapVolumeSource buildConfigMap();
    public A withConfigMap(ConfigMapVolumeSource configMap);
    public Boolean hasConfigMap();
    public VolumeFluent.ConfigMapNested<A> withNewConfigMap();
    public VolumeFluent.ConfigMapNested<A> withNewConfigMapLike(ConfigMapVolumeSource item);
    public VolumeFluent.ConfigMapNested<A> editConfigMap();
    public VolumeFluent.ConfigMapNested<A> editOrNewConfigMap();
    public VolumeFluent.ConfigMapNested<A> editOrNewConfigMapLike(ConfigMapVolumeSource item);
    
/**
 * This method has been deprecated, please use method buildDownwardAPI instead.
 * @return The buildable object.
 */
@Deprecated public DownwardAPIVolumeSource getDownwardAPI();
    public DownwardAPIVolumeSource buildDownwardAPI();
    public A withDownwardAPI(DownwardAPIVolumeSource downwardAPI);
    public Boolean hasDownwardAPI();
    public VolumeFluent.DownwardAPINested<A> withNewDownwardAPI();
    public VolumeFluent.DownwardAPINested<A> withNewDownwardAPILike(DownwardAPIVolumeSource item);
    public VolumeFluent.DownwardAPINested<A> editDownwardAPI();
    public VolumeFluent.DownwardAPINested<A> editOrNewDownwardAPI();
    public VolumeFluent.DownwardAPINested<A> editOrNewDownwardAPILike(DownwardAPIVolumeSource item);
    
/**
 * This method has been deprecated, please use method buildEmptyDir instead.
 * @return The buildable object.
 */
@Deprecated public EmptyDirVolumeSource getEmptyDir();
    public EmptyDirVolumeSource buildEmptyDir();
    public A withEmptyDir(EmptyDirVolumeSource emptyDir);
    public Boolean hasEmptyDir();
    public VolumeFluent.EmptyDirNested<A> withNewEmptyDir();
    public VolumeFluent.EmptyDirNested<A> withNewEmptyDirLike(EmptyDirVolumeSource item);
    public VolumeFluent.EmptyDirNested<A> editEmptyDir();
    public VolumeFluent.EmptyDirNested<A> editOrNewEmptyDir();
    public VolumeFluent.EmptyDirNested<A> editOrNewEmptyDirLike(EmptyDirVolumeSource item);
    
/**
 * This method has been deprecated, please use method buildFc instead.
 * @return The buildable object.
 */
@Deprecated public FCVolumeSource getFc();
    public FCVolumeSource buildFc();
    public A withFc(FCVolumeSource fc);
    public Boolean hasFc();
    public VolumeFluent.FcNested<A> withNewFc();
    public VolumeFluent.FcNested<A> withNewFcLike(FCVolumeSource item);
    public VolumeFluent.FcNested<A> editFc();
    public VolumeFluent.FcNested<A> editOrNewFc();
    public VolumeFluent.FcNested<A> editOrNewFcLike(FCVolumeSource item);
    
/**
 * This method has been deprecated, please use method buildFlexVolume instead.
 * @return The buildable object.
 */
@Deprecated public FlexVolumeSource getFlexVolume();
    public FlexVolumeSource buildFlexVolume();
    public A withFlexVolume(FlexVolumeSource flexVolume);
    public Boolean hasFlexVolume();
    public VolumeFluent.FlexVolumeNested<A> withNewFlexVolume();
    public VolumeFluent.FlexVolumeNested<A> withNewFlexVolumeLike(FlexVolumeSource item);
    public VolumeFluent.FlexVolumeNested<A> editFlexVolume();
    public VolumeFluent.FlexVolumeNested<A> editOrNewFlexVolume();
    public VolumeFluent.FlexVolumeNested<A> editOrNewFlexVolumeLike(FlexVolumeSource item);
    
/**
 * This method has been deprecated, please use method buildFlocker instead.
 * @return The buildable object.
 */
@Deprecated public FlockerVolumeSource getFlocker();
    public FlockerVolumeSource buildFlocker();
    public A withFlocker(FlockerVolumeSource flocker);
    public Boolean hasFlocker();
    public A withNewFlocker(String datasetName,String datasetUUID);
    public VolumeFluent.FlockerNested<A> withNewFlocker();
    public VolumeFluent.FlockerNested<A> withNewFlockerLike(FlockerVolumeSource item);
    public VolumeFluent.FlockerNested<A> editFlocker();
    public VolumeFluent.FlockerNested<A> editOrNewFlocker();
    public VolumeFluent.FlockerNested<A> editOrNewFlockerLike(FlockerVolumeSource item);
    
/**
 * This method has been deprecated, please use method buildGcePersistentDisk instead.
 * @return The buildable object.
 */
@Deprecated public GCEPersistentDiskVolumeSource getGcePersistentDisk();
    public GCEPersistentDiskVolumeSource buildGcePersistentDisk();
    public A withGcePersistentDisk(GCEPersistentDiskVolumeSource gcePersistentDisk);
    public Boolean hasGcePersistentDisk();
    public A withNewGcePersistentDisk(String fsType,Integer partition,String pdName,Boolean readOnly);
    public VolumeFluent.GcePersistentDiskNested<A> withNewGcePersistentDisk();
    public VolumeFluent.GcePersistentDiskNested<A> withNewGcePersistentDiskLike(GCEPersistentDiskVolumeSource item);
    public VolumeFluent.GcePersistentDiskNested<A> editGcePersistentDisk();
    public VolumeFluent.GcePersistentDiskNested<A> editOrNewGcePersistentDisk();
    public VolumeFluent.GcePersistentDiskNested<A> editOrNewGcePersistentDiskLike(GCEPersistentDiskVolumeSource item);
    
/**
 * This method has been deprecated, please use method buildGitRepo instead.
 * @return The buildable object.
 */
@Deprecated public GitRepoVolumeSource getGitRepo();
    public GitRepoVolumeSource buildGitRepo();
    public A withGitRepo(GitRepoVolumeSource gitRepo);
    public Boolean hasGitRepo();
    public A withNewGitRepo(String directory,String repository,String revision);
    public VolumeFluent.GitRepoNested<A> withNewGitRepo();
    public VolumeFluent.GitRepoNested<A> withNewGitRepoLike(GitRepoVolumeSource item);
    public VolumeFluent.GitRepoNested<A> editGitRepo();
    public VolumeFluent.GitRepoNested<A> editOrNewGitRepo();
    public VolumeFluent.GitRepoNested<A> editOrNewGitRepoLike(GitRepoVolumeSource item);
    
/**
 * This method has been deprecated, please use method buildGlusterfs instead.
 * @return The buildable object.
 */
@Deprecated public GlusterfsVolumeSource getGlusterfs();
    public GlusterfsVolumeSource buildGlusterfs();
    public A withGlusterfs(GlusterfsVolumeSource glusterfs);
    public Boolean hasGlusterfs();
    public A withNewGlusterfs(String endpoints,String path,Boolean readOnly);
    public VolumeFluent.GlusterfsNested<A> withNewGlusterfs();
    public VolumeFluent.GlusterfsNested<A> withNewGlusterfsLike(GlusterfsVolumeSource item);
    public VolumeFluent.GlusterfsNested<A> editGlusterfs();
    public VolumeFluent.GlusterfsNested<A> editOrNewGlusterfs();
    public VolumeFluent.GlusterfsNested<A> editOrNewGlusterfsLike(GlusterfsVolumeSource item);
    
/**
 * This method has been deprecated, please use method buildHostPath instead.
 * @return The buildable object.
 */
@Deprecated public HostPathVolumeSource getHostPath();
    public HostPathVolumeSource buildHostPath();
    public A withHostPath(HostPathVolumeSource hostPath);
    public Boolean hasHostPath();
    public A withNewHostPath(String path,String type);
    public VolumeFluent.HostPathNested<A> withNewHostPath();
    public VolumeFluent.HostPathNested<A> withNewHostPathLike(HostPathVolumeSource item);
    public VolumeFluent.HostPathNested<A> editHostPath();
    public VolumeFluent.HostPathNested<A> editOrNewHostPath();
    public VolumeFluent.HostPathNested<A> editOrNewHostPathLike(HostPathVolumeSource item);
    
/**
 * This method has been deprecated, please use method buildIscsi instead.
 * @return The buildable object.
 */
@Deprecated public ISCSIVolumeSource getIscsi();
    public ISCSIVolumeSource buildIscsi();
    public A withIscsi(ISCSIVolumeSource iscsi);
    public Boolean hasIscsi();
    public VolumeFluent.IscsiNested<A> withNewIscsi();
    public VolumeFluent.IscsiNested<A> withNewIscsiLike(ISCSIVolumeSource item);
    public VolumeFluent.IscsiNested<A> editIscsi();
    public VolumeFluent.IscsiNested<A> editOrNewIscsi();
    public VolumeFluent.IscsiNested<A> editOrNewIscsiLike(ISCSIVolumeSource item);
    public String getName();
    public A withName(String name);
    public Boolean hasName();
    
/**
 * This method has been deprecated, please use method buildNfs instead.
 * @return The buildable object.
 */
@Deprecated public NFSVolumeSource getNfs();
    public NFSVolumeSource buildNfs();
    public A withNfs(NFSVolumeSource nfs);
    public Boolean hasNfs();
    public A withNewNfs(String path,Boolean readOnly,String server);
    public VolumeFluent.NfsNested<A> withNewNfs();
    public VolumeFluent.NfsNested<A> withNewNfsLike(NFSVolumeSource item);
    public VolumeFluent.NfsNested<A> editNfs();
    public VolumeFluent.NfsNested<A> editOrNewNfs();
    public VolumeFluent.NfsNested<A> editOrNewNfsLike(NFSVolumeSource item);
    
/**
 * This method has been deprecated, please use method buildPersistentVolumeClaim instead.
 * @return The buildable object.
 */
@Deprecated public PersistentVolumeClaimVolumeSource getPersistentVolumeClaim();
    public PersistentVolumeClaimVolumeSource buildPersistentVolumeClaim();
    public A withPersistentVolumeClaim(PersistentVolumeClaimVolumeSource persistentVolumeClaim);
    public Boolean hasPersistentVolumeClaim();
    public A withNewPersistentVolumeClaim(String claimName,Boolean readOnly);
    public VolumeFluent.PersistentVolumeClaimNested<A> withNewPersistentVolumeClaim();
    public VolumeFluent.PersistentVolumeClaimNested<A> withNewPersistentVolumeClaimLike(PersistentVolumeClaimVolumeSource item);
    public VolumeFluent.PersistentVolumeClaimNested<A> editPersistentVolumeClaim();
    public VolumeFluent.PersistentVolumeClaimNested<A> editOrNewPersistentVolumeClaim();
    public VolumeFluent.PersistentVolumeClaimNested<A> editOrNewPersistentVolumeClaimLike(PersistentVolumeClaimVolumeSource item);
    
/**
 * This method has been deprecated, please use method buildPhotonPersistentDisk instead.
 * @return The buildable object.
 */
@Deprecated public PhotonPersistentDiskVolumeSource getPhotonPersistentDisk();
    public PhotonPersistentDiskVolumeSource buildPhotonPersistentDisk();
    public A withPhotonPersistentDisk(PhotonPersistentDiskVolumeSource photonPersistentDisk);
    public Boolean hasPhotonPersistentDisk();
    public A withNewPhotonPersistentDisk(String fsType,String pdID);
    public VolumeFluent.PhotonPersistentDiskNested<A> withNewPhotonPersistentDisk();
    public VolumeFluent.PhotonPersistentDiskNested<A> withNewPhotonPersistentDiskLike(PhotonPersistentDiskVolumeSource item);
    public VolumeFluent.PhotonPersistentDiskNested<A> editPhotonPersistentDisk();
    public VolumeFluent.PhotonPersistentDiskNested<A> editOrNewPhotonPersistentDisk();
    public VolumeFluent.PhotonPersistentDiskNested<A> editOrNewPhotonPersistentDiskLike(PhotonPersistentDiskVolumeSource item);
    
/**
 * This method has been deprecated, please use method buildPortworxVolume instead.
 * @return The buildable object.
 */
@Deprecated public PortworxVolumeSource getPortworxVolume();
    public PortworxVolumeSource buildPortworxVolume();
    public A withPortworxVolume(PortworxVolumeSource portworxVolume);
    public Boolean hasPortworxVolume();
    public A withNewPortworxVolume(String fsType,Boolean readOnly,String volumeID);
    public VolumeFluent.PortworxVolumeNested<A> withNewPortworxVolume();
    public VolumeFluent.PortworxVolumeNested<A> withNewPortworxVolumeLike(PortworxVolumeSource item);
    public VolumeFluent.PortworxVolumeNested<A> editPortworxVolume();
    public VolumeFluent.PortworxVolumeNested<A> editOrNewPortworxVolume();
    public VolumeFluent.PortworxVolumeNested<A> editOrNewPortworxVolumeLike(PortworxVolumeSource item);
    
/**
 * This method has been deprecated, please use method buildProjected instead.
 * @return The buildable object.
 */
@Deprecated public ProjectedVolumeSource getProjected();
    public ProjectedVolumeSource buildProjected();
    public A withProjected(ProjectedVolumeSource projected);
    public Boolean hasProjected();
    public VolumeFluent.ProjectedNested<A> withNewProjected();
    public VolumeFluent.ProjectedNested<A> withNewProjectedLike(ProjectedVolumeSource item);
    public VolumeFluent.ProjectedNested<A> editProjected();
    public VolumeFluent.ProjectedNested<A> editOrNewProjected();
    public VolumeFluent.ProjectedNested<A> editOrNewProjectedLike(ProjectedVolumeSource item);
    
/**
 * This method has been deprecated, please use method buildQuobyte instead.
 * @return The buildable object.
 */
@Deprecated public QuobyteVolumeSource getQuobyte();
    public QuobyteVolumeSource buildQuobyte();
    public A withQuobyte(QuobyteVolumeSource quobyte);
    public Boolean hasQuobyte();
    public A withNewQuobyte(String group,Boolean readOnly,String registry,String user,String volume);
    public VolumeFluent.QuobyteNested<A> withNewQuobyte();
    public VolumeFluent.QuobyteNested<A> withNewQuobyteLike(QuobyteVolumeSource item);
    public VolumeFluent.QuobyteNested<A> editQuobyte();
    public VolumeFluent.QuobyteNested<A> editOrNewQuobyte();
    public VolumeFluent.QuobyteNested<A> editOrNewQuobyteLike(QuobyteVolumeSource item);
    
/**
 * This method has been deprecated, please use method buildRbd instead.
 * @return The buildable object.
 */
@Deprecated public RBDVolumeSource getRbd();
    public RBDVolumeSource buildRbd();
    public A withRbd(RBDVolumeSource rbd);
    public Boolean hasRbd();
    public VolumeFluent.RbdNested<A> withNewRbd();
    public VolumeFluent.RbdNested<A> withNewRbdLike(RBDVolumeSource item);
    public VolumeFluent.RbdNested<A> editRbd();
    public VolumeFluent.RbdNested<A> editOrNewRbd();
    public VolumeFluent.RbdNested<A> editOrNewRbdLike(RBDVolumeSource item);
    
/**
 * This method has been deprecated, please use method buildScaleIO instead.
 * @return The buildable object.
 */
@Deprecated public ScaleIOVolumeSource getScaleIO();
    public ScaleIOVolumeSource buildScaleIO();
    public A withScaleIO(ScaleIOVolumeSource scaleIO);
    public Boolean hasScaleIO();
    public VolumeFluent.ScaleIONested<A> withNewScaleIO();
    public VolumeFluent.ScaleIONested<A> withNewScaleIOLike(ScaleIOVolumeSource item);
    public VolumeFluent.ScaleIONested<A> editScaleIO();
    public VolumeFluent.ScaleIONested<A> editOrNewScaleIO();
    public VolumeFluent.ScaleIONested<A> editOrNewScaleIOLike(ScaleIOVolumeSource item);
    
/**
 * This method has been deprecated, please use method buildSecret instead.
 * @return The buildable object.
 */
@Deprecated public SecretVolumeSource getSecret();
    public SecretVolumeSource buildSecret();
    public A withSecret(SecretVolumeSource secret);
    public Boolean hasSecret();
    public VolumeFluent.SecretNested<A> withNewSecret();
    public VolumeFluent.SecretNested<A> withNewSecretLike(SecretVolumeSource item);
    public VolumeFluent.SecretNested<A> editSecret();
    public VolumeFluent.SecretNested<A> editOrNewSecret();
    public VolumeFluent.SecretNested<A> editOrNewSecretLike(SecretVolumeSource item);
    
/**
 * This method has been deprecated, please use method buildStorageos instead.
 * @return The buildable object.
 */
@Deprecated public StorageOSVolumeSource getStorageos();
    public StorageOSVolumeSource buildStorageos();
    public A withStorageos(StorageOSVolumeSource storageos);
    public Boolean hasStorageos();
    public VolumeFluent.StorageosNested<A> withNewStorageos();
    public VolumeFluent.StorageosNested<A> withNewStorageosLike(StorageOSVolumeSource item);
    public VolumeFluent.StorageosNested<A> editStorageos();
    public VolumeFluent.StorageosNested<A> editOrNewStorageos();
    public VolumeFluent.StorageosNested<A> editOrNewStorageosLike(StorageOSVolumeSource item);
    
/**
 * This method has been deprecated, please use method buildVsphereVolume instead.
 * @return The buildable object.
 */
@Deprecated public VsphereVirtualDiskVolumeSource getVsphereVolume();
    public VsphereVirtualDiskVolumeSource buildVsphereVolume();
    public A withVsphereVolume(VsphereVirtualDiskVolumeSource vsphereVolume);
    public Boolean hasVsphereVolume();
    public A withNewVsphereVolume(String fsType,String storagePolicyID,String storagePolicyName,String volumePath);
    public VolumeFluent.VsphereVolumeNested<A> withNewVsphereVolume();
    public VolumeFluent.VsphereVolumeNested<A> withNewVsphereVolumeLike(VsphereVirtualDiskVolumeSource item);
    public VolumeFluent.VsphereVolumeNested<A> editVsphereVolume();
    public VolumeFluent.VsphereVolumeNested<A> editOrNewVsphereVolume();
    public VolumeFluent.VsphereVolumeNested<A> editOrNewVsphereVolumeLike(VsphereVirtualDiskVolumeSource item);

    public interface AwsElasticBlockStoreNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,AWSElasticBlockStoreVolumeSourceFluent<VolumeFluent.AwsElasticBlockStoreNested<N>>{

        
    public N and();    public N endAwsElasticBlockStore();
}
    public interface AzureDiskNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,AzureDiskVolumeSourceFluent<VolumeFluent.AzureDiskNested<N>>{

        
    public N and();    public N endAzureDisk();
}
    public interface AzureFileNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,AzureFileVolumeSourceFluent<VolumeFluent.AzureFileNested<N>>{

        
    public N and();    public N endAzureFile();
}
    public interface CephfsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CephFSVolumeSourceFluent<VolumeFluent.CephfsNested<N>>{

        
    public N and();    public N endCephfs();
}
    public interface CinderNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CinderVolumeSourceFluent<VolumeFluent.CinderNested<N>>{

        
    public N and();    public N endCinder();
}
    public interface ConfigMapNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ConfigMapVolumeSourceFluent<VolumeFluent.ConfigMapNested<N>>{

        
    public N and();    public N endConfigMap();
}
    public interface DownwardAPINested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DownwardAPIVolumeSourceFluent<VolumeFluent.DownwardAPINested<N>>{

        
    public N and();    public N endDownwardAPI();
}
    public interface EmptyDirNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EmptyDirVolumeSourceFluent<VolumeFluent.EmptyDirNested<N>>{

        
    public N and();    public N endEmptyDir();
}
    public interface FcNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,FCVolumeSourceFluent<VolumeFluent.FcNested<N>>{

        
    public N and();    public N endFc();
}
    public interface FlexVolumeNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,FlexVolumeSourceFluent<VolumeFluent.FlexVolumeNested<N>>{

        
    public N and();    public N endFlexVolume();
}
    public interface FlockerNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,FlockerVolumeSourceFluent<VolumeFluent.FlockerNested<N>>{

        
    public N and();    public N endFlocker();
}
    public interface GcePersistentDiskNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,GCEPersistentDiskVolumeSourceFluent<VolumeFluent.GcePersistentDiskNested<N>>{

        
    public N and();    public N endGcePersistentDisk();
}
    public interface GitRepoNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,GitRepoVolumeSourceFluent<VolumeFluent.GitRepoNested<N>>{

        
    public N and();    public N endGitRepo();
}
    public interface GlusterfsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,GlusterfsVolumeSourceFluent<VolumeFluent.GlusterfsNested<N>>{

        
    public N and();    public N endGlusterfs();
}
    public interface HostPathNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,HostPathVolumeSourceFluent<VolumeFluent.HostPathNested<N>>{

        
    public N and();    public N endHostPath();
}
    public interface IscsiNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ISCSIVolumeSourceFluent<VolumeFluent.IscsiNested<N>>{

        
    public N and();    public N endIscsi();
}
    public interface NfsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NFSVolumeSourceFluent<VolumeFluent.NfsNested<N>>{

        
    public N and();    public N endNfs();
}
    public interface PersistentVolumeClaimNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PersistentVolumeClaimVolumeSourceFluent<VolumeFluent.PersistentVolumeClaimNested<N>>{

        
    public N and();    public N endPersistentVolumeClaim();
}
    public interface PhotonPersistentDiskNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PhotonPersistentDiskVolumeSourceFluent<VolumeFluent.PhotonPersistentDiskNested<N>>{

        
    public N and();    public N endPhotonPersistentDisk();
}
    public interface PortworxVolumeNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PortworxVolumeSourceFluent<VolumeFluent.PortworxVolumeNested<N>>{

        
    public N and();    public N endPortworxVolume();
}
    public interface ProjectedNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ProjectedVolumeSourceFluent<VolumeFluent.ProjectedNested<N>>{

        
    public N and();    public N endProjected();
}
    public interface QuobyteNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,QuobyteVolumeSourceFluent<VolumeFluent.QuobyteNested<N>>{

        
    public N and();    public N endQuobyte();
}
    public interface RbdNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RBDVolumeSourceFluent<VolumeFluent.RbdNested<N>>{

        
    public N and();    public N endRbd();
}
    public interface ScaleIONested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ScaleIOVolumeSourceFluent<VolumeFluent.ScaleIONested<N>>{

        
    public N and();    public N endScaleIO();
}
    public interface SecretNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecretVolumeSourceFluent<VolumeFluent.SecretNested<N>>{

        
    public N and();    public N endSecret();
}
    public interface StorageosNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StorageOSVolumeSourceFluent<VolumeFluent.StorageosNested<N>>{

        
    public N and();    public N endStorageos();
}
    public interface VsphereVolumeNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,VsphereVirtualDiskVolumeSourceFluent<VolumeFluent.VsphereVolumeNested<N>>{

        
    public N and();    public N endVsphereVolume();
}


}
