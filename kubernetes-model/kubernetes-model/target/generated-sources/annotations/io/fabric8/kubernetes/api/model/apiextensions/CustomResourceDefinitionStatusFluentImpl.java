package io.fabric8.kubernetes.api.model.apiextensions;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;

public class CustomResourceDefinitionStatusFluentImpl<A extends CustomResourceDefinitionStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements CustomResourceDefinitionStatusFluent<A>{

    private CustomResourceDefinitionNamesBuilder acceptedNames;
    private List<CustomResourceDefinitionConditionBuilder> conditions;
    private List<String> storedVersions;

    public CustomResourceDefinitionStatusFluentImpl(){
    }
    public CustomResourceDefinitionStatusFluentImpl(CustomResourceDefinitionStatus instance){
            this.withAcceptedNames(instance.getAcceptedNames()); 
            this.withConditions(instance.getConditions()); 
            this.withStoredVersions(instance.getStoredVersions()); 
    }

    
/**
 * This method has been deprecated, please use method buildAcceptedNames instead.
 * @return The buildable object.
 */
@Deprecated public CustomResourceDefinitionNames getAcceptedNames(){
            return this.acceptedNames!=null?this.acceptedNames.build():null;
    }

    public CustomResourceDefinitionNames buildAcceptedNames(){
            return this.acceptedNames!=null?this.acceptedNames.build():null;
    }

    public A withAcceptedNames(CustomResourceDefinitionNames acceptedNames){
            _visitables.remove(this.acceptedNames);
            if (acceptedNames!=null){ this.acceptedNames= new CustomResourceDefinitionNamesBuilder(acceptedNames); _visitables.add(this.acceptedNames);} return (A) this;
    }

    public Boolean hasAcceptedNames(){
            return this.acceptedNames != null;
    }

    public CustomResourceDefinitionStatusFluent.AcceptedNamesNested<A> withNewAcceptedNames(){
            return new AcceptedNamesNestedImpl();
    }

    public CustomResourceDefinitionStatusFluent.AcceptedNamesNested<A> withNewAcceptedNamesLike(CustomResourceDefinitionNames item){
            return new AcceptedNamesNestedImpl(item);
    }

    public CustomResourceDefinitionStatusFluent.AcceptedNamesNested<A> editAcceptedNames(){
            return withNewAcceptedNamesLike(getAcceptedNames());
    }

    public CustomResourceDefinitionStatusFluent.AcceptedNamesNested<A> editOrNewAcceptedNames(){
            return withNewAcceptedNamesLike(getAcceptedNames() != null ? getAcceptedNames(): new CustomResourceDefinitionNamesBuilder().build());
    }

    public CustomResourceDefinitionStatusFluent.AcceptedNamesNested<A> editOrNewAcceptedNamesLike(CustomResourceDefinitionNames item){
            return withNewAcceptedNamesLike(getAcceptedNames() != null ? getAcceptedNames(): item);
    }

    public A addToConditions(int index,CustomResourceDefinitionCondition item){
            if (this.conditions == null) {this.conditions = new ArrayList<CustomResourceDefinitionConditionBuilder>();}
            CustomResourceDefinitionConditionBuilder builder = new CustomResourceDefinitionConditionBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.conditions.add(index >= 0 ? index : conditions.size(), builder); return (A)this;
    }

    public A setToConditions(int index,CustomResourceDefinitionCondition item){
            if (this.conditions == null) {this.conditions = new ArrayList<CustomResourceDefinitionConditionBuilder>();}
            CustomResourceDefinitionConditionBuilder builder = new CustomResourceDefinitionConditionBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= conditions.size()) { conditions.add(builder); } else { conditions.set(index, builder);}
             return (A)this;
    }

    public A addToConditions(CustomResourceDefinitionCondition... items){
            if (this.conditions == null) {this.conditions = new ArrayList<CustomResourceDefinitionConditionBuilder>();}
            for (CustomResourceDefinitionCondition item : items) {CustomResourceDefinitionConditionBuilder builder = new CustomResourceDefinitionConditionBuilder(item);_visitables.add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A addAllToConditions(Collection<CustomResourceDefinitionCondition> items){
            if (this.conditions == null) {this.conditions = new ArrayList<CustomResourceDefinitionConditionBuilder>();}
            for (CustomResourceDefinitionCondition item : items) {CustomResourceDefinitionConditionBuilder builder = new CustomResourceDefinitionConditionBuilder(item);_visitables.add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A removeFromConditions(CustomResourceDefinitionCondition... items){
            for (CustomResourceDefinitionCondition item : items) {CustomResourceDefinitionConditionBuilder builder = new CustomResourceDefinitionConditionBuilder(item);_visitables.remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    public A removeAllFromConditions(Collection<CustomResourceDefinitionCondition> items){
            for (CustomResourceDefinitionCondition item : items) {CustomResourceDefinitionConditionBuilder builder = new CustomResourceDefinitionConditionBuilder(item);_visitables.remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildConditions instead.
 * @return The buildable object.
 */
@Deprecated public List<CustomResourceDefinitionCondition> getConditions(){
            return build(conditions);
    }

    public List<CustomResourceDefinitionCondition> buildConditions(){
            return build(conditions);
    }

    public CustomResourceDefinitionCondition buildCondition(int index){
            return this.conditions.get(index).build();
    }

    public CustomResourceDefinitionCondition buildFirstCondition(){
            return this.conditions.get(0).build();
    }

    public CustomResourceDefinitionCondition buildLastCondition(){
            return this.conditions.get(conditions.size() - 1).build();
    }

    public CustomResourceDefinitionCondition buildMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<CustomResourceDefinitionConditionBuilder> predicate){
            for (CustomResourceDefinitionConditionBuilder item: conditions) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withConditions(List<CustomResourceDefinitionCondition> conditions){
            if (this.conditions != null) { _visitables.removeAll(this.conditions);}
            if (conditions != null) {this.conditions = new ArrayList<CustomResourceDefinitionConditionBuilder>(); for (CustomResourceDefinitionCondition item : conditions){this.addToConditions(item);}} else { this.conditions = new ArrayList<CustomResourceDefinitionConditionBuilder>();} return (A) this;
    }

    public A withConditions(CustomResourceDefinitionCondition... conditions){
            if (this.conditions != null) {this.conditions.clear();}
            if (conditions != null) {for (CustomResourceDefinitionCondition item :conditions){ this.addToConditions(item);}} return (A) this;
    }

    public Boolean hasConditions(){
            return conditions != null && !conditions.isEmpty();
    }

    public A addNewCondition(String lastTransitionTime,String message,String reason,String status,String type){
            return (A)addToConditions(new CustomResourceDefinitionCondition(lastTransitionTime, message, reason, status, type));
    }

    public CustomResourceDefinitionStatusFluent.ConditionsNested<A> addNewCondition(){
            return new ConditionsNestedImpl();
    }

    public CustomResourceDefinitionStatusFluent.ConditionsNested<A> addNewConditionLike(CustomResourceDefinitionCondition item){
            return new ConditionsNestedImpl(-1, item);
    }

    public CustomResourceDefinitionStatusFluent.ConditionsNested<A> setNewConditionLike(int index,CustomResourceDefinitionCondition item){
            return new ConditionsNestedImpl(index, item);
    }

    public CustomResourceDefinitionStatusFluent.ConditionsNested<A> editCondition(int index){
            if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public CustomResourceDefinitionStatusFluent.ConditionsNested<A> editFirstCondition(){
            if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
            return setNewConditionLike(0, buildCondition(0));
    }

    public CustomResourceDefinitionStatusFluent.ConditionsNested<A> editLastCondition(){
            int index = conditions.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public CustomResourceDefinitionStatusFluent.ConditionsNested<A> editMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<CustomResourceDefinitionConditionBuilder> predicate){
            int index = -1;
            for (int i=0;i<conditions.size();i++) { 
            if (predicate.apply(conditions.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public A addToStoredVersions(int index,String item){
            if (this.storedVersions == null) {this.storedVersions = new ArrayList<String>();}
            this.storedVersions.add(index, item);
            return (A)this;
    }

    public A setToStoredVersions(int index,String item){
            if (this.storedVersions == null) {this.storedVersions = new ArrayList<String>();}
            this.storedVersions.set(index, item); return (A)this;
    }

    public A addToStoredVersions(String... items){
            if (this.storedVersions == null) {this.storedVersions = new ArrayList<String>();}
            for (String item : items) {this.storedVersions.add(item);} return (A)this;
    }

    public A addAllToStoredVersions(Collection<String> items){
            if (this.storedVersions == null) {this.storedVersions = new ArrayList<String>();}
            for (String item : items) {this.storedVersions.add(item);} return (A)this;
    }

    public A removeFromStoredVersions(String... items){
            for (String item : items) {if (this.storedVersions!= null){ this.storedVersions.remove(item);}} return (A)this;
    }

    public A removeAllFromStoredVersions(Collection<String> items){
            for (String item : items) {if (this.storedVersions!= null){ this.storedVersions.remove(item);}} return (A)this;
    }

    public List<String> getStoredVersions(){
            return this.storedVersions;
    }

    public String getStoredVersion(int index){
            return this.storedVersions.get(index);
    }

    public String getFirstStoredVersion(){
            return this.storedVersions.get(0);
    }

    public String getLastStoredVersion(){
            return this.storedVersions.get(storedVersions.size() - 1);
    }

    public String getMatchingStoredVersion(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: storedVersions) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withStoredVersions(List<String> storedVersions){
            if (this.storedVersions != null) { _visitables.removeAll(this.storedVersions);}
            if (storedVersions != null) {this.storedVersions = new ArrayList<String>(); for (String item : storedVersions){this.addToStoredVersions(item);}} else { this.storedVersions = new ArrayList<String>();} return (A) this;
    }

    public A withStoredVersions(String... storedVersions){
            if (this.storedVersions != null) {this.storedVersions.clear();}
            if (storedVersions != null) {for (String item :storedVersions){ this.addToStoredVersions(item);}} return (A) this;
    }

    public Boolean hasStoredVersions(){
            return storedVersions != null && !storedVersions.isEmpty();
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CustomResourceDefinitionStatusFluentImpl that = (CustomResourceDefinitionStatusFluentImpl) o;
            if (acceptedNames != null ? !acceptedNames.equals(that.acceptedNames) :that.acceptedNames != null) return false;
            if (conditions != null ? !conditions.equals(that.conditions) :that.conditions != null) return false;
            if (storedVersions != null ? !storedVersions.equals(that.storedVersions) :that.storedVersions != null) return false;
            return true;
    }


    public class AcceptedNamesNestedImpl<N> extends CustomResourceDefinitionNamesFluentImpl<CustomResourceDefinitionStatusFluent.AcceptedNamesNested<N>> implements CustomResourceDefinitionStatusFluent.AcceptedNamesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomResourceDefinitionNamesBuilder builder;
    
            AcceptedNamesNestedImpl(CustomResourceDefinitionNames item){
                    this.builder = new CustomResourceDefinitionNamesBuilder(this, item);
            }
            AcceptedNamesNestedImpl(){
                    this.builder = new CustomResourceDefinitionNamesBuilder(this);
            }
    
    public N and(){
            return (N) CustomResourceDefinitionStatusFluentImpl.this.withAcceptedNames(builder.build());
    }
    public N endAcceptedNames(){
            return and();
    }

}
    public class ConditionsNestedImpl<N> extends CustomResourceDefinitionConditionFluentImpl<CustomResourceDefinitionStatusFluent.ConditionsNested<N>> implements CustomResourceDefinitionStatusFluent.ConditionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomResourceDefinitionConditionBuilder builder;
        private final int index;
    
            ConditionsNestedImpl(int index,CustomResourceDefinitionCondition item){
                    this.index = index;
                    this.builder = new CustomResourceDefinitionConditionBuilder(this, item);
            }
            ConditionsNestedImpl(){
                    this.index = -1;
                    this.builder = new CustomResourceDefinitionConditionBuilder(this);
            }
    
    public N and(){
            return (N) CustomResourceDefinitionStatusFluentImpl.this.setToConditions(index, builder.build());
    }
    public N endCondition(){
            return and();
    }

}


}
