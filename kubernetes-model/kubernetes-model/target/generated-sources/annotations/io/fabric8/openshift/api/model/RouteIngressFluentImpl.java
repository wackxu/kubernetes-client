package io.fabric8.openshift.api.model;

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

public class RouteIngressFluentImpl<A extends RouteIngressFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements RouteIngressFluent<A>{

    private List<RouteIngressConditionBuilder> conditions;
    private String host;
    private String routerCanonicalHostname;
    private String routerName;
    private String wildcardPolicy;

    public RouteIngressFluentImpl(){
    }
    public RouteIngressFluentImpl(RouteIngress instance){
            this.withConditions(instance.getConditions()); 
            this.withHost(instance.getHost()); 
            this.withRouterCanonicalHostname(instance.getRouterCanonicalHostname()); 
            this.withRouterName(instance.getRouterName()); 
            this.withWildcardPolicy(instance.getWildcardPolicy()); 
    }

    public A addToConditions(int index,RouteIngressCondition item){
            if (this.conditions == null) {this.conditions = new ArrayList<RouteIngressConditionBuilder>();}
            RouteIngressConditionBuilder builder = new RouteIngressConditionBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.conditions.add(index >= 0 ? index : conditions.size(), builder); return (A)this;
    }

    public A setToConditions(int index,RouteIngressCondition item){
            if (this.conditions == null) {this.conditions = new ArrayList<RouteIngressConditionBuilder>();}
            RouteIngressConditionBuilder builder = new RouteIngressConditionBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= conditions.size()) { conditions.add(builder); } else { conditions.set(index, builder);}
             return (A)this;
    }

    public A addToConditions(RouteIngressCondition... items){
            if (this.conditions == null) {this.conditions = new ArrayList<RouteIngressConditionBuilder>();}
            for (RouteIngressCondition item : items) {RouteIngressConditionBuilder builder = new RouteIngressConditionBuilder(item);_visitables.add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A addAllToConditions(Collection<RouteIngressCondition> items){
            if (this.conditions == null) {this.conditions = new ArrayList<RouteIngressConditionBuilder>();}
            for (RouteIngressCondition item : items) {RouteIngressConditionBuilder builder = new RouteIngressConditionBuilder(item);_visitables.add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A removeFromConditions(RouteIngressCondition... items){
            for (RouteIngressCondition item : items) {RouteIngressConditionBuilder builder = new RouteIngressConditionBuilder(item);_visitables.remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    public A removeAllFromConditions(Collection<RouteIngressCondition> items){
            for (RouteIngressCondition item : items) {RouteIngressConditionBuilder builder = new RouteIngressConditionBuilder(item);_visitables.remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildConditions instead.
 * @return The buildable object.
 */
@Deprecated public List<RouteIngressCondition> getConditions(){
            return build(conditions);
    }

    public List<RouteIngressCondition> buildConditions(){
            return build(conditions);
    }

    public RouteIngressCondition buildCondition(int index){
            return this.conditions.get(index).build();
    }

    public RouteIngressCondition buildFirstCondition(){
            return this.conditions.get(0).build();
    }

    public RouteIngressCondition buildLastCondition(){
            return this.conditions.get(conditions.size() - 1).build();
    }

    public RouteIngressCondition buildMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<RouteIngressConditionBuilder> predicate){
            for (RouteIngressConditionBuilder item: conditions) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withConditions(List<RouteIngressCondition> conditions){
            if (this.conditions != null) { _visitables.removeAll(this.conditions);}
            if (conditions != null) {this.conditions = new ArrayList<RouteIngressConditionBuilder>(); for (RouteIngressCondition item : conditions){this.addToConditions(item);}} else { this.conditions = new ArrayList<RouteIngressConditionBuilder>();} return (A) this;
    }

    public A withConditions(RouteIngressCondition... conditions){
            if (this.conditions != null) {this.conditions.clear();}
            if (conditions != null) {for (RouteIngressCondition item :conditions){ this.addToConditions(item);}} return (A) this;
    }

    public Boolean hasConditions(){
            return conditions != null && !conditions.isEmpty();
    }

    public A addNewCondition(String lastTransitionTime,String message,String reason,String status,String type){
            return (A)addToConditions(new RouteIngressCondition(lastTransitionTime, message, reason, status, type));
    }

    public RouteIngressFluent.ConditionsNested<A> addNewCondition(){
            return new ConditionsNestedImpl();
    }

    public RouteIngressFluent.ConditionsNested<A> addNewConditionLike(RouteIngressCondition item){
            return new ConditionsNestedImpl(-1, item);
    }

    public RouteIngressFluent.ConditionsNested<A> setNewConditionLike(int index,RouteIngressCondition item){
            return new ConditionsNestedImpl(index, item);
    }

    public RouteIngressFluent.ConditionsNested<A> editCondition(int index){
            if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public RouteIngressFluent.ConditionsNested<A> editFirstCondition(){
            if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
            return setNewConditionLike(0, buildCondition(0));
    }

    public RouteIngressFluent.ConditionsNested<A> editLastCondition(){
            int index = conditions.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public RouteIngressFluent.ConditionsNested<A> editMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<RouteIngressConditionBuilder> predicate){
            int index = -1;
            for (int i=0;i<conditions.size();i++) { 
            if (predicate.apply(conditions.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public String getHost(){
            return this.host;
    }

    public A withHost(String host){
            this.host=host; return (A) this;
    }

    public Boolean hasHost(){
            return this.host != null;
    }

    public String getRouterCanonicalHostname(){
            return this.routerCanonicalHostname;
    }

    public A withRouterCanonicalHostname(String routerCanonicalHostname){
            this.routerCanonicalHostname=routerCanonicalHostname; return (A) this;
    }

    public Boolean hasRouterCanonicalHostname(){
            return this.routerCanonicalHostname != null;
    }

    public String getRouterName(){
            return this.routerName;
    }

    public A withRouterName(String routerName){
            this.routerName=routerName; return (A) this;
    }

    public Boolean hasRouterName(){
            return this.routerName != null;
    }

    public String getWildcardPolicy(){
            return this.wildcardPolicy;
    }

    public A withWildcardPolicy(String wildcardPolicy){
            this.wildcardPolicy=wildcardPolicy; return (A) this;
    }

    public Boolean hasWildcardPolicy(){
            return this.wildcardPolicy != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RouteIngressFluentImpl that = (RouteIngressFluentImpl) o;
            if (conditions != null ? !conditions.equals(that.conditions) :that.conditions != null) return false;
            if (host != null ? !host.equals(that.host) :that.host != null) return false;
            if (routerCanonicalHostname != null ? !routerCanonicalHostname.equals(that.routerCanonicalHostname) :that.routerCanonicalHostname != null) return false;
            if (routerName != null ? !routerName.equals(that.routerName) :that.routerName != null) return false;
            if (wildcardPolicy != null ? !wildcardPolicy.equals(that.wildcardPolicy) :that.wildcardPolicy != null) return false;
            return true;
    }


    public class ConditionsNestedImpl<N> extends RouteIngressConditionFluentImpl<RouteIngressFluent.ConditionsNested<N>> implements RouteIngressFluent.ConditionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RouteIngressConditionBuilder builder;
        private final int index;
    
            ConditionsNestedImpl(int index,RouteIngressCondition item){
                    this.index = index;
                    this.builder = new RouteIngressConditionBuilder(this, item);
            }
            ConditionsNestedImpl(){
                    this.index = -1;
                    this.builder = new RouteIngressConditionBuilder(this);
            }
    
    public N and(){
            return (N) RouteIngressFluentImpl.this.setToConditions(index, builder.build());
    }
    public N endCondition(){
            return and();
    }

}


}
