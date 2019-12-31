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

public class CapabilitiesFluentImpl<A extends CapabilitiesFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements CapabilitiesFluent<A>{

    private List<String> add;
    private List<String> drop;

    public CapabilitiesFluentImpl(){
    }
    public CapabilitiesFluentImpl(Capabilities instance){
            this.withAdd(instance.getAdd()); 
            this.withDrop(instance.getDrop()); 
    }

    public A addToAdd(int index,String item){
            if (this.add == null) {this.add = new ArrayList<String>();}
            this.add.add(index, item);
            return (A)this;
    }

    public A setToAdd(int index,String item){
            if (this.add == null) {this.add = new ArrayList<String>();}
            this.add.set(index, item); return (A)this;
    }

    public A addToAdd(String... items){
            if (this.add == null) {this.add = new ArrayList<String>();}
            for (String item : items) {this.add.add(item);} return (A)this;
    }

    public A addAllToAdd(Collection<String> items){
            if (this.add == null) {this.add = new ArrayList<String>();}
            for (String item : items) {this.add.add(item);} return (A)this;
    }

    public A removeFromAdd(String... items){
            for (String item : items) {if (this.add!= null){ this.add.remove(item);}} return (A)this;
    }

    public A removeAllFromAdd(Collection<String> items){
            for (String item : items) {if (this.add!= null){ this.add.remove(item);}} return (A)this;
    }

    public List<String> getAdd(){
            return this.add;
    }

    public String getAdd(int index){
            return this.add.get(index);
    }

    public String getFirstAdd(){
            return this.add.get(0);
    }

    public String getLastAdd(){
            return this.add.get(add.size() - 1);
    }

    public String getMatchingAdd(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: add) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withAdd(List<String> add){
            if (this.add != null) { _visitables.removeAll(this.add);}
            if (add != null) {this.add = new ArrayList<String>(); for (String item : add){this.addToAdd(item);}} else { this.add = new ArrayList<String>();} return (A) this;
    }

    public A withAdd(String... add){
            if (this.add != null) {this.add.clear();}
            if (add != null) {for (String item :add){ this.addToAdd(item);}} return (A) this;
    }

    public Boolean hasAdd(){
            return add != null && !add.isEmpty();
    }

    public A addToDrop(int index,String item){
            if (this.drop == null) {this.drop = new ArrayList<String>();}
            this.drop.add(index, item);
            return (A)this;
    }

    public A setToDrop(int index,String item){
            if (this.drop == null) {this.drop = new ArrayList<String>();}
            this.drop.set(index, item); return (A)this;
    }

    public A addToDrop(String... items){
            if (this.drop == null) {this.drop = new ArrayList<String>();}
            for (String item : items) {this.drop.add(item);} return (A)this;
    }

    public A addAllToDrop(Collection<String> items){
            if (this.drop == null) {this.drop = new ArrayList<String>();}
            for (String item : items) {this.drop.add(item);} return (A)this;
    }

    public A removeFromDrop(String... items){
            for (String item : items) {if (this.drop!= null){ this.drop.remove(item);}} return (A)this;
    }

    public A removeAllFromDrop(Collection<String> items){
            for (String item : items) {if (this.drop!= null){ this.drop.remove(item);}} return (A)this;
    }

    public List<String> getDrop(){
            return this.drop;
    }

    public String getDrop(int index){
            return this.drop.get(index);
    }

    public String getFirstDrop(){
            return this.drop.get(0);
    }

    public String getLastDrop(){
            return this.drop.get(drop.size() - 1);
    }

    public String getMatchingDrop(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: drop) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withDrop(List<String> drop){
            if (this.drop != null) { _visitables.removeAll(this.drop);}
            if (drop != null) {this.drop = new ArrayList<String>(); for (String item : drop){this.addToDrop(item);}} else { this.drop = new ArrayList<String>();} return (A) this;
    }

    public A withDrop(String... drop){
            if (this.drop != null) {this.drop.clear();}
            if (drop != null) {for (String item :drop){ this.addToDrop(item);}} return (A) this;
    }

    public Boolean hasDrop(){
            return drop != null && !drop.isEmpty();
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CapabilitiesFluentImpl that = (CapabilitiesFluentImpl) o;
            if (add != null ? !add.equals(that.add) :that.add != null) return false;
            if (drop != null ? !drop.equals(that.drop) :that.drop != null) return false;
            return true;
    }




}
