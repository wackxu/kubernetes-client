package io.fabric8.kubernetes.api.model.authentication;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.util.LinkedHashMap;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface UserInfoFluent<A extends UserInfoFluent<A>> extends Fluent<A>{


    public A addToExtra(String key,ArrayList<String> value);
    public A addToExtra(Map<String,ArrayList<String>> map);
    public A removeFromExtra(String key);
    public A removeFromExtra(Map<String,ArrayList<String>> map);
    public Map<String,ArrayList<String>> getExtra();
    public A withExtra(Map<String,ArrayList<String>> extra);
    public Boolean hasExtra();
    public A addToGroups(int index,String item);
    public A setToGroups(int index,String item);
    public A addToGroups(String... items);
    public A addAllToGroups(Collection<String> items);
    public A removeFromGroups(String... items);
    public A removeAllFromGroups(Collection<String> items);
    public List<String> getGroups();
    public String getGroup(int index);
    public String getFirstGroup();
    public String getLastGroup();
    public String getMatchingGroup(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withGroups(List<String> groups);
    public A withGroups(String... groups);
    public Boolean hasGroups();
    public String getUid();
    public A withUid(String uid);
    public Boolean hasUid();
    public String getUsername();
    public A withUsername(String username);
    public Boolean hasUsername();



}
