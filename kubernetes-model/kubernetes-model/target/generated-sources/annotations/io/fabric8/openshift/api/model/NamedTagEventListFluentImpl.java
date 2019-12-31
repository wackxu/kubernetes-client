package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import javax.validation.Valid;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;

public class NamedTagEventListFluentImpl<A extends NamedTagEventListFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements NamedTagEventListFluent<A>{

    private List<TagEventConditionBuilder> conditions;
    private List<TagEventBuilder> items;
    private String tag;

    public NamedTagEventListFluentImpl(){
    }
    public NamedTagEventListFluentImpl(NamedTagEventList instance){
            this.withConditions(instance.getConditions()); 
            this.withItems(instance.getItems()); 
            this.withTag(instance.getTag()); 
    }

    public A addToConditions(int index,TagEventCondition item){
            if (this.conditions == null) {this.conditions = new ArrayList<TagEventConditionBuilder>();}
            TagEventConditionBuilder builder = new TagEventConditionBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.conditions.add(index >= 0 ? index : conditions.size(), builder); return (A)this;
    }

    public A setToConditions(int index,TagEventCondition item){
            if (this.conditions == null) {this.conditions = new ArrayList<TagEventConditionBuilder>();}
            TagEventConditionBuilder builder = new TagEventConditionBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= conditions.size()) { conditions.add(builder); } else { conditions.set(index, builder);}
             return (A)this;
    }

    public A addToConditions(TagEventCondition... items){
            if (this.conditions == null) {this.conditions = new ArrayList<TagEventConditionBuilder>();}
            for (TagEventCondition item : items) {TagEventConditionBuilder builder = new TagEventConditionBuilder(item);_visitables.add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A addAllToConditions(Collection<TagEventCondition> items){
            if (this.conditions == null) {this.conditions = new ArrayList<TagEventConditionBuilder>();}
            for (TagEventCondition item : items) {TagEventConditionBuilder builder = new TagEventConditionBuilder(item);_visitables.add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A removeFromConditions(TagEventCondition... items){
            for (TagEventCondition item : items) {TagEventConditionBuilder builder = new TagEventConditionBuilder(item);_visitables.remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    public A removeAllFromConditions(Collection<TagEventCondition> items){
            for (TagEventCondition item : items) {TagEventConditionBuilder builder = new TagEventConditionBuilder(item);_visitables.remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildConditions instead.
 * @return The buildable object.
 */
@Deprecated public List<TagEventCondition> getConditions(){
            return build(conditions);
    }

    public List<TagEventCondition> buildConditions(){
            return build(conditions);
    }

    public TagEventCondition buildCondition(int index){
            return this.conditions.get(index).build();
    }

    public TagEventCondition buildFirstCondition(){
            return this.conditions.get(0).build();
    }

    public TagEventCondition buildLastCondition(){
            return this.conditions.get(conditions.size() - 1).build();
    }

    public TagEventCondition buildMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<TagEventConditionBuilder> predicate){
            for (TagEventConditionBuilder item: conditions) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withConditions(List<TagEventCondition> conditions){
            if (this.conditions != null) { _visitables.removeAll(this.conditions);}
            if (conditions != null) {this.conditions = new ArrayList<TagEventConditionBuilder>(); for (TagEventCondition item : conditions){this.addToConditions(item);}} else { this.conditions = new ArrayList<TagEventConditionBuilder>();} return (A) this;
    }

    public A withConditions(TagEventCondition... conditions){
            if (this.conditions != null) {this.conditions.clear();}
            if (conditions != null) {for (TagEventCondition item :conditions){ this.addToConditions(item);}} return (A) this;
    }

    public Boolean hasConditions(){
            return conditions != null && !conditions.isEmpty();
    }

    public NamedTagEventListFluent.ConditionsNested<A> addNewCondition(){
            return new ConditionsNestedImpl();
    }

    public NamedTagEventListFluent.ConditionsNested<A> addNewConditionLike(TagEventCondition item){
            return new ConditionsNestedImpl(-1, item);
    }

    public NamedTagEventListFluent.ConditionsNested<A> setNewConditionLike(int index,TagEventCondition item){
            return new ConditionsNestedImpl(index, item);
    }

    public NamedTagEventListFluent.ConditionsNested<A> editCondition(int index){
            if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public NamedTagEventListFluent.ConditionsNested<A> editFirstCondition(){
            if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
            return setNewConditionLike(0, buildCondition(0));
    }

    public NamedTagEventListFluent.ConditionsNested<A> editLastCondition(){
            int index = conditions.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public NamedTagEventListFluent.ConditionsNested<A> editMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<TagEventConditionBuilder> predicate){
            int index = -1;
            for (int i=0;i<conditions.size();i++) { 
            if (predicate.apply(conditions.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public A addToItems(int index,TagEvent item){
            if (this.items == null) {this.items = new ArrayList<TagEventBuilder>();}
            TagEventBuilder builder = new TagEventBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToItems(int index,TagEvent item){
            if (this.items == null) {this.items = new ArrayList<TagEventBuilder>();}
            TagEventBuilder builder = new TagEventBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToItems(TagEvent... items){
            if (this.items == null) {this.items = new ArrayList<TagEventBuilder>();}
            for (TagEvent item : items) {TagEventBuilder builder = new TagEventBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToItems(Collection<TagEvent> items){
            if (this.items == null) {this.items = new ArrayList<TagEventBuilder>();}
            for (TagEvent item : items) {TagEventBuilder builder = new TagEventBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromItems(TagEvent... items){
            for (TagEvent item : items) {TagEventBuilder builder = new TagEventBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromItems(Collection<TagEvent> items){
            for (TagEvent item : items) {TagEventBuilder builder = new TagEventBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<TagEvent> getItems(){
            return build(items);
    }

    public List<TagEvent> buildItems(){
            return build(items);
    }

    public TagEvent buildItem(int index){
            return this.items.get(index).build();
    }

    public TagEvent buildFirstItem(){
            return this.items.get(0).build();
    }

    public TagEvent buildLastItem(){
            return this.items.get(items.size() - 1).build();
    }

    public TagEvent buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<TagEventBuilder> predicate){
            for (TagEventBuilder item: items) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withItems(List<TagEvent> items){
            if (this.items != null) { _visitables.removeAll(this.items);}
            if (items != null) {this.items = new ArrayList<TagEventBuilder>(); for (TagEvent item : items){this.addToItems(item);}} else { this.items = new ArrayList<TagEventBuilder>();} return (A) this;
    }

    public A withItems(TagEvent... items){
            if (this.items != null) {this.items.clear();}
            if (items != null) {for (TagEvent item :items){ this.addToItems(item);}} return (A) this;
    }

    public Boolean hasItems(){
            return items != null && !items.isEmpty();
    }

    public A addNewItem(String created,String dockerImageReference,Long generation,String image){
            return (A)addToItems(new TagEvent(created, dockerImageReference, generation, image));
    }

    public NamedTagEventListFluent.ItemsNested<A> addNewItem(){
            return new ItemsNestedImpl();
    }

    public NamedTagEventListFluent.ItemsNested<A> addNewItemLike(TagEvent item){
            return new ItemsNestedImpl(-1, item);
    }

    public NamedTagEventListFluent.ItemsNested<A> setNewItemLike(int index,TagEvent item){
            return new ItemsNestedImpl(index, item);
    }

    public NamedTagEventListFluent.ItemsNested<A> editItem(int index){
            if (items.size() <= index) throw new RuntimeException("Can't edit items. Index exceeds size.");
            return setNewItemLike(index, buildItem(index));
    }

    public NamedTagEventListFluent.ItemsNested<A> editFirstItem(){
            if (items.size() == 0) throw new RuntimeException("Can't edit first items. The list is empty.");
            return setNewItemLike(0, buildItem(0));
    }

    public NamedTagEventListFluent.ItemsNested<A> editLastItem(){
            int index = items.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last items. The list is empty.");
            return setNewItemLike(index, buildItem(index));
    }

    public NamedTagEventListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<TagEventBuilder> predicate){
            int index = -1;
            for (int i=0;i<items.size();i++) { 
            if (predicate.apply(items.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching items. No match found.");
            return setNewItemLike(index, buildItem(index));
    }

    public String getTag(){
            return this.tag;
    }

    public A withTag(String tag){
            this.tag=tag; return (A) this;
    }

    public Boolean hasTag(){
            return this.tag != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NamedTagEventListFluentImpl that = (NamedTagEventListFluentImpl) o;
            if (conditions != null ? !conditions.equals(that.conditions) :that.conditions != null) return false;
            if (items != null ? !items.equals(that.items) :that.items != null) return false;
            if (tag != null ? !tag.equals(that.tag) :that.tag != null) return false;
            return true;
    }


    public class ConditionsNestedImpl<N> extends TagEventConditionFluentImpl<NamedTagEventListFluent.ConditionsNested<N>> implements NamedTagEventListFluent.ConditionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TagEventConditionBuilder builder;
        private final int index;
    
            ConditionsNestedImpl(int index,TagEventCondition item){
                    this.index = index;
                    this.builder = new TagEventConditionBuilder(this, item);
            }
            ConditionsNestedImpl(){
                    this.index = -1;
                    this.builder = new TagEventConditionBuilder(this);
            }
    
    public N and(){
            return (N) NamedTagEventListFluentImpl.this.setToConditions(index, builder.build());
    }
    public N endCondition(){
            return and();
    }

}
    public class ItemsNestedImpl<N> extends TagEventFluentImpl<NamedTagEventListFluent.ItemsNested<N>> implements NamedTagEventListFluent.ItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TagEventBuilder builder;
        private final int index;
    
            ItemsNestedImpl(int index,TagEvent item){
                    this.index = index;
                    this.builder = new TagEventBuilder(this, item);
            }
            ItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new TagEventBuilder(this);
            }
    
    public N and(){
            return (N) NamedTagEventListFluentImpl.this.setToItems(index, builder.build());
    }
    public N endItem(){
            return and();
    }

}


}
