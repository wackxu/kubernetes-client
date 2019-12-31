package io.fabric8.kubernetes.api.model;

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

public interface RootPathsFluent<A extends RootPathsFluent<A>> extends Fluent<A>{


    public A addToPaths(int index,String item);
    public A setToPaths(int index,String item);
    public A addToPaths(String... items);
    public A addAllToPaths(Collection<String> items);
    public A removeFromPaths(String... items);
    public A removeAllFromPaths(Collection<String> items);
    public List<String> getPaths();
    public String getPath(int index);
    public String getFirstPath();
    public String getLastPath();
    public String getMatchingPath(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withPaths(List<String> paths);
    public A withPaths(String... paths);
    public Boolean hasPaths();



}
