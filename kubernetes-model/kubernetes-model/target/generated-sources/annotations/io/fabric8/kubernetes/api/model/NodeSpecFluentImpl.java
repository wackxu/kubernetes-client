package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;

public class NodeSpecFluentImpl<A extends NodeSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements NodeSpecFluent<A>{

    private NodeConfigSourceBuilder configSource;
    private String externalID;
    private String podCIDR;
    private String providerID;
    private List<TaintBuilder> taints;
    private Boolean unschedulable;

    public NodeSpecFluentImpl(){
    }
    public NodeSpecFluentImpl(NodeSpec instance){
            this.withConfigSource(instance.getConfigSource()); 
            this.withExternalID(instance.getExternalID()); 
            this.withPodCIDR(instance.getPodCIDR()); 
            this.withProviderID(instance.getProviderID()); 
            this.withTaints(instance.getTaints()); 
            this.withUnschedulable(instance.getUnschedulable()); 
    }

    
/**
 * This method has been deprecated, please use method buildConfigSource instead.
 * @return The buildable object.
 */
@Deprecated public NodeConfigSource getConfigSource(){
            return this.configSource!=null?this.configSource.build():null;
    }

    public NodeConfigSource buildConfigSource(){
            return this.configSource!=null?this.configSource.build():null;
    }

    public A withConfigSource(NodeConfigSource configSource){
            _visitables.remove(this.configSource);
            if (configSource!=null){ this.configSource= new NodeConfigSourceBuilder(configSource); _visitables.add(this.configSource);} return (A) this;
    }

    public Boolean hasConfigSource(){
            return this.configSource != null;
    }

    public NodeSpecFluent.ConfigSourceNested<A> withNewConfigSource(){
            return new ConfigSourceNestedImpl();
    }

    public NodeSpecFluent.ConfigSourceNested<A> withNewConfigSourceLike(NodeConfigSource item){
            return new ConfigSourceNestedImpl(item);
    }

    public NodeSpecFluent.ConfigSourceNested<A> editConfigSource(){
            return withNewConfigSourceLike(getConfigSource());
    }

    public NodeSpecFluent.ConfigSourceNested<A> editOrNewConfigSource(){
            return withNewConfigSourceLike(getConfigSource() != null ? getConfigSource(): new NodeConfigSourceBuilder().build());
    }

    public NodeSpecFluent.ConfigSourceNested<A> editOrNewConfigSourceLike(NodeConfigSource item){
            return withNewConfigSourceLike(getConfigSource() != null ? getConfigSource(): item);
    }

    public String getExternalID(){
            return this.externalID;
    }

    public A withExternalID(String externalID){
            this.externalID=externalID; return (A) this;
    }

    public Boolean hasExternalID(){
            return this.externalID != null;
    }

    public String getPodCIDR(){
            return this.podCIDR;
    }

    public A withPodCIDR(String podCIDR){
            this.podCIDR=podCIDR; return (A) this;
    }

    public Boolean hasPodCIDR(){
            return this.podCIDR != null;
    }

    public String getProviderID(){
            return this.providerID;
    }

    public A withProviderID(String providerID){
            this.providerID=providerID; return (A) this;
    }

    public Boolean hasProviderID(){
            return this.providerID != null;
    }

    public A addToTaints(int index,Taint item){
            if (this.taints == null) {this.taints = new ArrayList<TaintBuilder>();}
            TaintBuilder builder = new TaintBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.taints.add(index >= 0 ? index : taints.size(), builder); return (A)this;
    }

    public A setToTaints(int index,Taint item){
            if (this.taints == null) {this.taints = new ArrayList<TaintBuilder>();}
            TaintBuilder builder = new TaintBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= taints.size()) { taints.add(builder); } else { taints.set(index, builder);}
             return (A)this;
    }

    public A addToTaints(Taint... items){
            if (this.taints == null) {this.taints = new ArrayList<TaintBuilder>();}
            for (Taint item : items) {TaintBuilder builder = new TaintBuilder(item);_visitables.add(builder);this.taints.add(builder);} return (A)this;
    }

    public A addAllToTaints(Collection<Taint> items){
            if (this.taints == null) {this.taints = new ArrayList<TaintBuilder>();}
            for (Taint item : items) {TaintBuilder builder = new TaintBuilder(item);_visitables.add(builder);this.taints.add(builder);} return (A)this;
    }

    public A removeFromTaints(Taint... items){
            for (Taint item : items) {TaintBuilder builder = new TaintBuilder(item);_visitables.remove(builder);if (this.taints != null) {this.taints.remove(builder);}} return (A)this;
    }

    public A removeAllFromTaints(Collection<Taint> items){
            for (Taint item : items) {TaintBuilder builder = new TaintBuilder(item);_visitables.remove(builder);if (this.taints != null) {this.taints.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildTaints instead.
 * @return The buildable object.
 */
@Deprecated public List<Taint> getTaints(){
            return build(taints);
    }

    public List<Taint> buildTaints(){
            return build(taints);
    }

    public Taint buildTaint(int index){
            return this.taints.get(index).build();
    }

    public Taint buildFirstTaint(){
            return this.taints.get(0).build();
    }

    public Taint buildLastTaint(){
            return this.taints.get(taints.size() - 1).build();
    }

    public Taint buildMatchingTaint(io.fabric8.kubernetes.api.builder.Predicate<TaintBuilder> predicate){
            for (TaintBuilder item: taints) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withTaints(List<Taint> taints){
            if (this.taints != null) { _visitables.removeAll(this.taints);}
            if (taints != null) {this.taints = new ArrayList<TaintBuilder>(); for (Taint item : taints){this.addToTaints(item);}} else { this.taints = new ArrayList<TaintBuilder>();} return (A) this;
    }

    public A withTaints(Taint... taints){
            if (this.taints != null) {this.taints.clear();}
            if (taints != null) {for (Taint item :taints){ this.addToTaints(item);}} return (A) this;
    }

    public Boolean hasTaints(){
            return taints != null && !taints.isEmpty();
    }

    public A addNewTaint(String effect,String key,String timeAdded,String value){
            return (A)addToTaints(new Taint(effect, key, timeAdded, value));
    }

    public NodeSpecFluent.TaintsNested<A> addNewTaint(){
            return new TaintsNestedImpl();
    }

    public NodeSpecFluent.TaintsNested<A> addNewTaintLike(Taint item){
            return new TaintsNestedImpl(-1, item);
    }

    public NodeSpecFluent.TaintsNested<A> setNewTaintLike(int index,Taint item){
            return new TaintsNestedImpl(index, item);
    }

    public NodeSpecFluent.TaintsNested<A> editTaint(int index){
            if (taints.size() <= index) throw new RuntimeException("Can't edit taints. Index exceeds size.");
            return setNewTaintLike(index, buildTaint(index));
    }

    public NodeSpecFluent.TaintsNested<A> editFirstTaint(){
            if (taints.size() == 0) throw new RuntimeException("Can't edit first taints. The list is empty.");
            return setNewTaintLike(0, buildTaint(0));
    }

    public NodeSpecFluent.TaintsNested<A> editLastTaint(){
            int index = taints.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last taints. The list is empty.");
            return setNewTaintLike(index, buildTaint(index));
    }

    public NodeSpecFluent.TaintsNested<A> editMatchingTaint(io.fabric8.kubernetes.api.builder.Predicate<TaintBuilder> predicate){
            int index = -1;
            for (int i=0;i<taints.size();i++) { 
            if (predicate.apply(taints.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching taints. No match found.");
            return setNewTaintLike(index, buildTaint(index));
    }

    public Boolean isUnschedulable(){
            return this.unschedulable;
    }

    public A withUnschedulable(Boolean unschedulable){
            this.unschedulable=unschedulable; return (A) this;
    }

    public Boolean hasUnschedulable(){
            return this.unschedulable != null;
    }

    public A withNewUnschedulable(String arg1){
            return (A)withUnschedulable(new Boolean(arg1));
    }

    public A withNewUnschedulable(boolean arg1){
            return (A)withUnschedulable(new Boolean(arg1));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NodeSpecFluentImpl that = (NodeSpecFluentImpl) o;
            if (configSource != null ? !configSource.equals(that.configSource) :that.configSource != null) return false;
            if (externalID != null ? !externalID.equals(that.externalID) :that.externalID != null) return false;
            if (podCIDR != null ? !podCIDR.equals(that.podCIDR) :that.podCIDR != null) return false;
            if (providerID != null ? !providerID.equals(that.providerID) :that.providerID != null) return false;
            if (taints != null ? !taints.equals(that.taints) :that.taints != null) return false;
            if (unschedulable != null ? !unschedulable.equals(that.unschedulable) :that.unschedulable != null) return false;
            return true;
    }


    public class ConfigSourceNestedImpl<N> extends NodeConfigSourceFluentImpl<NodeSpecFluent.ConfigSourceNested<N>> implements NodeSpecFluent.ConfigSourceNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NodeConfigSourceBuilder builder;
    
            ConfigSourceNestedImpl(NodeConfigSource item){
                    this.builder = new NodeConfigSourceBuilder(this, item);
            }
            ConfigSourceNestedImpl(){
                    this.builder = new NodeConfigSourceBuilder(this);
            }
    
    public N and(){
            return (N) NodeSpecFluentImpl.this.withConfigSource(builder.build());
    }
    public N endConfigSource(){
            return and();
    }

}
    public class TaintsNestedImpl<N> extends TaintFluentImpl<NodeSpecFluent.TaintsNested<N>> implements NodeSpecFluent.TaintsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TaintBuilder builder;
        private final int index;
    
            TaintsNestedImpl(int index,Taint item){
                    this.index = index;
                    this.builder = new TaintBuilder(this, item);
            }
            TaintsNestedImpl(){
                    this.index = -1;
                    this.builder = new TaintBuilder(this);
            }
    
    public N and(){
            return (N) NodeSpecFluentImpl.this.setToTaints(index, builder.build());
    }
    public N endTaint(){
            return and();
    }

}


}
