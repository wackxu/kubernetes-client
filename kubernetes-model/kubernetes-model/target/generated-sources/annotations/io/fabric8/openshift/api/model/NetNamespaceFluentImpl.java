package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.model.ObjectMeta;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.ObjectMetaFluentImpl;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class NetNamespaceFluentImpl<A extends NetNamespaceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements NetNamespaceFluent<A>{

    private String apiVersion;
    private List<String> egressIPs;
    private String kind;
    private ObjectMetaBuilder metadata;
    private Integer netid;
    private String netname;

    public NetNamespaceFluentImpl(){
    }
    public NetNamespaceFluentImpl(NetNamespace instance){
            this.withApiVersion(instance.getApiVersion()); 
            this.withEgressIPs(instance.getEgressIPs()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withNetid(instance.getNetid()); 
            this.withNetname(instance.getNetname()); 
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

    public A addToEgressIPs(int index,String item){
            if (this.egressIPs == null) {this.egressIPs = new ArrayList<String>();}
            this.egressIPs.add(index, item);
            return (A)this;
    }

    public A setToEgressIPs(int index,String item){
            if (this.egressIPs == null) {this.egressIPs = new ArrayList<String>();}
            this.egressIPs.set(index, item); return (A)this;
    }

    public A addToEgressIPs(String... items){
            if (this.egressIPs == null) {this.egressIPs = new ArrayList<String>();}
            for (String item : items) {this.egressIPs.add(item);} return (A)this;
    }

    public A addAllToEgressIPs(Collection<String> items){
            if (this.egressIPs == null) {this.egressIPs = new ArrayList<String>();}
            for (String item : items) {this.egressIPs.add(item);} return (A)this;
    }

    public A removeFromEgressIPs(String... items){
            for (String item : items) {if (this.egressIPs!= null){ this.egressIPs.remove(item);}} return (A)this;
    }

    public A removeAllFromEgressIPs(Collection<String> items){
            for (String item : items) {if (this.egressIPs!= null){ this.egressIPs.remove(item);}} return (A)this;
    }

    public List<String> getEgressIPs(){
            return this.egressIPs;
    }

    public String getEgressIP(int index){
            return this.egressIPs.get(index);
    }

    public String getFirstEgressIP(){
            return this.egressIPs.get(0);
    }

    public String getLastEgressIP(){
            return this.egressIPs.get(egressIPs.size() - 1);
    }

    public String getMatchingEgressIP(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: egressIPs) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withEgressIPs(List<String> egressIPs){
            if (this.egressIPs != null) { _visitables.removeAll(this.egressIPs);}
            if (egressIPs != null) {this.egressIPs = new ArrayList<String>(); for (String item : egressIPs){this.addToEgressIPs(item);}} else { this.egressIPs = new ArrayList<String>();} return (A) this;
    }

    public A withEgressIPs(String... egressIPs){
            if (this.egressIPs != null) {this.egressIPs.clear();}
            if (egressIPs != null) {for (String item :egressIPs){ this.addToEgressIPs(item);}} return (A) this;
    }

    public Boolean hasEgressIPs(){
            return egressIPs != null && !egressIPs.isEmpty();
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

    public NetNamespaceFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public NetNamespaceFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public NetNamespaceFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public NetNamespaceFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public NetNamespaceFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    public Integer getNetid(){
            return this.netid;
    }

    public A withNetid(Integer netid){
            this.netid=netid; return (A) this;
    }

    public Boolean hasNetid(){
            return this.netid != null;
    }

    public String getNetname(){
            return this.netname;
    }

    public A withNetname(String netname){
            this.netname=netname; return (A) this;
    }

    public Boolean hasNetname(){
            return this.netname != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NetNamespaceFluentImpl that = (NetNamespaceFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (egressIPs != null ? !egressIPs.equals(that.egressIPs) :that.egressIPs != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (netid != null ? !netid.equals(that.netid) :that.netid != null) return false;
            if (netname != null ? !netname.equals(that.netname) :that.netname != null) return false;
            return true;
    }


    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<NetNamespaceFluent.MetadataNested<N>> implements NetNamespaceFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) NetNamespaceFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}


}
