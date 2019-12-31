
package io.fabric8.kubernetes.api.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
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
    "awsElasticBlockStore",
    "azureDisk",
    "azureFile",
    "cephfs",
    "cinder",
    "configMap",
    "downwardAPI",
    "emptyDir",
    "fc",
    "flexVolume",
    "flocker",
    "gcePersistentDisk",
    "gitRepo",
    "glusterfs",
    "hostPath",
    "iscsi",
    "name",
    "nfs",
    "persistentVolumeClaim",
    "photonPersistentDisk",
    "portworxVolume",
    "projected",
    "quobyte",
    "rbd",
    "scaleIO",
    "secret",
    "storageos",
    "vsphereVolume"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = true, generateBuilderPackage = true, builderPackage = "io.fabric8.kubernetes.api.builder", inline = @Inline(type = Doneable.class, prefix = "Doneable", value = "done"))
public class Volume implements KubernetesResource
{

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
    private AzureFileVolumeSource azureFile;
    /**
     * 
     * 
     */
    @JsonProperty("cephfs")
    @Valid
    private CephFSVolumeSource cephfs;
    /**
     * 
     * 
     */
    @JsonProperty("cinder")
    @Valid
    private CinderVolumeSource cinder;
    /**
     * 
     * 
     */
    @JsonProperty("configMap")
    @Valid
    private ConfigMapVolumeSource configMap;
    /**
     * 
     * 
     */
    @JsonProperty("downwardAPI")
    @Valid
    private DownwardAPIVolumeSource downwardAPI;
    /**
     * 
     * 
     */
    @JsonProperty("emptyDir")
    @Valid
    private EmptyDirVolumeSource emptyDir;
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
    private FlexVolumeSource flexVolume;
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
    @JsonProperty("gitRepo")
    @Valid
    private GitRepoVolumeSource gitRepo;
    /**
     * 
     * 
     */
    @JsonProperty("glusterfs")
    @Valid
    private GlusterfsVolumeSource glusterfs;
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
    private ISCSIVolumeSource iscsi;
    /**
     * 
     * 
     */
    @JsonProperty("name")
    @Pattern(regexp = "^[a-z0-9]([-a-z0-9]*[a-z0-9])?$")
    @Size(max = 63)
    private String name;
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
    @JsonProperty("persistentVolumeClaim")
    @Valid
    private PersistentVolumeClaimVolumeSource persistentVolumeClaim;
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
    @JsonProperty("projected")
    @Valid
    private ProjectedVolumeSource projected;
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
    private RBDVolumeSource rbd;
    /**
     * 
     * 
     */
    @JsonProperty("scaleIO")
    @Valid
    private ScaleIOVolumeSource scaleIO;
    /**
     * 
     * 
     */
    @JsonProperty("secret")
    @Valid
    private SecretVolumeSource secret;
    /**
     * 
     * 
     */
    @JsonProperty("storageos")
    @Valid
    private StorageOSVolumeSource storageos;
    /**
     * 
     * 
     */
    @JsonProperty("vsphereVolume")
    @Valid
    private VsphereVirtualDiskVolumeSource vsphereVolume;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Volume() {
    }

    /**
     * 
     * @param quobyte
     * @param azureFile
     * @param flexVolume
     * @param secret
     * @param projected
     * @param cephfs
     * @param scaleIO
     * @param emptyDir
     * @param glusterfs
     * @param gcePersistentDisk
     * @param photonPersistentDisk
     * @param azureDisk
     * @param cinder
     * @param downwardAPI
     * @param awsElasticBlockStore
     * @param flocker
     * @param iscsi
     * @param rbd
     * @param configMap
     * @param storageos
     * @param name
     * @param nfs
     * @param persistentVolumeClaim
     * @param gitRepo
     * @param portworxVolume
     * @param vsphereVolume
     * @param fc
     * @param hostPath
     */
    public Volume(AWSElasticBlockStoreVolumeSource awsElasticBlockStore, AzureDiskVolumeSource azureDisk, AzureFileVolumeSource azureFile, CephFSVolumeSource cephfs, CinderVolumeSource cinder, ConfigMapVolumeSource configMap, DownwardAPIVolumeSource downwardAPI, EmptyDirVolumeSource emptyDir, FCVolumeSource fc, FlexVolumeSource flexVolume, FlockerVolumeSource flocker, GCEPersistentDiskVolumeSource gcePersistentDisk, GitRepoVolumeSource gitRepo, GlusterfsVolumeSource glusterfs, HostPathVolumeSource hostPath, ISCSIVolumeSource iscsi, String name, NFSVolumeSource nfs, PersistentVolumeClaimVolumeSource persistentVolumeClaim, PhotonPersistentDiskVolumeSource photonPersistentDisk, PortworxVolumeSource portworxVolume, ProjectedVolumeSource projected, QuobyteVolumeSource quobyte, RBDVolumeSource rbd, ScaleIOVolumeSource scaleIO, SecretVolumeSource secret, StorageOSVolumeSource storageos, VsphereVirtualDiskVolumeSource vsphereVolume) {
        this.awsElasticBlockStore = awsElasticBlockStore;
        this.azureDisk = azureDisk;
        this.azureFile = azureFile;
        this.cephfs = cephfs;
        this.cinder = cinder;
        this.configMap = configMap;
        this.downwardAPI = downwardAPI;
        this.emptyDir = emptyDir;
        this.fc = fc;
        this.flexVolume = flexVolume;
        this.flocker = flocker;
        this.gcePersistentDisk = gcePersistentDisk;
        this.gitRepo = gitRepo;
        this.glusterfs = glusterfs;
        this.hostPath = hostPath;
        this.iscsi = iscsi;
        this.name = name;
        this.nfs = nfs;
        this.persistentVolumeClaim = persistentVolumeClaim;
        this.photonPersistentDisk = photonPersistentDisk;
        this.portworxVolume = portworxVolume;
        this.projected = projected;
        this.quobyte = quobyte;
        this.rbd = rbd;
        this.scaleIO = scaleIO;
        this.secret = secret;
        this.storageos = storageos;
        this.vsphereVolume = vsphereVolume;
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
    public AzureFileVolumeSource getAzureFile() {
        return azureFile;
    }

    /**
     * 
     * 
     * @param azureFile
     *     The azureFile
     */
    @JsonProperty("azureFile")
    public void setAzureFile(AzureFileVolumeSource azureFile) {
        this.azureFile = azureFile;
    }

    /**
     * 
     * 
     * @return
     *     The cephfs
     */
    @JsonProperty("cephfs")
    public CephFSVolumeSource getCephfs() {
        return cephfs;
    }

    /**
     * 
     * 
     * @param cephfs
     *     The cephfs
     */
    @JsonProperty("cephfs")
    public void setCephfs(CephFSVolumeSource cephfs) {
        this.cephfs = cephfs;
    }

    /**
     * 
     * 
     * @return
     *     The cinder
     */
    @JsonProperty("cinder")
    public CinderVolumeSource getCinder() {
        return cinder;
    }

    /**
     * 
     * 
     * @param cinder
     *     The cinder
     */
    @JsonProperty("cinder")
    public void setCinder(CinderVolumeSource cinder) {
        this.cinder = cinder;
    }

    /**
     * 
     * 
     * @return
     *     The configMap
     */
    @JsonProperty("configMap")
    public ConfigMapVolumeSource getConfigMap() {
        return configMap;
    }

    /**
     * 
     * 
     * @param configMap
     *     The configMap
     */
    @JsonProperty("configMap")
    public void setConfigMap(ConfigMapVolumeSource configMap) {
        this.configMap = configMap;
    }

    /**
     * 
     * 
     * @return
     *     The downwardAPI
     */
    @JsonProperty("downwardAPI")
    public DownwardAPIVolumeSource getDownwardAPI() {
        return downwardAPI;
    }

    /**
     * 
     * 
     * @param downwardAPI
     *     The downwardAPI
     */
    @JsonProperty("downwardAPI")
    public void setDownwardAPI(DownwardAPIVolumeSource downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    /**
     * 
     * 
     * @return
     *     The emptyDir
     */
    @JsonProperty("emptyDir")
    public EmptyDirVolumeSource getEmptyDir() {
        return emptyDir;
    }

    /**
     * 
     * 
     * @param emptyDir
     *     The emptyDir
     */
    @JsonProperty("emptyDir")
    public void setEmptyDir(EmptyDirVolumeSource emptyDir) {
        this.emptyDir = emptyDir;
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
    public FlexVolumeSource getFlexVolume() {
        return flexVolume;
    }

    /**
     * 
     * 
     * @param flexVolume
     *     The flexVolume
     */
    @JsonProperty("flexVolume")
    public void setFlexVolume(FlexVolumeSource flexVolume) {
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
     *     The gitRepo
     */
    @JsonProperty("gitRepo")
    public GitRepoVolumeSource getGitRepo() {
        return gitRepo;
    }

    /**
     * 
     * 
     * @param gitRepo
     *     The gitRepo
     */
    @JsonProperty("gitRepo")
    public void setGitRepo(GitRepoVolumeSource gitRepo) {
        this.gitRepo = gitRepo;
    }

    /**
     * 
     * 
     * @return
     *     The glusterfs
     */
    @JsonProperty("glusterfs")
    public GlusterfsVolumeSource getGlusterfs() {
        return glusterfs;
    }

    /**
     * 
     * 
     * @param glusterfs
     *     The glusterfs
     */
    @JsonProperty("glusterfs")
    public void setGlusterfs(GlusterfsVolumeSource glusterfs) {
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
    public ISCSIVolumeSource getIscsi() {
        return iscsi;
    }

    /**
     * 
     * 
     * @param iscsi
     *     The iscsi
     */
    @JsonProperty("iscsi")
    public void setIscsi(ISCSIVolumeSource iscsi) {
        this.iscsi = iscsi;
    }

    /**
     * 
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
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
     *     The persistentVolumeClaim
     */
    @JsonProperty("persistentVolumeClaim")
    public PersistentVolumeClaimVolumeSource getPersistentVolumeClaim() {
        return persistentVolumeClaim;
    }

    /**
     * 
     * 
     * @param persistentVolumeClaim
     *     The persistentVolumeClaim
     */
    @JsonProperty("persistentVolumeClaim")
    public void setPersistentVolumeClaim(PersistentVolumeClaimVolumeSource persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
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
     *     The projected
     */
    @JsonProperty("projected")
    public ProjectedVolumeSource getProjected() {
        return projected;
    }

    /**
     * 
     * 
     * @param projected
     *     The projected
     */
    @JsonProperty("projected")
    public void setProjected(ProjectedVolumeSource projected) {
        this.projected = projected;
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
    public RBDVolumeSource getRbd() {
        return rbd;
    }

    /**
     * 
     * 
     * @param rbd
     *     The rbd
     */
    @JsonProperty("rbd")
    public void setRbd(RBDVolumeSource rbd) {
        this.rbd = rbd;
    }

    /**
     * 
     * 
     * @return
     *     The scaleIO
     */
    @JsonProperty("scaleIO")
    public ScaleIOVolumeSource getScaleIO() {
        return scaleIO;
    }

    /**
     * 
     * 
     * @param scaleIO
     *     The scaleIO
     */
    @JsonProperty("scaleIO")
    public void setScaleIO(ScaleIOVolumeSource scaleIO) {
        this.scaleIO = scaleIO;
    }

    /**
     * 
     * 
     * @return
     *     The secret
     */
    @JsonProperty("secret")
    public SecretVolumeSource getSecret() {
        return secret;
    }

    /**
     * 
     * 
     * @param secret
     *     The secret
     */
    @JsonProperty("secret")
    public void setSecret(SecretVolumeSource secret) {
        this.secret = secret;
    }

    /**
     * 
     * 
     * @return
     *     The storageos
     */
    @JsonProperty("storageos")
    public StorageOSVolumeSource getStorageos() {
        return storageos;
    }

    /**
     * 
     * 
     * @param storageos
     *     The storageos
     */
    @JsonProperty("storageos")
    public void setStorageos(StorageOSVolumeSource storageos) {
        this.storageos = storageos;
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
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
