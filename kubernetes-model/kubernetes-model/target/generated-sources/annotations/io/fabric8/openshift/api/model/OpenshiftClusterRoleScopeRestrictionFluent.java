package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface OpenshiftClusterRoleScopeRestrictionFluent<A extends OpenshiftClusterRoleScopeRestrictionFluent<A>> extends Fluent<A>{


    public Boolean isAllowEscalation();
    public A withAllowEscalation(Boolean allowEscalation);
    public Boolean hasAllowEscalation();
    public A withNewAllowEscalation(String arg1);
    public A withNewAllowEscalation(boolean arg1);
    public A addToNamespaces(int index,String item);
    public A setToNamespaces(int index,String item);
    public A addToNamespaces(String... items);
    public A addAllToNamespaces(Collection<String> items);
    public A removeFromNamespaces(String... items);
    public A removeAllFromNamespaces(Collection<String> items);
    public List<String> getNamespaces();
    public String getNamespace(int index);
    public String getFirstNamespace();
    public String getLastNamespace();
    public String getMatchingNamespace(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withNamespaces(List<String> namespaces);
    public A withNamespaces(String... namespaces);
    public Boolean hasNamespaces();
    public A addToRoleNames(int index,String item);
    public A setToRoleNames(int index,String item);
    public A addToRoleNames(String... items);
    public A addAllToRoleNames(Collection<String> items);
    public A removeFromRoleNames(String... items);
    public A removeAllFromRoleNames(Collection<String> items);
    public List<String> getRoleNames();
    public String getRoleName(int index);
    public String getFirstRoleName();
    public String getLastRoleName();
    public String getMatchingRoleName(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withRoleNames(List<String> roleNames);
    public A withRoleNames(String... roleNames);
    public Boolean hasRoleNames();



}
