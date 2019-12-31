package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.util.LinkedHashMap;
import java.lang.Deprecated;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.builder.Fluent;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public interface NodeStatusFluent<A extends NodeStatusFluent<A>> extends Fluent<A>{


    public A addToAddresses(int index,NodeAddress item);
    public A setToAddresses(int index,NodeAddress item);
    public A addToAddresses(NodeAddress... items);
    public A addAllToAddresses(Collection<NodeAddress> items);
    public A removeFromAddresses(NodeAddress... items);
    public A removeAllFromAddresses(Collection<NodeAddress> items);
    
/**
 * This method has been deprecated, please use method buildAddresses instead.
 * @return The buildable object.
 */
@Deprecated public List<NodeAddress> getAddresses();
    public List<NodeAddress> buildAddresses();
    public NodeAddress buildAddress(int index);
    public NodeAddress buildFirstAddress();
    public NodeAddress buildLastAddress();
    public NodeAddress buildMatchingAddress(io.fabric8.kubernetes.api.builder.Predicate<NodeAddressBuilder> predicate);
    public A withAddresses(List<NodeAddress> addresses);
    public A withAddresses(NodeAddress... addresses);
    public Boolean hasAddresses();
    public A addNewAddress(String address,String type);
    public NodeStatusFluent.AddressesNested<A> addNewAddress();
    public NodeStatusFluent.AddressesNested<A> addNewAddressLike(NodeAddress item);
    public NodeStatusFluent.AddressesNested<A> setNewAddressLike(int index,NodeAddress item);
    public NodeStatusFluent.AddressesNested<A> editAddress(int index);
    public NodeStatusFluent.AddressesNested<A> editFirstAddress();
    public NodeStatusFluent.AddressesNested<A> editLastAddress();
    public NodeStatusFluent.AddressesNested<A> editMatchingAddress(io.fabric8.kubernetes.api.builder.Predicate<NodeAddressBuilder> predicate);
    public A addToAllocatable(String key,Quantity value);
    public A addToAllocatable(Map<String,Quantity> map);
    public A removeFromAllocatable(String key);
    public A removeFromAllocatable(Map<String,Quantity> map);
    public Map<String,Quantity> getAllocatable();
    public A withAllocatable(Map<String,Quantity> allocatable);
    public Boolean hasAllocatable();
    public A addToCapacity(String key,Quantity value);
    public A addToCapacity(Map<String,Quantity> map);
    public A removeFromCapacity(String key);
    public A removeFromCapacity(Map<String,Quantity> map);
    public Map<String,Quantity> getCapacity();
    public A withCapacity(Map<String,Quantity> capacity);
    public Boolean hasCapacity();
    public A addToConditions(int index,NodeCondition item);
    public A setToConditions(int index,NodeCondition item);
    public A addToConditions(NodeCondition... items);
    public A addAllToConditions(Collection<NodeCondition> items);
    public A removeFromConditions(NodeCondition... items);
    public A removeAllFromConditions(Collection<NodeCondition> items);
    
/**
 * This method has been deprecated, please use method buildConditions instead.
 * @return The buildable object.
 */
@Deprecated public List<NodeCondition> getConditions();
    public List<NodeCondition> buildConditions();
    public NodeCondition buildCondition(int index);
    public NodeCondition buildFirstCondition();
    public NodeCondition buildLastCondition();
    public NodeCondition buildMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<NodeConditionBuilder> predicate);
    public A withConditions(List<NodeCondition> conditions);
    public A withConditions(NodeCondition... conditions);
    public Boolean hasConditions();
    public NodeStatusFluent.ConditionsNested<A> addNewCondition();
    public NodeStatusFluent.ConditionsNested<A> addNewConditionLike(NodeCondition item);
    public NodeStatusFluent.ConditionsNested<A> setNewConditionLike(int index,NodeCondition item);
    public NodeStatusFluent.ConditionsNested<A> editCondition(int index);
    public NodeStatusFluent.ConditionsNested<A> editFirstCondition();
    public NodeStatusFluent.ConditionsNested<A> editLastCondition();
    public NodeStatusFluent.ConditionsNested<A> editMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<NodeConditionBuilder> predicate);
    
/**
 * This method has been deprecated, please use method buildConfig instead.
 * @return The buildable object.
 */
@Deprecated public NodeConfigStatus getConfig();
    public NodeConfigStatus buildConfig();
    public A withConfig(NodeConfigStatus config);
    public Boolean hasConfig();
    public NodeStatusFluent.ConfigNested<A> withNewConfig();
    public NodeStatusFluent.ConfigNested<A> withNewConfigLike(NodeConfigStatus item);
    public NodeStatusFluent.ConfigNested<A> editConfig();
    public NodeStatusFluent.ConfigNested<A> editOrNewConfig();
    public NodeStatusFluent.ConfigNested<A> editOrNewConfigLike(NodeConfigStatus item);
    
/**
 * This method has been deprecated, please use method buildDaemonEndpoints instead.
 * @return The buildable object.
 */
@Deprecated public NodeDaemonEndpoints getDaemonEndpoints();
    public NodeDaemonEndpoints buildDaemonEndpoints();
    public A withDaemonEndpoints(NodeDaemonEndpoints daemonEndpoints);
    public Boolean hasDaemonEndpoints();
    public NodeStatusFluent.DaemonEndpointsNested<A> withNewDaemonEndpoints();
    public NodeStatusFluent.DaemonEndpointsNested<A> withNewDaemonEndpointsLike(NodeDaemonEndpoints item);
    public NodeStatusFluent.DaemonEndpointsNested<A> editDaemonEndpoints();
    public NodeStatusFluent.DaemonEndpointsNested<A> editOrNewDaemonEndpoints();
    public NodeStatusFluent.DaemonEndpointsNested<A> editOrNewDaemonEndpointsLike(NodeDaemonEndpoints item);
    public A addToImages(int index,ContainerImage item);
    public A setToImages(int index,ContainerImage item);
    public A addToImages(ContainerImage... items);
    public A addAllToImages(Collection<ContainerImage> items);
    public A removeFromImages(ContainerImage... items);
    public A removeAllFromImages(Collection<ContainerImage> items);
    
/**
 * This method has been deprecated, please use method buildImages instead.
 * @return The buildable object.
 */
@Deprecated public List<ContainerImage> getImages();
    public List<ContainerImage> buildImages();
    public ContainerImage buildImage(int index);
    public ContainerImage buildFirstImage();
    public ContainerImage buildLastImage();
    public ContainerImage buildMatchingImage(io.fabric8.kubernetes.api.builder.Predicate<ContainerImageBuilder> predicate);
    public A withImages(List<ContainerImage> images);
    public A withImages(ContainerImage... images);
    public Boolean hasImages();
    public NodeStatusFluent.ImagesNested<A> addNewImage();
    public NodeStatusFluent.ImagesNested<A> addNewImageLike(ContainerImage item);
    public NodeStatusFluent.ImagesNested<A> setNewImageLike(int index,ContainerImage item);
    public NodeStatusFluent.ImagesNested<A> editImage(int index);
    public NodeStatusFluent.ImagesNested<A> editFirstImage();
    public NodeStatusFluent.ImagesNested<A> editLastImage();
    public NodeStatusFluent.ImagesNested<A> editMatchingImage(io.fabric8.kubernetes.api.builder.Predicate<ContainerImageBuilder> predicate);
    
/**
 * This method has been deprecated, please use method buildNodeInfo instead.
 * @return The buildable object.
 */
@Deprecated public NodeSystemInfo getNodeInfo();
    public NodeSystemInfo buildNodeInfo();
    public A withNodeInfo(NodeSystemInfo nodeInfo);
    public Boolean hasNodeInfo();
    public NodeStatusFluent.NodeInfoNested<A> withNewNodeInfo();
    public NodeStatusFluent.NodeInfoNested<A> withNewNodeInfoLike(NodeSystemInfo item);
    public NodeStatusFluent.NodeInfoNested<A> editNodeInfo();
    public NodeStatusFluent.NodeInfoNested<A> editOrNewNodeInfo();
    public NodeStatusFluent.NodeInfoNested<A> editOrNewNodeInfoLike(NodeSystemInfo item);
    public String getPhase();
    public A withPhase(String phase);
    public Boolean hasPhase();
    public A addToVolumesAttached(int index,AttachedVolume item);
    public A setToVolumesAttached(int index,AttachedVolume item);
    public A addToVolumesAttached(AttachedVolume... items);
    public A addAllToVolumesAttached(Collection<AttachedVolume> items);
    public A removeFromVolumesAttached(AttachedVolume... items);
    public A removeAllFromVolumesAttached(Collection<AttachedVolume> items);
    
/**
 * This method has been deprecated, please use method buildVolumesAttached instead.
 * @return The buildable object.
 */
@Deprecated public List<AttachedVolume> getVolumesAttached();
    public List<AttachedVolume> buildVolumesAttached();
    public AttachedVolume buildVolumesAttached(int index);
    public AttachedVolume buildFirstVolumesAttached();
    public AttachedVolume buildLastVolumesAttached();
    public AttachedVolume buildMatchingVolumesAttached(io.fabric8.kubernetes.api.builder.Predicate<AttachedVolumeBuilder> predicate);
    public A withVolumesAttached(List<AttachedVolume> volumesAttached);
    public A withVolumesAttached(AttachedVolume... volumesAttached);
    public Boolean hasVolumesAttached();
    public A addNewVolumesAttached(String devicePath,String name);
    public NodeStatusFluent.VolumesAttachedNested<A> addNewVolumesAttached();
    public NodeStatusFluent.VolumesAttachedNested<A> addNewVolumesAttachedLike(AttachedVolume item);
    public NodeStatusFluent.VolumesAttachedNested<A> setNewVolumesAttachedLike(int index,AttachedVolume item);
    public NodeStatusFluent.VolumesAttachedNested<A> editVolumesAttached(int index);
    public NodeStatusFluent.VolumesAttachedNested<A> editFirstVolumesAttached();
    public NodeStatusFluent.VolumesAttachedNested<A> editLastVolumesAttached();
    public NodeStatusFluent.VolumesAttachedNested<A> editMatchingVolumesAttached(io.fabric8.kubernetes.api.builder.Predicate<AttachedVolumeBuilder> predicate);
    public A addToVolumesInUse(int index,String item);
    public A setToVolumesInUse(int index,String item);
    public A addToVolumesInUse(String... items);
    public A addAllToVolumesInUse(Collection<String> items);
    public A removeFromVolumesInUse(String... items);
    public A removeAllFromVolumesInUse(Collection<String> items);
    public List<String> getVolumesInUse();
    public String getVolumesInUse(int index);
    public String getFirstVolumesInUse();
    public String getLastVolumesInUse();
    public String getMatchingVolumesInUse(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withVolumesInUse(List<String> volumesInUse);
    public A withVolumesInUse(String... volumesInUse);
    public Boolean hasVolumesInUse();

    public interface AddressesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeAddressFluent<NodeStatusFluent.AddressesNested<N>>{

        
    public N and();    public N endAddress();
}
    public interface ConditionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeConditionFluent<NodeStatusFluent.ConditionsNested<N>>{

        
    public N and();    public N endCondition();
}
    public interface ConfigNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeConfigStatusFluent<NodeStatusFluent.ConfigNested<N>>{

        
    public N and();    public N endConfig();
}
    public interface DaemonEndpointsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeDaemonEndpointsFluent<NodeStatusFluent.DaemonEndpointsNested<N>>{

        
    public N and();    public N endDaemonEndpoints();
}
    public interface ImagesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ContainerImageFluent<NodeStatusFluent.ImagesNested<N>>{

        
    public N and();    public N endImage();
}
    public interface NodeInfoNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeSystemInfoFluent<NodeStatusFluent.NodeInfoNested<N>>{

        
    public N and();    public N endNodeInfo();
}
    public interface VolumesAttachedNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,AttachedVolumeFluent<NodeStatusFluent.VolumesAttachedNested<N>>{

        
    public N and();    public N endVolumesAttached();
}


}
