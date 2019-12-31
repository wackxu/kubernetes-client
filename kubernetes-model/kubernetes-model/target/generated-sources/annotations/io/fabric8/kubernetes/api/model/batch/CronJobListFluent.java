package io.fabric8.kubernetes.api.model.batch;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.ListMetaFluent;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.builder.Predicate;
import io.fabric8.kubernetes.api.model.ListMeta;
import io.fabric8.kubernetes.api.model.ListMetaBuilder;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface CronJobListFluent<A extends CronJobListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,CronJob item);
    public A setToItems(int index,CronJob item);
    public A addToItems(CronJob... items);
    public A addAllToItems(Collection<CronJob> items);
    public A removeFromItems(CronJob... items);
    public A removeAllFromItems(Collection<CronJob> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<CronJob> getItems();
    public List<CronJob> buildItems();
    public CronJob buildItem(int index);
    public CronJob buildFirstItem();
    public CronJob buildLastItem();
    public CronJob buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<CronJobBuilder> predicate);
    public A withItems(List<CronJob> items);
    public A withItems(CronJob... items);
    public Boolean hasItems();
    public CronJobListFluent.ItemsNested<A> addNewItem();
    public CronJobListFluent.ItemsNested<A> addNewItemLike(CronJob item);
    public CronJobListFluent.ItemsNested<A> setNewItemLike(int index,CronJob item);
    public CronJobListFluent.ItemsNested<A> editItem(int index);
    public CronJobListFluent.ItemsNested<A> editFirstItem();
    public CronJobListFluent.ItemsNested<A> editLastItem();
    public CronJobListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<CronJobBuilder> predicate);
    public String getKind();
    public A withKind(String kind);
    public Boolean hasKind();
    
/**
 * This method has been deprecated, please use method buildMetadata instead.
 * @return The buildable object.
 */
@Deprecated public ListMeta getMetadata();
    public ListMeta buildMetadata();
    public A withMetadata(ListMeta metadata);
    public Boolean hasMetadata();
    public A withNewMetadata(String _continue,String resourceVersion,String selfLink);
    public CronJobListFluent.MetadataNested<A> withNewMetadata();
    public CronJobListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public CronJobListFluent.MetadataNested<A> editMetadata();
    public CronJobListFluent.MetadataNested<A> editOrNewMetadata();
    public CronJobListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CronJobFluent<CronJobListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<CronJobListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
