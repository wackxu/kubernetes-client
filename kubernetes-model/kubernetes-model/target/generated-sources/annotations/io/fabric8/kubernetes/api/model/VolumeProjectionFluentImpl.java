package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Boolean;
import javax.validation.Valid;
import java.lang.Long;
import java.lang.Object;

public class VolumeProjectionFluentImpl<A extends VolumeProjectionFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements VolumeProjectionFluent<A>{

    private ConfigMapProjectionBuilder configMap;
    private DownwardAPIProjectionBuilder downwardAPI;
    private SecretProjectionBuilder secret;
    private ServiceAccountTokenProjectionBuilder serviceAccountToken;

    public VolumeProjectionFluentImpl(){
    }
    public VolumeProjectionFluentImpl(VolumeProjection instance){
            this.withConfigMap(instance.getConfigMap()); 
            this.withDownwardAPI(instance.getDownwardAPI()); 
            this.withSecret(instance.getSecret()); 
            this.withServiceAccountToken(instance.getServiceAccountToken()); 
    }

    
/**
 * This method has been deprecated, please use method buildConfigMap instead.
 * @return The buildable object.
 */
@Deprecated public ConfigMapProjection getConfigMap(){
            return this.configMap!=null?this.configMap.build():null;
    }

    public ConfigMapProjection buildConfigMap(){
            return this.configMap!=null?this.configMap.build():null;
    }

    public A withConfigMap(ConfigMapProjection configMap){
            _visitables.remove(this.configMap);
            if (configMap!=null){ this.configMap= new ConfigMapProjectionBuilder(configMap); _visitables.add(this.configMap);} return (A) this;
    }

    public Boolean hasConfigMap(){
            return this.configMap != null;
    }

    public VolumeProjectionFluent.ConfigMapNested<A> withNewConfigMap(){
            return new ConfigMapNestedImpl();
    }

    public VolumeProjectionFluent.ConfigMapNested<A> withNewConfigMapLike(ConfigMapProjection item){
            return new ConfigMapNestedImpl(item);
    }

    public VolumeProjectionFluent.ConfigMapNested<A> editConfigMap(){
            return withNewConfigMapLike(getConfigMap());
    }

    public VolumeProjectionFluent.ConfigMapNested<A> editOrNewConfigMap(){
            return withNewConfigMapLike(getConfigMap() != null ? getConfigMap(): new ConfigMapProjectionBuilder().build());
    }

    public VolumeProjectionFluent.ConfigMapNested<A> editOrNewConfigMapLike(ConfigMapProjection item){
            return withNewConfigMapLike(getConfigMap() != null ? getConfigMap(): item);
    }

    
/**
 * This method has been deprecated, please use method buildDownwardAPI instead.
 * @return The buildable object.
 */
@Deprecated public DownwardAPIProjection getDownwardAPI(){
            return this.downwardAPI!=null?this.downwardAPI.build():null;
    }

    public DownwardAPIProjection buildDownwardAPI(){
            return this.downwardAPI!=null?this.downwardAPI.build():null;
    }

    public A withDownwardAPI(DownwardAPIProjection downwardAPI){
            _visitables.remove(this.downwardAPI);
            if (downwardAPI!=null){ this.downwardAPI= new DownwardAPIProjectionBuilder(downwardAPI); _visitables.add(this.downwardAPI);} return (A) this;
    }

    public Boolean hasDownwardAPI(){
            return this.downwardAPI != null;
    }

    public VolumeProjectionFluent.DownwardAPINested<A> withNewDownwardAPI(){
            return new DownwardAPINestedImpl();
    }

    public VolumeProjectionFluent.DownwardAPINested<A> withNewDownwardAPILike(DownwardAPIProjection item){
            return new DownwardAPINestedImpl(item);
    }

    public VolumeProjectionFluent.DownwardAPINested<A> editDownwardAPI(){
            return withNewDownwardAPILike(getDownwardAPI());
    }

    public VolumeProjectionFluent.DownwardAPINested<A> editOrNewDownwardAPI(){
            return withNewDownwardAPILike(getDownwardAPI() != null ? getDownwardAPI(): new DownwardAPIProjectionBuilder().build());
    }

    public VolumeProjectionFluent.DownwardAPINested<A> editOrNewDownwardAPILike(DownwardAPIProjection item){
            return withNewDownwardAPILike(getDownwardAPI() != null ? getDownwardAPI(): item);
    }

    
/**
 * This method has been deprecated, please use method buildSecret instead.
 * @return The buildable object.
 */
@Deprecated public SecretProjection getSecret(){
            return this.secret!=null?this.secret.build():null;
    }

    public SecretProjection buildSecret(){
            return this.secret!=null?this.secret.build():null;
    }

    public A withSecret(SecretProjection secret){
            _visitables.remove(this.secret);
            if (secret!=null){ this.secret= new SecretProjectionBuilder(secret); _visitables.add(this.secret);} return (A) this;
    }

    public Boolean hasSecret(){
            return this.secret != null;
    }

    public VolumeProjectionFluent.SecretNested<A> withNewSecret(){
            return new SecretNestedImpl();
    }

    public VolumeProjectionFluent.SecretNested<A> withNewSecretLike(SecretProjection item){
            return new SecretNestedImpl(item);
    }

    public VolumeProjectionFluent.SecretNested<A> editSecret(){
            return withNewSecretLike(getSecret());
    }

    public VolumeProjectionFluent.SecretNested<A> editOrNewSecret(){
            return withNewSecretLike(getSecret() != null ? getSecret(): new SecretProjectionBuilder().build());
    }

    public VolumeProjectionFluent.SecretNested<A> editOrNewSecretLike(SecretProjection item){
            return withNewSecretLike(getSecret() != null ? getSecret(): item);
    }

    
/**
 * This method has been deprecated, please use method buildServiceAccountToken instead.
 * @return The buildable object.
 */
@Deprecated public ServiceAccountTokenProjection getServiceAccountToken(){
            return this.serviceAccountToken!=null?this.serviceAccountToken.build():null;
    }

    public ServiceAccountTokenProjection buildServiceAccountToken(){
            return this.serviceAccountToken!=null?this.serviceAccountToken.build():null;
    }

    public A withServiceAccountToken(ServiceAccountTokenProjection serviceAccountToken){
            _visitables.remove(this.serviceAccountToken);
            if (serviceAccountToken!=null){ this.serviceAccountToken= new ServiceAccountTokenProjectionBuilder(serviceAccountToken); _visitables.add(this.serviceAccountToken);} return (A) this;
    }

    public Boolean hasServiceAccountToken(){
            return this.serviceAccountToken != null;
    }

    public A withNewServiceAccountToken(String audience,Long expirationSeconds,String path){
            return (A)withServiceAccountToken(new ServiceAccountTokenProjection(audience, expirationSeconds, path));
    }

    public VolumeProjectionFluent.ServiceAccountTokenNested<A> withNewServiceAccountToken(){
            return new ServiceAccountTokenNestedImpl();
    }

    public VolumeProjectionFluent.ServiceAccountTokenNested<A> withNewServiceAccountTokenLike(ServiceAccountTokenProjection item){
            return new ServiceAccountTokenNestedImpl(item);
    }

    public VolumeProjectionFluent.ServiceAccountTokenNested<A> editServiceAccountToken(){
            return withNewServiceAccountTokenLike(getServiceAccountToken());
    }

    public VolumeProjectionFluent.ServiceAccountTokenNested<A> editOrNewServiceAccountToken(){
            return withNewServiceAccountTokenLike(getServiceAccountToken() != null ? getServiceAccountToken(): new ServiceAccountTokenProjectionBuilder().build());
    }

    public VolumeProjectionFluent.ServiceAccountTokenNested<A> editOrNewServiceAccountTokenLike(ServiceAccountTokenProjection item){
            return withNewServiceAccountTokenLike(getServiceAccountToken() != null ? getServiceAccountToken(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            VolumeProjectionFluentImpl that = (VolumeProjectionFluentImpl) o;
            if (configMap != null ? !configMap.equals(that.configMap) :that.configMap != null) return false;
            if (downwardAPI != null ? !downwardAPI.equals(that.downwardAPI) :that.downwardAPI != null) return false;
            if (secret != null ? !secret.equals(that.secret) :that.secret != null) return false;
            if (serviceAccountToken != null ? !serviceAccountToken.equals(that.serviceAccountToken) :that.serviceAccountToken != null) return false;
            return true;
    }


    public class ConfigMapNestedImpl<N> extends ConfigMapProjectionFluentImpl<VolumeProjectionFluent.ConfigMapNested<N>> implements VolumeProjectionFluent.ConfigMapNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ConfigMapProjectionBuilder builder;
    
            ConfigMapNestedImpl(ConfigMapProjection item){
                    this.builder = new ConfigMapProjectionBuilder(this, item);
            }
            ConfigMapNestedImpl(){
                    this.builder = new ConfigMapProjectionBuilder(this);
            }
    
    public N and(){
            return (N) VolumeProjectionFluentImpl.this.withConfigMap(builder.build());
    }
    public N endConfigMap(){
            return and();
    }

}
    public class DownwardAPINestedImpl<N> extends DownwardAPIProjectionFluentImpl<VolumeProjectionFluent.DownwardAPINested<N>> implements VolumeProjectionFluent.DownwardAPINested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DownwardAPIProjectionBuilder builder;
    
            DownwardAPINestedImpl(DownwardAPIProjection item){
                    this.builder = new DownwardAPIProjectionBuilder(this, item);
            }
            DownwardAPINestedImpl(){
                    this.builder = new DownwardAPIProjectionBuilder(this);
            }
    
    public N and(){
            return (N) VolumeProjectionFluentImpl.this.withDownwardAPI(builder.build());
    }
    public N endDownwardAPI(){
            return and();
    }

}
    public class SecretNestedImpl<N> extends SecretProjectionFluentImpl<VolumeProjectionFluent.SecretNested<N>> implements VolumeProjectionFluent.SecretNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecretProjectionBuilder builder;
    
            SecretNestedImpl(SecretProjection item){
                    this.builder = new SecretProjectionBuilder(this, item);
            }
            SecretNestedImpl(){
                    this.builder = new SecretProjectionBuilder(this);
            }
    
    public N and(){
            return (N) VolumeProjectionFluentImpl.this.withSecret(builder.build());
    }
    public N endSecret(){
            return and();
    }

}
    public class ServiceAccountTokenNestedImpl<N> extends ServiceAccountTokenProjectionFluentImpl<VolumeProjectionFluent.ServiceAccountTokenNested<N>> implements VolumeProjectionFluent.ServiceAccountTokenNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ServiceAccountTokenProjectionBuilder builder;
    
            ServiceAccountTokenNestedImpl(ServiceAccountTokenProjection item){
                    this.builder = new ServiceAccountTokenProjectionBuilder(this, item);
            }
            ServiceAccountTokenNestedImpl(){
                    this.builder = new ServiceAccountTokenProjectionBuilder(this);
            }
    
    public N and(){
            return (N) VolumeProjectionFluentImpl.this.withServiceAccountToken(builder.build());
    }
    public N endServiceAccountToken(){
            return and();
    }

}


}
