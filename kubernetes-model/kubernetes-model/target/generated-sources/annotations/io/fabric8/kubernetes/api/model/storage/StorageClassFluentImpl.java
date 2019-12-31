package io.fabric8.kubernetes.api.model.storage;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.TopologySelectorTerm;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.util.LinkedHashMap;
import io.fabric8.kubernetes.api.model.TopologySelectorTermFluentImpl;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.model.TopologySelectorTermBuilder;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectMetaFluentImpl;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public class StorageClassFluentImpl<A extends StorageClassFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements StorageClassFluent<A>{

    private Boolean allowVolumeExpansion;
    private List<TopologySelectorTermBuilder> allowedTopologies;
    private String apiVersion;
    private String kind;
    private ObjectMetaBuilder metadata;
    private List<String> mountOptions;
    private Map<String,String> parameters;
    private String provisioner;
    private String reclaimPolicy;
    private String volumeBindingMode;

    public StorageClassFluentImpl(){
    }
    public StorageClassFluentImpl(StorageClass instance){
            this.withAllowVolumeExpansion(instance.getAllowVolumeExpansion()); 
            this.withAllowedTopologies(instance.getAllowedTopologies()); 
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withMountOptions(instance.getMountOptions()); 
            this.withParameters(instance.getParameters()); 
            this.withProvisioner(instance.getProvisioner()); 
            this.withReclaimPolicy(instance.getReclaimPolicy()); 
            this.withVolumeBindingMode(instance.getVolumeBindingMode()); 
    }

    public Boolean isAllowVolumeExpansion(){
            return this.allowVolumeExpansion;
    }

    public A withAllowVolumeExpansion(Boolean allowVolumeExpansion){
            this.allowVolumeExpansion=allowVolumeExpansion; return (A) this;
    }

    public Boolean hasAllowVolumeExpansion(){
            return this.allowVolumeExpansion != null;
    }

    public A withNewAllowVolumeExpansion(String arg1){
            return (A)withAllowVolumeExpansion(new Boolean(arg1));
    }

    public A withNewAllowVolumeExpansion(boolean arg1){
            return (A)withAllowVolumeExpansion(new Boolean(arg1));
    }

    public A addToAllowedTopologies(int index,TopologySelectorTerm item){
            if (this.allowedTopologies == null) {this.allowedTopologies = new ArrayList<TopologySelectorTermBuilder>();}
            TopologySelectorTermBuilder builder = new TopologySelectorTermBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.allowedTopologies.add(index >= 0 ? index : allowedTopologies.size(), builder); return (A)this;
    }

    public A setToAllowedTopologies(int index,TopologySelectorTerm item){
            if (this.allowedTopologies == null) {this.allowedTopologies = new ArrayList<TopologySelectorTermBuilder>();}
            TopologySelectorTermBuilder builder = new TopologySelectorTermBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= allowedTopologies.size()) { allowedTopologies.add(builder); } else { allowedTopologies.set(index, builder);}
             return (A)this;
    }

    public A addToAllowedTopologies(TopologySelectorTerm... items){
            if (this.allowedTopologies == null) {this.allowedTopologies = new ArrayList<TopologySelectorTermBuilder>();}
            for (TopologySelectorTerm item : items) {TopologySelectorTermBuilder builder = new TopologySelectorTermBuilder(item);_visitables.add(builder);this.allowedTopologies.add(builder);} return (A)this;
    }

    public A addAllToAllowedTopologies(Collection<TopologySelectorTerm> items){
            if (this.allowedTopologies == null) {this.allowedTopologies = new ArrayList<TopologySelectorTermBuilder>();}
            for (TopologySelectorTerm item : items) {TopologySelectorTermBuilder builder = new TopologySelectorTermBuilder(item);_visitables.add(builder);this.allowedTopologies.add(builder);} return (A)this;
    }

    public A removeFromAllowedTopologies(TopologySelectorTerm... items){
            for (TopologySelectorTerm item : items) {TopologySelectorTermBuilder builder = new TopologySelectorTermBuilder(item);_visitables.remove(builder);if (this.allowedTopologies != null) {this.allowedTopologies.remove(builder);}} return (A)this;
    }

    public A removeAllFromAllowedTopologies(Collection<TopologySelectorTerm> items){
            for (TopologySelectorTerm item : items) {TopologySelectorTermBuilder builder = new TopologySelectorTermBuilder(item);_visitables.remove(builder);if (this.allowedTopologies != null) {this.allowedTopologies.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildAllowedTopologies instead.
 * @return The buildable object.
 */
@Deprecated public List<TopologySelectorTerm> getAllowedTopologies(){
            return build(allowedTopologies);
    }

    public List<TopologySelectorTerm> buildAllowedTopologies(){
            return build(allowedTopologies);
    }

    public TopologySelectorTerm buildAllowedTopology(int index){
            return this.allowedTopologies.get(index).build();
    }

    public TopologySelectorTerm buildFirstAllowedTopology(){
            return this.allowedTopologies.get(0).build();
    }

    public TopologySelectorTerm buildLastAllowedTopology(){
            return this.allowedTopologies.get(allowedTopologies.size() - 1).build();
    }

    public TopologySelectorTerm buildMatchingAllowedTopology(io.fabric8.kubernetes.api.builder.Predicate<TopologySelectorTermBuilder> predicate){
            for (TopologySelectorTermBuilder item: allowedTopologies) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withAllowedTopologies(List<TopologySelectorTerm> allowedTopologies){
            if (this.allowedTopologies != null) { _visitables.removeAll(this.allowedTopologies);}
            if (allowedTopologies != null) {this.allowedTopologies = new ArrayList<TopologySelectorTermBuilder>(); for (TopologySelectorTerm item : allowedTopologies){this.addToAllowedTopologies(item);}} else { this.allowedTopologies = new ArrayList<TopologySelectorTermBuilder>();} return (A) this;
    }

    public A withAllowedTopologies(TopologySelectorTerm... allowedTopologies){
            if (this.allowedTopologies != null) {this.allowedTopologies.clear();}
            if (allowedTopologies != null) {for (TopologySelectorTerm item :allowedTopologies){ this.addToAllowedTopologies(item);}} return (A) this;
    }

    public Boolean hasAllowedTopologies(){
            return allowedTopologies != null && !allowedTopologies.isEmpty();
    }

    public StorageClassFluent.AllowedTopologiesNested<A> addNewAllowedTopology(){
            return new AllowedTopologiesNestedImpl();
    }

    public StorageClassFluent.AllowedTopologiesNested<A> addNewAllowedTopologyLike(TopologySelectorTerm item){
            return new AllowedTopologiesNestedImpl(-1, item);
    }

    public StorageClassFluent.AllowedTopologiesNested<A> setNewAllowedTopologyLike(int index,TopologySelectorTerm item){
            return new AllowedTopologiesNestedImpl(index, item);
    }

    public StorageClassFluent.AllowedTopologiesNested<A> editAllowedTopology(int index){
            if (allowedTopologies.size() <= index) throw new RuntimeException("Can't edit allowedTopologies. Index exceeds size.");
            return setNewAllowedTopologyLike(index, buildAllowedTopology(index));
    }

    public StorageClassFluent.AllowedTopologiesNested<A> editFirstAllowedTopology(){
            if (allowedTopologies.size() == 0) throw new RuntimeException("Can't edit first allowedTopologies. The list is empty.");
            return setNewAllowedTopologyLike(0, buildAllowedTopology(0));
    }

    public StorageClassFluent.AllowedTopologiesNested<A> editLastAllowedTopology(){
            int index = allowedTopologies.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last allowedTopologies. The list is empty.");
            return setNewAllowedTopologyLike(index, buildAllowedTopology(index));
    }

    public StorageClassFluent.AllowedTopologiesNested<A> editMatchingAllowedTopology(io.fabric8.kubernetes.api.builder.Predicate<TopologySelectorTermBuilder> predicate){
            int index = -1;
            for (int i=0;i<allowedTopologies.size();i++) { 
            if (predicate.apply(allowedTopologies.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching allowedTopologies. No match found.");
            return setNewAllowedTopologyLike(index, buildAllowedTopology(index));
    }

    public String getApiVersion(){
            return this.apiVersion;
    }

    public A withApiVersion(String apiVersion){
            this.apiVersion=apiVersion; return (A) this;
    }

    public Boolean hasApiVersion(){
            return this.apiVersion != null;
    }

    public String getKind(){
            return this.kind;
    }

    public A withKind(String kind){
            this.kind=kind; return (A) this;
    }

    public Boolean hasKind(){
            return this.kind != null;
    }

    
/**
 * This method has been deprecated, please use method buildMetadata instead.
 * @return The buildable object.
 */
@Deprecated public ObjectMeta getMetadata(){
            return this.metadata!=null?this.metadata.build():null;
    }

    public ObjectMeta buildMetadata(){
            return this.metadata!=null?this.metadata.build():null;
    }

    public A withMetadata(ObjectMeta metadata){
            _visitables.remove(this.metadata);
            if (metadata!=null){ this.metadata= new ObjectMetaBuilder(metadata); _visitables.add(this.metadata);} return (A) this;
    }

    public Boolean hasMetadata(){
            return this.metadata != null;
    }

    public StorageClassFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public StorageClassFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public StorageClassFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public StorageClassFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public StorageClassFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
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

    public A addToParameters(String key,String value){
            if(this.parameters == null && key != null && value != null) { this.parameters = new LinkedHashMap<String,String>(); }
            if(key != null && value != null) {this.parameters.put(key, value);} return (A)this;
    }

    public A addToParameters(Map<String,String> map){
            if(this.parameters == null && map != null) { this.parameters = new LinkedHashMap<String,String>(); }
            if(map != null) { this.parameters.putAll(map);} return (A)this;
    }

    public A removeFromParameters(String key){
            if(this.parameters == null) { return (A) this; }
            if(key != null && this.parameters != null) {this.parameters.remove(key);} return (A)this;
    }

    public A removeFromParameters(Map<String,String> map){
            if(this.parameters == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.parameters != null){this.parameters.remove(key);}}} return (A)this;
    }

    public Map<String,String> getParameters(){
            return this.parameters;
    }

    public A withParameters(Map<String,String> parameters){
            if (parameters == null) { this.parameters =  new LinkedHashMap<String,String>();} else {this.parameters = new LinkedHashMap<String,String>(parameters);} return (A) this;
    }

    public Boolean hasParameters(){
            return this.parameters != null;
    }

    public String getProvisioner(){
            return this.provisioner;
    }

    public A withProvisioner(String provisioner){
            this.provisioner=provisioner; return (A) this;
    }

    public Boolean hasProvisioner(){
            return this.provisioner != null;
    }

    public String getReclaimPolicy(){
            return this.reclaimPolicy;
    }

    public A withReclaimPolicy(String reclaimPolicy){
            this.reclaimPolicy=reclaimPolicy; return (A) this;
    }

    public Boolean hasReclaimPolicy(){
            return this.reclaimPolicy != null;
    }

    public String getVolumeBindingMode(){
            return this.volumeBindingMode;
    }

    public A withVolumeBindingMode(String volumeBindingMode){
            this.volumeBindingMode=volumeBindingMode; return (A) this;
    }

    public Boolean hasVolumeBindingMode(){
            return this.volumeBindingMode != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            StorageClassFluentImpl that = (StorageClassFluentImpl) o;
            if (allowVolumeExpansion != null ? !allowVolumeExpansion.equals(that.allowVolumeExpansion) :that.allowVolumeExpansion != null) return false;
            if (allowedTopologies != null ? !allowedTopologies.equals(that.allowedTopologies) :that.allowedTopologies != null) return false;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (mountOptions != null ? !mountOptions.equals(that.mountOptions) :that.mountOptions != null) return false;
            if (parameters != null ? !parameters.equals(that.parameters) :that.parameters != null) return false;
            if (provisioner != null ? !provisioner.equals(that.provisioner) :that.provisioner != null) return false;
            if (reclaimPolicy != null ? !reclaimPolicy.equals(that.reclaimPolicy) :that.reclaimPolicy != null) return false;
            if (volumeBindingMode != null ? !volumeBindingMode.equals(that.volumeBindingMode) :that.volumeBindingMode != null) return false;
            return true;
    }


    public class AllowedTopologiesNestedImpl<N> extends TopologySelectorTermFluentImpl<StorageClassFluent.AllowedTopologiesNested<N>> implements StorageClassFluent.AllowedTopologiesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TopologySelectorTermBuilder builder;
        private final int index;
    
            AllowedTopologiesNestedImpl(int index,TopologySelectorTerm item){
                    this.index = index;
                    this.builder = new TopologySelectorTermBuilder(this, item);
            }
            AllowedTopologiesNestedImpl(){
                    this.index = -1;
                    this.builder = new TopologySelectorTermBuilder(this);
            }
    
    public N and(){
            return (N) StorageClassFluentImpl.this.setToAllowedTopologies(index, builder.build());
    }
    public N endAllowedTopology(){
            return and();
    }

}
    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<StorageClassFluent.MetadataNested<N>> implements StorageClassFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) StorageClassFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}


}
