package io.fabric8.kubernetes.api.model.apiextensions;

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

public class CustomResourceDefinitionNamesFluentImpl<A extends CustomResourceDefinitionNamesFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements CustomResourceDefinitionNamesFluent<A>{

    private List<String> categories;
    private String kind;
    private String listKind;
    private String plural;
    private List<String> shortNames;
    private String singular;

    public CustomResourceDefinitionNamesFluentImpl(){
    }
    public CustomResourceDefinitionNamesFluentImpl(CustomResourceDefinitionNames instance){
            this.withCategories(instance.getCategories()); 
            this.withKind(instance.getKind()); 
            this.withListKind(instance.getListKind()); 
            this.withPlural(instance.getPlural()); 
            this.withShortNames(instance.getShortNames()); 
            this.withSingular(instance.getSingular()); 
    }

    public A addToCategories(int index,String item){
            if (this.categories == null) {this.categories = new ArrayList<String>();}
            this.categories.add(index, item);
            return (A)this;
    }

    public A setToCategories(int index,String item){
            if (this.categories == null) {this.categories = new ArrayList<String>();}
            this.categories.set(index, item); return (A)this;
    }

    public A addToCategories(String... items){
            if (this.categories == null) {this.categories = new ArrayList<String>();}
            for (String item : items) {this.categories.add(item);} return (A)this;
    }

    public A addAllToCategories(Collection<String> items){
            if (this.categories == null) {this.categories = new ArrayList<String>();}
            for (String item : items) {this.categories.add(item);} return (A)this;
    }

    public A removeFromCategories(String... items){
            for (String item : items) {if (this.categories!= null){ this.categories.remove(item);}} return (A)this;
    }

    public A removeAllFromCategories(Collection<String> items){
            for (String item : items) {if (this.categories!= null){ this.categories.remove(item);}} return (A)this;
    }

    public List<String> getCategories(){
            return this.categories;
    }

    public String getCategory(int index){
            return this.categories.get(index);
    }

    public String getFirstCategory(){
            return this.categories.get(0);
    }

    public String getLastCategory(){
            return this.categories.get(categories.size() - 1);
    }

    public String getMatchingCategory(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: categories) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withCategories(List<String> categories){
            if (this.categories != null) { _visitables.removeAll(this.categories);}
            if (categories != null) {this.categories = new ArrayList<String>(); for (String item : categories){this.addToCategories(item);}} else { this.categories = new ArrayList<String>();} return (A) this;
    }

    public A withCategories(String... categories){
            if (this.categories != null) {this.categories.clear();}
            if (categories != null) {for (String item :categories){ this.addToCategories(item);}} return (A) this;
    }

    public Boolean hasCategories(){
            return categories != null && !categories.isEmpty();
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

    public String getListKind(){
            return this.listKind;
    }

    public A withListKind(String listKind){
            this.listKind=listKind; return (A) this;
    }

    public Boolean hasListKind(){
            return this.listKind != null;
    }

    public String getPlural(){
            return this.plural;
    }

    public A withPlural(String plural){
            this.plural=plural; return (A) this;
    }

    public Boolean hasPlural(){
            return this.plural != null;
    }

    public A addToShortNames(int index,String item){
            if (this.shortNames == null) {this.shortNames = new ArrayList<String>();}
            this.shortNames.add(index, item);
            return (A)this;
    }

    public A setToShortNames(int index,String item){
            if (this.shortNames == null) {this.shortNames = new ArrayList<String>();}
            this.shortNames.set(index, item); return (A)this;
    }

    public A addToShortNames(String... items){
            if (this.shortNames == null) {this.shortNames = new ArrayList<String>();}
            for (String item : items) {this.shortNames.add(item);} return (A)this;
    }

    public A addAllToShortNames(Collection<String> items){
            if (this.shortNames == null) {this.shortNames = new ArrayList<String>();}
            for (String item : items) {this.shortNames.add(item);} return (A)this;
    }

    public A removeFromShortNames(String... items){
            for (String item : items) {if (this.shortNames!= null){ this.shortNames.remove(item);}} return (A)this;
    }

    public A removeAllFromShortNames(Collection<String> items){
            for (String item : items) {if (this.shortNames!= null){ this.shortNames.remove(item);}} return (A)this;
    }

    public List<String> getShortNames(){
            return this.shortNames;
    }

    public String getShortName(int index){
            return this.shortNames.get(index);
    }

    public String getFirstShortName(){
            return this.shortNames.get(0);
    }

    public String getLastShortName(){
            return this.shortNames.get(shortNames.size() - 1);
    }

    public String getMatchingShortName(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: shortNames) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withShortNames(List<String> shortNames){
            if (this.shortNames != null) { _visitables.removeAll(this.shortNames);}
            if (shortNames != null) {this.shortNames = new ArrayList<String>(); for (String item : shortNames){this.addToShortNames(item);}} else { this.shortNames = new ArrayList<String>();} return (A) this;
    }

    public A withShortNames(String... shortNames){
            if (this.shortNames != null) {this.shortNames.clear();}
            if (shortNames != null) {for (String item :shortNames){ this.addToShortNames(item);}} return (A) this;
    }

    public Boolean hasShortNames(){
            return shortNames != null && !shortNames.isEmpty();
    }

    public String getSingular(){
            return this.singular;
    }

    public A withSingular(String singular){
            this.singular=singular; return (A) this;
    }

    public Boolean hasSingular(){
            return this.singular != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CustomResourceDefinitionNamesFluentImpl that = (CustomResourceDefinitionNamesFluentImpl) o;
            if (categories != null ? !categories.equals(that.categories) :that.categories != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (listKind != null ? !listKind.equals(that.listKind) :that.listKind != null) return false;
            if (plural != null ? !plural.equals(that.plural) :that.plural != null) return false;
            if (shortNames != null ? !shortNames.equals(that.shortNames) :that.shortNames != null) return false;
            if (singular != null ? !singular.equals(that.singular) :that.singular != null) return false;
            return true;
    }




}
