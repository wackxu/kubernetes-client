package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Boolean;
import javax.validation.Valid;
import java.lang.Object;
import java.util.Map;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Collection;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.Integer;

public class PersistentVolumeSpecFluentImpl<A extends PersistentVolumeSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements PersistentVolumeSpecFluent<A>{

    private List<String> accessModes;
    private AWSElasticBlockStoreVolumeSourceBuilder awsElasticBlockStore;
    private AzureDiskVolumeSourceBuilder azureDisk;
    private AzureFilePersistentVolumeSourceBuilder azureFile;
    private Map<String,Quantity> capacity;
    private CephFSPersistentVolumeSourceBuilder cephfs;
    private CinderPersistentVolumeSourceBuilder cinder;
    private ObjectReferenceBuilder claimRef;
    private CSIPersistentVolumeSourceBuilder csi;
    private FCVolumeSourceBuilder fc;
    private FlexPersistentVolumeSourceBuilder flexVolume;
    private FlockerVolumeSourceBuilder flocker;
    private GCEPersistentDiskVolumeSourceBuilder gcePersistentDisk;
    private GlusterfsPersistentVolumeSourceBuilder glusterfs;
    private HostPathVolumeSourceBuilder hostPath;
    private ISCSIPersistentVolumeSourceBuilder iscsi;
    private LocalVolumeSourceBuilder local;
    private List<String> mountOptions;
    private NFSVolumeSourceBuilder nfs;
    private VolumeNodeAffinityBuilder nodeAffinity;
    private String persistentVolumeReclaimPolicy;
    private PhotonPersistentDiskVolumeSourceBuilder photonPersistentDisk;
    private PortworxVolumeSourceBuilder portworxVolume;
    private QuobyteVolumeSourceBuilder quobyte;
    private RBDPersistentVolumeSourceBuilder rbd;
    private ScaleIOPersistentVolumeSourceBuilder scaleIO;
    private String storageClassName;
    private StorageOSPersistentVolumeSourceBuilder storageos;
    private String volumeMode;
    private VsphereVirtualDiskVolumeSourceBuilder vsphereVolume;

    public PersistentVolumeSpecFluentImpl(){
    }
    public PersistentVolumeSpecFluentImpl(PersistentVolumeSpec instance){
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
    }

    public A addToAccessModes(int index,String item){
            if (this.accessModes == null) {this.accessModes = new ArrayList<String>();}
            this.accessModes.add(index, item);
            return (A)this;
    }

    public A setToAccessModes(int index,String item){
            if (this.accessModes == null) {this.accessModes = new ArrayList<String>();}
            this.accessModes.set(index, item); return (A)this;
    }

    public A addToAccessModes(String... items){
            if (this.accessModes == null) {this.accessModes = new ArrayList<String>();}
            for (String item : items) {this.accessModes.add(item);} return (A)this;
    }

    public A addAllToAccessModes(Collection<String> items){
            if (this.accessModes == null) {this.accessModes = new ArrayList<String>();}
            for (String item : items) {this.accessModes.add(item);} return (A)this;
    }

    public A removeFromAccessModes(String... items){
            for (String item : items) {if (this.accessModes!= null){ this.accessModes.remove(item);}} return (A)this;
    }

    public A removeAllFromAccessModes(Collection<String> items){
            for (String item : items) {if (this.accessModes!= null){ this.accessModes.remove(item);}} return (A)this;
    }

    public List<String> getAccessModes(){
            return this.accessModes;
    }

    public String getAccessMode(int index){
            return this.accessModes.get(index);
    }

    public String getFirstAccessMode(){
            return this.accessModes.get(0);
    }

    public String getLastAccessMode(){
            return this.accessModes.get(accessModes.size() - 1);
    }

    public String getMatchingAccessMode(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: accessModes) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withAccessModes(List<String> accessModes){
            if (this.accessModes != null) { _visitables.removeAll(this.accessModes);}
            if (accessModes != null) {this.accessModes = new ArrayList<String>(); for (String item : accessModes){this.addToAccessModes(item);}} else { this.accessModes = new ArrayList<String>();} return (A) this;
    }

    public A withAccessModes(String... accessModes){
            if (this.accessModes != null) {this.accessModes.clear();}
            if (accessModes != null) {for (String item :accessModes){ this.addToAccessModes(item);}} return (A) this;
    }

    public Boolean hasAccessModes(){
            return accessModes != null && !accessModes.isEmpty();
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

    public PersistentVolumeSpecFluent.AwsElasticBlockStoreNested<A> withNewAwsElasticBlockStore(){
            return new AwsElasticBlockStoreNestedImpl();
    }

    public PersistentVolumeSpecFluent.AwsElasticBlockStoreNested<A> withNewAwsElasticBlockStoreLike(AWSElasticBlockStoreVolumeSource item){
            return new AwsElasticBlockStoreNestedImpl(item);
    }

    public PersistentVolumeSpecFluent.AwsElasticBlockStoreNested<A> editAwsElasticBlockStore(){
            return withNewAwsElasticBlockStoreLike(getAwsElasticBlockStore());
    }

    public PersistentVolumeSpecFluent.AwsElasticBlockStoreNested<A> editOrNewAwsElasticBlockStore(){
            return withNewAwsElasticBlockStoreLike(getAwsElasticBlockStore() != null ? getAwsElasticBlockStore(): new AWSElasticBlockStoreVolumeSourceBuilder().build());
    }

    public PersistentVolumeSpecFluent.AwsElasticBlockStoreNested<A> editOrNewAwsElasticBlockStoreLike(AWSElasticBlockStoreVolumeSource item){
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

    public PersistentVolumeSpecFluent.AzureDiskNested<A> withNewAzureDisk(){
            return new AzureDiskNestedImpl();
    }

    public PersistentVolumeSpecFluent.AzureDiskNested<A> withNewAzureDiskLike(AzureDiskVolumeSource item){
            return new AzureDiskNestedImpl(item);
    }

    public PersistentVolumeSpecFluent.AzureDiskNested<A> editAzureDisk(){
            return withNewAzureDiskLike(getAzureDisk());
    }

    public PersistentVolumeSpecFluent.AzureDiskNested<A> editOrNewAzureDisk(){
            return withNewAzureDiskLike(getAzureDisk() != null ? getAzureDisk(): new AzureDiskVolumeSourceBuilder().build());
    }

    public PersistentVolumeSpecFluent.AzureDiskNested<A> editOrNewAzureDiskLike(AzureDiskVolumeSource item){
            return withNewAzureDiskLike(getAzureDisk() != null ? getAzureDisk(): item);
    }

    
/**
 * This method has been deprecated, please use method buildAzureFile instead.
 * @return The buildable object.
 */
@Deprecated public AzureFilePersistentVolumeSource getAzureFile(){
            return this.azureFile!=null?this.azureFile.build():null;
    }

    public AzureFilePersistentVolumeSource buildAzureFile(){
            return this.azureFile!=null?this.azureFile.build():null;
    }

    public A withAzureFile(AzureFilePersistentVolumeSource azureFile){
            _visitables.remove(this.azureFile);
            if (azureFile!=null){ this.azureFile= new AzureFilePersistentVolumeSourceBuilder(azureFile); _visitables.add(this.azureFile);} return (A) this;
    }

    public Boolean hasAzureFile(){
            return this.azureFile != null;
    }

    public A withNewAzureFile(Boolean readOnly,String secretName,String secretNamespace,String shareName){
            return (A)withAzureFile(new AzureFilePersistentVolumeSource(readOnly, secretName, secretNamespace, shareName));
    }

    public PersistentVolumeSpecFluent.AzureFileNested<A> withNewAzureFile(){
            return new AzureFileNestedImpl();
    }

    public PersistentVolumeSpecFluent.AzureFileNested<A> withNewAzureFileLike(AzureFilePersistentVolumeSource item){
            return new AzureFileNestedImpl(item);
    }

    public PersistentVolumeSpecFluent.AzureFileNested<A> editAzureFile(){
            return withNewAzureFileLike(getAzureFile());
    }

    public PersistentVolumeSpecFluent.AzureFileNested<A> editOrNewAzureFile(){
            return withNewAzureFileLike(getAzureFile() != null ? getAzureFile(): new AzureFilePersistentVolumeSourceBuilder().build());
    }

    public PersistentVolumeSpecFluent.AzureFileNested<A> editOrNewAzureFileLike(AzureFilePersistentVolumeSource item){
            return withNewAzureFileLike(getAzureFile() != null ? getAzureFile(): item);
    }

    public A addToCapacity(String key,Quantity value){
            if(this.capacity == null && key != null && value != null) { this.capacity = new LinkedHashMap<String,Quantity>(); }
            if(key != null && value != null) {this.capacity.put(key, value);} return (A)this;
    }

    public A addToCapacity(Map<String,Quantity> map){
            if(this.capacity == null && map != null) { this.capacity = new LinkedHashMap<String,Quantity>(); }
            if(map != null) { this.capacity.putAll(map);} return (A)this;
    }

    public A removeFromCapacity(String key){
            if(this.capacity == null) { return (A) this; }
            if(key != null && this.capacity != null) {this.capacity.remove(key);} return (A)this;
    }

    public A removeFromCapacity(Map<String,Quantity> map){
            if(this.capacity == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.capacity != null){this.capacity.remove(key);}}} return (A)this;
    }

    public Map<String,Quantity> getCapacity(){
            return this.capacity;
    }

    public A withCapacity(Map<String,Quantity> capacity){
            if (capacity == null) { this.capacity =  new LinkedHashMap<String,Quantity>();} else {this.capacity = new LinkedHashMap<String,Quantity>(capacity);} return (A) this;
    }

    public Boolean hasCapacity(){
            return this.capacity != null;
    }

    
/**
 * This method has been deprecated, please use method buildCephfs instead.
 * @return The buildable object.
 */
@Deprecated public CephFSPersistentVolumeSource getCephfs(){
            return this.cephfs!=null?this.cephfs.build():null;
    }

    public CephFSPersistentVolumeSource buildCephfs(){
            return this.cephfs!=null?this.cephfs.build():null;
    }

    public A withCephfs(CephFSPersistentVolumeSource cephfs){
            _visitables.remove(this.cephfs);
            if (cephfs!=null){ this.cephfs= new CephFSPersistentVolumeSourceBuilder(cephfs); _visitables.add(this.cephfs);} return (A) this;
    }

    public Boolean hasCephfs(){
            return this.cephfs != null;
    }

    public PersistentVolumeSpecFluent.CephfsNested<A> withNewCephfs(){
            return new CephfsNestedImpl();
    }

    public PersistentVolumeSpecFluent.CephfsNested<A> withNewCephfsLike(CephFSPersistentVolumeSource item){
            return new CephfsNestedImpl(item);
    }

    public PersistentVolumeSpecFluent.CephfsNested<A> editCephfs(){
            return withNewCephfsLike(getCephfs());
    }

    public PersistentVolumeSpecFluent.CephfsNested<A> editOrNewCephfs(){
            return withNewCephfsLike(getCephfs() != null ? getCephfs(): new CephFSPersistentVolumeSourceBuilder().build());
    }

    public PersistentVolumeSpecFluent.CephfsNested<A> editOrNewCephfsLike(CephFSPersistentVolumeSource item){
            return withNewCephfsLike(getCephfs() != null ? getCephfs(): item);
    }

    
/**
 * This method has been deprecated, please use method buildCinder instead.
 * @return The buildable object.
 */
@Deprecated public CinderPersistentVolumeSource getCinder(){
            return this.cinder!=null?this.cinder.build():null;
    }

    public CinderPersistentVolumeSource buildCinder(){
            return this.cinder!=null?this.cinder.build():null;
    }

    public A withCinder(CinderPersistentVolumeSource cinder){
            _visitables.remove(this.cinder);
            if (cinder!=null){ this.cinder= new CinderPersistentVolumeSourceBuilder(cinder); _visitables.add(this.cinder);} return (A) this;
    }

    public Boolean hasCinder(){
            return this.cinder != null;
    }

    public PersistentVolumeSpecFluent.CinderNested<A> withNewCinder(){
            return new CinderNestedImpl();
    }

    public PersistentVolumeSpecFluent.CinderNested<A> withNewCinderLike(CinderPersistentVolumeSource item){
            return new CinderNestedImpl(item);
    }

    public PersistentVolumeSpecFluent.CinderNested<A> editCinder(){
            return withNewCinderLike(getCinder());
    }

    public PersistentVolumeSpecFluent.CinderNested<A> editOrNewCinder(){
            return withNewCinderLike(getCinder() != null ? getCinder(): new CinderPersistentVolumeSourceBuilder().build());
    }

    public PersistentVolumeSpecFluent.CinderNested<A> editOrNewCinderLike(CinderPersistentVolumeSource item){
            return withNewCinderLike(getCinder() != null ? getCinder(): item);
    }

    
/**
 * This method has been deprecated, please use method buildClaimRef instead.
 * @return The buildable object.
 */
@Deprecated public ObjectReference getClaimRef(){
            return this.claimRef!=null?this.claimRef.build():null;
    }

    public ObjectReference buildClaimRef(){
            return this.claimRef!=null?this.claimRef.build():null;
    }

    public A withClaimRef(ObjectReference claimRef){
            _visitables.remove(this.claimRef);
            if (claimRef!=null){ this.claimRef= new ObjectReferenceBuilder(claimRef); _visitables.add(this.claimRef);} return (A) this;
    }

    public Boolean hasClaimRef(){
            return this.claimRef != null;
    }

    public PersistentVolumeSpecFluent.ClaimRefNested<A> withNewClaimRef(){
            return new ClaimRefNestedImpl();
    }

    public PersistentVolumeSpecFluent.ClaimRefNested<A> withNewClaimRefLike(ObjectReference item){
            return new ClaimRefNestedImpl(item);
    }

    public PersistentVolumeSpecFluent.ClaimRefNested<A> editClaimRef(){
            return withNewClaimRefLike(getClaimRef());
    }

    public PersistentVolumeSpecFluent.ClaimRefNested<A> editOrNewClaimRef(){
            return withNewClaimRefLike(getClaimRef() != null ? getClaimRef(): new ObjectReferenceBuilder().build());
    }

    public PersistentVolumeSpecFluent.ClaimRefNested<A> editOrNewClaimRefLike(ObjectReference item){
            return withNewClaimRefLike(getClaimRef() != null ? getClaimRef(): item);
    }

    
/**
 * This method has been deprecated, please use method buildCsi instead.
 * @return The buildable object.
 */
@Deprecated public CSIPersistentVolumeSource getCsi(){
            return this.csi!=null?this.csi.build():null;
    }

    public CSIPersistentVolumeSource buildCsi(){
            return this.csi!=null?this.csi.build():null;
    }

    public A withCsi(CSIPersistentVolumeSource csi){
            _visitables.remove(this.csi);
            if (csi!=null){ this.csi= new CSIPersistentVolumeSourceBuilder(csi); _visitables.add(this.csi);} return (A) this;
    }

    public Boolean hasCsi(){
            return this.csi != null;
    }

    public PersistentVolumeSpecFluent.CsiNested<A> withNewCsi(){
            return new CsiNestedImpl();
    }

    public PersistentVolumeSpecFluent.CsiNested<A> withNewCsiLike(CSIPersistentVolumeSource item){
            return new CsiNestedImpl(item);
    }

    public PersistentVolumeSpecFluent.CsiNested<A> editCsi(){
            return withNewCsiLike(getCsi());
    }

    public PersistentVolumeSpecFluent.CsiNested<A> editOrNewCsi(){
            return withNewCsiLike(getCsi() != null ? getCsi(): new CSIPersistentVolumeSourceBuilder().build());
    }

    public PersistentVolumeSpecFluent.CsiNested<A> editOrNewCsiLike(CSIPersistentVolumeSource item){
            return withNewCsiLike(getCsi() != null ? getCsi(): item);
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

    public PersistentVolumeSpecFluent.FcNested<A> withNewFc(){
            return new FcNestedImpl();
    }

    public PersistentVolumeSpecFluent.FcNested<A> withNewFcLike(FCVolumeSource item){
            return new FcNestedImpl(item);
    }

    public PersistentVolumeSpecFluent.FcNested<A> editFc(){
            return withNewFcLike(getFc());
    }

    public PersistentVolumeSpecFluent.FcNested<A> editOrNewFc(){
            return withNewFcLike(getFc() != null ? getFc(): new FCVolumeSourceBuilder().build());
    }

    public PersistentVolumeSpecFluent.FcNested<A> editOrNewFcLike(FCVolumeSource item){
            return withNewFcLike(getFc() != null ? getFc(): item);
    }

    
/**
 * This method has been deprecated, please use method buildFlexVolume instead.
 * @return The buildable object.
 */
@Deprecated public FlexPersistentVolumeSource getFlexVolume(){
            return this.flexVolume!=null?this.flexVolume.build():null;
    }

    public FlexPersistentVolumeSource buildFlexVolume(){
            return this.flexVolume!=null?this.flexVolume.build():null;
    }

    public A withFlexVolume(FlexPersistentVolumeSource flexVolume){
            _visitables.remove(this.flexVolume);
            if (flexVolume!=null){ this.flexVolume= new FlexPersistentVolumeSourceBuilder(flexVolume); _visitables.add(this.flexVolume);} return (A) this;
    }

    public Boolean hasFlexVolume(){
            return this.flexVolume != null;
    }

    public PersistentVolumeSpecFluent.FlexVolumeNested<A> withNewFlexVolume(){
            return new FlexVolumeNestedImpl();
    }

    public PersistentVolumeSpecFluent.FlexVolumeNested<A> withNewFlexVolumeLike(FlexPersistentVolumeSource item){
            return new FlexVolumeNestedImpl(item);
    }

    public PersistentVolumeSpecFluent.FlexVolumeNested<A> editFlexVolume(){
            return withNewFlexVolumeLike(getFlexVolume());
    }

    public PersistentVolumeSpecFluent.FlexVolumeNested<A> editOrNewFlexVolume(){
            return withNewFlexVolumeLike(getFlexVolume() != null ? getFlexVolume(): new FlexPersistentVolumeSourceBuilder().build());
    }

    public PersistentVolumeSpecFluent.FlexVolumeNested<A> editOrNewFlexVolumeLike(FlexPersistentVolumeSource item){
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

    public PersistentVolumeSpecFluent.FlockerNested<A> withNewFlocker(){
            return new FlockerNestedImpl();
    }

    public PersistentVolumeSpecFluent.FlockerNested<A> withNewFlockerLike(FlockerVolumeSource item){
            return new FlockerNestedImpl(item);
    }

    public PersistentVolumeSpecFluent.FlockerNested<A> editFlocker(){
            return withNewFlockerLike(getFlocker());
    }

    public PersistentVolumeSpecFluent.FlockerNested<A> editOrNewFlocker(){
            return withNewFlockerLike(getFlocker() != null ? getFlocker(): new FlockerVolumeSourceBuilder().build());
    }

    public PersistentVolumeSpecFluent.FlockerNested<A> editOrNewFlockerLike(FlockerVolumeSource item){
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

    public PersistentVolumeSpecFluent.GcePersistentDiskNested<A> withNewGcePersistentDisk(){
            return new GcePersistentDiskNestedImpl();
    }

    public PersistentVolumeSpecFluent.GcePersistentDiskNested<A> withNewGcePersistentDiskLike(GCEPersistentDiskVolumeSource item){
            return new GcePersistentDiskNestedImpl(item);
    }

    public PersistentVolumeSpecFluent.GcePersistentDiskNested<A> editGcePersistentDisk(){
            return withNewGcePersistentDiskLike(getGcePersistentDisk());
    }

    public PersistentVolumeSpecFluent.GcePersistentDiskNested<A> editOrNewGcePersistentDisk(){
            return withNewGcePersistentDiskLike(getGcePersistentDisk() != null ? getGcePersistentDisk(): new GCEPersistentDiskVolumeSourceBuilder().build());
    }

    public PersistentVolumeSpecFluent.GcePersistentDiskNested<A> editOrNewGcePersistentDiskLike(GCEPersistentDiskVolumeSource item){
            return withNewGcePersistentDiskLike(getGcePersistentDisk() != null ? getGcePersistentDisk(): item);
    }

    
/**
 * This method has been deprecated, please use method buildGlusterfs instead.
 * @return The buildable object.
 */
@Deprecated public GlusterfsPersistentVolumeSource getGlusterfs(){
            return this.glusterfs!=null?this.glusterfs.build():null;
    }

    public GlusterfsPersistentVolumeSource buildGlusterfs(){
            return this.glusterfs!=null?this.glusterfs.build():null;
    }

    public A withGlusterfs(GlusterfsPersistentVolumeSource glusterfs){
            _visitables.remove(this.glusterfs);
            if (glusterfs!=null){ this.glusterfs= new GlusterfsPersistentVolumeSourceBuilder(glusterfs); _visitables.add(this.glusterfs);} return (A) this;
    }

    public Boolean hasGlusterfs(){
            return this.glusterfs != null;
    }

    public A withNewGlusterfs(String endpoints,String endpointsNamespace,String path,Boolean readOnly){
            return (A)withGlusterfs(new GlusterfsPersistentVolumeSource(endpoints, endpointsNamespace, path, readOnly));
    }

    public PersistentVolumeSpecFluent.GlusterfsNested<A> withNewGlusterfs(){
            return new GlusterfsNestedImpl();
    }

    public PersistentVolumeSpecFluent.GlusterfsNested<A> withNewGlusterfsLike(GlusterfsPersistentVolumeSource item){
            return new GlusterfsNestedImpl(item);
    }

    public PersistentVolumeSpecFluent.GlusterfsNested<A> editGlusterfs(){
            return withNewGlusterfsLike(getGlusterfs());
    }

    public PersistentVolumeSpecFluent.GlusterfsNested<A> editOrNewGlusterfs(){
            return withNewGlusterfsLike(getGlusterfs() != null ? getGlusterfs(): new GlusterfsPersistentVolumeSourceBuilder().build());
    }

    public PersistentVolumeSpecFluent.GlusterfsNested<A> editOrNewGlusterfsLike(GlusterfsPersistentVolumeSource item){
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

    public PersistentVolumeSpecFluent.HostPathNested<A> withNewHostPath(){
            return new HostPathNestedImpl();
    }

    public PersistentVolumeSpecFluent.HostPathNested<A> withNewHostPathLike(HostPathVolumeSource item){
            return new HostPathNestedImpl(item);
    }

    public PersistentVolumeSpecFluent.HostPathNested<A> editHostPath(){
            return withNewHostPathLike(getHostPath());
    }

    public PersistentVolumeSpecFluent.HostPathNested<A> editOrNewHostPath(){
            return withNewHostPathLike(getHostPath() != null ? getHostPath(): new HostPathVolumeSourceBuilder().build());
    }

    public PersistentVolumeSpecFluent.HostPathNested<A> editOrNewHostPathLike(HostPathVolumeSource item){
            return withNewHostPathLike(getHostPath() != null ? getHostPath(): item);
    }

    
/**
 * This method has been deprecated, please use method buildIscsi instead.
 * @return The buildable object.
 */
@Deprecated public ISCSIPersistentVolumeSource getIscsi(){
            return this.iscsi!=null?this.iscsi.build():null;
    }

    public ISCSIPersistentVolumeSource buildIscsi(){
            return this.iscsi!=null?this.iscsi.build():null;
    }

    public A withIscsi(ISCSIPersistentVolumeSource iscsi){
            _visitables.remove(this.iscsi);
            if (iscsi!=null){ this.iscsi= new ISCSIPersistentVolumeSourceBuilder(iscsi); _visitables.add(this.iscsi);} return (A) this;
    }

    public Boolean hasIscsi(){
            return this.iscsi != null;
    }

    public PersistentVolumeSpecFluent.IscsiNested<A> withNewIscsi(){
            return new IscsiNestedImpl();
    }

    public PersistentVolumeSpecFluent.IscsiNested<A> withNewIscsiLike(ISCSIPersistentVolumeSource item){
            return new IscsiNestedImpl(item);
    }

    public PersistentVolumeSpecFluent.IscsiNested<A> editIscsi(){
            return withNewIscsiLike(getIscsi());
    }

    public PersistentVolumeSpecFluent.IscsiNested<A> editOrNewIscsi(){
            return withNewIscsiLike(getIscsi() != null ? getIscsi(): new ISCSIPersistentVolumeSourceBuilder().build());
    }

    public PersistentVolumeSpecFluent.IscsiNested<A> editOrNewIscsiLike(ISCSIPersistentVolumeSource item){
            return withNewIscsiLike(getIscsi() != null ? getIscsi(): item);
    }

    
/**
 * This method has been deprecated, please use method buildLocal instead.
 * @return The buildable object.
 */
@Deprecated public LocalVolumeSource getLocal(){
            return this.local!=null?this.local.build():null;
    }

    public LocalVolumeSource buildLocal(){
            return this.local!=null?this.local.build():null;
    }

    public A withLocal(LocalVolumeSource local){
            _visitables.remove(this.local);
            if (local!=null){ this.local= new LocalVolumeSourceBuilder(local); _visitables.add(this.local);} return (A) this;
    }

    public Boolean hasLocal(){
            return this.local != null;
    }

    public A withNewLocal(String fsType,String path){
            return (A)withLocal(new LocalVolumeSource(fsType, path));
    }

    public PersistentVolumeSpecFluent.LocalNested<A> withNewLocal(){
            return new LocalNestedImpl();
    }

    public PersistentVolumeSpecFluent.LocalNested<A> withNewLocalLike(LocalVolumeSource item){
            return new LocalNestedImpl(item);
    }

    public PersistentVolumeSpecFluent.LocalNested<A> editLocal(){
            return withNewLocalLike(getLocal());
    }

    public PersistentVolumeSpecFluent.LocalNested<A> editOrNewLocal(){
            return withNewLocalLike(getLocal() != null ? getLocal(): new LocalVolumeSourceBuilder().build());
    }

    public PersistentVolumeSpecFluent.LocalNested<A> editOrNewLocalLike(LocalVolumeSource item){
            return withNewLocalLike(getLocal() != null ? getLocal(): item);
    }

    public A addToMountOptions(int index,String item){
            if (this.mountOptions == null) {this.mountOptions = new ArrayList<String>();}
            this.mountOptions.add(index, item);
            return (A)this;
    }

    public A setToMountOptions(int index,String item){
            if (this.mountOptions == null) {this.mountOptions = new ArrayList<String>();}
            this.mountOptions.set(index, item); return (A)this;
    }

    public A addToMountOptions(String... items){
            if (this.mountOptions == null) {this.mountOptions = new ArrayList<String>();}
            for (String item : items) {this.mountOptions.add(item);} return (A)this;
    }

    public A addAllToMountOptions(Collection<String> items){
            if (this.mountOptions == null) {this.mountOptions = new ArrayList<String>();}
            for (String item : items) {this.mountOptions.add(item);} return (A)this;
    }

    public A removeFromMountOptions(String... items){
            for (String item : items) {if (this.mountOptions!= null){ this.mountOptions.remove(item);}} return (A)this;
    }

    public A removeAllFromMountOptions(Collection<String> items){
            for (String item : items) {if (this.mountOptions!= null){ this.mountOptions.remove(item);}} return (A)this;
    }

    public List<String> getMountOptions(){
            return this.mountOptions;
    }

    public String getMountOption(int index){
            return this.mountOptions.get(index);
    }

    public String getFirstMountOption(){
            return this.mountOptions.get(0);
    }

    public String getLastMountOption(){
            return this.mountOptions.get(mountOptions.size() - 1);
    }

    public String getMatchingMountOption(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: mountOptions) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withMountOptions(List<String> mountOptions){
            if (this.mountOptions != null) { _visitables.removeAll(this.mountOptions);}
            if (mountOptions != null) {this.mountOptions = new ArrayList<String>(); for (String item : mountOptions){this.addToMountOptions(item);}} else { this.mountOptions = new ArrayList<String>();} return (A) this;
    }

    public A withMountOptions(String... mountOptions){
            if (this.mountOptions != null) {this.mountOptions.clear();}
            if (mountOptions != null) {for (String item :mountOptions){ this.addToMountOptions(item);}} return (A) this;
    }

    public Boolean hasMountOptions(){
            return mountOptions != null && !mountOptions.isEmpty();
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

    public PersistentVolumeSpecFluent.NfsNested<A> withNewNfs(){
            return new NfsNestedImpl();
    }

    public PersistentVolumeSpecFluent.NfsNested<A> withNewNfsLike(NFSVolumeSource item){
            return new NfsNestedImpl(item);
    }

    public PersistentVolumeSpecFluent.NfsNested<A> editNfs(){
            return withNewNfsLike(getNfs());
    }

    public PersistentVolumeSpecFluent.NfsNested<A> editOrNewNfs(){
            return withNewNfsLike(getNfs() != null ? getNfs(): new NFSVolumeSourceBuilder().build());
    }

    public PersistentVolumeSpecFluent.NfsNested<A> editOrNewNfsLike(NFSVolumeSource item){
            return withNewNfsLike(getNfs() != null ? getNfs(): item);
    }

    
/**
 * This method has been deprecated, please use method buildNodeAffinity instead.
 * @return The buildable object.
 */
@Deprecated public VolumeNodeAffinity getNodeAffinity(){
            return this.nodeAffinity!=null?this.nodeAffinity.build():null;
    }

    public VolumeNodeAffinity buildNodeAffinity(){
            return this.nodeAffinity!=null?this.nodeAffinity.build():null;
    }

    public A withNodeAffinity(VolumeNodeAffinity nodeAffinity){
            _visitables.remove(this.nodeAffinity);
            if (nodeAffinity!=null){ this.nodeAffinity= new VolumeNodeAffinityBuilder(nodeAffinity); _visitables.add(this.nodeAffinity);} return (A) this;
    }

    public Boolean hasNodeAffinity(){
            return this.nodeAffinity != null;
    }

    public PersistentVolumeSpecFluent.NodeAffinityNested<A> withNewNodeAffinity(){
            return new NodeAffinityNestedImpl();
    }

    public PersistentVolumeSpecFluent.NodeAffinityNested<A> withNewNodeAffinityLike(VolumeNodeAffinity item){
            return new NodeAffinityNestedImpl(item);
    }

    public PersistentVolumeSpecFluent.NodeAffinityNested<A> editNodeAffinity(){
            return withNewNodeAffinityLike(getNodeAffinity());
    }

    public PersistentVolumeSpecFluent.NodeAffinityNested<A> editOrNewNodeAffinity(){
            return withNewNodeAffinityLike(getNodeAffinity() != null ? getNodeAffinity(): new VolumeNodeAffinityBuilder().build());
    }

    public PersistentVolumeSpecFluent.NodeAffinityNested<A> editOrNewNodeAffinityLike(VolumeNodeAffinity item){
            return withNewNodeAffinityLike(getNodeAffinity() != null ? getNodeAffinity(): item);
    }

    public String getPersistentVolumeReclaimPolicy(){
            return this.persistentVolumeReclaimPolicy;
    }

    public A withPersistentVolumeReclaimPolicy(String persistentVolumeReclaimPolicy){
            this.persistentVolumeReclaimPolicy=persistentVolumeReclaimPolicy; return (A) this;
    }

    public Boolean hasPersistentVolumeReclaimPolicy(){
            return this.persistentVolumeReclaimPolicy != null;
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

    public PersistentVolumeSpecFluent.PhotonPersistentDiskNested<A> withNewPhotonPersistentDisk(){
            return new PhotonPersistentDiskNestedImpl();
    }

    public PersistentVolumeSpecFluent.PhotonPersistentDiskNested<A> withNewPhotonPersistentDiskLike(PhotonPersistentDiskVolumeSource item){
            return new PhotonPersistentDiskNestedImpl(item);
    }

    public PersistentVolumeSpecFluent.PhotonPersistentDiskNested<A> editPhotonPersistentDisk(){
            return withNewPhotonPersistentDiskLike(getPhotonPersistentDisk());
    }

    public PersistentVolumeSpecFluent.PhotonPersistentDiskNested<A> editOrNewPhotonPersistentDisk(){
            return withNewPhotonPersistentDiskLike(getPhotonPersistentDisk() != null ? getPhotonPersistentDisk(): new PhotonPersistentDiskVolumeSourceBuilder().build());
    }

    public PersistentVolumeSpecFluent.PhotonPersistentDiskNested<A> editOrNewPhotonPersistentDiskLike(PhotonPersistentDiskVolumeSource item){
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

    public PersistentVolumeSpecFluent.PortworxVolumeNested<A> withNewPortworxVolume(){
            return new PortworxVolumeNestedImpl();
    }

    public PersistentVolumeSpecFluent.PortworxVolumeNested<A> withNewPortworxVolumeLike(PortworxVolumeSource item){
            return new PortworxVolumeNestedImpl(item);
    }

    public PersistentVolumeSpecFluent.PortworxVolumeNested<A> editPortworxVolume(){
            return withNewPortworxVolumeLike(getPortworxVolume());
    }

    public PersistentVolumeSpecFluent.PortworxVolumeNested<A> editOrNewPortworxVolume(){
            return withNewPortworxVolumeLike(getPortworxVolume() != null ? getPortworxVolume(): new PortworxVolumeSourceBuilder().build());
    }

    public PersistentVolumeSpecFluent.PortworxVolumeNested<A> editOrNewPortworxVolumeLike(PortworxVolumeSource item){
            return withNewPortworxVolumeLike(getPortworxVolume() != null ? getPortworxVolume(): item);
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

    public PersistentVolumeSpecFluent.QuobyteNested<A> withNewQuobyte(){
            return new QuobyteNestedImpl();
    }

    public PersistentVolumeSpecFluent.QuobyteNested<A> withNewQuobyteLike(QuobyteVolumeSource item){
            return new QuobyteNestedImpl(item);
    }

    public PersistentVolumeSpecFluent.QuobyteNested<A> editQuobyte(){
            return withNewQuobyteLike(getQuobyte());
    }

    public PersistentVolumeSpecFluent.QuobyteNested<A> editOrNewQuobyte(){
            return withNewQuobyteLike(getQuobyte() != null ? getQuobyte(): new QuobyteVolumeSourceBuilder().build());
    }

    public PersistentVolumeSpecFluent.QuobyteNested<A> editOrNewQuobyteLike(QuobyteVolumeSource item){
            return withNewQuobyteLike(getQuobyte() != null ? getQuobyte(): item);
    }

    
/**
 * This method has been deprecated, please use method buildRbd instead.
 * @return The buildable object.
 */
@Deprecated public RBDPersistentVolumeSource getRbd(){
            return this.rbd!=null?this.rbd.build():null;
    }

    public RBDPersistentVolumeSource buildRbd(){
            return this.rbd!=null?this.rbd.build():null;
    }

    public A withRbd(RBDPersistentVolumeSource rbd){
            _visitables.remove(this.rbd);
            if (rbd!=null){ this.rbd= new RBDPersistentVolumeSourceBuilder(rbd); _visitables.add(this.rbd);} return (A) this;
    }

    public Boolean hasRbd(){
            return this.rbd != null;
    }

    public PersistentVolumeSpecFluent.RbdNested<A> withNewRbd(){
            return new RbdNestedImpl();
    }

    public PersistentVolumeSpecFluent.RbdNested<A> withNewRbdLike(RBDPersistentVolumeSource item){
            return new RbdNestedImpl(item);
    }

    public PersistentVolumeSpecFluent.RbdNested<A> editRbd(){
            return withNewRbdLike(getRbd());
    }

    public PersistentVolumeSpecFluent.RbdNested<A> editOrNewRbd(){
            return withNewRbdLike(getRbd() != null ? getRbd(): new RBDPersistentVolumeSourceBuilder().build());
    }

    public PersistentVolumeSpecFluent.RbdNested<A> editOrNewRbdLike(RBDPersistentVolumeSource item){
            return withNewRbdLike(getRbd() != null ? getRbd(): item);
    }

    
/**
 * This method has been deprecated, please use method buildScaleIO instead.
 * @return The buildable object.
 */
@Deprecated public ScaleIOPersistentVolumeSource getScaleIO(){
            return this.scaleIO!=null?this.scaleIO.build():null;
    }

    public ScaleIOPersistentVolumeSource buildScaleIO(){
            return this.scaleIO!=null?this.scaleIO.build():null;
    }

    public A withScaleIO(ScaleIOPersistentVolumeSource scaleIO){
            _visitables.remove(this.scaleIO);
            if (scaleIO!=null){ this.scaleIO= new ScaleIOPersistentVolumeSourceBuilder(scaleIO); _visitables.add(this.scaleIO);} return (A) this;
    }

    public Boolean hasScaleIO(){
            return this.scaleIO != null;
    }

    public PersistentVolumeSpecFluent.ScaleIONested<A> withNewScaleIO(){
            return new ScaleIONestedImpl();
    }

    public PersistentVolumeSpecFluent.ScaleIONested<A> withNewScaleIOLike(ScaleIOPersistentVolumeSource item){
            return new ScaleIONestedImpl(item);
    }

    public PersistentVolumeSpecFluent.ScaleIONested<A> editScaleIO(){
            return withNewScaleIOLike(getScaleIO());
    }

    public PersistentVolumeSpecFluent.ScaleIONested<A> editOrNewScaleIO(){
            return withNewScaleIOLike(getScaleIO() != null ? getScaleIO(): new ScaleIOPersistentVolumeSourceBuilder().build());
    }

    public PersistentVolumeSpecFluent.ScaleIONested<A> editOrNewScaleIOLike(ScaleIOPersistentVolumeSource item){
            return withNewScaleIOLike(getScaleIO() != null ? getScaleIO(): item);
    }

    public String getStorageClassName(){
            return this.storageClassName;
    }

    public A withStorageClassName(String storageClassName){
            this.storageClassName=storageClassName; return (A) this;
    }

    public Boolean hasStorageClassName(){
            return this.storageClassName != null;
    }

    
/**
 * This method has been deprecated, please use method buildStorageos instead.
 * @return The buildable object.
 */
@Deprecated public StorageOSPersistentVolumeSource getStorageos(){
            return this.storageos!=null?this.storageos.build():null;
    }

    public StorageOSPersistentVolumeSource buildStorageos(){
            return this.storageos!=null?this.storageos.build():null;
    }

    public A withStorageos(StorageOSPersistentVolumeSource storageos){
            _visitables.remove(this.storageos);
            if (storageos!=null){ this.storageos= new StorageOSPersistentVolumeSourceBuilder(storageos); _visitables.add(this.storageos);} return (A) this;
    }

    public Boolean hasStorageos(){
            return this.storageos != null;
    }

    public PersistentVolumeSpecFluent.StorageosNested<A> withNewStorageos(){
            return new StorageosNestedImpl();
    }

    public PersistentVolumeSpecFluent.StorageosNested<A> withNewStorageosLike(StorageOSPersistentVolumeSource item){
            return new StorageosNestedImpl(item);
    }

    public PersistentVolumeSpecFluent.StorageosNested<A> editStorageos(){
            return withNewStorageosLike(getStorageos());
    }

    public PersistentVolumeSpecFluent.StorageosNested<A> editOrNewStorageos(){
            return withNewStorageosLike(getStorageos() != null ? getStorageos(): new StorageOSPersistentVolumeSourceBuilder().build());
    }

    public PersistentVolumeSpecFluent.StorageosNested<A> editOrNewStorageosLike(StorageOSPersistentVolumeSource item){
            return withNewStorageosLike(getStorageos() != null ? getStorageos(): item);
    }

    public String getVolumeMode(){
            return this.volumeMode;
    }

    public A withVolumeMode(String volumeMode){
            this.volumeMode=volumeMode; return (A) this;
    }

    public Boolean hasVolumeMode(){
            return this.volumeMode != null;
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

    public PersistentVolumeSpecFluent.VsphereVolumeNested<A> withNewVsphereVolume(){
            return new VsphereVolumeNestedImpl();
    }

    public PersistentVolumeSpecFluent.VsphereVolumeNested<A> withNewVsphereVolumeLike(VsphereVirtualDiskVolumeSource item){
            return new VsphereVolumeNestedImpl(item);
    }

    public PersistentVolumeSpecFluent.VsphereVolumeNested<A> editVsphereVolume(){
            return withNewVsphereVolumeLike(getVsphereVolume());
    }

    public PersistentVolumeSpecFluent.VsphereVolumeNested<A> editOrNewVsphereVolume(){
            return withNewVsphereVolumeLike(getVsphereVolume() != null ? getVsphereVolume(): new VsphereVirtualDiskVolumeSourceBuilder().build());
    }

    public PersistentVolumeSpecFluent.VsphereVolumeNested<A> editOrNewVsphereVolumeLike(VsphereVirtualDiskVolumeSource item){
            return withNewVsphereVolumeLike(getVsphereVolume() != null ? getVsphereVolume(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PersistentVolumeSpecFluentImpl that = (PersistentVolumeSpecFluentImpl) o;
            if (accessModes != null ? !accessModes.equals(that.accessModes) :that.accessModes != null) return false;
            if (awsElasticBlockStore != null ? !awsElasticBlockStore.equals(that.awsElasticBlockStore) :that.awsElasticBlockStore != null) return false;
            if (azureDisk != null ? !azureDisk.equals(that.azureDisk) :that.azureDisk != null) return false;
            if (azureFile != null ? !azureFile.equals(that.azureFile) :that.azureFile != null) return false;
            if (capacity != null ? !capacity.equals(that.capacity) :that.capacity != null) return false;
            if (cephfs != null ? !cephfs.equals(that.cephfs) :that.cephfs != null) return false;
            if (cinder != null ? !cinder.equals(that.cinder) :that.cinder != null) return false;
            if (claimRef != null ? !claimRef.equals(that.claimRef) :that.claimRef != null) return false;
            if (csi != null ? !csi.equals(that.csi) :that.csi != null) return false;
            if (fc != null ? !fc.equals(that.fc) :that.fc != null) return false;
            if (flexVolume != null ? !flexVolume.equals(that.flexVolume) :that.flexVolume != null) return false;
            if (flocker != null ? !flocker.equals(that.flocker) :that.flocker != null) return false;
            if (gcePersistentDisk != null ? !gcePersistentDisk.equals(that.gcePersistentDisk) :that.gcePersistentDisk != null) return false;
            if (glusterfs != null ? !glusterfs.equals(that.glusterfs) :that.glusterfs != null) return false;
            if (hostPath != null ? !hostPath.equals(that.hostPath) :that.hostPath != null) return false;
            if (iscsi != null ? !iscsi.equals(that.iscsi) :that.iscsi != null) return false;
            if (local != null ? !local.equals(that.local) :that.local != null) return false;
            if (mountOptions != null ? !mountOptions.equals(that.mountOptions) :that.mountOptions != null) return false;
            if (nfs != null ? !nfs.equals(that.nfs) :that.nfs != null) return false;
            if (nodeAffinity != null ? !nodeAffinity.equals(that.nodeAffinity) :that.nodeAffinity != null) return false;
            if (persistentVolumeReclaimPolicy != null ? !persistentVolumeReclaimPolicy.equals(that.persistentVolumeReclaimPolicy) :that.persistentVolumeReclaimPolicy != null) return false;
            if (photonPersistentDisk != null ? !photonPersistentDisk.equals(that.photonPersistentDisk) :that.photonPersistentDisk != null) return false;
            if (portworxVolume != null ? !portworxVolume.equals(that.portworxVolume) :that.portworxVolume != null) return false;
            if (quobyte != null ? !quobyte.equals(that.quobyte) :that.quobyte != null) return false;
            if (rbd != null ? !rbd.equals(that.rbd) :that.rbd != null) return false;
            if (scaleIO != null ? !scaleIO.equals(that.scaleIO) :that.scaleIO != null) return false;
            if (storageClassName != null ? !storageClassName.equals(that.storageClassName) :that.storageClassName != null) return false;
            if (storageos != null ? !storageos.equals(that.storageos) :that.storageos != null) return false;
            if (volumeMode != null ? !volumeMode.equals(that.volumeMode) :that.volumeMode != null) return false;
            if (vsphereVolume != null ? !vsphereVolume.equals(that.vsphereVolume) :that.vsphereVolume != null) return false;
            return true;
    }


    public class AwsElasticBlockStoreNestedImpl<N> extends AWSElasticBlockStoreVolumeSourceFluentImpl<PersistentVolumeSpecFluent.AwsElasticBlockStoreNested<N>> implements PersistentVolumeSpecFluent.AwsElasticBlockStoreNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final AWSElasticBlockStoreVolumeSourceBuilder builder;
    
            AwsElasticBlockStoreNestedImpl(AWSElasticBlockStoreVolumeSource item){
                    this.builder = new AWSElasticBlockStoreVolumeSourceBuilder(this, item);
            }
            AwsElasticBlockStoreNestedImpl(){
                    this.builder = new AWSElasticBlockStoreVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) PersistentVolumeSpecFluentImpl.this.withAwsElasticBlockStore(builder.build());
    }
    public N endAwsElasticBlockStore(){
            return and();
    }

}
    public class AzureDiskNestedImpl<N> extends AzureDiskVolumeSourceFluentImpl<PersistentVolumeSpecFluent.AzureDiskNested<N>> implements PersistentVolumeSpecFluent.AzureDiskNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final AzureDiskVolumeSourceBuilder builder;
    
            AzureDiskNestedImpl(AzureDiskVolumeSource item){
                    this.builder = new AzureDiskVolumeSourceBuilder(this, item);
            }
            AzureDiskNestedImpl(){
                    this.builder = new AzureDiskVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) PersistentVolumeSpecFluentImpl.this.withAzureDisk(builder.build());
    }
    public N endAzureDisk(){
            return and();
    }

}
    public class AzureFileNestedImpl<N> extends AzureFilePersistentVolumeSourceFluentImpl<PersistentVolumeSpecFluent.AzureFileNested<N>> implements PersistentVolumeSpecFluent.AzureFileNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final AzureFilePersistentVolumeSourceBuilder builder;
    
            AzureFileNestedImpl(AzureFilePersistentVolumeSource item){
                    this.builder = new AzureFilePersistentVolumeSourceBuilder(this, item);
            }
            AzureFileNestedImpl(){
                    this.builder = new AzureFilePersistentVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) PersistentVolumeSpecFluentImpl.this.withAzureFile(builder.build());
    }
    public N endAzureFile(){
            return and();
    }

}
    public class CephfsNestedImpl<N> extends CephFSPersistentVolumeSourceFluentImpl<PersistentVolumeSpecFluent.CephfsNested<N>> implements PersistentVolumeSpecFluent.CephfsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CephFSPersistentVolumeSourceBuilder builder;
    
            CephfsNestedImpl(CephFSPersistentVolumeSource item){
                    this.builder = new CephFSPersistentVolumeSourceBuilder(this, item);
            }
            CephfsNestedImpl(){
                    this.builder = new CephFSPersistentVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) PersistentVolumeSpecFluentImpl.this.withCephfs(builder.build());
    }
    public N endCephfs(){
            return and();
    }

}
    public class CinderNestedImpl<N> extends CinderPersistentVolumeSourceFluentImpl<PersistentVolumeSpecFluent.CinderNested<N>> implements PersistentVolumeSpecFluent.CinderNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CinderPersistentVolumeSourceBuilder builder;
    
            CinderNestedImpl(CinderPersistentVolumeSource item){
                    this.builder = new CinderPersistentVolumeSourceBuilder(this, item);
            }
            CinderNestedImpl(){
                    this.builder = new CinderPersistentVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) PersistentVolumeSpecFluentImpl.this.withCinder(builder.build());
    }
    public N endCinder(){
            return and();
    }

}
    public class ClaimRefNestedImpl<N> extends ObjectReferenceFluentImpl<PersistentVolumeSpecFluent.ClaimRefNested<N>> implements PersistentVolumeSpecFluent.ClaimRefNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectReferenceBuilder builder;
    
            ClaimRefNestedImpl(ObjectReference item){
                    this.builder = new ObjectReferenceBuilder(this, item);
            }
            ClaimRefNestedImpl(){
                    this.builder = new ObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) PersistentVolumeSpecFluentImpl.this.withClaimRef(builder.build());
    }
    public N endClaimRef(){
            return and();
    }

}
    public class CsiNestedImpl<N> extends CSIPersistentVolumeSourceFluentImpl<PersistentVolumeSpecFluent.CsiNested<N>> implements PersistentVolumeSpecFluent.CsiNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CSIPersistentVolumeSourceBuilder builder;
    
            CsiNestedImpl(CSIPersistentVolumeSource item){
                    this.builder = new CSIPersistentVolumeSourceBuilder(this, item);
            }
            CsiNestedImpl(){
                    this.builder = new CSIPersistentVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) PersistentVolumeSpecFluentImpl.this.withCsi(builder.build());
    }
    public N endCsi(){
            return and();
    }

}
    public class FcNestedImpl<N> extends FCVolumeSourceFluentImpl<PersistentVolumeSpecFluent.FcNested<N>> implements PersistentVolumeSpecFluent.FcNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final FCVolumeSourceBuilder builder;
    
            FcNestedImpl(FCVolumeSource item){
                    this.builder = new FCVolumeSourceBuilder(this, item);
            }
            FcNestedImpl(){
                    this.builder = new FCVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) PersistentVolumeSpecFluentImpl.this.withFc(builder.build());
    }
    public N endFc(){
            return and();
    }

}
    public class FlexVolumeNestedImpl<N> extends FlexPersistentVolumeSourceFluentImpl<PersistentVolumeSpecFluent.FlexVolumeNested<N>> implements PersistentVolumeSpecFluent.FlexVolumeNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final FlexPersistentVolumeSourceBuilder builder;
    
            FlexVolumeNestedImpl(FlexPersistentVolumeSource item){
                    this.builder = new FlexPersistentVolumeSourceBuilder(this, item);
            }
            FlexVolumeNestedImpl(){
                    this.builder = new FlexPersistentVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) PersistentVolumeSpecFluentImpl.this.withFlexVolume(builder.build());
    }
    public N endFlexVolume(){
            return and();
    }

}
    public class FlockerNestedImpl<N> extends FlockerVolumeSourceFluentImpl<PersistentVolumeSpecFluent.FlockerNested<N>> implements PersistentVolumeSpecFluent.FlockerNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final FlockerVolumeSourceBuilder builder;
    
            FlockerNestedImpl(FlockerVolumeSource item){
                    this.builder = new FlockerVolumeSourceBuilder(this, item);
            }
            FlockerNestedImpl(){
                    this.builder = new FlockerVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) PersistentVolumeSpecFluentImpl.this.withFlocker(builder.build());
    }
    public N endFlocker(){
            return and();
    }

}
    public class GcePersistentDiskNestedImpl<N> extends GCEPersistentDiskVolumeSourceFluentImpl<PersistentVolumeSpecFluent.GcePersistentDiskNested<N>> implements PersistentVolumeSpecFluent.GcePersistentDiskNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final GCEPersistentDiskVolumeSourceBuilder builder;
    
            GcePersistentDiskNestedImpl(GCEPersistentDiskVolumeSource item){
                    this.builder = new GCEPersistentDiskVolumeSourceBuilder(this, item);
            }
            GcePersistentDiskNestedImpl(){
                    this.builder = new GCEPersistentDiskVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) PersistentVolumeSpecFluentImpl.this.withGcePersistentDisk(builder.build());
    }
    public N endGcePersistentDisk(){
            return and();
    }

}
    public class GlusterfsNestedImpl<N> extends GlusterfsPersistentVolumeSourceFluentImpl<PersistentVolumeSpecFluent.GlusterfsNested<N>> implements PersistentVolumeSpecFluent.GlusterfsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final GlusterfsPersistentVolumeSourceBuilder builder;
    
            GlusterfsNestedImpl(GlusterfsPersistentVolumeSource item){
                    this.builder = new GlusterfsPersistentVolumeSourceBuilder(this, item);
            }
            GlusterfsNestedImpl(){
                    this.builder = new GlusterfsPersistentVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) PersistentVolumeSpecFluentImpl.this.withGlusterfs(builder.build());
    }
    public N endGlusterfs(){
            return and();
    }

}
    public class HostPathNestedImpl<N> extends HostPathVolumeSourceFluentImpl<PersistentVolumeSpecFluent.HostPathNested<N>> implements PersistentVolumeSpecFluent.HostPathNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final HostPathVolumeSourceBuilder builder;
    
            HostPathNestedImpl(HostPathVolumeSource item){
                    this.builder = new HostPathVolumeSourceBuilder(this, item);
            }
            HostPathNestedImpl(){
                    this.builder = new HostPathVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) PersistentVolumeSpecFluentImpl.this.withHostPath(builder.build());
    }
    public N endHostPath(){
            return and();
    }

}
    public class IscsiNestedImpl<N> extends ISCSIPersistentVolumeSourceFluentImpl<PersistentVolumeSpecFluent.IscsiNested<N>> implements PersistentVolumeSpecFluent.IscsiNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ISCSIPersistentVolumeSourceBuilder builder;
    
            IscsiNestedImpl(ISCSIPersistentVolumeSource item){
                    this.builder = new ISCSIPersistentVolumeSourceBuilder(this, item);
            }
            IscsiNestedImpl(){
                    this.builder = new ISCSIPersistentVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) PersistentVolumeSpecFluentImpl.this.withIscsi(builder.build());
    }
    public N endIscsi(){
            return and();
    }

}
    public class LocalNestedImpl<N> extends LocalVolumeSourceFluentImpl<PersistentVolumeSpecFluent.LocalNested<N>> implements PersistentVolumeSpecFluent.LocalNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LocalVolumeSourceBuilder builder;
    
            LocalNestedImpl(LocalVolumeSource item){
                    this.builder = new LocalVolumeSourceBuilder(this, item);
            }
            LocalNestedImpl(){
                    this.builder = new LocalVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) PersistentVolumeSpecFluentImpl.this.withLocal(builder.build());
    }
    public N endLocal(){
            return and();
    }

}
    public class NfsNestedImpl<N> extends NFSVolumeSourceFluentImpl<PersistentVolumeSpecFluent.NfsNested<N>> implements PersistentVolumeSpecFluent.NfsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NFSVolumeSourceBuilder builder;
    
            NfsNestedImpl(NFSVolumeSource item){
                    this.builder = new NFSVolumeSourceBuilder(this, item);
            }
            NfsNestedImpl(){
                    this.builder = new NFSVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) PersistentVolumeSpecFluentImpl.this.withNfs(builder.build());
    }
    public N endNfs(){
            return and();
    }

}
    public class NodeAffinityNestedImpl<N> extends VolumeNodeAffinityFluentImpl<PersistentVolumeSpecFluent.NodeAffinityNested<N>> implements PersistentVolumeSpecFluent.NodeAffinityNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final VolumeNodeAffinityBuilder builder;
    
            NodeAffinityNestedImpl(VolumeNodeAffinity item){
                    this.builder = new VolumeNodeAffinityBuilder(this, item);
            }
            NodeAffinityNestedImpl(){
                    this.builder = new VolumeNodeAffinityBuilder(this);
            }
    
    public N and(){
            return (N) PersistentVolumeSpecFluentImpl.this.withNodeAffinity(builder.build());
    }
    public N endNodeAffinity(){
            return and();
    }

}
    public class PhotonPersistentDiskNestedImpl<N> extends PhotonPersistentDiskVolumeSourceFluentImpl<PersistentVolumeSpecFluent.PhotonPersistentDiskNested<N>> implements PersistentVolumeSpecFluent.PhotonPersistentDiskNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PhotonPersistentDiskVolumeSourceBuilder builder;
    
            PhotonPersistentDiskNestedImpl(PhotonPersistentDiskVolumeSource item){
                    this.builder = new PhotonPersistentDiskVolumeSourceBuilder(this, item);
            }
            PhotonPersistentDiskNestedImpl(){
                    this.builder = new PhotonPersistentDiskVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) PersistentVolumeSpecFluentImpl.this.withPhotonPersistentDisk(builder.build());
    }
    public N endPhotonPersistentDisk(){
            return and();
    }

}
    public class PortworxVolumeNestedImpl<N> extends PortworxVolumeSourceFluentImpl<PersistentVolumeSpecFluent.PortworxVolumeNested<N>> implements PersistentVolumeSpecFluent.PortworxVolumeNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PortworxVolumeSourceBuilder builder;
    
            PortworxVolumeNestedImpl(PortworxVolumeSource item){
                    this.builder = new PortworxVolumeSourceBuilder(this, item);
            }
            PortworxVolumeNestedImpl(){
                    this.builder = new PortworxVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) PersistentVolumeSpecFluentImpl.this.withPortworxVolume(builder.build());
    }
    public N endPortworxVolume(){
            return and();
    }

}
    public class QuobyteNestedImpl<N> extends QuobyteVolumeSourceFluentImpl<PersistentVolumeSpecFluent.QuobyteNested<N>> implements PersistentVolumeSpecFluent.QuobyteNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final QuobyteVolumeSourceBuilder builder;
    
            QuobyteNestedImpl(QuobyteVolumeSource item){
                    this.builder = new QuobyteVolumeSourceBuilder(this, item);
            }
            QuobyteNestedImpl(){
                    this.builder = new QuobyteVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) PersistentVolumeSpecFluentImpl.this.withQuobyte(builder.build());
    }
    public N endQuobyte(){
            return and();
    }

}
    public class RbdNestedImpl<N> extends RBDPersistentVolumeSourceFluentImpl<PersistentVolumeSpecFluent.RbdNested<N>> implements PersistentVolumeSpecFluent.RbdNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RBDPersistentVolumeSourceBuilder builder;
    
            RbdNestedImpl(RBDPersistentVolumeSource item){
                    this.builder = new RBDPersistentVolumeSourceBuilder(this, item);
            }
            RbdNestedImpl(){
                    this.builder = new RBDPersistentVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) PersistentVolumeSpecFluentImpl.this.withRbd(builder.build());
    }
    public N endRbd(){
            return and();
    }

}
    public class ScaleIONestedImpl<N> extends ScaleIOPersistentVolumeSourceFluentImpl<PersistentVolumeSpecFluent.ScaleIONested<N>> implements PersistentVolumeSpecFluent.ScaleIONested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ScaleIOPersistentVolumeSourceBuilder builder;
    
            ScaleIONestedImpl(ScaleIOPersistentVolumeSource item){
                    this.builder = new ScaleIOPersistentVolumeSourceBuilder(this, item);
            }
            ScaleIONestedImpl(){
                    this.builder = new ScaleIOPersistentVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) PersistentVolumeSpecFluentImpl.this.withScaleIO(builder.build());
    }
    public N endScaleIO(){
            return and();
    }

}
    public class StorageosNestedImpl<N> extends StorageOSPersistentVolumeSourceFluentImpl<PersistentVolumeSpecFluent.StorageosNested<N>> implements PersistentVolumeSpecFluent.StorageosNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StorageOSPersistentVolumeSourceBuilder builder;
    
            StorageosNestedImpl(StorageOSPersistentVolumeSource item){
                    this.builder = new StorageOSPersistentVolumeSourceBuilder(this, item);
            }
            StorageosNestedImpl(){
                    this.builder = new StorageOSPersistentVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) PersistentVolumeSpecFluentImpl.this.withStorageos(builder.build());
    }
    public N endStorageos(){
            return and();
    }

}
    public class VsphereVolumeNestedImpl<N> extends VsphereVirtualDiskVolumeSourceFluentImpl<PersistentVolumeSpecFluent.VsphereVolumeNested<N>> implements PersistentVolumeSpecFluent.VsphereVolumeNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final VsphereVirtualDiskVolumeSourceBuilder builder;
    
            VsphereVolumeNestedImpl(VsphereVirtualDiskVolumeSource item){
                    this.builder = new VsphereVirtualDiskVolumeSourceBuilder(this, item);
            }
            VsphereVolumeNestedImpl(){
                    this.builder = new VsphereVirtualDiskVolumeSourceBuilder(this);
            }
    
    public N and(){
            return (N) PersistentVolumeSpecFluentImpl.this.withVsphereVolume(builder.build());
    }
    public N endVsphereVolume(){
            return and();
    }

}


}
