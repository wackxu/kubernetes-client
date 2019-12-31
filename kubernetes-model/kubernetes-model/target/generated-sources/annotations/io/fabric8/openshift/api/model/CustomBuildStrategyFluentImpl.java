package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.model.EnvVarBuilder;
import io.fabric8.kubernetes.api.builder.Predicate;
import io.fabric8.kubernetes.api.model.ObjectReference;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import io.fabric8.kubernetes.api.model.LocalObjectReferenceFluentImpl;
import io.fabric8.kubernetes.api.model.EnvVar;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.ObjectReferenceFluentImpl;
import io.fabric8.kubernetes.api.model.LocalObjectReferenceBuilder;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.ObjectReferenceBuilder;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import java.util.Collection;
import io.fabric8.kubernetes.api.model.EnvVarFluentImpl;
import java.lang.Object;

public class CustomBuildStrategyFluentImpl<A extends CustomBuildStrategyFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements CustomBuildStrategyFluent<A>{

    private String buildAPIVersion;
    private List<EnvVarBuilder> env;
    private Boolean exposeDockerSocket;
    private Boolean forcePull;
    private ObjectReferenceBuilder from;
    private LocalObjectReferenceBuilder pullSecret;
    private List<SecretSpecBuilder> secrets;

    public CustomBuildStrategyFluentImpl(){
    }
    public CustomBuildStrategyFluentImpl(CustomBuildStrategy instance){
            this.withBuildAPIVersion(instance.getBuildAPIVersion()); 
            this.withEnv(instance.getEnv()); 
            this.withExposeDockerSocket(instance.getExposeDockerSocket()); 
            this.withForcePull(instance.getForcePull()); 
            this.withFrom(instance.getFrom()); 
            this.withPullSecret(instance.getPullSecret()); 
            this.withSecrets(instance.getSecrets()); 
    }

    public String getBuildAPIVersion(){
            return this.buildAPIVersion;
    }

    public A withBuildAPIVersion(String buildAPIVersion){
            this.buildAPIVersion=buildAPIVersion; return (A) this;
    }

    public Boolean hasBuildAPIVersion(){
            return this.buildAPIVersion != null;
    }

    public A addToEnv(int index,EnvVar item){
            if (this.env == null) {this.env = new ArrayList<EnvVarBuilder>();}
            EnvVarBuilder builder = new EnvVarBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.env.add(index >= 0 ? index : env.size(), builder); return (A)this;
    }

    public A setToEnv(int index,EnvVar item){
            if (this.env == null) {this.env = new ArrayList<EnvVarBuilder>();}
            EnvVarBuilder builder = new EnvVarBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= env.size()) { env.add(builder); } else { env.set(index, builder);}
             return (A)this;
    }

    public A addToEnv(EnvVar... items){
            if (this.env == null) {this.env = new ArrayList<EnvVarBuilder>();}
            for (EnvVar item : items) {EnvVarBuilder builder = new EnvVarBuilder(item);_visitables.add(builder);this.env.add(builder);} return (A)this;
    }

    public A addAllToEnv(Collection<EnvVar> items){
            if (this.env == null) {this.env = new ArrayList<EnvVarBuilder>();}
            for (EnvVar item : items) {EnvVarBuilder builder = new EnvVarBuilder(item);_visitables.add(builder);this.env.add(builder);} return (A)this;
    }

    public A removeFromEnv(EnvVar... items){
            for (EnvVar item : items) {EnvVarBuilder builder = new EnvVarBuilder(item);_visitables.remove(builder);if (this.env != null) {this.env.remove(builder);}} return (A)this;
    }

    public A removeAllFromEnv(Collection<EnvVar> items){
            for (EnvVar item : items) {EnvVarBuilder builder = new EnvVarBuilder(item);_visitables.remove(builder);if (this.env != null) {this.env.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildEnv instead.
 * @return The buildable object.
 */
@Deprecated public List<EnvVar> getEnv(){
            return build(env);
    }

    public List<EnvVar> buildEnv(){
            return build(env);
    }

    public EnvVar buildEnv(int index){
            return this.env.get(index).build();
    }

    public EnvVar buildFirstEnv(){
            return this.env.get(0).build();
    }

    public EnvVar buildLastEnv(){
            return this.env.get(env.size() - 1).build();
    }

    public EnvVar buildMatchingEnv(io.fabric8.kubernetes.api.builder.Predicate<EnvVarBuilder> predicate){
            for (EnvVarBuilder item: env) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withEnv(List<EnvVar> env){
            if (this.env != null) { _visitables.removeAll(this.env);}
            if (env != null) {this.env = new ArrayList<EnvVarBuilder>(); for (EnvVar item : env){this.addToEnv(item);}} else { this.env = new ArrayList<EnvVarBuilder>();} return (A) this;
    }

    public A withEnv(EnvVar... env){
            if (this.env != null) {this.env.clear();}
            if (env != null) {for (EnvVar item :env){ this.addToEnv(item);}} return (A) this;
    }

    public Boolean hasEnv(){
            return env != null && !env.isEmpty();
    }

    public CustomBuildStrategyFluent.EnvNested<A> addNewEnv(){
            return new EnvNestedImpl();
    }

    public CustomBuildStrategyFluent.EnvNested<A> addNewEnvLike(EnvVar item){
            return new EnvNestedImpl(-1, item);
    }

    public CustomBuildStrategyFluent.EnvNested<A> setNewEnvLike(int index,EnvVar item){
            return new EnvNestedImpl(index, item);
    }

    public CustomBuildStrategyFluent.EnvNested<A> editEnv(int index){
            if (env.size() <= index) throw new RuntimeException("Can't edit env. Index exceeds size.");
            return setNewEnvLike(index, buildEnv(index));
    }

    public CustomBuildStrategyFluent.EnvNested<A> editFirstEnv(){
            if (env.size() == 0) throw new RuntimeException("Can't edit first env. The list is empty.");
            return setNewEnvLike(0, buildEnv(0));
    }

    public CustomBuildStrategyFluent.EnvNested<A> editLastEnv(){
            int index = env.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last env. The list is empty.");
            return setNewEnvLike(index, buildEnv(index));
    }

    public CustomBuildStrategyFluent.EnvNested<A> editMatchingEnv(io.fabric8.kubernetes.api.builder.Predicate<EnvVarBuilder> predicate){
            int index = -1;
            for (int i=0;i<env.size();i++) { 
            if (predicate.apply(env.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching env. No match found.");
            return setNewEnvLike(index, buildEnv(index));
    }

    public Boolean isExposeDockerSocket(){
            return this.exposeDockerSocket;
    }

    public A withExposeDockerSocket(Boolean exposeDockerSocket){
            this.exposeDockerSocket=exposeDockerSocket; return (A) this;
    }

    public Boolean hasExposeDockerSocket(){
            return this.exposeDockerSocket != null;
    }

    public A withNewExposeDockerSocket(String arg1){
            return (A)withExposeDockerSocket(new Boolean(arg1));
    }

    public A withNewExposeDockerSocket(boolean arg1){
            return (A)withExposeDockerSocket(new Boolean(arg1));
    }

    public Boolean isForcePull(){
            return this.forcePull;
    }

    public A withForcePull(Boolean forcePull){
            this.forcePull=forcePull; return (A) this;
    }

    public Boolean hasForcePull(){
            return this.forcePull != null;
    }

    public A withNewForcePull(String arg1){
            return (A)withForcePull(new Boolean(arg1));
    }

    public A withNewForcePull(boolean arg1){
            return (A)withForcePull(new Boolean(arg1));
    }

    
/**
 * This method has been deprecated, please use method buildFrom instead.
 * @return The buildable object.
 */
@Deprecated public ObjectReference getFrom(){
            return this.from!=null?this.from.build():null;
    }

    public ObjectReference buildFrom(){
            return this.from!=null?this.from.build():null;
    }

    public A withFrom(ObjectReference from){
            _visitables.remove(this.from);
            if (from!=null){ this.from= new ObjectReferenceBuilder(from); _visitables.add(this.from);} return (A) this;
    }

    public Boolean hasFrom(){
            return this.from != null;
    }

    public CustomBuildStrategyFluent.FromNested<A> withNewFrom(){
            return new FromNestedImpl();
    }

    public CustomBuildStrategyFluent.FromNested<A> withNewFromLike(ObjectReference item){
            return new FromNestedImpl(item);
    }

    public CustomBuildStrategyFluent.FromNested<A> editFrom(){
            return withNewFromLike(getFrom());
    }

    public CustomBuildStrategyFluent.FromNested<A> editOrNewFrom(){
            return withNewFromLike(getFrom() != null ? getFrom(): new ObjectReferenceBuilder().build());
    }

    public CustomBuildStrategyFluent.FromNested<A> editOrNewFromLike(ObjectReference item){
            return withNewFromLike(getFrom() != null ? getFrom(): item);
    }

    
/**
 * This method has been deprecated, please use method buildPullSecret instead.
 * @return The buildable object.
 */
@Deprecated public LocalObjectReference getPullSecret(){
            return this.pullSecret!=null?this.pullSecret.build():null;
    }

    public LocalObjectReference buildPullSecret(){
            return this.pullSecret!=null?this.pullSecret.build():null;
    }

    public A withPullSecret(LocalObjectReference pullSecret){
            _visitables.remove(this.pullSecret);
            if (pullSecret!=null){ this.pullSecret= new LocalObjectReferenceBuilder(pullSecret); _visitables.add(this.pullSecret);} return (A) this;
    }

    public Boolean hasPullSecret(){
            return this.pullSecret != null;
    }

    public A withNewPullSecret(String name){
            return (A)withPullSecret(new LocalObjectReference(name));
    }

    public CustomBuildStrategyFluent.PullSecretNested<A> withNewPullSecret(){
            return new PullSecretNestedImpl();
    }

    public CustomBuildStrategyFluent.PullSecretNested<A> withNewPullSecretLike(LocalObjectReference item){
            return new PullSecretNestedImpl(item);
    }

    public CustomBuildStrategyFluent.PullSecretNested<A> editPullSecret(){
            return withNewPullSecretLike(getPullSecret());
    }

    public CustomBuildStrategyFluent.PullSecretNested<A> editOrNewPullSecret(){
            return withNewPullSecretLike(getPullSecret() != null ? getPullSecret(): new LocalObjectReferenceBuilder().build());
    }

    public CustomBuildStrategyFluent.PullSecretNested<A> editOrNewPullSecretLike(LocalObjectReference item){
            return withNewPullSecretLike(getPullSecret() != null ? getPullSecret(): item);
    }

    public A addToSecrets(int index,SecretSpec item){
            if (this.secrets == null) {this.secrets = new ArrayList<SecretSpecBuilder>();}
            SecretSpecBuilder builder = new SecretSpecBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.secrets.add(index >= 0 ? index : secrets.size(), builder); return (A)this;
    }

    public A setToSecrets(int index,SecretSpec item){
            if (this.secrets == null) {this.secrets = new ArrayList<SecretSpecBuilder>();}
            SecretSpecBuilder builder = new SecretSpecBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= secrets.size()) { secrets.add(builder); } else { secrets.set(index, builder);}
             return (A)this;
    }

    public A addToSecrets(SecretSpec... items){
            if (this.secrets == null) {this.secrets = new ArrayList<SecretSpecBuilder>();}
            for (SecretSpec item : items) {SecretSpecBuilder builder = new SecretSpecBuilder(item);_visitables.add(builder);this.secrets.add(builder);} return (A)this;
    }

    public A addAllToSecrets(Collection<SecretSpec> items){
            if (this.secrets == null) {this.secrets = new ArrayList<SecretSpecBuilder>();}
            for (SecretSpec item : items) {SecretSpecBuilder builder = new SecretSpecBuilder(item);_visitables.add(builder);this.secrets.add(builder);} return (A)this;
    }

    public A removeFromSecrets(SecretSpec... items){
            for (SecretSpec item : items) {SecretSpecBuilder builder = new SecretSpecBuilder(item);_visitables.remove(builder);if (this.secrets != null) {this.secrets.remove(builder);}} return (A)this;
    }

    public A removeAllFromSecrets(Collection<SecretSpec> items){
            for (SecretSpec item : items) {SecretSpecBuilder builder = new SecretSpecBuilder(item);_visitables.remove(builder);if (this.secrets != null) {this.secrets.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildSecrets instead.
 * @return The buildable object.
 */
@Deprecated public List<SecretSpec> getSecrets(){
            return build(secrets);
    }

    public List<SecretSpec> buildSecrets(){
            return build(secrets);
    }

    public SecretSpec buildSecret(int index){
            return this.secrets.get(index).build();
    }

    public SecretSpec buildFirstSecret(){
            return this.secrets.get(0).build();
    }

    public SecretSpec buildLastSecret(){
            return this.secrets.get(secrets.size() - 1).build();
    }

    public SecretSpec buildMatchingSecret(io.fabric8.kubernetes.api.builder.Predicate<SecretSpecBuilder> predicate){
            for (SecretSpecBuilder item: secrets) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withSecrets(List<SecretSpec> secrets){
            if (this.secrets != null) { _visitables.removeAll(this.secrets);}
            if (secrets != null) {this.secrets = new ArrayList<SecretSpecBuilder>(); for (SecretSpec item : secrets){this.addToSecrets(item);}} else { this.secrets = new ArrayList<SecretSpecBuilder>();} return (A) this;
    }

    public A withSecrets(SecretSpec... secrets){
            if (this.secrets != null) {this.secrets.clear();}
            if (secrets != null) {for (SecretSpec item :secrets){ this.addToSecrets(item);}} return (A) this;
    }

    public Boolean hasSecrets(){
            return secrets != null && !secrets.isEmpty();
    }

    public CustomBuildStrategyFluent.SecretsNested<A> addNewSecret(){
            return new SecretsNestedImpl();
    }

    public CustomBuildStrategyFluent.SecretsNested<A> addNewSecretLike(SecretSpec item){
            return new SecretsNestedImpl(-1, item);
    }

    public CustomBuildStrategyFluent.SecretsNested<A> setNewSecretLike(int index,SecretSpec item){
            return new SecretsNestedImpl(index, item);
    }

    public CustomBuildStrategyFluent.SecretsNested<A> editSecret(int index){
            if (secrets.size() <= index) throw new RuntimeException("Can't edit secrets. Index exceeds size.");
            return setNewSecretLike(index, buildSecret(index));
    }

    public CustomBuildStrategyFluent.SecretsNested<A> editFirstSecret(){
            if (secrets.size() == 0) throw new RuntimeException("Can't edit first secrets. The list is empty.");
            return setNewSecretLike(0, buildSecret(0));
    }

    public CustomBuildStrategyFluent.SecretsNested<A> editLastSecret(){
            int index = secrets.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last secrets. The list is empty.");
            return setNewSecretLike(index, buildSecret(index));
    }

    public CustomBuildStrategyFluent.SecretsNested<A> editMatchingSecret(io.fabric8.kubernetes.api.builder.Predicate<SecretSpecBuilder> predicate){
            int index = -1;
            for (int i=0;i<secrets.size();i++) { 
            if (predicate.apply(secrets.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching secrets. No match found.");
            return setNewSecretLike(index, buildSecret(index));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CustomBuildStrategyFluentImpl that = (CustomBuildStrategyFluentImpl) o;
            if (buildAPIVersion != null ? !buildAPIVersion.equals(that.buildAPIVersion) :that.buildAPIVersion != null) return false;
            if (env != null ? !env.equals(that.env) :that.env != null) return false;
            if (exposeDockerSocket != null ? !exposeDockerSocket.equals(that.exposeDockerSocket) :that.exposeDockerSocket != null) return false;
            if (forcePull != null ? !forcePull.equals(that.forcePull) :that.forcePull != null) return false;
            if (from != null ? !from.equals(that.from) :that.from != null) return false;
            if (pullSecret != null ? !pullSecret.equals(that.pullSecret) :that.pullSecret != null) return false;
            if (secrets != null ? !secrets.equals(that.secrets) :that.secrets != null) return false;
            return true;
    }


    public class EnvNestedImpl<N> extends EnvVarFluentImpl<CustomBuildStrategyFluent.EnvNested<N>> implements CustomBuildStrategyFluent.EnvNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EnvVarBuilder builder;
        private final int index;
    
            EnvNestedImpl(int index,EnvVar item){
                    this.index = index;
                    this.builder = new EnvVarBuilder(this, item);
            }
            EnvNestedImpl(){
                    this.index = -1;
                    this.builder = new EnvVarBuilder(this);
            }
    
    public N and(){
            return (N) CustomBuildStrategyFluentImpl.this.setToEnv(index, builder.build());
    }
    public N endEnv(){
            return and();
    }

}
    public class FromNestedImpl<N> extends ObjectReferenceFluentImpl<CustomBuildStrategyFluent.FromNested<N>> implements CustomBuildStrategyFluent.FromNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectReferenceBuilder builder;
    
            FromNestedImpl(ObjectReference item){
                    this.builder = new ObjectReferenceBuilder(this, item);
            }
            FromNestedImpl(){
                    this.builder = new ObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) CustomBuildStrategyFluentImpl.this.withFrom(builder.build());
    }
    public N endFrom(){
            return and();
    }

}
    public class PullSecretNestedImpl<N> extends LocalObjectReferenceFluentImpl<CustomBuildStrategyFluent.PullSecretNested<N>> implements CustomBuildStrategyFluent.PullSecretNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LocalObjectReferenceBuilder builder;
    
            PullSecretNestedImpl(LocalObjectReference item){
                    this.builder = new LocalObjectReferenceBuilder(this, item);
            }
            PullSecretNestedImpl(){
                    this.builder = new LocalObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) CustomBuildStrategyFluentImpl.this.withPullSecret(builder.build());
    }
    public N endPullSecret(){
            return and();
    }

}
    public class SecretsNestedImpl<N> extends SecretSpecFluentImpl<CustomBuildStrategyFluent.SecretsNested<N>> implements CustomBuildStrategyFluent.SecretsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecretSpecBuilder builder;
        private final int index;
    
            SecretsNestedImpl(int index,SecretSpec item){
                    this.index = index;
                    this.builder = new SecretSpecBuilder(this, item);
            }
            SecretsNestedImpl(){
                    this.index = -1;
                    this.builder = new SecretSpecBuilder(this);
            }
    
    public N and(){
            return (N) CustomBuildStrategyFluentImpl.this.setToSecrets(index, builder.build());
    }
    public N endSecret(){
            return and();
    }

}


}
