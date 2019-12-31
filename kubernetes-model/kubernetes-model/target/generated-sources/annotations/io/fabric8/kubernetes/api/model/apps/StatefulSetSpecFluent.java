package io.fabric8.kubernetes.api.model.apps;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimFluent;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import java.lang.Deprecated;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.LabelSelectorBuilder;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimBuilder;
import java.lang.Integer;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.PodTemplateSpecBuilder;
import io.fabric8.kubernetes.api.model.PodTemplateSpecFluent;
import java.util.Collection;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import java.lang.Object;
import io.fabric8.kubernetes.api.model.LabelSelectorFluent;
import java.util.Map;

public interface StatefulSetSpecFluent<A extends StatefulSetSpecFluent<A>> extends Fluent<A>{


    public String getPodManagementPolicy();
    public A withPodManagementPolicy(String podManagementPolicy);
    public Boolean hasPodManagementPolicy();
    public Integer getReplicas();
    public A withReplicas(Integer replicas);
    public Boolean hasReplicas();
    public Integer getRevisionHistoryLimit();
    public A withRevisionHistoryLimit(Integer revisionHistoryLimit);
    public Boolean hasRevisionHistoryLimit();
    
/**
 * This method has been deprecated, please use method buildSelector instead.
 * @return The buildable object.
 */
@Deprecated public LabelSelector getSelector();
    public LabelSelector buildSelector();
    public A withSelector(LabelSelector selector);
    public Boolean hasSelector();
    public StatefulSetSpecFluent.SelectorNested<A> withNewSelector();
    public StatefulSetSpecFluent.SelectorNested<A> withNewSelectorLike(LabelSelector item);
    public StatefulSetSpecFluent.SelectorNested<A> editSelector();
    public StatefulSetSpecFluent.SelectorNested<A> editOrNewSelector();
    public StatefulSetSpecFluent.SelectorNested<A> editOrNewSelectorLike(LabelSelector item);
    public String getServiceName();
    public A withServiceName(String serviceName);
    public Boolean hasServiceName();
    
/**
 * This method has been deprecated, please use method buildTemplate instead.
 * @return The buildable object.
 */
@Deprecated public PodTemplateSpec getTemplate();
    public PodTemplateSpec buildTemplate();
    public A withTemplate(PodTemplateSpec template);
    public Boolean hasTemplate();
    public StatefulSetSpecFluent.TemplateNested<A> withNewTemplate();
    public StatefulSetSpecFluent.TemplateNested<A> withNewTemplateLike(PodTemplateSpec item);
    public StatefulSetSpecFluent.TemplateNested<A> editTemplate();
    public StatefulSetSpecFluent.TemplateNested<A> editOrNewTemplate();
    public StatefulSetSpecFluent.TemplateNested<A> editOrNewTemplateLike(PodTemplateSpec item);
    
/**
 * This method has been deprecated, please use method buildUpdateStrategy instead.
 * @return The buildable object.
 */
@Deprecated public StatefulSetUpdateStrategy getUpdateStrategy();
    public StatefulSetUpdateStrategy buildUpdateStrategy();
    public A withUpdateStrategy(StatefulSetUpdateStrategy updateStrategy);
    public Boolean hasUpdateStrategy();
    public StatefulSetSpecFluent.UpdateStrategyNested<A> withNewUpdateStrategy();
    public StatefulSetSpecFluent.UpdateStrategyNested<A> withNewUpdateStrategyLike(StatefulSetUpdateStrategy item);
    public StatefulSetSpecFluent.UpdateStrategyNested<A> editUpdateStrategy();
    public StatefulSetSpecFluent.UpdateStrategyNested<A> editOrNewUpdateStrategy();
    public StatefulSetSpecFluent.UpdateStrategyNested<A> editOrNewUpdateStrategyLike(StatefulSetUpdateStrategy item);
    public A addToVolumeClaimTemplates(int index,PersistentVolumeClaim item);
    public A setToVolumeClaimTemplates(int index,PersistentVolumeClaim item);
    public A addToVolumeClaimTemplates(PersistentVolumeClaim... items);
    public A addAllToVolumeClaimTemplates(Collection<PersistentVolumeClaim> items);
    public A removeFromVolumeClaimTemplates(PersistentVolumeClaim... items);
    public A removeAllFromVolumeClaimTemplates(Collection<PersistentVolumeClaim> items);
    
/**
 * This method has been deprecated, please use method buildVolumeClaimTemplates instead.
 * @return The buildable object.
 */
@Deprecated public List<PersistentVolumeClaim> getVolumeClaimTemplates();
    public List<PersistentVolumeClaim> buildVolumeClaimTemplates();
    public PersistentVolumeClaim buildVolumeClaimTemplate(int index);
    public PersistentVolumeClaim buildFirstVolumeClaimTemplate();
    public PersistentVolumeClaim buildLastVolumeClaimTemplate();
    public PersistentVolumeClaim buildMatchingVolumeClaimTemplate(io.fabric8.kubernetes.api.builder.Predicate<PersistentVolumeClaimBuilder> predicate);
    public A withVolumeClaimTemplates(List<PersistentVolumeClaim> volumeClaimTemplates);
    public A withVolumeClaimTemplates(PersistentVolumeClaim... volumeClaimTemplates);
    public Boolean hasVolumeClaimTemplates();
    public StatefulSetSpecFluent.VolumeClaimTemplatesNested<A> addNewVolumeClaimTemplate();
    public StatefulSetSpecFluent.VolumeClaimTemplatesNested<A> addNewVolumeClaimTemplateLike(PersistentVolumeClaim item);
    public StatefulSetSpecFluent.VolumeClaimTemplatesNested<A> setNewVolumeClaimTemplateLike(int index,PersistentVolumeClaim item);
    public StatefulSetSpecFluent.VolumeClaimTemplatesNested<A> editVolumeClaimTemplate(int index);
    public StatefulSetSpecFluent.VolumeClaimTemplatesNested<A> editFirstVolumeClaimTemplate();
    public StatefulSetSpecFluent.VolumeClaimTemplatesNested<A> editLastVolumeClaimTemplate();
    public StatefulSetSpecFluent.VolumeClaimTemplatesNested<A> editMatchingVolumeClaimTemplate(io.fabric8.kubernetes.api.builder.Predicate<PersistentVolumeClaimBuilder> predicate);

    public interface SelectorNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LabelSelectorFluent<StatefulSetSpecFluent.SelectorNested<N>>{

        
    public N and();    public N endSelector();
}
    public interface TemplateNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodTemplateSpecFluent<StatefulSetSpecFluent.TemplateNested<N>>{

        
    public N and();    public N endTemplate();
}
    public interface UpdateStrategyNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StatefulSetUpdateStrategyFluent<StatefulSetSpecFluent.UpdateStrategyNested<N>>{

        
    public N and();    public N endUpdateStrategy();
}
    public interface VolumeClaimTemplatesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PersistentVolumeClaimFluent<StatefulSetSpecFluent.VolumeClaimTemplatesNested<N>>{

        
    public N and();    public N endVolumeClaimTemplate();
}


}
