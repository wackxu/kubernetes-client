package io.fabric8.kubernetes.api.model;

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

public class HostAliasFluentImpl<A extends HostAliasFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements HostAliasFluent<A>{

    private List<String> hostnames;
    private String ip;

    public HostAliasFluentImpl(){
    }
    public HostAliasFluentImpl(HostAlias instance){
            this.withHostnames(instance.getHostnames()); 
            this.withIp(instance.getIp()); 
    }

    public A addToHostnames(int index,String item){
            if (this.hostnames == null) {this.hostnames = new ArrayList<String>();}
            this.hostnames.add(index, item);
            return (A)this;
    }

    public A setToHostnames(int index,String item){
            if (this.hostnames == null) {this.hostnames = new ArrayList<String>();}
            this.hostnames.set(index, item); return (A)this;
    }

    public A addToHostnames(String... items){
            if (this.hostnames == null) {this.hostnames = new ArrayList<String>();}
            for (String item : items) {this.hostnames.add(item);} return (A)this;
    }

    public A addAllToHostnames(Collection<String> items){
            if (this.hostnames == null) {this.hostnames = new ArrayList<String>();}
            for (String item : items) {this.hostnames.add(item);} return (A)this;
    }

    public A removeFromHostnames(String... items){
            for (String item : items) {if (this.hostnames!= null){ this.hostnames.remove(item);}} return (A)this;
    }

    public A removeAllFromHostnames(Collection<String> items){
            for (String item : items) {if (this.hostnames!= null){ this.hostnames.remove(item);}} return (A)this;
    }

    public List<String> getHostnames(){
            return this.hostnames;
    }

    public String getHostname(int index){
            return this.hostnames.get(index);
    }

    public String getFirstHostname(){
            return this.hostnames.get(0);
    }

    public String getLastHostname(){
            return this.hostnames.get(hostnames.size() - 1);
    }

    public String getMatchingHostname(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: hostnames) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withHostnames(List<String> hostnames){
            if (this.hostnames != null) { _visitables.removeAll(this.hostnames);}
            if (hostnames != null) {this.hostnames = new ArrayList<String>(); for (String item : hostnames){this.addToHostnames(item);}} else { this.hostnames = new ArrayList<String>();} return (A) this;
    }

    public A withHostnames(String... hostnames){
            if (this.hostnames != null) {this.hostnames.clear();}
            if (hostnames != null) {for (String item :hostnames){ this.addToHostnames(item);}} return (A) this;
    }

    public Boolean hasHostnames(){
            return hostnames != null && !hostnames.isEmpty();
    }

    public String getIp(){
            return this.ip;
    }

    public A withIp(String ip){
            this.ip=ip; return (A) this;
    }

    public Boolean hasIp(){
            return this.ip != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            HostAliasFluentImpl that = (HostAliasFluentImpl) o;
            if (hostnames != null ? !hostnames.equals(that.hostnames) :that.hostnames != null) return false;
            if (ip != null ? !ip.equals(that.ip) :that.ip != null) return false;
            return true;
    }




}
