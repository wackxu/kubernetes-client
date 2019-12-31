package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.builder.Fluent;
import javax.validation.Valid;
import java.lang.Object;
import java.util.Map;

public interface BuildTriggerCauseFluent<A extends BuildTriggerCauseFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildBitbucketWebHook instead.
 * @return The buildable object.
 */
@Deprecated public BitbucketWebHookCause getBitbucketWebHook();
    public BitbucketWebHookCause buildBitbucketWebHook();
    public A withBitbucketWebHook(BitbucketWebHookCause bitbucketWebHook);
    public Boolean hasBitbucketWebHook();
    public BuildTriggerCauseFluent.BitbucketWebHookNested<A> withNewBitbucketWebHook();
    public BuildTriggerCauseFluent.BitbucketWebHookNested<A> withNewBitbucketWebHookLike(BitbucketWebHookCause item);
    public BuildTriggerCauseFluent.BitbucketWebHookNested<A> editBitbucketWebHook();
    public BuildTriggerCauseFluent.BitbucketWebHookNested<A> editOrNewBitbucketWebHook();
    public BuildTriggerCauseFluent.BitbucketWebHookNested<A> editOrNewBitbucketWebHookLike(BitbucketWebHookCause item);
    
/**
 * This method has been deprecated, please use method buildGenericWebHook instead.
 * @return The buildable object.
 */
@Deprecated public GenericWebHookCause getGenericWebHook();
    public GenericWebHookCause buildGenericWebHook();
    public A withGenericWebHook(GenericWebHookCause genericWebHook);
    public Boolean hasGenericWebHook();
    public BuildTriggerCauseFluent.GenericWebHookNested<A> withNewGenericWebHook();
    public BuildTriggerCauseFluent.GenericWebHookNested<A> withNewGenericWebHookLike(GenericWebHookCause item);
    public BuildTriggerCauseFluent.GenericWebHookNested<A> editGenericWebHook();
    public BuildTriggerCauseFluent.GenericWebHookNested<A> editOrNewGenericWebHook();
    public BuildTriggerCauseFluent.GenericWebHookNested<A> editOrNewGenericWebHookLike(GenericWebHookCause item);
    
/**
 * This method has been deprecated, please use method buildGithubWebHook instead.
 * @return The buildable object.
 */
@Deprecated public GitHubWebHookCause getGithubWebHook();
    public GitHubWebHookCause buildGithubWebHook();
    public A withGithubWebHook(GitHubWebHookCause githubWebHook);
    public Boolean hasGithubWebHook();
    public BuildTriggerCauseFluent.GithubWebHookNested<A> withNewGithubWebHook();
    public BuildTriggerCauseFluent.GithubWebHookNested<A> withNewGithubWebHookLike(GitHubWebHookCause item);
    public BuildTriggerCauseFluent.GithubWebHookNested<A> editGithubWebHook();
    public BuildTriggerCauseFluent.GithubWebHookNested<A> editOrNewGithubWebHook();
    public BuildTriggerCauseFluent.GithubWebHookNested<A> editOrNewGithubWebHookLike(GitHubWebHookCause item);
    
/**
 * This method has been deprecated, please use method buildGitlabWebHook instead.
 * @return The buildable object.
 */
@Deprecated public GitLabWebHookCause getGitlabWebHook();
    public GitLabWebHookCause buildGitlabWebHook();
    public A withGitlabWebHook(GitLabWebHookCause gitlabWebHook);
    public Boolean hasGitlabWebHook();
    public BuildTriggerCauseFluent.GitlabWebHookNested<A> withNewGitlabWebHook();
    public BuildTriggerCauseFluent.GitlabWebHookNested<A> withNewGitlabWebHookLike(GitLabWebHookCause item);
    public BuildTriggerCauseFluent.GitlabWebHookNested<A> editGitlabWebHook();
    public BuildTriggerCauseFluent.GitlabWebHookNested<A> editOrNewGitlabWebHook();
    public BuildTriggerCauseFluent.GitlabWebHookNested<A> editOrNewGitlabWebHookLike(GitLabWebHookCause item);
    
/**
 * This method has been deprecated, please use method buildImageChangeBuild instead.
 * @return The buildable object.
 */
@Deprecated public ImageChangeCause getImageChangeBuild();
    public ImageChangeCause buildImageChangeBuild();
    public A withImageChangeBuild(ImageChangeCause imageChangeBuild);
    public Boolean hasImageChangeBuild();
    public BuildTriggerCauseFluent.ImageChangeBuildNested<A> withNewImageChangeBuild();
    public BuildTriggerCauseFluent.ImageChangeBuildNested<A> withNewImageChangeBuildLike(ImageChangeCause item);
    public BuildTriggerCauseFluent.ImageChangeBuildNested<A> editImageChangeBuild();
    public BuildTriggerCauseFluent.ImageChangeBuildNested<A> editOrNewImageChangeBuild();
    public BuildTriggerCauseFluent.ImageChangeBuildNested<A> editOrNewImageChangeBuildLike(ImageChangeCause item);
    public String getMessage();
    public A withMessage(String message);
    public Boolean hasMessage();

    public interface BitbucketWebHookNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BitbucketWebHookCauseFluent<BuildTriggerCauseFluent.BitbucketWebHookNested<N>>{

        
    public N and();    public N endBitbucketWebHook();
}
    public interface GenericWebHookNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,GenericWebHookCauseFluent<BuildTriggerCauseFluent.GenericWebHookNested<N>>{

        
    public N and();    public N endGenericWebHook();
}
    public interface GithubWebHookNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,GitHubWebHookCauseFluent<BuildTriggerCauseFluent.GithubWebHookNested<N>>{

        
    public N and();    public N endGithubWebHook();
}
    public interface GitlabWebHookNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,GitLabWebHookCauseFluent<BuildTriggerCauseFluent.GitlabWebHookNested<N>>{

        
    public N and();    public N endGitlabWebHook();
}
    public interface ImageChangeBuildNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageChangeCauseFluent<BuildTriggerCauseFluent.ImageChangeBuildNested<N>>{

        
    public N and();    public N endImageChangeBuild();
}


}
