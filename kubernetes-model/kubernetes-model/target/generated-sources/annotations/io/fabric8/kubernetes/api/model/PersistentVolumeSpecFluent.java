package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Boolean;
import javax.validation.Valid;
import java.lang.Object;
import java.util.Map;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.util.LinkedHashMap;
import java.util.List;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.util.Collection;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.Integer;

public interface PersistentVolumeSpecFluent<A extends PersistentVolumeSpecFluent<A>> extends Fluent<A>{


    public A addToAccessModes(int index,String item);
    public A setToAccessModes(int index,String item);
    public A addToAccessModes(String... items);
    public A addAllToAccessModes(Collection<String> items);
    public A removeFromAccessModes(String... items);
    public A removeAllFromAccessModes(Collection<String> items);
    public List<String> getAccessModes();
    public String getAccessMode(int index);
    public String getFirstAccessMode();
    public String getLastAccessMode();
    public String getMatchingAccessMode(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withAccessModes(List<String> accessModes);
    public A withAccessModes(String... accessModes);
    public Boolean hasAccessModes();
    
/**
 * This method has been deprecated, please use method buildAwsElasticBlockStore instead.
 * @return The buildable object.
 */
@Deprecated public AWSElasticBlockStoreVolumeSource getAwsElasticBlockStore();
    public AWSElasticBlockStoreVolumeSource buildAwsElasticBlockStore();
    public A withAwsElasticBlockStore(AWSElasticBlockStoreVolumeSource awsElasticBlockStore);
    public Boolean hasAwsElasticBlockStore();
    public A withNewAwsElasticBlockStore(String fsType,Integer partition,Boolean readOnly,String volumeID);
    public PersistentVolumeSpecFluent.AwsElasticBlockStoreNested<A> withNewAwsElasticBlockStore();
    public PersistentVolumeSpecFluent.AwsElasticBlockStoreNested<A> withNewAwsElasticBlockStoreLike(AWSElasticBlockStoreVolumeSource item);
    public PersistentVolumeSpecFluent.AwsElasticBlockStoreNested<A> editAwsElasticBlockStore();
    public PersistentVolumeSpecFluent.AwsElasticBlockStoreNested<A> editOrNewAwsElasticBlockStore();
    public PersistentVolumeSpecFluent.AwsElasticBlockStoreNested<A> editOrNewAwsElasticBlockStoreLike(AWSElasticBlockStoreVolumeSource item);
    
/**
 * This method has been deprecated, please use method buildAzureDisk instead.
 * @return The buildable object.
 */
@Deprecated public AzureDiskVolumeSource getAzureDisk();
    public AzureDiskVolumeSource buildAzureDisk();
    public A withAzureDisk(AzureDiskVolumeSource azureDisk);
    public Boolean hasAzureDisk();
    public PersistentVolumeSpecFluent.AzureDiskNested<A> withNewAzureDisk();
    public PersistentVolumeSpecFluent.AzureDiskNested<A> withNewAzureDiskLike(AzureDiskVolumeSource item);
    public PersistentVolumeSpecFluent.AzureDiskNested<A> editAzureDisk();
    public PersistentVolumeSpecFluent.AzureDiskNested<A> editOrNewAzureDisk();
    public PersistentVolumeSpecFluent.AzureDiskNested<A> editOrNewAzureDiskLike(AzureDiskVolumeSource item);
    
/**
 * This method has been deprecated, please use method buildAzureFile instead.
 * @return The buildable object.
 */
@Deprecated public AzureFilePersistentVolumeSource getAzureFile();
    public AzureFilePersistentVolumeSource buildAzureFile();
    public A withAzureFile(AzureFilePersistentVolumeSource azureFile);
    public Boolean hasAzureFile();
    public A withNewAzureFile(Boolean readOnly,String secretName,String secretNamespace,String shareName);
    public PersistentVolumeSpecFluent.AzureFileNested<A> withNewAzureFile();
    public PersistentVolumeSpecFluent.AzureFileNested<A> withNewAzureFileLike(AzureFilePersistentVolumeSource item);
    public PersistentVolumeSpecFluent.AzureFileNested<A> editAzureFile();
    public PersistentVolumeSpecFluent.AzureFileNested<A> editOrNewAzureFile();
    public PersistentVolumeSpecFluent.AzureFileNested<A> editOrNewAzureFileLike(AzureFilePersistentVolumeSource item);
    public A addToCapacity(String key,Quantity value);
    public A addToCapacity(Map<String,Quantity> map);
    public A removeFromCapacity(String key);
    public A removeFromCapacity(Map<String,Quantity> map);
    public Map<String,Quantity> getCapacity();
    public A withCapacity(Map<String,Quantity> capacity);
    public Boolean hasCapacity();
    
/**
 * This method has been deprecated, please use method buildCephfs instead.
 * @return The buildable object.
 */
@Deprecated public CephFSPersistentVolumeSource getCephfs();
    public CephFSPersistentVolumeSource buildCephfs();
    public A withCephfs(CephFSPersistentVolumeSource cephfs);
    public Boolean hasCephfs();
    public PersistentVolumeSpecFluent.CephfsNested<A> withNewCephfs();
    public PersistentVolumeSpecFluent.CephfsNested<A> withNewCephfsLike(CephFSPersistentVolumeSource item);
    public PersistentVolumeSpecFluent.CephfsNested<A> editCephfs();
    public PersistentVolumeSpecFluent.CephfsNested<A> editOrNewCephfs();
    public PersistentVolumeSpecFluent.CephfsNested<A> editOrNewCephfsLike(CephFSPersistentVolumeSource item);
    
/**
 * This method has been deprecated, please use method buildCinder instead.
 * @return The buildable object.
 */
@Deprecated public CinderPersistentVolumeSource getCinder();
    public CinderPersistentVolumeSource buildCinder();
    public A withCinder(CinderPersistentVolumeSource cinder);
    public Boolean hasCinder();
    public PersistentVolumeSpecFluent.CinderNested<A> withNewCinder();
    public PersistentVolumeSpecFluent.CinderNested<A> withNewCinderLike(CinderPersistentVolumeSource item);
    public PersistentVolumeSpecFluent.CinderNested<A> editCinder();
    public PersistentVolumeSpecFluent.CinderNested<A> editOrNewCinder();
    public PersistentVolumeSpecFluent.CinderNested<A> editOrNewCinderLike(CinderPersistentVolumeSource item);
    
/**
 * This method has been deprecated, please use method buildClaimRef instead.
 * @return The buildable object.
 */
@Deprecated public ObjectReference getClaimRef();
    public ObjectReference buildClaimRef();
    public A withClaimRef(ObjectReference claimRef);
    public Boolean hasClaimRef();
    public PersistentVolumeSpecFluent.ClaimRefNested<A> withNewClaimRef();
    public PersistentVolumeSpecFluent.ClaimRefNested<A> withNewClaimRefLike(ObjectReference item);
    public PersistentVolumeSpecFluent.ClaimRefNested<A> editClaimRef();
    public PersistentVolumeSpecFluent.ClaimRefNested<A> editOrNewClaimRef();
    public PersistentVolumeSpecFluent.ClaimRefNested<A> editOrNewClaimRefLike(ObjectReference item);
    
/**
 * This method has been deprecated, please use method buildCsi instead.
 * @return The buildable object.
 */
@Deprecated public CSIPersistentVolumeSource getCsi();
    public CSIPersistentVolumeSource buildCsi();
    public A withCsi(CSIPersistentVolumeSource csi);
    public Boolean hasCsi();
    public PersistentVolumeSpecFluent.CsiNested<A> withNewCsi();
    public PersistentVolumeSpecFluent.CsiNested<A> withNewCsiLike(CSIPersistentVolumeSource item);
    public PersistentVolumeSpecFluent.CsiNested<A> editCsi();
    public PersistentVolumeSpecFluent.CsiNested<A> editOrNewCsi();
    public PersistentVolumeSpecFluent.CsiNested<A> editOrNewCsiLike(CSIPersistentVolumeSource item);
    
/**
 * This method has been deprecated, please use method buildFc instead.
 * @return The buildable object.
 */
@Deprecated public FCVolumeSource getFc();
    public FCVolumeSource buildFc();
    public A withFc(FCVolumeSource fc);
    public Boolean hasFc();
    public PersistentVolumeSpecFluent.FcNested<A> withNewFc();
    public PersistentVolumeSpecFluent.FcNested<A> withNewFcLike(FCVolumeSource item);
    public PersistentVolumeSpecFluent.FcNested<A> editFc();
    public PersistentVolumeSpecFluent.FcNested<A> editOrNewFc();
    public PersistentVolumeSpecFluent.FcNested<A> editOrNewFcLike(FCVolumeSource item);
    
/**
 * This method has been deprecated, please use method buildFlexVolume instead.
 * @return The buildable object.
 */
@Deprecated public FlexPersistentVolumeSource getFlexVolume();
    public FlexPersistentVolumeSource buildFlexVolume();
    public A withFlexVolume(FlexPersistentVolumeSource flexVolume);
    public Boolean hasFlexVolume();
    public PersistentVolumeSpecFluent.FlexVolumeNested<A> withNewFlexVolume();
    public PersistentVolumeSpecFluent.FlexVolumeNested<A> withNewFlexVolumeLike(FlexPersistentVolumeSource item);
    public PersistentVolumeSpecFluent.FlexVolumeNested<A> editFlexVolume();
    public PersistentVolumeSpecFluent.FlexVolumeNested<A> editOrNewFlexVolume();
    public PersistentVolumeSpecFluent.FlexVolumeNested<A> editOrNewFlexVolumeLike(FlexPersistentVolumeSource item);
    
/**
 * This method has been deprecated, please use method buildFlocker instead.
 * @return The buildable object.
 */
@Deprecated public FlockerVolumeSource getFlocker();
    public FlockerVolumeSource buildFlocker();
    public A withFlocker(FlockerVolumeSource flocker);
    public Boolean hasFlocker();
    public A withNewFlocker(String datasetName,String datasetUUID);
    public PersistentVolumeSpecFluent.FlockerNested<A> withNewFlocker();
    public PersistentVolumeSpecFluent.FlockerNested<A> withNewFlockerLike(FlockerVolumeSource item);
    public PersistentVolumeSpecFluent.FlockerNested<A> editFlocker();
    public PersistentVolumeSpecFluent.FlockerNested<A> editOrNewFlocker();
    public PersistentVolumeSpecFluent.FlockerNested<A> editOrNewFlockerLike(FlockerVolumeSource item);
    
/**
 * This method has been deprecated, please use method buildGcePersistentDisk instead.
 * @return The buildable object.
 */
@Deprecated public GCEPersistentDiskVolumeSource getGcePersistentDisk();
    public GCEPersistentDiskVolumeSource buildGcePersistentDisk();
    public A withGcePersistentDisk(GCEPersistentDiskVolumeSource gcePersistentDisk);
    public Boolean hasGcePersistentDisk();
    public A withNewGcePersistentDisk(String fsType,Integer partition,String pdName,Boolean readOnly);
    public PersistentVolumeSpecFluent.GcePersistentDiskNested<A> withNewGcePersistentDisk();
    public PersistentVolumeSpecFluent.GcePersistentDiskNested<A> withNewGcePersistentDiskLike(GCEPersistentDiskVolumeSource item);
    public PersistentVolumeSpecFluent.GcePersistentDiskNested<A> editGcePersistentDisk();
    public PersistentVolumeSpecFluent.GcePersistentDiskNested<A> editOrNewGcePersistentDisk();
    public PersistentVolumeSpecFluent.GcePersistentDiskNested<A> editOrNewGcePersistentDiskLike(GCEPersistentDiskVolumeSource item);
    
/**
 * This method has been deprecated, please use method buildGlusterfs instead.
 * @return The buildable object.
 */
@Deprecated public GlusterfsPersistentVolumeSource getGlusterfs();
    public GlusterfsPersistentVolumeSource buildGlusterfs();
    public A withGlusterfs(GlusterfsPersistentVolumeSource glusterfs);
    public Boolean hasGlusterfs();
    public A withNewGlusterfs(String endpoints,String endpointsNamespace,String path,Boolean readOnly);
    public PersistentVolumeSpecFluent.GlusterfsNested<A> withNewGlusterfs();
    public PersistentVolumeSpecFluent.GlusterfsNested<A> withNewGlusterfsLike(GlusterfsPersistentVolumeSource item);
    public PersistentVolumeSpecFluent.GlusterfsNested<A> editGlusterfs();
    public PersistentVolumeSpecFluent.GlusterfsNested<A> editOrNewGlusterfs();
    public PersistentVolumeSpecFluent.GlusterfsNested<A> editOrNewGlusterfsLike(GlusterfsPersistentVolumeSource item);
    
/**
 * This method has been deprecated, please use method buildHostPath instead.
 * @return The buildable object.
 */
@Deprecated public HostPathVolumeSource getHostPath();
    public HostPathVolumeSource buildHostPath();
    public A withHostPath(HostPathVolumeSource hostPath);
    public Boolean hasHostPath();
    public A withNewHostPath(String path,String type);
    public PersistentVolumeSpecFluent.HostPathNested<A> withNewHostPath();
    public PersistentVolumeSpecFluent.HostPathNested<A> withNewHostPathLike(HostPathVolumeSource item);
    public PersistentVolumeSpecFluent.HostPathNested<A> editHostPath();
    public PersistentVolumeSpecFluent.HostPathNested<A> editOrNewHostPath();
    public PersistentVolumeSpecFluent.HostPathNested<A> editOrNewHostPathLike(HostPathVolumeSource item);
    
/**
 * This method has been deprecated, please use method buildIscsi instead.
 * @return The buildable object.
 */
@Deprecated public ISCSIPersistentVolumeSource getIscsi();
    public ISCSIPersistentVolumeSource buildIscsi();
    public A withIscsi(ISCSIPersistentVolumeSource iscsi);
    public Boolean hasIscsi();
    public PersistentVolumeSpecFluent.IscsiNested<A> withNewIscsi();
    public PersistentVolumeSpecFluent.IscsiNested<A> withNewIscsiLike(ISCSIPersistentVolumeSource item);
    public PersistentVolumeSpecFluent.IscsiNested<A> editIscsi();
    public PersistentVolumeSpecFluent.IscsiNested<A> editOrNewIscsi();
    public PersistentVolumeSpecFluent.IscsiNested<A> editOrNewIscsiLike(ISCSIPersistentVolumeSource item);
    
/**
 * This method has been deprecated, please use method buildLocal instead.
 * @return The buildable object.
 */
@Deprecated public LocalVolumeSource getLocal();
    public LocalVolumeSource buildLocal();
    public A withLocal(LocalVolumeSource local);
    public Boolean hasLocal();
    public A withNewLocal(String fsType,String path);
    public PersistentVolumeSpecFluent.LocalNested<A> withNewLocal();
    public PersistentVolumeSpecFluent.LocalNested<A> withNewLocalLike(LocalVolumeSource item);
    public PersistentVolumeSpecFluent.LocalNested<A> editLocal();
    public PersistentVolumeSpecFluent.LocalNested<A> editOrNewLocal();
    public PersistentVolumeSpecFluent.LocalNested<A> editOrNewLocalLike(LocalVolumeSource item);
    public A addToMountOptions(int index,String item);
    public A setToMountOptions(int index,String item);
    public A addToMountOptions(String... items);
    public A addAllToMountOptions(Collection<String> items);
    public A removeFromMountOptions(String... items);
    public A removeAllFromMountOptions(Collection<String> items);
    public List<String> getMountOptions();
    public String getMountOption(int index);
    public String getFirstMountOption();
    public String getLastMountOption();
    public String getMatchingMountOption(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withMountOptions(List<String> mountOptions);
    public A withMountOptions(String... mountOptions);
    public Boolean hasMountOptions();
    
/**
 * This method has been deprecated, please use method buildNfs instead.
 * @return The buildable object.
 */
@Deprecated public NFSVolumeSource getNfs();
    public NFSVolumeSource buildNfs();
    public A withNfs(NFSVolumeSource nfs);
    public Boolean hasNfs();
    public A withNewNfs(String path,Boolean readOnly,String server);
    public PersistentVolumeSpecFluent.NfsNested<A> withNewNfs();
    public PersistentVolumeSpecFluent.NfsNested<A> withNewNfsLike(NFSVolumeSource item);
    public PersistentVolumeSpecFluent.NfsNested<A> editNfs();
    public PersistentVolumeSpecFluent.NfsNested<A> editOrNewNfs();
    public PersistentVolumeSpecFluent.NfsNested<A> editOrNewNfsLike(NFSVolumeSource item);
    
/**
 * This method has been deprecated, please use method buildNodeAffinity instead.
 * @return The buildable object.
 */
@Deprecated public VolumeNodeAffinity getNodeAffinity();
    public VolumeNodeAffinity buildNodeAffinity();
    public A withNodeAffinity(VolumeNodeAffinity nodeAffinity);
    public Boolean hasNodeAffinity();
    public PersistentVolumeSpecFluent.NodeAffinityNested<A> withNewNodeAffinity();
    public PersistentVolumeSpecFluent.NodeAffinityNested<A> withNewNodeAffinityLike(VolumeNodeAffinity item);
    public PersistentVolumeSpecFluent.NodeAffinityNested<A> editNodeAffinity();
    public PersistentVolumeSpecFluent.NodeAffinityNested<A> editOrNewNodeAffinity();
    public PersistentVolumeSpecFluent.NodeAffinityNested<A> editOrNewNodeAffinityLike(VolumeNodeAffinity item);
    public String getPersistentVolumeReclaimPolicy();
    public A withPersistentVolumeReclaimPolicy(String persistentVolumeReclaimPolicy);
    public Boolean hasPersistentVolumeReclaimPolicy();
    
/**
 * This method has been deprecated, please use method buildPhotonPersistentDisk instead.
 * @return The buildable object.
 */
@Deprecated public PhotonPersistentDiskVolumeSource getPhotonPersistentDisk();
    public PhotonPersistentDiskVolumeSource buildPhotonPersistentDisk();
    public A withPhotonPersistentDisk(PhotonPersistentDiskVolumeSource photonPersistentDisk);
    public Boolean hasPhotonPersistentDisk();
    public A withNewPhotonPersistentDisk(String fsType,String pdID);
    public PersistentVolumeSpecFluent.PhotonPersistentDiskNested<A> withNewPhotonPersistentDisk();
    public PersistentVolumeSpecFluent.PhotonPersistentDiskNested<A> withNewPhotonPersistentDiskLike(PhotonPersistentDiskVolumeSource item);
    public PersistentVolumeSpecFluent.PhotonPersistentDiskNested<A> editPhotonPersistentDisk();
    public PersistentVolumeSpecFluent.PhotonPersistentDiskNested<A> editOrNewPhotonPersistentDisk();
    public PersistentVolumeSpecFluent.PhotonPersistentDiskNested<A> editOrNewPhotonPersistentDiskLike(PhotonPersistentDiskVolumeSource item);
    
/**
 * This method has been deprecated, please use method buildPortworxVolume instead.
 * @return The buildable object.
 */
@Deprecated public PortworxVolumeSource getPortworxVolume();
    public PortworxVolumeSource buildPortworxVolume();
    public A withPortworxVolume(PortworxVolumeSource portworxVolume);
    public Boolean hasPortworxVolume();
    public A withNewPortworxVolume(String fsType,Boolean readOnly,String volumeID);
    public PersistentVolumeSpecFluent.PortworxVolumeNested<A> withNewPortworxVolume();
    public PersistentVolumeSpecFluent.PortworxVolumeNested<A> withNewPortworxVolumeLike(PortworxVolumeSource item);
    public PersistentVolumeSpecFluent.PortworxVolumeNested<A> editPortworxVolume();
    public PersistentVolumeSpecFluent.PortworxVolumeNested<A> editOrNewPortworxVolume();
    public PersistentVolumeSpecFluent.PortworxVolumeNested<A> editOrNewPortworxVolumeLike(PortworxVolumeSource item);
    
/**
 * This method has been deprecated, please use method buildQuobyte instead.
 * @return The buildable object.
 */
@Deprecated public QuobyteVolumeSource getQuobyte();
    public QuobyteVolumeSource buildQuobyte();
    public A withQuobyte(QuobyteVolumeSource quobyte);
    public Boolean hasQuobyte();
    public A withNewQuobyte(String group,Boolean readOnly,String registry,String user,String volume);
    public PersistentVolumeSpecFluent.QuobyteNested<A> withNewQuobyte();
    public PersistentVolumeSpecFluent.QuobyteNested<A> withNewQuobyteLike(QuobyteVolumeSource item);
    public PersistentVolumeSpecFluent.QuobyteNested<A> editQuobyte();
    public PersistentVolumeSpecFluent.QuobyteNested<A> editOrNewQuobyte();
    public PersistentVolumeSpecFluent.QuobyteNested<A> editOrNewQuobyteLike(QuobyteVolumeSource item);
    
/**
 * This method has been deprecated, please use method buildRbd instead.
 * @return The buildable object.
 */
@Deprecated public RBDPersistentVolumeSource getRbd();
    public RBDPersistentVolumeSource buildRbd();
    public A withRbd(RBDPersistentVolumeSource rbd);
    public Boolean hasRbd();
    public PersistentVolumeSpecFluent.RbdNested<A> withNewRbd();
    public PersistentVolumeSpecFluent.RbdNested<A> withNewRbdLike(RBDPersistentVolumeSource item);
    public PersistentVolumeSpecFluent.RbdNested<A> editRbd();
    public PersistentVolumeSpecFluent.RbdNested<A> editOrNewRbd();
    public PersistentVolumeSpecFluent.RbdNested<A> editOrNewRbdLike(RBDPersistentVolumeSource item);
    
/**
 * This method has been deprecated, please use method buildScaleIO instead.
 * @return The buildable object.
 */
@Deprecated public ScaleIOPersistentVolumeSource getScaleIO();
    public ScaleIOPersistentVolumeSource buildScaleIO();
    public A withScaleIO(ScaleIOPersistentVolumeSource scaleIO);
    public Boolean hasScaleIO();
    public PersistentVolumeSpecFluent.ScaleIONested<A> withNewScaleIO();
    public PersistentVolumeSpecFluent.ScaleIONested<A> withNewScaleIOLike(ScaleIOPersistentVolumeSource item);
    public PersistentVolumeSpecFluent.ScaleIONested<A> editScaleIO();
    public PersistentVolumeSpecFluent.ScaleIONested<A> editOrNewScaleIO();
    public PersistentVolumeSpecFluent.ScaleIONested<A> editOrNewScaleIOLike(ScaleIOPersistentVolumeSource item);
    public String getStorageClassName();
    public A withStorageClassName(String storageClassName);
    public Boolean hasStorageClassName();
    
/**
 * This method has been deprecated, please use method buildStorageos instead.
 * @return The buildable object.
 */
@Deprecated public StorageOSPersistentVolumeSource getStorageos();
    public StorageOSPersistentVolumeSource buildStorageos();
    public A withStorageos(StorageOSPersistentVolumeSource storageos);
    public Boolean hasStorageos();
    public PersistentVolumeSpecFluent.StorageosNested<A> withNewStorageos();
    public PersistentVolumeSpecFluent.StorageosNested<A> withNewStorageosLike(StorageOSPersistentVolumeSource item);
    public PersistentVolumeSpecFluent.StorageosNested<A> editStorageos();
    public PersistentVolumeSpecFluent.StorageosNested<A> editOrNewStorageos();
    public PersistentVolumeSpecFluent.StorageosNested<A> editOrNewStorageosLike(StorageOSPersistentVolumeSource item);
    public String getVolumeMode();
    public A withVolumeMode(String volumeMode);
    public Boolean hasVolumeMode();
    
/**
 * This method has been deprecated, please use method buildVsphereVolume instead.
 * @return The buildable object.
 */
@Deprecated public VsphereVirtualDiskVolumeSource getVsphereVolume();
    public VsphereVirtualDiskVolumeSource buildVsphereVolume();
    public A withVsphereVolume(VsphereVirtualDiskVolumeSource vsphereVolume);
    public Boolean hasVsphereVolume();
    public A withNewVsphereVolume(String fsType,String storagePolicyID,String storagePolicyName,String volumePath);
    public PersistentVolumeSpecFluent.VsphereVolumeNested<A> withNewVsphereVolume();
    public PersistentVolumeSpecFluent.VsphereVolumeNested<A> withNewVsphereVolumeLike(VsphereVirtualDiskVolumeSource item);
    public PersistentVolumeSpecFluent.VsphereVolumeNested<A> editVsphereVolume();
    public PersistentVolumeSpecFluent.VsphereVolumeNested<A> editOrNewVsphereVolume();
    public PersistentVolumeSpecFluent.VsphereVolumeNested<A> editOrNewVsphereVolumeLike(VsphereVirtualDiskVolumeSource item);

    public interface AwsElasticBlockStoreNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,AWSElasticBlockStoreVolumeSourceFluent<PersistentVolumeSpecFluent.AwsElasticBlockStoreNested<N>>{

        
    public N and();    public N endAwsElasticBlockStore();
}
    public interface AzureDiskNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,AzureDiskVolumeSourceFluent<PersistentVolumeSpecFluent.AzureDiskNested<N>>{

        
    public N and();    public N endAzureDisk();
}
    public interface AzureFileNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,AzureFilePersistentVolumeSourceFluent<PersistentVolumeSpecFluent.AzureFileNested<N>>{

        
    public N and();    public N endAzureFile();
}
    public interface CephfsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CephFSPersistentVolumeSourceFluent<PersistentVolumeSpecFluent.CephfsNested<N>>{

        
    public N and();    public N endCephfs();
}
    public interface CinderNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CinderPersistentVolumeSourceFluent<PersistentVolumeSpecFluent.CinderNested<N>>{

        
    public N and();    public N endCinder();
}
    public interface ClaimRefNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectReferenceFluent<PersistentVolumeSpecFluent.ClaimRefNested<N>>{

        
    public N and();    public N endClaimRef();
}
    public interface CsiNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CSIPersistentVolumeSourceFluent<PersistentVolumeSpecFluent.CsiNested<N>>{

        
    public N and();    public N endCsi();
}
    public interface FcNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,FCVolumeSourceFluent<PersistentVolumeSpecFluent.FcNested<N>>{

        
    public N and();    public N endFc();
}
    public interface FlexVolumeNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,FlexPersistentVolumeSourceFluent<PersistentVolumeSpecFluent.FlexVolumeNested<N>>{

        
    public N and();    public N endFlexVolume();
}
    public interface FlockerNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,FlockerVolumeSourceFluent<PersistentVolumeSpecFluent.FlockerNested<N>>{

        
    public N and();    public N endFlocker();
}
    public interface GcePersistentDiskNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,GCEPersistentDiskVolumeSourceFluent<PersistentVolumeSpecFluent.GcePersistentDiskNested<N>>{

        
    public N and();    public N endGcePersistentDisk();
}
    public interface GlusterfsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,GlusterfsPersistentVolumeSourceFluent<PersistentVolumeSpecFluent.GlusterfsNested<N>>{

        
    public N and();    public N endGlusterfs();
}
    public interface HostPathNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,HostPathVolumeSourceFluent<PersistentVolumeSpecFluent.HostPathNested<N>>{

        
    public N and();    public N endHostPath();
}
    public interface IscsiNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ISCSIPersistentVolumeSourceFluent<PersistentVolumeSpecFluent.IscsiNested<N>>{

        
    public N and();    public N endIscsi();
}
    public interface LocalNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LocalVolumeSourceFluent<PersistentVolumeSpecFluent.LocalNested<N>>{

        
    public N and();    public N endLocal();
}
    public interface NfsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NFSVolumeSourceFluent<PersistentVolumeSpecFluent.NfsNested<N>>{

        
    public N and();    public N endNfs();
}
    public interface NodeAffinityNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,VolumeNodeAffinityFluent<PersistentVolumeSpecFluent.NodeAffinityNested<N>>{

        
    public N and();    public N endNodeAffinity();
}
    public interface PhotonPersistentDiskNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PhotonPersistentDiskVolumeSourceFluent<PersistentVolumeSpecFluent.PhotonPersistentDiskNested<N>>{

        
    public N and();    public N endPhotonPersistentDisk();
}
    public interface PortworxVolumeNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PortworxVolumeSourceFluent<PersistentVolumeSpecFluent.PortworxVolumeNested<N>>{

        
    public N and();    public N endPortworxVolume();
}
    public interface QuobyteNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,QuobyteVolumeSourceFluent<PersistentVolumeSpecFluent.QuobyteNested<N>>{

        
    public N and();    public N endQuobyte();
}
    public interface RbdNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RBDPersistentVolumeSourceFluent<PersistentVolumeSpecFluent.RbdNested<N>>{

        
    public N and();    public N endRbd();
}
    public interface ScaleIONested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ScaleIOPersistentVolumeSourceFluent<PersistentVolumeSpecFluent.ScaleIONested<N>>{

        
    public N and();    public N endScaleIO();
}
    public interface StorageosNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StorageOSPersistentVolumeSourceFluent<PersistentVolumeSpecFluent.StorageosNested<N>>{

        
    public N and();    public N endStorageos();
}
    public interface VsphereVolumeNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,VsphereVirtualDiskVolumeSourceFluent<PersistentVolumeSpecFluent.VsphereVolumeNested<N>>{

        
    public N and();    public N endVsphereVolume();
}


}
