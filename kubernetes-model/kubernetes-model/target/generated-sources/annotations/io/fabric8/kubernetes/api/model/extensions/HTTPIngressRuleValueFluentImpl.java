package io.fabric8.kubernetes.api.model.extensions;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class HTTPIngressRuleValueFluentImpl<A extends HTTPIngressRuleValueFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements HTTPIngressRuleValueFluent<A>{

    private List<HTTPIngressPathBuilder> paths;

    public HTTPIngressRuleValueFluentImpl(){
    }
    public HTTPIngressRuleValueFluentImpl(HTTPIngressRuleValue instance){
            this.withPaths(instance.getPaths()); 
    }

    public A addToPaths(int index,HTTPIngressPath item){
            if (this.paths == null) {this.paths = new ArrayList<HTTPIngressPathBuilder>();}
            HTTPIngressPathBuilder builder = new HTTPIngressPathBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.paths.add(index >= 0 ? index : paths.size(), builder); return (A)this;
    }

    public A setToPaths(int index,HTTPIngressPath item){
            if (this.paths == null) {this.paths = new ArrayList<HTTPIngressPathBuilder>();}
            HTTPIngressPathBuilder builder = new HTTPIngressPathBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= paths.size()) { paths.add(builder); } else { paths.set(index, builder);}
             return (A)this;
    }

    public A addToPaths(HTTPIngressPath... items){
            if (this.paths == null) {this.paths = new ArrayList<HTTPIngressPathBuilder>();}
            for (HTTPIngressPath item : items) {HTTPIngressPathBuilder builder = new HTTPIngressPathBuilder(item);_visitables.add(builder);this.paths.add(builder);} return (A)this;
    }

    public A addAllToPaths(Collection<HTTPIngressPath> items){
            if (this.paths == null) {this.paths = new ArrayList<HTTPIngressPathBuilder>();}
            for (HTTPIngressPath item : items) {HTTPIngressPathBuilder builder = new HTTPIngressPathBuilder(item);_visitables.add(builder);this.paths.add(builder);} return (A)this;
    }

    public A removeFromPaths(HTTPIngressPath... items){
            for (HTTPIngressPath item : items) {HTTPIngressPathBuilder builder = new HTTPIngressPathBuilder(item);_visitables.remove(builder);if (this.paths != null) {this.paths.remove(builder);}} return (A)this;
    }

    public A removeAllFromPaths(Collection<HTTPIngressPath> items){
            for (HTTPIngressPath item : items) {HTTPIngressPathBuilder builder = new HTTPIngressPathBuilder(item);_visitables.remove(builder);if (this.paths != null) {this.paths.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildPaths instead.
 * @return The buildable object.
 */
@Deprecated public List<HTTPIngressPath> getPaths(){
            return build(paths);
    }

    public List<HTTPIngressPath> buildPaths(){
            return build(paths);
    }

    public HTTPIngressPath buildPath(int index){
            return this.paths.get(index).build();
    }

    public HTTPIngressPath buildFirstPath(){
            return this.paths.get(0).build();
    }

    public HTTPIngressPath buildLastPath(){
            return this.paths.get(paths.size() - 1).build();
    }

    public HTTPIngressPath buildMatchingPath(io.fabric8.kubernetes.api.builder.Predicate<HTTPIngressPathBuilder> predicate){
            for (HTTPIngressPathBuilder item: paths) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withPaths(List<HTTPIngressPath> paths){
            if (this.paths != null) { _visitables.removeAll(this.paths);}
            if (paths != null) {this.paths = new ArrayList<HTTPIngressPathBuilder>(); for (HTTPIngressPath item : paths){this.addToPaths(item);}} else { this.paths = new ArrayList<HTTPIngressPathBuilder>();} return (A) this;
    }

    public A withPaths(HTTPIngressPath... paths){
            if (this.paths != null) {this.paths.clear();}
            if (paths != null) {for (HTTPIngressPath item :paths){ this.addToPaths(item);}} return (A) this;
    }

    public Boolean hasPaths(){
            return paths != null && !paths.isEmpty();
    }

    public HTTPIngressRuleValueFluent.PathsNested<A> addNewPath(){
            return new PathsNestedImpl();
    }

    public HTTPIngressRuleValueFluent.PathsNested<A> addNewPathLike(HTTPIngressPath item){
            return new PathsNestedImpl(-1, item);
    }

    public HTTPIngressRuleValueFluent.PathsNested<A> setNewPathLike(int index,HTTPIngressPath item){
            return new PathsNestedImpl(index, item);
    }

    public HTTPIngressRuleValueFluent.PathsNested<A> editPath(int index){
            if (paths.size() <= index) throw new RuntimeException("Can't edit paths. Index exceeds size.");
            return setNewPathLike(index, buildPath(index));
    }

    public HTTPIngressRuleValueFluent.PathsNested<A> editFirstPath(){
            if (paths.size() == 0) throw new RuntimeException("Can't edit first paths. The list is empty.");
            return setNewPathLike(0, buildPath(0));
    }

    public HTTPIngressRuleValueFluent.PathsNested<A> editLastPath(){
            int index = paths.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last paths. The list is empty.");
            return setNewPathLike(index, buildPath(index));
    }

    public HTTPIngressRuleValueFluent.PathsNested<A> editMatchingPath(io.fabric8.kubernetes.api.builder.Predicate<HTTPIngressPathBuilder> predicate){
            int index = -1;
            for (int i=0;i<paths.size();i++) { 
            if (predicate.apply(paths.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching paths. No match found.");
            return setNewPathLike(index, buildPath(index));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            HTTPIngressRuleValueFluentImpl that = (HTTPIngressRuleValueFluentImpl) o;
            if (paths != null ? !paths.equals(that.paths) :that.paths != null) return false;
            return true;
    }


    public class PathsNestedImpl<N> extends HTTPIngressPathFluentImpl<HTTPIngressRuleValueFluent.PathsNested<N>> implements HTTPIngressRuleValueFluent.PathsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final HTTPIngressPathBuilder builder;
        private final int index;
    
            PathsNestedImpl(int index,HTTPIngressPath item){
                    this.index = index;
                    this.builder = new HTTPIngressPathBuilder(this, item);
            }
            PathsNestedImpl(){
                    this.index = -1;
                    this.builder = new HTTPIngressPathBuilder(this);
            }
    
    public N and(){
            return (N) HTTPIngressRuleValueFluentImpl.this.setToPaths(index, builder.build());
    }
    public N endPath(){
            return and();
    }

}


}
