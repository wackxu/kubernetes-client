package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface ServiceAccountRestrictionFluent<A extends ServiceAccountRestrictionFluent<A>> extends Fluent<A>{


    public A addToNamespaces(int index,String item);
    public A setToNamespaces(int index,String item);
    public A addToNamespaces(String... items);
    public A addAllToNamespaces(Collection<String> items);
    public A removeFromNamespaces(String... items);
    public A removeAllFromNamespaces(Collection<String> items);
    public List<String> getNamespaces();
    public String getNamespace(int index);
    public String getFirstNamespace();
    public String getLastNamespace();
    public String getMatchingNamespace(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withNamespaces(List<String> namespaces);
    public A withNamespaces(String... namespaces);
    public Boolean hasNamespaces();
    public A addToServiceaccounts(int index,ServiceAccountReference item);
    public A setToServiceaccounts(int index,ServiceAccountReference item);
    public A addToServiceaccounts(ServiceAccountReference... items);
    public A addAllToServiceaccounts(Collection<ServiceAccountReference> items);
    public A removeFromServiceaccounts(ServiceAccountReference... items);
    public A removeAllFromServiceaccounts(Collection<ServiceAccountReference> items);
    
/**
 * This method has been deprecated, please use method buildServiceaccounts instead.
 * @return The buildable object.
 */
@Deprecated public List<ServiceAccountReference> getServiceaccounts();
    public List<ServiceAccountReference> buildServiceaccounts();
    public ServiceAccountReference buildServiceaccount(int index);
    public ServiceAccountReference buildFirstServiceaccount();
    public ServiceAccountReference buildLastServiceaccount();
    public ServiceAccountReference buildMatchingServiceaccount(io.fabric8.kubernetes.api.builder.Predicate<ServiceAccountReferenceBuilder> predicate);
    public A withServiceaccounts(List<ServiceAccountReference> serviceaccounts);
    public A withServiceaccounts(ServiceAccountReference... serviceaccounts);
    public Boolean hasServiceaccounts();
    public A addNewServiceaccount(String name,String namespace);
    public ServiceAccountRestrictionFluent.ServiceaccountsNested<A> addNewServiceaccount();
    public ServiceAccountRestrictionFluent.ServiceaccountsNested<A> addNewServiceaccountLike(ServiceAccountReference item);
    public ServiceAccountRestrictionFluent.ServiceaccountsNested<A> setNewServiceaccountLike(int index,ServiceAccountReference item);
    public ServiceAccountRestrictionFluent.ServiceaccountsNested<A> editServiceaccount(int index);
    public ServiceAccountRestrictionFluent.ServiceaccountsNested<A> editFirstServiceaccount();
    public ServiceAccountRestrictionFluent.ServiceaccountsNested<A> editLastServiceaccount();
    public ServiceAccountRestrictionFluent.ServiceaccountsNested<A> editMatchingServiceaccount(io.fabric8.kubernetes.api.builder.Predicate<ServiceAccountReferenceBuilder> predicate);

    public interface ServiceaccountsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ServiceAccountReferenceFluent<ServiceAccountRestrictionFluent.ServiceaccountsNested<N>>{

        
    public N and();    public N endServiceaccount();
}


}
