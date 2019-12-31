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

public class PersistentVolumeClaimStatusFluentImpl<A extends PersistentVolumeClaimStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements PersistentVolumeClaimStatusFluent<A>{

    private List<String> accessModes;
    private Map<String,Quantity> capacity;
    private List<PersistentVolumeClaimConditionBuilder> conditions;
    private String phase;

    public PersistentVolumeClaimStatusFluentImpl(){
    }
    public PersistentVolumeClaimStatusFluentImpl(PersistentVolumeClaimStatus instance){
            this.withAccessModes(instance.getAccessModes()); 
            this.withCapacity(instance.getCapacity()); 
            this.withConditions(instance.getConditions()); 
            this.withPhase(instance.getPhase()); 
    }

    public A addToAccessModes(int index,String item){
            if (this.accessModes == null) {this.accessModes = new ArrayList<String>();}
            this.accessModes.add(index, item);
            return (A)this;
    }

    public A setToAccessModes(int index,String item){
            if (this.accessModes == null) {this.accessModes = new ArrayList<String>();}
            this.accessModes.set(index, item); return (A)this;
    }

    public A addToAccessModes(String... items){
            if (this.accessModes == null) {this.accessModes = new ArrayList<String>();}
            for (String item : items) {this.accessModes.add(item);} return (A)this;
    }

    public A addAllToAccessModes(Collection<String> items){
            if (this.accessModes == null) {this.accessModes = new ArrayList<String>();}
            for (String item : items) {this.accessModes.add(item);} return (A)this;
    }

    public A removeFromAccessModes(String... items){
            for (String item : items) {if (this.accessModes!= null){ this.accessModes.remove(item);}} return (A)this;
    }

    public A removeAllFromAccessModes(Collection<String> items){
            for (String item : items) {if (this.accessModes!= null){ this.accessModes.remove(item);}} return (A)this;
    }

    public List<String> getAccessModes(){
            return this.accessModes;
    }

    public String getAccessMode(int index){
            return this.accessModes.get(index);
    }

    public String getFirstAccessMode(){
            return this.accessModes.get(0);
    }

    public String getLastAccessMode(){
            return this.accessModes.get(accessModes.size() - 1);
    }

    public String getMatchingAccessMode(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: accessModes) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withAccessModes(List<String> accessModes){
            if (this.accessModes != null) { _visitables.removeAll(this.accessModes);}
            if (accessModes != null) {this.accessModes = new ArrayList<String>(); for (String item : accessModes){this.addToAccessModes(item);}} else { this.accessModes = new ArrayList<String>();} return (A) this;
    }

    public A withAccessModes(String... accessModes){
            if (this.accessModes != null) {this.accessModes.clear();}
            if (accessModes != null) {for (String item :accessModes){ this.addToAccessModes(item);}} return (A) this;
    }

    public Boolean hasAccessModes(){
            return accessModes != null && !accessModes.isEmpty();
    }

    public A addToCapacity(String key,Quantity value){
            if(this.capacity == null && key != null && value != null) { this.capacity = new LinkedHashMap<String,Quantity>(); }
            if(key != null && value != null) {this.capacity.put(key, value);} return (A)this;
    }

    public A addToCapacity(Map<String,Quantity> map){
            if(this.capacity == null && map != null) { this.capacity = new LinkedHashMap<String,Quantity>(); }
            if(map != null) { this.capacity.putAll(map);} return (A)this;
    }

    public A removeFromCapacity(String key){
            if(this.capacity == null) { return (A) this; }
            if(key != null && this.capacity != null) {this.capacity.remove(key);} return (A)this;
    }

    public A removeFromCapacity(Map<String,Quantity> map){
            if(this.capacity == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.capacity != null){this.capacity.remove(key);}}} return (A)this;
    }

    public Map<String,Quantity> getCapacity(){
            return this.capacity;
    }

    public A withCapacity(Map<String,Quantity> capacity){
            if (capacity == null) { this.capacity =  new LinkedHashMap<String,Quantity>();} else {this.capacity = new LinkedHashMap<String,Quantity>(capacity);} return (A) this;
    }

    public Boolean hasCapacity(){
            return this.capacity != null;
    }

    public A addToConditions(int index,PersistentVolumeClaimCondition item){
            if (this.conditions == null) {this.conditions = new ArrayList<PersistentVolumeClaimConditionBuilder>();}
            PersistentVolumeClaimConditionBuilder builder = new PersistentVolumeClaimConditionBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.conditions.add(index >= 0 ? index : conditions.size(), builder); return (A)this;
    }

    public A setToConditions(int index,PersistentVolumeClaimCondition item){
            if (this.conditions == null) {this.conditions = new ArrayList<PersistentVolumeClaimConditionBuilder>();}
            PersistentVolumeClaimConditionBuilder builder = new PersistentVolumeClaimConditionBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= conditions.size()) { conditions.add(builder); } else { conditions.set(index, builder);}
             return (A)this;
    }

    public A addToConditions(PersistentVolumeClaimCondition... items){
            if (this.conditions == null) {this.conditions = new ArrayList<PersistentVolumeClaimConditionBuilder>();}
            for (PersistentVolumeClaimCondition item : items) {PersistentVolumeClaimConditionBuilder builder = new PersistentVolumeClaimConditionBuilder(item);_visitables.add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A addAllToConditions(Collection<PersistentVolumeClaimCondition> items){
            if (this.conditions == null) {this.conditions = new ArrayList<PersistentVolumeClaimConditionBuilder>();}
            for (PersistentVolumeClaimCondition item : items) {PersistentVolumeClaimConditionBuilder builder = new PersistentVolumeClaimConditionBuilder(item);_visitables.add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A removeFromConditions(PersistentVolumeClaimCondition... items){
            for (PersistentVolumeClaimCondition item : items) {PersistentVolumeClaimConditionBuilder builder = new PersistentVolumeClaimConditionBuilder(item);_visitables.remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    public A removeAllFromConditions(Collection<PersistentVolumeClaimCondition> items){
            for (PersistentVolumeClaimCondition item : items) {PersistentVolumeClaimConditionBuilder builder = new PersistentVolumeClaimConditionBuilder(item);_visitables.remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildConditions instead.
 * @return The buildable object.
 */
@Deprecated public List<PersistentVolumeClaimCondition> getConditions(){
            return build(conditions);
    }

    public List<PersistentVolumeClaimCondition> buildConditions(){
            return build(conditions);
    }

    public PersistentVolumeClaimCondition buildCondition(int index){
            return this.conditions.get(index).build();
    }

    public PersistentVolumeClaimCondition buildFirstCondition(){
            return this.conditions.get(0).build();
    }

    public PersistentVolumeClaimCondition buildLastCondition(){
            return this.conditions.get(conditions.size() - 1).build();
    }

    public PersistentVolumeClaimCondition buildMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<PersistentVolumeClaimConditionBuilder> predicate){
            for (PersistentVolumeClaimConditionBuilder item: conditions) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withConditions(List<PersistentVolumeClaimCondition> conditions){
            if (this.conditions != null) { _visitables.removeAll(this.conditions);}
            if (conditions != null) {this.conditions = new ArrayList<PersistentVolumeClaimConditionBuilder>(); for (PersistentVolumeClaimCondition item : conditions){this.addToConditions(item);}} else { this.conditions = new ArrayList<PersistentVolumeClaimConditionBuilder>();} return (A) this;
    }

    public A withConditions(PersistentVolumeClaimCondition... conditions){
            if (this.conditions != null) {this.conditions.clear();}
            if (conditions != null) {for (PersistentVolumeClaimCondition item :conditions){ this.addToConditions(item);}} return (A) this;
    }

    public Boolean hasConditions(){
            return conditions != null && !conditions.isEmpty();
    }

    public PersistentVolumeClaimStatusFluent.ConditionsNested<A> addNewCondition(){
            return new ConditionsNestedImpl();
    }

    public PersistentVolumeClaimStatusFluent.ConditionsNested<A> addNewConditionLike(PersistentVolumeClaimCondition item){
            return new ConditionsNestedImpl(-1, item);
    }

    public PersistentVolumeClaimStatusFluent.ConditionsNested<A> setNewConditionLike(int index,PersistentVolumeClaimCondition item){
            return new ConditionsNestedImpl(index, item);
    }

    public PersistentVolumeClaimStatusFluent.ConditionsNested<A> editCondition(int index){
            if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public PersistentVolumeClaimStatusFluent.ConditionsNested<A> editFirstCondition(){
            if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
            return setNewConditionLike(0, buildCondition(0));
    }

    public PersistentVolumeClaimStatusFluent.ConditionsNested<A> editLastCondition(){
            int index = conditions.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public PersistentVolumeClaimStatusFluent.ConditionsNested<A> editMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<PersistentVolumeClaimConditionBuilder> predicate){
            int index = -1;
            for (int i=0;i<conditions.size();i++) { 
            if (predicate.apply(conditions.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public String getPhase(){
            return this.phase;
    }

    public A withPhase(String phase){
            this.phase=phase; return (A) this;
    }

    public Boolean hasPhase(){
            return this.phase != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PersistentVolumeClaimStatusFluentImpl that = (PersistentVolumeClaimStatusFluentImpl) o;
            if (accessModes != null ? !accessModes.equals(that.accessModes) :that.accessModes != null) return false;
            if (capacity != null ? !capacity.equals(that.capacity) :that.capacity != null) return false;
            if (conditions != null ? !conditions.equals(that.conditions) :that.conditions != null) return false;
            if (phase != null ? !phase.equals(that.phase) :that.phase != null) return false;
            return true;
    }


    public class ConditionsNestedImpl<N> extends PersistentVolumeClaimConditionFluentImpl<PersistentVolumeClaimStatusFluent.ConditionsNested<N>> implements PersistentVolumeClaimStatusFluent.ConditionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PersistentVolumeClaimConditionBuilder builder;
        private final int index;
    
            ConditionsNestedImpl(int index,PersistentVolumeClaimCondition item){
                    this.index = index;
                    this.builder = new PersistentVolumeClaimConditionBuilder(this, item);
            }
            ConditionsNestedImpl(){
                    this.index = -1;
                    this.builder = new PersistentVolumeClaimConditionBuilder(this);
            }
    
    public N and(){
            return (N) PersistentVolumeClaimStatusFluentImpl.this.setToConditions(index, builder.build());
    }
    public N endCondition(){
            return and();
    }

}


}
