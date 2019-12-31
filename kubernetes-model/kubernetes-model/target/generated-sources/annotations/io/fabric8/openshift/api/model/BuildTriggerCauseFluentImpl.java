package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Boolean;
import javax.validation.Valid;
import java.lang.Object;

public class BuildTriggerCauseFluentImpl<A extends BuildTriggerCauseFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements BuildTriggerCauseFluent<A>{

    private BitbucketWebHookCauseBuilder bitbucketWebHook;
    private GenericWebHookCauseBuilder genericWebHook;
    private GitHubWebHookCauseBuilder githubWebHook;
    private GitLabWebHookCauseBuilder gitlabWebHook;
    private ImageChangeCauseBuilder imageChangeBuild;
    private String message;

    public BuildTriggerCauseFluentImpl(){
    }
    public BuildTriggerCauseFluentImpl(BuildTriggerCause instance){
            this.withBitbucketWebHook(instance.getBitbucketWebHook()); 
            this.withGenericWebHook(instance.getGenericWebHook()); 
            this.withGithubWebHook(instance.getGithubWebHook()); 
            this.withGitlabWebHook(instance.getGitlabWebHook()); 
            this.withImageChangeBuild(instance.getImageChangeBuild()); 
            this.withMessage(instance.getMessage()); 
    }

    
/**
 * This method has been deprecated, please use method buildBitbucketWebHook instead.
 * @return The buildable object.
 */
@Deprecated public BitbucketWebHookCause getBitbucketWebHook(){
            return this.bitbucketWebHook!=null?this.bitbucketWebHook.build():null;
    }

    public BitbucketWebHookCause buildBitbucketWebHook(){
            return this.bitbucketWebHook!=null?this.bitbucketWebHook.build():null;
    }

    public A withBitbucketWebHook(BitbucketWebHookCause bitbucketWebHook){
            _visitables.remove(this.bitbucketWebHook);
            if (bitbucketWebHook!=null){ this.bitbucketWebHook= new BitbucketWebHookCauseBuilder(bitbucketWebHook); _visitables.add(this.bitbucketWebHook);} return (A) this;
    }

    public Boolean hasBitbucketWebHook(){
            return this.bitbucketWebHook != null;
    }

    public BuildTriggerCauseFluent.BitbucketWebHookNested<A> withNewBitbucketWebHook(){
            return new BitbucketWebHookNestedImpl();
    }

    public BuildTriggerCauseFluent.BitbucketWebHookNested<A> withNewBitbucketWebHookLike(BitbucketWebHookCause item){
            return new BitbucketWebHookNestedImpl(item);
    }

    public BuildTriggerCauseFluent.BitbucketWebHookNested<A> editBitbucketWebHook(){
            return withNewBitbucketWebHookLike(getBitbucketWebHook());
    }

    public BuildTriggerCauseFluent.BitbucketWebHookNested<A> editOrNewBitbucketWebHook(){
            return withNewBitbucketWebHookLike(getBitbucketWebHook() != null ? getBitbucketWebHook(): new BitbucketWebHookCauseBuilder().build());
    }

    public BuildTriggerCauseFluent.BitbucketWebHookNested<A> editOrNewBitbucketWebHookLike(BitbucketWebHookCause item){
            return withNewBitbucketWebHookLike(getBitbucketWebHook() != null ? getBitbucketWebHook(): item);
    }

    
/**
 * This method has been deprecated, please use method buildGenericWebHook instead.
 * @return The buildable object.
 */
@Deprecated public GenericWebHookCause getGenericWebHook(){
            return this.genericWebHook!=null?this.genericWebHook.build():null;
    }

    public GenericWebHookCause buildGenericWebHook(){
            return this.genericWebHook!=null?this.genericWebHook.build():null;
    }

    public A withGenericWebHook(GenericWebHookCause genericWebHook){
            _visitables.remove(this.genericWebHook);
            if (genericWebHook!=null){ this.genericWebHook= new GenericWebHookCauseBuilder(genericWebHook); _visitables.add(this.genericWebHook);} return (A) this;
    }

    public Boolean hasGenericWebHook(){
            return this.genericWebHook != null;
    }

    public BuildTriggerCauseFluent.GenericWebHookNested<A> withNewGenericWebHook(){
            return new GenericWebHookNestedImpl();
    }

    public BuildTriggerCauseFluent.GenericWebHookNested<A> withNewGenericWebHookLike(GenericWebHookCause item){
            return new GenericWebHookNestedImpl(item);
    }

    public BuildTriggerCauseFluent.GenericWebHookNested<A> editGenericWebHook(){
            return withNewGenericWebHookLike(getGenericWebHook());
    }

    public BuildTriggerCauseFluent.GenericWebHookNested<A> editOrNewGenericWebHook(){
            return withNewGenericWebHookLike(getGenericWebHook() != null ? getGenericWebHook(): new GenericWebHookCauseBuilder().build());
    }

    public BuildTriggerCauseFluent.GenericWebHookNested<A> editOrNewGenericWebHookLike(GenericWebHookCause item){
            return withNewGenericWebHookLike(getGenericWebHook() != null ? getGenericWebHook(): item);
    }

    
/**
 * This method has been deprecated, please use method buildGithubWebHook instead.
 * @return The buildable object.
 */
@Deprecated public GitHubWebHookCause getGithubWebHook(){
            return this.githubWebHook!=null?this.githubWebHook.build():null;
    }

    public GitHubWebHookCause buildGithubWebHook(){
            return this.githubWebHook!=null?this.githubWebHook.build():null;
    }

    public A withGithubWebHook(GitHubWebHookCause githubWebHook){
            _visitables.remove(this.githubWebHook);
            if (githubWebHook!=null){ this.githubWebHook= new GitHubWebHookCauseBuilder(githubWebHook); _visitables.add(this.githubWebHook);} return (A) this;
    }

    public Boolean hasGithubWebHook(){
            return this.githubWebHook != null;
    }

    public BuildTriggerCauseFluent.GithubWebHookNested<A> withNewGithubWebHook(){
            return new GithubWebHookNestedImpl();
    }

    public BuildTriggerCauseFluent.GithubWebHookNested<A> withNewGithubWebHookLike(GitHubWebHookCause item){
            return new GithubWebHookNestedImpl(item);
    }

    public BuildTriggerCauseFluent.GithubWebHookNested<A> editGithubWebHook(){
            return withNewGithubWebHookLike(getGithubWebHook());
    }

    public BuildTriggerCauseFluent.GithubWebHookNested<A> editOrNewGithubWebHook(){
            return withNewGithubWebHookLike(getGithubWebHook() != null ? getGithubWebHook(): new GitHubWebHookCauseBuilder().build());
    }

    public BuildTriggerCauseFluent.GithubWebHookNested<A> editOrNewGithubWebHookLike(GitHubWebHookCause item){
            return withNewGithubWebHookLike(getGithubWebHook() != null ? getGithubWebHook(): item);
    }

    
/**
 * This method has been deprecated, please use method buildGitlabWebHook instead.
 * @return The buildable object.
 */
@Deprecated public GitLabWebHookCause getGitlabWebHook(){
            return this.gitlabWebHook!=null?this.gitlabWebHook.build():null;
    }

    public GitLabWebHookCause buildGitlabWebHook(){
            return this.gitlabWebHook!=null?this.gitlabWebHook.build():null;
    }

    public A withGitlabWebHook(GitLabWebHookCause gitlabWebHook){
            _visitables.remove(this.gitlabWebHook);
            if (gitlabWebHook!=null){ this.gitlabWebHook= new GitLabWebHookCauseBuilder(gitlabWebHook); _visitables.add(this.gitlabWebHook);} return (A) this;
    }

    public Boolean hasGitlabWebHook(){
            return this.gitlabWebHook != null;
    }

    public BuildTriggerCauseFluent.GitlabWebHookNested<A> withNewGitlabWebHook(){
            return new GitlabWebHookNestedImpl();
    }

    public BuildTriggerCauseFluent.GitlabWebHookNested<A> withNewGitlabWebHookLike(GitLabWebHookCause item){
            return new GitlabWebHookNestedImpl(item);
    }

    public BuildTriggerCauseFluent.GitlabWebHookNested<A> editGitlabWebHook(){
            return withNewGitlabWebHookLike(getGitlabWebHook());
    }

    public BuildTriggerCauseFluent.GitlabWebHookNested<A> editOrNewGitlabWebHook(){
            return withNewGitlabWebHookLike(getGitlabWebHook() != null ? getGitlabWebHook(): new GitLabWebHookCauseBuilder().build());
    }

    public BuildTriggerCauseFluent.GitlabWebHookNested<A> editOrNewGitlabWebHookLike(GitLabWebHookCause item){
            return withNewGitlabWebHookLike(getGitlabWebHook() != null ? getGitlabWebHook(): item);
    }

    
/**
 * This method has been deprecated, please use method buildImageChangeBuild instead.
 * @return The buildable object.
 */
@Deprecated public ImageChangeCause getImageChangeBuild(){
            return this.imageChangeBuild!=null?this.imageChangeBuild.build():null;
    }

    public ImageChangeCause buildImageChangeBuild(){
            return this.imageChangeBuild!=null?this.imageChangeBuild.build():null;
    }

    public A withImageChangeBuild(ImageChangeCause imageChangeBuild){
            _visitables.remove(this.imageChangeBuild);
            if (imageChangeBuild!=null){ this.imageChangeBuild= new ImageChangeCauseBuilder(imageChangeBuild); _visitables.add(this.imageChangeBuild);} return (A) this;
    }

    public Boolean hasImageChangeBuild(){
            return this.imageChangeBuild != null;
    }

    public BuildTriggerCauseFluent.ImageChangeBuildNested<A> withNewImageChangeBuild(){
            return new ImageChangeBuildNestedImpl();
    }

    public BuildTriggerCauseFluent.ImageChangeBuildNested<A> withNewImageChangeBuildLike(ImageChangeCause item){
            return new ImageChangeBuildNestedImpl(item);
    }

    public BuildTriggerCauseFluent.ImageChangeBuildNested<A> editImageChangeBuild(){
            return withNewImageChangeBuildLike(getImageChangeBuild());
    }

    public BuildTriggerCauseFluent.ImageChangeBuildNested<A> editOrNewImageChangeBuild(){
            return withNewImageChangeBuildLike(getImageChangeBuild() != null ? getImageChangeBuild(): new ImageChangeCauseBuilder().build());
    }

    public BuildTriggerCauseFluent.ImageChangeBuildNested<A> editOrNewImageChangeBuildLike(ImageChangeCause item){
            return withNewImageChangeBuildLike(getImageChangeBuild() != null ? getImageChangeBuild(): item);
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
            BuildTriggerCauseFluentImpl that = (BuildTriggerCauseFluentImpl) o;
            if (bitbucketWebHook != null ? !bitbucketWebHook.equals(that.bitbucketWebHook) :that.bitbucketWebHook != null) return false;
            if (genericWebHook != null ? !genericWebHook.equals(that.genericWebHook) :that.genericWebHook != null) return false;
            if (githubWebHook != null ? !githubWebHook.equals(that.githubWebHook) :that.githubWebHook != null) return false;
            if (gitlabWebHook != null ? !gitlabWebHook.equals(that.gitlabWebHook) :that.gitlabWebHook != null) return false;
            if (imageChangeBuild != null ? !imageChangeBuild.equals(that.imageChangeBuild) :that.imageChangeBuild != null) return false;
            if (message != null ? !message.equals(that.message) :that.message != null) return false;
            return true;
    }


    public class BitbucketWebHookNestedImpl<N> extends BitbucketWebHookCauseFluentImpl<BuildTriggerCauseFluent.BitbucketWebHookNested<N>> implements BuildTriggerCauseFluent.BitbucketWebHookNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BitbucketWebHookCauseBuilder builder;
    
            BitbucketWebHookNestedImpl(BitbucketWebHookCause item){
                    this.builder = new BitbucketWebHookCauseBuilder(this, item);
            }
            BitbucketWebHookNestedImpl(){
                    this.builder = new BitbucketWebHookCauseBuilder(this);
            }
    
    public N and(){
            return (N) BuildTriggerCauseFluentImpl.this.withBitbucketWebHook(builder.build());
    }
    public N endBitbucketWebHook(){
            return and();
    }

}
    public class GenericWebHookNestedImpl<N> extends GenericWebHookCauseFluentImpl<BuildTriggerCauseFluent.GenericWebHookNested<N>> implements BuildTriggerCauseFluent.GenericWebHookNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final GenericWebHookCauseBuilder builder;
    
            GenericWebHookNestedImpl(GenericWebHookCause item){
                    this.builder = new GenericWebHookCauseBuilder(this, item);
            }
            GenericWebHookNestedImpl(){
                    this.builder = new GenericWebHookCauseBuilder(this);
            }
    
    public N and(){
            return (N) BuildTriggerCauseFluentImpl.this.withGenericWebHook(builder.build());
    }
    public N endGenericWebHook(){
            return and();
    }

}
    public class GithubWebHookNestedImpl<N> extends GitHubWebHookCauseFluentImpl<BuildTriggerCauseFluent.GithubWebHookNested<N>> implements BuildTriggerCauseFluent.GithubWebHookNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final GitHubWebHookCauseBuilder builder;
    
            GithubWebHookNestedImpl(GitHubWebHookCause item){
                    this.builder = new GitHubWebHookCauseBuilder(this, item);
            }
            GithubWebHookNestedImpl(){
                    this.builder = new GitHubWebHookCauseBuilder(this);
            }
    
    public N and(){
            return (N) BuildTriggerCauseFluentImpl.this.withGithubWebHook(builder.build());
    }
    public N endGithubWebHook(){
            return and();
    }

}
    public class GitlabWebHookNestedImpl<N> extends GitLabWebHookCauseFluentImpl<BuildTriggerCauseFluent.GitlabWebHookNested<N>> implements BuildTriggerCauseFluent.GitlabWebHookNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final GitLabWebHookCauseBuilder builder;
    
            GitlabWebHookNestedImpl(GitLabWebHookCause item){
                    this.builder = new GitLabWebHookCauseBuilder(this, item);
            }
            GitlabWebHookNestedImpl(){
                    this.builder = new GitLabWebHookCauseBuilder(this);
            }
    
    public N and(){
            return (N) BuildTriggerCauseFluentImpl.this.withGitlabWebHook(builder.build());
    }
    public N endGitlabWebHook(){
            return and();
    }

}
    public class ImageChangeBuildNestedImpl<N> extends ImageChangeCauseFluentImpl<BuildTriggerCauseFluent.ImageChangeBuildNested<N>> implements BuildTriggerCauseFluent.ImageChangeBuildNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageChangeCauseBuilder builder;
    
            ImageChangeBuildNestedImpl(ImageChangeCause item){
                    this.builder = new ImageChangeCauseBuilder(this, item);
            }
            ImageChangeBuildNestedImpl(){
                    this.builder = new ImageChangeCauseBuilder(this);
            }
    
    public N and(){
            return (N) BuildTriggerCauseFluentImpl.this.withImageChangeBuild(builder.build());
    }
    public N endImageChangeBuild(){
            return and();
    }

}


}
