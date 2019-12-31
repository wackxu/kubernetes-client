package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.Size;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Boolean;
import javax.validation.Valid;
import java.lang.Object;
import java.lang.Deprecated;
import javax.validation.constraints.Pattern;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.Integer;

public class VolumeFluentImpl<A extends VolumeFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements VolumeFluent<A>{

    private AWSElasticBlockStoreVolumeSourceBuilder awsElasticBlockStore;
    private AzureDiskVolumeSourceBuilder azureDisk;
    private AzureFileVolumeSourceBuilder azureFile;
    private CephFSVolumeSourceBuilder cephfs;
    private CinderVolumeSourceBuilder cinder;
    private ConfigMapVolumeSourceBuilder configMap;
    private DownwardAPIVolumeSourceBuilder downwardAPI;
    private EmptyDirVolumeSourceBuilder emptyDir;
    private FCVolumeSourceBuilder fc;
    private FlexVolumeSourceBuilder flexVolume;
    private FlockerVolumeSourceBuilder flocker;
    private GCEPersistentDiskVolumeSourceBuilder gcePersistentDisk;
    private GitRepoVolumeSourceBuilder gitRepo;
    private GlusterfsVolumeSourceBuilder glusterfs;
    private HostPathVolumeSourceBuilder hostPath;
    private ISCSIVolumeSourceBuilder iscsi;
    private String name;
    private NFSVolumeSourceBuilder nfs;
    private PersistentVolumeClaimVolumeSourceBuilder persistentVolumeClaim;
    private PhotonPersistentDiskVolumeSourceBuilder photonPersistentDisk;
    private PortworxVolumeSourceBuilder portworxVolume;
    private ProjectedVolumeSourceBuilder projected;
    private QuobyteVolumeSourceBuilder quobyte;
    private RBDVolumeSourceBuilder rbd;
    private ScaleIOVolumeSourceBuilder scaleIO;
    private SecretVolumeSourceBuilder secret;
    private StorageOSVolumeSourceBuilder storageos;
    private VsphereVirtualDiskVolumeSourceBuilder vsphereVolume;

    public VolumeFluentImpl(){
    }
    public VolumeFluentImpl(Volume instance){
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
    }

    
/**
 * This method has been deprecated, please use method buildAwsElasticBlockStore instead.
 * @return The buildable object.
 */
@Deprecated public AWSElasticBlockStoreVolumeSource getAwsElasticBlockStore(){
            return this.awsElasticBlockStore!=null?this.awsElasticBlockStore.build():null;
    }

    public AWSElasticBlockStoreVolumeSource buildAwsElasticBlockStore(){
            return this.awsElasticBlockStore!=null?this.awsElasticBlockStore.build():null;
    }

    public A withAwsElasticBlockStore(AWSElasticBlockStoreVolumeSource awsElasticBlockStore){
            _visitables.remove(this.awsElasticBlockStore);
            if (awsElasticBlockStore!=null){ this.awsElasticBlockStore= new AWSElasticBlockStoreVolumeSourceBuilder(awsElasticBlockStore); _visitables.add(this.awsElasticBlockStore);} return (A) this;
    }

    public Boolean hasAwsElasticBlockStore(){
            return this.awsElasticBlockStore != null;
    }

    public A withNewAwsElasticBlockStore(String fsType,Integer partition,Boolean readOnly,String volumeID){
            return (A)withAwsElasticBlockStore(new AWSElasticBlockStoreVolumeSource(fsType, partition, readOnly, volumeID));
    }

    public VolumeFluent.AwsElasticBlockStoreNested<A> withNewAwsElasticBlockStore(){
            return new AwsElasticBlockStoreNestedImpl();
    }

    public VolumeFluent.AwsElasticBlockStoreNested<A> withNewAwsElasticBlockStoreLike(AWSElasticBlockStoreVolumeSource item){
            return new AwsElasticBlockStoreNestedImpl(item);
    }

    public VolumeFluent.AwsElasticBlockStoreNested<A> editAwsElasticBlockStore(){
            return withNewAwsElasticBlockStoreLike(getAwsElasticBlockStore());
    }

    public VolumeFluent.AwsElasticBlockStoreNested<A> editOrNewAwsElasticBlockStore(){
            return withNewAwsElasticBlockStoreLike(getAwsElasticBlockStore() != null ? getAwsElasticBlockStore(): new AWSElasticBlockStoreVolumeSourceBuilder().build());
    }

    public VolumeFluent.AwsElasticBlockStoreNested<A> editOrNewAwsElasticBlockStoreLike(AWSElasticBlockStoreVolumeSource item){
            return withNewAwsElasticBlockStoreLike(getAwsElasticBlockStore() != null ? getAwsElasticBlockStore(): item);
    }

    
/**
 * This method has been deprecated, please use method buildAzureDisk instead.
 * @return The buildable object.
 */
@Deprecated public AzureDiskVolumeSource getAzureDisk(){
            return this.azureDisk!=null?this.azureDisk.build():null;
    }

    public AzureDiskVolumeSource buildAzureDisk(){
            return this.azureDisk!=null?this.azureDisk.build():null;
    }

    public A withAzureDisk(AzureDiskVolumeSource azureDisk){
            _visitables.remove(this.azureDisk);
            if (azureDisk!=null){ this.azureDisk= new AzureDiskVolumeSourceBuilder(azureDisk); _visitables.add(this.azureDisk);} return (A) this;
    }

    public Boolean hasAzureDisk(){
            return this.azureDisk != null;
    }

    public VolumeFluent.AzureDiskNested<A> withNewAzureDisk(){
            return new AzureDiskNestedImpl();
    }

    public VolumeFluent.AzureDiskNested<A> withNewAzureDiskLike(AzureDiskVolumeSource item){
            return new AzureDiskNestedImpl(item);
    }

    public VolumeFluent.AzureDiskNested<A> editAzureDisk(){
            return withNewAzureDiskLike(getAzureDisk());
    }

    public VolumeFluent.AzureDiskNested<A> editOrNewAzureDisk(){
            return withNewAzureDiskLike(getAzureDisk() != null ? getAzureDisk(): new AzureDiskVolumeSourceBuilder().build());
    }

    public VolumeFluent.AzureDiskNested<A> editOrNewAzureDiskLike(AzureDiskVolumeSource item){
            return withNewAzureDiskLike(getAzureDisk() != null ? getAzureDisk(): item);
    }

    
/**
 * This method has been deprecated, please use method buildAzureFile instead.
 * @return The buildable object.
 */
@Deprecated public AzureFileVolumeSource getAzureFile(){
            return this.azureFile!=null?this.azureFile.build():null;
    }

    public AzureFileVolumeSource buildAzureFile(){
            return this.azureFile!=null?this.azureFile.build():null;
    }

    public A withAzureFile(AzureFileVolumeSource azureFile){
            _visitables.remove(this.azureFile);
            if (azureFile!=null){ this.azureFile= new AzureFileVolumeSourceBuilder(azureFile); _visitables.add(this.azureFile);} return (A) this;
    }

    public Boolean hasAzureFile(){
            return this.azureFile != null;
    }

    public A withNewAzureFile(Boolean readOnly,String secretName,String shareName){
            return (A)withAzureFile(new AzureFileVolumeSource(readOnly, secretName, shareName));
    }

    public VolumeFluent.AzureFileNested<A> withNewAzureFile(){
            return new AzureFileNestedImpl();
    }

    public VolumeFluent.AzureFileNested<A> withNewAzureFileLike(AzureFileVolumeSource item){
            return new AzureFileNestedImpl(item);
    }

    public VolumeFluent.AzureFileNested<A> editAzureFile(){
            return withNewAzureFileLike(getAzureFile());
    }

    public VolumeFluent.AzureFileNested<A> editOrNewAzureFile(){
            return withNewAzureFileLike(getAzureFile() != null ? getAzureFile(): new AzureFileVolumeSourceBuilder().build());
    }

    public VolumeFluent.AzureFileNested<A> editOrNewAzureFileLike(AzureFileVolumeSource item){
            return withNewAzureFileLike(getAzureFile() != null ? getAzureFile(): item);
    }

    
/**
 * This method has been deprecated, please use method buildCephfs instead.
 * @return The buildable object.
 */
@Deprecated public CephFSVolumeSource getCephfs(){
            return this.cephfs!=null?this.cephfs.build():null;
    }

    public CephFSVolumeSource buildCephfs(){
            return this.cephfs!=null?this.cephfs.build():null;
    }

    public A withCephfs(CephFSVolumeSource cephfs){
            _visitables.remove(this.cephfs);
            if (cephfs!=null){ this.cephfs= new CephFSVolumeSourceBuilder(cephfs); _visitables.add(this.cephfs);} return (A) this;
    }

    public Boolean hasCephfs(){
            return this.cephfs != null;
    }

    public VolumeFluent.CephfsNested<A> withNewCephfs(){
            return new CephfsNestedImpl();
    }

    public VolumeFluent.CephfsNested<A> withNewCephfsLike(CephFSVolumeSource item){
            return new CephfsNestedImpl(item);
    }

    public VolumeFluent.CephfsNested<A> editCephfs(){
            return withNewCephfsLike(getCephfs());
    }

    public VolumeFluent.CephfsNested<A> editOrNewCephfs(){
            return withNewCephfsLike(getCephfs() != null ? getCephfs(): new CephFSVolumeSourceBuilder().build());
    }

    public VolumeFluent.CephfsNested<A> editOrNewCephfsLike(CephFSVolumeSource item){
            return withNewCephfsLike(getCephfs() != null ? getCephfs(): item);
    }

    
/**
 * This method has been deprecated, please use method buildCinder instead.
 * @return The buildable object.
 */
@Deprecated public CinderVolumeSource getCinder(){
            return this.cinder!=null?this.cinder.build():null;
    }

    public CinderVolumeSource buildCinder(){
            return this.cinder!=null?this.cinder.build():null;
    }

    public A withCinder(CinderVolumeSource cinder){
            _visitables.remove(this.cinder);
            if (cinder!=null){ this.cinder= new CinderVolumeSourceBuilder(cinder); _visitables.add(this.cinder);} return (A) this;
    }

    public Boolean hasCinder(){
            return this.cinder != null;
    }

    public VolumeFluent.CinderNested<A> withNewCinder(){
            return new CinderNestedImpl();
    }

    public VolumeFluent.CinderNested<A> withNewCinderLike(CinderVolumeSource item){
            return new CinderNestedImpl(item);
    }

    public VolumeFluent.CinderNested<A> editCinder(){
            return withNewCinderLike(getCinder());
    }

    public VolumeFluent.CinderNested<A> editOrNewCinder(){
            return withNewCinderLike(getCinder() != null ? getCinder(): new CinderVolumeSourceBuilder().build());
    }

    public VolumeFluent.CinderNested<A> editOrNewCinderLike(CinderVolumeSource item){
            return withNewCinderLike(getCinder() != null ? getCinder(): item);
    }

    
/**
 * This method has been deprecated, please use method buildConfigMap instead.
 * @return The buildable object.
 */
@Deprecated public ConfigMapVolumeSource getConfigMap(){
            return this.configMap!=null?this.configMap.build():null;
    }

    public ConfigMapVolumeSource buildConfigMap(){
            return this.configMap!=null?this.configMap.build():null;
    }

    public A withConfigMap(ConfigMapVolumeSource configMap){
            _visitables.remove(this.configMap);
            if (configMap!=null){ this.configMap= new ConfigMapVolumeSourceBuilder(configMap); _visitables.add(this.configMap);} return (A) this;
    }

    public Boolean hasConfigMap(){
            return this.configMap != null;
    }

    public VolumeFluent.ConfigMapNested<A> withNewConfigMap(){
            return new ConfigMapNestedImpl();
    }

    public VolumeFluent.ConfigMapNested<A> withNewConfigMapLike(ConfigMapVolumeSource item){
            return new ConfigMapNestedImpl(item);
    }

    public VolumeFluent.ConfigMapNested<A> editConfigMap(){
            return withNewConfigMapLike(getConfigMap());
    }

    public VolumeFluent.ConfigMapNested<A> editOrNewConfigMap(){
            return withNewConfigMapLike(getConfigMap() != null ? getConfigMap(): new ConfigMapVolumeSourceBuilder().build());
    }

    public VolumeFluent.ConfigMapNested<A> editOrNewConfigMapLike(ConfigMapVolumeSource item){
            return withNewConfigMapLike(getConfigMap() != null ? getConfigMap(): item);
    }

    
/**
 * This method has been deprecated, please use method buildDownwardAPI instead.
 * @return The buildable object.
 */
@Deprecated public DownwardAPIVolumeSource getDownwardAPI(){
            return this.downwardAPI!=null?this.downwardAPI.build():null;
    }

    public DownwardAPIVolumeSource buildDownwardAPI(){
            return this.downwardAPI!=null?this.downwardAPI.build():null;
    }

    public A withDownwardAPI(DownwardAPIVolumeSource downwardAPI){
            _visitables.remove(this.downwardAPI);
            if (downwardAPI!=null){ this.downwardAPI= new DownwardAPIVolumeSourceBuilder(downwardAPI); _visitables.add(this.downwardAPI);} return (A) this;
    }

    public Boolean hasDownwardAPI(){
            return this.downwardAPI != null;
    }

    public VolumeFluent.DownwardAPINested<A> withNewDownwardAPI(){
            return new DownwardAPINestedImpl();
    }

    public VolumeFluent.DownwardAPINested<A> withNewDownwardAPILike(DownwardAPIVolumeSource item){
            return new DownwardAPINestedImpl(item);
    }

    public VolumeFluent.DownwardAPINested<A> editDownwardAPI(){
            return withNewDownwardAPILike(getDownwardAPI());
    }

    public VolumeFluent.DownwardAPINested<A> editOrNewDownwardAPI(){
            return withNewDownwardAPILike(getDownwardAPI() != null ? getDownwardAPI(): new DownwardAPIVolumeSourceBuilder().build());
    }

    public VolumeFluent.DownwardAPINested<A> editOrNewDownwardAPILike(DownwardAPIVolumeSource item){
            return withNewDownwardAPILike(getDownwardAPI() != null ? getDownwardAPI(): item);
    }

    
/**
 * This method has been deprecated, please use method buildEmptyDir instead.
 * @return The buildable object.
 */
@Deprecated public EmptyDirVolumeSource getEmptyDir(){
            return this.emptyDir!=null?this.emptyDir.build():null;
    }

    public EmptyDirVolumeSource buildEmptyDir(){
            return this.emptyDir!=null?this.emptyDir.build():null;
    }

    public A withEmptyDir(EmptyDirVolumeSource emptyDir){
            _visitables.remove(this.emptyDir);
            if (emptyDir!=null){ this.emptyDir= new EmptyDirVolumeSourceBuilder(emptyDir); _visitables.add(this.emptyDir);} return (A) this;
    }

    public Boolean hasEmptyDir(){
            return this.emptyDir != null;
    }

    public VolumeFluent.EmptyDirNested<A> withNewEmptyDir(){
            return new EmptyDirNestedImpl();
    }

    public VolumeFluent.EmptyDirNested<A> withNewEmptyDirLike(EmptyDirVolumeSource item){
            return new EmptyDirNestedImpl(item);
    }

    public VolumeFluent.EmptyDirNested<A> editEmptyDir(){
            return withNewEmptyDirLike(getEmptyDir());
    }

    public VolumeFluent.EmptyDirNested<A> editOrNewEmptyDir(){
            return withNewEmptyDirLike(getEmptyDir() != null ? getEmptyDir(): new EmptyDirVolumeSourceBuilder().build());
    }

    public VolumeFluent.EmptyDirNested<A> editOrNewEmptyDirLike(EmptyDirVolumeSource item){
            return withNewEmptyDirLike(getEmptyDir() != null ? getEmptyDir(): item);
    }

    
/**
 * This method has been deprecated, please use method buildFc instead.
 * @return The buildable object.
 */
@Deprecated public FCVolumeSource getFc(){
            return this.fc!=null?this.fc.build():null;
    }

    public FCVolumeSource buildFc(){
            return this.fc!=null?this.fc.build():null;
    }

    public A withFc(FCVolumeSource fc){
            _visitables.remove(this.fc);
            if (fc!=null){ this.fc= new FCVolumeSourceBuilder(fc); _visitables.add(this.fc);} return (A) this;
    }

    public Boolean hasFc(){
            return this.fc != null;
    }

    public VolumeFluent.FcNested<A> withNewFc(){
            return new FcNestedImpl();
    }

    public VolumeFluent.FcNested<A> withNewFcLike(FCVolumeSource item){
            return new FcNestedImpl(item);
    }

    public VolumeFluent.FcNested<A> editFc(){
            return withNewFcLike(getFc());
    }

    public VolumeFluent.FcNested<A> editOrNewFc(){
            return withNewFcLike(getFc() != null ? getFc(): new FCVolumeSourceBuilder().build());
    }

    public VolumeFluent.FcNested<A> editOrNewFcLike(FCVolumeSource item){
            return withNewFcLike(getFc() != null ? getFc(): item);
    }

    
/**
 * This method has been deprecated, please use method buildFlexVolume instead.
 * @return The buildable object.
 */
@Deprecated public FlexVolumeSource getFlexVolume(){
            return this.flexVolume!=null?this.flexVolume.build():null;
    }

    public FlexVolumeSource buildFlexVolume(){
            return this.flexVolume!=null?this.flexVolume.build():null;
    }

    public A withFlexVolume(FlexVolumeSource flexVolume){
            _visitables.remove(this.flexVolume);
            if (flexVolume!=null){ this.flexVolume= new FlexVolumeSourceBuilder(flexVolume); _visitables.add(this.flexVolume);} return (A) this;
    }

    public Boolean hasFlexVolume(){
            return this.flexVolume != null;
    }

    public VolumeFluent.FlexVolumeNested<A> withNewFlexVolume(){
            return new FlexVolumeNestedImpl();
    }

    public VolumeFluent.FlexVolumeNested<A> withNewFlexVolumeLike(FlexVolumeSource item){
            return new FlexVolumeNestedImpl(item);
    }

    public VolumeFluent.FlexVolumeNested<A> editFlexVolume(){
            return withNewFlexVolumeLike(getFlexVolume());
    }

    public VolumeFluent.FlexVolumeNested<A> editOrNewFlexVolume(){
            return withNewFlexVolumeLike(getFlexVolume() != null ? getFlexVolume(): new FlexVolumeSourceBuilder().build());
    }

    public VolumeFluent.FlexVolumeNested<A> editOrNewFlexVolumeLike(FlexVolumeSource item){
            return withNewFlexVolumeLike(getFlexVolume() != null ? getFlexVolume(): item);
    }

    
/**
 * This method has been deprecated, please use method buildFlocker instead.
 * @return The buildable object.
 */
@Deprecated public FlockerVolumeSource getFlocker(){
            return this.flocker!=null?this.flocker.build():null;
    }

    public FlockerVolumeSource buildFlocker(){
            return this.flocker!=null?this.flocker.build():null;
    }

    public A withFlocker(FlockerVolumeSource flocker){
            _visitables.remove(this.flocker);
            if (flocker!=null){ this.flocker= new FlockerVolumeSourceBuilder(flocker); _visitables.add(this.flocker);} return (A) this;
    }

    public Boolean hasFlocker(){
            return this.flocker != null;
    }

    public A withNewFlocker(String datasetName,String datasetUUID){
            return (A)withFlocker(new FlockerVolumeSource(datasetName, datasetUUID));
    }

    public VolumeFluent.FlockerNested<A> withNewFlocker(){
            return new FlockerNestedImpl();
    }

    public VolumeFluent.FlockerNested<A> withNewFlockerLike(FlockerVolumeSource item){
            return new FlockerNestedImpl(item);
    }

    public VolumeFluent.FlockerNested<A> editFlocker(){
            return withNewFlockerLike(getFlocker());
    }

    public VolumeFluent.FlockerNested<A> editOrNewFlocker(){
            return withNewFlockerLike(getFlocker() != null ? getFlocker(): new FlockerVolumeSourceBuilder().build());
    }

    public VolumeFluent.FlockerNested<A> editOrNewFlockerLike(FlockerVolumeSource item){
            return withNewFlockerLike(getFlocker() != null ? getFlocker(): item);
    }

    
/**
 * This method has been deprecated, please use method buildGcePersistentDisk instead.
 * @return The buildable object.
 */
@Deprecated public GCEPersistentDiskVolumeSource getGcePersistentDisk(){
            return this.gcePersistentDisk!=null?this.gcePersistentDisk.build():null;
    }

    public GCEPersistentDiskVolumeSource buildGcePersistentDisk(){
            return this.gcePersistentDisk!=null?this.gcePersistentDisk.build():null;
    }

    public A withGcePersistentDisk(GCEPersistentDiskVolumeSource gcePersistentDisk){
            _visitables.remove(this.gcePersistentDisk);
            if (gcePersistentDisk!=null){ this.gcePersistentDisk= new GCEPersistentDiskVolumeSourceBuilder(gcePersistentDisk); _visitables.add(this.gcePersistentDisk);} return (A) this;
    }

    public Boolean hasGcePersistentDisk(){
            return this.gcePersistentDisk != null;
    }

    public A withNewGcePersistentDisk(String fsType,Integer partition,String pdName,Boolean readOnly){
            return (A)withGcePersistentDisk(new GCEPersistentDiskVolumeSource(fsType, partition, pdName, readOnly));
    }

    public VolumeFluent.GcePersistentDiskNested<A> withNewGcePersistentDisk(){
            return new GcePersistentDiskNestedImpl();
    }

    public VolumeFluent.GcePersistentDiskNested<A> withNewGcePersistentDiskLike(GCEPersistentDiskVolumeSource item){
            return new GcePersistentDiskNestedImpl(item);
    }

    public VolumeFluent.GcePersistentDiskNested<A> editGcePersistentDisk(){
            return withNewGcePersistentDiskLike(getGcePersistentDisk());
    }

    public VolumeFluent.GcePersistentDiskNested<A> editOrNewGcePersistentDisk(){
            return withNewGcePersistentDiskLike(getGcePersistentDisk() != null ? getGcePersistentDisk(): new GCEPersistentDiskVolumeSourceBuilder().build());
    }

    public VolumeFluent.GcePersistentDiskNested<A> editOrNewGcePersistentDiskLike(GCEPersistentDiskVolumeSource item){
            return withNewGcePersistentDiskLike(getGcePersistentDisk() != null ? getGcePersistentDisk(): item);
    }

    
/**
 * This method has been deprecated, please use method buildGitRepo instead.
 * @return The buildable object.
 */
@Deprecated public GitRepoVolumeSource getGitRepo(){
            return this.gitRepo!=null?this.gitRepo.build():null;
    }

    public GitRepoVolumeSource buildGitRepo(){
            return this.gitRepo!=null?this.gitRepo.build():null;
    }

    public A withGitRepo(GitRepoVolumeSource gitRepo){
            _visitables.remove(this.gitRepo);
            if (gitRepo!=null){ this.gitRepo= new GitRepoVolumeSourceBuilder(gitRepo); _visitables.add(this.gitRepo);} return (A) this;
    }

    public Boolean hasGitRepo(){
            return this.gitRepo != null;
    }

    public A withNewGitRepo(String directory,String repository,String revision){
            return (A)withGitRepo(new GitRepoVolumeSource(directory, repository, revision));
    }

    public VolumeFluent.GitRepoNested<A> withNewGitRepo(){
            return new GitRepoNestedImpl();
    }

    public VolumeFluent.GitRepoNested<A> withNewGitRepoLike(GitRepoVolumeSource item){
            return new GitRepoNestedImpl(item);
    }

    public VolumeFluent.GitRepoNested<A> editGitRepo(){
            return withNewGitRepoLike(getGitRepo());
    }

    public VolumeFluent.GitRepoNested<A> editOrNewGitRepo(){
            return withNewGitRepoLike(getGitRepo() != null ? getGitRepo(): new GitRepoVolumeSourceBuilder().build());
    }

    public VolumeFluent.GitRepoNested<A> editOrNewGitRepoLike(GitRepoVolumeSource item){
            return withNewGitRepoLike(getGitRepo() != null ? getGitRepo(): item);
    }

    
/**
 * This method has been deprecated, please use method buildGlusterfs instead.
 * @return The buildable object.
 */
@Deprecated public GlusterfsVolumeSource getGlusterfs(){
            return this.glusterfs!=null?this.glusterfs.build():null;
    }

    public GlusterfsVolumeSource buildGlusterfs(){
            return this.glusterfs!=null?this.glusterfs.build():null;
    }

    public A withGlusterfs(GlusterfsVolumeSource glusterfs){
            _visitables.remove(this.glusterfs);
            if (glusterfs!=null){ this.glusterfs= new GlusterfsVolumeSourceBuilder(glusterfs); _visitables.add(this.glusterfs);} return (A) this;
    }

    public Boolean hasGlusterfs(){
            return this.glusterfs != null;
    }

    public A withNewGlusterfs(String endpoints,String path,Boolean readOnly){
            return (A)withGlusterfs(new GlusterfsVolumeSource(endpoints, path, readOnly));
    }

    public VolumeFluent.GlusterfsNested<A> withNewGlusterfs(){
            return new GlusterfsNestedImpl();
    }

    public VolumeFluent.GlusterfsNested<A> withNewGlusterfsLike(GlusterfsVolumeSource item){
            return new GlusterfsNestedImpl(item);
    }

    public VolumeFluent.GlusterfsNested<A> editGlusterfs(){
            return withNewGlusterfsLike(getGlusterfs());
    }

    public VolumeFluent.GlusterfsNested<A> editOrNewGlusterfs(){
            return withNewGlusterfsLike(getGlusterfs() != null ? getGlusterfs(): new GlusterfsVolumeSourceBuilder().build());
    }

    public VolumeFluent.GlusterfsNested<A> editOrNewGlusterfsLike(GlusterfsVolumeSource item){
            return withNewGlusterfsLike(getGlusterfs() != null ? getGlusterfs(): item);
    }

    
/**
 * This method has been deprecated, please use method buildHostPath instead.
 * @return The buildable object.
 */
@Deprecated public HostPathVolumeSource getHostPath(){
            return this.hostPath!=null?this.hostPath.build():null;
    }

    public HostPathVolumeSource buildHostPath(){
            return this.hostPath!=null?this.hostPath.build():null;
    }

    public A withHostPath(HostPathVolumeSource hostPath){
            _visitables.remove(this.hostPath);
            if (hostPath!=null){ this.hostPath= new HostPathVolumeSourceBuilder(hostPath); _visitables.add(this.hostPath);} return (A) this;
    }

    public Boolean hasHostPath(){
            return this.hostPath != null;
    }

    public A withNewHostPath(String path,String type){
            return (A)withHostPath(new HostPathVolumeSource(path, type));
    }

    public VolumeFluent.HostPathNested<A> withNewHostPath(){
            return new HostPathNestedImpl();
    }

    public VolumeFluent.HostPathNested<A> withNewHostPathLike(HostPathVolumeSource item){
            return new HostPathNestedImpl(item);
    }

    public VolumeFluent.HostPathNested<A> editHostPath(){
            return withNewHostPathLike(getHostPath());
    }

    public VolumeFluent.HostPathNested<A> editOrNewHostPath(){
            return withNewHostPathLike(getHostPath() != null ? getHostPath(): new HostPathVolumeSourceBuilder().build());
    }

    public VolumeFluent.HostPathNested<A> editOrNewHostPathLike(HostPathVolumeSource item){
            return withNewHostPathLike(getHostPath() != null ? getHostPath(): item);
    }

    
/**
 * This method has been deprecated, please use method buildIscsi instead.
 * @return The buildable object.
 */
@Deprecated public ISCSIVolumeSource getIscsi(){
            return this.iscsi!=null?this.iscsi.build():null;
    }

    public ISCSIVolumeSource buildIscsi(){
            return this.iscsi!=null?this.iscsi.build():null;
    }

    public A withIscsi(ISCSIVolumeSource iscsi){
            _visitables.remove(this.iscsi);
            if (iscsi!=null){ this.iscsi= new ISCSIVolumeSourceBuilder(iscsi); _visitables.add(this.iscsi);} return (A) this;
    }

    public Boolean hasIscsi(){
            return this.iscsi != null;
    }

    public VolumeFluent.IscsiNested<A> withNewIscsi(){
            return new IscsiNestedImpl();
    }

    public VolumeFluent.IscsiNested<A> withNewIscsiLike(ISCSIVolumeSource item){
            return new IscsiNestedImpl(item);
    }

    public VolumeFluent.IscsiNested<A> editIscsi(){
            return withNewIscsiLike(getIscsi());
    }

    public VolumeFluent.IscsiNested<A> editOrNewIscsi(){
            return withNewIscsiLike(getIscsi() != null ? getIscsi(): new ISCSIVolumeSourceBuilder().build());
    }

    public VolumeFluent.IscsiNested<A> editOrNewIscsiLike(ISCSIVolumeSource item){
            return withNewIscsiLike(getIscsi() != null ? getIscsi(): item);
    }

    public String getName(){
            return this.name;
    }

    public A withName(String name){
            this.name=name; return (A) this;
    }

    public Boolean hasName(){
            return this.name != null;
    }

    
/**
 * This method has been deprecated, please use method buildNfs instead.
 * @return The buildable object.
 */
@Deprecated public NFSVolumeSource getNfs(){
            return this.nfs!=null?this.nfs.build():null;
    }

    public NFSVolumeSource buildNfs(){
            return this.nfs!=null?this.nfs.build():null;
    }

    public A withNfs(NFSVolumeSource nfs){
            _visitables.remove(this.nfs);
            if (nfs!=null){ this.nfs= new NFSVolumeSourceBuilder(nfs); _visitables.add(this.nfs);} return (A) this;
    }

    public Boolean hasNfs(){
            return this.nfs != null;
    }

    public A withNewNfs(String path,Boolean readOnly,String server){
            return (A)withNfs(new NFSVolumeSource(path, readOnly, server));
    }

    public VolumeFluent.NfsNested<A> withNewNfs(){
            return new NfsNestedImpl();
    }

    public VolumeFluent.NfsNested<A> withNewNfsLike(NFSVolumeSource item){
            return new NfsNestedImpl(item);
    }

    public VolumeFluent.NfsNested<A> editNfs(){
            return withNewNfsLike(getNfs());
    }

    public VolumeFluent.NfsNested<A> editOrNewNfs(){
            return withNewNfsLike(getNfs() != null ? getNfs(): new NFSVolumeSourceBuilder().build());
    }

    public VolumeFluent.NfsNested<A> editOrNewNfsLike(NFSVolumeSource item){
            return withNewNfsLike(getNfs() != null ? getNfs(): item);
    }

    
/**
 * This method has been deprecated, please use method buildPersistentVolumeClaim instead.
 * @return The buildable object.
 */
@Deprecated public PersistentVolumeClaimVolumeSource getPersistentVolumeClaim(){
            return this.persistentVolumeClaim!=null?this.persistentVolumeClaim.build():null;
    }

    public PersistentVolumeClaimVolumeSource buildPersistentVolumeClaim(){
            return this.persistentVolumeClaim!=null?this.persistentVolumeClaim.build():null;
    }

    public A withPersistentVolumeClaim(PersistentVolumeClaimVolumeSource persistentVolumeClaim){
            _visitables.remove(this.persistentVolumeClaim);
            if (persistentVolumeClaim!=null){ this.persistentVolumeClaim= new PersistentVolumeClaimVolumeSourceBuilder(persistentVolumeClaim); _visitables.add(this.persistentVolumeClaim);} return (A) this;
    }

    public Boolean hasPersistentVolumeClaim(){
            return this.persistentVolumeClaim != null;
    }

    public A withNewPersistentVolumeClaim(String claimName,Boolean readOnly){
            return (A)withPersistentVolumeClaim(new PersistentVolumeClaimVolumeSource(claimName, readOnly));
    }

    public VolumeFluent.PersistentVolumeClaimNested<A> withNewPersistentVolumeClaim(){
            return new PersistentVolumeClaimNestedImpl();
    }

    public VolumeFluent.PersistentVolumeClaimNested<A> withNewPersistentVolumeClaimLike(PersistentVolumeClaimVolumeSource item){
            return new PersistentVolumeClaimNestedImpl(item);
    }

    public VolumeFluent.PersistentVolumeClaimNested<A> editPersistentVolumeClaim(){
            return withNewPersistentVolumeClaimLike(getPersistentVolumeClaim());
    }

    public VolumeFluent.PersistentVolumeClaimNested<A> editOrNewPersistentVolumeClaim(){
            return withNewPersistentVolumeClaimLike(getPersistentVolumeClaim() != null ? getPersistentVolumeClaim(): new PersistentVolumeClaimVolumeSourceBuilder().build());
    }

    public VolumeFluent.PersistentVolumeClaimNested<A> editOrNewPersistentVolumeClaimLike(PersistentVolumeClaimVolumeSource item){
            return withNewPersistentVolumeClaimLike(getPersistentVolumeClaim() != null ? getPersistentVolumeClaim(): item);
    }

    
/**
 * This method has been deprecated, please use method buildPhotonPersistentDisk instead.
 * @return The buildable object.
 */
@Deprecated public PhotonPersistentDiskVolumeSource getPhotonPersistentDisk(){
            return this.photonPersistentDisk!=null?this.photonPersistentDisk.build():null;
    }

    public PhotonPersistentDiskVolumeSource buildPhotonPersistentDisk(){
            return this.photonPersistentDisk!=null?this.photonPersistentDisk.build():null;
    }

    public A withPhotonPersistentDisk(PhotonPersistentDiskVolumeSource photonPersistentDisk){
            _visitables.remove(this.photonPersistentDisk);
            if (photonPersistentDisk!=null){ this.photonPersistentDisk= new PhotonPersistentDiskVolumeSourceBuilder(photonPersistentDisk); _visitables.add(this.photonPersistentDisk);} return (A) this;
    }

    public Boolean hasPhotonPersistentDisk(){
            return this.photonPersistentDisk != null;
    }

    public A withNewPhotonPersistentDisk(String fsType,String pdID){
            return (A)withPhotonPersistentDisk(new PhotonPersistentDiskVolumeSource(fsType, pdID));
    }

    public VolumeFluent.PhotonPersistentDiskNested<A> withNewPhotonPersistentDisk(){
            return new PhotonPersistentDiskNestedImpl();
    }

    public VolumeFluent.PhotonPersistentDiskNested<A> withNewPhotonPersistentDiskLike(PhotonPersistentDiskVolumeSource item){
            return new PhotonPersistentDiskNestedImpl(item);
    }

    public VolumeFluent.PhotonPersistentDiskNested<A> editPhotonPersistentDisk(){
            return withNewPhotonPersistentDiskLike(getPhotonPersistentDisk());
    }

    public VolumeFluent.PhotonPersistentDiskNested<A> editOrNewPhotonPersistentDisk(){
            return withNewPhotonPersistentDiskLike(getPhotonPersistentDisk() != null ? getPhotonPersistentDisk(): new PhotonPersistentDiskVolumeSourceBuilder().build());
    }

    public VolumeFluent.PhotonPersistentDiskNested<A> editOrNewPhotonPersistentDiskLike(PhotonPersistentDiskVolumeSource item){
            return withNewPhotonPersistentDiskLike(getPhotonPersistentDisk() != null ? getPhotonPersistentDisk(): item);
    }

    
/**
 * This method has been deprecated, please use method buildPortworxVolume instead.
 * @return The buildable object.
 */
@Deprecated public PortworxVolumeSource getPortworxVolume(){
            return this.portworxVolume!=null?this.portworxVolume.build():null;
    }

    public PortworxVolumeSource buildPortworxVolume(){
            return this.portworxVolume!=null?this.portworxVolume.build():null;
    }

    public A withPortworxVolume(PortworxVolumeSource portworxVolume){
            _visitables.remove(this.portworxVolume);
            if (portworxVolume!=null){ this.portworxVolume= new PortworxVolumeSourceBuilder(portworxVolume); _visitables.add(this.portworxVolume);} return (A) this;
    }

    public Boolean hasPortworxVolume(){
            return this.portworxVolume != null;
    }

    public A withNewPortworxVolume(String fsType,Boolean readOnly,String volumeID){
            return (A)withPortworxVolume(new PortworxVolumeSource(fsType, readOnly, volumeID));
    }

    public VolumeFluent.PortworxVolumeNested<A> withNewPortworxVolume(){
            return new PortworxVolumeNestedImpl();
    }

    public VolumeFluent.PortworxVolumeNested<A> withNewPortworxVolumeLike(PortworxVolumeSource item){
            return new PortworxVolumeNestedImpl(item);
    }

    public VolumeFluent.PortworxVolumeNested<A> editPortworxVolume(){
            return withNewPortworxVolumeLike(getPortworxVolume());
    }

    public VolumeFluent.PortworxVolumeNested<A> editOrNewPortworxVolume(){
            return withNewPortworxVolumeLike(getPortworxVolume() != null ? getPortworxVolume(): new PortworxVolumeSourceBuilder().build());
    }

    public VolumeFluent.PortworxVolumeNested<A> editOrNewPortworxVolumeLike(PortworxVolumeSource item){
            return withNewPortworxVolumeLike(getPortworxVolume() != null ? getPortworxVolume(): item);
    }

    
/**
 * This method has been deprecated, please use method buildProjected instead.
 * @return The buildable object.
 */
@Deprecated public ProjectedVolumeSource getProjected(){
            return this.projected!=null?this.projected.build():null;
    }

    public ProjectedVolumeSource buildProjected(){
            return this.projected!=null?this.projected.build():null;
    }

    public A withProjected(ProjectedVolumeSource projected){
            _visitables.remove(this.projected);
            if (projected!=null){ this.projected= new ProjectedVolumeSourceBuilder(projected); _visitables.add(this.projected);} return (A) this;
    }

    public Boolean hasProjected(){
            return this.projected != null;
    }

    public VolumeFluent.ProjectedNested<A> withNewProjected(){
            return new ProjectedNestedImpl();
    }

    public VolumeFluent.ProjectedNested<A> withNewProjectedLike(ProjectedVolumeSource item){
            return new ProjectedNestedImpl(item);
    }

    public VolumeFluent.ProjectedNested<A> editProjected(){
            return withNewProjectedLike(getProjected());
    }

    public VolumeFluent.ProjectedNested<A> editOrNewProjected(){
            return withNewProjectedLike(getProjected() != null ? getProjected(): new ProjectedVolumeSourceBuilder().build());
    }

    public VolumeFluent.ProjectedNested<A> editOrNewProjectedLike(ProjectedVolumeSource item){
            return withNewProjectedLike(getProjected() != null ? getProjected(): item);
    }

    
/**
 * This method has been deprecated, please use method buildQuobyte instead.
 * @return The buildable object.
 */
@Deprecated public QuobyteVolumeSource getQuobyte(){
            return this.quobyte!=null?this.quobyte.build():null;
    }

    public QuobyteVolumeSource buildQuobyte(){
            return this.quobyte!=null?this.quobyte.build():null;
    }

    public A withQuobyte(QuobyteVolumeSource quobyte){
            _visitables.remove(this.quobyte);
            if (quobyte!=null){ this.quobyte= new QuobyteVolumeSourceBuilder(quobyte); _visitables.add(this.quobyte);} return (A) this;
    }

    public Boolean hasQuobyte(){
            return this.quobyte != null;
    }

    public A withNewQuobyte(String group,Boolean readOnly,String registry,String user,String volume){
            return (A)withQuobyte(new QuobyteVolumeSource(group, readOnly, registry, user, volume));
    }

    public VolumeFluent.QuobyteNested<A> withNewQuobyte(){
            return new QuobyteNestedImpl();
    }

    public VolumeFluent.QuobyteNested<A> withNewQuobyteLike(QuobyteVolumeSource item){
            return new QuobyteNestedImpl(item);
    }

    public VolumeFluent.QuobyteNested<A> editQuobyte(){
            return withNewQuobyteLike(getQuobyte());
    }

    public VolumeFluent.QuobyteNested<A> editOrNewQuobyte(){
            return withNewQuobyteLike(getQuobyte() != null ? getQuobyte(): new QuobyteVolumeSourceBuilder().build());
    }

    public VolumeFluent.QuobyteNested<A> editOrNewQuobyteLike(QuobyteVolumeSource item){
            return withNewQuobyteLike(getQuobyte() != null ? getQuobyte(): item);
    }

    
/**
 * This method has been deprecated, please use method buildRbd instead.
 * @return The buildable object.
 */
@Deprecated public RBDVolumeSource getRbd(){
            return this.rbd!=null?this.rbd.build():null;
    }

    public RBDVolumeSource buildRbd(){
            return this.rbd!=null?this.rbd.build():null;
    }

    public A withRbd(RBDVolumeSource rbd){
            _visitables.remove(this.rbd);
            if (rbd!=null){ this.rbd= new RBDVolumeSourceBuilder(rbd); _visitables.add(this.rbd);} return (A) this;
    }

    public Boolean hasRbd(){
            return this.rbd != null;
    }

    public VolumeFluent.RbdNested<A> withNewRbd(){
            return new RbdNestedImpl();
    }

    public VolumeFluent.RbdNested<A> withNewRbdLike(RBDVolumeSource item){
            return new RbdNestedImpl(item);
    }

    public VolumeFluent.RbdNested<A> editRbd(){
            return withNewRbdLike(getRbd());
    }

    public VolumeFluent.RbdNested<A> editOrNewRbd(){
            return withNewRbdLike(getRbd() != null ? getRbd(): new RBDVolumeSourceBuilder().build());
    }

    public VolumeFluent.RbdNested<A> editOrNewRbdLike(RBDVolumeSource item){
            return withNewRbdLike(getRbd() != null ? getRbd(): item);
    }

    
/**
 * This method has been deprecated, please use method buildScaleIO instead.
 * @return The buildable object.
 */
@Deprecated public ScaleIOVolumeSource getScaleIO(){
            return this.scaleIO!=null?this.scaleIO.build():null;
    }

    public ScaleIOVolumeSource buildScaleIO(){
            return this.scaleIO!=null?this.scaleIO.build():null;
    }

    public A withScaleIO(ScaleIOVolumeSource scaleIO){
            _visitables.remove(this.scaleIO);
            if (scaleIO!=null){ this.scaleIO= new ScaleIOVolumeSourceBuilder(scaleIO); _visitables.add(this.scaleIO);} return (A) this;
    }

    public Boolean hasScaleIO(){
            return this.scaleIO != null;
    }

    public VolumeFluent.ScaleIONested<A> withNewScaleIO(){
            return new ScaleIONestedImpl();
    }

    public VolumeFluent.ScaleIONested<A> withNewScaleIOLike(ScaleIOVolumeSource item){
            return new ScaleIONestedImpl(item);
    }

    public VolumeFluent.ScaleIONested<A> editScaleIO(){
            return withNewScaleIOLike(getScaleIO());
    }

    public VolumeFluent.ScaleIONested<A> editOrNewScaleIO(){
            return withNewScaleIOLike(getScaleIO() != null ? getScaleIO(): new ScaleIOVolumeSourceBuilder().build());
    }

    public VolumeFluent.ScaleIONested<A> editOrNewScaleIOLike(ScaleIOVolumeSource item){
            return withNewScaleIOLike(getScaleIO() != null ? getScaleIO(): item);
    }

    
/**
 * This method has been deprecated, please use method buildSecret instead.
 * @return The buildable object.
 */
@Deprecated public SecretVolumeSource getSecret(){
            return this.secret!=null?this.secret.build():null;
    }

    public SecretVolumeSource buildSecret(){
            return this.secret!=null?this.secret.build():null;
    }

    public A withSecret(SecretVolumeSource secret){
            _visitables.remove(this.secret);
            if (secret!=null){ this.secret= new SecretVolumeSourceBuilder(secret); _visitables.add(this.secret);} return (A) this;
    }

    public Boolean hasSecret(){
            return this.secret != null;
    }

    public VolumeFluent.SecretNested<A> withNewSecret(){
            return new SecretNestedImpl();
    }

    public VolumeFluent.SecretNested<A> withNewSecretLike(SecretVolumeSource item){
            return new SecretNestedImpl(item);
    }

    public VolumeFluent.SecretNested<A> editSecret(){
            return withNewSecretLike(getSecret());
    }

    public VolumeFluent.SecretNested<A> editOrNewSecret(){
            return withNewSecretLike(getSecret() != null ? getSecret(): new SecretVolumeSourceBuilder().build());
    }

    public VolumeFluent.SecretNested<A> editOrNewSecretLike(SecretVolumeSource item){
            return withNewSecretLike(getSecret() != null ? getSecret(): item);
    }

    
/**
 * This method has been deprecated, please use method buildStorageos instead.
 * @return The buildable object.
 */
@Deprecated public StorageOSVolumeSource getStorageos(){
            return this.storageos!=null?this.storageos.build():null;
    }

    public StorageOSVolumeSource buildStorageos(){
            return this.storageos!=null?this.storageos.build():null;
    }

    public A withStorageos(StorageOSVolumeSource storageos){
            _visitables.remove(this.storageos);
            if (storageos!=null){ this.storageos= new StorageOSVolumeSourceBuilder(storageos); _visitables.add(this.storageos);} return (A) this;
    }

    public Boolean hasStorageos(){
            return this.storageos != null;
    }

    public VolumeFluent.StorageosNested<A> withNewStorageos(){
            return new StorageosNestedImpl();
    }

    public VolumeFluent.StorageosNested<A> withNewStorageosLike(StorageOSVolumeSource item){
            return new StorageosNestedImpl(item);
    }

    public VolumeFluent.StorageosNested<A> editStorageos(){
            return withNewStorageosLike(getStorageos());
    }

    public VolumeFluent.StorageosNested<A> editOrNewStorageos(){
            return withNewStorageosLike(getStorageos() != null ? getStorageos(): new StorageOSVolumeSourceBuilder().build());
    }

    public VolumeFluent.StorageosNested<A> editOrNewStorageosLike(StorageOSVolumeSource item){
            return withNewStorageosLike(getStorageos() != null ? getStorageos(): item);
    }

    
/**
 * This method has been deprecated, please use method buildVsphereVolume instead.
 * @return The buildable object.
 */
@Deprecated public VsphereVirtualDiskVolumeSource getVsphereVolume(){
            return this.vsphereVolume!=null?this.vsphereVolume.build():null;
    }

    public VsphereVirtualDiskVolumeSource buildVsphereVolume(){
            return this.vsphereVolume!=null?this.vsphereVolume.build():null;
    }

    public A withVsphereVolume(VsphereVirtualDiskVolumeSource vsphereVolume){
            _visitables.remove(this.vsphereVolume);
            if (vsphereVolume!=null){ this.vsphereVolume= new VsphereVirtualDiskVolumeSourceBuilder(vsphereVolume); _visitables.add(this.vsphereVolume);} return (A) this;
    }

    public Boolean hasVsphereVolume(){
            return this.vsphereVolume != null;
    }

    public A withNewVsphereVolume(String fsType,String storagePolicyID,String storagePolicyName,String volumePath){
            return (A)withVsphereVolume(new VsphereVirtualDiskVolumeSource(fsType, storagePolicyID, storagePolicyName, volumePath));
    }

    public VolumeFluent.VsphereVolumeNested<A> withNewVsphereVolume(){
            return new VsphereVolumeNestedImpl();
    }

    public VolumeFluent.VsphereVolumeNested<A> withNewVsphereVolumeLike(VsphereVirtualDiskVolumeSource item){
            return new VsphereVolumeNestedImpl(item);
    }

    public VolumeFluent.VsphereVolumeNested<A> editVsphereVolume(){
            return withNewVsphereVolumeLike(getVsphereVolume());
    }

    public VolumeFluent.VsphereVolumeNested<A> editOrNewVsphereVolume(){
            return withNewVsphereVolumeLike(getVsphereVolume() != null ? getVsphereVolume(): new VsphereVirtualDiskVolumeSourceBuilder().build());
    }

    public VolumeFluent.VsphereVolumeNested<A> editOrNewVsphereVolumeLike(VsphereVirtualDiskVolumeSource item){
            return withNewVsphereVolumeLike(getVsphereVolume() != null ? getVsphereVolume(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            VolumeFluentImpl that = (VolumeFluentImpl) o;
            if (awsElasticBlockStore != null ? !awsElasticBlockStore.equals(that.awsElasticBlockStore) :that.awsElasticBlockStore != null) return false;
            if (azureDisk != null ? !azureDisk.equals(that.azureDisk) :that.azureDisk != null) return false;
            if (azureFile != null ? !azureFile.equals(that.azureFile) :that.azureFile != null) return false;
            if (cephfs != null ? !cephfs.equals(that.cephfs) :that.cephfs != null) return false;
            if (cinder != null ? !cinder.equals(that.cinder) :that.cinder != null) return false;
            if (configMap != null ? !configMap.equals(that.configMap) :that.configMap != null) return false;
            if (downwardAPI != null ? !downwardAPI.equals(that.downwardAPI) :that.downwardAPI != null) return false;
            if (emptyDir != null ? !emptyDir.equals(that.emptyDir) :that.emptyDir != null) return false;
            if (fc != null ? !fc.equals(that.fc) :that.fc != null) return false;
            if (flexVolume != null ? !flexVolume.equals(that.flexVolume) :that.flexVolume != null) return false;
            if (flocker != null ? !flocker.equals(that.flocker) :that.flocker != null) return false;
            if (gcePersistentDisk != null ? !gcePersistentDisk.equals(that.gcePersistentDisk) :that.gcePersistentDisk != null) return false;
            if (gitRepo != null ? !gitRepo.equals(that.gitRepo) :that.gitRepo != null) return false;
            if (glusterfs != null ? !glusterfs.equals(that.glusterfs) :that.glusterfs != null) return false;
            if (hostPath != null ? !hostPath.equals(that.hostPath) :that.hostPath != null) return false;
            if (iscsi != null ? !iscsi.equals(that.iscsi) :that.iscsi != null) return false;
            if (name != null ? !name.equals(that.name) :that.name != null) return false;
            if (nfs != null ? !nfs.equals(that.nfs) :that.nfs != null) return false;
            if (persistentVolumeClaim != null ? !persistentVolumeClaim.equals(that.persistentVolumeClaim) :that.persistentVolumeClaim != null) return false;
            if (photonPersistentDisk != null ? !photonPersistentDisk.equals(that.photonPersistentDisk) :that.photonPersistentDisk != null) return false;
            if (portworxVolume != null ? !portworxVolume.equals(that.portworxVolume) :that.portworxVolume != null) return false;
            if (projected != null ? !projected.equals(that.projected) :that.projected != null) return false;
            if (quobyte != null ? !quobyte.equals(that.quobyte) :that.quobyte != null) return false;
            if (rbd != null ? !rbd.equals(that.rbd) :that.rbd != null) return false;
            if (scaleIO != null ? !scaleIO.equals(that.scaleIO) :that.scaleIO != null) return false;
            if (secret != null ? !secret.equals(that.secret) :that.secret != null) return false;
            if (storageos != null ? !storageos.equals(that.storageos) :that.storageos != null) return false;
            if (vsphereVolume != null ? !vsphereVolume.equals(that.vsphereVolume) :that.vsphereVolume != null) return false;
            return true;
    }


    public class AwsElasticBlockStoreNestedImpl<N> extends AWSElasticBlockStoreVolumeSourceFluentImpl<VolumeFluent.AwsElasticBlockStoreNested<N>> implements VolumeFluent.AwsElasticBlockStoreNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final AWSElasticBlockStoreVolumeSourceBuilder builder;
    
            AwsElasticBlockStoreNestedImpl(AWSElasticBlockStoreVolumeSource item){
                    this.builder = new AWSElasticBlockStoreVolumeSourceBuilder(this, item);
            }
            AwsElasticBlockStoreNestedImpl(){
                    this.builder = new AWSElasticBlockStoreVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) VolumeFluentImpl.this.withAwsElasticBlockStore(builder.build());
    }
    public N endAwsElasticBlockStore(){
            return and();
    }

}
    public class AzureDiskNestedImpl<N> extends AzureDiskVolumeSourceFluentImpl<VolumeFluent.AzureDiskNested<N>> implements VolumeFluent.AzureDiskNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final AzureDiskVolumeSourceBuilder builder;
    
            AzureDiskNestedImpl(AzureDiskVolumeSource item){
                    this.builder = new AzureDiskVolumeSourceBuilder(this, item);
            }
            AzureDiskNestedImpl(){
                    this.builder = new AzureDiskVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) VolumeFluentImpl.this.withAzureDisk(builder.build());
    }
    public N endAzureDisk(){
            return and();
    }

}
    public class AzureFileNestedImpl<N> extends AzureFileVolumeSourceFluentImpl<VolumeFluent.AzureFileNested<N>> implements VolumeFluent.AzureFileNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final AzureFileVolumeSourceBuilder builder;
    
            AzureFileNestedImpl(AzureFileVolumeSource item){
                    this.builder = new AzureFileVolumeSourceBuilder(this, item);
            }
            AzureFileNestedImpl(){
                    this.builder = new AzureFileVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) VolumeFluentImpl.this.withAzureFile(builder.build());
    }
    public N endAzureFile(){
            return and();
    }

}
    public class CephfsNestedImpl<N> extends CephFSVolumeSourceFluentImpl<VolumeFluent.CephfsNested<N>> implements VolumeFluent.CephfsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CephFSVolumeSourceBuilder builder;
    
            CephfsNestedImpl(CephFSVolumeSource item){
                    this.builder = new CephFSVolumeSourceBuilder(this, item);
            }
            CephfsNestedImpl(){
                    this.builder = new CephFSVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) VolumeFluentImpl.this.withCephfs(builder.build());
    }
    public N endCephfs(){
            return and();
    }

}
    public class CinderNestedImpl<N> extends CinderVolumeSourceFluentImpl<VolumeFluent.CinderNested<N>> implements VolumeFluent.CinderNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CinderVolumeSourceBuilder builder;
    
            CinderNestedImpl(CinderVolumeSource item){
                    this.builder = new CinderVolumeSourceBuilder(this, item);
            }
            CinderNestedImpl(){
                    this.builder = new CinderVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) VolumeFluentImpl.this.withCinder(builder.build());
    }
    public N endCinder(){
            return and();
    }

}
    public class ConfigMapNestedImpl<N> extends ConfigMapVolumeSourceFluentImpl<VolumeFluent.ConfigMapNested<N>> implements VolumeFluent.ConfigMapNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ConfigMapVolumeSourceBuilder builder;
    
            ConfigMapNestedImpl(ConfigMapVolumeSource item){
                    this.builder = new ConfigMapVolumeSourceBuilder(this, item);
            }
            ConfigMapNestedImpl(){
                    this.builder = new ConfigMapVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) VolumeFluentImpl.this.withConfigMap(builder.build());
    }
    public N endConfigMap(){
            return and();
    }

}
    public class DownwardAPINestedImpl<N> extends DownwardAPIVolumeSourceFluentImpl<VolumeFluent.DownwardAPINested<N>> implements VolumeFluent.DownwardAPINested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DownwardAPIVolumeSourceBuilder builder;
    
            DownwardAPINestedImpl(DownwardAPIVolumeSource item){
                    this.builder = new DownwardAPIVolumeSourceBuilder(this, item);
            }
            DownwardAPINestedImpl(){
                    this.builder = new DownwardAPIVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) VolumeFluentImpl.this.withDownwardAPI(builder.build());
    }
    public N endDownwardAPI(){
            return and();
    }

}
    public class EmptyDirNestedImpl<N> extends EmptyDirVolumeSourceFluentImpl<VolumeFluent.EmptyDirNested<N>> implements VolumeFluent.EmptyDirNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EmptyDirVolumeSourceBuilder builder;
    
            EmptyDirNestedImpl(EmptyDirVolumeSource item){
                    this.builder = new EmptyDirVolumeSourceBuilder(this, item);
            }
            EmptyDirNestedImpl(){
                    this.builder = new EmptyDirVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) VolumeFluentImpl.this.withEmptyDir(builder.build());
    }
    public N endEmptyDir(){
            return and();
    }

}
    public class FcNestedImpl<N> extends FCVolumeSourceFluentImpl<VolumeFluent.FcNested<N>> implements VolumeFluent.FcNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final FCVolumeSourceBuilder builder;
    
            FcNestedImpl(FCVolumeSource item){
                    this.builder = new FCVolumeSourceBuilder(this, item);
            }
            FcNestedImpl(){
                    this.builder = new FCVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) VolumeFluentImpl.this.withFc(builder.build());
    }
    public N endFc(){
            return and();
    }

}
    public class FlexVolumeNestedImpl<N> extends FlexVolumeSourceFluentImpl<VolumeFluent.FlexVolumeNested<N>> implements VolumeFluent.FlexVolumeNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final FlexVolumeSourceBuilder builder;
    
            FlexVolumeNestedImpl(FlexVolumeSource item){
                    this.builder = new FlexVolumeSourceBuilder(this, item);
            }
            FlexVolumeNestedImpl(){
                    this.builder = new FlexVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) VolumeFluentImpl.this.withFlexVolume(builder.build());
    }
    public N endFlexVolume(){
            return and();
    }

}
    public class FlockerNestedImpl<N> extends FlockerVolumeSourceFluentImpl<VolumeFluent.FlockerNested<N>> implements VolumeFluent.FlockerNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final FlockerVolumeSourceBuilder builder;
    
            FlockerNestedImpl(FlockerVolumeSource item){
                    this.builder = new FlockerVolumeSourceBuilder(this, item);
            }
            FlockerNestedImpl(){
                    this.builder = new FlockerVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) VolumeFluentImpl.this.withFlocker(builder.build());
    }
    public N endFlocker(){
            return and();
    }

}
    public class GcePersistentDiskNestedImpl<N> extends GCEPersistentDiskVolumeSourceFluentImpl<VolumeFluent.GcePersistentDiskNested<N>> implements VolumeFluent.GcePersistentDiskNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final GCEPersistentDiskVolumeSourceBuilder builder;
    
            GcePersistentDiskNestedImpl(GCEPersistentDiskVolumeSource item){
                    this.builder = new GCEPersistentDiskVolumeSourceBuilder(this, item);
            }
            GcePersistentDiskNestedImpl(){
                    this.builder = new GCEPersistentDiskVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) VolumeFluentImpl.this.withGcePersistentDisk(builder.build());
    }
    public N endGcePersistentDisk(){
            return and();
    }

}
    public class GitRepoNestedImpl<N> extends GitRepoVolumeSourceFluentImpl<VolumeFluent.GitRepoNested<N>> implements VolumeFluent.GitRepoNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final GitRepoVolumeSourceBuilder builder;
    
            GitRepoNestedImpl(GitRepoVolumeSource item){
                    this.builder = new GitRepoVolumeSourceBuilder(this, item);
            }
            GitRepoNestedImpl(){
                    this.builder = new GitRepoVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) VolumeFluentImpl.this.withGitRepo(builder.build());
    }
    public N endGitRepo(){
            return and();
    }

}
    public class GlusterfsNestedImpl<N> extends GlusterfsVolumeSourceFluentImpl<VolumeFluent.GlusterfsNested<N>> implements VolumeFluent.GlusterfsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final GlusterfsVolumeSourceBuilder builder;
    
            GlusterfsNestedImpl(GlusterfsVolumeSource item){
                    this.builder = new GlusterfsVolumeSourceBuilder(this, item);
            }
            GlusterfsNestedImpl(){
                    this.builder = new GlusterfsVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) VolumeFluentImpl.this.withGlusterfs(builder.build());
    }
    public N endGlusterfs(){
            return and();
    }

}
    public class HostPathNestedImpl<N> extends HostPathVolumeSourceFluentImpl<VolumeFluent.HostPathNested<N>> implements VolumeFluent.HostPathNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final HostPathVolumeSourceBuilder builder;
    
            HostPathNestedImpl(HostPathVolumeSource item){
                    this.builder = new HostPathVolumeSourceBuilder(this, item);
            }
            HostPathNestedImpl(){
                    this.builder = new HostPathVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) VolumeFluentImpl.this.withHostPath(builder.build());
    }
    public N endHostPath(){
            return and();
    }

}
    public class IscsiNestedImpl<N> extends ISCSIVolumeSourceFluentImpl<VolumeFluent.IscsiNested<N>> implements VolumeFluent.IscsiNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ISCSIVolumeSourceBuilder builder;
    
            IscsiNestedImpl(ISCSIVolumeSource item){
                    this.builder = new ISCSIVolumeSourceBuilder(this, item);
            }
            IscsiNestedImpl(){
                    this.builder = new ISCSIVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) VolumeFluentImpl.this.withIscsi(builder.build());
    }
    public N endIscsi(){
            return and();
    }

}
    public class NfsNestedImpl<N> extends NFSVolumeSourceFluentImpl<VolumeFluent.NfsNested<N>> implements VolumeFluent.NfsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NFSVolumeSourceBuilder builder;
    
            NfsNestedImpl(NFSVolumeSource item){
                    this.builder = new NFSVolumeSourceBuilder(this, item);
            }
            NfsNestedImpl(){
                    this.builder = new NFSVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) VolumeFluentImpl.this.withNfs(builder.build());
    }
    public N endNfs(){
            return and();
    }

}
    public class PersistentVolumeClaimNestedImpl<N> extends PersistentVolumeClaimVolumeSourceFluentImpl<VolumeFluent.PersistentVolumeClaimNested<N>> implements VolumeFluent.PersistentVolumeClaimNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PersistentVolumeClaimVolumeSourceBuilder builder;
    
            PersistentVolumeClaimNestedImpl(PersistentVolumeClaimVolumeSource item){
                    this.builder = new PersistentVolumeClaimVolumeSourceBuilder(this, item);
            }
            PersistentVolumeClaimNestedImpl(){
                    this.builder = new PersistentVolumeClaimVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) VolumeFluentImpl.this.withPersistentVolumeClaim(builder.build());
    }
    public N endPersistentVolumeClaim(){
            return and();
    }

}
    public class PhotonPersistentDiskNestedImpl<N> extends PhotonPersistentDiskVolumeSourceFluentImpl<VolumeFluent.PhotonPersistentDiskNested<N>> implements VolumeFluent.PhotonPersistentDiskNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PhotonPersistentDiskVolumeSourceBuilder builder;
    
            PhotonPersistentDiskNestedImpl(PhotonPersistentDiskVolumeSource item){
                    this.builder = new PhotonPersistentDiskVolumeSourceBuilder(this, item);
            }
            PhotonPersistentDiskNestedImpl(){
                    this.builder = new PhotonPersistentDiskVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) VolumeFluentImpl.this.withPhotonPersistentDisk(builder.build());
    }
    public N endPhotonPersistentDisk(){
            return and();
    }

}
    public class PortworxVolumeNestedImpl<N> extends PortworxVolumeSourceFluentImpl<VolumeFluent.PortworxVolumeNested<N>> implements VolumeFluent.PortworxVolumeNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PortworxVolumeSourceBuilder builder;
    
            PortworxVolumeNestedImpl(PortworxVolumeSource item){
                    this.builder = new PortworxVolumeSourceBuilder(this, item);
            }
            PortworxVolumeNestedImpl(){
                    this.builder = new PortworxVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) VolumeFluentImpl.this.withPortworxVolume(builder.build());
    }
    public N endPortworxVolume(){
            return and();
    }

}
    public class ProjectedNestedImpl<N> extends ProjectedVolumeSourceFluentImpl<VolumeFluent.ProjectedNested<N>> implements VolumeFluent.ProjectedNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ProjectedVolumeSourceBuilder builder;
    
            ProjectedNestedImpl(ProjectedVolumeSource item){
                    this.builder = new ProjectedVolumeSourceBuilder(this, item);
            }
            ProjectedNestedImpl(){
                    this.builder = new ProjectedVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) VolumeFluentImpl.this.withProjected(builder.build());
    }
    public N endProjected(){
            return and();
    }

}
    public class QuobyteNestedImpl<N> extends QuobyteVolumeSourceFluentImpl<VolumeFluent.QuobyteNested<N>> implements VolumeFluent.QuobyteNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final QuobyteVolumeSourceBuilder builder;
    
            QuobyteNestedImpl(QuobyteVolumeSource item){
                    this.builder = new QuobyteVolumeSourceBuilder(this, item);
            }
            QuobyteNestedImpl(){
                    this.builder = new QuobyteVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) VolumeFluentImpl.this.withQuobyte(builder.build());
    }
    public N endQuobyte(){
            return and();
    }

}
    public class RbdNestedImpl<N> extends RBDVolumeSourceFluentImpl<VolumeFluent.RbdNested<N>> implements VolumeFluent.RbdNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RBDVolumeSourceBuilder builder;
    
            RbdNestedImpl(RBDVolumeSource item){
                    this.builder = new RBDVolumeSourceBuilder(this, item);
            }
            RbdNestedImpl(){
                    this.builder = new RBDVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) VolumeFluentImpl.this.withRbd(builder.build());
    }
    public N endRbd(){
            return and();
    }

}
    public class ScaleIONestedImpl<N> extends ScaleIOVolumeSourceFluentImpl<VolumeFluent.ScaleIONested<N>> implements VolumeFluent.ScaleIONested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ScaleIOVolumeSourceBuilder builder;
    
            ScaleIONestedImpl(ScaleIOVolumeSource item){
                    this.builder = new ScaleIOVolumeSourceBuilder(this, item);
            }
            ScaleIONestedImpl(){
                    this.builder = new ScaleIOVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) VolumeFluentImpl.this.withScaleIO(builder.build());
    }
    public N endScaleIO(){
            return and();
    }

}
    public class SecretNestedImpl<N> extends SecretVolumeSourceFluentImpl<VolumeFluent.SecretNested<N>> implements VolumeFluent.SecretNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecretVolumeSourceBuilder builder;
    
            SecretNestedImpl(SecretVolumeSource item){
                    this.builder = new SecretVolumeSourceBuilder(this, item);
            }
            SecretNestedImpl(){
                    this.builder = new SecretVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) VolumeFluentImpl.this.withSecret(builder.build());
    }
    public N endSecret(){
            return and();
    }

}
    public class StorageosNestedImpl<N> extends StorageOSVolumeSourceFluentImpl<VolumeFluent.StorageosNested<N>> implements VolumeFluent.StorageosNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StorageOSVolumeSourceBuilder builder;
    
            StorageosNestedImpl(StorageOSVolumeSource item){
                    this.builder = new StorageOSVolumeSourceBuilder(this, item);
            }
            StorageosNestedImpl(){
                    this.builder = new StorageOSVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) VolumeFluentImpl.this.withStorageos(builder.build());
    }
    public N endStorageos(){
            return and();
    }

}
    public class VsphereVolumeNestedImpl<N> extends VsphereVirtualDiskVolumeSourceFluentImpl<VolumeFluent.VsphereVolumeNested<N>> implements VolumeFluent.VsphereVolumeNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final VsphereVirtualDiskVolumeSourceBuilder builder;
    
            VsphereVolumeNestedImpl(VsphereVirtualDiskVolumeSource item){
                    this.builder = new VsphereVirtualDiskVolumeSourceBuilder(this, item);
            }
            VsphereVolumeNestedImpl(){
                    this.builder = new VsphereVirtualDiskVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) VolumeFluentImpl.this.withVsphereVolume(builder.build());
    }
    public N endVsphereVolume(){
            return and();
    }

}


}
