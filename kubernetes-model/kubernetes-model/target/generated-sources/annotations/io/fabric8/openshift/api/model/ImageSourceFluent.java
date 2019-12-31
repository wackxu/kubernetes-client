package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import io.fabric8.kubernetes.api.model.ObjectReference;
import java.lang.Deprecated;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.LocalObjectReferenceFluent;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.LocalObjectReferenceBuilder;
import io.fabric8.kubernetes.api.model.ObjectReferenceFluent;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.ObjectReferenceBuilder;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public interface ImageSourceFluent<A extends ImageSourceFluent<A>> extends Fluent<A>{


    public A addToAs(int index,String item);
    public A setToAs(int index,String item);
    public A addToAs(String... items);
    public A addAllToAs(Collection<String> items);
    public A removeFromAs(String... items);
    public A removeAllFromAs(Collection<String> items);
    public List<String> getAs();
    public String getA(int index);
    public String getFirstA();
    public String getLastA();
    public String getMatchingA(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withAs(List<String> as);
    public A withAs(String... as);
    public Boolean hasAs();
    
/**
 * This method has been deprecated, please use method buildFrom instead.
 * @return The buildable object.
 */
@Deprecated public ObjectReference getFrom();
    public ObjectReference buildFrom();
    public A withFrom(ObjectReference from);
    public Boolean hasFrom();
    public ImageSourceFluent.FromNested<A> withNewFrom();
    public ImageSourceFluent.FromNested<A> withNewFromLike(ObjectReference item);
    public ImageSourceFluent.FromNested<A> editFrom();
    public ImageSourceFluent.FromNested<A> editOrNewFrom();
    public ImageSourceFluent.FromNested<A> editOrNewFromLike(ObjectReference item);
    public A addToPaths(int index,ImageSourcePath item);
    public A setToPaths(int index,ImageSourcePath item);
    public A addToPaths(ImageSourcePath... items);
    public A addAllToPaths(Collection<ImageSourcePath> items);
    public A removeFromPaths(ImageSourcePath... items);
    public A removeAllFromPaths(Collection<ImageSourcePath> items);
    
/**
 * This method has been deprecated, please use method buildPaths instead.
 * @return The buildable object.
 */
@Deprecated public List<ImageSourcePath> getPaths();
    public List<ImageSourcePath> buildPaths();
    public ImageSourcePath buildPath(int index);
    public ImageSourcePath buildFirstPath();
    public ImageSourcePath buildLastPath();
    public ImageSourcePath buildMatchingPath(io.fabric8.kubernetes.api.builder.Predicate<ImageSourcePathBuilder> predicate);
    public A withPaths(List<ImageSourcePath> paths);
    public A withPaths(ImageSourcePath... paths);
    public Boolean hasPaths();
    public A addNewPath(String destinationDir,String sourcePath);
    public ImageSourceFluent.PathsNested<A> addNewPath();
    public ImageSourceFluent.PathsNested<A> addNewPathLike(ImageSourcePath item);
    public ImageSourceFluent.PathsNested<A> setNewPathLike(int index,ImageSourcePath item);
    public ImageSourceFluent.PathsNested<A> editPath(int index);
    public ImageSourceFluent.PathsNested<A> editFirstPath();
    public ImageSourceFluent.PathsNested<A> editLastPath();
    public ImageSourceFluent.PathsNested<A> editMatchingPath(io.fabric8.kubernetes.api.builder.Predicate<ImageSourcePathBuilder> predicate);
    
/**
 * This method has been deprecated, please use method buildPullSecret instead.
 * @return The buildable object.
 */
@Deprecated public LocalObjectReference getPullSecret();
    public LocalObjectReference buildPullSecret();
    public A withPullSecret(LocalObjectReference pullSecret);
    public Boolean hasPullSecret();
    public A withNewPullSecret(String name);
    public ImageSourceFluent.PullSecretNested<A> withNewPullSecret();
    public ImageSourceFluent.PullSecretNested<A> withNewPullSecretLike(LocalObjectReference item);
    public ImageSourceFluent.PullSecretNested<A> editPullSecret();
    public ImageSourceFluent.PullSecretNested<A> editOrNewPullSecret();
    public ImageSourceFluent.PullSecretNested<A> editOrNewPullSecretLike(LocalObjectReference item);

    public interface FromNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectReferenceFluent<ImageSourceFluent.FromNested<N>>{

        
    public N and();    public N endFrom();
}
    public interface PathsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageSourcePathFluent<ImageSourceFluent.PathsNested<N>>{

        
    public N and();    public N endPath();
}
    public interface PullSecretNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LocalObjectReferenceFluent<ImageSourceFluent.PullSecretNested<N>>{

        
    public N and();    public N endPullSecret();
}


}
