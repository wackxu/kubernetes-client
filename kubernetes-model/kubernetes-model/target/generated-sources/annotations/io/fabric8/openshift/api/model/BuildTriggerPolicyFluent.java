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

public interface BuildTriggerPolicyFluent<A extends BuildTriggerPolicyFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildBitbucket instead.
 * @return The buildable object.
 */
@Deprecated public WebHookTrigger getBitbucket();
    public WebHookTrigger buildBitbucket();
    public A withBitbucket(WebHookTrigger bitbucket);
    public Boolean hasBitbucket();
    public BuildTriggerPolicyFluent.BitbucketNested<A> withNewBitbucket();
    public BuildTriggerPolicyFluent.BitbucketNested<A> withNewBitbucketLike(WebHookTrigger item);
    public BuildTriggerPolicyFluent.BitbucketNested<A> editBitbucket();
    public BuildTriggerPolicyFluent.BitbucketNested<A> editOrNewBitbucket();
    public BuildTriggerPolicyFluent.BitbucketNested<A> editOrNewBitbucketLike(WebHookTrigger item);
    
/**
 * This method has been deprecated, please use method buildGeneric instead.
 * @return The buildable object.
 */
@Deprecated public WebHookTrigger getGeneric();
    public WebHookTrigger buildGeneric();
    public A withGeneric(WebHookTrigger generic);
    public Boolean hasGeneric();
    public BuildTriggerPolicyFluent.GenericNested<A> withNewGeneric();
    public BuildTriggerPolicyFluent.GenericNested<A> withNewGenericLike(WebHookTrigger item);
    public BuildTriggerPolicyFluent.GenericNested<A> editGeneric();
    public BuildTriggerPolicyFluent.GenericNested<A> editOrNewGeneric();
    public BuildTriggerPolicyFluent.GenericNested<A> editOrNewGenericLike(WebHookTrigger item);
    
/**
 * This method has been deprecated, please use method buildGithub instead.
 * @return The buildable object.
 */
@Deprecated public WebHookTrigger getGithub();
    public WebHookTrigger buildGithub();
    public A withGithub(WebHookTrigger github);
    public Boolean hasGithub();
    public BuildTriggerPolicyFluent.GithubNested<A> withNewGithub();
    public BuildTriggerPolicyFluent.GithubNested<A> withNewGithubLike(WebHookTrigger item);
    public BuildTriggerPolicyFluent.GithubNested<A> editGithub();
    public BuildTriggerPolicyFluent.GithubNested<A> editOrNewGithub();
    public BuildTriggerPolicyFluent.GithubNested<A> editOrNewGithubLike(WebHookTrigger item);
    
/**
 * This method has been deprecated, please use method buildGitlab instead.
 * @return The buildable object.
 */
@Deprecated public WebHookTrigger getGitlab();
    public WebHookTrigger buildGitlab();
    public A withGitlab(WebHookTrigger gitlab);
    public Boolean hasGitlab();
    public BuildTriggerPolicyFluent.GitlabNested<A> withNewGitlab();
    public BuildTriggerPolicyFluent.GitlabNested<A> withNewGitlabLike(WebHookTrigger item);
    public BuildTriggerPolicyFluent.GitlabNested<A> editGitlab();
    public BuildTriggerPolicyFluent.GitlabNested<A> editOrNewGitlab();
    public BuildTriggerPolicyFluent.GitlabNested<A> editOrNewGitlabLike(WebHookTrigger item);
    
/**
 * This method has been deprecated, please use method buildImageChange instead.
 * @return The buildable object.
 */
@Deprecated public ImageChangeTrigger getImageChange();
    public ImageChangeTrigger buildImageChange();
    public A withImageChange(ImageChangeTrigger imageChange);
    public Boolean hasImageChange();
    public BuildTriggerPolicyFluent.ImageChangeNested<A> withNewImageChange();
    public BuildTriggerPolicyFluent.ImageChangeNested<A> withNewImageChangeLike(ImageChangeTrigger item);
    public BuildTriggerPolicyFluent.ImageChangeNested<A> editImageChange();
    public BuildTriggerPolicyFluent.ImageChangeNested<A> editOrNewImageChange();
    public BuildTriggerPolicyFluent.ImageChangeNested<A> editOrNewImageChangeLike(ImageChangeTrigger item);
    public String getType();
    public A withType(String type);
    public Boolean hasType();

    public interface BitbucketNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,WebHookTriggerFluent<BuildTriggerPolicyFluent.BitbucketNested<N>>{

        
    public N and();    public N endBitbucket();
}
    public interface GenericNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,WebHookTriggerFluent<BuildTriggerPolicyFluent.GenericNested<N>>{

        
    public N and();    public N endGeneric();
}
    public interface GithubNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,WebHookTriggerFluent<BuildTriggerPolicyFluent.GithubNested<N>>{

        
    public N and();    public N endGithub();
}
    public interface GitlabNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,WebHookTriggerFluent<BuildTriggerPolicyFluent.GitlabNested<N>>{

        
    public N and();    public N endGitlab();
}
    public interface ImageChangeNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageChangeTriggerFluent<BuildTriggerPolicyFluent.ImageChangeNested<N>>{

        
    public N and();    public N endImageChange();
}


}
