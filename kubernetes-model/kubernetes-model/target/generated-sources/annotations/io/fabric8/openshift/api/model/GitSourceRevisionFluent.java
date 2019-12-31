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

public interface GitSourceRevisionFluent<A extends GitSourceRevisionFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildAuthor instead.
 * @return The buildable object.
 */
@Deprecated public SourceControlUser getAuthor();
    public SourceControlUser buildAuthor();
    public A withAuthor(SourceControlUser author);
    public Boolean hasAuthor();
    public A withNewAuthor(String email,String name);
    public GitSourceRevisionFluent.AuthorNested<A> withNewAuthor();
    public GitSourceRevisionFluent.AuthorNested<A> withNewAuthorLike(SourceControlUser item);
    public GitSourceRevisionFluent.AuthorNested<A> editAuthor();
    public GitSourceRevisionFluent.AuthorNested<A> editOrNewAuthor();
    public GitSourceRevisionFluent.AuthorNested<A> editOrNewAuthorLike(SourceControlUser item);
    public String getCommit();
    public A withCommit(String commit);
    public Boolean hasCommit();
    
/**
 * This method has been deprecated, please use method buildCommitter instead.
 * @return The buildable object.
 */
@Deprecated public SourceControlUser getCommitter();
    public SourceControlUser buildCommitter();
    public A withCommitter(SourceControlUser committer);
    public Boolean hasCommitter();
    public A withNewCommitter(String email,String name);
    public GitSourceRevisionFluent.CommitterNested<A> withNewCommitter();
    public GitSourceRevisionFluent.CommitterNested<A> withNewCommitterLike(SourceControlUser item);
    public GitSourceRevisionFluent.CommitterNested<A> editCommitter();
    public GitSourceRevisionFluent.CommitterNested<A> editOrNewCommitter();
    public GitSourceRevisionFluent.CommitterNested<A> editOrNewCommitterLike(SourceControlUser item);
    public String getMessage();
    public A withMessage(String message);
    public Boolean hasMessage();

    public interface AuthorNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SourceControlUserFluent<GitSourceRevisionFluent.AuthorNested<N>>{

        
    public N and();    public N endAuthor();
}
    public interface CommitterNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SourceControlUserFluent<GitSourceRevisionFluent.CommitterNested<N>>{

        
    public N and();    public N endCommitter();
}


}
