package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface RouteIngressFluent<A extends RouteIngressFluent<A>> extends Fluent<A>{


    public A addToConditions(int index,RouteIngressCondition item);
    public A setToConditions(int index,RouteIngressCondition item);
    public A addToConditions(RouteIngressCondition... items);
    public A addAllToConditions(Collection<RouteIngressCondition> items);
    public A removeFromConditions(RouteIngressCondition... items);
    public A removeAllFromConditions(Collection<RouteIngressCondition> items);
    
/**
 * This method has been deprecated, please use method buildConditions instead.
 * @return The buildable object.
 */
@Deprecated public List<RouteIngressCondition> getConditions();
    public List<RouteIngressCondition> buildConditions();
    public RouteIngressCondition buildCondition(int index);
    public RouteIngressCondition buildFirstCondition();
    public RouteIngressCondition buildLastCondition();
    public RouteIngressCondition buildMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<RouteIngressConditionBuilder> predicate);
    public A withConditions(List<RouteIngressCondition> conditions);
    public A withConditions(RouteIngressCondition... conditions);
    public Boolean hasConditions();
    public A addNewCondition(String lastTransitionTime,String message,String reason,String status,String type);
    public RouteIngressFluent.ConditionsNested<A> addNewCondition();
    public RouteIngressFluent.ConditionsNested<A> addNewConditionLike(RouteIngressCondition item);
    public RouteIngressFluent.ConditionsNested<A> setNewConditionLike(int index,RouteIngressCondition item);
    public RouteIngressFluent.ConditionsNested<A> editCondition(int index);
    public RouteIngressFluent.ConditionsNested<A> editFirstCondition();
    public RouteIngressFluent.ConditionsNested<A> editLastCondition();
    public RouteIngressFluent.ConditionsNested<A> editMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<RouteIngressConditionBuilder> predicate);
    public String getHost();
    public A withHost(String host);
    public Boolean hasHost();
    public String getRouterCanonicalHostname();
    public A withRouterCanonicalHostname(String routerCanonicalHostname);
    public Boolean hasRouterCanonicalHostname();
    public String getRouterName();
    public A withRouterName(String routerName);
    public Boolean hasRouterName();
    public String getWildcardPolicy();
    public A withWildcardPolicy(String wildcardPolicy);
    public Boolean hasWildcardPolicy();

    public interface ConditionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RouteIngressConditionFluent<RouteIngressFluent.ConditionsNested<N>>{

        
    public N and();    public N endCondition();
}


}
