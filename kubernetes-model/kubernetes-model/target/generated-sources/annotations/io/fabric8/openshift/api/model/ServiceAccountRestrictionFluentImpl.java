package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class ServiceAccountRestrictionFluentImpl<A extends ServiceAccountRestrictionFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ServiceAccountRestrictionFluent<A>{

    private List<String> namespaces;
    private List<ServiceAccountReferenceBuilder> serviceaccounts;

    public ServiceAccountRestrictionFluentImpl(){
    }
    public ServiceAccountRestrictionFluentImpl(ServiceAccountRestriction instance){
            this.withNamespaces(instance.getNamespaces()); 
            this.withServiceaccounts(instance.getServiceaccounts()); 
    }

    public A addToNamespaces(int index,String item){
            if (this.namespaces == null) {this.namespaces = new ArrayList<String>();}
            this.namespaces.add(index, item);
            return (A)this;
    }

    public A setToNamespaces(int index,String item){
            if (this.namespaces == null) {this.namespaces = new ArrayList<String>();}
            this.namespaces.set(index, item); return (A)this;
    }

    public A addToNamespaces(String... items){
            if (this.namespaces == null) {this.namespaces = new ArrayList<String>();}
            for (String item : items) {this.namespaces.add(item);} return (A)this;
    }

    public A addAllToNamespaces(Collection<String> items){
            if (this.namespaces == null) {this.namespaces = new ArrayList<String>();}
            for (String item : items) {this.namespaces.add(item);} return (A)this;
    }

    public A removeFromNamespaces(String... items){
            for (String item : items) {if (this.namespaces!= null){ this.namespaces.remove(item);}} return (A)this;
    }

    public A removeAllFromNamespaces(Collection<String> items){
            for (String item : items) {if (this.namespaces!= null){ this.namespaces.remove(item);}} return (A)this;
    }

    public List<String> getNamespaces(){
            return this.namespaces;
    }

    public String getNamespace(int index){
            return this.namespaces.get(index);
    }

    public String getFirstNamespace(){
            return this.namespaces.get(0);
    }

    public String getLastNamespace(){
            return this.namespaces.get(namespaces.size() - 1);
    }

    public String getMatchingNamespace(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: namespaces) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withNamespaces(List<String> namespaces){
            if (this.namespaces != null) { _visitables.removeAll(this.namespaces);}
            if (namespaces != null) {this.namespaces = new ArrayList<String>(); for (String item : namespaces){this.addToNamespaces(item);}} else { this.namespaces = new ArrayList<String>();} return (A) this;
    }

    public A withNamespaces(String... namespaces){
            if (this.namespaces != null) {this.namespaces.clear();}
            if (namespaces != null) {for (String item :namespaces){ this.addToNamespaces(item);}} return (A) this;
    }

    public Boolean hasNamespaces(){
            return namespaces != null && !namespaces.isEmpty();
    }

    public A addToServiceaccounts(int index,ServiceAccountReference item){
            if (this.serviceaccounts == null) {this.serviceaccounts = new ArrayList<ServiceAccountReferenceBuilder>();}
            ServiceAccountReferenceBuilder builder = new ServiceAccountReferenceBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.serviceaccounts.add(index >= 0 ? index : serviceaccounts.size(), builder); return (A)this;
    }

    public A setToServiceaccounts(int index,ServiceAccountReference item){
            if (this.serviceaccounts == null) {this.serviceaccounts = new ArrayList<ServiceAccountReferenceBuilder>();}
            ServiceAccountReferenceBuilder builder = new ServiceAccountReferenceBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= serviceaccounts.size()) { serviceaccounts.add(builder); } else { serviceaccounts.set(index, builder);}
             return (A)this;
    }

    public A addToServiceaccounts(ServiceAccountReference... items){
            if (this.serviceaccounts == null) {this.serviceaccounts = new ArrayList<ServiceAccountReferenceBuilder>();}
            for (ServiceAccountReference item : items) {ServiceAccountReferenceBuilder builder = new ServiceAccountReferenceBuilder(item);_visitables.add(builder);this.serviceaccounts.add(builder);} return (A)this;
    }

    public A addAllToServiceaccounts(Collection<ServiceAccountReference> items){
            if (this.serviceaccounts == null) {this.serviceaccounts = new ArrayList<ServiceAccountReferenceBuilder>();}
            for (ServiceAccountReference item : items) {ServiceAccountReferenceBuilder builder = new ServiceAccountReferenceBuilder(item);_visitables.add(builder);this.serviceaccounts.add(builder);} return (A)this;
    }

    public A removeFromServiceaccounts(ServiceAccountReference... items){
            for (ServiceAccountReference item : items) {ServiceAccountReferenceBuilder builder = new ServiceAccountReferenceBuilder(item);_visitables.remove(builder);if (this.serviceaccounts != null) {this.serviceaccounts.remove(builder);}} return (A)this;
    }

    public A removeAllFromServiceaccounts(Collection<ServiceAccountReference> items){
            for (ServiceAccountReference item : items) {ServiceAccountReferenceBuilder builder = new ServiceAccountReferenceBuilder(item);_visitables.remove(builder);if (this.serviceaccounts != null) {this.serviceaccounts.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildServiceaccounts instead.
 * @return The buildable object.
 */
@Deprecated public List<ServiceAccountReference> getServiceaccounts(){
            return build(serviceaccounts);
    }

    public List<ServiceAccountReference> buildServiceaccounts(){
            return build(serviceaccounts);
    }

    public ServiceAccountReference buildServiceaccount(int index){
            return this.serviceaccounts.get(index).build();
    }

    public ServiceAccountReference buildFirstServiceaccount(){
            return this.serviceaccounts.get(0).build();
    }

    public ServiceAccountReference buildLastServiceaccount(){
            return this.serviceaccounts.get(serviceaccounts.size() - 1).build();
    }

    public ServiceAccountReference buildMatchingServiceaccount(io.fabric8.kubernetes.api.builder.Predicate<ServiceAccountReferenceBuilder> predicate){
            for (ServiceAccountReferenceBuilder item: serviceaccounts) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withServiceaccounts(List<ServiceAccountReference> serviceaccounts){
            if (this.serviceaccounts != null) { _visitables.removeAll(this.serviceaccounts);}
            if (serviceaccounts != null) {this.serviceaccounts = new ArrayList<ServiceAccountReferenceBuilder>(); for (ServiceAccountReference item : serviceaccounts){this.addToServiceaccounts(item);}} else { this.serviceaccounts = new ArrayList<ServiceAccountReferenceBuilder>();} return (A) this;
    }

    public A withServiceaccounts(ServiceAccountReference... serviceaccounts){
            if (this.serviceaccounts != null) {this.serviceaccounts.clear();}
            if (serviceaccounts != null) {for (ServiceAccountReference item :serviceaccounts){ this.addToServiceaccounts(item);}} return (A) this;
    }

    public Boolean hasServiceaccounts(){
            return serviceaccounts != null && !serviceaccounts.isEmpty();
    }

    public A addNewServiceaccount(String name,String namespace){
            return (A)addToServiceaccounts(new ServiceAccountReference(name, namespace));
    }

    public ServiceAccountRestrictionFluent.ServiceaccountsNested<A> addNewServiceaccount(){
            return new ServiceaccountsNestedImpl();
    }

    public ServiceAccountRestrictionFluent.ServiceaccountsNested<A> addNewServiceaccountLike(ServiceAccountReference item){
            return new ServiceaccountsNestedImpl(-1, item);
    }

    public ServiceAccountRestrictionFluent.ServiceaccountsNested<A> setNewServiceaccountLike(int index,ServiceAccountReference item){
            return new ServiceaccountsNestedImpl(index, item);
    }

    public ServiceAccountRestrictionFluent.ServiceaccountsNested<A> editServiceaccount(int index){
            if (serviceaccounts.size() <= index) throw new RuntimeException("Can't edit serviceaccounts. Index exceeds size.");
            return setNewServiceaccountLike(index, buildServiceaccount(index));
    }

    public ServiceAccountRestrictionFluent.ServiceaccountsNested<A> editFirstServiceaccount(){
            if (serviceaccounts.size() == 0) throw new RuntimeException("Can't edit first serviceaccounts. The list is empty.");
            return setNewServiceaccountLike(0, buildServiceaccount(0));
    }

    public ServiceAccountRestrictionFluent.ServiceaccountsNested<A> editLastServiceaccount(){
            int index = serviceaccounts.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last serviceaccounts. The list is empty.");
            return setNewServiceaccountLike(index, buildServiceaccount(index));
    }

    public ServiceAccountRestrictionFluent.ServiceaccountsNested<A> editMatchingServiceaccount(io.fabric8.kubernetes.api.builder.Predicate<ServiceAccountReferenceBuilder> predicate){
            int index = -1;
            for (int i=0;i<serviceaccounts.size();i++) { 
            if (predicate.apply(serviceaccounts.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching serviceaccounts. No match found.");
            return setNewServiceaccountLike(index, buildServiceaccount(index));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ServiceAccountRestrictionFluentImpl that = (ServiceAccountRestrictionFluentImpl) o;
            if (namespaces != null ? !namespaces.equals(that.namespaces) :that.namespaces != null) return false;
            if (serviceaccounts != null ? !serviceaccounts.equals(that.serviceaccounts) :that.serviceaccounts != null) return false;
            return true;
    }


    public class ServiceaccountsNestedImpl<N> extends ServiceAccountReferenceFluentImpl<ServiceAccountRestrictionFluent.ServiceaccountsNested<N>> implements ServiceAccountRestrictionFluent.ServiceaccountsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ServiceAccountReferenceBuilder builder;
        private final int index;
    
            ServiceaccountsNestedImpl(int index,ServiceAccountReference item){
                    this.index = index;
                    this.builder = new ServiceAccountReferenceBuilder(this, item);
            }
            ServiceaccountsNestedImpl(){
                    this.index = -1;
                    this.builder = new ServiceAccountReferenceBuilder(this);
            }
    
    public N and(){
            return (N) ServiceAccountRestrictionFluentImpl.this.setToServiceaccounts(index, builder.build());
    }
    public N endServiceaccount(){
            return and();
    }

}


}
