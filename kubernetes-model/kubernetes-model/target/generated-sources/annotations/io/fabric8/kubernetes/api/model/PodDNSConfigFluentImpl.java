package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
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

public class PodDNSConfigFluentImpl<A extends PodDNSConfigFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements PodDNSConfigFluent<A>{

    private List<String> nameservers;
    private List<PodDNSConfigOptionBuilder> options;
    private List<String> searches;

    public PodDNSConfigFluentImpl(){
    }
    public PodDNSConfigFluentImpl(PodDNSConfig instance){
            this.withNameservers(instance.getNameservers()); 
            this.withOptions(instance.getOptions()); 
            this.withSearches(instance.getSearches()); 
    }

    public A addToNameservers(int index,String item){
            if (this.nameservers == null) {this.nameservers = new ArrayList<String>();}
            this.nameservers.add(index, item);
            return (A)this;
    }

    public A setToNameservers(int index,String item){
            if (this.nameservers == null) {this.nameservers = new ArrayList<String>();}
            this.nameservers.set(index, item); return (A)this;
    }

    public A addToNameservers(String... items){
            if (this.nameservers == null) {this.nameservers = new ArrayList<String>();}
            for (String item : items) {this.nameservers.add(item);} return (A)this;
    }

    public A addAllToNameservers(Collection<String> items){
            if (this.nameservers == null) {this.nameservers = new ArrayList<String>();}
            for (String item : items) {this.nameservers.add(item);} return (A)this;
    }

    public A removeFromNameservers(String... items){
            for (String item : items) {if (this.nameservers!= null){ this.nameservers.remove(item);}} return (A)this;
    }

    public A removeAllFromNameservers(Collection<String> items){
            for (String item : items) {if (this.nameservers!= null){ this.nameservers.remove(item);}} return (A)this;
    }

    public List<String> getNameservers(){
            return this.nameservers;
    }

    public String getNameserver(int index){
            return this.nameservers.get(index);
    }

    public String getFirstNameserver(){
            return this.nameservers.get(0);
    }

    public String getLastNameserver(){
            return this.nameservers.get(nameservers.size() - 1);
    }

    public String getMatchingNameserver(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: nameservers) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withNameservers(List<String> nameservers){
            if (this.nameservers != null) { _visitables.removeAll(this.nameservers);}
            if (nameservers != null) {this.nameservers = new ArrayList<String>(); for (String item : nameservers){this.addToNameservers(item);}} else { this.nameservers = new ArrayList<String>();} return (A) this;
    }

    public A withNameservers(String... nameservers){
            if (this.nameservers != null) {this.nameservers.clear();}
            if (nameservers != null) {for (String item :nameservers){ this.addToNameservers(item);}} return (A) this;
    }

    public Boolean hasNameservers(){
            return nameservers != null && !nameservers.isEmpty();
    }

    public A addToOptions(int index,PodDNSConfigOption item){
            if (this.options == null) {this.options = new ArrayList<PodDNSConfigOptionBuilder>();}
            PodDNSConfigOptionBuilder builder = new PodDNSConfigOptionBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.options.add(index >= 0 ? index : options.size(), builder); return (A)this;
    }

    public A setToOptions(int index,PodDNSConfigOption item){
            if (this.options == null) {this.options = new ArrayList<PodDNSConfigOptionBuilder>();}
            PodDNSConfigOptionBuilder builder = new PodDNSConfigOptionBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= options.size()) { options.add(builder); } else { options.set(index, builder);}
             return (A)this;
    }

    public A addToOptions(PodDNSConfigOption... items){
            if (this.options == null) {this.options = new ArrayList<PodDNSConfigOptionBuilder>();}
            for (PodDNSConfigOption item : items) {PodDNSConfigOptionBuilder builder = new PodDNSConfigOptionBuilder(item);_visitables.add(builder);this.options.add(builder);} return (A)this;
    }

    public A addAllToOptions(Collection<PodDNSConfigOption> items){
            if (this.options == null) {this.options = new ArrayList<PodDNSConfigOptionBuilder>();}
            for (PodDNSConfigOption item : items) {PodDNSConfigOptionBuilder builder = new PodDNSConfigOptionBuilder(item);_visitables.add(builder);this.options.add(builder);} return (A)this;
    }

    public A removeFromOptions(PodDNSConfigOption... items){
            for (PodDNSConfigOption item : items) {PodDNSConfigOptionBuilder builder = new PodDNSConfigOptionBuilder(item);_visitables.remove(builder);if (this.options != null) {this.options.remove(builder);}} return (A)this;
    }

    public A removeAllFromOptions(Collection<PodDNSConfigOption> items){
            for (PodDNSConfigOption item : items) {PodDNSConfigOptionBuilder builder = new PodDNSConfigOptionBuilder(item);_visitables.remove(builder);if (this.options != null) {this.options.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildOptions instead.
 * @return The buildable object.
 */
@Deprecated public List<PodDNSConfigOption> getOptions(){
            return build(options);
    }

    public List<PodDNSConfigOption> buildOptions(){
            return build(options);
    }

    public PodDNSConfigOption buildOption(int index){
            return this.options.get(index).build();
    }

    public PodDNSConfigOption buildFirstOption(){
            return this.options.get(0).build();
    }

    public PodDNSConfigOption buildLastOption(){
            return this.options.get(options.size() - 1).build();
    }

    public PodDNSConfigOption buildMatchingOption(io.fabric8.kubernetes.api.builder.Predicate<PodDNSConfigOptionBuilder> predicate){
            for (PodDNSConfigOptionBuilder item: options) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withOptions(List<PodDNSConfigOption> options){
            if (this.options != null) { _visitables.removeAll(this.options);}
            if (options != null) {this.options = new ArrayList<PodDNSConfigOptionBuilder>(); for (PodDNSConfigOption item : options){this.addToOptions(item);}} else { this.options = new ArrayList<PodDNSConfigOptionBuilder>();} return (A) this;
    }

    public A withOptions(PodDNSConfigOption... options){
            if (this.options != null) {this.options.clear();}
            if (options != null) {for (PodDNSConfigOption item :options){ this.addToOptions(item);}} return (A) this;
    }

    public Boolean hasOptions(){
            return options != null && !options.isEmpty();
    }

    public A addNewOption(String name,String value){
            return (A)addToOptions(new PodDNSConfigOption(name, value));
    }

    public PodDNSConfigFluent.OptionsNested<A> addNewOption(){
            return new OptionsNestedImpl();
    }

    public PodDNSConfigFluent.OptionsNested<A> addNewOptionLike(PodDNSConfigOption item){
            return new OptionsNestedImpl(-1, item);
    }

    public PodDNSConfigFluent.OptionsNested<A> setNewOptionLike(int index,PodDNSConfigOption item){
            return new OptionsNestedImpl(index, item);
    }

    public PodDNSConfigFluent.OptionsNested<A> editOption(int index){
            if (options.size() <= index) throw new RuntimeException("Can't edit options. Index exceeds size.");
            return setNewOptionLike(index, buildOption(index));
    }

    public PodDNSConfigFluent.OptionsNested<A> editFirstOption(){
            if (options.size() == 0) throw new RuntimeException("Can't edit first options. The list is empty.");
            return setNewOptionLike(0, buildOption(0));
    }

    public PodDNSConfigFluent.OptionsNested<A> editLastOption(){
            int index = options.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last options. The list is empty.");
            return setNewOptionLike(index, buildOption(index));
    }

    public PodDNSConfigFluent.OptionsNested<A> editMatchingOption(io.fabric8.kubernetes.api.builder.Predicate<PodDNSConfigOptionBuilder> predicate){
            int index = -1;
            for (int i=0;i<options.size();i++) { 
            if (predicate.apply(options.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching options. No match found.");
            return setNewOptionLike(index, buildOption(index));
    }

    public A addToSearches(int index,String item){
            if (this.searches == null) {this.searches = new ArrayList<String>();}
            this.searches.add(index, item);
            return (A)this;
    }

    public A setToSearches(int index,String item){
            if (this.searches == null) {this.searches = new ArrayList<String>();}
            this.searches.set(index, item); return (A)this;
    }

    public A addToSearches(String... items){
            if (this.searches == null) {this.searches = new ArrayList<String>();}
            for (String item : items) {this.searches.add(item);} return (A)this;
    }

    public A addAllToSearches(Collection<String> items){
            if (this.searches == null) {this.searches = new ArrayList<String>();}
            for (String item : items) {this.searches.add(item);} return (A)this;
    }

    public A removeFromSearches(String... items){
            for (String item : items) {if (this.searches!= null){ this.searches.remove(item);}} return (A)this;
    }

    public A removeAllFromSearches(Collection<String> items){
            for (String item : items) {if (this.searches!= null){ this.searches.remove(item);}} return (A)this;
    }

    public List<String> getSearches(){
            return this.searches;
    }

    public String getSearch(int index){
            return this.searches.get(index);
    }

    public String getFirstSearch(){
            return this.searches.get(0);
    }

    public String getLastSearch(){
            return this.searches.get(searches.size() - 1);
    }

    public String getMatchingSearch(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: searches) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withSearches(List<String> searches){
            if (this.searches != null) { _visitables.removeAll(this.searches);}
            if (searches != null) {this.searches = new ArrayList<String>(); for (String item : searches){this.addToSearches(item);}} else { this.searches = new ArrayList<String>();} return (A) this;
    }

    public A withSearches(String... searches){
            if (this.searches != null) {this.searches.clear();}
            if (searches != null) {for (String item :searches){ this.addToSearches(item);}} return (A) this;
    }

    public Boolean hasSearches(){
            return searches != null && !searches.isEmpty();
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PodDNSConfigFluentImpl that = (PodDNSConfigFluentImpl) o;
            if (nameservers != null ? !nameservers.equals(that.nameservers) :that.nameservers != null) return false;
            if (options != null ? !options.equals(that.options) :that.options != null) return false;
            if (searches != null ? !searches.equals(that.searches) :that.searches != null) return false;
            return true;
    }


    public class OptionsNestedImpl<N> extends PodDNSConfigOptionFluentImpl<PodDNSConfigFluent.OptionsNested<N>> implements PodDNSConfigFluent.OptionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final PodDNSConfigOptionBuilder builder;
        private final int index;
    
            OptionsNestedImpl(int index,PodDNSConfigOption item){
                    this.index = index;
                    this.builder = new PodDNSConfigOptionBuilder(this, item);
            }
            OptionsNestedImpl(){
                    this.index = -1;
                    this.builder = new PodDNSConfigOptionBuilder(this);
            }
    
    public N and(){
            return (N) PodDNSConfigFluentImpl.this.setToOptions(index, builder.build());
    }
    public N endOption(){
            return and();
    }

}


}
