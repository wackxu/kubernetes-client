package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class RouteStatusFluentImpl<A extends RouteStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements RouteStatusFluent<A>{

    private List<RouteIngressBuilder> ingress;

    public RouteStatusFluentImpl(){
    }
    public RouteStatusFluentImpl(RouteStatus instance){
            this.withIngress(instance.getIngress()); 
    }

    public A addToIngress(int index,RouteIngress item){
            if (this.ingress == null) {this.ingress = new ArrayList<RouteIngressBuilder>();}
            RouteIngressBuilder builder = new RouteIngressBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.ingress.add(index >= 0 ? index : ingress.size(), builder); return (A)this;
    }

    public A setToIngress(int index,RouteIngress item){
            if (this.ingress == null) {this.ingress = new ArrayList<RouteIngressBuilder>();}
            RouteIngressBuilder builder = new RouteIngressBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= ingress.size()) { ingress.add(builder); } else { ingress.set(index, builder);}
             return (A)this;
    }

    public A addToIngress(RouteIngress... items){
            if (this.ingress == null) {this.ingress = new ArrayList<RouteIngressBuilder>();}
            for (RouteIngress item : items) {RouteIngressBuilder builder = new RouteIngressBuilder(item);_visitables.add(builder);this.ingress.add(builder);} return (A)this;
    }

    public A addAllToIngress(Collection<RouteIngress> items){
            if (this.ingress == null) {this.ingress = new ArrayList<RouteIngressBuilder>();}
            for (RouteIngress item : items) {RouteIngressBuilder builder = new RouteIngressBuilder(item);_visitables.add(builder);this.ingress.add(builder);} return (A)this;
    }

    public A removeFromIngress(RouteIngress... items){
            for (RouteIngress item : items) {RouteIngressBuilder builder = new RouteIngressBuilder(item);_visitables.remove(builder);if (this.ingress != null) {this.ingress.remove(builder);}} return (A)this;
    }

    public A removeAllFromIngress(Collection<RouteIngress> items){
            for (RouteIngress item : items) {RouteIngressBuilder builder = new RouteIngressBuilder(item);_visitables.remove(builder);if (this.ingress != null) {this.ingress.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildIngress instead.
 * @return The buildable object.
 */
@Deprecated public List<RouteIngress> getIngress(){
            return build(ingress);
    }

    public List<RouteIngress> buildIngress(){
            return build(ingress);
    }

    public RouteIngress buildIngress(int index){
            return this.ingress.get(index).build();
    }

    public RouteIngress buildFirstIngress(){
            return this.ingress.get(0).build();
    }

    public RouteIngress buildLastIngress(){
            return this.ingress.get(ingress.size() - 1).build();
    }

    public RouteIngress buildMatchingIngress(io.fabric8.kubernetes.api.builder.Predicate<RouteIngressBuilder> predicate){
            for (RouteIngressBuilder item: ingress) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withIngress(List<RouteIngress> ingress){
            if (this.ingress != null) { _visitables.removeAll(this.ingress);}
            if (ingress != null) {this.ingress = new ArrayList<RouteIngressBuilder>(); for (RouteIngress item : ingress){this.addToIngress(item);}} else { this.ingress = new ArrayList<RouteIngressBuilder>();} return (A) this;
    }

    public A withIngress(RouteIngress... ingress){
            if (this.ingress != null) {this.ingress.clear();}
            if (ingress != null) {for (RouteIngress item :ingress){ this.addToIngress(item);}} return (A) this;
    }

    public Boolean hasIngress(){
            return ingress != null && !ingress.isEmpty();
    }

    public RouteStatusFluent.IngressNested<A> addNewIngress(){
            return new IngressNestedImpl();
    }

    public RouteStatusFluent.IngressNested<A> addNewIngressLike(RouteIngress item){
            return new IngressNestedImpl(-1, item);
    }

    public RouteStatusFluent.IngressNested<A> setNewIngressLike(int index,RouteIngress item){
            return new IngressNestedImpl(index, item);
    }

    public RouteStatusFluent.IngressNested<A> editIngress(int index){
            if (ingress.size() <= index) throw new RuntimeException("Can't edit ingress. Index exceeds size.");
            return setNewIngressLike(index, buildIngress(index));
    }

    public RouteStatusFluent.IngressNested<A> editFirstIngress(){
            if (ingress.size() == 0) throw new RuntimeException("Can't edit first ingress. The list is empty.");
            return setNewIngressLike(0, buildIngress(0));
    }

    public RouteStatusFluent.IngressNested<A> editLastIngress(){
            int index = ingress.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last ingress. The list is empty.");
            return setNewIngressLike(index, buildIngress(index));
    }

    public RouteStatusFluent.IngressNested<A> editMatchingIngress(io.fabric8.kubernetes.api.builder.Predicate<RouteIngressBuilder> predicate){
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
            RouteStatusFluentImpl that = (RouteStatusFluentImpl) o;
            if (ingress != null ? !ingress.equals(that.ingress) :that.ingress != null) return false;
            return true;
    }


    public class IngressNestedImpl<N> extends RouteIngressFluentImpl<RouteStatusFluent.IngressNested<N>> implements RouteStatusFluent.IngressNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RouteIngressBuilder builder;
        private final int index;
    
            IngressNestedImpl(int index,RouteIngress item){
                    this.index = index;
                    this.builder = new RouteIngressBuilder(this, item);
            }
            IngressNestedImpl(){
                    this.index = -1;
                    this.builder = new RouteIngressBuilder(this);
            }
    
    public N and(){
            return (N) RouteStatusFluentImpl.this.setToIngress(index, builder.build());
    }
    public N endIngress(){
            return and();
    }

}


}
