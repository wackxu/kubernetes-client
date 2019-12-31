package io.fabric8.kubernetes.api.model.extensions;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class IngressTLSFluentImpl<A extends IngressTLSFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements IngressTLSFluent<A>{

    private List<String> hosts;
    private String secretName;

    public IngressTLSFluentImpl(){
    }
    public IngressTLSFluentImpl(IngressTLS instance){
            this.withHosts(instance.getHosts()); 
            this.withSecretName(instance.getSecretName()); 
    }

    public A addToHosts(int index,String item){
            if (this.hosts == null) {this.hosts = new ArrayList<String>();}
            this.hosts.add(index, item);
            return (A)this;
    }

    public A setToHosts(int index,String item){
            if (this.hosts == null) {this.hosts = new ArrayList<String>();}
            this.hosts.set(index, item); return (A)this;
    }

    public A addToHosts(String... items){
            if (this.hosts == null) {this.hosts = new ArrayList<String>();}
            for (String item : items) {this.hosts.add(item);} return (A)this;
    }

    public A addAllToHosts(Collection<String> items){
            if (this.hosts == null) {this.hosts = new ArrayList<String>();}
            for (String item : items) {this.hosts.add(item);} return (A)this;
    }

    public A removeFromHosts(String... items){
            for (String item : items) {if (this.hosts!= null){ this.hosts.remove(item);}} return (A)this;
    }

    public A removeAllFromHosts(Collection<String> items){
            for (String item : items) {if (this.hosts!= null){ this.hosts.remove(item);}} return (A)this;
    }

    public List<String> getHosts(){
            return this.hosts;
    }

    public String getHost(int index){
            return this.hosts.get(index);
    }

    public String getFirstHost(){
            return this.hosts.get(0);
    }

    public String getLastHost(){
            return this.hosts.get(hosts.size() - 1);
    }

    public String getMatchingHost(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: hosts) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withHosts(List<String> hosts){
            if (this.hosts != null) { _visitables.removeAll(this.hosts);}
            if (hosts != null) {this.hosts = new ArrayList<String>(); for (String item : hosts){this.addToHosts(item);}} else { this.hosts = new ArrayList<String>();} return (A) this;
    }

    public A withHosts(String... hosts){
            if (this.hosts != null) {this.hosts.clear();}
            if (hosts != null) {for (String item :hosts){ this.addToHosts(item);}} return (A) this;
    }

    public Boolean hasHosts(){
            return hosts != null && !hosts.isEmpty();
    }

    public String getSecretName(){
            return this.secretName;
    }

    public A withSecretName(String secretName){
            this.secretName=secretName; return (A) this;
    }

    public Boolean hasSecretName(){
            return this.secretName != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            IngressTLSFluentImpl that = (IngressTLSFluentImpl) o;
            if (hosts != null ? !hosts.equals(that.hosts) :that.hosts != null) return false;
            if (secretName != null ? !secretName.equals(that.secretName) :that.secretName != null) return false;
            return true;
    }




}
