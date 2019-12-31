package io.fabric8.kubernetes.api.model;

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

public interface CapabilitiesFluent<A extends CapabilitiesFluent<A>> extends Fluent<A>{


    public A addToAdd(int index,String item);
    public A setToAdd(int index,String item);
    public A addToAdd(String... items);
    public A addAllToAdd(Collection<String> items);
    public A removeFromAdd(String... items);
    public A removeAllFromAdd(Collection<String> items);
    public List<String> getAdd();
    public String getAdd(int index);
    public String getFirstAdd();
    public String getLastAdd();
    public String getMatchingAdd(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withAdd(List<String> add);
    public A withAdd(String... add);
    public Boolean hasAdd();
    public A addToDrop(int index,String item);
    public A setToDrop(int index,String item);
    public A addToDrop(String... items);
    public A addAllToDrop(Collection<String> items);
    public A removeFromDrop(String... items);
    public A removeAllFromDrop(Collection<String> items);
    public List<String> getDrop();
    public String getDrop(int index);
    public String getFirstDrop();
    public String getLastDrop();
    public String getMatchingDrop(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withDrop(List<String> drop);
    public A withDrop(String... drop);
    public Boolean hasDrop();



}
