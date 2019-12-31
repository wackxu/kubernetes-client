package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class SourceRevisionFluentImpl<A extends SourceRevisionFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements SourceRevisionFluent<A>{

    private GitSourceRevisionBuilder git;
    private String type;

    public SourceRevisionFluentImpl(){
    }
    public SourceRevisionFluentImpl(SourceRevision instance){
            this.withGit(instance.getGit()); 
            this.withType(instance.getType()); 
    }

    
/**
 * This method has been deprecated, please use method buildGit instead.
 * @return The buildable object.
 */
@Deprecated public GitSourceRevision getGit(){
            return this.git!=null?this.git.build():null;
    }

    public GitSourceRevision buildGit(){
            return this.git!=null?this.git.build():null;
    }

    public A withGit(GitSourceRevision git){
            _visitables.remove(this.git);
            if (git!=null){ this.git= new GitSourceRevisionBuilder(git); _visitables.add(this.git);} return (A) this;
    }

    public Boolean hasGit(){
            return this.git != null;
    }

    public SourceRevisionFluent.GitNested<A> withNewGit(){
            return new GitNestedImpl();
    }

    public SourceRevisionFluent.GitNested<A> withNewGitLike(GitSourceRevision item){
            return new GitNestedImpl(item);
    }

    public SourceRevisionFluent.GitNested<A> editGit(){
            return withNewGitLike(getGit());
    }

    public SourceRevisionFluent.GitNested<A> editOrNewGit(){
            return withNewGitLike(getGit() != null ? getGit(): new GitSourceRevisionBuilder().build());
    }

    public SourceRevisionFluent.GitNested<A> editOrNewGitLike(GitSourceRevision item){
            return withNewGitLike(getGit() != null ? getGit(): item);
    }

    public String getType(){
            return this.type;
    }

    public A withType(String type){
            this.type=type; return (A) this;
    }

    public Boolean hasType(){
            return this.type != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SourceRevisionFluentImpl that = (SourceRevisionFluentImpl) o;
            if (git != null ? !git.equals(that.git) :that.git != null) return false;
            if (type != null ? !type.equals(that.type) :that.type != null) return false;
            return true;
    }


    public class GitNestedImpl<N> extends GitSourceRevisionFluentImpl<SourceRevisionFluent.GitNested<N>> implements SourceRevisionFluent.GitNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final GitSourceRevisionBuilder builder;
    
            GitNestedImpl(GitSourceRevision item){
                    this.builder = new GitSourceRevisionBuilder(this, item);
            }
            GitNestedImpl(){
                    this.builder = new GitSourceRevisionBuilder(this);
            }
    
    public N and(){
            return (N) SourceRevisionFluentImpl.this.withGit(builder.build());
    }
    public N endGit(){
            return and();
    }

}


}
