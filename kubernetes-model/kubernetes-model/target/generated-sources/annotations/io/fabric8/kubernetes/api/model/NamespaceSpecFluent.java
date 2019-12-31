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

public interface NamespaceSpecFluent<A extends NamespaceSpecFluent<A>> extends Fluent<A>{


    public A addToFinalizers(int index,String item);
    public A setToFinalizers(int index,String item);
    public A addToFinalizers(String... items);
    public A addAllToFinalizers(Collection<String> items);
    public A removeFromFinalizers(String... items);
    public A removeAllFromFinalizers(Collection<String> items);
    public List<String> getFinalizers();
    public String getFinalizer(int index);
    public String getFirstFinalizer();
    public String getLastFinalizer();
    public String getMatchingFinalizer(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withFinalizers(List<String> finalizers);
    public A withFinalizers(String... finalizers);
    public Boolean hasFinalizers();



}
