package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class ContainerImageFluentImpl<A extends ContainerImageFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ContainerImageFluent<A>{

    private List<String> names;
    private Long sizeBytes;

    public ContainerImageFluentImpl(){
    }
    public ContainerImageFluentImpl(ContainerImage instance){
            this.withNames(instance.getNames()); 
            this.withSizeBytes(instance.getSizeBytes()); 
    }

    public A addToNames(int index,String item){
            if (this.names == null) {this.names = new ArrayList<String>();}
            this.names.add(index, item);
            return (A)this;
    }

    public A setToNames(int index,String item){
            if (this.names == null) {this.names = new ArrayList<String>();}
            this.names.set(index, item); return (A)this;
    }

    public A addToNames(String... items){
            if (this.names == null) {this.names = new ArrayList<String>();}
            for (String item : items) {this.names.add(item);} return (A)this;
    }

    public A addAllToNames(Collection<String> items){
            if (this.names == null) {this.names = new ArrayList<String>();}
            for (String item : items) {this.names.add(item);} return (A)this;
    }

    public A removeFromNames(String... items){
            for (String item : items) {if (this.names!= null){ this.names.remove(item);}} return (A)this;
    }

    public A removeAllFromNames(Collection<String> items){
            for (String item : items) {if (this.names!= null){ this.names.remove(item);}} return (A)this;
    }

    public List<String> getNames(){
            return this.names;
    }

    public String getName(int index){
            return this.names.get(index);
    }

    public String getFirstName(){
            return this.names.get(0);
    }

    public String getLastName(){
            return this.names.get(names.size() - 1);
    }

    public String getMatchingName(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: names) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withNames(List<String> names){
            if (this.names != null) { _visitables.removeAll(this.names);}
            if (names != null) {this.names = new ArrayList<String>(); for (String item : names){this.addToNames(item);}} else { this.names = new ArrayList<String>();} return (A) this;
    }

    public A withNames(String... names){
            if (this.names != null) {this.names.clear();}
            if (names != null) {for (String item :names){ this.addToNames(item);}} return (A) this;
    }

    public Boolean hasNames(){
            return names != null && !names.isEmpty();
    }

    public Long getSizeBytes(){
            return this.sizeBytes;
    }

    public A withSizeBytes(Long sizeBytes){
            this.sizeBytes=sizeBytes; return (A) this;
    }

    public Boolean hasSizeBytes(){
            return this.sizeBytes != null;
    }

    public A withNewSizeBytes(String arg1){
            return (A)withSizeBytes(new Long(arg1));
    }

    public A withNewSizeBytes(long arg1){
            return (A)withSizeBytes(new Long(arg1));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ContainerImageFluentImpl that = (ContainerImageFluentImpl) o;
            if (names != null ? !names.equals(that.names) :that.names != null) return false;
            if (sizeBytes != null ? !sizeBytes.equals(that.sizeBytes) :that.sizeBytes != null) return false;
            return true;
    }




}
