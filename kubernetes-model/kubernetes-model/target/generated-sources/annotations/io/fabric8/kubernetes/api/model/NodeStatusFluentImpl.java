package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.util.LinkedHashMap;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.Deprecated;

public class NodeStatusFluentImpl<A extends NodeStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements NodeStatusFluent<A>{

    private List<NodeAddressBuilder> addresses;
    private Map<String,Quantity> allocatable;
    private Map<String,Quantity> capacity;
    private List<NodeConditionBuilder> conditions;
    private NodeConfigStatusBuilder config;
    private NodeDaemonEndpointsBuilder daemonEndpoints;
    private List<ContainerImageBuilder> images;
    private NodeSystemInfoBuilder nodeInfo;
    private String phase;
    private List<AttachedVolumeBuilder> volumesAttached;
    private List<String> volumesInUse;

    public NodeStatusFluentImpl(){
    }
    public NodeStatusFluentImpl(NodeStatus instance){
            this.withAddresses(instance.getAddresses()); 
            this.withAllocatable(instance.getAllocatable()); 
            this.withCapacity(instance.getCapacity()); 
            this.withConditions(instance.getConditions()); 
            this.withConfig(instance.getConfig()); 
            this.withDaemonEndpoints(instance.getDaemonEndpoints()); 
            this.withImages(instance.getImages()); 
            this.withNodeInfo(instance.getNodeInfo()); 
            this.withPhase(instance.getPhase()); 
            this.withVolumesAttached(instance.getVolumesAttached()); 
            this.withVolumesInUse(instance.getVolumesInUse()); 
    }

    public A addToAddresses(int index,NodeAddress item){
            if (this.addresses == null) {this.addresses = new ArrayList<NodeAddressBuilder>();}
            NodeAddressBuilder builder = new NodeAddressBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.addresses.add(index >= 0 ? index : addresses.size(), builder); return (A)this;
    }

    public A setToAddresses(int index,NodeAddress item){
            if (this.addresses == null) {this.addresses = new ArrayList<NodeAddressBuilder>();}
            NodeAddressBuilder builder = new NodeAddressBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= addresses.size()) { addresses.add(builder); } else { addresses.set(index, builder);}
             return (A)this;
    }

    public A addToAddresses(NodeAddress... items){
            if (this.addresses == null) {this.addresses = new ArrayList<NodeAddressBuilder>();}
            for (NodeAddress item : items) {NodeAddressBuilder builder = new NodeAddressBuilder(item);_visitables.add(builder);this.addresses.add(builder);} return (A)this;
    }

    public A addAllToAddresses(Collection<NodeAddress> items){
            if (this.addresses == null) {this.addresses = new ArrayList<NodeAddressBuilder>();}
            for (NodeAddress item : items) {NodeAddressBuilder builder = new NodeAddressBuilder(item);_visitables.add(builder);this.addresses.add(builder);} return (A)this;
    }

    public A removeFromAddresses(NodeAddress... items){
            for (NodeAddress item : items) {NodeAddressBuilder builder = new NodeAddressBuilder(item);_visitables.remove(builder);if (this.addresses != null) {this.addresses.remove(builder);}} return (A)this;
    }

    public A removeAllFromAddresses(Collection<NodeAddress> items){
            for (NodeAddress item : items) {NodeAddressBuilder builder = new NodeAddressBuilder(item);_visitables.remove(builder);if (this.addresses != null) {this.addresses.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildAddresses instead.
 * @return The buildable object.
 */
@Deprecated public List<NodeAddress> getAddresses(){
            return build(addresses);
    }

    public List<NodeAddress> buildAddresses(){
            return build(addresses);
    }

    public NodeAddress buildAddress(int index){
            return this.addresses.get(index).build();
    }

    public NodeAddress buildFirstAddress(){
            return this.addresses.get(0).build();
    }

    public NodeAddress buildLastAddress(){
            return this.addresses.get(addresses.size() - 1).build();
    }

    public NodeAddress buildMatchingAddress(io.fabric8.kubernetes.api.builder.Predicate<NodeAddressBuilder> predicate){
            for (NodeAddressBuilder item: addresses) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withAddresses(List<NodeAddress> addresses){
            if (this.addresses != null) { _visitables.removeAll(this.addresses);}
            if (addresses != null) {this.addresses = new ArrayList<NodeAddressBuilder>(); for (NodeAddress item : addresses){this.addToAddresses(item);}} else { this.addresses = new ArrayList<NodeAddressBuilder>();} return (A) this;
    }

    public A withAddresses(NodeAddress... addresses){
            if (this.addresses != null) {this.addresses.clear();}
            if (addresses != null) {for (NodeAddress item :addresses){ this.addToAddresses(item);}} return (A) this;
    }

    public Boolean hasAddresses(){
            return addresses != null && !addresses.isEmpty();
    }

    public A addNewAddress(String address,String type){
            return (A)addToAddresses(new NodeAddress(address, type));
    }

    public NodeStatusFluent.AddressesNested<A> addNewAddress(){
            return new AddressesNestedImpl();
    }

    public NodeStatusFluent.AddressesNested<A> addNewAddressLike(NodeAddress item){
            return new AddressesNestedImpl(-1, item);
    }

    public NodeStatusFluent.AddressesNested<A> setNewAddressLike(int index,NodeAddress item){
            return new AddressesNestedImpl(index, item);
    }

    public NodeStatusFluent.AddressesNested<A> editAddress(int index){
            if (addresses.size() <= index) throw new RuntimeException("Can't edit addresses. Index exceeds size.");
            return setNewAddressLike(index, buildAddress(index));
    }

    public NodeStatusFluent.AddressesNested<A> editFirstAddress(){
            if (addresses.size() == 0) throw new RuntimeException("Can't edit first addresses. The list is empty.");
            return setNewAddressLike(0, buildAddress(0));
    }

    public NodeStatusFluent.AddressesNested<A> editLastAddress(){
            int index = addresses.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last addresses. The list is empty.");
            return setNewAddressLike(index, buildAddress(index));
    }

    public NodeStatusFluent.AddressesNested<A> editMatchingAddress(io.fabric8.kubernetes.api.builder.Predicate<NodeAddressBuilder> predicate){
            int index = -1;
            for (int i=0;i<addresses.size();i++) { 
            if (predicate.apply(addresses.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching addresses. No match found.");
            return setNewAddressLike(index, buildAddress(index));
    }

    public A addToAllocatable(String key,Quantity value){
            if(this.allocatable == null && key != null && value != null) { this.allocatable = new LinkedHashMap<String,Quantity>(); }
            if(key != null && value != null) {this.allocatable.put(key, value);} return (A)this;
    }

    public A addToAllocatable(Map<String,Quantity> map){
            if(this.allocatable == null && map != null) { this.allocatable = new LinkedHashMap<String,Quantity>(); }
            if(map != null) { this.allocatable.putAll(map);} return (A)this;
    }

    public A removeFromAllocatable(String key){
            if(this.allocatable == null) { return (A) this; }
            if(key != null && this.allocatable != null) {this.allocatable.remove(key);} return (A)this;
    }

    public A removeFromAllocatable(Map<String,Quantity> map){
            if(this.allocatable == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.allocatable != null){this.allocatable.remove(key);}}} return (A)this;
    }

    public Map<String,Quantity> getAllocatable(){
            return this.allocatable;
    }

    public A withAllocatable(Map<String,Quantity> allocatable){
            if (allocatable == null) { this.allocatable =  new LinkedHashMap<String,Quantity>();} else {this.allocatable = new LinkedHashMap<String,Quantity>(allocatable);} return (A) this;
    }

    public Boolean hasAllocatable(){
            return this.allocatable != null;
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

    public A addToConditions(int index,NodeCondition item){
            if (this.conditions == null) {this.conditions = new ArrayList<NodeConditionBuilder>();}
            NodeConditionBuilder builder = new NodeConditionBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.conditions.add(index >= 0 ? index : conditions.size(), builder); return (A)this;
    }

    public A setToConditions(int index,NodeCondition item){
            if (this.conditions == null) {this.conditions = new ArrayList<NodeConditionBuilder>();}
            NodeConditionBuilder builder = new NodeConditionBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= conditions.size()) { conditions.add(builder); } else { conditions.set(index, builder);}
             return (A)this;
    }

    public A addToConditions(NodeCondition... items){
            if (this.conditions == null) {this.conditions = new ArrayList<NodeConditionBuilder>();}
            for (NodeCondition item : items) {NodeConditionBuilder builder = new NodeConditionBuilder(item);_visitables.add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A addAllToConditions(Collection<NodeCondition> items){
            if (this.conditions == null) {this.conditions = new ArrayList<NodeConditionBuilder>();}
            for (NodeCondition item : items) {NodeConditionBuilder builder = new NodeConditionBuilder(item);_visitables.add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A removeFromConditions(NodeCondition... items){
            for (NodeCondition item : items) {NodeConditionBuilder builder = new NodeConditionBuilder(item);_visitables.remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    public A removeAllFromConditions(Collection<NodeCondition> items){
            for (NodeCondition item : items) {NodeConditionBuilder builder = new NodeConditionBuilder(item);_visitables.remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildConditions instead.
 * @return The buildable object.
 */
@Deprecated public List<NodeCondition> getConditions(){
            return build(conditions);
    }

    public List<NodeCondition> buildConditions(){
            return build(conditions);
    }

    public NodeCondition buildCondition(int index){
            return this.conditions.get(index).build();
    }

    public NodeCondition buildFirstCondition(){
            return this.conditions.get(0).build();
    }

    public NodeCondition buildLastCondition(){
            return this.conditions.get(conditions.size() - 1).build();
    }

    public NodeCondition buildMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<NodeConditionBuilder> predicate){
            for (NodeConditionBuilder item: conditions) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withConditions(List<NodeCondition> conditions){
            if (this.conditions != null) { _visitables.removeAll(this.conditions);}
            if (conditions != null) {this.conditions = new ArrayList<NodeConditionBuilder>(); for (NodeCondition item : conditions){this.addToConditions(item);}} else { this.conditions = new ArrayList<NodeConditionBuilder>();} return (A) this;
    }

    public A withConditions(NodeCondition... conditions){
            if (this.conditions != null) {this.conditions.clear();}
            if (conditions != null) {for (NodeCondition item :conditions){ this.addToConditions(item);}} return (A) this;
    }

    public Boolean hasConditions(){
            return conditions != null && !conditions.isEmpty();
    }

    public NodeStatusFluent.ConditionsNested<A> addNewCondition(){
            return new ConditionsNestedImpl();
    }

    public NodeStatusFluent.ConditionsNested<A> addNewConditionLike(NodeCondition item){
            return new ConditionsNestedImpl(-1, item);
    }

    public NodeStatusFluent.ConditionsNested<A> setNewConditionLike(int index,NodeCondition item){
            return new ConditionsNestedImpl(index, item);
    }

    public NodeStatusFluent.ConditionsNested<A> editCondition(int index){
            if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public NodeStatusFluent.ConditionsNested<A> editFirstCondition(){
            if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
            return setNewConditionLike(0, buildCondition(0));
    }

    public NodeStatusFluent.ConditionsNested<A> editLastCondition(){
            int index = conditions.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public NodeStatusFluent.ConditionsNested<A> editMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<NodeConditionBuilder> predicate){
            int index = -1;
            for (int i=0;i<conditions.size();i++) { 
            if (predicate.apply(conditions.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
            return setNewConditionLike(index, buildCondition(index));
    }

    
/**
 * This method has been deprecated, please use method buildConfig instead.
 * @return The buildable object.
 */
@Deprecated public NodeConfigStatus getConfig(){
            return this.config!=null?this.config.build():null;
    }

    public NodeConfigStatus buildConfig(){
            return this.config!=null?this.config.build():null;
    }

    public A withConfig(NodeConfigStatus config){
            _visitables.remove(this.config);
            if (config!=null){ this.config= new NodeConfigStatusBuilder(config); _visitables.add(this.config);} return (A) this;
    }

    public Boolean hasConfig(){
            return this.config != null;
    }

    public NodeStatusFluent.ConfigNested<A> withNewConfig(){
            return new ConfigNestedImpl();
    }

    public NodeStatusFluent.ConfigNested<A> withNewConfigLike(NodeConfigStatus item){
            return new ConfigNestedImpl(item);
    }

    public NodeStatusFluent.ConfigNested<A> editConfig(){
            return withNewConfigLike(getConfig());
    }

    public NodeStatusFluent.ConfigNested<A> editOrNewConfig(){
            return withNewConfigLike(getConfig() != null ? getConfig(): new NodeConfigStatusBuilder().build());
    }

    public NodeStatusFluent.ConfigNested<A> editOrNewConfigLike(NodeConfigStatus item){
            return withNewConfigLike(getConfig() != null ? getConfig(): item);
    }

    
/**
 * This method has been deprecated, please use method buildDaemonEndpoints instead.
 * @return The buildable object.
 */
@Deprecated public NodeDaemonEndpoints getDaemonEndpoints(){
            return this.daemonEndpoints!=null?this.daemonEndpoints.build():null;
    }

    public NodeDaemonEndpoints buildDaemonEndpoints(){
            return this.daemonEndpoints!=null?this.daemonEndpoints.build():null;
    }

    public A withDaemonEndpoints(NodeDaemonEndpoints daemonEndpoints){
            _visitables.remove(this.daemonEndpoints);
            if (daemonEndpoints!=null){ this.daemonEndpoints= new NodeDaemonEndpointsBuilder(daemonEndpoints); _visitables.add(this.daemonEndpoints);} return (A) this;
    }

    public Boolean hasDaemonEndpoints(){
            return this.daemonEndpoints != null;
    }

    public NodeStatusFluent.DaemonEndpointsNested<A> withNewDaemonEndpoints(){
            return new DaemonEndpointsNestedImpl();
    }

    public NodeStatusFluent.DaemonEndpointsNested<A> withNewDaemonEndpointsLike(NodeDaemonEndpoints item){
            return new DaemonEndpointsNestedImpl(item);
    }

    public NodeStatusFluent.DaemonEndpointsNested<A> editDaemonEndpoints(){
            return withNewDaemonEndpointsLike(getDaemonEndpoints());
    }

    public NodeStatusFluent.DaemonEndpointsNested<A> editOrNewDaemonEndpoints(){
            return withNewDaemonEndpointsLike(getDaemonEndpoints() != null ? getDaemonEndpoints(): new NodeDaemonEndpointsBuilder().build());
    }

    public NodeStatusFluent.DaemonEndpointsNested<A> editOrNewDaemonEndpointsLike(NodeDaemonEndpoints item){
            return withNewDaemonEndpointsLike(getDaemonEndpoints() != null ? getDaemonEndpoints(): item);
    }

    public A addToImages(int index,ContainerImage item){
            if (this.images == null) {this.images = new ArrayList<ContainerImageBuilder>();}
            ContainerImageBuilder builder = new ContainerImageBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.images.add(index >= 0 ? index : images.size(), builder); return (A)this;
    }

    public A setToImages(int index,ContainerImage item){
            if (this.images == null) {this.images = new ArrayList<ContainerImageBuilder>();}
            ContainerImageBuilder builder = new ContainerImageBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= images.size()) { images.add(builder); } else { images.set(index, builder);}
             return (A)this;
    }

    public A addToImages(ContainerImage... items){
            if (this.images == null) {this.images = new ArrayList<ContainerImageBuilder>();}
            for (ContainerImage item : items) {ContainerImageBuilder builder = new ContainerImageBuilder(item);_visitables.add(builder);this.images.add(builder);} return (A)this;
    }

    public A addAllToImages(Collection<ContainerImage> items){
            if (this.images == null) {this.images = new ArrayList<ContainerImageBuilder>();}
            for (ContainerImage item : items) {ContainerImageBuilder builder = new ContainerImageBuilder(item);_visitables.add(builder);this.images.add(builder);} return (A)this;
    }

    public A removeFromImages(ContainerImage... items){
            for (ContainerImage item : items) {ContainerImageBuilder builder = new ContainerImageBuilder(item);_visitables.remove(builder);if (this.images != null) {this.images.remove(builder);}} return (A)this;
    }

    public A removeAllFromImages(Collection<ContainerImage> items){
            for (ContainerImage item : items) {ContainerImageBuilder builder = new ContainerImageBuilder(item);_visitables.remove(builder);if (this.images != null) {this.images.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildImages instead.
 * @return The buildable object.
 */
@Deprecated public List<ContainerImage> getImages(){
            return build(images);
    }

    public List<ContainerImage> buildImages(){
            return build(images);
    }

    public ContainerImage buildImage(int index){
            return this.images.get(index).build();
    }

    public ContainerImage buildFirstImage(){
            return this.images.get(0).build();
    }

    public ContainerImage buildLastImage(){
            return this.images.get(images.size() - 1).build();
    }

    public ContainerImage buildMatchingImage(io.fabric8.kubernetes.api.builder.Predicate<ContainerImageBuilder> predicate){
            for (ContainerImageBuilder item: images) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withImages(List<ContainerImage> images){
            if (this.images != null) { _visitables.removeAll(this.images);}
            if (images != null) {this.images = new ArrayList<ContainerImageBuilder>(); for (ContainerImage item : images){this.addToImages(item);}} else { this.images = new ArrayList<ContainerImageBuilder>();} return (A) this;
    }

    public A withImages(ContainerImage... images){
            if (this.images != null) {this.images.clear();}
            if (images != null) {for (ContainerImage item :images){ this.addToImages(item);}} return (A) this;
    }

    public Boolean hasImages(){
            return images != null && !images.isEmpty();
    }

    public NodeStatusFluent.ImagesNested<A> addNewImage(){
            return new ImagesNestedImpl();
    }

    public NodeStatusFluent.ImagesNested<A> addNewImageLike(ContainerImage item){
            return new ImagesNestedImpl(-1, item);
    }

    public NodeStatusFluent.ImagesNested<A> setNewImageLike(int index,ContainerImage item){
            return new ImagesNestedImpl(index, item);
    }

    public NodeStatusFluent.ImagesNested<A> editImage(int index){
            if (images.size() <= index) throw new RuntimeException("Can't edit images. Index exceeds size.");
            return setNewImageLike(index, buildImage(index));
    }

    public NodeStatusFluent.ImagesNested<A> editFirstImage(){
            if (images.size() == 0) throw new RuntimeException("Can't edit first images. The list is empty.");
            return setNewImageLike(0, buildImage(0));
    }

    public NodeStatusFluent.ImagesNested<A> editLastImage(){
            int index = images.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last images. The list is empty.");
            return setNewImageLike(index, buildImage(index));
    }

    public NodeStatusFluent.ImagesNested<A> editMatchingImage(io.fabric8.kubernetes.api.builder.Predicate<ContainerImageBuilder> predicate){
            int index = -1;
            for (int i=0;i<images.size();i++) { 
            if (predicate.apply(images.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching images. No match found.");
            return setNewImageLike(index, buildImage(index));
    }

    
/**
 * This method has been deprecated, please use method buildNodeInfo instead.
 * @return The buildable object.
 */
@Deprecated public NodeSystemInfo getNodeInfo(){
            return this.nodeInfo!=null?this.nodeInfo.build():null;
    }

    public NodeSystemInfo buildNodeInfo(){
            return this.nodeInfo!=null?this.nodeInfo.build():null;
    }

    public A withNodeInfo(NodeSystemInfo nodeInfo){
            _visitables.remove(this.nodeInfo);
            if (nodeInfo!=null){ this.nodeInfo= new NodeSystemInfoBuilder(nodeInfo); _visitables.add(this.nodeInfo);} return (A) this;
    }

    public Boolean hasNodeInfo(){
            return this.nodeInfo != null;
    }

    public NodeStatusFluent.NodeInfoNested<A> withNewNodeInfo(){
            return new NodeInfoNestedImpl();
    }

    public NodeStatusFluent.NodeInfoNested<A> withNewNodeInfoLike(NodeSystemInfo item){
            return new NodeInfoNestedImpl(item);
    }

    public NodeStatusFluent.NodeInfoNested<A> editNodeInfo(){
            return withNewNodeInfoLike(getNodeInfo());
    }

    public NodeStatusFluent.NodeInfoNested<A> editOrNewNodeInfo(){
            return withNewNodeInfoLike(getNodeInfo() != null ? getNodeInfo(): new NodeSystemInfoBuilder().build());
    }

    public NodeStatusFluent.NodeInfoNested<A> editOrNewNodeInfoLike(NodeSystemInfo item){
            return withNewNodeInfoLike(getNodeInfo() != null ? getNodeInfo(): item);
    }

    public String getPhase(){
            return this.phase;
    }

    public A withPhase(String phase){
            this.phase=phase; return (A) this;
    }

    public Boolean hasPhase(){
            return this.phase != null;
    }

    public A addToVolumesAttached(int index,AttachedVolume item){
            if (this.volumesAttached == null) {this.volumesAttached = new ArrayList<AttachedVolumeBuilder>();}
            AttachedVolumeBuilder builder = new AttachedVolumeBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.volumesAttached.add(index >= 0 ? index : volumesAttached.size(), builder); return (A)this;
    }

    public A setToVolumesAttached(int index,AttachedVolume item){
            if (this.volumesAttached == null) {this.volumesAttached = new ArrayList<AttachedVolumeBuilder>();}
            AttachedVolumeBuilder builder = new AttachedVolumeBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= volumesAttached.size()) { volumesAttached.add(builder); } else { volumesAttached.set(index, builder);}
             return (A)this;
    }

    public A addToVolumesAttached(AttachedVolume... items){
            if (this.volumesAttached == null) {this.volumesAttached = new ArrayList<AttachedVolumeBuilder>();}
            for (AttachedVolume item : items) {AttachedVolumeBuilder builder = new AttachedVolumeBuilder(item);_visitables.add(builder);this.volumesAttached.add(builder);} return (A)this;
    }

    public A addAllToVolumesAttached(Collection<AttachedVolume> items){
            if (this.volumesAttached == null) {this.volumesAttached = new ArrayList<AttachedVolumeBuilder>();}
            for (AttachedVolume item : items) {AttachedVolumeBuilder builder = new AttachedVolumeBuilder(item);_visitables.add(builder);this.volumesAttached.add(builder);} return (A)this;
    }

    public A removeFromVolumesAttached(AttachedVolume... items){
            for (AttachedVolume item : items) {AttachedVolumeBuilder builder = new AttachedVolumeBuilder(item);_visitables.remove(builder);if (this.volumesAttached != null) {this.volumesAttached.remove(builder);}} return (A)this;
    }

    public A removeAllFromVolumesAttached(Collection<AttachedVolume> items){
            for (AttachedVolume item : items) {AttachedVolumeBuilder builder = new AttachedVolumeBuilder(item);_visitables.remove(builder);if (this.volumesAttached != null) {this.volumesAttached.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildVolumesAttached instead.
 * @return The buildable object.
 */
@Deprecated public List<AttachedVolume> getVolumesAttached(){
            return build(volumesAttached);
    }

    public List<AttachedVolume> buildVolumesAttached(){
            return build(volumesAttached);
    }

    public AttachedVolume buildVolumesAttached(int index){
            return this.volumesAttached.get(index).build();
    }

    public AttachedVolume buildFirstVolumesAttached(){
            return this.volumesAttached.get(0).build();
    }

    public AttachedVolume buildLastVolumesAttached(){
            return this.volumesAttached.get(volumesAttached.size() - 1).build();
    }

    public AttachedVolume buildMatchingVolumesAttached(io.fabric8.kubernetes.api.builder.Predicate<AttachedVolumeBuilder> predicate){
            for (AttachedVolumeBuilder item: volumesAttached) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withVolumesAttached(List<AttachedVolume> volumesAttached){
            if (this.volumesAttached != null) { _visitables.removeAll(this.volumesAttached);}
            if (volumesAttached != null) {this.volumesAttached = new ArrayList<AttachedVolumeBuilder>(); for (AttachedVolume item : volumesAttached){this.addToVolumesAttached(item);}} else { this.volumesAttached = new ArrayList<AttachedVolumeBuilder>();} return (A) this;
    }

    public A withVolumesAttached(AttachedVolume... volumesAttached){
            if (this.volumesAttached != null) {this.volumesAttached.clear();}
            if (volumesAttached != null) {for (AttachedVolume item :volumesAttached){ this.addToVolumesAttached(item);}} return (A) this;
    }

    public Boolean hasVolumesAttached(){
            return volumesAttached != null && !volumesAttached.isEmpty();
    }

    public A addNewVolumesAttached(String devicePath,String name){
            return (A)addToVolumesAttached(new AttachedVolume(devicePath, name));
    }

    public NodeStatusFluent.VolumesAttachedNested<A> addNewVolumesAttached(){
            return new VolumesAttachedNestedImpl();
    }

    public NodeStatusFluent.VolumesAttachedNested<A> addNewVolumesAttachedLike(AttachedVolume item){
            return new VolumesAttachedNestedImpl(-1, item);
    }

    public NodeStatusFluent.VolumesAttachedNested<A> setNewVolumesAttachedLike(int index,AttachedVolume item){
            return new VolumesAttachedNestedImpl(index, item);
    }

    public NodeStatusFluent.VolumesAttachedNested<A> editVolumesAttached(int index){
            if (volumesAttached.size() <= index) throw new RuntimeException("Can't edit volumesAttached. Index exceeds size.");
            return setNewVolumesAttachedLike(index, buildVolumesAttached(index));
    }

    public NodeStatusFluent.VolumesAttachedNested<A> editFirstVolumesAttached(){
            if (volumesAttached.size() == 0) throw new RuntimeException("Can't edit first volumesAttached. The list is empty.");
            return setNewVolumesAttachedLike(0, buildVolumesAttached(0));
    }

    public NodeStatusFluent.VolumesAttachedNested<A> editLastVolumesAttached(){
            int index = volumesAttached.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last volumesAttached. The list is empty.");
            return setNewVolumesAttachedLike(index, buildVolumesAttached(index));
    }

    public NodeStatusFluent.VolumesAttachedNested<A> editMatchingVolumesAttached(io.fabric8.kubernetes.api.builder.Predicate<AttachedVolumeBuilder> predicate){
            int index = -1;
            for (int i=0;i<volumesAttached.size();i++) { 
            if (predicate.apply(volumesAttached.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching volumesAttached. No match found.");
            return setNewVolumesAttachedLike(index, buildVolumesAttached(index));
    }

    public A addToVolumesInUse(int index,String item){
            if (this.volumesInUse == null) {this.volumesInUse = new ArrayList<String>();}
            this.volumesInUse.add(index, item);
            return (A)this;
    }

    public A setToVolumesInUse(int index,String item){
            if (this.volumesInUse == null) {this.volumesInUse = new ArrayList<String>();}
            this.volumesInUse.set(index, item); return (A)this;
    }

    public A addToVolumesInUse(String... items){
            if (this.volumesInUse == null) {this.volumesInUse = new ArrayList<String>();}
            for (String item : items) {this.volumesInUse.add(item);} return (A)this;
    }

    public A addAllToVolumesInUse(Collection<String> items){
            if (this.volumesInUse == null) {this.volumesInUse = new ArrayList<String>();}
            for (String item : items) {this.volumesInUse.add(item);} return (A)this;
    }

    public A removeFromVolumesInUse(String... items){
            for (String item : items) {if (this.volumesInUse!= null){ this.volumesInUse.remove(item);}} return (A)this;
    }

    public A removeAllFromVolumesInUse(Collection<String> items){
            for (String item : items) {if (this.volumesInUse!= null){ this.volumesInUse.remove(item);}} return (A)this;
    }

    public List<String> getVolumesInUse(){
            return this.volumesInUse;
    }

    public String getVolumesInUse(int index){
            return this.volumesInUse.get(index);
    }

    public String getFirstVolumesInUse(){
            return this.volumesInUse.get(0);
    }

    public String getLastVolumesInUse(){
            return this.volumesInUse.get(volumesInUse.size() - 1);
    }

    public String getMatchingVolumesInUse(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: volumesInUse) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withVolumesInUse(List<String> volumesInUse){
            if (this.volumesInUse != null) { _visitables.removeAll(this.volumesInUse);}
            if (volumesInUse != null) {this.volumesInUse = new ArrayList<String>(); for (String item : volumesInUse){this.addToVolumesInUse(item);}} else { this.volumesInUse = new ArrayList<String>();} return (A) this;
    }

    public A withVolumesInUse(String... volumesInUse){
            if (this.volumesInUse != null) {this.volumesInUse.clear();}
            if (volumesInUse != null) {for (String item :volumesInUse){ this.addToVolumesInUse(item);}} return (A) this;
    }

    public Boolean hasVolumesInUse(){
            return volumesInUse != null && !volumesInUse.isEmpty();
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NodeStatusFluentImpl that = (NodeStatusFluentImpl) o;
            if (addresses != null ? !addresses.equals(that.addresses) :that.addresses != null) return false;
            if (allocatable != null ? !allocatable.equals(that.allocatable) :that.allocatable != null) return false;
            if (capacity != null ? !capacity.equals(that.capacity) :that.capacity != null) return false;
            if (conditions != null ? !conditions.equals(that.conditions) :that.conditions != null) return false;
            if (config != null ? !config.equals(that.config) :that.config != null) return false;
            if (daemonEndpoints != null ? !daemonEndpoints.equals(that.daemonEndpoints) :that.daemonEndpoints != null) return false;
            if (images != null ? !images.equals(that.images) :that.images != null) return false;
            if (nodeInfo != null ? !nodeInfo.equals(that.nodeInfo) :that.nodeInfo != null) return false;
            if (phase != null ? !phase.equals(that.phase) :that.phase != null) return false;
            if (volumesAttached != null ? !volumesAttached.equals(that.volumesAttached) :that.volumesAttached != null) return false;
            if (volumesInUse != null ? !volumesInUse.equals(that.volumesInUse) :that.volumesInUse != null) return false;
            return true;
    }


    public class AddressesNestedImpl<N> extends NodeAddressFluentImpl<NodeStatusFluent.AddressesNested<N>> implements NodeStatusFluent.AddressesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NodeAddressBuilder builder;
        private final int index;
    
            AddressesNestedImpl(int index,NodeAddress item){
                    this.index = index;
                    this.builder = new NodeAddressBuilder(this, item);
            }
            AddressesNestedImpl(){
                    this.index = -1;
                    this.builder = new NodeAddressBuilder(this);
            }
    
    public N and(){
            return (N) NodeStatusFluentImpl.this.setToAddresses(index, builder.build());
    }
    public N endAddress(){
            return and();
    }

}
    public class ConditionsNestedImpl<N> extends NodeConditionFluentImpl<NodeStatusFluent.ConditionsNested<N>> implements NodeStatusFluent.ConditionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NodeConditionBuilder builder;
        private final int index;
    
            ConditionsNestedImpl(int index,NodeCondition item){
                    this.index = index;
                    this.builder = new NodeConditionBuilder(this, item);
            }
            ConditionsNestedImpl(){
                    this.index = -1;
                    this.builder = new NodeConditionBuilder(this);
            }
    
    public N and(){
            return (N) NodeStatusFluentImpl.this.setToConditions(index, builder.build());
    }
    public N endCondition(){
            return and();
    }

}
    public class ConfigNestedImpl<N> extends NodeConfigStatusFluentImpl<NodeStatusFluent.ConfigNested<N>> implements NodeStatusFluent.ConfigNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NodeConfigStatusBuilder builder;
    
            ConfigNestedImpl(NodeConfigStatus item){
                    this.builder = new NodeConfigStatusBuilder(this, item);
            }
            ConfigNestedImpl(){
                    this.builder = new NodeConfigStatusBuilder(this);
            }
    
    public N and(){
            return (N) NodeStatusFluentImpl.this.withConfig(builder.build());
    }
    public N endConfig(){
            return and();
    }

}
    public class DaemonEndpointsNestedImpl<N> extends NodeDaemonEndpointsFluentImpl<NodeStatusFluent.DaemonEndpointsNested<N>> implements NodeStatusFluent.DaemonEndpointsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NodeDaemonEndpointsBuilder builder;
    
            DaemonEndpointsNestedImpl(NodeDaemonEndpoints item){
                    this.builder = new NodeDaemonEndpointsBuilder(this, item);
            }
            DaemonEndpointsNestedImpl(){
                    this.builder = new NodeDaemonEndpointsBuilder(this);
            }
    
    public N and(){
            return (N) NodeStatusFluentImpl.this.withDaemonEndpoints(builder.build());
    }
    public N endDaemonEndpoints(){
            return and();
    }

}
    public class ImagesNestedImpl<N> extends ContainerImageFluentImpl<NodeStatusFluent.ImagesNested<N>> implements NodeStatusFluent.ImagesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ContainerImageBuilder builder;
        private final int index;
    
            ImagesNestedImpl(int index,ContainerImage item){
                    this.index = index;
                    this.builder = new ContainerImageBuilder(this, item);
            }
            ImagesNestedImpl(){
                    this.index = -1;
                    this.builder = new ContainerImageBuilder(this);
            }
    
    public N and(){
            return (N) NodeStatusFluentImpl.this.setToImages(index, builder.build());
    }
    public N endImage(){
            return and();
    }

}
    public class NodeInfoNestedImpl<N> extends NodeSystemInfoFluentImpl<NodeStatusFluent.NodeInfoNested<N>> implements NodeStatusFluent.NodeInfoNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NodeSystemInfoBuilder builder;
    
            NodeInfoNestedImpl(NodeSystemInfo item){
                    this.builder = new NodeSystemInfoBuilder(this, item);
            }
            NodeInfoNestedImpl(){
                    this.builder = new NodeSystemInfoBuilder(this);
            }
    
    public N and(){
            return (N) NodeStatusFluentImpl.this.withNodeInfo(builder.build());
    }
    public N endNodeInfo(){
            return and();
    }

}
    public class VolumesAttachedNestedImpl<N> extends AttachedVolumeFluentImpl<NodeStatusFluent.VolumesAttachedNested<N>> implements NodeStatusFluent.VolumesAttachedNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final AttachedVolumeBuilder builder;
        private final int index;
    
            VolumesAttachedNestedImpl(int index,AttachedVolume item){
                    this.index = index;
                    this.builder = new AttachedVolumeBuilder(this, item);
            }
            VolumesAttachedNestedImpl(){
                    this.index = -1;
                    this.builder = new AttachedVolumeBuilder(this);
            }
    
    public N and(){
            return (N) NodeStatusFluentImpl.this.setToVolumesAttached(index, builder.build());
    }
    public N endVolumesAttached(){
            return and();
    }

}


}
