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

public class NamespaceSpecFluentImpl<A extends NamespaceSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements NamespaceSpecFluent<A>{

    private List<String> finalizers;

    public NamespaceSpecFluentImpl(){
    }
    public NamespaceSpecFluentImpl(NamespaceSpec instance){
            this.withFinalizers(instance.getFinalizers()); 
    }

    public A addToFinalizers(int index,String item){
            if (this.finalizers == null) {this.finalizers = new ArrayList<String>();}
            this.finalizers.add(index, item);
            return (A)this;
    }

    public A setToFinalizers(int index,String item){
            if (this.finalizers == null) {this.finalizers = new ArrayList<String>();}
            this.finalizers.set(index, item); return (A)this;
    }

    public A addToFinalizers(String... items){
            if (this.finalizers == null) {this.finalizers = new ArrayList<String>();}
            for (String item : items) {this.finalizers.add(item);} return (A)this;
    }

    public A addAllToFinalizers(Collection<String> items){
            if (this.finalizers == null) {this.finalizers = new ArrayList<String>();}
            for (String item : items) {this.finalizers.add(item);} return (A)this;
    }

    public A removeFromFinalizers(String... items){
            for (String item : items) {if (this.finalizers!= null){ this.finalizers.remove(item);}} return (A)this;
    }

    public A removeAllFromFinalizers(Collection<String> items){
            for (String item : items) {if (this.finalizers!= null){ this.finalizers.remove(item);}} return (A)this;
    }

    public List<String> getFinalizers(){
            return this.finalizers;
    }

    public String getFinalizer(int index){
            return this.finalizers.get(index);
    }

    public String getFirstFinalizer(){
            return this.finalizers.get(0);
    }

    public String getLastFinalizer(){
            return this.finalizers.get(finalizers.size() - 1);
    }

    public String getMatchingFinalizer(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: finalizers) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withFinalizers(List<String> finalizers){
            if (this.finalizers != null) { _visitables.removeAll(this.finalizers);}
            if (finalizers != null) {this.finalizers = new ArrayList<String>(); for (String item : finalizers){this.addToFinalizers(item);}} else { this.finalizers = new ArrayList<String>();} return (A) this;
    }

    public A withFinalizers(String... finalizers){
            if (this.finalizers != null) {this.finalizers.clear();}
            if (finalizers != null) {for (String item :finalizers){ this.addToFinalizers(item);}} return (A) this;
    }

    public Boolean hasFinalizers(){
            return finalizers != null && !finalizers.isEmpty();
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NamespaceSpecFluentImpl that = (NamespaceSpecFluentImpl) o;
            if (finalizers != null ? !finalizers.equals(that.finalizers) :that.finalizers != null) return false;
            return true;
    }




}
