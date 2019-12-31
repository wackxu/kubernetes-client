package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.util.LinkedHashMap;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface ResourceQuotaSpecFluent<A extends ResourceQuotaSpecFluent<A>> extends Fluent<A>{


    public A addToHard(String key,Quantity value);
    public A addToHard(Map<String,Quantity> map);
    public A removeFromHard(String key);
    public A removeFromHard(Map<String,Quantity> map);
    public Map<String,Quantity> getHard();
    public A withHard(Map<String,Quantity> hard);
    public Boolean hasHard();
    
/**
 * This method has been deprecated, please use method buildScopeSelector instead.
 * @return The buildable object.
 */
@Deprecated public ScopeSelector getScopeSelector();
    public ScopeSelector buildScopeSelector();
    public A withScopeSelector(ScopeSelector scopeSelector);
    public Boolean hasScopeSelector();
    public ResourceQuotaSpecFluent.ScopeSelectorNested<A> withNewScopeSelector();
    public ResourceQuotaSpecFluent.ScopeSelectorNested<A> withNewScopeSelectorLike(ScopeSelector item);
    public ResourceQuotaSpecFluent.ScopeSelectorNested<A> editScopeSelector();
    public ResourceQuotaSpecFluent.ScopeSelectorNested<A> editOrNewScopeSelector();
    public ResourceQuotaSpecFluent.ScopeSelectorNested<A> editOrNewScopeSelectorLike(ScopeSelector item);
    public A addToScopes(int index,String item);
    public A setToScopes(int index,String item);
    public A addToScopes(String... items);
    public A addAllToScopes(Collection<String> items);
    public A removeFromScopes(String... items);
    public A removeAllFromScopes(Collection<String> items);
    public List<String> getScopes();
    public String getScope(int index);
    public String getFirstScope();
    public String getLastScope();
    public String getMatchingScope(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withScopes(List<String> scopes);
    public A withScopes(String... scopes);
    public Boolean hasScopes();

    public interface ScopeSelectorNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ScopeSelectorFluent<ResourceQuotaSpecFluent.ScopeSelectorNested<N>>{

        
    public N and();    public N endScopeSelector();
}


}
