package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class GitSourceRevisionFluentImpl<A extends GitSourceRevisionFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements GitSourceRevisionFluent<A>{

    private SourceControlUserBuilder author;
    private String commit;
    private SourceControlUserBuilder committer;
    private String message;

    public GitSourceRevisionFluentImpl(){
    }
    public GitSourceRevisionFluentImpl(GitSourceRevision instance){
            this.withAuthor(instance.getAuthor()); 
            this.withCommit(instance.getCommit()); 
            this.withCommitter(instance.getCommitter()); 
            this.withMessage(instance.getMessage()); 
    }

    
/**
 * This method has been deprecated, please use method buildAuthor instead.
 * @return The buildable object.
 */
@Deprecated public SourceControlUser getAuthor(){
            return this.author!=null?this.author.build():null;
    }

    public SourceControlUser buildAuthor(){
            return this.author!=null?this.author.build():null;
    }

    public A withAuthor(SourceControlUser author){
            _visitables.remove(this.author);
            if (author!=null){ this.author= new SourceControlUserBuilder(author); _visitables.add(this.author);} return (A) this;
    }

    public Boolean hasAuthor(){
            return this.author != null;
    }

    public A withNewAuthor(String email,String name){
            return (A)withAuthor(new SourceControlUser(email, name));
    }

    public GitSourceRevisionFluent.AuthorNested<A> withNewAuthor(){
            return new AuthorNestedImpl();
    }

    public GitSourceRevisionFluent.AuthorNested<A> withNewAuthorLike(SourceControlUser item){
            return new AuthorNestedImpl(item);
    }

    public GitSourceRevisionFluent.AuthorNested<A> editAuthor(){
            return withNewAuthorLike(getAuthor());
    }

    public GitSourceRevisionFluent.AuthorNested<A> editOrNewAuthor(){
            return withNewAuthorLike(getAuthor() != null ? getAuthor(): new SourceControlUserBuilder().build());
    }

    public GitSourceRevisionFluent.AuthorNested<A> editOrNewAuthorLike(SourceControlUser item){
            return withNewAuthorLike(getAuthor() != null ? getAuthor(): item);
    }

    public String getCommit(){
            return this.commit;
    }

    public A withCommit(String commit){
            this.commit=commit; return (A) this;
    }

    public Boolean hasCommit(){
            return this.commit != null;
    }

    
/**
 * This method has been deprecated, please use method buildCommitter instead.
 * @return The buildable object.
 */
@Deprecated public SourceControlUser getCommitter(){
            return this.committer!=null?this.committer.build():null;
    }

    public SourceControlUser buildCommitter(){
            return this.committer!=null?this.committer.build():null;
    }

    public A withCommitter(SourceControlUser committer){
            _visitables.remove(this.committer);
            if (committer!=null){ this.committer= new SourceControlUserBuilder(committer); _visitables.add(this.committer);} return (A) this;
    }

    public Boolean hasCommitter(){
            return this.committer != null;
    }

    public A withNewCommitter(String email,String name){
            return (A)withCommitter(new SourceControlUser(email, name));
    }

    public GitSourceRevisionFluent.CommitterNested<A> withNewCommitter(){
            return new CommitterNestedImpl();
    }

    public GitSourceRevisionFluent.CommitterNested<A> withNewCommitterLike(SourceControlUser item){
            return new CommitterNestedImpl(item);
    }

    public GitSourceRevisionFluent.CommitterNested<A> editCommitter(){
            return withNewCommitterLike(getCommitter());
    }

    public GitSourceRevisionFluent.CommitterNested<A> editOrNewCommitter(){
            return withNewCommitterLike(getCommitter() != null ? getCommitter(): new SourceControlUserBuilder().build());
    }

    public GitSourceRevisionFluent.CommitterNested<A> editOrNewCommitterLike(SourceControlUser item){
            return withNewCommitterLike(getCommitter() != null ? getCommitter(): item);
    }

    public String getMessage(){
            return this.message;
    }

    public A withMessage(String message){
            this.message=message; return (A) this;
    }

    public Boolean hasMessage(){
            return this.message != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            GitSourceRevisionFluentImpl that = (GitSourceRevisionFluentImpl) o;
            if (author != null ? !author.equals(that.author) :that.author != null) return false;
            if (commit != null ? !commit.equals(that.commit) :that.commit != null) return false;
            if (committer != null ? !committer.equals(that.committer) :that.committer != null) return false;
            if (message != null ? !message.equals(that.message) :that.message != null) return false;
            return true;
    }


    public class AuthorNestedImpl<N> extends SourceControlUserFluentImpl<GitSourceRevisionFluent.AuthorNested<N>> implements GitSourceRevisionFluent.AuthorNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SourceControlUserBuilder builder;
    
            AuthorNestedImpl(SourceControlUser item){
                    this.builder = new SourceControlUserBuilder(this, item);
            }
            AuthorNestedImpl(){
                    this.builder = new SourceControlUserBuilder(this);
            }
    
    public N and(){
            return (N) GitSourceRevisionFluentImpl.this.withAuthor(builder.build());
    }
    public N endAuthor(){
            return and();
    }

}
    public class CommitterNestedImpl<N> extends SourceControlUserFluentImpl<GitSourceRevisionFluent.CommitterNested<N>> implements GitSourceRevisionFluent.CommitterNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SourceControlUserBuilder builder;
    
            CommitterNestedImpl(SourceControlUser item){
                    this.builder = new SourceControlUserBuilder(this, item);
            }
            CommitterNestedImpl(){
                    this.builder = new SourceControlUserBuilder(this);
            }
    
    public N and(){
            return (N) GitSourceRevisionFluentImpl.this.withCommitter(builder.build());
    }
    public N endCommitter(){
            return and();
    }

}


}
