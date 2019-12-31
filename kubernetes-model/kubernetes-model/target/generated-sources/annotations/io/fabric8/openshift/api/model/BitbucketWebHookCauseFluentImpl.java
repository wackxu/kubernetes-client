package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class BitbucketWebHookCauseFluentImpl<A extends BitbucketWebHookCauseFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements BitbucketWebHookCauseFluent<A>{

    private SourceRevisionBuilder revision;
    private String secret;

    public BitbucketWebHookCauseFluentImpl(){
    }
    public BitbucketWebHookCauseFluentImpl(BitbucketWebHookCause instance){
            this.withRevision(instance.getRevision()); 
            this.withSecret(instance.getSecret()); 
    }

    
/**
 * This method has been deprecated, please use method buildRevision instead.
 * @return The buildable object.
 */
@Deprecated public SourceRevision getRevision(){
            return this.revision!=null?this.revision.build():null;
    }

    public SourceRevision buildRevision(){
            return this.revision!=null?this.revision.build():null;
    }

    public A withRevision(SourceRevision revision){
            _visitables.remove(this.revision);
            if (revision!=null){ this.revision= new SourceRevisionBuilder(revision); _visitables.add(this.revision);} return (A) this;
    }

    public Boolean hasRevision(){
            return this.revision != null;
    }

    public BitbucketWebHookCauseFluent.RevisionNested<A> withNewRevision(){
            return new RevisionNestedImpl();
    }

    public BitbucketWebHookCauseFluent.RevisionNested<A> withNewRevisionLike(SourceRevision item){
            return new RevisionNestedImpl(item);
    }

    public BitbucketWebHookCauseFluent.RevisionNested<A> editRevision(){
            return withNewRevisionLike(getRevision());
    }

    public BitbucketWebHookCauseFluent.RevisionNested<A> editOrNewRevision(){
            return withNewRevisionLike(getRevision() != null ? getRevision(): new SourceRevisionBuilder().build());
    }

    public BitbucketWebHookCauseFluent.RevisionNested<A> editOrNewRevisionLike(SourceRevision item){
            return withNewRevisionLike(getRevision() != null ? getRevision(): item);
    }

    public String getSecret(){
            return this.secret;
    }

    public A withSecret(String secret){
            this.secret=secret; return (A) this;
    }

    public Boolean hasSecret(){
            return this.secret != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            BitbucketWebHookCauseFluentImpl that = (BitbucketWebHookCauseFluentImpl) o;
            if (revision != null ? !revision.equals(that.revision) :that.revision != null) return false;
            if (secret != null ? !secret.equals(that.secret) :that.secret != null) return false;
            return true;
    }


    public class RevisionNestedImpl<N> extends SourceRevisionFluentImpl<BitbucketWebHookCauseFluent.RevisionNested<N>> implements BitbucketWebHookCauseFluent.RevisionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SourceRevisionBuilder builder;
    
            RevisionNestedImpl(SourceRevision item){
                    this.builder = new SourceRevisionBuilder(this, item);
            }
            RevisionNestedImpl(){
                    this.builder = new SourceRevisionBuilder(this);
            }
    
    public N and(){
            return (N) BitbucketWebHookCauseFluentImpl.this.withRevision(builder.build());
    }
    public N endRevision(){
            return and();
    }

}


}
