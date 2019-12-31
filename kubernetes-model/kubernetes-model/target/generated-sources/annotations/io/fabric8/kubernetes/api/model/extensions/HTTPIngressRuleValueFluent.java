package io.fabric8.kubernetes.api.model.extensions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface HTTPIngressRuleValueFluent<A extends HTTPIngressRuleValueFluent<A>> extends Fluent<A>{


    public A addToPaths(int index,HTTPIngressPath item);
    public A setToPaths(int index,HTTPIngressPath item);
    public A addToPaths(HTTPIngressPath... items);
    public A addAllToPaths(Collection<HTTPIngressPath> items);
    public A removeFromPaths(HTTPIngressPath... items);
    public A removeAllFromPaths(Collection<HTTPIngressPath> items);
    
/**
 * This method has been deprecated, please use method buildPaths instead.
 * @return The buildable object.
 */
@Deprecated public List<HTTPIngressPath> getPaths();
    public List<HTTPIngressPath> buildPaths();
    public HTTPIngressPath buildPath(int index);
    public HTTPIngressPath buildFirstPath();
    public HTTPIngressPath buildLastPath();
    public HTTPIngressPath buildMatchingPath(io.fabric8.kubernetes.api.builder.Predicate<HTTPIngressPathBuilder> predicate);
    public A withPaths(List<HTTPIngressPath> paths);
    public A withPaths(HTTPIngressPath... paths);
    public Boolean hasPaths();
    public HTTPIngressRuleValueFluent.PathsNested<A> addNewPath();
    public HTTPIngressRuleValueFluent.PathsNested<A> addNewPathLike(HTTPIngressPath item);
    public HTTPIngressRuleValueFluent.PathsNested<A> setNewPathLike(int index,HTTPIngressPath item);
    public HTTPIngressRuleValueFluent.PathsNested<A> editPath(int index);
    public HTTPIngressRuleValueFluent.PathsNested<A> editFirstPath();
    public HTTPIngressRuleValueFluent.PathsNested<A> editLastPath();
    public HTTPIngressRuleValueFluent.PathsNested<A> editMatchingPath(io.fabric8.kubernetes.api.builder.Predicate<HTTPIngressPathBuilder> predicate);

    public interface PathsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,HTTPIngressPathFluent<HTTPIngressRuleValueFluent.PathsNested<N>>{

        
    public N and();    public N endPath();
}


}
