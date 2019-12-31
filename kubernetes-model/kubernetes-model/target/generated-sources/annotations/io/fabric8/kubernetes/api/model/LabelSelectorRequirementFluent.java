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

public interface LabelSelectorRequirementFluent<A extends LabelSelectorRequirementFluent<A>> extends Fluent<A>{


    public String getKey();
    public A withKey(String key);
    public Boolean hasKey();
    public String getOperator();
    public A withOperator(String operator);
    public Boolean hasOperator();
    public A addToValues(int index,String item);
    public A setToValues(int index,String item);
    public A addToValues(String... items);
    public A addAllToValues(Collection<String> items);
    public A removeFromValues(String... items);
    public A removeAllFromValues(Collection<String> items);
    public List<String> getValues();
    public String getValue(int index);
    public String getFirstValue();
    public String getLastValue();
    public String getMatchingValue(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withValues(List<String> values);
    public A withValues(String... values);
    public Boolean hasValues();



}
