package io.fabric8.kubernetes.api.model.extensions;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.Deprecated;
import java.lang.Integer;

public class PodSecurityPolicySpecFluentImpl<A extends PodSecurityPolicySpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements PodSecurityPolicySpecFluent<A>{

    private Boolean allowPrivilegeEscalation;
    private List<String> allowedCapabilities;
    private List<AllowedFlexVolumeBuilder> allowedFlexVolumes;
    private List<AllowedHostPathBuilder> allowedHostPaths;
    private List<String> allowedProcMountTypes;
    private List<String> allowedUnsafeSysctls;
    private List<String> defaultAddCapabilities;
    private Boolean defaultAllowPrivilegeEscalation;
    private List<String> forbiddenSysctls;
    private FSGroupStrategyOptionsBuilder fsGroup;
    private Boolean hostIPC;
    private Boolean hostNetwork;
    private Boolean hostPID;
    private List<HostPortRangeBuilder> hostPorts;
    private Boolean privileged;
    private Boolean readOnlyRootFilesystem;
    private List<String> requiredDropCapabilities;
    private RunAsGroupStrategyOptionsBuilder runAsGroup;
    private KubernetesRunAsUserStrategyOptionsBuilder runAsUser;
    private SELinuxStrategyOptionsBuilder seLinux;
    private SupplementalGroupsStrategyOptionsBuilder supplementalGroups;
    private List<String> volumes;

    public PodSecurityPolicySpecFluentImpl(){
    }
    public PodSecurityPolicySpecFluentImpl(PodSecurityPolicySpec instance){
            this.withAllowPrivilegeEscalation(instance.getAllowPrivilegeEscalation()); 
            this.withAllowedCapabilities(instance.getAllowedCapabilities()); 
            this.withAllowedFlexVolumes(instance.getAllowedFlexVolumes()); 
            this.withAllowedHostPaths(instance.getAllowedHostPaths()); 
            this.withAllowedProcMountTypes(instance.getAllowedProcMountTypes()); 
            this.withAllowedUnsafeSysctls(instance.getAllowedUnsafeSysctls()); 
            this.withDefaultAddCapabilities(instance.getDefaultAddCapabilities()); 
            this.withDefaultAllowPrivilegeEscalation(instance.getDefaultAllowPrivilegeEscalation()); 
            this.withForbiddenSysctls(instance.getForbiddenSysctls()); 
            this.withFsGroup(instance.getFsGroup()); 
            this.withHostIPC(instance.getHostIPC()); 
            this.withHostNetwork(instance.getHostNetwork()); 
            this.withHostPID(instance.getHostPID()); 
            this.withHostPorts(instance.getHostPorts()); 
            this.withPrivileged(instance.getPrivileged()); 
            this.withReadOnlyRootFilesystem(instance.getReadOnlyRootFilesystem()); 
            this.withRequiredDropCapabilities(instance.getRequiredDropCapabilities()); 
            this.withRunAsGroup(instance.getRunAsGroup()); 
            this.withRunAsUser(instance.getRunAsUser()); 
            this.withSeLinux(instance.getSeLinux()); 
            this.withSupplementalGroups(instance.getSupplementalGroups()); 
            this.withVolumes(instance.getVolumes()); 
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

    public A addToAllowedFlexVolumes(int index,AllowedFlexVolume item){
            if (this.allowedFlexVolumes == null) {this.allowedFlexVolumes = new ArrayList<AllowedFlexVolumeBuilder>();}
            AllowedFlexVolumeBuilder builder = new AllowedFlexVolumeBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.allowedFlexVolumes.add(index >= 0 ? index : allowedFlexVolumes.size(), builder); return (A)this;
    }

    public A setToAllowedFlexVolumes(int index,AllowedFlexVolume item){
            if (this.allowedFlexVolumes == null) {this.allowedFlexVolumes = new ArrayList<AllowedFlexVolumeBuilder>();}
            AllowedFlexVolumeBuilder builder = new AllowedFlexVolumeBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= allowedFlexVolumes.size()) { allowedFlexVolumes.add(builder); } else { allowedFlexVolumes.set(index, builder);}
             return (A)this;
    }

    public A addToAllowedFlexVolumes(AllowedFlexVolume... items){
            if (this.allowedFlexVolumes == null) {this.allowedFlexVolumes = new ArrayList<AllowedFlexVolumeBuilder>();}
            for (AllowedFlexVolume item : items) {AllowedFlexVolumeBuilder builder = new AllowedFlexVolumeBuilder(item);_visitables.add(builder);this.allowedFlexVolumes.add(builder);} return (A)this;
    }

    public A addAllToAllowedFlexVolumes(Collection<AllowedFlexVolume> items){
            if (this.allowedFlexVolumes == null) {this.allowedFlexVolumes = new ArrayList<AllowedFlexVolumeBuilder>();}
            for (AllowedFlexVolume item : items) {AllowedFlexVolumeBuilder builder = new AllowedFlexVolumeBuilder(item);_visitables.add(builder);this.allowedFlexVolumes.add(builder);} return (A)this;
    }

    public A removeFromAllowedFlexVolumes(AllowedFlexVolume... items){
            for (AllowedFlexVolume item : items) {AllowedFlexVolumeBuilder builder = new AllowedFlexVolumeBuilder(item);_visitables.remove(builder);if (this.allowedFlexVolumes != null) {this.allowedFlexVolumes.remove(builder);}} return (A)this;
    }

    public A removeAllFromAllowedFlexVolumes(Collection<AllowedFlexVolume> items){
            for (AllowedFlexVolume item : items) {AllowedFlexVolumeBuilder builder = new AllowedFlexVolumeBuilder(item);_visitables.remove(builder);if (this.allowedFlexVolumes != null) {this.allowedFlexVolumes.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildAllowedFlexVolumes instead.
 * @return The buildable object.
 */
@Deprecated public List<AllowedFlexVolume> getAllowedFlexVolumes(){
            return build(allowedFlexVolumes);
    }

    public List<AllowedFlexVolume> buildAllowedFlexVolumes(){
            return build(allowedFlexVolumes);
    }

    public AllowedFlexVolume buildAllowedFlexVolume(int index){
            return this.allowedFlexVolumes.get(index).build();
    }

    public AllowedFlexVolume buildFirstAllowedFlexVolume(){
            return this.allowedFlexVolumes.get(0).build();
    }

    public AllowedFlexVolume buildLastAllowedFlexVolume(){
            return this.allowedFlexVolumes.get(allowedFlexVolumes.size() - 1).build();
    }

    public AllowedFlexVolume buildMatchingAllowedFlexVolume(io.fabric8.kubernetes.api.builder.Predicate<AllowedFlexVolumeBuilder> predicate){
            for (AllowedFlexVolumeBuilder item: allowedFlexVolumes) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withAllowedFlexVolumes(List<AllowedFlexVolume> allowedFlexVolumes){
            if (this.allowedFlexVolumes != null) { _visitables.removeAll(this.allowedFlexVolumes);}
            if (allowedFlexVolumes != null) {this.allowedFlexVolumes = new ArrayList<AllowedFlexVolumeBuilder>(); for (AllowedFlexVolume item : allowedFlexVolumes){this.addToAllowedFlexVolumes(item);}} else { this.allowedFlexVolumes = new ArrayList<AllowedFlexVolumeBuilder>();} return (A) this;
    }

    public A withAllowedFlexVolumes(AllowedFlexVolume... allowedFlexVolumes){
            if (this.allowedFlexVolumes != null) {this.allowedFlexVolumes.clear();}
            if (allowedFlexVolumes != null) {for (AllowedFlexVolume item :allowedFlexVolumes){ this.addToAllowedFlexVolumes(item);}} return (A) this;
    }

    public Boolean hasAllowedFlexVolumes(){
            return allowedFlexVolumes != null && !allowedFlexVolumes.isEmpty();
    }

    public A addNewAllowedFlexVolume(String driver){
            return (A)addToAllowedFlexVolumes(new AllowedFlexVolume(driver));
    }

    public PodSecurityPolicySpecFluent.AllowedFlexVolumesNested<A> addNewAllowedFlexVolume(){
            return new AllowedFlexVolumesNestedImpl();
    }

    public PodSecurityPolicySpecFluent.AllowedFlexVolumesNested<A> addNewAllowedFlexVolumeLike(AllowedFlexVolume item){
            return new AllowedFlexVolumesNestedImpl(-1, item);
    }

    public PodSecurityPolicySpecFluent.AllowedFlexVolumesNested<A> setNewAllowedFlexVolumeLike(int index,AllowedFlexVolume item){
            return new AllowedFlexVolumesNestedImpl(index, item);
    }

    public PodSecurityPolicySpecFluent.AllowedFlexVolumesNested<A> editAllowedFlexVolume(int index){
            if (allowedFlexVolumes.size() <= index) throw new RuntimeException("Can't edit allowedFlexVolumes. Index exceeds size.");
            return setNewAllowedFlexVolumeLike(index, buildAllowedFlexVolume(index));
    }

    public PodSecurityPolicySpecFluent.AllowedFlexVolumesNested<A> editFirstAllowedFlexVolume(){
            if (allowedFlexVolumes.size() == 0) throw new RuntimeException("Can't edit first allowedFlexVolumes. The list is empty.");
            return setNewAllowedFlexVolumeLike(0, buildAllowedFlexVolume(0));
    }

    public PodSecurityPolicySpecFluent.AllowedFlexVolumesNested<A> editLastAllowedFlexVolume(){
            int index = allowedFlexVolumes.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last allowedFlexVolumes. The list is empty.");
            return setNewAllowedFlexVolumeLike(index, buildAllowedFlexVolume(index));
    }

    public PodSecurityPolicySpecFluent.AllowedFlexVolumesNested<A> editMatchingAllowedFlexVolume(io.fabric8.kubernetes.api.builder.Predicate<AllowedFlexVolumeBuilder> predicate){
            int index = -1;
            for (int i=0;i<allowedFlexVolumes.size();i++) { 
            if (predicate.apply(allowedFlexVolumes.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching allowedFlexVolumes. No match found.");
            return setNewAllowedFlexVolumeLike(index, buildAllowedFlexVolume(index));
    }

    public A addToAllowedHostPaths(int index,AllowedHostPath item){
            if (this.allowedHostPaths == null) {this.allowedHostPaths = new ArrayList<AllowedHostPathBuilder>();}
            AllowedHostPathBuilder builder = new AllowedHostPathBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.allowedHostPaths.add(index >= 0 ? index : allowedHostPaths.size(), builder); return (A)this;
    }

    public A setToAllowedHostPaths(int index,AllowedHostPath item){
            if (this.allowedHostPaths == null) {this.allowedHostPaths = new ArrayList<AllowedHostPathBuilder>();}
            AllowedHostPathBuilder builder = new AllowedHostPathBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= allowedHostPaths.size()) { allowedHostPaths.add(builder); } else { allowedHostPaths.set(index, builder);}
             return (A)this;
    }

    public A addToAllowedHostPaths(AllowedHostPath... items){
            if (this.allowedHostPaths == null) {this.allowedHostPaths = new ArrayList<AllowedHostPathBuilder>();}
            for (AllowedHostPath item : items) {AllowedHostPathBuilder builder = new AllowedHostPathBuilder(item);_visitables.add(builder);this.allowedHostPaths.add(builder);} return (A)this;
    }

    public A addAllToAllowedHostPaths(Collection<AllowedHostPath> items){
            if (this.allowedHostPaths == null) {this.allowedHostPaths = new ArrayList<AllowedHostPathBuilder>();}
            for (AllowedHostPath item : items) {AllowedHostPathBuilder builder = new AllowedHostPathBuilder(item);_visitables.add(builder);this.allowedHostPaths.add(builder);} return (A)this;
    }

    public A removeFromAllowedHostPaths(AllowedHostPath... items){
            for (AllowedHostPath item : items) {AllowedHostPathBuilder builder = new AllowedHostPathBuilder(item);_visitables.remove(builder);if (this.allowedHostPaths != null) {this.allowedHostPaths.remove(builder);}} return (A)this;
    }

    public A removeAllFromAllowedHostPaths(Collection<AllowedHostPath> items){
            for (AllowedHostPath item : items) {AllowedHostPathBuilder builder = new AllowedHostPathBuilder(item);_visitables.remove(builder);if (this.allowedHostPaths != null) {this.allowedHostPaths.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildAllowedHostPaths instead.
 * @return The buildable object.
 */
@Deprecated public List<AllowedHostPath> getAllowedHostPaths(){
            return build(allowedHostPaths);
    }

    public List<AllowedHostPath> buildAllowedHostPaths(){
            return build(allowedHostPaths);
    }

    public AllowedHostPath buildAllowedHostPath(int index){
            return this.allowedHostPaths.get(index).build();
    }

    public AllowedHostPath buildFirstAllowedHostPath(){
            return this.allowedHostPaths.get(0).build();
    }

    public AllowedHostPath buildLastAllowedHostPath(){
            return this.allowedHostPaths.get(allowedHostPaths.size() - 1).build();
    }

    public AllowedHostPath buildMatchingAllowedHostPath(io.fabric8.kubernetes.api.builder.Predicate<AllowedHostPathBuilder> predicate){
            for (AllowedHostPathBuilder item: allowedHostPaths) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withAllowedHostPaths(List<AllowedHostPath> allowedHostPaths){
            if (this.allowedHostPaths != null) { _visitables.removeAll(this.allowedHostPaths);}
            if (allowedHostPaths != null) {this.allowedHostPaths = new ArrayList<AllowedHostPathBuilder>(); for (AllowedHostPath item : allowedHostPaths){this.addToAllowedHostPaths(item);}} else { this.allowedHostPaths = new ArrayList<AllowedHostPathBuilder>();} return (A) this;
    }

    public A withAllowedHostPaths(AllowedHostPath... allowedHostPaths){
            if (this.allowedHostPaths != null) {this.allowedHostPaths.clear();}
            if (allowedHostPaths != null) {for (AllowedHostPath item :allowedHostPaths){ this.addToAllowedHostPaths(item);}} return (A) this;
    }

    public Boolean hasAllowedHostPaths(){
            return allowedHostPaths != null && !allowedHostPaths.isEmpty();
    }

    public A addNewAllowedHostPath(String pathPrefix,Boolean readOnly){
            return (A)addToAllowedHostPaths(new AllowedHostPath(pathPrefix, readOnly));
    }

    public PodSecurityPolicySpecFluent.AllowedHostPathsNested<A> addNewAllowedHostPath(){
            return new AllowedHostPathsNestedImpl();
    }

    public PodSecurityPolicySpecFluent.AllowedHostPathsNested<A> addNewAllowedHostPathLike(AllowedHostPath item){
            return new AllowedHostPathsNestedImpl(-1, item);
    }

    public PodSecurityPolicySpecFluent.AllowedHostPathsNested<A> setNewAllowedHostPathLike(int index,AllowedHostPath item){
            return new AllowedHostPathsNestedImpl(index, item);
    }

    public PodSecurityPolicySpecFluent.AllowedHostPathsNested<A> editAllowedHostPath(int index){
            if (allowedHostPaths.size() <= index) throw new RuntimeException("Can't edit allowedHostPaths. Index exceeds size.");
            return setNewAllowedHostPathLike(index, buildAllowedHostPath(index));
    }

    public PodSecurityPolicySpecFluent.AllowedHostPathsNested<A> editFirstAllowedHostPath(){
            if (allowedHostPaths.size() == 0) throw new RuntimeException("Can't edit first allowedHostPaths. The list is empty.");
            return setNewAllowedHostPathLike(0, buildAllowedHostPath(0));
    }

    public PodSecurityPolicySpecFluent.AllowedHostPathsNested<A> editLastAllowedHostPath(){
            int index = allowedHostPaths.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last allowedHostPaths. The list is empty.");
            return setNewAllowedHostPathLike(index, buildAllowedHostPath(index));
    }

    public PodSecurityPolicySpecFluent.AllowedHostPathsNested<A> editMatchingAllowedHostPath(io.fabric8.kubernetes.api.builder.Predicate<AllowedHostPathBuilder> predicate){
            int index = -1;
            for (int i=0;i<allowedHostPaths.size();i++) { 
            if (predicate.apply(allowedHostPaths.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching allowedHostPaths. No match found.");
            return setNewAllowedHostPathLike(index, buildAllowedHostPath(index));
    }

    public A addToAllowedProcMountTypes(int index,String item){
            if (this.allowedProcMountTypes == null) {this.allowedProcMountTypes = new ArrayList<String>();}
            this.allowedProcMountTypes.add(index, item);
            return (A)this;
    }

    public A setToAllowedProcMountTypes(int index,String item){
            if (this.allowedProcMountTypes == null) {this.allowedProcMountTypes = new ArrayList<String>();}
            this.allowedProcMountTypes.set(index, item); return (A)this;
    }

    public A addToAllowedProcMountTypes(String... items){
            if (this.allowedProcMountTypes == null) {this.allowedProcMountTypes = new ArrayList<String>();}
            for (String item : items) {this.allowedProcMountTypes.add(item);} return (A)this;
    }

    public A addAllToAllowedProcMountTypes(Collection<String> items){
            if (this.allowedProcMountTypes == null) {this.allowedProcMountTypes = new ArrayList<String>();}
            for (String item : items) {this.allowedProcMountTypes.add(item);} return (A)this;
    }

    public A removeFromAllowedProcMountTypes(String... items){
            for (String item : items) {if (this.allowedProcMountTypes!= null){ this.allowedProcMountTypes.remove(item);}} return (A)this;
    }

    public A removeAllFromAllowedProcMountTypes(Collection<String> items){
            for (String item : items) {if (this.allowedProcMountTypes!= null){ this.allowedProcMountTypes.remove(item);}} return (A)this;
    }

    public List<String> getAllowedProcMountTypes(){
            return this.allowedProcMountTypes;
    }

    public String getAllowedProcMountType(int index){
            return this.allowedProcMountTypes.get(index);
    }

    public String getFirstAllowedProcMountType(){
            return this.allowedProcMountTypes.get(0);
    }

    public String getLastAllowedProcMountType(){
            return this.allowedProcMountTypes.get(allowedProcMountTypes.size() - 1);
    }

    public String getMatchingAllowedProcMountType(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: allowedProcMountTypes) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withAllowedProcMountTypes(List<String> allowedProcMountTypes){
            if (this.allowedProcMountTypes != null) { _visitables.removeAll(this.allowedProcMountTypes);}
            if (allowedProcMountTypes != null) {this.allowedProcMountTypes = new ArrayList<String>(); for (String item : allowedProcMountTypes){this.addToAllowedProcMountTypes(item);}} else { this.allowedProcMountTypes = new ArrayList<String>();} return (A) this;
    }

    public A withAllowedProcMountTypes(String... allowedProcMountTypes){
            if (this.allowedProcMountTypes != null) {this.allowedProcMountTypes.clear();}
            if (allowedProcMountTypes != null) {for (String item :allowedProcMountTypes){ this.addToAllowedProcMountTypes(item);}} return (A) this;
    }

    public Boolean hasAllowedProcMountTypes(){
            return allowedProcMountTypes != null && !allowedProcMountTypes.isEmpty();
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
@Deprecated public FSGroupStrategyOptions getFsGroup(){
            return this.fsGroup!=null?this.fsGroup.build():null;
    }

    public FSGroupStrategyOptions buildFsGroup(){
            return this.fsGroup!=null?this.fsGroup.build():null;
    }

    public A withFsGroup(FSGroupStrategyOptions fsGroup){
            _visitables.remove(this.fsGroup);
            if (fsGroup!=null){ this.fsGroup= new FSGroupStrategyOptionsBuilder(fsGroup); _visitables.add(this.fsGroup);} return (A) this;
    }

    public Boolean hasFsGroup(){
            return this.fsGroup != null;
    }

    public PodSecurityPolicySpecFluent.FsGroupNested<A> withNewFsGroup(){
            return new FsGroupNestedImpl();
    }

    public PodSecurityPolicySpecFluent.FsGroupNested<A> withNewFsGroupLike(FSGroupStrategyOptions item){
            return new FsGroupNestedImpl(item);
    }

    public PodSecurityPolicySpecFluent.FsGroupNested<A> editFsGroup(){
            return withNewFsGroupLike(getFsGroup());
    }

    public PodSecurityPolicySpecFluent.FsGroupNested<A> editOrNewFsGroup(){
            return withNewFsGroupLike(getFsGroup() != null ? getFsGroup(): new FSGroupStrategyOptionsBuilder().build());
    }

    public PodSecurityPolicySpecFluent.FsGroupNested<A> editOrNewFsGroupLike(FSGroupStrategyOptions item){
            return withNewFsGroupLike(getFsGroup() != null ? getFsGroup(): item);
    }

    public Boolean isHostIPC(){
            return this.hostIPC;
    }

    public A withHostIPC(Boolean hostIPC){
            this.hostIPC=hostIPC; return (A) this;
    }

    public Boolean hasHostIPC(){
            return this.hostIPC != null;
    }

    public A withNewHostIPC(String arg1){
            return (A)withHostIPC(new Boolean(arg1));
    }

    public A withNewHostIPC(boolean arg1){
            return (A)withHostIPC(new Boolean(arg1));
    }

    public Boolean isHostNetwork(){
            return this.hostNetwork;
    }

    public A withHostNetwork(Boolean hostNetwork){
            this.hostNetwork=hostNetwork; return (A) this;
    }

    public Boolean hasHostNetwork(){
            return this.hostNetwork != null;
    }

    public A withNewHostNetwork(String arg1){
            return (A)withHostNetwork(new Boolean(arg1));
    }

    public A withNewHostNetwork(boolean arg1){
            return (A)withHostNetwork(new Boolean(arg1));
    }

    public Boolean isHostPID(){
            return this.hostPID;
    }

    public A withHostPID(Boolean hostPID){
            this.hostPID=hostPID; return (A) this;
    }

    public Boolean hasHostPID(){
            return this.hostPID != null;
    }

    public A withNewHostPID(String arg1){
            return (A)withHostPID(new Boolean(arg1));
    }

    public A withNewHostPID(boolean arg1){
            return (A)withHostPID(new Boolean(arg1));
    }

    public A addToHostPorts(int index,HostPortRange item){
            if (this.hostPorts == null) {this.hostPorts = new ArrayList<HostPortRangeBuilder>();}
            HostPortRangeBuilder builder = new HostPortRangeBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.hostPorts.add(index >= 0 ? index : hostPorts.size(), builder); return (A)this;
    }

    public A setToHostPorts(int index,HostPortRange item){
            if (this.hostPorts == null) {this.hostPorts = new ArrayList<HostPortRangeBuilder>();}
            HostPortRangeBuilder builder = new HostPortRangeBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= hostPorts.size()) { hostPorts.add(builder); } else { hostPorts.set(index, builder);}
             return (A)this;
    }

    public A addToHostPorts(HostPortRange... items){
            if (this.hostPorts == null) {this.hostPorts = new ArrayList<HostPortRangeBuilder>();}
            for (HostPortRange item : items) {HostPortRangeBuilder builder = new HostPortRangeBuilder(item);_visitables.add(builder);this.hostPorts.add(builder);} return (A)this;
    }

    public A addAllToHostPorts(Collection<HostPortRange> items){
            if (this.hostPorts == null) {this.hostPorts = new ArrayList<HostPortRangeBuilder>();}
            for (HostPortRange item : items) {HostPortRangeBuilder builder = new HostPortRangeBuilder(item);_visitables.add(builder);this.hostPorts.add(builder);} return (A)this;
    }

    public A removeFromHostPorts(HostPortRange... items){
            for (HostPortRange item : items) {HostPortRangeBuilder builder = new HostPortRangeBuilder(item);_visitables.remove(builder);if (this.hostPorts != null) {this.hostPorts.remove(builder);}} return (A)this;
    }

    public A removeAllFromHostPorts(Collection<HostPortRange> items){
            for (HostPortRange item : items) {HostPortRangeBuilder builder = new HostPortRangeBuilder(item);_visitables.remove(builder);if (this.hostPorts != null) {this.hostPorts.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildHostPorts instead.
 * @return The buildable object.
 */
@Deprecated public List<HostPortRange> getHostPorts(){
            return build(hostPorts);
    }

    public List<HostPortRange> buildHostPorts(){
            return build(hostPorts);
    }

    public HostPortRange buildHostPort(int index){
            return this.hostPorts.get(index).build();
    }

    public HostPortRange buildFirstHostPort(){
            return this.hostPorts.get(0).build();
    }

    public HostPortRange buildLastHostPort(){
            return this.hostPorts.get(hostPorts.size() - 1).build();
    }

    public HostPortRange buildMatchingHostPort(io.fabric8.kubernetes.api.builder.Predicate<HostPortRangeBuilder> predicate){
            for (HostPortRangeBuilder item: hostPorts) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withHostPorts(List<HostPortRange> hostPorts){
            if (this.hostPorts != null) { _visitables.removeAll(this.hostPorts);}
            if (hostPorts != null) {this.hostPorts = new ArrayList<HostPortRangeBuilder>(); for (HostPortRange item : hostPorts){this.addToHostPorts(item);}} else { this.hostPorts = new ArrayList<HostPortRangeBuilder>();} return (A) this;
    }

    public A withHostPorts(HostPortRange... hostPorts){
            if (this.hostPorts != null) {this.hostPorts.clear();}
            if (hostPorts != null) {for (HostPortRange item :hostPorts){ this.addToHostPorts(item);}} return (A) this;
    }

    public Boolean hasHostPorts(){
            return hostPorts != null && !hostPorts.isEmpty();
    }

    public A addNewHostPort(Integer max,Integer min){
            return (A)addToHostPorts(new HostPortRange(max, min));
    }

    public PodSecurityPolicySpecFluent.HostPortsNested<A> addNewHostPort(){
            return new HostPortsNestedImpl();
    }

    public PodSecurityPolicySpecFluent.HostPortsNested<A> addNewHostPortLike(HostPortRange item){
            return new HostPortsNestedImpl(-1, item);
    }

    public PodSecurityPolicySpecFluent.HostPortsNested<A> setNewHostPortLike(int index,HostPortRange item){
            return new HostPortsNestedImpl(index, item);
    }

    public PodSecurityPolicySpecFluent.HostPortsNested<A> editHostPort(int index){
            if (hostPorts.size() <= index) throw new RuntimeException("Can't edit hostPorts. Index exceeds size.");
            return setNewHostPortLike(index, buildHostPort(index));
    }

    public PodSecurityPolicySpecFluent.HostPortsNested<A> editFirstHostPort(){
            if (hostPorts.size() == 0) throw new RuntimeException("Can't edit first hostPorts. The list is empty.");
            return setNewHostPortLike(0, buildHostPort(0));
    }

    public PodSecurityPolicySpecFluent.HostPortsNested<A> editLastHostPort(){
            int index = hostPorts.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last hostPorts. The list is empty.");
            return setNewHostPortLike(index, buildHostPort(index));
    }

    public PodSecurityPolicySpecFluent.HostPortsNested<A> editMatchingHostPort(io.fabric8.kubernetes.api.builder.Predicate<HostPortRangeBuilder> predicate){
            int index = -1;
            for (int i=0;i<hostPorts.size();i++) { 
            if (predicate.apply(hostPorts.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching hostPorts. No match found.");
            return setNewHostPortLike(index, buildHostPort(index));
    }

    public Boolean isPrivileged(){
            return this.privileged;
    }

    public A withPrivileged(Boolean privileged){
            this.privileged=privileged; return (A) this;
    }

    public Boolean hasPrivileged(){
            return this.privileged != null;
    }

    public A withNewPrivileged(String arg1){
            return (A)withPrivileged(new Boolean(arg1));
    }

    public A withNewPrivileged(boolean arg1){
            return (A)withPrivileged(new Boolean(arg1));
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
 * This method has been deprecated, please use method buildRunAsGroup instead.
 * @return The buildable object.
 */
@Deprecated public RunAsGroupStrategyOptions getRunAsGroup(){
            return this.runAsGroup!=null?this.runAsGroup.build():null;
    }

    public RunAsGroupStrategyOptions buildRunAsGroup(){
            return this.runAsGroup!=null?this.runAsGroup.build():null;
    }

    public A withRunAsGroup(RunAsGroupStrategyOptions runAsGroup){
            _visitables.remove(this.runAsGroup);
            if (runAsGroup!=null){ this.runAsGroup= new RunAsGroupStrategyOptionsBuilder(runAsGroup); _visitables.add(this.runAsGroup);} return (A) this;
    }

    public Boolean hasRunAsGroup(){
            return this.runAsGroup != null;
    }

    public PodSecurityPolicySpecFluent.RunAsGroupNested<A> withNewRunAsGroup(){
            return new RunAsGroupNestedImpl();
    }

    public PodSecurityPolicySpecFluent.RunAsGroupNested<A> withNewRunAsGroupLike(RunAsGroupStrategyOptions item){
            return new RunAsGroupNestedImpl(item);
    }

    public PodSecurityPolicySpecFluent.RunAsGroupNested<A> editRunAsGroup(){
            return withNewRunAsGroupLike(getRunAsGroup());
    }

    public PodSecurityPolicySpecFluent.RunAsGroupNested<A> editOrNewRunAsGroup(){
            return withNewRunAsGroupLike(getRunAsGroup() != null ? getRunAsGroup(): new RunAsGroupStrategyOptionsBuilder().build());
    }

    public PodSecurityPolicySpecFluent.RunAsGroupNested<A> editOrNewRunAsGroupLike(RunAsGroupStrategyOptions item){
            return withNewRunAsGroupLike(getRunAsGroup() != null ? getRunAsGroup(): item);
    }

    
/**
 * This method has been deprecated, please use method buildRunAsUser instead.
 * @return The buildable object.
 */
@Deprecated public KubernetesRunAsUserStrategyOptions getRunAsUser(){
            return this.runAsUser!=null?this.runAsUser.build():null;
    }

    public KubernetesRunAsUserStrategyOptions buildRunAsUser(){
            return this.runAsUser!=null?this.runAsUser.build():null;
    }

    public A withRunAsUser(KubernetesRunAsUserStrategyOptions runAsUser){
            _visitables.remove(this.runAsUser);
            if (runAsUser!=null){ this.runAsUser= new KubernetesRunAsUserStrategyOptionsBuilder(runAsUser); _visitables.add(this.runAsUser);} return (A) this;
    }

    public Boolean hasRunAsUser(){
            return this.runAsUser != null;
    }

    public PodSecurityPolicySpecFluent.RunAsUserNested<A> withNewRunAsUser(){
            return new RunAsUserNestedImpl();
    }

    public PodSecurityPolicySpecFluent.RunAsUserNested<A> withNewRunAsUserLike(KubernetesRunAsUserStrategyOptions item){
            return new RunAsUserNestedImpl(item);
    }

    public PodSecurityPolicySpecFluent.RunAsUserNested<A> editRunAsUser(){
            return withNewRunAsUserLike(getRunAsUser());
    }

    public PodSecurityPolicySpecFluent.RunAsUserNested<A> editOrNewRunAsUser(){
            return withNewRunAsUserLike(getRunAsUser() != null ? getRunAsUser(): new KubernetesRunAsUserStrategyOptionsBuilder().build());
    }

    public PodSecurityPolicySpecFluent.RunAsUserNested<A> editOrNewRunAsUserLike(KubernetesRunAsUserStrategyOptions item){
            return withNewRunAsUserLike(getRunAsUser() != null ? getRunAsUser(): item);
    }

    
/**
 * This method has been deprecated, please use method buildSeLinux instead.
 * @return The buildable object.
 */
@Deprecated public SELinuxStrategyOptions getSeLinux(){
            return this.seLinux!=null?this.seLinux.build():null;
    }

    public SELinuxStrategyOptions buildSeLinux(){
            return this.seLinux!=null?this.seLinux.build():null;
    }

    public A withSeLinux(SELinuxStrategyOptions seLinux){
            _visitables.remove(this.seLinux);
            if (seLinux!=null){ this.seLinux= new SELinuxStrategyOptionsBuilder(seLinux); _visitables.add(this.seLinux);} return (A) this;
    }

    public Boolean hasSeLinux(){
            return this.seLinux != null;
    }

    public PodSecurityPolicySpecFluent.SeLinuxNested<A> withNewSeLinux(){
            return new SeLinuxNestedImpl();
    }

    public PodSecurityPolicySpecFluent.SeLinuxNested<A> withNewSeLinuxLike(SELinuxStrategyOptions item){
            return new SeLinuxNestedImpl(item);
    }

    public PodSecurityPolicySpecFluent.SeLinuxNested<A> editSeLinux(){
            return withNewSeLinuxLike(getSeLinux());
    }

    public PodSecurityPolicySpecFluent.SeLinuxNested<A> editOrNewSeLinux(){
            return withNewSeLinuxLike(getSeLinux() != null ? getSeLinux(): new SELinuxStrategyOptionsBuilder().build());
    }

    public PodSecurityPolicySpecFluent.SeLinuxNested<A> editOrNewSeLinuxLike(SELinuxStrategyOptions item){
            return withNewSeLinuxLike(getSeLinux() != null ? getSeLinux(): item);
    }

    
/**
 * This method has been deprecated, please use method buildSupplementalGroups instead.
 * @return The buildable object.
 */
@Deprecated public SupplementalGroupsStrategyOptions getSupplementalGroups(){
            return this.supplementalGroups!=null?this.supplementalGroups.build():null;
    }

    public SupplementalGroupsStrategyOptions buildSupplementalGroups(){
            return this.supplementalGroups!=null?this.supplementalGroups.build():null;
    }

    public A withSupplementalGroups(SupplementalGroupsStrategyOptions supplementalGroups){
            _visitables.remove(this.supplementalGroups);
            if (supplementalGroups!=null){ this.supplementalGroups= new SupplementalGroupsStrategyOptionsBuilder(supplementalGroups); _visitables.add(this.supplementalGroups);} return (A) this;
    }

    public Boolean hasSupplementalGroups(){
            return this.supplementalGroups != null;
    }

    public PodSecurityPolicySpecFluent.SupplementalGroupsNested<A> withNewSupplementalGroups(){
            return new SupplementalGroupsNestedImpl();
    }

    public PodSecurityPolicySpecFluent.SupplementalGroupsNested<A> withNewSupplementalGroupsLike(SupplementalGroupsStrategyOptions item){
            return new SupplementalGroupsNestedImpl(item);
    }

    public PodSecurityPolicySpecFluent.SupplementalGroupsNested<A> editSupplementalGroups(){
            return withNewSupplementalGroupsLike(getSupplementalGroups());
    }

    public PodSecurityPolicySpecFluent.SupplementalGroupsNested<A> editOrNewSupplementalGroups(){
            return withNewSupplementalGroupsLike(getSupplementalGroups() != null ? getSupplementalGroups(): new SupplementalGroupsStrategyOptionsBuilder().build());
    }

    public PodSecurityPolicySpecFluent.SupplementalGroupsNested<A> editOrNewSupplementalGroupsLike(SupplementalGroupsStrategyOptions item){
            return withNewSupplementalGroupsLike(getSupplementalGroups() != null ? getSupplementalGroups(): item);
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
            PodSecurityPolicySpecFluentImpl that = (PodSecurityPolicySpecFluentImpl) o;
            if (allowPrivilegeEscalation != null ? !allowPrivilegeEscalation.equals(that.allowPrivilegeEscalation) :that.allowPrivilegeEscalation != null) return false;
            if (allowedCapabilities != null ? !allowedCapabilities.equals(that.allowedCapabilities) :that.allowedCapabilities != null) return false;
            if (allowedFlexVolumes != null ? !allowedFlexVolumes.equals(that.allowedFlexVolumes) :that.allowedFlexVolumes != null) return false;
            if (allowedHostPaths != null ? !allowedHostPaths.equals(that.allowedHostPaths) :that.allowedHostPaths != null) return false;
            if (allowedProcMountTypes != null ? !allowedProcMountTypes.equals(that.allowedProcMountTypes) :that.allowedProcMountTypes != null) return false;
            if (allowedUnsafeSysctls != null ? !allowedUnsafeSysctls.equals(that.allowedUnsafeSysctls) :that.allowedUnsafeSysctls != null) return false;
            if (defaultAddCapabilities != null ? !defaultAddCapabilities.equals(that.defaultAddCapabilities) :that.defaultAddCapabilities != null) return false;
            if (defaultAllowPrivilegeEscalation != null ? !defaultAllowPrivilegeEscalation.equals(that.defaultAllowPrivilegeEscalation) :that.defaultAllowPrivilegeEscalation != null) return false;
            if (forbiddenSysctls != null ? !forbiddenSysctls.equals(that.forbiddenSysctls) :that.forbiddenSysctls != null) return false;
            if (fsGroup != null ? !fsGroup.equals(that.fsGroup) :that.fsGroup != null) return false;
            if (hostIPC != null ? !hostIPC.equals(that.hostIPC) :that.hostIPC != null) return false;
            if (hostNetwork != null ? !hostNetwork.equals(that.hostNetwork) :that.hostNetwork != null) return false;
            if (hostPID != null ? !hostPID.equals(that.hostPID) :that.hostPID != null) return false;
            if (hostPorts != null ? !hostPorts.equals(that.hostPorts) :that.hostPorts != null) return false;
            if (privileged != null ? !privileged.equals(that.privileged) :that.privileged != null) return false;
            if (readOnlyRootFilesystem != null ? !readOnlyRootFilesystem.equals(that.readOnlyRootFilesystem) :that.readOnlyRootFilesystem != null) return false;
            if (requiredDropCapabilities != null ? !requiredDropCapabilities.equals(that.requiredDropCapabilities) :that.requiredDropCapabilities != null) return false;
            if (runAsGroup != null ? !runAsGroup.equals(that.runAsGroup) :that.runAsGroup != null) return false;
            if (runAsUser != null ? !runAsUser.equals(that.runAsUser) :that.runAsUser != null) return false;
            if (seLinux != null ? !seLinux.equals(that.seLinux) :that.seLinux != null) return false;
            if (supplementalGroups != null ? !supplementalGroups.equals(that.supplementalGroups) :that.supplementalGroups != null) return false;
            if (volumes != null ? !volumes.equals(that.volumes) :that.volumes != null) return false;
            return true;
    }


    public class AllowedFlexVolumesNestedImpl<N> extends AllowedFlexVolumeFluentImpl<PodSecurityPolicySpecFluent.AllowedFlexVolumesNested<N>> implements PodSecurityPolicySpecFluent.AllowedFlexVolumesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final AllowedFlexVolumeBuilder builder;
        private final int index;
    
            AllowedFlexVolumesNestedImpl(int index,AllowedFlexVolume item){
                    this.index = index;
                    this.builder = new AllowedFlexVolumeBuilder(this, item);
            }
            AllowedFlexVolumesNestedImpl(){
                    this.index = -1;
                    this.builder = new AllowedFlexVolumeBuilder(this);
            }
    
    public N and(){
            return (N) PodSecurityPolicySpecFluentImpl.this.setToAllowedFlexVolumes(index, builder.build());
    }
    public N endAllowedFlexVolume(){
            return and();
    }

}
    public class AllowedHostPathsNestedImpl<N> extends AllowedHostPathFluentImpl<PodSecurityPolicySpecFluent.AllowedHostPathsNested<N>> implements PodSecurityPolicySpecFluent.AllowedHostPathsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final AllowedHostPathBuilder builder;
        private final int index;
    
            AllowedHostPathsNestedImpl(int index,AllowedHostPath item){
                    this.index = index;
                    this.builder = new AllowedHostPathBuilder(this, item);
            }
            AllowedHostPathsNestedImpl(){
                    this.index = -1;
                    this.builder = new AllowedHostPathBuilder(this);
            }
    
    public N and(){
            return (N) PodSecurityPolicySpecFluentImpl.this.setToAllowedHostPaths(index, builder.build());
    }
    public N endAllowedHostPath(){
            return and();
    }

}
    public class FsGroupNestedImpl<N> extends FSGroupStrategyOptionsFluentImpl<PodSecurityPolicySpecFluent.FsGroupNested<N>> implements PodSecurityPolicySpecFluent.FsGroupNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final FSGroupStrategyOptionsBuilder builder;
    
            FsGroupNestedImpl(FSGroupStrategyOptions item){
                    this.builder = new FSGroupStrategyOptionsBuilder(this, item);
            }
            FsGroupNestedImpl(){
                    this.builder = new FSGroupStrategyOptionsBuilder(this);
            }
    
    public N and(){
            return (N) PodSecurityPolicySpecFluentImpl.this.withFsGroup(builder.build());
    }
    public N endFsGroup(){
            return and();
    }

}
    public class HostPortsNestedImpl<N> extends HostPortRangeFluentImpl<PodSecurityPolicySpecFluent.HostPortsNested<N>> implements PodSecurityPolicySpecFluent.HostPortsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final HostPortRangeBuilder builder;
        private final int index;
    
            HostPortsNestedImpl(int index,HostPortRange item){
                    this.index = index;
                    this.builder = new HostPortRangeBuilder(this, item);
            }
            HostPortsNestedImpl(){
                    this.index = -1;
                    this.builder = new HostPortRangeBuilder(this);
            }
    
    public N and(){
            return (N) PodSecurityPolicySpecFluentImpl.this.setToHostPorts(index, builder.build());
    }
    public N endHostPort(){
            return and();
    }

}
    public class RunAsGroupNestedImpl<N> extends RunAsGroupStrategyOptionsFluentImpl<PodSecurityPolicySpecFluent.RunAsGroupNested<N>> implements PodSecurityPolicySpecFluent.RunAsGroupNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RunAsGroupStrategyOptionsBuilder builder;
    
            RunAsGroupNestedImpl(RunAsGroupStrategyOptions item){
                    this.builder = new RunAsGroupStrategyOptionsBuilder(this, item);
            }
            RunAsGroupNestedImpl(){
                    this.builder = new RunAsGroupStrategyOptionsBuilder(this);
            }
    
    public N and(){
            return (N) PodSecurityPolicySpecFluentImpl.this.withRunAsGroup(builder.build());
    }
    public N endRunAsGroup(){
            return and();
    }

}
    public class RunAsUserNestedImpl<N> extends KubernetesRunAsUserStrategyOptionsFluentImpl<PodSecurityPolicySpecFluent.RunAsUserNested<N>> implements PodSecurityPolicySpecFluent.RunAsUserNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final KubernetesRunAsUserStrategyOptionsBuilder builder;
    
            RunAsUserNestedImpl(KubernetesRunAsUserStrategyOptions item){
                    this.builder = new KubernetesRunAsUserStrategyOptionsBuilder(this, item);
            }
            RunAsUserNestedImpl(){
                    this.builder = new KubernetesRunAsUserStrategyOptionsBuilder(this);
            }
    
    public N and(){
            return (N) PodSecurityPolicySpecFluentImpl.this.withRunAsUser(builder.build());
    }
    public N endRunAsUser(){
            return and();
    }

}
    public class SeLinuxNestedImpl<N> extends SELinuxStrategyOptionsFluentImpl<PodSecurityPolicySpecFluent.SeLinuxNested<N>> implements PodSecurityPolicySpecFluent.SeLinuxNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SELinuxStrategyOptionsBuilder builder;
    
            SeLinuxNestedImpl(SELinuxStrategyOptions item){
                    this.builder = new SELinuxStrategyOptionsBuilder(this, item);
            }
            SeLinuxNestedImpl(){
                    this.builder = new SELinuxStrategyOptionsBuilder(this);
            }
    
    public N and(){
            return (N) PodSecurityPolicySpecFluentImpl.this.withSeLinux(builder.build());
    }
    public N endSeLinux(){
            return and();
    }

}
    public class SupplementalGroupsNestedImpl<N> extends SupplementalGroupsStrategyOptionsFluentImpl<PodSecurityPolicySpecFluent.SupplementalGroupsNested<N>> implements PodSecurityPolicySpecFluent.SupplementalGroupsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SupplementalGroupsStrategyOptionsBuilder builder;
    
            SupplementalGroupsNestedImpl(SupplementalGroupsStrategyOptions item){
                    this.builder = new SupplementalGroupsStrategyOptionsBuilder(this, item);
            }
            SupplementalGroupsNestedImpl(){
                    this.builder = new SupplementalGroupsStrategyOptionsBuilder(this);
            }
    
    public N and(){
            return (N) PodSecurityPolicySpecFluentImpl.this.withSupplementalGroups(builder.build());
    }
    public N endSupplementalGroups(){
            return and();
    }

}


}
