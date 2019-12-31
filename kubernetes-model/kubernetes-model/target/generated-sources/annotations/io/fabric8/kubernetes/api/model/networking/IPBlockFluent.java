package io.fabric8.kubernetes.api.model.networking;

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

public interface IPBlockFluent<A extends IPBlockFluent<A>> extends Fluent<A>{


    public String getCidr();
    public A withCidr(String cidr);
    public Boolean hasCidr();
    public A addToExcept(int index,String item);
    public A setToExcept(int index,String item);
    public A addToExcept(String... items);
    public A addAllToExcept(Collection<String> items);
    public A removeFromExcept(String... items);
    public A removeAllFromExcept(Collection<String> items);
    public List<String> getExcept();
    public String getExcept(int index);
    public String getFirstExcept();
    public String getLastExcept();
    public String getMatchingExcept(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withExcept(List<String> except);
    public A withExcept(String... except);
    public Boolean hasExcept();



}
