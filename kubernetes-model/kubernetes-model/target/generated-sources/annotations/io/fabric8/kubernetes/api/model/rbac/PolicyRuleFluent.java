package io.fabric8.kubernetes.api.model.rbac;

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

public interface PolicyRuleFluent<A extends PolicyRuleFluent<A>> extends Fluent<A>{


    public A addToApiGroups(int index,String item);
    public A setToApiGroups(int index,String item);
    public A addToApiGroups(String... items);
    public A addAllToApiGroups(Collection<String> items);
    public A removeFromApiGroups(String... items);
    public A removeAllFromApiGroups(Collection<String> items);
    public List<String> getApiGroups();
    public String getApiGroup(int index);
    public String getFirstApiGroup();
    public String getLastApiGroup();
    public String getMatchingApiGroup(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withApiGroups(List<String> apiGroups);
    public A withApiGroups(String... apiGroups);
    public Boolean hasApiGroups();
    public A addToNonResourceURLs(int index,String item);
    public A setToNonResourceURLs(int index,String item);
    public A addToNonResourceURLs(String... items);
    public A addAllToNonResourceURLs(Collection<String> items);
    public A removeFromNonResourceURLs(String... items);
    public A removeAllFromNonResourceURLs(Collection<String> items);
    public List<String> getNonResourceURLs();
    public String getNonResourceURL(int index);
    public String getFirstNonResourceURL();
    public String getLastNonResourceURL();
    public String getMatchingNonResourceURL(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withNonResourceURLs(List<String> nonResourceURLs);
    public A withNonResourceURLs(String... nonResourceURLs);
    public Boolean hasNonResourceURLs();
    public A addToResourceNames(int index,String item);
    public A setToResourceNames(int index,String item);
    public A addToResourceNames(String... items);
    public A addAllToResourceNames(Collection<String> items);
    public A removeFromResourceNames(String... items);
    public A removeAllFromResourceNames(Collection<String> items);
    public List<String> getResourceNames();
    public String getResourceName(int index);
    public String getFirstResourceName();
    public String getLastResourceName();
    public String getMatchingResourceName(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withResourceNames(List<String> resourceNames);
    public A withResourceNames(String... resourceNames);
    public Boolean hasResourceNames();
    public A addToResources(int index,String item);
    public A setToResources(int index,String item);
    public A addToResources(String... items);
    public A addAllToResources(Collection<String> items);
    public A removeFromResources(String... items);
    public A removeAllFromResources(Collection<String> items);
    public List<String> getResources();
    public String getResource(int index);
    public String getFirstResource();
    public String getLastResource();
    public String getMatchingResource(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withResources(List<String> resources);
    public A withResources(String... resources);
    public Boolean hasResources();
    public A addToVerbs(int index,String item);
    public A setToVerbs(int index,String item);
    public A addToVerbs(String... items);
    public A addAllToVerbs(Collection<String> items);
    public A removeFromVerbs(String... items);
    public A removeAllFromVerbs(Collection<String> items);
    public List<String> getVerbs();
    public String getVerb(int index);
    public String getFirstVerb();
    public String getLastVerb();
    public String getMatchingVerb(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withVerbs(List<String> verbs);
    public A withVerbs(String... verbs);
    public Boolean hasVerbs();



}
