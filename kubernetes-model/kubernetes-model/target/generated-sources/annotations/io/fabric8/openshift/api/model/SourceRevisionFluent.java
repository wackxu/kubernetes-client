package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface SourceRevisionFluent<A extends SourceRevisionFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildGit instead.
 * @return The buildable object.
 */
@Deprecated public GitSourceRevision getGit();
    public GitSourceRevision buildGit();
    public A withGit(GitSourceRevision git);
    public Boolean hasGit();
    public SourceRevisionFluent.GitNested<A> withNewGit();
    public SourceRevisionFluent.GitNested<A> withNewGitLike(GitSourceRevision item);
    public SourceRevisionFluent.GitNested<A> editGit();
    public SourceRevisionFluent.GitNested<A> editOrNewGit();
    public SourceRevisionFluent.GitNested<A> editOrNewGitLike(GitSourceRevision item);
    public String getType();
    public A withType(String type);
    public Boolean hasType();

    public interface GitNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,GitSourceRevisionFluent<SourceRevisionFluent.GitNested<N>>{

        
    public N and();    public N endGit();
}


}
