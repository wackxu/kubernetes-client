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

public interface GitHubWebHookCauseFluent<A extends GitHubWebHookCauseFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildRevision instead.
 * @return The buildable object.
 */
@Deprecated public SourceRevision getRevision();
    public SourceRevision buildRevision();
    public A withRevision(SourceRevision revision);
    public Boolean hasRevision();
    public GitHubWebHookCauseFluent.RevisionNested<A> withNewRevision();
    public GitHubWebHookCauseFluent.RevisionNested<A> withNewRevisionLike(SourceRevision item);
    public GitHubWebHookCauseFluent.RevisionNested<A> editRevision();
    public GitHubWebHookCauseFluent.RevisionNested<A> editOrNewRevision();
    public GitHubWebHookCauseFluent.RevisionNested<A> editOrNewRevisionLike(SourceRevision item);
    public String getSecret();
    public A withSecret(String secret);
    public Boolean hasSecret();

    public interface RevisionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SourceRevisionFluent<GitHubWebHookCauseFluent.RevisionNested<N>>{

        
    public N and();    public N endRevision();
}


}
