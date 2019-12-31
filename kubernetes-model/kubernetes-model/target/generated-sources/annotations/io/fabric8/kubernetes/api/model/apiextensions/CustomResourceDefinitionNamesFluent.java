package io.fabric8.kubernetes.api.model.apiextensions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface CustomResourceDefinitionNamesFluent<A extends CustomResourceDefinitionNamesFluent<A>> extends Fluent<A>{


    public A addToCategories(int index,String item);
    public A setToCategories(int index,String item);
    public A addToCategories(String... items);
    public A addAllToCategories(Collection<String> items);
    public A removeFromCategories(String... items);
    public A removeAllFromCategories(Collection<String> items);
    public List<String> getCategories();
    public String getCategory(int index);
    public String getFirstCategory();
    public String getLastCategory();
    public String getMatchingCategory(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withCategories(List<String> categories);
    public A withCategories(String... categories);
    public Boolean hasCategories();
    public String getKind();
    public A withKind(String kind);
    public Boolean hasKind();
    public String getListKind();
    public A withListKind(String listKind);
    public Boolean hasListKind();
    public String getPlural();
    public A withPlural(String plural);
    public Boolean hasPlural();
    public A addToShortNames(int index,String item);
    public A setToShortNames(int index,String item);
    public A addToShortNames(String... items);
    public A addAllToShortNames(Collection<String> items);
    public A removeFromShortNames(String... items);
    public A removeAllFromShortNames(Collection<String> items);
    public List<String> getShortNames();
    public String getShortName(int index);
    public String getFirstShortName();
    public String getLastShortName();
    public String getMatchingShortName(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withShortNames(List<String> shortNames);
    public A withShortNames(String... shortNames);
    public Boolean hasShortNames();
    public String getSingular();
    public A withSingular(String singular);
    public Boolean hasSingular();



}
