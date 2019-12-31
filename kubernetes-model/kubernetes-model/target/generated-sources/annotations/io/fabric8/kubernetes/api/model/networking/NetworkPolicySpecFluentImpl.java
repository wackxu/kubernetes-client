package io.fabric8.kubernetes.api.model.networking;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.LabelSelectorFluentImpl;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.LabelSelectorBuilder;
import io.fabric8.kubernetes.api.model.LabelSelector;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;

public class NetworkPolicySpecFluentImpl<A extends NetworkPolicySpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements NetworkPolicySpecFluent<A>{

    private List<NetworkPolicyEgressRuleBuilder> egress;
    private List<NetworkPolicyIngressRuleBuilder> ingress;
    private LabelSelectorBuilder podSelector;
    private List<String> policyTypes;

    public NetworkPolicySpecFluentImpl(){
    }
    public NetworkPolicySpecFluentImpl(NetworkPolicySpec instance){
            this.withEgress(instance.getEgress()); 
            this.withIngress(instance.getIngress()); 
            this.withPodSelector(instance.getPodSelector()); 
            this.withPolicyTypes(instance.getPolicyTypes()); 
    }

    public A addToEgress(int index,NetworkPolicyEgressRule item){
            if (this.egress == null) {this.egress = new ArrayList<NetworkPolicyEgressRuleBuilder>();}
            NetworkPolicyEgressRuleBuilder builder = new NetworkPolicyEgressRuleBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.egress.add(index >= 0 ? index : egress.size(), builder); return (A)this;
    }

    public A setToEgress(int index,NetworkPolicyEgressRule item){
            if (this.egress == null) {this.egress = new ArrayList<NetworkPolicyEgressRuleBuilder>();}
            NetworkPolicyEgressRuleBuilder builder = new NetworkPolicyEgressRuleBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= egress.size()) { egress.add(builder); } else { egress.set(index, builder);}
             return (A)this;
    }

    public A addToEgress(NetworkPolicyEgressRule... items){
            if (this.egress == null) {this.egress = new ArrayList<NetworkPolicyEgressRuleBuilder>();}
            for (NetworkPolicyEgressRule item : items) {NetworkPolicyEgressRuleBuilder builder = new NetworkPolicyEgressRuleBuilder(item);_visitables.add(builder);this.egress.add(builder);} return (A)this;
    }

    public A addAllToEgress(Collection<NetworkPolicyEgressRule> items){
            if (this.egress == null) {this.egress = new ArrayList<NetworkPolicyEgressRuleBuilder>();}
            for (NetworkPolicyEgressRule item : items) {NetworkPolicyEgressRuleBuilder builder = new NetworkPolicyEgressRuleBuilder(item);_visitables.add(builder);this.egress.add(builder);} return (A)this;
    }

    public A removeFromEgress(NetworkPolicyEgressRule... items){
            for (NetworkPolicyEgressRule item : items) {NetworkPolicyEgressRuleBuilder builder = new NetworkPolicyEgressRuleBuilder(item);_visitables.remove(builder);if (this.egress != null) {this.egress.remove(builder);}} return (A)this;
    }

    public A removeAllFromEgress(Collection<NetworkPolicyEgressRule> items){
            for (NetworkPolicyEgressRule item : items) {NetworkPolicyEgressRuleBuilder builder = new NetworkPolicyEgressRuleBuilder(item);_visitables.remove(builder);if (this.egress != null) {this.egress.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildEgress instead.
 * @return The buildable object.
 */
@Deprecated public List<NetworkPolicyEgressRule> getEgress(){
            return build(egress);
    }

    public List<NetworkPolicyEgressRule> buildEgress(){
            return build(egress);
    }

    public NetworkPolicyEgressRule buildEgress(int index){
            return this.egress.get(index).build();
    }

    public NetworkPolicyEgressRule buildFirstEgress(){
            return this.egress.get(0).build();
    }

    public NetworkPolicyEgressRule buildLastEgress(){
            return this.egress.get(egress.size() - 1).build();
    }

    public NetworkPolicyEgressRule buildMatchingEgress(io.fabric8.kubernetes.api.builder.Predicate<NetworkPolicyEgressRuleBuilder> predicate){
            for (NetworkPolicyEgressRuleBuilder item: egress) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withEgress(List<NetworkPolicyEgressRule> egress){
            if (this.egress != null) { _visitables.removeAll(this.egress);}
            if (egress != null) {this.egress = new ArrayList<NetworkPolicyEgressRuleBuilder>(); for (NetworkPolicyEgressRule item : egress){this.addToEgress(item);}} else { this.egress = new ArrayList<NetworkPolicyEgressRuleBuilder>();} return (A) this;
    }

    public A withEgress(NetworkPolicyEgressRule... egress){
            if (this.egress != null) {this.egress.clear();}
            if (egress != null) {for (NetworkPolicyEgressRule item :egress){ this.addToEgress(item);}} return (A) this;
    }

    public Boolean hasEgress(){
            return egress != null && !egress.isEmpty();
    }

    public NetworkPolicySpecFluent.EgressNested<A> addNewEgress(){
            return new EgressNestedImpl();
    }

    public NetworkPolicySpecFluent.EgressNested<A> addNewEgressLike(NetworkPolicyEgressRule item){
            return new EgressNestedImpl(-1, item);
    }

    public NetworkPolicySpecFluent.EgressNested<A> setNewEgressLike(int index,NetworkPolicyEgressRule item){
            return new EgressNestedImpl(index, item);
    }

    public NetworkPolicySpecFluent.EgressNested<A> editEgress(int index){
            if (egress.size() <= index) throw new RuntimeException("Can't edit egress. Index exceeds size.");
            return setNewEgressLike(index, buildEgress(index));
    }

    public NetworkPolicySpecFluent.EgressNested<A> editFirstEgress(){
            if (egress.size() == 0) throw new RuntimeException("Can't edit first egress. The list is empty.");
            return setNewEgressLike(0, buildEgress(0));
    }

    public NetworkPolicySpecFluent.EgressNested<A> editLastEgress(){
            int index = egress.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last egress. The list is empty.");
            return setNewEgressLike(index, buildEgress(index));
    }

    public NetworkPolicySpecFluent.EgressNested<A> editMatchingEgress(io.fabric8.kubernetes.api.builder.Predicate<NetworkPolicyEgressRuleBuilder> predicate){
            int index = -1;
            for (int i=0;i<egress.size();i++) { 
            if (predicate.apply(egress.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching egress. No match found.");
            return setNewEgressLike(index, buildEgress(index));
    }

    public A addToIngress(int index,NetworkPolicyIngressRule item){
            if (this.ingress == null) {this.ingress = new ArrayList<NetworkPolicyIngressRuleBuilder>();}
            NetworkPolicyIngressRuleBuilder builder = new NetworkPolicyIngressRuleBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.ingress.add(index >= 0 ? index : ingress.size(), builder); return (A)this;
    }

    public A setToIngress(int index,NetworkPolicyIngressRule item){
            if (this.ingress == null) {this.ingress = new ArrayList<NetworkPolicyIngressRuleBuilder>();}
            NetworkPolicyIngressRuleBuilder builder = new NetworkPolicyIngressRuleBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= ingress.size()) { ingress.add(builder); } else { ingress.set(index, builder);}
             return (A)this;
    }

    public A addToIngress(NetworkPolicyIngressRule... items){
            if (this.ingress == null) {this.ingress = new ArrayList<NetworkPolicyIngressRuleBuilder>();}
            for (NetworkPolicyIngressRule item : items) {NetworkPolicyIngressRuleBuilder builder = new NetworkPolicyIngressRuleBuilder(item);_visitables.add(builder);this.ingress.add(builder);} return (A)this;
    }

    public A addAllToIngress(Collection<NetworkPolicyIngressRule> items){
            if (this.ingress == null) {this.ingress = new ArrayList<NetworkPolicyIngressRuleBuilder>();}
            for (NetworkPolicyIngressRule item : items) {NetworkPolicyIngressRuleBuilder builder = new NetworkPolicyIngressRuleBuilder(item);_visitables.add(builder);this.ingress.add(builder);} return (A)this;
    }

    public A removeFromIngress(NetworkPolicyIngressRule... items){
            for (NetworkPolicyIngressRule item : items) {NetworkPolicyIngressRuleBuilder builder = new NetworkPolicyIngressRuleBuilder(item);_visitables.remove(builder);if (this.ingress != null) {this.ingress.remove(builder);}} return (A)this;
    }

    public A removeAllFromIngress(Collection<NetworkPolicyIngressRule> items){
            for (NetworkPolicyIngressRule item : items) {NetworkPolicyIngressRuleBuilder builder = new NetworkPolicyIngressRuleBuilder(item);_visitables.remove(builder);if (this.ingress != null) {this.ingress.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildIngress instead.
 * @return The buildable object.
 */
@Deprecated public List<NetworkPolicyIngressRule> getIngress(){
            return build(ingress);
    }

    public List<NetworkPolicyIngressRule> buildIngress(){
            return build(ingress);
    }

    public NetworkPolicyIngressRule buildIngress(int index){
            return this.ingress.get(index).build();
    }

    public NetworkPolicyIngressRule buildFirstIngress(){
            return this.ingress.get(0).build();
    }

    public NetworkPolicyIngressRule buildLastIngress(){
            return this.ingress.get(ingress.size() - 1).build();
    }

    public NetworkPolicyIngressRule buildMatchingIngress(io.fabric8.kubernetes.api.builder.Predicate<NetworkPolicyIngressRuleBuilder> predicate){
            for (NetworkPolicyIngressRuleBuilder item: ingress) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withIngress(List<NetworkPolicyIngressRule> ingress){
            if (this.ingress != null) { _visitables.removeAll(this.ingress);}
            if (ingress != null) {this.ingress = new ArrayList<NetworkPolicyIngressRuleBuilder>(); for (NetworkPolicyIngressRule item : ingress){this.addToIngress(item);}} else { this.ingress = new ArrayList<NetworkPolicyIngressRuleBuilder>();} return (A) this;
    }

    public A withIngress(NetworkPolicyIngressRule... ingress){
            if (this.ingress != null) {this.ingress.clear();}
            if (ingress != null) {for (NetworkPolicyIngressRule item :ingress){ this.addToIngress(item);}} return (A) this;
    }

    public Boolean hasIngress(){
            return ingress != null && !ingress.isEmpty();
    }

    public NetworkPolicySpecFluent.IngressNested<A> addNewIngress(){
            return new IngressNestedImpl();
    }

    public NetworkPolicySpecFluent.IngressNested<A> addNewIngressLike(NetworkPolicyIngressRule item){
            return new IngressNestedImpl(-1, item);
    }

    public NetworkPolicySpecFluent.IngressNested<A> setNewIngressLike(int index,NetworkPolicyIngressRule item){
            return new IngressNestedImpl(index, item);
    }

    public NetworkPolicySpecFluent.IngressNested<A> editIngress(int index){
            if (ingress.size() <= index) throw new RuntimeException("Can't edit ingress. Index exceeds size.");
            return setNewIngressLike(index, buildIngress(index));
    }

    public NetworkPolicySpecFluent.IngressNested<A> editFirstIngress(){
            if (ingress.size() == 0) throw new RuntimeException("Can't edit first ingress. The list is empty.");
            return setNewIngressLike(0, buildIngress(0));
    }

    public NetworkPolicySpecFluent.IngressNested<A> editLastIngress(){
            int index = ingress.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last ingress. The list is empty.");
            return setNewIngressLike(index, buildIngress(index));
    }

    public NetworkPolicySpecFluent.IngressNested<A> editMatchingIngress(io.fabric8.kubernetes.api.builder.Predicate<NetworkPolicyIngressRuleBuilder> predicate){
            int index = -1;
            for (int i=0;i<ingress.size();i++) { 
            if (predicate.apply(ingress.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching ingress. No match found.");
            return setNewIngressLike(index, buildIngress(index));
    }

    
/**
 * This method has been deprecated, please use method buildPodSelector instead.
 * @return The buildable object.
 */
@Deprecated public LabelSelector getPodSelector(){
            return this.podSelector!=null?this.podSelector.build():null;
    }

    public LabelSelector buildPodSelector(){
            return this.podSelector!=null?this.podSelector.build():null;
    }

    public A withPodSelector(LabelSelector podSelector){
            _visitables.remove(this.podSelector);
            if (podSelector!=null){ this.podSelector= new LabelSelectorBuilder(podSelector); _visitables.add(this.podSelector);} return (A) this;
    }

    public Boolean hasPodSelector(){
            return this.podSelector != null;
    }

    public NetworkPolicySpecFluent.PodSelectorNested<A> withNewPodSelector(){
            return new PodSelectorNestedImpl();
    }

    public NetworkPolicySpecFluent.PodSelectorNested<A> withNewPodSelectorLike(LabelSelector item){
            return new PodSelectorNestedImpl(item);
    }

    public NetworkPolicySpecFluent.PodSelectorNested<A> editPodSelector(){
            return withNewPodSelectorLike(getPodSelector());
    }

    public NetworkPolicySpecFluent.PodSelectorNested<A> editOrNewPodSelector(){
            return withNewPodSelectorLike(getPodSelector() != null ? getPodSelector(): new LabelSelectorBuilder().build());
    }

    public NetworkPolicySpecFluent.PodSelectorNested<A> editOrNewPodSelectorLike(LabelSelector item){
            return withNewPodSelectorLike(getPodSelector() != null ? getPodSelector(): item);
    }

    public A addToPolicyTypes(int index,String item){
            if (this.policyTypes == null) {this.policyTypes = new ArrayList<String>();}
            this.policyTypes.add(index, item);
            return (A)this;
    }

    public A setToPolicyTypes(int index,String item){
            if (this.policyTypes == null) {this.policyTypes = new ArrayList<String>();}
            this.policyTypes.set(index, item); return (A)this;
    }

    public A addToPolicyTypes(String... items){
            if (this.policyTypes == null) {this.policyTypes = new ArrayList<String>();}
            for (String item : items) {this.policyTypes.add(item);} return (A)this;
    }

    public A addAllToPolicyTypes(Collection<String> items){
            if (this.policyTypes == null) {this.policyTypes = new ArrayList<String>();}
            for (String item : items) {this.policyTypes.add(item);} return (A)this;
    }

    public A removeFromPolicyTypes(String... items){
            for (String item : items) {if (this.policyTypes!= null){ this.policyTypes.remove(item);}} return (A)this;
    }

    public A removeAllFromPolicyTypes(Collection<String> items){
            for (String item : items) {if (this.policyTypes!= null){ this.policyTypes.remove(item);}} return (A)this;
    }

    public List<String> getPolicyTypes(){
            return this.policyTypes;
    }

    public String getPolicyType(int index){
            return this.policyTypes.get(index);
    }

    public String getFirstPolicyType(){
            return this.policyTypes.get(0);
    }

    public String getLastPolicyType(){
            return this.policyTypes.get(policyTypes.size() - 1);
    }

    public String getMatchingPolicyType(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: policyTypes) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withPolicyTypes(List<String> policyTypes){
            if (this.policyTypes != null) { _visitables.removeAll(this.policyTypes);}
            if (policyTypes != null) {this.policyTypes = new ArrayList<String>(); for (String item : policyTypes){this.addToPolicyTypes(item);}} else { this.policyTypes = new ArrayList<String>();} return (A) this;
    }

    public A withPolicyTypes(String... policyTypes){
            if (this.policyTypes != null) {this.policyTypes.clear();}
            if (policyTypes != null) {for (String item :policyTypes){ this.addToPolicyTypes(item);}} return (A) this;
    }

    public Boolean hasPolicyTypes(){
            return policyTypes != null && !policyTypes.isEmpty();
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NetworkPolicySpecFluentImpl that = (NetworkPolicySpecFluentImpl) o;
            if (egress != null ? !egress.equals(that.egress) :that.egress != null) return false;
            if (ingress != null ? !ingress.equals(that.ingress) :that.ingress != null) return false;
            if (podSelector != null ? !podSelector.equals(that.podSelector) :that.podSelector != null) return false;
            if (policyTypes != null ? !policyTypes.equals(that.policyTypes) :that.policyTypes != null) return false;
            return true;
    }


    public class EgressNestedImpl<N> extends NetworkPolicyEgressRuleFluentImpl<NetworkPolicySpecFluent.EgressNested<N>> implements NetworkPolicySpecFluent.EgressNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NetworkPolicyEgressRuleBuilder builder;
        private final int index;
    
            EgressNestedImpl(int index,NetworkPolicyEgressRule item){
                    this.index = index;
                    this.builder = new NetworkPolicyEgressRuleBuilder(this, item);
            }
            EgressNestedImpl(){
                    this.index = -1;
                    this.builder = new NetworkPolicyEgressRuleBuilder(this);
            }
    
    public N and(){
            return (N) NetworkPolicySpecFluentImpl.this.setToEgress(index, builder.build());
    }
    public N endEgress(){
            return and();
    }

}
    public class IngressNestedImpl<N> extends NetworkPolicyIngressRuleFluentImpl<NetworkPolicySpecFluent.IngressNested<N>> implements NetworkPolicySpecFluent.IngressNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NetworkPolicyIngressRuleBuilder builder;
        private final int index;
    
            IngressNestedImpl(int index,NetworkPolicyIngressRule item){
                    this.index = index;
                    this.builder = new NetworkPolicyIngressRuleBuilder(this, item);
            }
            IngressNestedImpl(){
                    this.index = -1;
                    this.builder = new NetworkPolicyIngressRuleBuilder(this);
            }
    
    public N and(){
            return (N) NetworkPolicySpecFluentImpl.this.setToIngress(index, builder.build());
    }
    public N endIngress(){
            return and();
    }

}
    public class PodSelectorNestedImpl<N> extends LabelSelectorFluentImpl<NetworkPolicySpecFluent.PodSelectorNested<N>> implements NetworkPolicySpecFluent.PodSelectorNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LabelSelectorBuilder builder;
    
            PodSelectorNestedImpl(LabelSelector item){
                    this.builder = new LabelSelectorBuilder(this, item);
            }
            PodSelectorNestedImpl(){
                    this.builder = new LabelSelectorBuilder(this);
            }
    
    public N and(){
            return (N) NetworkPolicySpecFluentImpl.this.withPodSelector(builder.build());
    }
    public N endPodSelector(){
            return and();
    }

}


}
