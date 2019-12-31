package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.util.LinkedHashMap;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public class ResourceQuotaSpecFluentImpl<A extends ResourceQuotaSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ResourceQuotaSpecFluent<A>{

    private Map<String,Quantity> hard;
    private ScopeSelectorBuilder scopeSelector;
    private List<String> scopes;

    public ResourceQuotaSpecFluentImpl(){
    }
    public ResourceQuotaSpecFluentImpl(ResourceQuotaSpec instance){
            this.withHard(instance.getHard()); 
            this.withScopeSelector(instance.getScopeSelector()); 
            this.withScopes(instance.getScopes()); 
    }

    public A addToHard(String key,Quantity value){
            if(this.hard == null && key != null && value != null) { this.hard = new LinkedHashMap<String,Quantity>(); }
            if(key != null && value != null) {this.hard.put(key, value);} return (A)this;
    }

    public A addToHard(Map<String,Quantity> map){
            if(this.hard == null && map != null) { this.hard = new LinkedHashMap<String,Quantity>(); }
            if(map != null) { this.hard.putAll(map);} return (A)this;
    }

    public A removeFromHard(String key){
            if(this.hard == null) { return (A) this; }
            if(key != null && this.hard != null) {this.hard.remove(key);} return (A)this;
    }

    public A removeFromHard(Map<String,Quantity> map){
            if(this.hard == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.hard != null){this.hard.remove(key);}}} return (A)this;
    }

    public Map<String,Quantity> getHard(){
            return this.hard;
    }

    public A withHard(Map<String,Quantity> hard){
            if (hard == null) { this.hard =  new LinkedHashMap<String,Quantity>();} else {this.hard = new LinkedHashMap<String,Quantity>(hard);} return (A) this;
    }

    public Boolean hasHard(){
            return this.hard != null;
    }

    
/**
 * This method has been deprecated, please use method buildScopeSelector instead.
 * @return The buildable object.
 */
@Deprecated public ScopeSelector getScopeSelector(){
            return this.scopeSelector!=null?this.scopeSelector.build():null;
    }

    public ScopeSelector buildScopeSelector(){
            return this.scopeSelector!=null?this.scopeSelector.build():null;
    }

    public A withScopeSelector(ScopeSelector scopeSelector){
            _visitables.remove(this.scopeSelector);
            if (scopeSelector!=null){ this.scopeSelector= new ScopeSelectorBuilder(scopeSelector); _visitables.add(this.scopeSelector);} return (A) this;
    }

    public Boolean hasScopeSelector(){
            return this.scopeSelector != null;
    }

    public ResourceQuotaSpecFluent.ScopeSelectorNested<A> withNewScopeSelector(){
            return new ScopeSelectorNestedImpl();
    }

    public ResourceQuotaSpecFluent.ScopeSelectorNested<A> withNewScopeSelectorLike(ScopeSelector item){
            return new ScopeSelectorNestedImpl(item);
    }

    public ResourceQuotaSpecFluent.ScopeSelectorNested<A> editScopeSelector(){
            return withNewScopeSelectorLike(getScopeSelector());
    }

    public ResourceQuotaSpecFluent.ScopeSelectorNested<A> editOrNewScopeSelector(){
            return withNewScopeSelectorLike(getScopeSelector() != null ? getScopeSelector(): new ScopeSelectorBuilder().build());
    }

    public ResourceQuotaSpecFluent.ScopeSelectorNested<A> editOrNewScopeSelectorLike(ScopeSelector item){
            return withNewScopeSelectorLike(getScopeSelector() != null ? getScopeSelector(): item);
    }

    public A addToScopes(int index,String item){
            if (this.scopes == null) {this.scopes = new ArrayList<String>();}
            this.scopes.add(index, item);
            return (A)this;
    }

    public A setToScopes(int index,String item){
            if (this.scopes == null) {this.scopes = new ArrayList<String>();}
            this.scopes.set(index, item); return (A)this;
    }

    public A addToScopes(String... items){
            if (this.scopes == null) {this.scopes = new ArrayList<String>();}
            for (String item : items) {this.scopes.add(item);} return (A)this;
    }

    public A addAllToScopes(Collection<String> items){
            if (this.scopes == null) {this.scopes = new ArrayList<String>();}
            for (String item : items) {this.scopes.add(item);} return (A)this;
    }

    public A removeFromScopes(String... items){
            for (String item : items) {if (this.scopes!= null){ this.scopes.remove(item);}} return (A)this;
    }

    public A removeAllFromScopes(Collection<String> items){
            for (String item : items) {if (this.scopes!= null){ this.scopes.remove(item);}} return (A)this;
    }

    public List<String> getScopes(){
            return this.scopes;
    }

    public String getScope(int index){
            return this.scopes.get(index);
    }

    public String getFirstScope(){
            return this.scopes.get(0);
    }

    public String getLastScope(){
            return this.scopes.get(scopes.size() - 1);
    }

    public String getMatchingScope(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: scopes) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withScopes(List<String> scopes){
            if (this.scopes != null) { _visitables.removeAll(this.scopes);}
            if (scopes != null) {this.scopes = new ArrayList<String>(); for (String item : scopes){this.addToScopes(item);}} else { this.scopes = new ArrayList<String>();} return (A) this;
    }

    public A withScopes(String... scopes){
            if (this.scopes != null) {this.scopes.clear();}
            if (scopes != null) {for (String item :scopes){ this.addToScopes(item);}} return (A) this;
    }

    public Boolean hasScopes(){
            return scopes != null && !scopes.isEmpty();
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ResourceQuotaSpecFluentImpl that = (ResourceQuotaSpecFluentImpl) o;
            if (hard != null ? !hard.equals(that.hard) :that.hard != null) return false;
            if (scopeSelector != null ? !scopeSelector.equals(that.scopeSelector) :that.scopeSelector != null) return false;
            if (scopes != null ? !scopes.equals(that.scopes) :that.scopes != null) return false;
            return true;
    }


    public class ScopeSelectorNestedImpl<N> extends ScopeSelectorFluentImpl<ResourceQuotaSpecFluent.ScopeSelectorNested<N>> implements ResourceQuotaSpecFluent.ScopeSelectorNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ScopeSelectorBuilder builder;
    
            ScopeSelectorNestedImpl(ScopeSelector item){
                    this.builder = new ScopeSelectorBuilder(this, item);
            }
            ScopeSelectorNestedImpl(){
                    this.builder = new ScopeSelectorBuilder(this);
            }
    
    public N and(){
            return (N) ResourceQuotaSpecFluentImpl.this.withScopeSelector(builder.build());
    }
    public N endScopeSelector(){
            return and();
    }

}


}
