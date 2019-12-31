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

public class LoadBalancerStatusFluentImpl<A extends LoadBalancerStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements LoadBalancerStatusFluent<A>{

    private List<LoadBalancerIngressBuilder> ingress;

    public LoadBalancerStatusFluentImpl(){
    }
    public LoadBalancerStatusFluentImpl(LoadBalancerStatus instance){
            this.withIngress(instance.getIngress()); 
    }

    public A addToIngress(int index,LoadBalancerIngress item){
            if (this.ingress == null) {this.ingress = new ArrayList<LoadBalancerIngressBuilder>();}
            LoadBalancerIngressBuilder builder = new LoadBalancerIngressBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.ingress.add(index >= 0 ? index : ingress.size(), builder); return (A)this;
    }

    public A setToIngress(int index,LoadBalancerIngress item){
            if (this.ingress == null) {this.ingress = new ArrayList<LoadBalancerIngressBuilder>();}
            LoadBalancerIngressBuilder builder = new LoadBalancerIngressBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= ingress.size()) { ingress.add(builder); } else { ingress.set(index, builder);}
             return (A)this;
    }

    public A addToIngress(LoadBalancerIngress... items){
            if (this.ingress == null) {this.ingress = new ArrayList<LoadBalancerIngressBuilder>();}
            for (LoadBalancerIngress item : items) {LoadBalancerIngressBuilder builder = new LoadBalancerIngressBuilder(item);_visitables.add(builder);this.ingress.add(builder);} return (A)this;
    }

    public A addAllToIngress(Collection<LoadBalancerIngress> items){
            if (this.ingress == null) {this.ingress = new ArrayList<LoadBalancerIngressBuilder>();}
            for (LoadBalancerIngress item : items) {LoadBalancerIngressBuilder builder = new LoadBalancerIngressBuilder(item);_visitables.add(builder);this.ingress.add(builder);} return (A)this;
    }

    public A removeFromIngress(LoadBalancerIngress... items){
            for (LoadBalancerIngress item : items) {LoadBalancerIngressBuilder builder = new LoadBalancerIngressBuilder(item);_visitables.remove(builder);if (this.ingress != null) {this.ingress.remove(builder);}} return (A)this;
    }

    public A removeAllFromIngress(Collection<LoadBalancerIngress> items){
            for (LoadBalancerIngress item : items) {LoadBalancerIngressBuilder builder = new LoadBalancerIngressBuilder(item);_visitables.remove(builder);if (this.ingress != null) {this.ingress.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildIngress instead.
 * @return The buildable object.
 */
@Deprecated public List<LoadBalancerIngress> getIngress(){
            return build(ingress);
    }

    public List<LoadBalancerIngress> buildIngress(){
            return build(ingress);
    }

    public LoadBalancerIngress buildIngress(int index){
            return this.ingress.get(index).build();
    }

    public LoadBalancerIngress buildFirstIngress(){
            return this.ingress.get(0).build();
    }

    public LoadBalancerIngress buildLastIngress(){
            return this.ingress.get(ingress.size() - 1).build();
    }

    public LoadBalancerIngress buildMatchingIngress(io.fabric8.kubernetes.api.builder.Predicate<LoadBalancerIngressBuilder> predicate){
            for (LoadBalancerIngressBuilder item: ingress) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withIngress(List<LoadBalancerIngress> ingress){
            if (this.ingress != null) { _visitables.removeAll(this.ingress);}
            if (ingress != null) {this.ingress = new ArrayList<LoadBalancerIngressBuilder>(); for (LoadBalancerIngress item : ingress){this.addToIngress(item);}} else { this.ingress = new ArrayList<LoadBalancerIngressBuilder>();} return (A) this;
    }

    public A withIngress(LoadBalancerIngress... ingress){
            if (this.ingress != null) {this.ingress.clear();}
            if (ingress != null) {for (LoadBalancerIngress item :ingress){ this.addToIngress(item);}} return (A) this;
    }

    public Boolean hasIngress(){
            return ingress != null && !ingress.isEmpty();
    }

    public A addNewIngress(String hostname,String ip){
            return (A)addToIngress(new LoadBalancerIngress(hostname, ip));
    }

    public LoadBalancerStatusFluent.IngressNested<A> addNewIngress(){
            return new IngressNestedImpl();
    }

    public LoadBalancerStatusFluent.IngressNested<A> addNewIngressLike(LoadBalancerIngress item){
            return new IngressNestedImpl(-1, item);
    }

    public LoadBalancerStatusFluent.IngressNested<A> setNewIngressLike(int index,LoadBalancerIngress item){
            return new IngressNestedImpl(index, item);
    }

    public LoadBalancerStatusFluent.IngressNested<A> editIngress(int index){
            if (ingress.size() <= index) throw new RuntimeException("Can't edit ingress. Index exceeds size.");
            return setNewIngressLike(index, buildIngress(index));
    }

    public LoadBalancerStatusFluent.IngressNested<A> editFirstIngress(){
            if (ingress.size() == 0) throw new RuntimeException("Can't edit first ingress. The list is empty.");
            return setNewIngressLike(0, buildIngress(0));
    }

    public LoadBalancerStatusFluent.IngressNested<A> editLastIngress(){
            int index = ingress.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last ingress. The list is empty.");
            return setNewIngressLike(index, buildIngress(index));
    }

    public LoadBalancerStatusFluent.IngressNested<A> editMatchingIngress(io.fabric8.kubernetes.api.builder.Predicate<LoadBalancerIngressBuilder> predicate){
            int index = -1;
            for (int i=0;i<ingress.size();i++) { 
            if (predicate.apply(ingress.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching ingress. No match found.");
            return setNewIngressLike(index, buildIngress(index));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            LoadBalancerStatusFluentImpl that = (LoadBalancerStatusFluentImpl) o;
            if (ingress != null ? !ingress.equals(that.ingress) :that.ingress != null) return false;
            return true;
    }


    public class IngressNestedImpl<N> extends LoadBalancerIngressFluentImpl<LoadBalancerStatusFluent.IngressNested<N>> implements LoadBalancerStatusFluent.IngressNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LoadBalancerIngressBuilder builder;
        private final int index;
    
            IngressNestedImpl(int index,LoadBalancerIngress item){
                    this.index = index;
                    this.builder = new LoadBalancerIngressBuilder(this, item);
            }
            IngressNestedImpl(){
                    this.index = -1;
                    this.builder = new LoadBalancerIngressBuilder(this);
            }
    
    public N and(){
            return (N) LoadBalancerStatusFluentImpl.this.setToIngress(index, builder.build());
    }
    public N endIngress(){
            return and();
    }

}


}
