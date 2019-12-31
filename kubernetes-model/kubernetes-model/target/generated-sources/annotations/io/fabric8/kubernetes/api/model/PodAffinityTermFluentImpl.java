package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class PodAffinityTermFluentImpl<A extends PodAffinityTermFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements PodAffinityTermFluent<A>{

    private LabelSelectorBuilder labelSelector;
    private List<String> namespaces;
    private String topologyKey;

    public PodAffinityTermFluentImpl(){
    }
    public PodAffinityTermFluentImpl(PodAffinityTerm instance){
            this.withLabelSelector(instance.getLabelSelector()); 
            this.withNamespaces(instance.getNamespaces()); 
            this.withTopologyKey(instance.getTopologyKey()); 
    }

    
/**
 * This method has been deprecated, please use method buildLabelSelector instead.
 * @return The buildable object.
 */
@Deprecated public LabelSelector getLabelSelector(){
            return this.labelSelector!=null?this.labelSelector.build():null;
    }

    public LabelSelector buildLabelSelector(){
            return this.labelSelector!=null?this.labelSelector.build():null;
    }

    public A withLabelSelector(LabelSelector labelSelector){
            _visitables.remove(this.labelSelector);
            if (labelSelector!=null){ this.labelSelector= new LabelSelectorBuilder(labelSelector); _visitables.add(this.labelSelector);} return (A) this;
    }

    public Boolean hasLabelSelector(){
            return this.labelSelector != null;
    }

    public PodAffinityTermFluent.LabelSelectorNested<A> withNewLabelSelector(){
            return new LabelSelectorNestedImpl();
    }

    public PodAffinityTermFluent.LabelSelectorNested<A> withNewLabelSelectorLike(LabelSelector item){
            return new LabelSelectorNestedImpl(item);
    }

    public PodAffinityTermFluent.LabelSelectorNested<A> editLabelSelector(){
            return withNewLabelSelectorLike(getLabelSelector());
    }

    public PodAffinityTermFluent.LabelSelectorNested<A> editOrNewLabelSelector(){
            return withNewLabelSelectorLike(getLabelSelector() != null ? getLabelSelector(): new LabelSelectorBuilder().build());
    }

    public PodAffinityTermFluent.LabelSelectorNested<A> editOrNewLabelSelectorLike(LabelSelector item){
            return withNewLabelSelectorLike(getLabelSelector() != null ? getLabelSelector(): item);
    }

    public A addToNamespaces(int index,String item){
            if (this.namespaces == null) {this.namespaces = new ArrayList<String>();}
            this.namespaces.add(index, item);
            return (A)this;
    }

    public A setToNamespaces(int index,String item){
            if (this.namespaces == null) {this.namespaces = new ArrayList<String>();}
            this.namespaces.set(index, item); return (A)this;
    }

    public A addToNamespaces(String... items){
            if (this.namespaces == null) {this.namespaces = new ArrayList<String>();}
            for (String item : items) {this.namespaces.add(item);} return (A)this;
    }

    public A addAllToNamespaces(Collection<String> items){
            if (this.namespaces == null) {this.namespaces = new ArrayList<String>();}
            for (String item : items) {this.namespaces.add(item);} return (A)this;
    }

    public A removeFromNamespaces(String... items){
            for (String item : items) {if (this.namespaces!= null){ this.namespaces.remove(item);}} return (A)this;
    }

    public A removeAllFromNamespaces(Collection<String> items){
            for (String item : items) {if (this.namespaces!= null){ this.namespaces.remove(item);}} return (A)this;
    }

    public List<String> getNamespaces(){
            return this.namespaces;
    }

    public String getNamespace(int index){
            return this.namespaces.get(index);
    }

    public String getFirstNamespace(){
            return this.namespaces.get(0);
    }

    public String getLastNamespace(){
            return this.namespaces.get(namespaces.size() - 1);
    }

    public String getMatchingNamespace(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: namespaces) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withNamespaces(List<String> namespaces){
            if (this.namespaces != null) { _visitables.removeAll(this.namespaces);}
            if (namespaces != null) {this.namespaces = new ArrayList<String>(); for (String item : namespaces){this.addToNamespaces(item);}} else { this.namespaces = new ArrayList<String>();} return (A) this;
    }

    public A withNamespaces(String... namespaces){
            if (this.namespaces != null) {this.namespaces.clear();}
            if (namespaces != null) {for (String item :namespaces){ this.addToNamespaces(item);}} return (A) this;
    }

    public Boolean hasNamespaces(){
            return namespaces != null && !namespaces.isEmpty();
    }

    public String getTopologyKey(){
            return this.topologyKey;
    }

    public A withTopologyKey(String topologyKey){
            this.topologyKey=topologyKey; return (A) this;
    }

    public Boolean hasTopologyKey(){
            return this.topologyKey != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PodAffinityTermFluentImpl that = (PodAffinityTermFluentImpl) o;
            if (labelSelector != null ? !labelSelector.equals(that.labelSelector) :that.labelSelector != null) return false;
            if (namespaces != null ? !namespaces.equals(that.namespaces) :that.namespaces != null) return false;
            if (topologyKey != null ? !topologyKey.equals(that.topologyKey) :that.topologyKey != null) return false;
            return true;
    }


    public class LabelSelectorNestedImpl<N> extends LabelSelectorFluentImpl<PodAffinityTermFluent.LabelSelectorNested<N>> implements PodAffinityTermFluent.LabelSelectorNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LabelSelectorBuilder builder;
    
            LabelSelectorNestedImpl(LabelSelector item){
                    this.builder = new LabelSelectorBuilder(this, item);
            }
            LabelSelectorNestedImpl(){
                    this.builder = new LabelSelectorBuilder(this);
            }
    
    public N and(){
            return (N) PodAffinityTermFluentImpl.this.withLabelSelector(builder.build());
    }
    public N endLabelSelector(){
            return and();
    }

}


}
