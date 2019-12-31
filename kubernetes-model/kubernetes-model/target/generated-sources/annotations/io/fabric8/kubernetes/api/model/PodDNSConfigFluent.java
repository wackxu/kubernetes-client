package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface PodDNSConfigFluent<A extends PodDNSConfigFluent<A>> extends Fluent<A>{


    public A addToNameservers(int index,String item);
    public A setToNameservers(int index,String item);
    public A addToNameservers(String... items);
    public A addAllToNameservers(Collection<String> items);
    public A removeFromNameservers(String... items);
    public A removeAllFromNameservers(Collection<String> items);
    public List<String> getNameservers();
    public String getNameserver(int index);
    public String getFirstNameserver();
    public String getLastNameserver();
    public String getMatchingNameserver(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withNameservers(List<String> nameservers);
    public A withNameservers(String... nameservers);
    public Boolean hasNameservers();
    public A addToOptions(int index,PodDNSConfigOption item);
    public A setToOptions(int index,PodDNSConfigOption item);
    public A addToOptions(PodDNSConfigOption... items);
    public A addAllToOptions(Collection<PodDNSConfigOption> items);
    public A removeFromOptions(PodDNSConfigOption... items);
    public A removeAllFromOptions(Collection<PodDNSConfigOption> items);
    
/**
 * This method has been deprecated, please use method buildOptions instead.
 * @return The buildable object.
 */
@Deprecated public List<PodDNSConfigOption> getOptions();
    public List<PodDNSConfigOption> buildOptions();
    public PodDNSConfigOption buildOption(int index);
    public PodDNSConfigOption buildFirstOption();
    public PodDNSConfigOption buildLastOption();
    public PodDNSConfigOption buildMatchingOption(io.fabric8.kubernetes.api.builder.Predicate<PodDNSConfigOptionBuilder> predicate);
    public A withOptions(List<PodDNSConfigOption> options);
    public A withOptions(PodDNSConfigOption... options);
    public Boolean hasOptions();
    public A addNewOption(String name,String value);
    public PodDNSConfigFluent.OptionsNested<A> addNewOption();
    public PodDNSConfigFluent.OptionsNested<A> addNewOptionLike(PodDNSConfigOption item);
    public PodDNSConfigFluent.OptionsNested<A> setNewOptionLike(int index,PodDNSConfigOption item);
    public PodDNSConfigFluent.OptionsNested<A> editOption(int index);
    public PodDNSConfigFluent.OptionsNested<A> editFirstOption();
    public PodDNSConfigFluent.OptionsNested<A> editLastOption();
    public PodDNSConfigFluent.OptionsNested<A> editMatchingOption(io.fabric8.kubernetes.api.builder.Predicate<PodDNSConfigOptionBuilder> predicate);
    public A addToSearches(int index,String item);
    public A setToSearches(int index,String item);
    public A addToSearches(String... items);
    public A addAllToSearches(Collection<String> items);
    public A removeFromSearches(String... items);
    public A removeAllFromSearches(Collection<String> items);
    public List<String> getSearches();
    public String getSearch(int index);
    public String getFirstSearch();
    public String getLastSearch();
    public String getMatchingSearch(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withSearches(List<String> searches);
    public A withSearches(String... searches);
    public Boolean hasSearches();

    public interface OptionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodDNSConfigOptionFluent<PodDNSConfigFluent.OptionsNested<N>>{

        
    public N and();    public N endOption();
}


}
