
package io.fabric8.kubernetes.api.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.model.Doneable;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.Inline;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "apiVersion",
    "kind",
    "metadata",
    "accessModes",
    "awsElasticBlockStore",
    "azureDisk",
    "azureFile",
    "capacity",
    "cephfs",
    "cinder",
    "claimRef",
    "csi",
    "fc",
    "flexVolume",
    "flocker",
    "gcePersistentDisk",
    "glusterfs",
    "hostPath",
    "iscsi",
    "local",
    "mountOptions",
    "nfs",
    "nodeAffinity",
    "persistentVolumeReclaimPolicy",
    "photonPersistentDisk",
    "portworxVolume",
    "quobyte",
    "rbd",
    "scaleIO",
    "storageClassName",
    "storageos",
    "volumeMode",
    "vsphereVolume"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class PersistentVolumeSpec implements KubernetesResource
{

    /**
     * 
     * 
     */
    @JsonProperty("accessModes")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<java.lang.String> accessModes = new ArrayList<java.lang.String>();
    /**
     * 
     * 
     */
    @JsonProperty("awsElasticBlockStore")
    @Valid
    private AWSElasticBlockStoreVolumeSource awsElasticBlockStore;
    /**
     * 
     * 
     */
    @JsonProperty("azureDisk")
    @Valid
    private AzureDiskVolumeSource azureDisk;
    /**
     * 
     * 
     */
    @JsonProperty("azureFile")
    @Valid
    private AzureFilePersistentVolumeSource azureFile;
    /**
     * 
     * 
     */
    @JsonProperty("capacity")
    @Valid
    private Map<String, Quantity> capacity;
    /**
     * 
     * 
     */
    @JsonProperty("cephfs")
    @Valid
    private CephFSPersistentVolumeSource cephfs;
    /**
     * 
     * 
     */
    @JsonProperty("cinder")
    @Valid
    private CinderPersistentVolumeSource cinder;
    /**
     * 
     * 
     */
    @JsonProperty("claimRef")
    @Valid
    private ObjectReference claimRef;
    /**
     * 
     * 
     */
    @JsonProperty("csi")
    @Valid
    private CSIPersistentVolumeSource csi;
    /**
     * 
     * 
     */
    @JsonProperty("fc")
    @Valid
    private FCVolumeSource fc;
    /**
     * 
     * 
     */
    @JsonProperty("flexVolume")
    @Valid
    private FlexPersistentVolumeSource flexVolume;
    /**
     * 
     * 
     */
    @JsonProperty("flocker")
    @Valid
    private FlockerVolumeSource flocker;
    /**
     * 
     * 
     */
    @JsonProperty("gcePersistentDisk")
    @Valid
    private GCEPersistentDiskVolumeSource gcePersistentDisk;
    /**
     * 
     * 
     */
    @JsonProperty("glusterfs")
    @Valid
    private GlusterfsPersistentVolumeSource glusterfs;
    /**
     * 
     * 
     */
    @JsonProperty("hostPath")
    @Valid
    private HostPathVolumeSource hostPath;
    /**
     * 
     * 
     */
    @JsonProperty("iscsi")
    @Valid
    private ISCSIPersistentVolumeSource iscsi;
    /**
     * 
     * 
     */
    @JsonProperty("local")
    @Valid
    private LocalVolumeSource local;
    /**
     * 
     * 
     */
    @JsonProperty("mountOptions")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Valid
    private List<java.lang.String> mountOptions = new ArrayList<java.lang.String>();
    /**
     * 
     * 
     */
    @JsonProperty("nfs")
    @Valid
    private NFSVolumeSource nfs;
    /**
     * 
     * 
     */
    @JsonProperty("nodeAffinity")
    @Valid
    private VolumeNodeAffinity nodeAffinity;
    /**
     * 
     * 
     */
    @JsonProperty("persistentVolumeReclaimPolicy")
    private java.lang.String persistentVolumeReclaimPolicy;
    /**
     * 
     * 
     */
    @JsonProperty("photonPersistentDisk")
    @Valid
    private PhotonPersistentDiskVolumeSource photonPersistentDisk;
    /**
     * 
     * 
     */
    @JsonProperty("portworxVolume")
    @Valid
    private PortworxVolumeSource portworxVolume;
    /**
     * 
     * 
     */
    @JsonProperty("quobyte")
    @Valid
    private QuobyteVolumeSource quobyte;
    /**
     * 
     * 
     */
    @JsonProperty("rbd")
    @Valid
    private RBDPersistentVolumeSource rbd;
    /**
     * 
     * 
     */
    @JsonProperty("scaleIO")
    @Valid
    private ScaleIOPersistentVolumeSource scaleIO;
    /**
     * 
     * 
     */
    @JsonProperty("storageClassName")
    private java.lang.String storageClassName;
    /**
     * 
     * 
     */
    @JsonProperty("storageos")
    @Valid
    private StorageOSPersistentVolumeSource storageos;
    /**
     * 
     * 
     */
    @JsonProperty("volumeMode")
    private java.lang.String volumeMode;
    /**
     * 
     * 
     */
    @JsonProperty("vsphereVolume")
    @Valid
    private VsphereVirtualDiskVolumeSource vsphereVolume;
    @JsonIgnore
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public PersistentVolumeSpec() {
    }

    /**
     * 
     * @param claimRef
     * @param quobyte
     * @param azureFile
     * @param flexVolume
     * @param mountOptions
     * @param local
     * @param capacity
     * @param cephfs
     * @param scaleIO
     * @param accessModes
     * @param glusterfs
     * @param gcePersistentDisk
     * @param photonPersistentDisk
     * @param azureDisk
     * @param cinder
     * @param awsElasticBlockStore
     * @param nodeAffinity
     * @param flocker
     * @param volumeMode
     * @param iscsi
     * @param rbd
     * @param storageClassName
     * @param storageos
     * @param csi
     * @param nfs
     * @param persistentVolumeReclaimPolicy
     * @param portworxVolume
     * @param vsphereVolume
     * @param fc
     * @param hostPath
     */
    public PersistentVolumeSpec(List<java.lang.String> accessModes, AWSElasticBlockStoreVolumeSource awsElasticBlockStore, AzureDiskVolumeSource azureDisk, AzureFilePersistentVolumeSource azureFile, Map<String, Quantity> capacity, CephFSPersistentVolumeSource cephfs, CinderPersistentVolumeSource cinder, ObjectReference claimRef, CSIPersistentVolumeSource csi, FCVolumeSource fc, FlexPersistentVolumeSource flexVolume, FlockerVolumeSource flocker, GCEPersistentDiskVolumeSource gcePersistentDisk, GlusterfsPersistentVolumeSource glusterfs, HostPathVolumeSource hostPath, ISCSIPersistentVolumeSource iscsi, LocalVolumeSource local, List<java.lang.String> mountOptions, NFSVolumeSource nfs, VolumeNodeAffinity nodeAffinity, java.lang.String persistentVolumeReclaimPolicy, PhotonPersistentDiskVolumeSource photonPersistentDisk, PortworxVolumeSource portworxVolume, QuobyteVolumeSource quobyte, RBDPersistentVolumeSource rbd, ScaleIOPersistentVolumeSource scaleIO, java.lang.String storageClassName, StorageOSPersistentVolumeSource storageos, java.lang.String volumeMode, VsphereVirtualDiskVolumeSource vsphereVolume) {
        this.accessModes = accessModes;
        this.awsElasticBlockStore = awsElasticBlockStore;
        this.azureDisk = azureDisk;
        this.azureFile = azureFile;
        this.capacity = capacity;
        this.cephfs = cephfs;
        this.cinder = cinder;
        this.claimRef = claimRef;
        this.csi = csi;
        this.fc = fc;
        this.flexVolume = flexVolume;
        this.flocker = flocker;
        this.gcePersistentDisk = gcePersistentDisk;
        this.glusterfs = glusterfs;
        this.hostPath = hostPath;
        this.iscsi = iscsi;
        this.local = local;
        this.mountOptions = mountOptions;
        this.nfs = nfs;
        this.nodeAffinity = nodeAffinity;
        this.persistentVolumeReclaimPolicy = persistentVolumeReclaimPolicy;
        this.photonPersistentDisk = photonPersistentDisk;
        this.portworxVolume = portworxVolume;
        this.quobyte = quobyte;
        this.rbd = rbd;
        this.scaleIO = scaleIO;
        this.storageClassName = storageClassName;
        this.storageos = storageos;
        this.volumeMode = volumeMode;
        this.vsphereVolume = vsphereVolume;
    }

    /**
     * 
     * 
     * @return
     *     The accessModes
     */
    @JsonProperty("accessModes")
    public List<java.lang.String> getAccessModes() {
        return accessModes;
    }

    /**
     * 
     * 
     * @param accessModes
     *     The accessModes
     */
    @JsonProperty("accessModes")
    public void setAccessModes(List<java.lang.String> accessModes) {
        this.accessModes = accessModes;
    }

    /**
     * 
     * 
     * @return
     *     The awsElasticBlockStore
     */
    @JsonProperty("awsElasticBlockStore")
    public AWSElasticBlockStoreVolumeSource getAwsElasticBlockStore() {
        return awsElasticBlockStore;
    }

    /**
     * 
     * 
     * @param awsElasticBlockStore
     *     The awsElasticBlockStore
     */
    @JsonProperty("awsElasticBlockStore")
    public void setAwsElasticBlockStore(AWSElasticBlockStoreVolumeSource awsElasticBlockStore) {
        this.awsElasticBlockStore = awsElasticBlockStore;
    }

    /**
     * 
     * 
     * @return
     *     The azureDisk
     */
    @JsonProperty("azureDisk")
    public AzureDiskVolumeSource getAzureDisk() {
        return azureDisk;
    }

    /**
     * 
     * 
     * @param azureDisk
     *     The azureDisk
     */
    @JsonProperty("azureDisk")
    public void setAzureDisk(AzureDiskVolumeSource azureDisk) {
        this.azureDisk = azureDisk;
    }

    /**
     * 
     * 
     * @return
     *     The azureFile
     */
    @JsonProperty("azureFile")
    public AzureFilePersistentVolumeSource getAzureFile() {
        return azureFile;
    }

    /**
     * 
     * 
     * @param azureFile
     *     The azureFile
     */
    @JsonProperty("azureFile")
    public void setAzureFile(AzureFilePersistentVolumeSource azureFile) {
        this.azureFile = azureFile;
    }

    /**
     * 
     * 
     * @return
     *     The capacity
     */
    @JsonProperty("capacity")
    public Map<String, Quantity> getCapacity() {
        return capacity;
    }

    /**
     * 
     * 
     * @param capacity
     *     The capacity
     */
    @JsonProperty("capacity")
    public void setCapacity(Map<String, Quantity> capacity) {
        this.capacity = capacity;
    }

    /**
     * 
     * 
     * @return
     *     The cephfs
     */
    @JsonProperty("cephfs")
    public CephFSPersistentVolumeSource getCephfs() {
        return cephfs;
    }

    /**
     * 
     * 
     * @param cephfs
     *     The cephfs
     */
    @JsonProperty("cephfs")
    public void setCephfs(CephFSPersistentVolumeSource cephfs) {
        this.cephfs = cephfs;
    }

    /**
     * 
     * 
     * @return
     *     The cinder
     */
    @JsonProperty("cinder")
    public CinderPersistentVolumeSource getCinder() {
        return cinder;
    }

    /**
     * 
     * 
     * @param cinder
     *     The cinder
     */
    @JsonProperty("cinder")
    public void setCinder(CinderPersistentVolumeSource cinder) {
        this.cinder = cinder;
    }

    /**
     * 
     * 
     * @return
     *     The claimRef
     */
    @JsonProperty("claimRef")
    public ObjectReference getClaimRef() {
        return claimRef;
    }

    /**
     * 
     * 
     * @param claimRef
     *     The claimRef
     */
    @JsonProperty("claimRef")
    public void setClaimRef(ObjectReference claimRef) {
        this.claimRef = claimRef;
    }

    /**
     * 
     * 
     * @return
     *     The csi
     */
    @JsonProperty("csi")
    public CSIPersistentVolumeSource getCsi() {
        return csi;
    }

    /**
     * 
     * 
     * @param csi
     *     The csi
     */
    @JsonProperty("csi")
    public void setCsi(CSIPersistentVolumeSource csi) {
        this.csi = csi;
    }

    /**
     * 
     * 
     * @return
     *     The fc
     */
    @JsonProperty("fc")
    public FCVolumeSource getFc() {
        return fc;
    }

    /**
     * 
     * 
     * @param fc
     *     The fc
     */
    @JsonProperty("fc")
    public void setFc(FCVolumeSource fc) {
        this.fc = fc;
    }

    /**
     * 
     * 
     * @return
     *     The flexVolume
     */
    @JsonProperty("flexVolume")
    public FlexPersistentVolumeSource getFlexVolume() {
        return flexVolume;
    }

    /**
     * 
     * 
     * @param flexVolume
     *     The flexVolume
     */
    @JsonProperty("flexVolume")
    public void setFlexVolume(FlexPersistentVolumeSource flexVolume) {
        this.flexVolume = flexVolume;
    }

    /**
     * 
     * 
     * @return
     *     The flocker
     */
    @JsonProperty("flocker")
    public FlockerVolumeSource getFlocker() {
        return flocker;
    }

    /**
     * 
     * 
     * @param flocker
     *     The flocker
     */
    @JsonProperty("flocker")
    public void setFlocker(FlockerVolumeSource flocker) {
        this.flocker = flocker;
    }

    /**
     * 
     * 
     * @return
     *     The gcePersistentDisk
     */
    @JsonProperty("gcePersistentDisk")
    public GCEPersistentDiskVolumeSource getGcePersistentDisk() {
        return gcePersistentDisk;
    }

    /**
     * 
     * 
     * @param gcePersistentDisk
     *     The gcePersistentDisk
     */
    @JsonProperty("gcePersistentDisk")
    public void setGcePersistentDisk(GCEPersistentDiskVolumeSource gcePersistentDisk) {
        this.gcePersistentDisk = gcePersistentDisk;
    }

    /**
     * 
     * 
     * @return
     *     The glusterfs
     */
    @JsonProperty("glusterfs")
    public GlusterfsPersistentVolumeSource getGlusterfs() {
        return glusterfs;
    }

    /**
     * 
     * 
     * @param glusterfs
     *     The glusterfs
     */
    @JsonProperty("glusterfs")
    public void setGlusterfs(GlusterfsPersistentVolumeSource glusterfs) {
        this.glusterfs = glusterfs;
    }

    /**
     * 
     * 
     * @return
     *     The hostPath
     */
    @JsonProperty("hostPath")
    public HostPathVolumeSource getHostPath() {
        return hostPath;
    }

    /**
     * 
     * 
     * @param hostPath
     *     The hostPath
     */
    @JsonProperty("hostPath")
    public void setHostPath(HostPathVolumeSource hostPath) {
        this.hostPath = hostPath;
    }

    /**
     * 
     * 
     * @return
     *     The iscsi
     */
    @JsonProperty("iscsi")
    public ISCSIPersistentVolumeSource getIscsi() {
        return iscsi;
    }

    /**
     * 
     * 
     * @param iscsi
     *     The iscsi
     */
    @JsonProperty("iscsi")
    public void setIscsi(ISCSIPersistentVolumeSource iscsi) {
        this.iscsi = iscsi;
    }

    /**
     * 
     * 
     * @return
     *     The local
     */
    @JsonProperty("local")
    public LocalVolumeSource getLocal() {
        return local;
    }

    /**
     * 
     * 
     * @param local
     *     The local
     */
    @JsonProperty("local")
    public void setLocal(LocalVolumeSource local) {
        this.local = local;
    }

    /**
     * 
     * 
     * @return
     *     The mountOptions
     */
    @JsonProperty("mountOptions")
    public List<java.lang.String> getMountOptions() {
        return mountOptions;
    }

    /**
     * 
     * 
     * @param mountOptions
     *     The mountOptions
     */
    @JsonProperty("mountOptions")
    public void setMountOptions(List<java.lang.String> mountOptions) {
        this.mountOptions = mountOptions;
    }

    /**
     * 
     * 
     * @return
     *     The nfs
     */
    @JsonProperty("nfs")
    public NFSVolumeSource getNfs() {
        return nfs;
    }

    /**
     * 
     * 
     * @param nfs
     *     The nfs
     */
    @JsonProperty("nfs")
    public void setNfs(NFSVolumeSource nfs) {
        this.nfs = nfs;
    }

    /**
     * 
     * 
     * @return
     *     The nodeAffinity
     */
    @JsonProperty("nodeAffinity")
    public VolumeNodeAffinity getNodeAffinity() {
        return nodeAffinity;
    }

    /**
     * 
     * 
     * @param nodeAffinity
     *     The nodeAffinity
     */
    @JsonProperty("nodeAffinity")
    public void setNodeAffinity(VolumeNodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    /**
     * 
     * 
     * @return
     *     The persistentVolumeReclaimPolicy
     */
    @JsonProperty("persistentVolumeReclaimPolicy")
    public java.lang.String getPersistentVolumeReclaimPolicy() {
        return persistentVolumeReclaimPolicy;
    }

    /**
     * 
     * 
     * @param persistentVolumeReclaimPolicy
     *     The persistentVolumeReclaimPolicy
     */
    @JsonProperty("persistentVolumeReclaimPolicy")
    public void setPersistentVolumeReclaimPolicy(java.lang.String persistentVolumeReclaimPolicy) {
        this.persistentVolumeReclaimPolicy = persistentVolumeReclaimPolicy;
    }

    /**
     * 
     * 
     * @return
     *     The photonPersistentDisk
     */
    @JsonProperty("photonPersistentDisk")
    public PhotonPersistentDiskVolumeSource getPhotonPersistentDisk() {
        return photonPersistentDisk;
    }

    /**
     * 
     * 
     * @param photonPersistentDisk
     *     The photonPersistentDisk
     */
    @JsonProperty("photonPersistentDisk")
    public void setPhotonPersistentDisk(PhotonPersistentDiskVolumeSource photonPersistentDisk) {
        this.photonPersistentDisk = photonPersistentDisk;
    }

    /**
     * 
     * 
     * @return
     *     The portworxVolume
     */
    @JsonProperty("portworxVolume")
    public PortworxVolumeSource getPortworxVolume() {
        return portworxVolume;
    }

    /**
     * 
     * 
     * @param portworxVolume
     *     The portworxVolume
     */
    @JsonProperty("portworxVolume")
    public void setPortworxVolume(PortworxVolumeSource portworxVolume) {
        this.portworxVolume = portworxVolume;
    }

    /**
     * 
     * 
     * @return
     *     The quobyte
     */
    @JsonProperty("quobyte")
    public QuobyteVolumeSource getQuobyte() {
        return quobyte;
    }

    /**
     * 
     * 
     * @param quobyte
     *     The quobyte
     */
    @JsonProperty("quobyte")
    public void setQuobyte(QuobyteVolumeSource quobyte) {
        this.quobyte = quobyte;
    }

    /**
     * 
     * 
     * @return
     *     The rbd
     */
    @JsonProperty("rbd")
    public RBDPersistentVolumeSource getRbd() {
        return rbd;
    }

    /**
     * 
     * 
     * @param rbd
     *     The rbd
     */
    @JsonProperty("rbd")
    public void setRbd(RBDPersistentVolumeSource rbd) {
        this.rbd = rbd;
    }

    /**
     * 
     * 
     * @return
     *     The scaleIO
     */
    @JsonProperty("scaleIO")
    public ScaleIOPersistentVolumeSource getScaleIO() {
        return scaleIO;
    }

    /**
     * 
     * 
     * @param scaleIO
     *     The scaleIO
     */
    @JsonProperty("scaleIO")
    public void setScaleIO(ScaleIOPersistentVolumeSource scaleIO) {
        this.scaleIO = scaleIO;
    }

    /**
     * 
     * 
     * @return
     *     The storageClassName
     */
    @JsonProperty("storageClassName")
    public java.lang.String getStorageClassName() {
        return storageClassName;
    }

    /**
     * 
     * 
     * @param storageClassName
     *     The storageClassName
     */
    @JsonProperty("storageClassName")
    public void setStorageClassName(java.lang.String storageClassName) {
        this.storageClassName = storageClassName;
    }

    /**
     * 
     * 
     * @return
     *     The storageos
     */
    @JsonProperty("storageos")
    public StorageOSPersistentVolumeSource getStorageos() {
        return storageos;
    }

    /**
     * 
     * 
     * @param storageos
     *     The storageos
     */
    @JsonProperty("storageos")
    public void setStorageos(StorageOSPersistentVolumeSource storageos) {
        this.storageos = storageos;
    }

    /**
     * 
     * 
     * @return
     *     The volumeMode
     */
    @JsonProperty("volumeMode")
    public java.lang.String getVolumeMode() {
        return volumeMode;
    }

    /**
     * 
     * 
     * @param volumeMode
     *     The volumeMode
     */
    @JsonProperty("volumeMode")
    public void setVolumeMode(java.lang.String volumeMode) {
        this.volumeMode = volumeMode;
    }

    /**
     * 
     * 
     * @return
     *     The vsphereVolume
     */
    @JsonProperty("vsphereVolume")
    public VsphereVirtualDiskVolumeSource getVsphereVolume() {
        return vsphereVolume;
    }

    /**
     * 
     * 
     * @param vsphereVolume
     *     The vsphereVolume
     */
    @JsonProperty("vsphereVolume")
    public void setVsphereVolume(VsphereVirtualDiskVolumeSource vsphereVolume) {
        this.vsphereVolume = vsphereVolume;
    }

    @JsonAnyGetter
    public Map<java.lang.String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(java.lang.String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
