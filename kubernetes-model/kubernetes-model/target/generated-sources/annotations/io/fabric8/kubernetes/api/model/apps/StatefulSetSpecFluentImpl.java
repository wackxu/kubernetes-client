package io.fabric8.kubernetes.api.model.apps;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.PodTemplateSpecFluentImpl;
import io.fabric8.kubernetes.api.model.LabelSelectorFluentImpl;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.LabelSelectorBuilder;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimBuilder;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimFluentImpl;
import java.lang.Integer;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.PodTemplateSpecBuilder;
import java.util.Collection;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import java.lang.Object;

public class StatefulSetSpecFluentImpl<A extends StatefulSetSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements StatefulSetSpecFluent<A>{

    private String podManagementPolicy;
    private Integer replicas;
    private Integer revisionHistoryLimit;
    private LabelSelectorBuilder selector;
    private String serviceName;
    private PodTemplateSpecBuilder template;
    private StatefulSetUpdateStrategyBuilder updateStrategy;
    private List<PersistentVolumeClaimBuilder> volumeClaimTemplates;

    public StatefulSetSpecFluentImpl(){
    }
    public StatefulSetSpecFluentImpl(StatefulSetSpec instance){
            this.withPodManagementPolicy(instance.getPodManagementPolicy()); 
            this.withReplicas(instance.getReplicas()); 
            this.withRevisionHistoryLimit(instance.getRevisionHistoryLimit()); 
            this.withSelector(instance.getSelector()); 
            this.withServiceName(instance.getServiceName()); 
            this.withTemplate(instance.getTemplate()); 
            this.withUpdateStrategy(instance.getUpdateStrategy()); 
            this.withVolumeClaimTemplates(instance.getVolumeClaimTemplates()); 
    }

    public String getPodManagementPolicy(){
            return this.podManagementPolicy;
    }

    public A withPodManagementPolicy(String podManagementPolicy){
            this.podManagementPolicy=podManagementPolicy; return (A) this;
    }

    public Boolean hasPodManagementPolicy(){
            return this.podManagementPolicy != null;
    }

    public Integer getReplicas(){
            return this.replicas;
    }

    public A withReplicas(Integer replicas){
            this.replicas=replicas; return (A) this;
    }

    public Boolean hasReplicas(){
            return this.replicas != null;
    }

    public Integer getRevisionHistoryLimit(){
            return this.revisionHistoryLimit;
    }

    public A withRevisionHistoryLimit(Integer revisionHistoryLimit){
            this.revisionHistoryLimit=revisionHistoryLimit; return (A) this;
    }

    public Boolean hasRevisionHistoryLimit(){
            return this.revisionHistoryLimit != null;
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

    public StatefulSetSpecFluent.SelectorNested<A> withNewSelector(){
            return new SelectorNestedImpl();
    }

    public StatefulSetSpecFluent.SelectorNested<A> withNewSelectorLike(LabelSelector item){
            return new SelectorNestedImpl(item);
    }

    public StatefulSetSpecFluent.SelectorNested<A> editSelector(){
            return withNewSelectorLike(getSelector());
    }

    public StatefulSetSpecFluent.SelectorNested<A> editOrNewSelector(){
            return withNewSelectorLike(getSelector() != null ? getSelector(): new LabelSelectorBuilder().build());
    }

    public StatefulSetSpecFluent.SelectorNested<A> editOrNewSelectorLike(LabelSelector item){
            return withNewSelectorLike(getSelector() != null ? getSelector(): item);
    }

    public String getServiceName(){
            return this.serviceName;
    }

    public A withServiceName(String serviceName){
            this.serviceName=serviceName; return (A) this;
    }

    public Boolean hasServiceName(){
            return this.serviceName != null;
    }

    
/**
 * This method has been deprecated, please use method buildTemplate instead.
 * @return The buildable object.
 */
@Deprecated public PodTemplateSpec getTemplate(){
            return this.template!=null?this.template.build():null;
    }

    public PodTemplateSpec buildTemplate(){
            return this.template!=null?this.template.build():null;
    }

    public A withTemplate(PodTemplateSpec template){
            _visitables.remove(this.template);
            if (template!=null){ this.template= new PodTemplateSpecBuilder(template); _visitables.add(this.template);} return (A) this;
    }

    public Boolean hasTemplate(){
            return this.template != null;
    }

    public StatefulSetSpecFluent.TemplateNested<A> withNewTemplate(){
            return new TemplateNestedImpl();
    }

    public StatefulSetSpecFluent.TemplateNested<A> withNewTemplateLike(PodTemplateSpec item){
            return new TemplateNestedImpl(item);
    }

    public StatefulSetSpecFluent.TemplateNested<A> editTemplate(){
            return withNewTemplateLike(getTemplate());
    }

    public StatefulSetSpecFluent.TemplateNested<A> editOrNewTemplate(){
            return withNewTemplateLike(getTemplate() != null ? getTemplate(): new PodTemplateSpecBuilder().build());
    }

    public StatefulSetSpecFluent.TemplateNested<A> editOrNewTemplateLike(PodTemplateSpec item){
            return withNewTemplateLike(getTemplate() != null ? getTemplate(): item);
    }

    
/**
 * This method has been deprecated, please use method buildUpdateStrategy instead.
 * @return The buildable object.
 */
@Deprecated public StatefulSetUpdateStrategy getUpdateStrategy(){
            return this.updateStrategy!=null?this.updateStrategy.build():null;
    }

    public StatefulSetUpdateStrategy buildUpdateStrategy(){
            return this.updateStrategy!=null?this.updateStrategy.build():null;
    }

    public A withUpdateStrategy(StatefulSetUpdateStrategy updateStrategy){
            _visitables.remove(this.updateStrategy);
            if (updateStrategy!=null){ this.updateStrategy= new StatefulSetUpdateStrategyBuilder(updateStrategy); _visitables.add(this.updateStrategy);} return (A) this;
    }

    public Boolean hasUpdateStrategy(){
            return this.updateStrategy != null;
    }

    public StatefulSetSpecFluent.UpdateStrategyNested<A> withNewUpdateStrategy(){
            return new UpdateStrategyNestedImpl();
    }

    public StatefulSetSpecFluent.UpdateStrategyNested<A> withNewUpdateStrategyLike(StatefulSetUpdateStrategy item){
            return new UpdateStrategyNestedImpl(item);
    }

    public StatefulSetSpecFluent.UpdateStrategyNested<A> editUpdateStrategy(){
            return withNewUpdateStrategyLike(getUpdateStrategy());
    }

    public StatefulSetSpecFluent.UpdateStrategyNested<A> editOrNewUpdateStrategy(){
            return withNewUpdateStrategyLike(getUpdateStrategy() != null ? getUpdateStrategy(): new StatefulSetUpdateStrategyBuilder().build());
    }

    public StatefulSetSpecFluent.UpdateStrategyNested<A> editOrNewUpdateStrategyLike(StatefulSetUpdateStrategy item){
            return withNewUpdateStrategyLike(getUpdateStrategy() != null ? getUpdateStrategy(): item);
    }

    public A addToVolumeClaimTemplates(int index,PersistentVolumeClaim item){
            if (this.volumeClaimTemplates == null) {this.volumeClaimTemplates = new ArrayList<PersistentVolumeClaimBuilder>();}
            PersistentVolumeClaimBuilder builder = new PersistentVolumeClaimBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.volumeClaimTemplates.add(index >= 0 ? index : volumeClaimTemplates.size(), builder); return (A)this;
    }

    public A setToVolumeClaimTemplates(int index,PersistentVolumeClaim item){
            if (this.volumeClaimTemplates == null) {this.volumeClaimTemplates = new ArrayList<PersistentVolumeClaimBuilder>();}
            PersistentVolumeClaimBuilder builder = new PersistentVolumeClaimBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= volumeClaimTemplates.size()) { volumeClaimTemplates.add(builder); } else { volumeClaimTemplates.set(index, builder);}
             return (A)this;
    }

    public A addToVolumeClaimTemplates(PersistentVolumeClaim... items){
            if (this.volumeClaimTemplates == null) {this.volumeClaimTemplates = new ArrayList<PersistentVolumeClaimBuilder>();}
            for (PersistentVolumeClaim item : items) {PersistentVolumeClaimBuilder builder = new PersistentVolumeClaimBuilder(item);_visitables.add(builder);this.volumeClaimTemplates.add(builder);} return (A)this;
    }

    public A addAllToVolumeClaimTemplates(Collection<PersistentVolumeClaim> items){
            if (this.volumeClaimTemplates == null) {this.volumeClaimTemplates = new ArrayList<PersistentVolumeClaimBuilder>();}
            for (PersistentVolumeClaim item : items) {PersistentVolumeClaimBuilder builder = new PersistentVolumeClaimBuilder(item);_visitables.add(builder);this.volumeClaimTemplates.add(builder);} return (A)this;
    }

    public A removeFromVolumeClaimTemplates(PersistentVolumeClaim... items){
            for (PersistentVolumeClaim item : items) {PersistentVolumeClaimBuilder builder = new PersistentVolumeClaimBuilder(item);_visitables.remove(builder);if (this.volumeClaimTemplates != null) {this.volumeClaimTemplates.remove(builder);}} return (A)this;
    }

    public A removeAllFromVolumeClaimTemplates(Collection<PersistentVolumeClaim> items){
            for (PersistentVolumeClaim item : items) {PersistentVolumeClaimBuilder builder = new PersistentVolumeClaimBuilder(item);_visitables.remove(builder);if (this.volumeClaimTemplates != null) {this.volumeClaimTemplates.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildVolumeClaimTemplates instead.
 * @return The buildable object.
 */
@Deprecated public List<PersistentVolumeClaim> getVolumeClaimTemplates(){
            return build(volumeClaimTemplates);
    }

    public List<PersistentVolumeClaim> buildVolumeClaimTemplates(){
            return build(volumeClaimTemplates);
    }

    public PersistentVolumeClaim buildVolumeClaimTemplate(int index){
            return this.volumeClaimTemplates.get(index).build();
    }

    public PersistentVolumeClaim buildFirstVolumeClaimTemplate(){
            return this.volumeClaimTemplates.get(0).build();
    }

    public PersistentVolumeClaim buildLastVolumeClaimTemplate(){
            return this.volumeClaimTemplates.get(volumeClaimTemplates.size() - 1).build();
    }

    public PersistentVolumeClaim buildMatchingVolumeClaimTemplate(io.fabric8.kubernetes.api.builder.Predicate<PersistentVolumeClaimBuilder> predicate){
            for (PersistentVolumeClaimBuilder item: volumeClaimTemplates) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withVolumeClaimTemplates(List<PersistentVolumeClaim> volumeClaimTemplates){
            if (this.volumeClaimTemplates != null) { _visitables.removeAll(this.volumeClaimTemplates);}
            if (volumeClaimTemplates != null) {this.volumeClaimTemplates = new ArrayList<PersistentVolumeClaimBuilder>(); for (PersistentVolumeClaim item : volumeClaimTemplates){this.addToVolumeClaimTemplates(item);}} else { this.volumeClaimTemplates = new ArrayList<PersistentVolumeClaimBuilder>();} return (A) this;
    }

    public A withVolumeClaimTemplates(PersistentVolumeClaim... volumeClaimTemplates){
            if (this.volumeClaimTemplates != null) {this.volumeClaimTemplates.clear();}
            if (volumeClaimTemplates != null) {for (PersistentVolumeClaim item :volumeClaimTemplates){ this.addToVolumeClaimTemplates(item);}} return (A) this;
    }

    public Boolean hasVolumeClaimTemplates(){
            return volumeClaimTemplates != null && !volumeClaimTemplates.isEmpty();
    }

    public StatefulSetSpecFluent.VolumeClaimTemplatesNested<A> addNewVolumeClaimTemplate(){
            return new VolumeClaimTemplatesNestedImpl();
    }

    public StatefulSetSpecFluent.VolumeClaimTemplatesNested<A> addNewVolumeClaimTemplateLike(PersistentVolumeClaim item){
            return new VolumeClaimTemplatesNestedImpl(-1, item);
    }

    public StatefulSetSpecFluent.VolumeClaimTemplatesNested<A> setNewVolumeClaimTemplateLike(int index,PersistentVolumeClaim item){
            return new VolumeClaimTemplatesNestedImpl(index, item);
    }

    public StatefulSetSpecFluent.VolumeClaimTemplatesNested<A> editVolumeClaimTemplate(int index){
            if (volumeClaimTemplates.size() <= index) throw new RuntimeException("Can't edit volumeClaimTemplates. Index exceeds size.");
            return setNewVolumeClaimTemplateLike(index, buildVolumeClaimTemplate(index));
    }

    public StatefulSetSpecFluent.VolumeClaimTemplatesNested<A> editFirstVolumeClaimTemplate(){
            if (volumeClaimTemplates.size() == 0) throw new RuntimeException("Can't edit first volumeClaimTemplates. The list is empty.");
            return setNewVolumeClaimTemplateLike(0, buildVolumeClaimTemplate(0));
    }

    public StatefulSetSpecFluent.VolumeClaimTemplatesNested<A> editLastVolumeClaimTemplate(){
            int index = volumeClaimTemplates.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last volumeClaimTemplates. The list is empty.");
            return setNewVolumeClaimTemplateLike(index, buildVolumeClaimTemplate(index));
    }

    public StatefulSetSpecFluent.VolumeClaimTemplatesNested<A> editMatchingVolumeClaimTemplate(io.fabric8.kubernetes.api.builder.Predicate<PersistentVolumeClaimBuilder> predicate){
            int index = -1;
            for (int i=0;i<volumeClaimTemplates.size();i++) { 
            if (predicate.apply(volumeClaimTemplates.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching volumeClaimTemplates. No match found.");
            return setNewVolumeClaimTemplateLike(index, buildVolumeClaimTemplate(index));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            StatefulSetSpecFluentImpl that = (StatefulSetSpecFluentImpl) o;
            if (podManagementPolicy != null ? !podManagementPolicy.equals(that.podManagementPolicy) :that.podManagementPolicy != null) return false;
            if (replicas != null ? !replicas.equals(that.replicas) :that.replicas != null) return false;
            if (revisionHistoryLimit != null ? !revisionHistoryLimit.equals(that.revisionHistoryLimit) :that.revisionHistoryLimit != null) return false;
            if (selector != null ? !selector.equals(that.selector) :that.selector != null) return false;
            if (serviceName != null ? !serviceName.equals(that.serviceName) :that.serviceName != null) return false;
            if (template != null ? !template.equals(that.template) :that.template != null) return false;
            if (updateStrategy != null ? !updateStrategy.equals(that.updateStrategy) :that.updateStrategy != null) return false;
            if (volumeClaimTemplates != null ? !volumeClaimTemplates.equals(that.volumeClaimTemplates) :that.volumeClaimTemplates != null) return false;
            return true;
    }


    public class SelectorNestedImpl<N> extends LabelSelectorFluentImpl<StatefulSetSpecFluent.SelectorNested<N>> implements StatefulSetSpecFluent.SelectorNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LabelSelectorBuilder builder;
    
            SelectorNestedImpl(LabelSelector item){
                    this.builder = new LabelSelectorBuilder(this, item);
            }
            SelectorNestedImpl(){
                    this.builder = new LabelSelectorBuilder(this);
            }
    
    public N and(){
            return (N) StatefulSetSpecFluentImpl.this.withSelector(builder.build());
    }
    public N endSelector(){
            return and();
    }

}
    public class TemplateNestedImpl<N> extends PodTemplateSpecFluentImpl<StatefulSetSpecFluent.TemplateNested<N>> implements StatefulSetSpecFluent.TemplateNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodTemplateSpecBuilder builder;
    
            TemplateNestedImpl(PodTemplateSpec item){
                    this.builder = new PodTemplateSpecBuilder(this, item);
            }
            TemplateNestedImpl(){
                    this.builder = new PodTemplateSpecBuilder(this);
            }
    
    public N and(){
            return (N) StatefulSetSpecFluentImpl.this.withTemplate(builder.build());
    }
    public N endTemplate(){
            return and();
    }

}
    public class UpdateStrategyNestedImpl<N> extends StatefulSetUpdateStrategyFluentImpl<StatefulSetSpecFluent.UpdateStrategyNested<N>> implements StatefulSetSpecFluent.UpdateStrategyNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StatefulSetUpdateStrategyBuilder builder;
    
            UpdateStrategyNestedImpl(StatefulSetUpdateStrategy item){
                    this.builder = new StatefulSetUpdateStrategyBuilder(this, item);
            }
            UpdateStrategyNestedImpl(){
                    this.builder = new StatefulSetUpdateStrategyBuilder(this);
            }
    
    public N and(){
            return (N) StatefulSetSpecFluentImpl.this.withUpdateStrategy(builder.build());
    }
    public N endUpdateStrategy(){
            return and();
    }

}
    public class VolumeClaimTemplatesNestedImpl<N> extends PersistentVolumeClaimFluentImpl<StatefulSetSpecFluent.VolumeClaimTemplatesNested<N>> implements StatefulSetSpecFluent.VolumeClaimTemplatesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PersistentVolumeClaimBuilder builder;
        private final int index;
    
            VolumeClaimTemplatesNestedImpl(int index,PersistentVolumeClaim item){
                    this.index = index;
                    this.builder = new PersistentVolumeClaimBuilder(this, item);
            }
            VolumeClaimTemplatesNestedImpl(){
                    this.index = -1;
                    this.builder = new PersistentVolumeClaimBuilder(this);
            }
    
    public N and(){
            return (N) StatefulSetSpecFluentImpl.this.setToVolumeClaimTemplates(index, builder.build());
    }
    public N endVolumeClaimTemplate(){
            return and();
    }

}


}
