package io.fabric8.kubernetes.api.model.networking;

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

public class IPBlockFluentImpl<A extends IPBlockFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements IPBlockFluent<A>{

    private String cidr;
    private List<String> except;

    public IPBlockFluentImpl(){
    }
    public IPBlockFluentImpl(IPBlock instance){
            this.withCidr(instance.getCidr()); 
            this.withExcept(instance.getExcept()); 
    }

    public String getCidr(){
            return this.cidr;
    }

    public A withCidr(String cidr){
            this.cidr=cidr; return (A) this;
    }

    public Boolean hasCidr(){
            return this.cidr != null;
    }

    public A addToExcept(int index,String item){
            if (this.except == null) {this.except = new ArrayList<String>();}
            this.except.add(index, item);
            return (A)this;
    }

    public A setToExcept(int index,String item){
            if (this.except == null) {this.except = new ArrayList<String>();}
            this.except.set(index, item); return (A)this;
    }

    public A addToExcept(String... items){
            if (this.except == null) {this.except = new ArrayList<String>();}
            for (String item : items) {this.except.add(item);} return (A)this;
    }

    public A addAllToExcept(Collection<String> items){
            if (this.except == null) {this.except = new ArrayList<String>();}
            for (String item : items) {this.except.add(item);} return (A)this;
    }

    public A removeFromExcept(String... items){
            for (String item : items) {if (this.except!= null){ this.except.remove(item);}} return (A)this;
    }

    public A removeAllFromExcept(Collection<String> items){
            for (String item : items) {if (this.except!= null){ this.except.remove(item);}} return (A)this;
    }

    public List<String> getExcept(){
            return this.except;
    }

    public String getExcept(int index){
            return this.except.get(index);
    }

    public String getFirstExcept(){
            return this.except.get(0);
    }

    public String getLastExcept(){
            return this.except.get(except.size() - 1);
    }

    public String getMatchingExcept(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: except) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withExcept(List<String> except){
            if (this.except != null) { _visitables.removeAll(this.except);}
            if (except != null) {this.except = new ArrayList<String>(); for (String item : except){this.addToExcept(item);}} else { this.except = new ArrayList<String>();} return (A) this;
    }

    public A withExcept(String... except){
            if (this.except != null) {this.except.clear();}
            if (except != null) {for (String item :except){ this.addToExcept(item);}} return (A) this;
    }

    public Boolean hasExcept(){
            return except != null && !except.isEmpty();
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            IPBlockFluentImpl that = (IPBlockFluentImpl) o;
            if (cidr != null ? !cidr.equals(that.cidr) :that.cidr != null) return false;
            if (except != null ? !except.equals(that.except) :that.except != null) return false;
            return true;
    }




}
