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

public interface PersistentVolumeClaimStatusFluent<A extends PersistentVolumeClaimStatusFluent<A>> extends Fluent<A>{


    public A addToAccessModes(int index,String item);
    public A setToAccessModes(int index,String item);
    public A addToAccessModes(String... items);
    public A addAllToAccessModes(Collection<String> items);
    public A removeFromAccessModes(String... items);
    public A removeAllFromAccessModes(Collection<String> items);
    public List<String> getAccessModes();
    public String getAccessMode(int index);
    public String getFirstAccessMode();
    public String getLastAccessMode();
    public String getMatchingAccessMode(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withAccessModes(List<String> accessModes);
    public A withAccessModes(String... accessModes);
    public Boolean hasAccessModes();
    public A addToCapacity(String key,Quantity value);
    public A addToCapacity(Map<String,Quantity> map);
    public A removeFromCapacity(String key);
    public A removeFromCapacity(Map<String,Quantity> map);
    public Map<String,Quantity> getCapacity();
    public A withCapacity(Map<String,Quantity> capacity);
    public Boolean hasCapacity();
    public A addToConditions(int index,PersistentVolumeClaimCondition item);
    public A setToConditions(int index,PersistentVolumeClaimCondition item);
    public A addToConditions(PersistentVolumeClaimCondition... items);
    public A addAllToConditions(Collection<PersistentVolumeClaimCondition> items);
    public A removeFromConditions(PersistentVolumeClaimCondition... items);
    public A removeAllFromConditions(Collection<PersistentVolumeClaimCondition> items);
    
/**
 * This method has been deprecated, please use method buildConditions instead.
 * @return The buildable object.
 */
@Deprecated public List<PersistentVolumeClaimCondition> getConditions();
    public List<PersistentVolumeClaimCondition> buildConditions();
    public PersistentVolumeClaimCondition buildCondition(int index);
    public PersistentVolumeClaimCondition buildFirstCondition();
    public PersistentVolumeClaimCondition buildLastCondition();
    public PersistentVolumeClaimCondition buildMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<PersistentVolumeClaimConditionBuilder> predicate);
    public A withConditions(List<PersistentVolumeClaimCondition> conditions);
    public A withConditions(PersistentVolumeClaimCondition... conditions);
    public Boolean hasConditions();
    public PersistentVolumeClaimStatusFluent.ConditionsNested<A> addNewCondition();
    public PersistentVolumeClaimStatusFluent.ConditionsNested<A> addNewConditionLike(PersistentVolumeClaimCondition item);
    public PersistentVolumeClaimStatusFluent.ConditionsNested<A> setNewConditionLike(int index,PersistentVolumeClaimCondition item);
    public PersistentVolumeClaimStatusFluent.ConditionsNested<A> editCondition(int index);
    public PersistentVolumeClaimStatusFluent.ConditionsNested<A> editFirstCondition();
    public PersistentVolumeClaimStatusFluent.ConditionsNested<A> editLastCondition();
    public PersistentVolumeClaimStatusFluent.ConditionsNested<A> editMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<PersistentVolumeClaimConditionBuilder> predicate);
    public String getPhase();
    public A withPhase(String phase);
    public Boolean hasPhase();

    public interface ConditionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PersistentVolumeClaimConditionFluent<PersistentVolumeClaimStatusFluent.ConditionsNested<N>>{

        
    public N and();    public N endCondition();
}


}
