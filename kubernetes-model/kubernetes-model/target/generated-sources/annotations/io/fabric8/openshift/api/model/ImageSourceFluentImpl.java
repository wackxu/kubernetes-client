package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import io.fabric8.kubernetes.api.model.ObjectReference;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import io.fabric8.kubernetes.api.model.LocalObjectReferenceFluentImpl;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.ObjectReferenceFluentImpl;
import io.fabric8.kubernetes.api.model.LocalObjectReferenceBuilder;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.ObjectReferenceBuilder;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import java.util.Collection;
import java.lang.Object;

public class ImageSourceFluentImpl<A extends ImageSourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ImageSourceFluent<A>{

    private List<String> as;
    private ObjectReferenceBuilder from;
    private List<ImageSourcePathBuilder> paths;
    private LocalObjectReferenceBuilder pullSecret;

    public ImageSourceFluentImpl(){
    }
    public ImageSourceFluentImpl(ImageSource instance){
            this.withAs(instance.getAs()); 
            this.withFrom(instance.getFrom()); 
            this.withPaths(instance.getPaths()); 
            this.withPullSecret(instance.getPullSecret()); 
    }

    public A addToAs(int index,String item){
            if (this.as == null) {this.as = new ArrayList<String>();}
            this.as.add(index, item);
            return (A)this;
    }

    public A setToAs(int index,String item){
            if (this.as == null) {this.as = new ArrayList<String>();}
            this.as.set(index, item); return (A)this;
    }

    public A addToAs(String... items){
            if (this.as == null) {this.as = new ArrayList<String>();}
            for (String item : items) {this.as.add(item);} return (A)this;
    }

    public A addAllToAs(Collection<String> items){
            if (this.as == null) {this.as = new ArrayList<String>();}
            for (String item : items) {this.as.add(item);} return (A)this;
    }

    public A removeFromAs(String... items){
            for (String item : items) {if (this.as!= null){ this.as.remove(item);}} return (A)this;
    }

    public A removeAllFromAs(Collection<String> items){
            for (String item : items) {if (this.as!= null){ this.as.remove(item);}} return (A)this;
    }

    public List<String> getAs(){
            return this.as;
    }

    public String getA(int index){
            return this.as.get(index);
    }

    public String getFirstA(){
            return this.as.get(0);
    }

    public String getLastA(){
            return this.as.get(as.size() - 1);
    }

    public String getMatchingA(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: as) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withAs(List<String> as){
            if (this.as != null) { _visitables.removeAll(this.as);}
            if (as != null) {this.as = new ArrayList<String>(); for (String item : as){this.addToAs(item);}} else { this.as = new ArrayList<String>();} return (A) this;
    }

    public A withAs(String... as){
            if (this.as != null) {this.as.clear();}
            if (as != null) {for (String item :as){ this.addToAs(item);}} return (A) this;
    }

    public Boolean hasAs(){
            return as != null && !as.isEmpty();
    }

    
/**
 * This method has been deprecated, please use method buildFrom instead.
 * @return The buildable object.
 */
@Deprecated public ObjectReference getFrom(){
            return this.from!=null?this.from.build():null;
    }

    public ObjectReference buildFrom(){
            return this.from!=null?this.from.build():null;
    }

    public A withFrom(ObjectReference from){
            _visitables.remove(this.from);
            if (from!=null){ this.from= new ObjectReferenceBuilder(from); _visitables.add(this.from);} return (A) this;
    }

    public Boolean hasFrom(){
            return this.from != null;
    }

    public ImageSourceFluent.FromNested<A> withNewFrom(){
            return new FromNestedImpl();
    }

    public ImageSourceFluent.FromNested<A> withNewFromLike(ObjectReference item){
            return new FromNestedImpl(item);
    }

    public ImageSourceFluent.FromNested<A> editFrom(){
            return withNewFromLike(getFrom());
    }

    public ImageSourceFluent.FromNested<A> editOrNewFrom(){
            return withNewFromLike(getFrom() != null ? getFrom(): new ObjectReferenceBuilder().build());
    }

    public ImageSourceFluent.FromNested<A> editOrNewFromLike(ObjectReference item){
            return withNewFromLike(getFrom() != null ? getFrom(): item);
    }

    public A addToPaths(int index,ImageSourcePath item){
            if (this.paths == null) {this.paths = new ArrayList<ImageSourcePathBuilder>();}
            ImageSourcePathBuilder builder = new ImageSourcePathBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.paths.add(index >= 0 ? index : paths.size(), builder); return (A)this;
    }

    public A setToPaths(int index,ImageSourcePath item){
            if (this.paths == null) {this.paths = new ArrayList<ImageSourcePathBuilder>();}
            ImageSourcePathBuilder builder = new ImageSourcePathBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= paths.size()) { paths.add(builder); } else { paths.set(index, builder);}
             return (A)this;
    }

    public A addToPaths(ImageSourcePath... items){
            if (this.paths == null) {this.paths = new ArrayList<ImageSourcePathBuilder>();}
            for (ImageSourcePath item : items) {ImageSourcePathBuilder builder = new ImageSourcePathBuilder(item);_visitables.add(builder);this.paths.add(builder);} return (A)this;
    }

    public A addAllToPaths(Collection<ImageSourcePath> items){
            if (this.paths == null) {this.paths = new ArrayList<ImageSourcePathBuilder>();}
            for (ImageSourcePath item : items) {ImageSourcePathBuilder builder = new ImageSourcePathBuilder(item);_visitables.add(builder);this.paths.add(builder);} return (A)this;
    }

    public A removeFromPaths(ImageSourcePath... items){
            for (ImageSourcePath item : items) {ImageSourcePathBuilder builder = new ImageSourcePathBuilder(item);_visitables.remove(builder);if (this.paths != null) {this.paths.remove(builder);}} return (A)this;
    }

    public A removeAllFromPaths(Collection<ImageSourcePath> items){
            for (ImageSourcePath item : items) {ImageSourcePathBuilder builder = new ImageSourcePathBuilder(item);_visitables.remove(builder);if (this.paths != null) {this.paths.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildPaths instead.
 * @return The buildable object.
 */
@Deprecated public List<ImageSourcePath> getPaths(){
            return build(paths);
    }

    public List<ImageSourcePath> buildPaths(){
            return build(paths);
    }

    public ImageSourcePath buildPath(int index){
            return this.paths.get(index).build();
    }

    public ImageSourcePath buildFirstPath(){
            return this.paths.get(0).build();
    }

    public ImageSourcePath buildLastPath(){
            return this.paths.get(paths.size() - 1).build();
    }

    public ImageSourcePath buildMatchingPath(io.fabric8.kubernetes.api.builder.Predicate<ImageSourcePathBuilder> predicate){
            for (ImageSourcePathBuilder item: paths) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withPaths(List<ImageSourcePath> paths){
            if (this.paths != null) { _visitables.removeAll(this.paths);}
            if (paths != null) {this.paths = new ArrayList<ImageSourcePathBuilder>(); for (ImageSourcePath item : paths){this.addToPaths(item);}} else { this.paths = new ArrayList<ImageSourcePathBuilder>();} return (A) this;
    }

    public A withPaths(ImageSourcePath... paths){
            if (this.paths != null) {this.paths.clear();}
            if (paths != null) {for (ImageSourcePath item :paths){ this.addToPaths(item);}} return (A) this;
    }

    public Boolean hasPaths(){
            return paths != null && !paths.isEmpty();
    }

    public A addNewPath(String destinationDir,String sourcePath){
            return (A)addToPaths(new ImageSourcePath(destinationDir, sourcePath));
    }

    public ImageSourceFluent.PathsNested<A> addNewPath(){
            return new PathsNestedImpl();
    }

    public ImageSourceFluent.PathsNested<A> addNewPathLike(ImageSourcePath item){
            return new PathsNestedImpl(-1, item);
    }

    public ImageSourceFluent.PathsNested<A> setNewPathLike(int index,ImageSourcePath item){
            return new PathsNestedImpl(index, item);
    }

    public ImageSourceFluent.PathsNested<A> editPath(int index){
            if (paths.size() <= index) throw new RuntimeException("Can't edit paths. Index exceeds size.");
            return setNewPathLike(index, buildPath(index));
    }

    public ImageSourceFluent.PathsNested<A> editFirstPath(){
            if (paths.size() == 0) throw new RuntimeException("Can't edit first paths. The list is empty.");
            return setNewPathLike(0, buildPath(0));
    }

    public ImageSourceFluent.PathsNested<A> editLastPath(){
            int index = paths.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last paths. The list is empty.");
            return setNewPathLike(index, buildPath(index));
    }

    public ImageSourceFluent.PathsNested<A> editMatchingPath(io.fabric8.kubernetes.api.builder.Predicate<ImageSourcePathBuilder> predicate){
            int index = -1;
            for (int i=0;i<paths.size();i++) { 
            if (predicate.apply(paths.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching paths. No match found.");
            return setNewPathLike(index, buildPath(index));
    }

    
/**
 * This method has been deprecated, please use method buildPullSecret instead.
 * @return The buildable object.
 */
@Deprecated public LocalObjectReference getPullSecret(){
            return this.pullSecret!=null?this.pullSecret.build():null;
    }

    public LocalObjectReference buildPullSecret(){
            return this.pullSecret!=null?this.pullSecret.build():null;
    }

    public A withPullSecret(LocalObjectReference pullSecret){
            _visitables.remove(this.pullSecret);
            if (pullSecret!=null){ this.pullSecret= new LocalObjectReferenceBuilder(pullSecret); _visitables.add(this.pullSecret);} return (A) this;
    }

    public Boolean hasPullSecret(){
            return this.pullSecret != null;
    }

    public A withNewPullSecret(String name){
            return (A)withPullSecret(new LocalObjectReference(name));
    }

    public ImageSourceFluent.PullSecretNested<A> withNewPullSecret(){
            return new PullSecretNestedImpl();
    }

    public ImageSourceFluent.PullSecretNested<A> withNewPullSecretLike(LocalObjectReference item){
            return new PullSecretNestedImpl(item);
    }

    public ImageSourceFluent.PullSecretNested<A> editPullSecret(){
            return withNewPullSecretLike(getPullSecret());
    }

    public ImageSourceFluent.PullSecretNested<A> editOrNewPullSecret(){
            return withNewPullSecretLike(getPullSecret() != null ? getPullSecret(): new LocalObjectReferenceBuilder().build());
    }

    public ImageSourceFluent.PullSecretNested<A> editOrNewPullSecretLike(LocalObjectReference item){
            return withNewPullSecretLike(getPullSecret() != null ? getPullSecret(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ImageSourceFluentImpl that = (ImageSourceFluentImpl) o;
            if (as != null ? !as.equals(that.as) :that.as != null) return false;
            if (from != null ? !from.equals(that.from) :that.from != null) return false;
            if (paths != null ? !paths.equals(that.paths) :that.paths != null) return false;
            if (pullSecret != null ? !pullSecret.equals(that.pullSecret) :that.pullSecret != null) return false;
            return true;
    }


    public class FromNestedImpl<N> extends ObjectReferenceFluentImpl<ImageSourceFluent.FromNested<N>> implements ImageSourceFluent.FromNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectReferenceBuilder builder;
    
            FromNestedImpl(ObjectReference item){
                    this.builder = new ObjectReferenceBuilder(this, item);
            }
            FromNestedImpl(){
                    this.builder = new ObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) ImageSourceFluentImpl.this.withFrom(builder.build());
    }
    public N endFrom(){
            return and();
    }

}
    public class PathsNestedImpl<N> extends ImageSourcePathFluentImpl<ImageSourceFluent.PathsNested<N>> implements ImageSourceFluent.PathsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageSourcePathBuilder builder;
        private final int index;
    
            PathsNestedImpl(int index,ImageSourcePath item){
                    this.index = index;
                    this.builder = new ImageSourcePathBuilder(this, item);
            }
            PathsNestedImpl(){
                    this.index = -1;
                    this.builder = new ImageSourcePathBuilder(this);
            }
    
    public N and(){
            return (N) ImageSourceFluentImpl.this.setToPaths(index, builder.build());
    }
    public N endPath(){
            return and();
    }

}
    public class PullSecretNestedImpl<N> extends LocalObjectReferenceFluentImpl<ImageSourceFluent.PullSecretNested<N>> implements ImageSourceFluent.PullSecretNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LocalObjectReferenceBuilder builder;
    
            PullSecretNestedImpl(LocalObjectReference item){
                    this.builder = new LocalObjectReferenceBuilder(this, item);
            }
            PullSecretNestedImpl(){
                    this.builder = new LocalObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) ImageSourceFluentImpl.this.withPullSecret(builder.build());
    }
    public N endPullSecret(){
            return and();
    }

}


}
