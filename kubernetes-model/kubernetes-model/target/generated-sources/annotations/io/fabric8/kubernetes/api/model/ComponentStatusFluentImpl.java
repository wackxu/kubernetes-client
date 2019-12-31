package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;

public class ComponentStatusFluentImpl<A extends ComponentStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ComponentStatusFluent<A>{

    private String apiVersion;
    private List<ComponentConditionBuilder> conditions;
    private String kind;
    private ObjectMetaBuilder metadata;

    public ComponentStatusFluentImpl(){
    }
    public ComponentStatusFluentImpl(ComponentStatus instance){
            this.withApiVersion(instance.getApiVersion()); 
            this.withConditions(instance.getConditions()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
    }

    public String getApiVersion(){
            return this.apiVersion;
    }

    public A withApiVersion(String apiVersion){
            this.apiVersion=apiVersion; return (A) this;
    }

    public Boolean hasApiVersion(){
            return this.apiVersion != null;
    }

    public A addToConditions(int index,ComponentCondition item){
            if (this.conditions == null) {this.conditions = new ArrayList<ComponentConditionBuilder>();}
            ComponentConditionBuilder builder = new ComponentConditionBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.conditions.add(index >= 0 ? index : conditions.size(), builder); return (A)this;
    }

    public A setToConditions(int index,ComponentCondition item){
            if (this.conditions == null) {this.conditions = new ArrayList<ComponentConditionBuilder>();}
            ComponentConditionBuilder builder = new ComponentConditionBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= conditions.size()) { conditions.add(builder); } else { conditions.set(index, builder);}
             return (A)this;
    }

    public A addToConditions(ComponentCondition... items){
            if (this.conditions == null) {this.conditions = new ArrayList<ComponentConditionBuilder>();}
            for (ComponentCondition item : items) {ComponentConditionBuilder builder = new ComponentConditionBuilder(item);_visitables.add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A addAllToConditions(Collection<ComponentCondition> items){
            if (this.conditions == null) {this.conditions = new ArrayList<ComponentConditionBuilder>();}
            for (ComponentCondition item : items) {ComponentConditionBuilder builder = new ComponentConditionBuilder(item);_visitables.add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A removeFromConditions(ComponentCondition... items){
            for (ComponentCondition item : items) {ComponentConditionBuilder builder = new ComponentConditionBuilder(item);_visitables.remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    public A removeAllFromConditions(Collection<ComponentCondition> items){
            for (ComponentCondition item : items) {ComponentConditionBuilder builder = new ComponentConditionBuilder(item);_visitables.remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildConditions instead.
 * @return The buildable object.
 */
@Deprecated public List<ComponentCondition> getConditions(){
            return build(conditions);
    }

    public List<ComponentCondition> buildConditions(){
            return build(conditions);
    }

    public ComponentCondition buildCondition(int index){
            return this.conditions.get(index).build();
    }

    public ComponentCondition buildFirstCondition(){
            return this.conditions.get(0).build();
    }

    public ComponentCondition buildLastCondition(){
            return this.conditions.get(conditions.size() - 1).build();
    }

    public ComponentCondition buildMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<ComponentConditionBuilder> predicate){
            for (ComponentConditionBuilder item: conditions) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withConditions(List<ComponentCondition> conditions){
            if (this.conditions != null) { _visitables.removeAll(this.conditions);}
            if (conditions != null) {this.conditions = new ArrayList<ComponentConditionBuilder>(); for (ComponentCondition item : conditions){this.addToConditions(item);}} else { this.conditions = new ArrayList<ComponentConditionBuilder>();} return (A) this;
    }

    public A withConditions(ComponentCondition... conditions){
            if (this.conditions != null) {this.conditions.clear();}
            if (conditions != null) {for (ComponentCondition item :conditions){ this.addToConditions(item);}} return (A) this;
    }

    public Boolean hasConditions(){
            return conditions != null && !conditions.isEmpty();
    }

    public A addNewCondition(String error,String message,String status,String type){
            return (A)addToConditions(new ComponentCondition(error, message, status, type));
    }

    public ComponentStatusFluent.ConditionsNested<A> addNewCondition(){
            return new ConditionsNestedImpl();
    }

    public ComponentStatusFluent.ConditionsNested<A> addNewConditionLike(ComponentCondition item){
            return new ConditionsNestedImpl(-1, item);
    }

    public ComponentStatusFluent.ConditionsNested<A> setNewConditionLike(int index,ComponentCondition item){
            return new ConditionsNestedImpl(index, item);
    }

    public ComponentStatusFluent.ConditionsNested<A> editCondition(int index){
            if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public ComponentStatusFluent.ConditionsNested<A> editFirstCondition(){
            if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
            return setNewConditionLike(0, buildCondition(0));
    }

    public ComponentStatusFluent.ConditionsNested<A> editLastCondition(){
            int index = conditions.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public ComponentStatusFluent.ConditionsNested<A> editMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<ComponentConditionBuilder> predicate){
            int index = -1;
            for (int i=0;i<conditions.size();i++) { 
            if (predicate.apply(conditions.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public String getKind(){
            return this.kind;
    }

    public A withKind(String kind){
            this.kind=kind; return (A) this;
    }

    public Boolean hasKind(){
            return this.kind != null;
    }

    
/**
 * This method has been deprecated, please use method buildMetadata instead.
 * @return The buildable object.
 */
@Deprecated public ObjectMeta getMetadata(){
            return this.metadata!=null?this.metadata.build():null;
    }

    public ObjectMeta buildMetadata(){
            return this.metadata!=null?this.metadata.build():null;
    }

    public A withMetadata(ObjectMeta metadata){
            _visitables.remove(this.metadata);
            if (metadata!=null){ this.metadata= new ObjectMetaBuilder(metadata); _visitables.add(this.metadata);} return (A) this;
    }

    public Boolean hasMetadata(){
            return this.metadata != null;
    }

    public ComponentStatusFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public ComponentStatusFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public ComponentStatusFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public ComponentStatusFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public ComponentStatusFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ComponentStatusFluentImpl that = (ComponentStatusFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (conditions != null ? !conditions.equals(that.conditions) :that.conditions != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            return true;
    }


    public class ConditionsNestedImpl<N> extends ComponentConditionFluentImpl<ComponentStatusFluent.ConditionsNested<N>> implements ComponentStatusFluent.ConditionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ComponentConditionBuilder builder;
        private final int index;
    
            ConditionsNestedImpl(int index,ComponentCondition item){
                    this.index = index;
                    this.builder = new ComponentConditionBuilder(this, item);
            }
            ConditionsNestedImpl(){
                    this.index = -1;
                    this.builder = new ComponentConditionBuilder(this);
            }
    
    public N and(){
            return (N) ComponentStatusFluentImpl.this.setToConditions(index, builder.build());
    }
    public N endCondition(){
            return and();
    }

}
    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<ComponentStatusFluent.MetadataNested<N>> implements ComponentStatusFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) ComponentStatusFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}


}
