package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class DownwardAPIVolumeSourceFluentImpl<A extends DownwardAPIVolumeSourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements DownwardAPIVolumeSourceFluent<A>{

    private Integer defaultMode;
    private List<DownwardAPIVolumeFileBuilder> items;

    public DownwardAPIVolumeSourceFluentImpl(){
    }
    public DownwardAPIVolumeSourceFluentImpl(DownwardAPIVolumeSource instance){
            this.withDefaultMode(instance.getDefaultMode()); 
            this.withItems(instance.getItems()); 
    }

    public Integer getDefaultMode(){
            return this.defaultMode;
    }

    public A withDefaultMode(Integer defaultMode){
            this.defaultMode=defaultMode; return (A) this;
    }

    public Boolean hasDefaultMode(){
            return this.defaultMode != null;
    }

    public A addToItems(int index,DownwardAPIVolumeFile item){
            if (this.items == null) {this.items = new ArrayList<DownwardAPIVolumeFileBuilder>();}
            DownwardAPIVolumeFileBuilder builder = new DownwardAPIVolumeFileBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToItems(int index,DownwardAPIVolumeFile item){
            if (this.items == null) {this.items = new ArrayList<DownwardAPIVolumeFileBuilder>();}
            DownwardAPIVolumeFileBuilder builder = new DownwardAPIVolumeFileBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToItems(DownwardAPIVolumeFile... items){
            if (this.items == null) {this.items = new ArrayList<DownwardAPIVolumeFileBuilder>();}
            for (DownwardAPIVolumeFile item : items) {DownwardAPIVolumeFileBuilder builder = new DownwardAPIVolumeFileBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToItems(Collection<DownwardAPIVolumeFile> items){
            if (this.items == null) {this.items = new ArrayList<DownwardAPIVolumeFileBuilder>();}
            for (DownwardAPIVolumeFile item : items) {DownwardAPIVolumeFileBuilder builder = new DownwardAPIVolumeFileBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromItems(DownwardAPIVolumeFile... items){
            for (DownwardAPIVolumeFile item : items) {DownwardAPIVolumeFileBuilder builder = new DownwardAPIVolumeFileBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromItems(Collection<DownwardAPIVolumeFile> items){
            for (DownwardAPIVolumeFile item : items) {DownwardAPIVolumeFileBuilder builder = new DownwardAPIVolumeFileBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<DownwardAPIVolumeFile> getItems(){
            return build(items);
    }

    public List<DownwardAPIVolumeFile> buildItems(){
            return build(items);
    }

    public DownwardAPIVolumeFile buildItem(int index){
            return this.items.get(index).build();
    }

    public DownwardAPIVolumeFile buildFirstItem(){
            return this.items.get(0).build();
    }

    public DownwardAPIVolumeFile buildLastItem(){
            return this.items.get(items.size() - 1).build();
    }

    public DownwardAPIVolumeFile buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<DownwardAPIVolumeFileBuilder> predicate){
            for (DownwardAPIVolumeFileBuilder item: items) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withItems(List<DownwardAPIVolumeFile> items){
            if (this.items != null) { _visitables.removeAll(this.items);}
            if (items != null) {this.items = new ArrayList<DownwardAPIVolumeFileBuilder>(); for (DownwardAPIVolumeFile item : items){this.addToItems(item);}} else { this.items = new ArrayList<DownwardAPIVolumeFileBuilder>();} return (A) this;
    }

    public A withItems(DownwardAPIVolumeFile... items){
            if (this.items != null) {this.items.clear();}
            if (items != null) {for (DownwardAPIVolumeFile item :items){ this.addToItems(item);}} return (A) this;
    }

    public Boolean hasItems(){
            return items != null && !items.isEmpty();
    }

    public DownwardAPIVolumeSourceFluent.ItemsNested<A> addNewItem(){
            return new ItemsNestedImpl();
    }

    public DownwardAPIVolumeSourceFluent.ItemsNested<A> addNewItemLike(DownwardAPIVolumeFile item){
            return new ItemsNestedImpl(-1, item);
    }

    public DownwardAPIVolumeSourceFluent.ItemsNested<A> setNewItemLike(int index,DownwardAPIVolumeFile item){
            return new ItemsNestedImpl(index, item);
    }

    public DownwardAPIVolumeSourceFluent.ItemsNested<A> editItem(int index){
            if (items.size() <= index) throw new RuntimeException("Can't edit items. Index exceeds size.");
            return setNewItemLike(index, buildItem(index));
    }

    public DownwardAPIVolumeSourceFluent.ItemsNested<A> editFirstItem(){
            if (items.size() == 0) throw new RuntimeException("Can't edit first items. The list is empty.");
            return setNewItemLike(0, buildItem(0));
    }

    public DownwardAPIVolumeSourceFluent.ItemsNested<A> editLastItem(){
            int index = items.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last items. The list is empty.");
            return setNewItemLike(index, buildItem(index));
    }

    public DownwardAPIVolumeSourceFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<DownwardAPIVolumeFileBuilder> predicate){
            int index = -1;
            for (int i=0;i<items.size();i++) { 
            if (predicate.apply(items.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching items. No match found.");
            return setNewItemLike(index, buildItem(index));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DownwardAPIVolumeSourceFluentImpl that = (DownwardAPIVolumeSourceFluentImpl) o;
            if (defaultMode != null ? !defaultMode.equals(that.defaultMode) :that.defaultMode != null) return false;
            if (items != null ? !items.equals(that.items) :that.items != null) return false;
            return true;
    }


    public class ItemsNestedImpl<N> extends DownwardAPIVolumeFileFluentImpl<DownwardAPIVolumeSourceFluent.ItemsNested<N>> implements DownwardAPIVolumeSourceFluent.ItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DownwardAPIVolumeFileBuilder builder;
        private final int index;
    
            ItemsNestedImpl(int index,DownwardAPIVolumeFile item){
                    this.index = index;
                    this.builder = new DownwardAPIVolumeFileBuilder(this, item);
            }
            ItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new DownwardAPIVolumeFileBuilder(this);
            }
    
    public N and(){
            return (N) DownwardAPIVolumeSourceFluentImpl.this.setToItems(index, builder.build());
    }
    public N endItem(){
            return and();
    }

}


}
