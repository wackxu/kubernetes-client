package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import javax.validation.Valid;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import io.fabric8.kubernetes.api.builder.Nested;
import javax.validation.constraints.NotNull;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectMetaFluentImpl;
import java.lang.Integer;

public class SecurityContextConstraintsFluentImpl<A extends SecurityContextConstraintsFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements SecurityContextConstraintsFluent<A>{

    private Boolean allowHostDirVolumePlugin;
    private Boolean allowHostIPC;
    private Boolean allowHostNetwork;
    private Boolean allowHostPID;
    private Boolean allowHostPorts;
    private Boolean allowPrivilegeEscalation;
    private Boolean allowPrivilegedContainer;
    private List<String> allowedCapabilities;
    private List<io.fabric8.openshift.api.model.AllowedFlexVolumeBuilder> allowedFlexVolumes;
    private List<String> allowedUnsafeSysctls;
    private String apiVersion;
    private List<String> defaultAddCapabilities;
    private Boolean defaultAllowPrivilegeEscalation;
    private List<String> forbiddenSysctls;
    private io.fabric8.openshift.api.model.FSGroupStrategyOptionsBuilder fsGroup;
    private List<String> groups;
    private String kind;
    private ObjectMetaBuilder metadata;
    private Integer priority;
    private Boolean readOnlyRootFilesystem;
    private List<String> requiredDropCapabilities;
    private RunAsUserStrategyOptionsBuilder runAsUser;
    private SELinuxContextStrategyOptionsBuilder seLinuxContext;
    private List<String> seccompProfiles;
    private io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptionsBuilder supplementalGroups;
    private List<String> users;
    private List<String> volumes;

    public SecurityContextConstraintsFluentImpl(){
    }
    public SecurityContextConstraintsFluentImpl(SecurityContextConstraints instance){
            this.withAllowHostDirVolumePlugin(instance.getAllowHostDirVolumePlugin()); 
            this.withAllowHostIPC(instance.getAllowHostIPC()); 
            this.withAllowHostNetwork(instance.getAllowHostNetwork()); 
            this.withAllowHostPID(instance.getAllowHostPID()); 
            this.withAllowHostPorts(instance.getAllowHostPorts()); 
            this.withAllowPrivilegeEscalation(instance.getAllowPrivilegeEscalation()); 
            this.withAllowPrivilegedContainer(instance.getAllowPrivilegedContainer()); 
            this.withAllowedCapabilities(instance.getAllowedCapabilities()); 
            this.withAllowedFlexVolumes(instance.getAllowedFlexVolumes()); 
            this.withAllowedUnsafeSysctls(instance.getAllowedUnsafeSysctls()); 
            this.withApiVersion(instance.getApiVersion()); 
            this.withDefaultAddCapabilities(instance.getDefaultAddCapabilities()); 
            this.withDefaultAllowPrivilegeEscalation(instance.getDefaultAllowPrivilegeEscalation()); 
            this.withForbiddenSysctls(instance.getForbiddenSysctls()); 
            this.withFsGroup(instance.getFsGroup()); 
            this.withGroups(instance.getGroups()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withPriority(instance.getPriority()); 
            this.withReadOnlyRootFilesystem(instance.getReadOnlyRootFilesystem()); 
            this.withRequiredDropCapabilities(instance.getRequiredDropCapabilities()); 
            this.withRunAsUser(instance.getRunAsUser()); 
            this.withSeLinuxContext(instance.getSeLinuxContext()); 
            this.withSeccompProfiles(instance.getSeccompProfiles()); 
            this.withSupplementalGroups(instance.getSupplementalGroups()); 
            this.withUsers(instance.getUsers()); 
            this.withVolumes(instance.getVolumes()); 
    }

    public Boolean isAllowHostDirVolumePlugin(){
            return this.allowHostDirVolumePlugin;
    }

    public A withAllowHostDirVolumePlugin(Boolean allowHostDirVolumePlugin){
            this.allowHostDirVolumePlugin=allowHostDirVolumePlugin; return (A) this;
    }

    public Boolean hasAllowHostDirVolumePlugin(){
            return this.allowHostDirVolumePlugin != null;
    }

    public A withNewAllowHostDirVolumePlugin(String arg1){
            return (A)withAllowHostDirVolumePlugin(new Boolean(arg1));
    }

    public A withNewAllowHostDirVolumePlugin(boolean arg1){
            return (A)withAllowHostDirVolumePlugin(new Boolean(arg1));
    }

    public Boolean isAllowHostIPC(){
            return this.allowHostIPC;
    }

    public A withAllowHostIPC(Boolean allowHostIPC){
            this.allowHostIPC=allowHostIPC; return (A) this;
    }

    public Boolean hasAllowHostIPC(){
            return this.allowHostIPC != null;
    }

    public A withNewAllowHostIPC(String arg1){
            return (A)withAllowHostIPC(new Boolean(arg1));
    }

    public A withNewAllowHostIPC(boolean arg1){
            return (A)withAllowHostIPC(new Boolean(arg1));
    }

    public Boolean isAllowHostNetwork(){
            return this.allowHostNetwork;
    }

    public A withAllowHostNetwork(Boolean allowHostNetwork){
            this.allowHostNetwork=allowHostNetwork; return (A) this;
    }

    public Boolean hasAllowHostNetwork(){
            return this.allowHostNetwork != null;
    }

    public A withNewAllowHostNetwork(String arg1){
            return (A)withAllowHostNetwork(new Boolean(arg1));
    }

    public A withNewAllowHostNetwork(boolean arg1){
            return (A)withAllowHostNetwork(new Boolean(arg1));
    }

    public Boolean isAllowHostPID(){
            return this.allowHostPID;
    }

    public A withAllowHostPID(Boolean allowHostPID){
            this.allowHostPID=allowHostPID; return (A) this;
    }

    public Boolean hasAllowHostPID(){
            return this.allowHostPID != null;
    }

    public A withNewAllowHostPID(String arg1){
            return (A)withAllowHostPID(new Boolean(arg1));
    }

    public A withNewAllowHostPID(boolean arg1){
            return (A)withAllowHostPID(new Boolean(arg1));
    }

    public Boolean isAllowHostPorts(){
            return this.allowHostPorts;
    }

    public A withAllowHostPorts(Boolean allowHostPorts){
            this.allowHostPorts=allowHostPorts; return (A) this;
    }

    public Boolean hasAllowHostPorts(){
            return this.allowHostPorts != null;
    }

    public A withNewAllowHostPorts(String arg1){
            return (A)withAllowHostPorts(new Boolean(arg1));
    }

    public A withNewAllowHostPorts(boolean arg1){
            return (A)withAllowHostPorts(new Boolean(arg1));
    }

    public Boolean isAllowPrivilegeEscalation(){
            return this.allowPrivilegeEscalation;
    }

    public A withAllowPrivilegeEscalation(Boolean allowPrivilegeEscalation){
            this.allowPrivilegeEscalation=allowPrivilegeEscalation; return (A) this;
    }

    public Boolean hasAllowPrivilegeEscalation(){
            return this.allowPrivilegeEscalation != null;
    }

    public A withNewAllowPrivilegeEscalation(String arg1){
            return (A)withAllowPrivilegeEscalation(new Boolean(arg1));
    }

    public A withNewAllowPrivilegeEscalation(boolean arg1){
            return (A)withAllowPrivilegeEscalation(new Boolean(arg1));
    }

    public Boolean isAllowPrivilegedContainer(){
            return this.allowPrivilegedContainer;
    }

    public A withAllowPrivilegedContainer(Boolean allowPrivilegedContainer){
            this.allowPrivilegedContainer=allowPrivilegedContainer; return (A) this;
    }

    public Boolean hasAllowPrivilegedContainer(){
            return this.allowPrivilegedContainer != null;
    }

    public A withNewAllowPrivilegedContainer(String arg1){
            return (A)withAllowPrivilegedContainer(new Boolean(arg1));
    }

    public A withNewAllowPrivilegedContainer(boolean arg1){
            return (A)withAllowPrivilegedContainer(new Boolean(arg1));
    }

    public A addToAllowedCapabilities(int index,String item){
            if (this.allowedCapabilities == null) {this.allowedCapabilities = new ArrayList<String>();}
            this.allowedCapabilities.add(index, item);
            return (A)this;
    }

    public A setToAllowedCapabilities(int index,String item){
            if (this.allowedCapabilities == null) {this.allowedCapabilities = new ArrayList<String>();}
            this.allowedCapabilities.set(index, item); return (A)this;
    }

    public A addToAllowedCapabilities(String... items){
            if (this.allowedCapabilities == null) {this.allowedCapabilities = new ArrayList<String>();}
            for (String item : items) {this.allowedCapabilities.add(item);} return (A)this;
    }

    public A addAllToAllowedCapabilities(Collection<String> items){
            if (this.allowedCapabilities == null) {this.allowedCapabilities = new ArrayList<String>();}
            for (String item : items) {this.allowedCapabilities.add(item);} return (A)this;
    }

    public A removeFromAllowedCapabilities(String... items){
            for (String item : items) {if (this.allowedCapabilities!= null){ this.allowedCapabilities.remove(item);}} return (A)this;
    }

    public A removeAllFromAllowedCapabilities(Collection<String> items){
            for (String item : items) {if (this.allowedCapabilities!= null){ this.allowedCapabilities.remove(item);}} return (A)this;
    }

    public List<String> getAllowedCapabilities(){
            return this.allowedCapabilities;
    }

    public String getAllowedCapability(int index){
            return this.allowedCapabilities.get(index);
    }

    public String getFirstAllowedCapability(){
            return this.allowedCapabilities.get(0);
    }

    public String getLastAllowedCapability(){
            return this.allowedCapabilities.get(allowedCapabilities.size() - 1);
    }

    public String getMatchingAllowedCapability(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: allowedCapabilities) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withAllowedCapabilities(List<String> allowedCapabilities){
            if (this.allowedCapabilities != null) { _visitables.removeAll(this.allowedCapabilities);}
            if (allowedCapabilities != null) {this.allowedCapabilities = new ArrayList<String>(); for (String item : allowedCapabilities){this.addToAllowedCapabilities(item);}} else { this.allowedCapabilities = new ArrayList<String>();} return (A) this;
    }

    public A withAllowedCapabilities(String... allowedCapabilities){
            if (this.allowedCapabilities != null) {this.allowedCapabilities.clear();}
            if (allowedCapabilities != null) {for (String item :allowedCapabilities){ this.addToAllowedCapabilities(item);}} return (A) this;
    }

    public Boolean hasAllowedCapabilities(){
            return allowedCapabilities != null && !allowedCapabilities.isEmpty();
    }

    public A addToAllowedFlexVolumes(int index,io.fabric8.openshift.api.model.AllowedFlexVolume item){
            if (this.allowedFlexVolumes == null) {this.allowedFlexVolumes = new ArrayList<io.fabric8.openshift.api.model.AllowedFlexVolumeBuilder>();}
            io.fabric8.openshift.api.model.AllowedFlexVolumeBuilder builder = new io.fabric8.openshift.api.model.AllowedFlexVolumeBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.allowedFlexVolumes.add(index >= 0 ? index : allowedFlexVolumes.size(), builder); return (A)this;
    }

    public A setToAllowedFlexVolumes(int index,io.fabric8.openshift.api.model.AllowedFlexVolume item){
            if (this.allowedFlexVolumes == null) {this.allowedFlexVolumes = new ArrayList<io.fabric8.openshift.api.model.AllowedFlexVolumeBuilder>();}
            io.fabric8.openshift.api.model.AllowedFlexVolumeBuilder builder = new io.fabric8.openshift.api.model.AllowedFlexVolumeBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= allowedFlexVolumes.size()) { allowedFlexVolumes.add(builder); } else { allowedFlexVolumes.set(index, builder);}
             return (A)this;
    }

    public A addToAllowedFlexVolumes(io.fabric8.openshift.api.model.AllowedFlexVolume... items){
            if (this.allowedFlexVolumes == null) {this.allowedFlexVolumes = new ArrayList<io.fabric8.openshift.api.model.AllowedFlexVolumeBuilder>();}
            for (io.fabric8.openshift.api.model.AllowedFlexVolume item : items) {io.fabric8.openshift.api.model.AllowedFlexVolumeBuilder builder = new io.fabric8.openshift.api.model.AllowedFlexVolumeBuilder(item);_visitables.add(builder);this.allowedFlexVolumes.add(builder);} return (A)this;
    }

    public A addAllToAllowedFlexVolumes(Collection<io.fabric8.openshift.api.model.AllowedFlexVolume> items){
            if (this.allowedFlexVolumes == null) {this.allowedFlexVolumes = new ArrayList<io.fabric8.openshift.api.model.AllowedFlexVolumeBuilder>();}
            for (io.fabric8.openshift.api.model.AllowedFlexVolume item : items) {io.fabric8.openshift.api.model.AllowedFlexVolumeBuilder builder = new io.fabric8.openshift.api.model.AllowedFlexVolumeBuilder(item);_visitables.add(builder);this.allowedFlexVolumes.add(builder);} return (A)this;
    }

    public A removeFromAllowedFlexVolumes(io.fabric8.openshift.api.model.AllowedFlexVolume... items){
            for (io.fabric8.openshift.api.model.AllowedFlexVolume item : items) {io.fabric8.openshift.api.model.AllowedFlexVolumeBuilder builder = new io.fabric8.openshift.api.model.AllowedFlexVolumeBuilder(item);_visitables.remove(builder);if (this.allowedFlexVolumes != null) {this.allowedFlexVolumes.remove(builder);}} return (A)this;
    }

    public A removeAllFromAllowedFlexVolumes(Collection<io.fabric8.openshift.api.model.AllowedFlexVolume> items){
            for (io.fabric8.openshift.api.model.AllowedFlexVolume item : items) {io.fabric8.openshift.api.model.AllowedFlexVolumeBuilder builder = new io.fabric8.openshift.api.model.AllowedFlexVolumeBuilder(item);_visitables.remove(builder);if (this.allowedFlexVolumes != null) {this.allowedFlexVolumes.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildAllowedFlexVolumes instead.
 * @return The buildable object.
 */
@Deprecated public List<io.fabric8.openshift.api.model.AllowedFlexVolume> getAllowedFlexVolumes(){
            return build(allowedFlexVolumes);
    }

    public List<io.fabric8.openshift.api.model.AllowedFlexVolume> buildAllowedFlexVolumes(){
            return build(allowedFlexVolumes);
    }

    public io.fabric8.openshift.api.model.AllowedFlexVolume buildAllowedFlexVolume(int index){
            return this.allowedFlexVolumes.get(index).build();
    }

    public io.fabric8.openshift.api.model.AllowedFlexVolume buildFirstAllowedFlexVolume(){
            return this.allowedFlexVolumes.get(0).build();
    }

    public io.fabric8.openshift.api.model.AllowedFlexVolume buildLastAllowedFlexVolume(){
            return this.allowedFlexVolumes.get(allowedFlexVolumes.size() - 1).build();
    }

    public io.fabric8.openshift.api.model.AllowedFlexVolume buildMatchingAllowedFlexVolume(io.fabric8.kubernetes.api.builder.Predicate<io.fabric8.openshift.api.model.AllowedFlexVolumeBuilder> predicate){
            for (io.fabric8.openshift.api.model.AllowedFlexVolumeBuilder item: allowedFlexVolumes) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withAllowedFlexVolumes(List<io.fabric8.openshift.api.model.AllowedFlexVolume> allowedFlexVolumes){
            if (this.allowedFlexVolumes != null) { _visitables.removeAll(this.allowedFlexVolumes);}
            if (allowedFlexVolumes != null) {this.allowedFlexVolumes = new ArrayList<io.fabric8.openshift.api.model.AllowedFlexVolumeBuilder>(); for (io.fabric8.openshift.api.model.AllowedFlexVolume item : allowedFlexVolumes){this.addToAllowedFlexVolumes(item);}} else { this.allowedFlexVolumes = new ArrayList<io.fabric8.openshift.api.model.AllowedFlexVolumeBuilder>();} return (A) this;
    }

    public A withAllowedFlexVolumes(io.fabric8.openshift.api.model.AllowedFlexVolume... allowedFlexVolumes){
            if (this.allowedFlexVolumes != null) {this.allowedFlexVolumes.clear();}
            if (allowedFlexVolumes != null) {for (io.fabric8.openshift.api.model.AllowedFlexVolume item :allowedFlexVolumes){ this.addToAllowedFlexVolumes(item);}} return (A) this;
    }

    public Boolean hasAllowedFlexVolumes(){
            return allowedFlexVolumes != null && !allowedFlexVolumes.isEmpty();
    }

    public A addNewAllowedFlexVolume(String driver){
            return (A)addToAllowedFlexVolumes(new AllowedFlexVolume(driver));
    }

    public SecurityContextConstraintsFluent.AllowedFlexVolumesNested<A> addNewAllowedFlexVolume(){
            return new AllowedFlexVolumesNestedImpl();
    }

    public SecurityContextConstraintsFluent.AllowedFlexVolumesNested<A> addNewAllowedFlexVolumeLike(io.fabric8.openshift.api.model.AllowedFlexVolume item){
            return new AllowedFlexVolumesNestedImpl(-1, item);
    }

    public SecurityContextConstraintsFluent.AllowedFlexVolumesNested<A> setNewAllowedFlexVolumeLike(int index,io.fabric8.openshift.api.model.AllowedFlexVolume item){
            return new AllowedFlexVolumesNestedImpl(index, item);
    }

    public SecurityContextConstraintsFluent.AllowedFlexVolumesNested<A> editAllowedFlexVolume(int index){
            if (allowedFlexVolumes.size() <= index) throw new RuntimeException("Can't edit allowedFlexVolumes. Index exceeds size.");
            return setNewAllowedFlexVolumeLike(index, buildAllowedFlexVolume(index));
    }

    public SecurityContextConstraintsFluent.AllowedFlexVolumesNested<A> editFirstAllowedFlexVolume(){
            if (allowedFlexVolumes.size() == 0) throw new RuntimeException("Can't edit first allowedFlexVolumes. The list is empty.");
            return setNewAllowedFlexVolumeLike(0, buildAllowedFlexVolume(0));
    }

    public SecurityContextConstraintsFluent.AllowedFlexVolumesNested<A> editLastAllowedFlexVolume(){
            int index = allowedFlexVolumes.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last allowedFlexVolumes. The list is empty.");
            return setNewAllowedFlexVolumeLike(index, buildAllowedFlexVolume(index));
    }

    public SecurityContextConstraintsFluent.AllowedFlexVolumesNested<A> editMatchingAllowedFlexVolume(io.fabric8.kubernetes.api.builder.Predicate<io.fabric8.openshift.api.model.AllowedFlexVolumeBuilder> predicate){
            int index = -1;
            for (int i=0;i<allowedFlexVolumes.size();i++) { 
            if (predicate.apply(allowedFlexVolumes.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching allowedFlexVolumes. No match found.");
            return setNewAllowedFlexVolumeLike(index, buildAllowedFlexVolume(index));
    }

    public A addToAllowedUnsafeSysctls(int index,String item){
            if (this.allowedUnsafeSysctls == null) {this.allowedUnsafeSysctls = new ArrayList<String>();}
            this.allowedUnsafeSysctls.add(index, item);
            return (A)this;
    }

    public A setToAllowedUnsafeSysctls(int index,String item){
            if (this.allowedUnsafeSysctls == null) {this.allowedUnsafeSysctls = new ArrayList<String>();}
            this.allowedUnsafeSysctls.set(index, item); return (A)this;
    }

    public A addToAllowedUnsafeSysctls(String... items){
            if (this.allowedUnsafeSysctls == null) {this.allowedUnsafeSysctls = new ArrayList<String>();}
            for (String item : items) {this.allowedUnsafeSysctls.add(item);} return (A)this;
    }

    public A addAllToAllowedUnsafeSysctls(Collection<String> items){
            if (this.allowedUnsafeSysctls == null) {this.allowedUnsafeSysctls = new ArrayList<String>();}
            for (String item : items) {this.allowedUnsafeSysctls.add(item);} return (A)this;
    }

    public A removeFromAllowedUnsafeSysctls(String... items){
            for (String item : items) {if (this.allowedUnsafeSysctls!= null){ this.allowedUnsafeSysctls.remove(item);}} return (A)this;
    }

    public A removeAllFromAllowedUnsafeSysctls(Collection<String> items){
            for (String item : items) {if (this.allowedUnsafeSysctls!= null){ this.allowedUnsafeSysctls.remove(item);}} return (A)this;
    }

    public List<String> getAllowedUnsafeSysctls(){
            return this.allowedUnsafeSysctls;
    }

    public String getAllowedUnsafeSysctl(int index){
            return this.allowedUnsafeSysctls.get(index);
    }

    public String getFirstAllowedUnsafeSysctl(){
            return this.allowedUnsafeSysctls.get(0);
    }

    public String getLastAllowedUnsafeSysctl(){
            return this.allowedUnsafeSysctls.get(allowedUnsafeSysctls.size() - 1);
    }

    public String getMatchingAllowedUnsafeSysctl(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: allowedUnsafeSysctls) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withAllowedUnsafeSysctls(List<String> allowedUnsafeSysctls){
            if (this.allowedUnsafeSysctls != null) { _visitables.removeAll(this.allowedUnsafeSysctls);}
            if (allowedUnsafeSysctls != null) {this.allowedUnsafeSysctls = new ArrayList<String>(); for (String item : allowedUnsafeSysctls){this.addToAllowedUnsafeSysctls(item);}} else { this.allowedUnsafeSysctls = new ArrayList<String>();} return (A) this;
    }

    public A withAllowedUnsafeSysctls(String... allowedUnsafeSysctls){
            if (this.allowedUnsafeSysctls != null) {this.allowedUnsafeSysctls.clear();}
            if (allowedUnsafeSysctls != null) {for (String item :allowedUnsafeSysctls){ this.addToAllowedUnsafeSysctls(item);}} return (A) this;
    }

    public Boolean hasAllowedUnsafeSysctls(){
            return allowedUnsafeSysctls != null && !allowedUnsafeSysctls.isEmpty();
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

    public A addToDefaultAddCapabilities(int index,String item){
            if (this.defaultAddCapabilities == null) {this.defaultAddCapabilities = new ArrayList<String>();}
            this.defaultAddCapabilities.add(index, item);
            return (A)this;
    }

    public A setToDefaultAddCapabilities(int index,String item){
            if (this.defaultAddCapabilities == null) {this.defaultAddCapabilities = new ArrayList<String>();}
            this.defaultAddCapabilities.set(index, item); return (A)this;
    }

    public A addToDefaultAddCapabilities(String... items){
            if (this.defaultAddCapabilities == null) {this.defaultAddCapabilities = new ArrayList<String>();}
            for (String item : items) {this.defaultAddCapabilities.add(item);} return (A)this;
    }

    public A addAllToDefaultAddCapabilities(Collection<String> items){
            if (this.defaultAddCapabilities == null) {this.defaultAddCapabilities = new ArrayList<String>();}
            for (String item : items) {this.defaultAddCapabilities.add(item);} return (A)this;
    }

    public A removeFromDefaultAddCapabilities(String... items){
            for (String item : items) {if (this.defaultAddCapabilities!= null){ this.defaultAddCapabilities.remove(item);}} return (A)this;
    }

    public A removeAllFromDefaultAddCapabilities(Collection<String> items){
            for (String item : items) {if (this.defaultAddCapabilities!= null){ this.defaultAddCapabilities.remove(item);}} return (A)this;
    }

    public List<String> getDefaultAddCapabilities(){
            return this.defaultAddCapabilities;
    }

    public String getDefaultAddCapability(int index){
            return this.defaultAddCapabilities.get(index);
    }

    public String getFirstDefaultAddCapability(){
            return this.defaultAddCapabilities.get(0);
    }

    public String getLastDefaultAddCapability(){
            return this.defaultAddCapabilities.get(defaultAddCapabilities.size() - 1);
    }

    public String getMatchingDefaultAddCapability(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: defaultAddCapabilities) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withDefaultAddCapabilities(List<String> defaultAddCapabilities){
            if (this.defaultAddCapabilities != null) { _visitables.removeAll(this.defaultAddCapabilities);}
            if (defaultAddCapabilities != null) {this.defaultAddCapabilities = new ArrayList<String>(); for (String item : defaultAddCapabilities){this.addToDefaultAddCapabilities(item);}} else { this.defaultAddCapabilities = new ArrayList<String>();} return (A) this;
    }

    public A withDefaultAddCapabilities(String... defaultAddCapabilities){
            if (this.defaultAddCapabilities != null) {this.defaultAddCapabilities.clear();}
            if (defaultAddCapabilities != null) {for (String item :defaultAddCapabilities){ this.addToDefaultAddCapabilities(item);}} return (A) this;
    }

    public Boolean hasDefaultAddCapabilities(){
            return defaultAddCapabilities != null && !defaultAddCapabilities.isEmpty();
    }

    public Boolean isDefaultAllowPrivilegeEscalation(){
            return this.defaultAllowPrivilegeEscalation;
    }

    public A withDefaultAllowPrivilegeEscalation(Boolean defaultAllowPrivilegeEscalation){
            this.defaultAllowPrivilegeEscalation=defaultAllowPrivilegeEscalation; return (A) this;
    }

    public Boolean hasDefaultAllowPrivilegeEscalation(){
            return this.defaultAllowPrivilegeEscalation != null;
    }

    public A withNewDefaultAllowPrivilegeEscalation(String arg1){
            return (A)withDefaultAllowPrivilegeEscalation(new Boolean(arg1));
    }

    public A withNewDefaultAllowPrivilegeEscalation(boolean arg1){
            return (A)withDefaultAllowPrivilegeEscalation(new Boolean(arg1));
    }

    public A addToForbiddenSysctls(int index,String item){
            if (this.forbiddenSysctls == null) {this.forbiddenSysctls = new ArrayList<String>();}
            this.forbiddenSysctls.add(index, item);
            return (A)this;
    }

    public A setToForbiddenSysctls(int index,String item){
            if (this.forbiddenSysctls == null) {this.forbiddenSysctls = new ArrayList<String>();}
            this.forbiddenSysctls.set(index, item); return (A)this;
    }

    public A addToForbiddenSysctls(String... items){
            if (this.forbiddenSysctls == null) {this.forbiddenSysctls = new ArrayList<String>();}
            for (String item : items) {this.forbiddenSysctls.add(item);} return (A)this;
    }

    public A addAllToForbiddenSysctls(Collection<String> items){
            if (this.forbiddenSysctls == null) {this.forbiddenSysctls = new ArrayList<String>();}
            for (String item : items) {this.forbiddenSysctls.add(item);} return (A)this;
    }

    public A removeFromForbiddenSysctls(String... items){
            for (String item : items) {if (this.forbiddenSysctls!= null){ this.forbiddenSysctls.remove(item);}} return (A)this;
    }

    public A removeAllFromForbiddenSysctls(Collection<String> items){
            for (String item : items) {if (this.forbiddenSysctls!= null){ this.forbiddenSysctls.remove(item);}} return (A)this;
    }

    public List<String> getForbiddenSysctls(){
            return this.forbiddenSysctls;
    }

    public String getForbiddenSysctl(int index){
            return this.forbiddenSysctls.get(index);
    }

    public String getFirstForbiddenSysctl(){
            return this.forbiddenSysctls.get(0);
    }

    public String getLastForbiddenSysctl(){
            return this.forbiddenSysctls.get(forbiddenSysctls.size() - 1);
    }

    public String getMatchingForbiddenSysctl(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: forbiddenSysctls) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withForbiddenSysctls(List<String> forbiddenSysctls){
            if (this.forbiddenSysctls != null) { _visitables.removeAll(this.forbiddenSysctls);}
            if (forbiddenSysctls != null) {this.forbiddenSysctls = new ArrayList<String>(); for (String item : forbiddenSysctls){this.addToForbiddenSysctls(item);}} else { this.forbiddenSysctls = new ArrayList<String>();} return (A) this;
    }

    public A withForbiddenSysctls(String... forbiddenSysctls){
            if (this.forbiddenSysctls != null) {this.forbiddenSysctls.clear();}
            if (forbiddenSysctls != null) {for (String item :forbiddenSysctls){ this.addToForbiddenSysctls(item);}} return (A) this;
    }

    public Boolean hasForbiddenSysctls(){
            return forbiddenSysctls != null && !forbiddenSysctls.isEmpty();
    }

    
/**
 * This method has been deprecated, please use method buildFsGroup instead.
 * @return The buildable object.
 */
@Deprecated public io.fabric8.openshift.api.model.FSGroupStrategyOptions getFsGroup(){
            return this.fsGroup!=null?this.fsGroup.build():null;
    }

    public io.fabric8.openshift.api.model.FSGroupStrategyOptions buildFsGroup(){
            return this.fsGroup!=null?this.fsGroup.build():null;
    }

    public A withFsGroup(io.fabric8.openshift.api.model.FSGroupStrategyOptions fsGroup){
            _visitables.remove(this.fsGroup);
            if (fsGroup!=null){ this.fsGroup= new io.fabric8.openshift.api.model.FSGroupStrategyOptionsBuilder(fsGroup); _visitables.add(this.fsGroup);} return (A) this;
    }

    public Boolean hasFsGroup(){
            return this.fsGroup != null;
    }

    public SecurityContextConstraintsFluent.FsGroupNested<A> withNewFsGroup(){
            return new FsGroupNestedImpl();
    }

    public SecurityContextConstraintsFluent.FsGroupNested<A> withNewFsGroupLike(io.fabric8.openshift.api.model.FSGroupStrategyOptions item){
            return new FsGroupNestedImpl(item);
    }

    public SecurityContextConstraintsFluent.FsGroupNested<A> editFsGroup(){
            return withNewFsGroupLike(getFsGroup());
    }

    public SecurityContextConstraintsFluent.FsGroupNested<A> editOrNewFsGroup(){
            return withNewFsGroupLike(getFsGroup() != null ? getFsGroup(): new io.fabric8.openshift.api.model.FSGroupStrategyOptionsBuilder().build());
    }

    public SecurityContextConstraintsFluent.FsGroupNested<A> editOrNewFsGroupLike(io.fabric8.openshift.api.model.FSGroupStrategyOptions item){
            return withNewFsGroupLike(getFsGroup() != null ? getFsGroup(): item);
    }

    public A addToGroups(int index,String item){
            if (this.groups == null) {this.groups = new ArrayList<String>();}
            this.groups.add(index, item);
            return (A)this;
    }

    public A setToGroups(int index,String item){
            if (this.groups == null) {this.groups = new ArrayList<String>();}
            this.groups.set(index, item); return (A)this;
    }

    public A addToGroups(String... items){
            if (this.groups == null) {this.groups = new ArrayList<String>();}
            for (String item : items) {this.groups.add(item);} return (A)this;
    }

    public A addAllToGroups(Collection<String> items){
            if (this.groups == null) {this.groups = new ArrayList<String>();}
            for (String item : items) {this.groups.add(item);} return (A)this;
    }

    public A removeFromGroups(String... items){
            for (String item : items) {if (this.groups!= null){ this.groups.remove(item);}} return (A)this;
    }

    public A removeAllFromGroups(Collection<String> items){
            for (String item : items) {if (this.groups!= null){ this.groups.remove(item);}} return (A)this;
    }

    public List<String> getGroups(){
            return this.groups;
    }

    public String getGroup(int index){
            return this.groups.get(index);
    }

    public String getFirstGroup(){
            return this.groups.get(0);
    }

    public String getLastGroup(){
            return this.groups.get(groups.size() - 1);
    }

    public String getMatchingGroup(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: groups) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withGroups(List<String> groups){
            if (this.groups != null) { _visitables.removeAll(this.groups);}
            if (groups != null) {this.groups = new ArrayList<String>(); for (String item : groups){this.addToGroups(item);}} else { this.groups = new ArrayList<String>();} return (A) this;
    }

    public A withGroups(String... groups){
            if (this.groups != null) {this.groups.clear();}
            if (groups != null) {for (String item :groups){ this.addToGroups(item);}} return (A) this;
    }

    public Boolean hasGroups(){
            return groups != null && !groups.isEmpty();
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

    public SecurityContextConstraintsFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public SecurityContextConstraintsFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public SecurityContextConstraintsFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public SecurityContextConstraintsFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public SecurityContextConstraintsFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    public Integer getPriority(){
            return this.priority;
    }

    public A withPriority(Integer priority){
            this.priority=priority; return (A) this;
    }

    public Boolean hasPriority(){
            return this.priority != null;
    }

    public Boolean isReadOnlyRootFilesystem(){
            return this.readOnlyRootFilesystem;
    }

    public A withReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem){
            this.readOnlyRootFilesystem=readOnlyRootFilesystem; return (A) this;
    }

    public Boolean hasReadOnlyRootFilesystem(){
            return this.readOnlyRootFilesystem != null;
    }

    public A withNewReadOnlyRootFilesystem(String arg1){
            return (A)withReadOnlyRootFilesystem(new Boolean(arg1));
    }

    public A withNewReadOnlyRootFilesystem(boolean arg1){
            return (A)withReadOnlyRootFilesystem(new Boolean(arg1));
    }

    public A addToRequiredDropCapabilities(int index,String item){
            if (this.requiredDropCapabilities == null) {this.requiredDropCapabilities = new ArrayList<String>();}
            this.requiredDropCapabilities.add(index, item);
            return (A)this;
    }

    public A setToRequiredDropCapabilities(int index,String item){
            if (this.requiredDropCapabilities == null) {this.requiredDropCapabilities = new ArrayList<String>();}
            this.requiredDropCapabilities.set(index, item); return (A)this;
    }

    public A addToRequiredDropCapabilities(String... items){
            if (this.requiredDropCapabilities == null) {this.requiredDropCapabilities = new ArrayList<String>();}
            for (String item : items) {this.requiredDropCapabilities.add(item);} return (A)this;
    }

    public A addAllToRequiredDropCapabilities(Collection<String> items){
            if (this.requiredDropCapabilities == null) {this.requiredDropCapabilities = new ArrayList<String>();}
            for (String item : items) {this.requiredDropCapabilities.add(item);} return (A)this;
    }

    public A removeFromRequiredDropCapabilities(String... items){
            for (String item : items) {if (this.requiredDropCapabilities!= null){ this.requiredDropCapabilities.remove(item);}} return (A)this;
    }

    public A removeAllFromRequiredDropCapabilities(Collection<String> items){
            for (String item : items) {if (this.requiredDropCapabilities!= null){ this.requiredDropCapabilities.remove(item);}} return (A)this;
    }

    public List<String> getRequiredDropCapabilities(){
            return this.requiredDropCapabilities;
    }

    public String getRequiredDropCapability(int index){
            return this.requiredDropCapabilities.get(index);
    }

    public String getFirstRequiredDropCapability(){
            return this.requiredDropCapabilities.get(0);
    }

    public String getLastRequiredDropCapability(){
            return this.requiredDropCapabilities.get(requiredDropCapabilities.size() - 1);
    }

    public String getMatchingRequiredDropCapability(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: requiredDropCapabilities) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withRequiredDropCapabilities(List<String> requiredDropCapabilities){
            if (this.requiredDropCapabilities != null) { _visitables.removeAll(this.requiredDropCapabilities);}
            if (requiredDropCapabilities != null) {this.requiredDropCapabilities = new ArrayList<String>(); for (String item : requiredDropCapabilities){this.addToRequiredDropCapabilities(item);}} else { this.requiredDropCapabilities = new ArrayList<String>();} return (A) this;
    }

    public A withRequiredDropCapabilities(String... requiredDropCapabilities){
            if (this.requiredDropCapabilities != null) {this.requiredDropCapabilities.clear();}
            if (requiredDropCapabilities != null) {for (String item :requiredDropCapabilities){ this.addToRequiredDropCapabilities(item);}} return (A) this;
    }

    public Boolean hasRequiredDropCapabilities(){
            return requiredDropCapabilities != null && !requiredDropCapabilities.isEmpty();
    }

    
/**
 * This method has been deprecated, please use method buildRunAsUser instead.
 * @return The buildable object.
 */
@Deprecated public RunAsUserStrategyOptions getRunAsUser(){
            return this.runAsUser!=null?this.runAsUser.build():null;
    }

    public RunAsUserStrategyOptions buildRunAsUser(){
            return this.runAsUser!=null?this.runAsUser.build():null;
    }

    public A withRunAsUser(RunAsUserStrategyOptions runAsUser){
            _visitables.remove(this.runAsUser);
            if (runAsUser!=null){ this.runAsUser= new RunAsUserStrategyOptionsBuilder(runAsUser); _visitables.add(this.runAsUser);} return (A) this;
    }

    public Boolean hasRunAsUser(){
            return this.runAsUser != null;
    }

    public A withNewRunAsUser(String type,Long uid,Long uidRangeMax,Long uidRangeMin){
            return (A)withRunAsUser(new RunAsUserStrategyOptions(type, uid, uidRangeMax, uidRangeMin));
    }

    public SecurityContextConstraintsFluent.RunAsUserNested<A> withNewRunAsUser(){
            return new RunAsUserNestedImpl();
    }

    public SecurityContextConstraintsFluent.RunAsUserNested<A> withNewRunAsUserLike(RunAsUserStrategyOptions item){
            return new RunAsUserNestedImpl(item);
    }

    public SecurityContextConstraintsFluent.RunAsUserNested<A> editRunAsUser(){
            return withNewRunAsUserLike(getRunAsUser());
    }

    public SecurityContextConstraintsFluent.RunAsUserNested<A> editOrNewRunAsUser(){
            return withNewRunAsUserLike(getRunAsUser() != null ? getRunAsUser(): new RunAsUserStrategyOptionsBuilder().build());
    }

    public SecurityContextConstraintsFluent.RunAsUserNested<A> editOrNewRunAsUserLike(RunAsUserStrategyOptions item){
            return withNewRunAsUserLike(getRunAsUser() != null ? getRunAsUser(): item);
    }

    
/**
 * This method has been deprecated, please use method buildSeLinuxContext instead.
 * @return The buildable object.
 */
@Deprecated public SELinuxContextStrategyOptions getSeLinuxContext(){
            return this.seLinuxContext!=null?this.seLinuxContext.build():null;
    }

    public SELinuxContextStrategyOptions buildSeLinuxContext(){
            return this.seLinuxContext!=null?this.seLinuxContext.build():null;
    }

    public A withSeLinuxContext(SELinuxContextStrategyOptions seLinuxContext){
            _visitables.remove(this.seLinuxContext);
            if (seLinuxContext!=null){ this.seLinuxContext= new SELinuxContextStrategyOptionsBuilder(seLinuxContext); _visitables.add(this.seLinuxContext);} return (A) this;
    }

    public Boolean hasSeLinuxContext(){
            return this.seLinuxContext != null;
    }

    public SecurityContextConstraintsFluent.SeLinuxContextNested<A> withNewSeLinuxContext(){
            return new SeLinuxContextNestedImpl();
    }

    public SecurityContextConstraintsFluent.SeLinuxContextNested<A> withNewSeLinuxContextLike(SELinuxContextStrategyOptions item){
            return new SeLinuxContextNestedImpl(item);
    }

    public SecurityContextConstraintsFluent.SeLinuxContextNested<A> editSeLinuxContext(){
            return withNewSeLinuxContextLike(getSeLinuxContext());
    }

    public SecurityContextConstraintsFluent.SeLinuxContextNested<A> editOrNewSeLinuxContext(){
            return withNewSeLinuxContextLike(getSeLinuxContext() != null ? getSeLinuxContext(): new SELinuxContextStrategyOptionsBuilder().build());
    }

    public SecurityContextConstraintsFluent.SeLinuxContextNested<A> editOrNewSeLinuxContextLike(SELinuxContextStrategyOptions item){
            return withNewSeLinuxContextLike(getSeLinuxContext() != null ? getSeLinuxContext(): item);
    }

    public A addToSeccompProfiles(int index,String item){
            if (this.seccompProfiles == null) {this.seccompProfiles = new ArrayList<String>();}
            this.seccompProfiles.add(index, item);
            return (A)this;
    }

    public A setToSeccompProfiles(int index,String item){
            if (this.seccompProfiles == null) {this.seccompProfiles = new ArrayList<String>();}
            this.seccompProfiles.set(index, item); return (A)this;
    }

    public A addToSeccompProfiles(String... items){
            if (this.seccompProfiles == null) {this.seccompProfiles = new ArrayList<String>();}
            for (String item : items) {this.seccompProfiles.add(item);} return (A)this;
    }

    public A addAllToSeccompProfiles(Collection<String> items){
            if (this.seccompProfiles == null) {this.seccompProfiles = new ArrayList<String>();}
            for (String item : items) {this.seccompProfiles.add(item);} return (A)this;
    }

    public A removeFromSeccompProfiles(String... items){
            for (String item : items) {if (this.seccompProfiles!= null){ this.seccompProfiles.remove(item);}} return (A)this;
    }

    public A removeAllFromSeccompProfiles(Collection<String> items){
            for (String item : items) {if (this.seccompProfiles!= null){ this.seccompProfiles.remove(item);}} return (A)this;
    }

    public List<String> getSeccompProfiles(){
            return this.seccompProfiles;
    }

    public String getSeccompProfile(int index){
            return this.seccompProfiles.get(index);
    }

    public String getFirstSeccompProfile(){
            return this.seccompProfiles.get(0);
    }

    public String getLastSeccompProfile(){
            return this.seccompProfiles.get(seccompProfiles.size() - 1);
    }

    public String getMatchingSeccompProfile(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: seccompProfiles) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withSeccompProfiles(List<String> seccompProfiles){
            if (this.seccompProfiles != null) { _visitables.removeAll(this.seccompProfiles);}
            if (seccompProfiles != null) {this.seccompProfiles = new ArrayList<String>(); for (String item : seccompProfiles){this.addToSeccompProfiles(item);}} else { this.seccompProfiles = new ArrayList<String>();} return (A) this;
    }

    public A withSeccompProfiles(String... seccompProfiles){
            if (this.seccompProfiles != null) {this.seccompProfiles.clear();}
            if (seccompProfiles != null) {for (String item :seccompProfiles){ this.addToSeccompProfiles(item);}} return (A) this;
    }

    public Boolean hasSeccompProfiles(){
            return seccompProfiles != null && !seccompProfiles.isEmpty();
    }

    
/**
 * This method has been deprecated, please use method buildSupplementalGroups instead.
 * @return The buildable object.
 */
@Deprecated public io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions getSupplementalGroups(){
            return this.supplementalGroups!=null?this.supplementalGroups.build():null;
    }

    public io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions buildSupplementalGroups(){
            return this.supplementalGroups!=null?this.supplementalGroups.build():null;
    }

    public A withSupplementalGroups(io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions supplementalGroups){
            _visitables.remove(this.supplementalGroups);
            if (supplementalGroups!=null){ this.supplementalGroups= new io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptionsBuilder(supplementalGroups); _visitables.add(this.supplementalGroups);} return (A) this;
    }

    public Boolean hasSupplementalGroups(){
            return this.supplementalGroups != null;
    }

    public SecurityContextConstraintsFluent.SupplementalGroupsNested<A> withNewSupplementalGroups(){
            return new SupplementalGroupsNestedImpl();
    }

    public SecurityContextConstraintsFluent.SupplementalGroupsNested<A> withNewSupplementalGroupsLike(io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions item){
            return new SupplementalGroupsNestedImpl(item);
    }

    public SecurityContextConstraintsFluent.SupplementalGroupsNested<A> editSupplementalGroups(){
            return withNewSupplementalGroupsLike(getSupplementalGroups());
    }

    public SecurityContextConstraintsFluent.SupplementalGroupsNested<A> editOrNewSupplementalGroups(){
            return withNewSupplementalGroupsLike(getSupplementalGroups() != null ? getSupplementalGroups(): new io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptionsBuilder().build());
    }

    public SecurityContextConstraintsFluent.SupplementalGroupsNested<A> editOrNewSupplementalGroupsLike(io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions item){
            return withNewSupplementalGroupsLike(getSupplementalGroups() != null ? getSupplementalGroups(): item);
    }

    public A addToUsers(int index,String item){
            if (this.users == null) {this.users = new ArrayList<String>();}
            this.users.add(index, item);
            return (A)this;
    }

    public A setToUsers(int index,String item){
            if (this.users == null) {this.users = new ArrayList<String>();}
            this.users.set(index, item); return (A)this;
    }

    public A addToUsers(String... items){
            if (this.users == null) {this.users = new ArrayList<String>();}
            for (String item : items) {this.users.add(item);} return (A)this;
    }

    public A addAllToUsers(Collection<String> items){
            if (this.users == null) {this.users = new ArrayList<String>();}
            for (String item : items) {this.users.add(item);} return (A)this;
    }

    public A removeFromUsers(String... items){
            for (String item : items) {if (this.users!= null){ this.users.remove(item);}} return (A)this;
    }

    public A removeAllFromUsers(Collection<String> items){
            for (String item : items) {if (this.users!= null){ this.users.remove(item);}} return (A)this;
    }

    public List<String> getUsers(){
            return this.users;
    }

    public String getUser(int index){
            return this.users.get(index);
    }

    public String getFirstUser(){
            return this.users.get(0);
    }

    public String getLastUser(){
            return this.users.get(users.size() - 1);
    }

    public String getMatchingUser(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: users) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withUsers(List<String> users){
            if (this.users != null) { _visitables.removeAll(this.users);}
            if (users != null) {this.users = new ArrayList<String>(); for (String item : users){this.addToUsers(item);}} else { this.users = new ArrayList<String>();} return (A) this;
    }

    public A withUsers(String... users){
            if (this.users != null) {this.users.clear();}
            if (users != null) {for (String item :users){ this.addToUsers(item);}} return (A) this;
    }

    public Boolean hasUsers(){
            return users != null && !users.isEmpty();
    }

    public A addToVolumes(int index,String item){
            if (this.volumes == null) {this.volumes = new ArrayList<String>();}
            this.volumes.add(index, item);
            return (A)this;
    }

    public A setToVolumes(int index,String item){
            if (this.volumes == null) {this.volumes = new ArrayList<String>();}
            this.volumes.set(index, item); return (A)this;
    }

    public A addToVolumes(String... items){
            if (this.volumes == null) {this.volumes = new ArrayList<String>();}
            for (String item : items) {this.volumes.add(item);} return (A)this;
    }

    public A addAllToVolumes(Collection<String> items){
            if (this.volumes == null) {this.volumes = new ArrayList<String>();}
            for (String item : items) {this.volumes.add(item);} return (A)this;
    }

    public A removeFromVolumes(String... items){
            for (String item : items) {if (this.volumes!= null){ this.volumes.remove(item);}} return (A)this;
    }

    public A removeAllFromVolumes(Collection<String> items){
            for (String item : items) {if (this.volumes!= null){ this.volumes.remove(item);}} return (A)this;
    }

    public List<String> getVolumes(){
            return this.volumes;
    }

    public String getVolume(int index){
            return this.volumes.get(index);
    }

    public String getFirstVolume(){
            return this.volumes.get(0);
    }

    public String getLastVolume(){
            return this.volumes.get(volumes.size() - 1);
    }

    public String getMatchingVolume(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: volumes) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withVolumes(List<String> volumes){
            if (this.volumes != null) { _visitables.removeAll(this.volumes);}
            if (volumes != null) {this.volumes = new ArrayList<String>(); for (String item : volumes){this.addToVolumes(item);}} else { this.volumes = new ArrayList<String>();} return (A) this;
    }

    public A withVolumes(String... volumes){
            if (this.volumes != null) {this.volumes.clear();}
            if (volumes != null) {for (String item :volumes){ this.addToVolumes(item);}} return (A) this;
    }

    public Boolean hasVolumes(){
            return volumes != null && !volumes.isEmpty();
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SecurityContextConstraintsFluentImpl that = (SecurityContextConstraintsFluentImpl) o;
            if (allowHostDirVolumePlugin != null ? !allowHostDirVolumePlugin.equals(that.allowHostDirVolumePlugin) :that.allowHostDirVolumePlugin != null) return false;
            if (allowHostIPC != null ? !allowHostIPC.equals(that.allowHostIPC) :that.allowHostIPC != null) return false;
            if (allowHostNetwork != null ? !allowHostNetwork.equals(that.allowHostNetwork) :that.allowHostNetwork != null) return false;
            if (allowHostPID != null ? !allowHostPID.equals(that.allowHostPID) :that.allowHostPID != null) return false;
            if (allowHostPorts != null ? !allowHostPorts.equals(that.allowHostPorts) :that.allowHostPorts != null) return false;
            if (allowPrivilegeEscalation != null ? !allowPrivilegeEscalation.equals(that.allowPrivilegeEscalation) :that.allowPrivilegeEscalation != null) return false;
            if (allowPrivilegedContainer != null ? !allowPrivilegedContainer.equals(that.allowPrivilegedContainer) :that.allowPrivilegedContainer != null) return false;
            if (allowedCapabilities != null ? !allowedCapabilities.equals(that.allowedCapabilities) :that.allowedCapabilities != null) return false;
            if (allowedFlexVolumes != null ? !allowedFlexVolumes.equals(that.allowedFlexVolumes) :that.allowedFlexVolumes != null) return false;
            if (allowedUnsafeSysctls != null ? !allowedUnsafeSysctls.equals(that.allowedUnsafeSysctls) :that.allowedUnsafeSysctls != null) return false;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (defaultAddCapabilities != null ? !defaultAddCapabilities.equals(that.defaultAddCapabilities) :that.defaultAddCapabilities != null) return false;
            if (defaultAllowPrivilegeEscalation != null ? !defaultAllowPrivilegeEscalation.equals(that.defaultAllowPrivilegeEscalation) :that.defaultAllowPrivilegeEscalation != null) return false;
            if (forbiddenSysctls != null ? !forbiddenSysctls.equals(that.forbiddenSysctls) :that.forbiddenSysctls != null) return false;
            if (fsGroup != null ? !fsGroup.equals(that.fsGroup) :that.fsGroup != null) return false;
            if (groups != null ? !groups.equals(that.groups) :that.groups != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (priority != null ? !priority.equals(that.priority) :that.priority != null) return false;
            if (readOnlyRootFilesystem != null ? !readOnlyRootFilesystem.equals(that.readOnlyRootFilesystem) :that.readOnlyRootFilesystem != null) return false;
            if (requiredDropCapabilities != null ? !requiredDropCapabilities.equals(that.requiredDropCapabilities) :that.requiredDropCapabilities != null) return false;
            if (runAsUser != null ? !runAsUser.equals(that.runAsUser) :that.runAsUser != null) return false;
            if (seLinuxContext != null ? !seLinuxContext.equals(that.seLinuxContext) :that.seLinuxContext != null) return false;
            if (seccompProfiles != null ? !seccompProfiles.equals(that.seccompProfiles) :that.seccompProfiles != null) return false;
            if (supplementalGroups != null ? !supplementalGroups.equals(that.supplementalGroups) :that.supplementalGroups != null) return false;
            if (users != null ? !users.equals(that.users) :that.users != null) return false;
            if (volumes != null ? !volumes.equals(that.volumes) :that.volumes != null) return false;
            return true;
    }


    public class AllowedFlexVolumesNestedImpl<N> extends io.fabric8.openshift.api.model.AllowedFlexVolumeFluentImpl<SecurityContextConstraintsFluent.AllowedFlexVolumesNested<N>> implements SecurityContextConstraintsFluent.AllowedFlexVolumesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final io.fabric8.openshift.api.model.AllowedFlexVolumeBuilder builder;
        private final int index;
    
            AllowedFlexVolumesNestedImpl(int index,io.fabric8.openshift.api.model.AllowedFlexVolume item){
                    this.index = index;
                    this.builder = new io.fabric8.openshift.api.model.AllowedFlexVolumeBuilder(this, item);
            }
            AllowedFlexVolumesNestedImpl(){
                    this.index = -1;
                    this.builder = new io.fabric8.openshift.api.model.AllowedFlexVolumeBuilder(this);
            }
    
    public N and(){
            return (N) SecurityContextConstraintsFluentImpl.this.setToAllowedFlexVolumes(index, builder.build());
    }
    public N endAllowedFlexVolume(){
            return and();
    }

}
    public class FsGroupNestedImpl<N> extends io.fabric8.openshift.api.model.FSGroupStrategyOptionsFluentImpl<SecurityContextConstraintsFluent.FsGroupNested<N>> implements SecurityContextConstraintsFluent.FsGroupNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final io.fabric8.openshift.api.model.FSGroupStrategyOptionsBuilder builder;
    
            FsGroupNestedImpl(io.fabric8.openshift.api.model.FSGroupStrategyOptions item){
                    this.builder = new io.fabric8.openshift.api.model.FSGroupStrategyOptionsBuilder(this, item);
            }
            FsGroupNestedImpl(){
                    this.builder = new io.fabric8.openshift.api.model.FSGroupStrategyOptionsBuilder(this);
            }
    
    public N and(){
            return (N) SecurityContextConstraintsFluentImpl.this.withFsGroup(builder.build());
    }
    public N endFsGroup(){
            return and();
    }

}
    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<SecurityContextConstraintsFluent.MetadataNested<N>> implements SecurityContextConstraintsFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) SecurityContextConstraintsFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}
    public class RunAsUserNestedImpl<N> extends RunAsUserStrategyOptionsFluentImpl<SecurityContextConstraintsFluent.RunAsUserNested<N>> implements SecurityContextConstraintsFluent.RunAsUserNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RunAsUserStrategyOptionsBuilder builder;
    
            RunAsUserNestedImpl(RunAsUserStrategyOptions item){
                    this.builder = new RunAsUserStrategyOptionsBuilder(this, item);
            }
            RunAsUserNestedImpl(){
                    this.builder = new RunAsUserStrategyOptionsBuilder(this);
            }
    
    public N and(){
            return (N) SecurityContextConstraintsFluentImpl.this.withRunAsUser(builder.build());
    }
    public N endRunAsUser(){
            return and();
    }

}
    public class SeLinuxContextNestedImpl<N> extends SELinuxContextStrategyOptionsFluentImpl<SecurityContextConstraintsFluent.SeLinuxContextNested<N>> implements SecurityContextConstraintsFluent.SeLinuxContextNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SELinuxContextStrategyOptionsBuilder builder;
    
            SeLinuxContextNestedImpl(SELinuxContextStrategyOptions item){
                    this.builder = new SELinuxContextStrategyOptionsBuilder(this, item);
            }
            SeLinuxContextNestedImpl(){
                    this.builder = new SELinuxContextStrategyOptionsBuilder(this);
            }
    
    public N and(){
            return (N) SecurityContextConstraintsFluentImpl.this.withSeLinuxContext(builder.build());
    }
    public N endSeLinuxContext(){
            return and();
    }

}
    public class SupplementalGroupsNestedImpl<N> extends io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptionsFluentImpl<SecurityContextConstraintsFluent.SupplementalGroupsNested<N>> implements SecurityContextConstraintsFluent.SupplementalGroupsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptionsBuilder builder;
    
            SupplementalGroupsNestedImpl(io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions item){
                    this.builder = new io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptionsBuilder(this, item);
            }
            SupplementalGroupsNestedImpl(){
                    this.builder = new io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptionsBuilder(this);
            }
    
    public N and(){
            return (N) SecurityContextConstraintsFluentImpl.this.withSupplementalGroups(builder.build());
    }
    public N endSupplementalGroups(){
            return and();
    }

}


}
