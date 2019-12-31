package io.fabric8.kubernetes.api.model.certificates;

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

public interface CertificateSigningRequestListFluent<A extends CertificateSigningRequestListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,CertificateSigningRequest item);
    public A setToItems(int index,CertificateSigningRequest item);
    public A addToItems(CertificateSigningRequest... items);
    public A addAllToItems(Collection<CertificateSigningRequest> items);
    public A removeFromItems(CertificateSigningRequest... items);
    public A removeAllFromItems(Collection<CertificateSigningRequest> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<CertificateSigningRequest> getItems();
    public List<CertificateSigningRequest> buildItems();
    public CertificateSigningRequest buildItem(int index);
    public CertificateSigningRequest buildFirstItem();
    public CertificateSigningRequest buildLastItem();
    public CertificateSigningRequest buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<CertificateSigningRequestBuilder> predicate);
    public A withItems(List<CertificateSigningRequest> items);
    public A withItems(CertificateSigningRequest... items);
    public Boolean hasItems();
    public CertificateSigningRequestListFluent.ItemsNested<A> addNewItem();
    public CertificateSigningRequestListFluent.ItemsNested<A> addNewItemLike(CertificateSigningRequest item);
    public CertificateSigningRequestListFluent.ItemsNested<A> setNewItemLike(int index,CertificateSigningRequest item);
    public CertificateSigningRequestListFluent.ItemsNested<A> editItem(int index);
    public CertificateSigningRequestListFluent.ItemsNested<A> editFirstItem();
    public CertificateSigningRequestListFluent.ItemsNested<A> editLastItem();
    public CertificateSigningRequestListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<CertificateSigningRequestBuilder> predicate);
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
    public CertificateSigningRequestListFluent.MetadataNested<A> withNewMetadata();
    public CertificateSigningRequestListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public CertificateSigningRequestListFluent.MetadataNested<A> editMetadata();
    public CertificateSigningRequestListFluent.MetadataNested<A> editOrNewMetadata();
    public CertificateSigningRequestListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CertificateSigningRequestFluent<CertificateSigningRequestListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<CertificateSigningRequestListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
