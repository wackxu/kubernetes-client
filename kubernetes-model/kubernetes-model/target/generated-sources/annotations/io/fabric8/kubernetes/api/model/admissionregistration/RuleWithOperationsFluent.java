package io.fabric8.kubernetes.api.model.admissionregistration;

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

public interface RuleWithOperationsFluent<A extends RuleWithOperationsFluent<A>> extends Fluent<A>{


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
    public A addToApiVersions(int index,String item);
    public A setToApiVersions(int index,String item);
    public A addToApiVersions(String... items);
    public A addAllToApiVersions(Collection<String> items);
    public A removeFromApiVersions(String... items);
    public A removeAllFromApiVersions(Collection<String> items);
    public List<String> getApiVersions();
    public String getApiVersion(int index);
    public String getFirstApiVersion();
    public String getLastApiVersion();
    public String getMatchingApiVersion(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withApiVersions(List<String> apiVersions);
    public A withApiVersions(String... apiVersions);
    public Boolean hasApiVersions();
    public A addToOperations(int index,String item);
    public A setToOperations(int index,String item);
    public A addToOperations(String... items);
    public A addAllToOperations(Collection<String> items);
    public A removeFromOperations(String... items);
    public A removeAllFromOperations(Collection<String> items);
    public List<String> getOperations();
    public String getOperation(int index);
    public String getFirstOperation();
    public String getLastOperation();
    public String getMatchingOperation(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withOperations(List<String> operations);
    public A withOperations(String... operations);
    public Boolean hasOperations();
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



}
