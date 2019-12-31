package io.fabric8.kubernetes.api.model.settings;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.model.EnvFromSourceFluent;
import java.lang.String;
import io.fabric8.kubernetes.api.model.VolumeBuilder;
import io.fabric8.kubernetes.api.model.EnvVarBuilder;
import io.fabric8.kubernetes.api.model.VolumeMountFluent;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.model.EnvVar;
import java.util.List;
import io.fabric8.kubernetes.api.model.VolumeFluent;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.LabelSelectorBuilder;
import io.fabric8.kubernetes.api.model.EnvVarFluent;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.VolumeMountBuilder;
import io.fabric8.kubernetes.api.model.EnvFromSource;
import io.fabric8.kubernetes.api.model.Volume;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.VolumeMount;
import java.util.Collection;
import java.lang.Object;
import io.fabric8.kubernetes.api.model.EnvFromSourceBuilder;
import io.fabric8.kubernetes.api.model.LabelSelectorFluent;
import java.util.Map;

public interface PodPresetSpecFluent<A extends PodPresetSpecFluent<A>> extends Fluent<A>{


    public A addToEnv(int index,EnvVar item);
    public A setToEnv(int index,EnvVar item);
    public A addToEnv(EnvVar... items);
    public A addAllToEnv(Collection<EnvVar> items);
    public A removeFromEnv(EnvVar... items);
    public A removeAllFromEnv(Collection<EnvVar> items);
    
/**
 * This method has been deprecated, please use method buildEnv instead.
 * @return The buildable object.
 */
@Deprecated public List<EnvVar> getEnv();
    public List<EnvVar> buildEnv();
    public EnvVar buildEnv(int index);
    public EnvVar buildFirstEnv();
    public EnvVar buildLastEnv();
    public EnvVar buildMatchingEnv(io.fabric8.kubernetes.api.builder.Predicate<EnvVarBuilder> predicate);
    public A withEnv(List<EnvVar> env);
    public A withEnv(EnvVar... env);
    public Boolean hasEnv();
    public PodPresetSpecFluent.EnvNested<A> addNewEnv();
    public PodPresetSpecFluent.EnvNested<A> addNewEnvLike(EnvVar item);
    public PodPresetSpecFluent.EnvNested<A> setNewEnvLike(int index,EnvVar item);
    public PodPresetSpecFluent.EnvNested<A> editEnv(int index);
    public PodPresetSpecFluent.EnvNested<A> editFirstEnv();
    public PodPresetSpecFluent.EnvNested<A> editLastEnv();
    public PodPresetSpecFluent.EnvNested<A> editMatchingEnv(io.fabric8.kubernetes.api.builder.Predicate<EnvVarBuilder> predicate);
    public A addToEnvFrom(int index,EnvFromSource item);
    public A setToEnvFrom(int index,EnvFromSource item);
    public A addToEnvFrom(EnvFromSource... items);
    public A addAllToEnvFrom(Collection<EnvFromSource> items);
    public A removeFromEnvFrom(EnvFromSource... items);
    public A removeAllFromEnvFrom(Collection<EnvFromSource> items);
    
/**
 * This method has been deprecated, please use method buildEnvFrom instead.
 * @return The buildable object.
 */
@Deprecated public List<EnvFromSource> getEnvFrom();
    public List<EnvFromSource> buildEnvFrom();
    public EnvFromSource buildEnvFrom(int index);
    public EnvFromSource buildFirstEnvFrom();
    public EnvFromSource buildLastEnvFrom();
    public EnvFromSource buildMatchingEnvFrom(io.fabric8.kubernetes.api.builder.Predicate<EnvFromSourceBuilder> predicate);
    public A withEnvFrom(List<EnvFromSource> envFrom);
    public A withEnvFrom(EnvFromSource... envFrom);
    public Boolean hasEnvFrom();
    public PodPresetSpecFluent.EnvFromNested<A> addNewEnvFrom();
    public PodPresetSpecFluent.EnvFromNested<A> addNewEnvFromLike(EnvFromSource item);
    public PodPresetSpecFluent.EnvFromNested<A> setNewEnvFromLike(int index,EnvFromSource item);
    public PodPresetSpecFluent.EnvFromNested<A> editEnvFrom(int index);
    public PodPresetSpecFluent.EnvFromNested<A> editFirstEnvFrom();
    public PodPresetSpecFluent.EnvFromNested<A> editLastEnvFrom();
    public PodPresetSpecFluent.EnvFromNested<A> editMatchingEnvFrom(io.fabric8.kubernetes.api.builder.Predicate<EnvFromSourceBuilder> predicate);
    
/**
 * This method has been deprecated, please use method buildSelector instead.
 * @return The buildable object.
 */
@Deprecated public LabelSelector getSelector();
    public LabelSelector buildSelector();
    public A withSelector(LabelSelector selector);
    public Boolean hasSelector();
    public PodPresetSpecFluent.SelectorNested<A> withNewSelector();
    public PodPresetSpecFluent.SelectorNested<A> withNewSelectorLike(LabelSelector item);
    public PodPresetSpecFluent.SelectorNested<A> editSelector();
    public PodPresetSpecFluent.SelectorNested<A> editOrNewSelector();
    public PodPresetSpecFluent.SelectorNested<A> editOrNewSelectorLike(LabelSelector item);
    public A addToVolumeMounts(int index,VolumeMount item);
    public A setToVolumeMounts(int index,VolumeMount item);
    public A addToVolumeMounts(VolumeMount... items);
    public A addAllToVolumeMounts(Collection<VolumeMount> items);
    public A removeFromVolumeMounts(VolumeMount... items);
    public A removeAllFromVolumeMounts(Collection<VolumeMount> items);
    
/**
 * This method has been deprecated, please use method buildVolumeMounts instead.
 * @return The buildable object.
 */
@Deprecated public List<VolumeMount> getVolumeMounts();
    public List<VolumeMount> buildVolumeMounts();
    public VolumeMount buildVolumeMount(int index);
    public VolumeMount buildFirstVolumeMount();
    public VolumeMount buildLastVolumeMount();
    public VolumeMount buildMatchingVolumeMount(io.fabric8.kubernetes.api.builder.Predicate<VolumeMountBuilder> predicate);
    public A withVolumeMounts(List<VolumeMount> volumeMounts);
    public A withVolumeMounts(VolumeMount... volumeMounts);
    public Boolean hasVolumeMounts();
    public A addNewVolumeMount(String mountPath,String mountPropagation,String name,Boolean readOnly,String subPath);
    public PodPresetSpecFluent.VolumeMountsNested<A> addNewVolumeMount();
    public PodPresetSpecFluent.VolumeMountsNested<A> addNewVolumeMountLike(VolumeMount item);
    public PodPresetSpecFluent.VolumeMountsNested<A> setNewVolumeMountLike(int index,VolumeMount item);
    public PodPresetSpecFluent.VolumeMountsNested<A> editVolumeMount(int index);
    public PodPresetSpecFluent.VolumeMountsNested<A> editFirstVolumeMount();
    public PodPresetSpecFluent.VolumeMountsNested<A> editLastVolumeMount();
    public PodPresetSpecFluent.VolumeMountsNested<A> editMatchingVolumeMount(io.fabric8.kubernetes.api.builder.Predicate<VolumeMountBuilder> predicate);
    public A addToVolumes(int index,Volume item);
    public A setToVolumes(int index,Volume item);
    public A addToVolumes(Volume... items);
    public A addAllToVolumes(Collection<Volume> items);
    public A removeFromVolumes(Volume... items);
    public A removeAllFromVolumes(Collection<Volume> items);
    
/**
 * This method has been deprecated, please use method buildVolumes instead.
 * @return The buildable object.
 */
@Deprecated public List<Volume> getVolumes();
    public List<Volume> buildVolumes();
    public Volume buildVolume(int index);
    public Volume buildFirstVolume();
    public Volume buildLastVolume();
    public Volume buildMatchingVolume(io.fabric8.kubernetes.api.builder.Predicate<VolumeBuilder> predicate);
    public A withVolumes(List<Volume> volumes);
    public A withVolumes(Volume... volumes);
    public Boolean hasVolumes();
    public PodPresetSpecFluent.VolumesNested<A> addNewVolume();
    public PodPresetSpecFluent.VolumesNested<A> addNewVolumeLike(Volume item);
    public PodPresetSpecFluent.VolumesNested<A> setNewVolumeLike(int index,Volume item);
    public PodPresetSpecFluent.VolumesNested<A> editVolume(int index);
    public PodPresetSpecFluent.VolumesNested<A> editFirstVolume();
    public PodPresetSpecFluent.VolumesNested<A> editLastVolume();
    public PodPresetSpecFluent.VolumesNested<A> editMatchingVolume(io.fabric8.kubernetes.api.builder.Predicate<VolumeBuilder> predicate);

    public interface EnvNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EnvVarFluent<PodPresetSpecFluent.EnvNested<N>>{

        
    public N and();    public N endEnv();
}
    public interface EnvFromNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EnvFromSourceFluent<PodPresetSpecFluent.EnvFromNested<N>>{

        
    public N and();    public N endEnvFrom();
}
    public interface SelectorNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LabelSelectorFluent<PodPresetSpecFluent.SelectorNested<N>>{

        
    public N and();    public N endSelector();
}
    public interface VolumeMountsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,VolumeMountFluent<PodPresetSpecFluent.VolumeMountsNested<N>>{

        
    public N and();    public N endVolumeMount();
}
    public interface VolumesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,VolumeFluent<PodPresetSpecFluent.VolumesNested<N>>{

        
    public N and();    public N endVolume();
}


}
