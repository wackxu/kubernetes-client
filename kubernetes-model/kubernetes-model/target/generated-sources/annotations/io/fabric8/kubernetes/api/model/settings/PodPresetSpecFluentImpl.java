package io.fabric8.kubernetes.api.model.settings;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.EnvFromSourceFluentImpl;
import io.fabric8.kubernetes.api.model.LabelSelectorFluentImpl;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.model.VolumeBuilder;
import io.fabric8.kubernetes.api.model.EnvVarBuilder;
import io.fabric8.kubernetes.api.builder.Predicate;
import io.fabric8.kubernetes.api.model.VolumeMountFluentImpl;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.model.VolumeFluentImpl;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import io.fabric8.kubernetes.api.model.EnvVar;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.LabelSelectorBuilder;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.VolumeMountBuilder;
import io.fabric8.kubernetes.api.model.EnvFromSource;
import io.fabric8.kubernetes.api.model.Volume;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.VolumeMount;
import java.util.Collection;
import io.fabric8.kubernetes.api.model.EnvVarFluentImpl;
import java.lang.Object;
import io.fabric8.kubernetes.api.model.EnvFromSourceBuilder;

public class PodPresetSpecFluentImpl<A extends PodPresetSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements PodPresetSpecFluent<A>{

    private List<EnvVarBuilder> env;
    private List<EnvFromSourceBuilder> envFrom;
    private LabelSelectorBuilder selector;
    private List<VolumeMountBuilder> volumeMounts;
    private List<VolumeBuilder> volumes;

    public PodPresetSpecFluentImpl(){
    }
    public PodPresetSpecFluentImpl(PodPresetSpec instance){
            this.withEnv(instance.getEnv()); 
            this.withEnvFrom(instance.getEnvFrom()); 
            this.withSelector(instance.getSelector()); 
            this.withVolumeMounts(instance.getVolumeMounts()); 
            this.withVolumes(instance.getVolumes()); 
    }

    public A addToEnv(int index,EnvVar item){
            if (this.env == null) {this.env = new ArrayList<EnvVarBuilder>();}
            EnvVarBuilder builder = new EnvVarBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.env.add(index >= 0 ? index : env.size(), builder); return (A)this;
    }

    public A setToEnv(int index,EnvVar item){
            if (this.env == null) {this.env = new ArrayList<EnvVarBuilder>();}
            EnvVarBuilder builder = new EnvVarBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= env.size()) { env.add(builder); } else { env.set(index, builder);}
             return (A)this;
    }

    public A addToEnv(EnvVar... items){
            if (this.env == null) {this.env = new ArrayList<EnvVarBuilder>();}
            for (EnvVar item : items) {EnvVarBuilder builder = new EnvVarBuilder(item);_visitables.add(builder);this.env.add(builder);} return (A)this;
    }

    public A addAllToEnv(Collection<EnvVar> items){
            if (this.env == null) {this.env = new ArrayList<EnvVarBuilder>();}
            for (EnvVar item : items) {EnvVarBuilder builder = new EnvVarBuilder(item);_visitables.add(builder);this.env.add(builder);} return (A)this;
    }

    public A removeFromEnv(EnvVar... items){
            for (EnvVar item : items) {EnvVarBuilder builder = new EnvVarBuilder(item);_visitables.remove(builder);if (this.env != null) {this.env.remove(builder);}} return (A)this;
    }

    public A removeAllFromEnv(Collection<EnvVar> items){
            for (EnvVar item : items) {EnvVarBuilder builder = new EnvVarBuilder(item);_visitables.remove(builder);if (this.env != null) {this.env.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildEnv instead.
 * @return The buildable object.
 */
@Deprecated public List<EnvVar> getEnv(){
            return build(env);
    }

    public List<EnvVar> buildEnv(){
            return build(env);
    }

    public EnvVar buildEnv(int index){
            return this.env.get(index).build();
    }

    public EnvVar buildFirstEnv(){
            return this.env.get(0).build();
    }

    public EnvVar buildLastEnv(){
            return this.env.get(env.size() - 1).build();
    }

    public EnvVar buildMatchingEnv(io.fabric8.kubernetes.api.builder.Predicate<EnvVarBuilder> predicate){
            for (EnvVarBuilder item: env) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withEnv(List<EnvVar> env){
            if (this.env != null) { _visitables.removeAll(this.env);}
            if (env != null) {this.env = new ArrayList<EnvVarBuilder>(); for (EnvVar item : env){this.addToEnv(item);}} else { this.env = new ArrayList<EnvVarBuilder>();} return (A) this;
    }

    public A withEnv(EnvVar... env){
            if (this.env != null) {this.env.clear();}
            if (env != null) {for (EnvVar item :env){ this.addToEnv(item);}} return (A) this;
    }

    public Boolean hasEnv(){
            return env != null && !env.isEmpty();
    }

    public PodPresetSpecFluent.EnvNested<A> addNewEnv(){
            return new EnvNestedImpl();
    }

    public PodPresetSpecFluent.EnvNested<A> addNewEnvLike(EnvVar item){
            return new EnvNestedImpl(-1, item);
    }

    public PodPresetSpecFluent.EnvNested<A> setNewEnvLike(int index,EnvVar item){
            return new EnvNestedImpl(index, item);
    }

    public PodPresetSpecFluent.EnvNested<A> editEnv(int index){
            if (env.size() <= index) throw new RuntimeException("Can't edit env. Index exceeds size.");
            return setNewEnvLike(index, buildEnv(index));
    }

    public PodPresetSpecFluent.EnvNested<A> editFirstEnv(){
            if (env.size() == 0) throw new RuntimeException("Can't edit first env. The list is empty.");
            return setNewEnvLike(0, buildEnv(0));
    }

    public PodPresetSpecFluent.EnvNested<A> editLastEnv(){
            int index = env.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last env. The list is empty.");
            return setNewEnvLike(index, buildEnv(index));
    }

    public PodPresetSpecFluent.EnvNested<A> editMatchingEnv(io.fabric8.kubernetes.api.builder.Predicate<EnvVarBuilder> predicate){
            int index = -1;
            for (int i=0;i<env.size();i++) { 
            if (predicate.apply(env.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching env. No match found.");
            return setNewEnvLike(index, buildEnv(index));
    }

    public A addToEnvFrom(int index,EnvFromSource item){
            if (this.envFrom == null) {this.envFrom = new ArrayList<EnvFromSourceBuilder>();}
            EnvFromSourceBuilder builder = new EnvFromSourceBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.envFrom.add(index >= 0 ? index : envFrom.size(), builder); return (A)this;
    }

    public A setToEnvFrom(int index,EnvFromSource item){
            if (this.envFrom == null) {this.envFrom = new ArrayList<EnvFromSourceBuilder>();}
            EnvFromSourceBuilder builder = new EnvFromSourceBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= envFrom.size()) { envFrom.add(builder); } else { envFrom.set(index, builder);}
             return (A)this;
    }

    public A addToEnvFrom(EnvFromSource... items){
            if (this.envFrom == null) {this.envFrom = new ArrayList<EnvFromSourceBuilder>();}
            for (EnvFromSource item : items) {EnvFromSourceBuilder builder = new EnvFromSourceBuilder(item);_visitables.add(builder);this.envFrom.add(builder);} return (A)this;
    }

    public A addAllToEnvFrom(Collection<EnvFromSource> items){
            if (this.envFrom == null) {this.envFrom = new ArrayList<EnvFromSourceBuilder>();}
            for (EnvFromSource item : items) {EnvFromSourceBuilder builder = new EnvFromSourceBuilder(item);_visitables.add(builder);this.envFrom.add(builder);} return (A)this;
    }

    public A removeFromEnvFrom(EnvFromSource... items){
            for (EnvFromSource item : items) {EnvFromSourceBuilder builder = new EnvFromSourceBuilder(item);_visitables.remove(builder);if (this.envFrom != null) {this.envFrom.remove(builder);}} return (A)this;
    }

    public A removeAllFromEnvFrom(Collection<EnvFromSource> items){
            for (EnvFromSource item : items) {EnvFromSourceBuilder builder = new EnvFromSourceBuilder(item);_visitables.remove(builder);if (this.envFrom != null) {this.envFrom.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildEnvFrom instead.
 * @return The buildable object.
 */
@Deprecated public List<EnvFromSource> getEnvFrom(){
            return build(envFrom);
    }

    public List<EnvFromSource> buildEnvFrom(){
            return build(envFrom);
    }

    public EnvFromSource buildEnvFrom(int index){
            return this.envFrom.get(index).build();
    }

    public EnvFromSource buildFirstEnvFrom(){
            return this.envFrom.get(0).build();
    }

    public EnvFromSource buildLastEnvFrom(){
            return this.envFrom.get(envFrom.size() - 1).build();
    }

    public EnvFromSource buildMatchingEnvFrom(io.fabric8.kubernetes.api.builder.Predicate<EnvFromSourceBuilder> predicate){
            for (EnvFromSourceBuilder item: envFrom) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withEnvFrom(List<EnvFromSource> envFrom){
            if (this.envFrom != null) { _visitables.removeAll(this.envFrom);}
            if (envFrom != null) {this.envFrom = new ArrayList<EnvFromSourceBuilder>(); for (EnvFromSource item : envFrom){this.addToEnvFrom(item);}} else { this.envFrom = new ArrayList<EnvFromSourceBuilder>();} return (A) this;
    }

    public A withEnvFrom(EnvFromSource... envFrom){
            if (this.envFrom != null) {this.envFrom.clear();}
            if (envFrom != null) {for (EnvFromSource item :envFrom){ this.addToEnvFrom(item);}} return (A) this;
    }

    public Boolean hasEnvFrom(){
            return envFrom != null && !envFrom.isEmpty();
    }

    public PodPresetSpecFluent.EnvFromNested<A> addNewEnvFrom(){
            return new EnvFromNestedImpl();
    }

    public PodPresetSpecFluent.EnvFromNested<A> addNewEnvFromLike(EnvFromSource item){
            return new EnvFromNestedImpl(-1, item);
    }

    public PodPresetSpecFluent.EnvFromNested<A> setNewEnvFromLike(int index,EnvFromSource item){
            return new EnvFromNestedImpl(index, item);
    }

    public PodPresetSpecFluent.EnvFromNested<A> editEnvFrom(int index){
            if (envFrom.size() <= index) throw new RuntimeException("Can't edit envFrom. Index exceeds size.");
            return setNewEnvFromLike(index, buildEnvFrom(index));
    }

    public PodPresetSpecFluent.EnvFromNested<A> editFirstEnvFrom(){
            if (envFrom.size() == 0) throw new RuntimeException("Can't edit first envFrom. The list is empty.");
            return setNewEnvFromLike(0, buildEnvFrom(0));
    }

    public PodPresetSpecFluent.EnvFromNested<A> editLastEnvFrom(){
            int index = envFrom.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last envFrom. The list is empty.");
            return setNewEnvFromLike(index, buildEnvFrom(index));
    }

    public PodPresetSpecFluent.EnvFromNested<A> editMatchingEnvFrom(io.fabric8.kubernetes.api.builder.Predicate<EnvFromSourceBuilder> predicate){
            int index = -1;
            for (int i=0;i<envFrom.size();i++) { 
            if (predicate.apply(envFrom.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching envFrom. No match found.");
            return setNewEnvFromLike(index, buildEnvFrom(index));
    }

    
/**
 * This method has been deprecated, please use method buildSelector instead.
 * @return The buildable object.
 */
@Deprecated public LabelSelector getSelector(){
            return this.selector!=null?this.selector.build():null;
    }

    public LabelSelector buildSelector(){
            return this.selector!=null?this.selector.build():null;
    }

    public A withSelector(LabelSelector selector){
            _visitables.remove(this.selector);
            if (selector!=null){ this.selector= new LabelSelectorBuilder(selector); _visitables.add(this.selector);} return (A) this;
    }

    public Boolean hasSelector(){
            return this.selector != null;
    }

    public PodPresetSpecFluent.SelectorNested<A> withNewSelector(){
            return new SelectorNestedImpl();
    }

    public PodPresetSpecFluent.SelectorNested<A> withNewSelectorLike(LabelSelector item){
            return new SelectorNestedImpl(item);
    }

    public PodPresetSpecFluent.SelectorNested<A> editSelector(){
            return withNewSelectorLike(getSelector());
    }

    public PodPresetSpecFluent.SelectorNested<A> editOrNewSelector(){
            return withNewSelectorLike(getSelector() != null ? getSelector(): new LabelSelectorBuilder().build());
    }

    public PodPresetSpecFluent.SelectorNested<A> editOrNewSelectorLike(LabelSelector item){
            return withNewSelectorLike(getSelector() != null ? getSelector(): item);
    }

    public A addToVolumeMounts(int index,VolumeMount item){
            if (this.volumeMounts == null) {this.volumeMounts = new ArrayList<VolumeMountBuilder>();}
            VolumeMountBuilder builder = new VolumeMountBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.volumeMounts.add(index >= 0 ? index : volumeMounts.size(), builder); return (A)this;
    }

    public A setToVolumeMounts(int index,VolumeMount item){
            if (this.volumeMounts == null) {this.volumeMounts = new ArrayList<VolumeMountBuilder>();}
            VolumeMountBuilder builder = new VolumeMountBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= volumeMounts.size()) { volumeMounts.add(builder); } else { volumeMounts.set(index, builder);}
             return (A)this;
    }

    public A addToVolumeMounts(VolumeMount... items){
            if (this.volumeMounts == null) {this.volumeMounts = new ArrayList<VolumeMountBuilder>();}
            for (VolumeMount item : items) {VolumeMountBuilder builder = new VolumeMountBuilder(item);_visitables.add(builder);this.volumeMounts.add(builder);} return (A)this;
    }

    public A addAllToVolumeMounts(Collection<VolumeMount> items){
            if (this.volumeMounts == null) {this.volumeMounts = new ArrayList<VolumeMountBuilder>();}
            for (VolumeMount item : items) {VolumeMountBuilder builder = new VolumeMountBuilder(item);_visitables.add(builder);this.volumeMounts.add(builder);} return (A)this;
    }

    public A removeFromVolumeMounts(VolumeMount... items){
            for (VolumeMount item : items) {VolumeMountBuilder builder = new VolumeMountBuilder(item);_visitables.remove(builder);if (this.volumeMounts != null) {this.volumeMounts.remove(builder);}} return (A)this;
    }

    public A removeAllFromVolumeMounts(Collection<VolumeMount> items){
            for (VolumeMount item : items) {VolumeMountBuilder builder = new VolumeMountBuilder(item);_visitables.remove(builder);if (this.volumeMounts != null) {this.volumeMounts.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildVolumeMounts instead.
 * @return The buildable object.
 */
@Deprecated public List<VolumeMount> getVolumeMounts(){
            return build(volumeMounts);
    }

    public List<VolumeMount> buildVolumeMounts(){
            return build(volumeMounts);
    }

    public VolumeMount buildVolumeMount(int index){
            return this.volumeMounts.get(index).build();
    }

    public VolumeMount buildFirstVolumeMount(){
            return this.volumeMounts.get(0).build();
    }

    public VolumeMount buildLastVolumeMount(){
            return this.volumeMounts.get(volumeMounts.size() - 1).build();
    }

    public VolumeMount buildMatchingVolumeMount(io.fabric8.kubernetes.api.builder.Predicate<VolumeMountBuilder> predicate){
            for (VolumeMountBuilder item: volumeMounts) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withVolumeMounts(List<VolumeMount> volumeMounts){
            if (this.volumeMounts != null) { _visitables.removeAll(this.volumeMounts);}
            if (volumeMounts != null) {this.volumeMounts = new ArrayList<VolumeMountBuilder>(); for (VolumeMount item : volumeMounts){this.addToVolumeMounts(item);}} else { this.volumeMounts = new ArrayList<VolumeMountBuilder>();} return (A) this;
    }

    public A withVolumeMounts(VolumeMount... volumeMounts){
            if (this.volumeMounts != null) {this.volumeMounts.clear();}
            if (volumeMounts != null) {for (VolumeMount item :volumeMounts){ this.addToVolumeMounts(item);}} return (A) this;
    }

    public Boolean hasVolumeMounts(){
            return volumeMounts != null && !volumeMounts.isEmpty();
    }

    public A addNewVolumeMount(String mountPath,String mountPropagation,String name,Boolean readOnly,String subPath){
            return (A)addToVolumeMounts(new VolumeMount(mountPath, mountPropagation, name, readOnly, subPath));
    }

    public PodPresetSpecFluent.VolumeMountsNested<A> addNewVolumeMount(){
            return new VolumeMountsNestedImpl();
    }

    public PodPresetSpecFluent.VolumeMountsNested<A> addNewVolumeMountLike(VolumeMount item){
            return new VolumeMountsNestedImpl(-1, item);
    }

    public PodPresetSpecFluent.VolumeMountsNested<A> setNewVolumeMountLike(int index,VolumeMount item){
            return new VolumeMountsNestedImpl(index, item);
    }

    public PodPresetSpecFluent.VolumeMountsNested<A> editVolumeMount(int index){
            if (volumeMounts.size() <= index) throw new RuntimeException("Can't edit volumeMounts. Index exceeds size.");
            return setNewVolumeMountLike(index, buildVolumeMount(index));
    }

    public PodPresetSpecFluent.VolumeMountsNested<A> editFirstVolumeMount(){
            if (volumeMounts.size() == 0) throw new RuntimeException("Can't edit first volumeMounts. The list is empty.");
            return setNewVolumeMountLike(0, buildVolumeMount(0));
    }

    public PodPresetSpecFluent.VolumeMountsNested<A> editLastVolumeMount(){
            int index = volumeMounts.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last volumeMounts. The list is empty.");
            return setNewVolumeMountLike(index, buildVolumeMount(index));
    }

    public PodPresetSpecFluent.VolumeMountsNested<A> editMatchingVolumeMount(io.fabric8.kubernetes.api.builder.Predicate<VolumeMountBuilder> predicate){
            int index = -1;
            for (int i=0;i<volumeMounts.size();i++) { 
            if (predicate.apply(volumeMounts.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching volumeMounts. No match found.");
            return setNewVolumeMountLike(index, buildVolumeMount(index));
    }

    public A addToVolumes(int index,Volume item){
            if (this.volumes == null) {this.volumes = new ArrayList<VolumeBuilder>();}
            VolumeBuilder builder = new VolumeBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.volumes.add(index >= 0 ? index : volumes.size(), builder); return (A)this;
    }

    public A setToVolumes(int index,Volume item){
            if (this.volumes == null) {this.volumes = new ArrayList<VolumeBuilder>();}
            VolumeBuilder builder = new VolumeBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= volumes.size()) { volumes.add(builder); } else { volumes.set(index, builder);}
             return (A)this;
    }

    public A addToVolumes(Volume... items){
            if (this.volumes == null) {this.volumes = new ArrayList<VolumeBuilder>();}
            for (Volume item : items) {VolumeBuilder builder = new VolumeBuilder(item);_visitables.add(builder);this.volumes.add(builder);} return (A)this;
    }

    public A addAllToVolumes(Collection<Volume> items){
            if (this.volumes == null) {this.volumes = new ArrayList<VolumeBuilder>();}
            for (Volume item : items) {VolumeBuilder builder = new VolumeBuilder(item);_visitables.add(builder);this.volumes.add(builder);} return (A)this;
    }

    public A removeFromVolumes(Volume... items){
            for (Volume item : items) {VolumeBuilder builder = new VolumeBuilder(item);_visitables.remove(builder);if (this.volumes != null) {this.volumes.remove(builder);}} return (A)this;
    }

    public A removeAllFromVolumes(Collection<Volume> items){
            for (Volume item : items) {VolumeBuilder builder = new VolumeBuilder(item);_visitables.remove(builder);if (this.volumes != null) {this.volumes.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildVolumes instead.
 * @return The buildable object.
 */
@Deprecated public List<Volume> getVolumes(){
            return build(volumes);
    }

    public List<Volume> buildVolumes(){
            return build(volumes);
    }

    public Volume buildVolume(int index){
            return this.volumes.get(index).build();
    }

    public Volume buildFirstVolume(){
            return this.volumes.get(0).build();
    }

    public Volume buildLastVolume(){
            return this.volumes.get(volumes.size() - 1).build();
    }

    public Volume buildMatchingVolume(io.fabric8.kubernetes.api.builder.Predicate<VolumeBuilder> predicate){
            for (VolumeBuilder item: volumes) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withVolumes(List<Volume> volumes){
            if (this.volumes != null) { _visitables.removeAll(this.volumes);}
            if (volumes != null) {this.volumes = new ArrayList<VolumeBuilder>(); for (Volume item : volumes){this.addToVolumes(item);}} else { this.volumes = new ArrayList<VolumeBuilder>();} return (A) this;
    }

    public A withVolumes(Volume... volumes){
            if (this.volumes != null) {this.volumes.clear();}
            if (volumes != null) {for (Volume item :volumes){ this.addToVolumes(item);}} return (A) this;
    }

    public Boolean hasVolumes(){
            return volumes != null && !volumes.isEmpty();
    }

    public PodPresetSpecFluent.VolumesNested<A> addNewVolume(){
            return new VolumesNestedImpl();
    }

    public PodPresetSpecFluent.VolumesNested<A> addNewVolumeLike(Volume item){
            return new VolumesNestedImpl(-1, item);
    }

    public PodPresetSpecFluent.VolumesNested<A> setNewVolumeLike(int index,Volume item){
            return new VolumesNestedImpl(index, item);
    }

    public PodPresetSpecFluent.VolumesNested<A> editVolume(int index){
            if (volumes.size() <= index) throw new RuntimeException("Can't edit volumes. Index exceeds size.");
            return setNewVolumeLike(index, buildVolume(index));
    }

    public PodPresetSpecFluent.VolumesNested<A> editFirstVolume(){
            if (volumes.size() == 0) throw new RuntimeException("Can't edit first volumes. The list is empty.");
            return setNewVolumeLike(0, buildVolume(0));
    }

    public PodPresetSpecFluent.VolumesNested<A> editLastVolume(){
            int index = volumes.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last volumes. The list is empty.");
            return setNewVolumeLike(index, buildVolume(index));
    }

    public PodPresetSpecFluent.VolumesNested<A> editMatchingVolume(io.fabric8.kubernetes.api.builder.Predicate<VolumeBuilder> predicate){
            int index = -1;
            for (int i=0;i<volumes.size();i++) { 
            if (predicate.apply(volumes.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching volumes. No match found.");
            return setNewVolumeLike(index, buildVolume(index));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PodPresetSpecFluentImpl that = (PodPresetSpecFluentImpl) o;
            if (env != null ? !env.equals(that.env) :that.env != null) return false;
            if (envFrom != null ? !envFrom.equals(that.envFrom) :that.envFrom != null) return false;
            if (selector != null ? !selector.equals(that.selector) :that.selector != null) return false;
            if (volumeMounts != null ? !volumeMounts.equals(that.volumeMounts) :that.volumeMounts != null) return false;
            if (volumes != null ? !volumes.equals(that.volumes) :that.volumes != null) return false;
            return true;
    }


    public class EnvNestedImpl<N> extends EnvVarFluentImpl<PodPresetSpecFluent.EnvNested<N>> implements PodPresetSpecFluent.EnvNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EnvVarBuilder builder;
        private final int index;
    
            EnvNestedImpl(int index,EnvVar item){
                    this.index = index;
                    this.builder = new EnvVarBuilder(this, item);
            }
            EnvNestedImpl(){
                    this.index = -1;
                    this.builder = new EnvVarBuilder(this);
            }
    
    public N and(){
            return (N) PodPresetSpecFluentImpl.this.setToEnv(index, builder.build());
    }
    public N endEnv(){
            return and();
    }

}
    public class EnvFromNestedImpl<N> extends EnvFromSourceFluentImpl<PodPresetSpecFluent.EnvFromNested<N>> implements PodPresetSpecFluent.EnvFromNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EnvFromSourceBuilder builder;
        private final int index;
    
            EnvFromNestedImpl(int index,EnvFromSource item){
                    this.index = index;
                    this.builder = new EnvFromSourceBuilder(this, item);
            }
            EnvFromNestedImpl(){
                    this.index = -1;
                    this.builder = new EnvFromSourceBuilder(this);
            }
    
    public N and(){
            return (N) PodPresetSpecFluentImpl.this.setToEnvFrom(index, builder.build());
    }
    public N endEnvFrom(){
            return and();
    }

}
    public class SelectorNestedImpl<N> extends LabelSelectorFluentImpl<PodPresetSpecFluent.SelectorNested<N>> implements PodPresetSpecFluent.SelectorNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LabelSelectorBuilder builder;
    
            SelectorNestedImpl(LabelSelector item){
                    this.builder = new LabelSelectorBuilder(this, item);
            }
            SelectorNestedImpl(){
                    this.builder = new LabelSelectorBuilder(this);
            }
    
    public N and(){
            return (N) PodPresetSpecFluentImpl.this.withSelector(builder.build());
    }
    public N endSelector(){
            return and();
    }

}
    public class VolumeMountsNestedImpl<N> extends VolumeMountFluentImpl<PodPresetSpecFluent.VolumeMountsNested<N>> implements PodPresetSpecFluent.VolumeMountsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final VolumeMountBuilder builder;
        private final int index;
    
            VolumeMountsNestedImpl(int index,VolumeMount item){
                    this.index = index;
                    this.builder = new VolumeMountBuilder(this, item);
            }
            VolumeMountsNestedImpl(){
                    this.index = -1;
                    this.builder = new VolumeMountBuilder(this);
            }
    
    public N and(){
            return (N) PodPresetSpecFluentImpl.this.setToVolumeMounts(index, builder.build());
    }
    public N endVolumeMount(){
            return and();
    }

}
    public class VolumesNestedImpl<N> extends VolumeFluentImpl<PodPresetSpecFluent.VolumesNested<N>> implements PodPresetSpecFluent.VolumesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final VolumeBuilder builder;
        private final int index;
    
            VolumesNestedImpl(int index,Volume item){
                    this.index = index;
                    this.builder = new VolumeBuilder(this, item);
            }
            VolumesNestedImpl(){
                    this.index = -1;
                    this.builder = new VolumeBuilder(this);
            }
    
    public N and(){
            return (N) PodPresetSpecFluentImpl.this.setToVolumes(index, builder.build());
    }
    public N endVolume(){
            return and();
    }

}


}
