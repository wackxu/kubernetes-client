package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Boolean;
import javax.validation.Valid;
import java.lang.Object;

public class BuildTriggerPolicyFluentImpl<A extends BuildTriggerPolicyFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements BuildTriggerPolicyFluent<A>{

    private WebHookTriggerBuilder bitbucket;
    private WebHookTriggerBuilder generic;
    private WebHookTriggerBuilder github;
    private WebHookTriggerBuilder gitlab;
    private ImageChangeTriggerBuilder imageChange;
    private String type;

    public BuildTriggerPolicyFluentImpl(){
    }
    public BuildTriggerPolicyFluentImpl(BuildTriggerPolicy instance){
            this.withBitbucket(instance.getBitbucket()); 
            this.withGeneric(instance.getGeneric()); 
            this.withGithub(instance.getGithub()); 
            this.withGitlab(instance.getGitlab()); 
            this.withImageChange(instance.getImageChange()); 
            this.withType(instance.getType()); 
    }

    
/**
 * This method has been deprecated, please use method buildBitbucket instead.
 * @return The buildable object.
 */
@Deprecated public WebHookTrigger getBitbucket(){
            return this.bitbucket!=null?this.bitbucket.build():null;
    }

    public WebHookTrigger buildBitbucket(){
            return this.bitbucket!=null?this.bitbucket.build():null;
    }

    public A withBitbucket(WebHookTrigger bitbucket){
            _visitables.remove(this.bitbucket);
            if (bitbucket!=null){ this.bitbucket= new WebHookTriggerBuilder(bitbucket); _visitables.add(this.bitbucket);} return (A) this;
    }

    public Boolean hasBitbucket(){
            return this.bitbucket != null;
    }

    public BuildTriggerPolicyFluent.BitbucketNested<A> withNewBitbucket(){
            return new BitbucketNestedImpl();
    }

    public BuildTriggerPolicyFluent.BitbucketNested<A> withNewBitbucketLike(WebHookTrigger item){
            return new BitbucketNestedImpl(item);
    }

    public BuildTriggerPolicyFluent.BitbucketNested<A> editBitbucket(){
            return withNewBitbucketLike(getBitbucket());
    }

    public BuildTriggerPolicyFluent.BitbucketNested<A> editOrNewBitbucket(){
            return withNewBitbucketLike(getBitbucket() != null ? getBitbucket(): new WebHookTriggerBuilder().build());
    }

    public BuildTriggerPolicyFluent.BitbucketNested<A> editOrNewBitbucketLike(WebHookTrigger item){
            return withNewBitbucketLike(getBitbucket() != null ? getBitbucket(): item);
    }

    
/**
 * This method has been deprecated, please use method buildGeneric instead.
 * @return The buildable object.
 */
@Deprecated public WebHookTrigger getGeneric(){
            return this.generic!=null?this.generic.build():null;
    }

    public WebHookTrigger buildGeneric(){
            return this.generic!=null?this.generic.build():null;
    }

    public A withGeneric(WebHookTrigger generic){
            _visitables.remove(this.generic);
            if (generic!=null){ this.generic= new WebHookTriggerBuilder(generic); _visitables.add(this.generic);} return (A) this;
    }

    public Boolean hasGeneric(){
            return this.generic != null;
    }

    public BuildTriggerPolicyFluent.GenericNested<A> withNewGeneric(){
            return new GenericNestedImpl();
    }

    public BuildTriggerPolicyFluent.GenericNested<A> withNewGenericLike(WebHookTrigger item){
            return new GenericNestedImpl(item);
    }

    public BuildTriggerPolicyFluent.GenericNested<A> editGeneric(){
            return withNewGenericLike(getGeneric());
    }

    public BuildTriggerPolicyFluent.GenericNested<A> editOrNewGeneric(){
            return withNewGenericLike(getGeneric() != null ? getGeneric(): new WebHookTriggerBuilder().build());
    }

    public BuildTriggerPolicyFluent.GenericNested<A> editOrNewGenericLike(WebHookTrigger item){
            return withNewGenericLike(getGeneric() != null ? getGeneric(): item);
    }

    
/**
 * This method has been deprecated, please use method buildGithub instead.
 * @return The buildable object.
 */
@Deprecated public WebHookTrigger getGithub(){
            return this.github!=null?this.github.build():null;
    }

    public WebHookTrigger buildGithub(){
            return this.github!=null?this.github.build():null;
    }

    public A withGithub(WebHookTrigger github){
            _visitables.remove(this.github);
            if (github!=null){ this.github= new WebHookTriggerBuilder(github); _visitables.add(this.github);} return (A) this;
    }

    public Boolean hasGithub(){
            return this.github != null;
    }

    public BuildTriggerPolicyFluent.GithubNested<A> withNewGithub(){
            return new GithubNestedImpl();
    }

    public BuildTriggerPolicyFluent.GithubNested<A> withNewGithubLike(WebHookTrigger item){
            return new GithubNestedImpl(item);
    }

    public BuildTriggerPolicyFluent.GithubNested<A> editGithub(){
            return withNewGithubLike(getGithub());
    }

    public BuildTriggerPolicyFluent.GithubNested<A> editOrNewGithub(){
            return withNewGithubLike(getGithub() != null ? getGithub(): new WebHookTriggerBuilder().build());
    }

    public BuildTriggerPolicyFluent.GithubNested<A> editOrNewGithubLike(WebHookTrigger item){
            return withNewGithubLike(getGithub() != null ? getGithub(): item);
    }

    
/**
 * This method has been deprecated, please use method buildGitlab instead.
 * @return The buildable object.
 */
@Deprecated public WebHookTrigger getGitlab(){
            return this.gitlab!=null?this.gitlab.build():null;
    }

    public WebHookTrigger buildGitlab(){
            return this.gitlab!=null?this.gitlab.build():null;
    }

    public A withGitlab(WebHookTrigger gitlab){
            _visitables.remove(this.gitlab);
            if (gitlab!=null){ this.gitlab= new WebHookTriggerBuilder(gitlab); _visitables.add(this.gitlab);} return (A) this;
    }

    public Boolean hasGitlab(){
            return this.gitlab != null;
    }

    public BuildTriggerPolicyFluent.GitlabNested<A> withNewGitlab(){
            return new GitlabNestedImpl();
    }

    public BuildTriggerPolicyFluent.GitlabNested<A> withNewGitlabLike(WebHookTrigger item){
            return new GitlabNestedImpl(item);
    }

    public BuildTriggerPolicyFluent.GitlabNested<A> editGitlab(){
            return withNewGitlabLike(getGitlab());
    }

    public BuildTriggerPolicyFluent.GitlabNested<A> editOrNewGitlab(){
            return withNewGitlabLike(getGitlab() != null ? getGitlab(): new WebHookTriggerBuilder().build());
    }

    public BuildTriggerPolicyFluent.GitlabNested<A> editOrNewGitlabLike(WebHookTrigger item){
            return withNewGitlabLike(getGitlab() != null ? getGitlab(): item);
    }

    
/**
 * This method has been deprecated, please use method buildImageChange instead.
 * @return The buildable object.
 */
@Deprecated public ImageChangeTrigger getImageChange(){
            return this.imageChange!=null?this.imageChange.build():null;
    }

    public ImageChangeTrigger buildImageChange(){
            return this.imageChange!=null?this.imageChange.build():null;
    }

    public A withImageChange(ImageChangeTrigger imageChange){
            _visitables.remove(this.imageChange);
            if (imageChange!=null){ this.imageChange= new ImageChangeTriggerBuilder(imageChange); _visitables.add(this.imageChange);} return (A) this;
    }

    public Boolean hasImageChange(){
            return this.imageChange != null;
    }

    public BuildTriggerPolicyFluent.ImageChangeNested<A> withNewImageChange(){
            return new ImageChangeNestedImpl();
    }

    public BuildTriggerPolicyFluent.ImageChangeNested<A> withNewImageChangeLike(ImageChangeTrigger item){
            return new ImageChangeNestedImpl(item);
    }

    public BuildTriggerPolicyFluent.ImageChangeNested<A> editImageChange(){
            return withNewImageChangeLike(getImageChange());
    }

    public BuildTriggerPolicyFluent.ImageChangeNested<A> editOrNewImageChange(){
            return withNewImageChangeLike(getImageChange() != null ? getImageChange(): new ImageChangeTriggerBuilder().build());
    }

    public BuildTriggerPolicyFluent.ImageChangeNested<A> editOrNewImageChangeLike(ImageChangeTrigger item){
            return withNewImageChangeLike(getImageChange() != null ? getImageChange(): item);
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
            BuildTriggerPolicyFluentImpl that = (BuildTriggerPolicyFluentImpl) o;
            if (bitbucket != null ? !bitbucket.equals(that.bitbucket) :that.bitbucket != null) return false;
            if (generic != null ? !generic.equals(that.generic) :that.generic != null) return false;
            if (github != null ? !github.equals(that.github) :that.github != null) return false;
            if (gitlab != null ? !gitlab.equals(that.gitlab) :that.gitlab != null) return false;
            if (imageChange != null ? !imageChange.equals(that.imageChange) :that.imageChange != null) return false;
            if (type != null ? !type.equals(that.type) :that.type != null) return false;
            return true;
    }


    public class BitbucketNestedImpl<N> extends WebHookTriggerFluentImpl<BuildTriggerPolicyFluent.BitbucketNested<N>> implements BuildTriggerPolicyFluent.BitbucketNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final WebHookTriggerBuilder builder;
    
            BitbucketNestedImpl(WebHookTrigger item){
                    this.builder = new WebHookTriggerBuilder(this, item);
            }
            BitbucketNestedImpl(){
                    this.builder = new WebHookTriggerBuilder(this);
            }
    
    public N and(){
            return (N) BuildTriggerPolicyFluentImpl.this.withBitbucket(builder.build());
    }
    public N endBitbucket(){
            return and();
    }

}
    public class GenericNestedImpl<N> extends WebHookTriggerFluentImpl<BuildTriggerPolicyFluent.GenericNested<N>> implements BuildTriggerPolicyFluent.GenericNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final WebHookTriggerBuilder builder;
    
            GenericNestedImpl(WebHookTrigger item){
                    this.builder = new WebHookTriggerBuilder(this, item);
            }
            GenericNestedImpl(){
                    this.builder = new WebHookTriggerBuilder(this);
            }
    
    public N and(){
            return (N) BuildTriggerPolicyFluentImpl.this.withGeneric(builder.build());
    }
    public N endGeneric(){
            return and();
    }

}
    public class GithubNestedImpl<N> extends WebHookTriggerFluentImpl<BuildTriggerPolicyFluent.GithubNested<N>> implements BuildTriggerPolicyFluent.GithubNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final WebHookTriggerBuilder builder;
    
            GithubNestedImpl(WebHookTrigger item){
                    this.builder = new WebHookTriggerBuilder(this, item);
            }
            GithubNestedImpl(){
                    this.builder = new WebHookTriggerBuilder(this);
            }
    
    public N and(){
            return (N) BuildTriggerPolicyFluentImpl.this.withGithub(builder.build());
    }
    public N endGithub(){
            return and();
    }

}
    public class GitlabNestedImpl<N> extends WebHookTriggerFluentImpl<BuildTriggerPolicyFluent.GitlabNested<N>> implements BuildTriggerPolicyFluent.GitlabNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final WebHookTriggerBuilder builder;
    
            GitlabNestedImpl(WebHookTrigger item){
                    this.builder = new WebHookTriggerBuilder(this, item);
            }
            GitlabNestedImpl(){
                    this.builder = new WebHookTriggerBuilder(this);
            }
    
    public N and(){
            return (N) BuildTriggerPolicyFluentImpl.this.withGitlab(builder.build());
    }
    public N endGitlab(){
            return and();
    }

}
    public class ImageChangeNestedImpl<N> extends ImageChangeTriggerFluentImpl<BuildTriggerPolicyFluent.ImageChangeNested<N>> implements BuildTriggerPolicyFluent.ImageChangeNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageChangeTriggerBuilder builder;
    
            ImageChangeNestedImpl(ImageChangeTrigger item){
                    this.builder = new ImageChangeTriggerBuilder(this, item);
            }
            ImageChangeNestedImpl(){
                    this.builder = new ImageChangeTriggerBuilder(this);
            }
    
    public N and(){
            return (N) BuildTriggerPolicyFluentImpl.this.withImageChange(builder.build());
    }
    public N endImageChange(){
            return and();
    }

}


}
