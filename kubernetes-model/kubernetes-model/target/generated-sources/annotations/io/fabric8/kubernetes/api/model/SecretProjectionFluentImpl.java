package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class SecretProjectionFluentImpl<A extends SecretProjectionFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements SecretProjectionFluent<A>{

    private List<KeyToPathBuilder> items;
    private String name;
    private Boolean optional;

    public SecretProjectionFluentImpl(){
    }
    public SecretProjectionFluentImpl(SecretProjection instance){
            this.withItems(instance.getItems()); 
            this.withName(instance.getName()); 
            this.withOptional(instance.getOptional()); 
    }

    public A addToItems(int index,KeyToPath item){
            if (this.items == null) {this.items = new ArrayList<KeyToPathBuilder>();}
            KeyToPathBuilder builder = new KeyToPathBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToItems(int index,KeyToPath item){
            if (this.items == null) {this.items = new ArrayList<KeyToPathBuilder>();}
            KeyToPathBuilder builder = new KeyToPathBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToItems(KeyToPath... items){
            if (this.items == null) {this.items = new ArrayList<KeyToPathBuilder>();}
            for (KeyToPath item : items) {KeyToPathBuilder builder = new KeyToPathBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToItems(Collection<KeyToPath> items){
            if (this.items == null) {this.items = new ArrayList<KeyToPathBuilder>();}
            for (KeyToPath item : items) {KeyToPathBuilder builder = new KeyToPathBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromItems(KeyToPath... items){
            for (KeyToPath item : items) {KeyToPathBuilder builder = new KeyToPathBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromItems(Collection<KeyToPath> items){
            for (KeyToPath item : items) {KeyToPathBuilder builder = new KeyToPathBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<KeyToPath> getItems(){
            return build(items);
    }

    public List<KeyToPath> buildItems(){
            return build(items);
    }

    public KeyToPath buildItem(int index){
            return this.items.get(index).build();
    }

    public KeyToPath buildFirstItem(){
            return this.items.get(0).build();
    }

    public KeyToPath buildLastItem(){
            return this.items.get(items.size() - 1).build();
    }

    public KeyToPath buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<KeyToPathBuilder> predicate){
            for (KeyToPathBuilder item: items) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withItems(List<KeyToPath> items){
            if (this.items != null) { _visitables.removeAll(this.items);}
            if (items != null) {this.items = new ArrayList<KeyToPathBuilder>(); for (KeyToPath item : items){this.addToItems(item);}} else { this.items = new ArrayList<KeyToPathBuilder>();} return (A) this;
    }

    public A withItems(KeyToPath... items){
            if (this.items != null) {this.items.clear();}
            if (items != null) {for (KeyToPath item :items){ this.addToItems(item);}} return (A) this;
    }

    public Boolean hasItems(){
            return items != null && !items.isEmpty();
    }

    public A addNewItem(String key,Integer mode,String path){
            return (A)addToItems(new KeyToPath(key, mode, path));
    }

    public SecretProjectionFluent.ItemsNested<A> addNewItem(){
            return new ItemsNestedImpl();
    }

    public SecretProjectionFluent.ItemsNested<A> addNewItemLike(KeyToPath item){
            return new ItemsNestedImpl(-1, item);
    }

    public SecretProjectionFluent.ItemsNested<A> setNewItemLike(int index,KeyToPath item){
            return new ItemsNestedImpl(index, item);
    }

    public SecretProjectionFluent.ItemsNested<A> editItem(int index){
            if (items.size() <= index) throw new RuntimeException("Can't edit items. Index exceeds size.");
            return setNewItemLike(index, buildItem(index));
    }

    public SecretProjectionFluent.ItemsNested<A> editFirstItem(){
            if (items.size() == 0) throw new RuntimeException("Can't edit first items. The list is empty.");
            return setNewItemLike(0, buildItem(0));
    }

    public SecretProjectionFluent.ItemsNested<A> editLastItem(){
            int index = items.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last items. The list is empty.");
            return setNewItemLike(index, buildItem(index));
    }

    public SecretProjectionFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<KeyToPathBuilder> predicate){
            int index = -1;
            for (int i=0;i<items.size();i++) { 
            if (predicate.apply(items.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching items. No match found.");
            return setNewItemLike(index, buildItem(index));
    }

    public String getName(){
            return this.name;
    }

    public A withName(String name){
            this.name=name; return (A) this;
    }

    public Boolean hasName(){
            return this.name != null;
    }

    public Boolean isOptional(){
            return this.optional;
    }

    public A withOptional(Boolean optional){
            this.optional=optional; return (A) this;
    }

    public Boolean hasOptional(){
            return this.optional != null;
    }

    public A withNewOptional(String arg1){
            return (A)withOptional(new Boolean(arg1));
    }

    public A withNewOptional(boolean arg1){
            return (A)withOptional(new Boolean(arg1));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SecretProjectionFluentImpl that = (SecretProjectionFluentImpl) o;
            if (items != null ? !items.equals(that.items) :that.items != null) return false;
            if (name != null ? !name.equals(that.name) :that.name != null) return false;
            if (optional != null ? !optional.equals(that.optional) :that.optional != null) return false;
            return true;
    }


    public class ItemsNestedImpl<N> extends KeyToPathFluentImpl<SecretProjectionFluent.ItemsNested<N>> implements SecretProjectionFluent.ItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final KeyToPathBuilder builder;
        private final int index;
    
            ItemsNestedImpl(int index,KeyToPath item){
                    this.index = index;
                    this.builder = new KeyToPathBuilder(this, item);
            }
            ItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new KeyToPathBuilder(this);
            }
    
    public N and(){
            return (N) SecretProjectionFluentImpl.this.setToItems(index, builder.build());
    }
    public N endItem(){
            return and();
    }

}


}
