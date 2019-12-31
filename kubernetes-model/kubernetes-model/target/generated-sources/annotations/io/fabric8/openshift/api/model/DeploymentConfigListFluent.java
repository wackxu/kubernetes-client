package io.fabric8.openshift.api.model;

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

public interface DeploymentConfigListFluent<A extends DeploymentConfigListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,DeploymentConfig item);
    public A setToItems(int index,DeploymentConfig item);
    public A addToItems(DeploymentConfig... items);
    public A addAllToItems(Collection<DeploymentConfig> items);
    public A removeFromItems(DeploymentConfig... items);
    public A removeAllFromItems(Collection<DeploymentConfig> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<DeploymentConfig> getItems();
    public List<DeploymentConfig> buildItems();
    public DeploymentConfig buildItem(int index);
    public DeploymentConfig buildFirstItem();
    public DeploymentConfig buildLastItem();
    public DeploymentConfig buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<DeploymentConfigBuilder> predicate);
    public A withItems(List<DeploymentConfig> items);
    public A withItems(DeploymentConfig... items);
    public Boolean hasItems();
    public DeploymentConfigListFluent.ItemsNested<A> addNewItem();
    public DeploymentConfigListFluent.ItemsNested<A> addNewItemLike(DeploymentConfig item);
    public DeploymentConfigListFluent.ItemsNested<A> setNewItemLike(int index,DeploymentConfig item);
    public DeploymentConfigListFluent.ItemsNested<A> editItem(int index);
    public DeploymentConfigListFluent.ItemsNested<A> editFirstItem();
    public DeploymentConfigListFluent.ItemsNested<A> editLastItem();
    public DeploymentConfigListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<DeploymentConfigBuilder> predicate);
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
    public DeploymentConfigListFluent.MetadataNested<A> withNewMetadata();
    public DeploymentConfigListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public DeploymentConfigListFluent.MetadataNested<A> editMetadata();
    public DeploymentConfigListFluent.MetadataNested<A> editOrNewMetadata();
    public DeploymentConfigListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentConfigFluent<DeploymentConfigListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<DeploymentConfigListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
