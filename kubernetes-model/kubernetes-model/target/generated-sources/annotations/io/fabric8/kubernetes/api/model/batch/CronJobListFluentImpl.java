package io.fabric8.kubernetes.api.model.batch;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.ListMeta;
import io.fabric8.kubernetes.api.model.ListMetaBuilder;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.ListMetaFluentImpl;
import java.util.Collection;
import java.lang.Object;

public class CronJobListFluentImpl<A extends CronJobListFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements CronJobListFluent<A>{

    private String apiVersion;
    private List<CronJobBuilder> items;
    private String kind;
    private ListMetaBuilder metadata;

    public CronJobListFluentImpl(){
    }
    public CronJobListFluentImpl(CronJobList instance){
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
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

    public A addToItems(int index,CronJob item){
            if (this.items == null) {this.items = new ArrayList<CronJobBuilder>();}
            CronJobBuilder builder = new CronJobBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToItems(int index,CronJob item){
            if (this.items == null) {this.items = new ArrayList<CronJobBuilder>();}
            CronJobBuilder builder = new CronJobBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToItems(CronJob... items){
            if (this.items == null) {this.items = new ArrayList<CronJobBuilder>();}
            for (CronJob item : items) {CronJobBuilder builder = new CronJobBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToItems(Collection<CronJob> items){
            if (this.items == null) {this.items = new ArrayList<CronJobBuilder>();}
            for (CronJob item : items) {CronJobBuilder builder = new CronJobBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromItems(CronJob... items){
            for (CronJob item : items) {CronJobBuilder builder = new CronJobBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromItems(Collection<CronJob> items){
            for (CronJob item : items) {CronJobBuilder builder = new CronJobBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<CronJob> getItems(){
            return build(items);
    }

    public List<CronJob> buildItems(){
            return build(items);
    }

    public CronJob buildItem(int index){
            return this.items.get(index).build();
    }

    public CronJob buildFirstItem(){
            return this.items.get(0).build();
    }

    public CronJob buildLastItem(){
            return this.items.get(items.size() - 1).build();
    }

    public CronJob buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<CronJobBuilder> predicate){
            for (CronJobBuilder item: items) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withItems(List<CronJob> items){
            if (this.items != null) { _visitables.removeAll(this.items);}
            if (items != null) {this.items = new ArrayList<CronJobBuilder>(); for (CronJob item : items){this.addToItems(item);}} else { this.items = new ArrayList<CronJobBuilder>();} return (A) this;
    }

    public A withItems(CronJob... items){
            if (this.items != null) {this.items.clear();}
            if (items != null) {for (CronJob item :items){ this.addToItems(item);}} return (A) this;
    }

    public Boolean hasItems(){
            return items != null && !items.isEmpty();
    }

    public CronJobListFluent.ItemsNested<A> addNewItem(){
            return new ItemsNestedImpl();
    }

    public CronJobListFluent.ItemsNested<A> addNewItemLike(CronJob item){
            return new ItemsNestedImpl(-1, item);
    }

    public CronJobListFluent.ItemsNested<A> setNewItemLike(int index,CronJob item){
            return new ItemsNestedImpl(index, item);
    }

    public CronJobListFluent.ItemsNested<A> editItem(int index){
            if (items.size() <= index) throw new RuntimeException("Can't edit items. Index exceeds size.");
            return setNewItemLike(index, buildItem(index));
    }

    public CronJobListFluent.ItemsNested<A> editFirstItem(){
            if (items.size() == 0) throw new RuntimeException("Can't edit first items. The list is empty.");
            return setNewItemLike(0, buildItem(0));
    }

    public CronJobListFluent.ItemsNested<A> editLastItem(){
            int index = items.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last items. The list is empty.");
            return setNewItemLike(index, buildItem(index));
    }

    public CronJobListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<CronJobBuilder> predicate){
            int index = -1;
            for (int i=0;i<items.size();i++) { 
            if (predicate.apply(items.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching items. No match found.");
            return setNewItemLike(index, buildItem(index));
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
@Deprecated public ListMeta getMetadata(){
            return this.metadata!=null?this.metadata.build():null;
    }

    public ListMeta buildMetadata(){
            return this.metadata!=null?this.metadata.build():null;
    }

    public A withMetadata(ListMeta metadata){
            _visitables.remove(this.metadata);
            if (metadata!=null){ this.metadata= new ListMetaBuilder(metadata); _visitables.add(this.metadata);} return (A) this;
    }

    public Boolean hasMetadata(){
            return this.metadata != null;
    }

    public A withNewMetadata(String _continue,String resourceVersion,String selfLink){
            return (A)withMetadata(new ListMeta(_continue, resourceVersion, selfLink));
    }

    public CronJobListFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public CronJobListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item){
            return new MetadataNestedImpl(item);
    }

    public CronJobListFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public CronJobListFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ListMetaBuilder().build());
    }

    public CronJobListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CronJobListFluentImpl that = (CronJobListFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (items != null ? !items.equals(that.items) :that.items != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            return true;
    }


    public class ItemsNestedImpl<N> extends CronJobFluentImpl<CronJobListFluent.ItemsNested<N>> implements CronJobListFluent.ItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CronJobBuilder builder;
        private final int index;
    
            ItemsNestedImpl(int index,CronJob item){
                    this.index = index;
                    this.builder = new CronJobBuilder(this, item);
            }
            ItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new CronJobBuilder(this);
            }
    
    public N and(){
            return (N) CronJobListFluentImpl.this.setToItems(index, builder.build());
    }
    public N endItem(){
            return and();
    }

}
    public class MetadataNestedImpl<N> extends ListMetaFluentImpl<CronJobListFluent.MetadataNested<N>> implements CronJobListFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ListMetaBuilder builder;
    
            MetadataNestedImpl(ListMeta item){
                    this.builder = new ListMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ListMetaBuilder(this);
            }
    
    public N and(){
            return (N) CronJobListFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}


}
