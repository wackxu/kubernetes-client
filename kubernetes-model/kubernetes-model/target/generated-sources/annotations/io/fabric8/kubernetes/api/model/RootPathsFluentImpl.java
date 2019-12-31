package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class RootPathsFluentImpl<A extends RootPathsFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements RootPathsFluent<A>{

    private List<String> paths;

    public RootPathsFluentImpl(){
    }
    public RootPathsFluentImpl(RootPaths instance){
            this.withPaths(instance.getPaths()); 
    }

    public A addToPaths(int index,String item){
            if (this.paths == null) {this.paths = new ArrayList<String>();}
            this.paths.add(index, item);
            return (A)this;
    }

    public A setToPaths(int index,String item){
            if (this.paths == null) {this.paths = new ArrayList<String>();}
            this.paths.set(index, item); return (A)this;
    }

    public A addToPaths(String... items){
            if (this.paths == null) {this.paths = new ArrayList<String>();}
            for (String item : items) {this.paths.add(item);} return (A)this;
    }

    public A addAllToPaths(Collection<String> items){
            if (this.paths == null) {this.paths = new ArrayList<String>();}
            for (String item : items) {this.paths.add(item);} return (A)this;
    }

    public A removeFromPaths(String... items){
            for (String item : items) {if (this.paths!= null){ this.paths.remove(item);}} return (A)this;
    }

    public A removeAllFromPaths(Collection<String> items){
            for (String item : items) {if (this.paths!= null){ this.paths.remove(item);}} return (A)this;
    }

    public List<String> getPaths(){
            return this.paths;
    }

    public String getPath(int index){
            return this.paths.get(index);
    }

    public String getFirstPath(){
            return this.paths.get(0);
    }

    public String getLastPath(){
            return this.paths.get(paths.size() - 1);
    }

    public String getMatchingPath(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: paths) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withPaths(List<String> paths){
            if (this.paths != null) { _visitables.removeAll(this.paths);}
            if (paths != null) {this.paths = new ArrayList<String>(); for (String item : paths){this.addToPaths(item);}} else { this.paths = new ArrayList<String>();} return (A) this;
    }

    public A withPaths(String... paths){
            if (this.paths != null) {this.paths.clear();}
            if (paths != null) {for (String item :paths){ this.addToPaths(item);}} return (A) this;
    }

    public Boolean hasPaths(){
            return paths != null && !paths.isEmpty();
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RootPathsFluentImpl that = (RootPathsFluentImpl) o;
            if (paths != null ? !paths.equals(that.paths) :that.paths != null) return false;
            return true;
    }




}
