package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.util.LinkedHashMap;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public class AuthInfoFluentImpl<A extends AuthInfoFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements AuthInfoFluent<A>{

    private String as;
    private List<String> asGroups;
    private Map<String,ArrayList<String>> asUserExtra;
    private AuthProviderConfigBuilder authProvider;
    private String clientCertificate;
    private String clientCertificateData;
    private String clientKey;
    private String clientKeyData;
    private ExecConfigBuilder exec;
    private List<NamedExtensionBuilder> extensions;
    private String password;
    private String token;
    private String tokenFile;
    private String username;

    public AuthInfoFluentImpl(){
    }
    public AuthInfoFluentImpl(AuthInfo instance){
            this.withAs(instance.getAs()); 
            this.withAsGroups(instance.getAsGroups()); 
            this.withAsUserExtra(instance.getAsUserExtra()); 
            this.withAuthProvider(instance.getAuthProvider()); 
            this.withClientCertificate(instance.getClientCertificate()); 
            this.withClientCertificateData(instance.getClientCertificateData()); 
            this.withClientKey(instance.getClientKey()); 
            this.withClientKeyData(instance.getClientKeyData()); 
            this.withExec(instance.getExec()); 
            this.withExtensions(instance.getExtensions()); 
            this.withPassword(instance.getPassword()); 
            this.withToken(instance.getToken()); 
            this.withTokenFile(instance.getTokenFile()); 
            this.withUsername(instance.getUsername()); 
    }

    public String getAs(){
            return this.as;
    }

    public A withAs(String as){
            this.as=as; return (A) this;
    }

    public Boolean hasAs(){
            return this.as != null;
    }

    public A addToAsGroups(int index,String item){
            if (this.asGroups == null) {this.asGroups = new ArrayList<String>();}
            this.asGroups.add(index, item);
            return (A)this;
    }

    public A setToAsGroups(int index,String item){
            if (this.asGroups == null) {this.asGroups = new ArrayList<String>();}
            this.asGroups.set(index, item); return (A)this;
    }

    public A addToAsGroups(String... items){
            if (this.asGroups == null) {this.asGroups = new ArrayList<String>();}
            for (String item : items) {this.asGroups.add(item);} return (A)this;
    }

    public A addAllToAsGroups(Collection<String> items){
            if (this.asGroups == null) {this.asGroups = new ArrayList<String>();}
            for (String item : items) {this.asGroups.add(item);} return (A)this;
    }

    public A removeFromAsGroups(String... items){
            for (String item : items) {if (this.asGroups!= null){ this.asGroups.remove(item);}} return (A)this;
    }

    public A removeAllFromAsGroups(Collection<String> items){
            for (String item : items) {if (this.asGroups!= null){ this.asGroups.remove(item);}} return (A)this;
    }

    public List<String> getAsGroups(){
            return this.asGroups;
    }

    public String getAsGroup(int index){
            return this.asGroups.get(index);
    }

    public String getFirstAsGroup(){
            return this.asGroups.get(0);
    }

    public String getLastAsGroup(){
            return this.asGroups.get(asGroups.size() - 1);
    }

    public String getMatchingAsGroup(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: asGroups) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withAsGroups(List<String> asGroups){
            if (this.asGroups != null) { _visitables.removeAll(this.asGroups);}
            if (asGroups != null) {this.asGroups = new ArrayList<String>(); for (String item : asGroups){this.addToAsGroups(item);}} else { this.asGroups = new ArrayList<String>();} return (A) this;
    }

    public A withAsGroups(String... asGroups){
            if (this.asGroups != null) {this.asGroups.clear();}
            if (asGroups != null) {for (String item :asGroups){ this.addToAsGroups(item);}} return (A) this;
    }

    public Boolean hasAsGroups(){
            return asGroups != null && !asGroups.isEmpty();
    }

    public A addToAsUserExtra(String key,ArrayList<String> value){
            if(this.asUserExtra == null && key != null && value != null) { this.asUserExtra = new LinkedHashMap<String,ArrayList<String>>(); }
            if(key != null && value != null) {this.asUserExtra.put(key, value);} return (A)this;
    }

    public A addToAsUserExtra(Map<String,ArrayList<String>> map){
            if(this.asUserExtra == null && map != null) { this.asUserExtra = new LinkedHashMap<String,ArrayList<String>>(); }
            if(map != null) { this.asUserExtra.putAll(map);} return (A)this;
    }

    public A removeFromAsUserExtra(String key){
            if(this.asUserExtra == null) { return (A) this; }
            if(key != null && this.asUserExtra != null) {this.asUserExtra.remove(key);} return (A)this;
    }

    public A removeFromAsUserExtra(Map<String,ArrayList<String>> map){
            if(this.asUserExtra == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.asUserExtra != null){this.asUserExtra.remove(key);}}} return (A)this;
    }

    public Map<String,ArrayList<String>> getAsUserExtra(){
            return this.asUserExtra;
    }

    public A withAsUserExtra(Map<String,ArrayList<String>> asUserExtra){
            if (asUserExtra == null) { this.asUserExtra =  new LinkedHashMap<String,ArrayList<String>>();} else {this.asUserExtra = new LinkedHashMap<String,ArrayList<String>>(asUserExtra);} return (A) this;
    }

    public Boolean hasAsUserExtra(){
            return this.asUserExtra != null;
    }

    
/**
 * This method has been deprecated, please use method buildAuthProvider instead.
 * @return The buildable object.
 */
@Deprecated public AuthProviderConfig getAuthProvider(){
            return this.authProvider!=null?this.authProvider.build():null;
    }

    public AuthProviderConfig buildAuthProvider(){
            return this.authProvider!=null?this.authProvider.build():null;
    }

    public A withAuthProvider(AuthProviderConfig authProvider){
            _visitables.remove(this.authProvider);
            if (authProvider!=null){ this.authProvider= new AuthProviderConfigBuilder(authProvider); _visitables.add(this.authProvider);} return (A) this;
    }

    public Boolean hasAuthProvider(){
            return this.authProvider != null;
    }

    public AuthInfoFluent.AuthProviderNested<A> withNewAuthProvider(){
            return new AuthProviderNestedImpl();
    }

    public AuthInfoFluent.AuthProviderNested<A> withNewAuthProviderLike(AuthProviderConfig item){
            return new AuthProviderNestedImpl(item);
    }

    public AuthInfoFluent.AuthProviderNested<A> editAuthProvider(){
            return withNewAuthProviderLike(getAuthProvider());
    }

    public AuthInfoFluent.AuthProviderNested<A> editOrNewAuthProvider(){
            return withNewAuthProviderLike(getAuthProvider() != null ? getAuthProvider(): new AuthProviderConfigBuilder().build());
    }

    public AuthInfoFluent.AuthProviderNested<A> editOrNewAuthProviderLike(AuthProviderConfig item){
            return withNewAuthProviderLike(getAuthProvider() != null ? getAuthProvider(): item);
    }

    public String getClientCertificate(){
            return this.clientCertificate;
    }

    public A withClientCertificate(String clientCertificate){
            this.clientCertificate=clientCertificate; return (A) this;
    }

    public Boolean hasClientCertificate(){
            return this.clientCertificate != null;
    }

    public String getClientCertificateData(){
            return this.clientCertificateData;
    }

    public A withClientCertificateData(String clientCertificateData){
            this.clientCertificateData=clientCertificateData; return (A) this;
    }

    public Boolean hasClientCertificateData(){
            return this.clientCertificateData != null;
    }

    public String getClientKey(){
            return this.clientKey;
    }

    public A withClientKey(String clientKey){
            this.clientKey=clientKey; return (A) this;
    }

    public Boolean hasClientKey(){
            return this.clientKey != null;
    }

    public String getClientKeyData(){
            return this.clientKeyData;
    }

    public A withClientKeyData(String clientKeyData){
            this.clientKeyData=clientKeyData; return (A) this;
    }

    public Boolean hasClientKeyData(){
            return this.clientKeyData != null;
    }

    
/**
 * This method has been deprecated, please use method buildExec instead.
 * @return The buildable object.
 */
@Deprecated public ExecConfig getExec(){
            return this.exec!=null?this.exec.build():null;
    }

    public ExecConfig buildExec(){
            return this.exec!=null?this.exec.build():null;
    }

    public A withExec(ExecConfig exec){
            _visitables.remove(this.exec);
            if (exec!=null){ this.exec= new ExecConfigBuilder(exec); _visitables.add(this.exec);} return (A) this;
    }

    public Boolean hasExec(){
            return this.exec != null;
    }

    public AuthInfoFluent.ExecNested<A> withNewExec(){
            return new ExecNestedImpl();
    }

    public AuthInfoFluent.ExecNested<A> withNewExecLike(ExecConfig item){
            return new ExecNestedImpl(item);
    }

    public AuthInfoFluent.ExecNested<A> editExec(){
            return withNewExecLike(getExec());
    }

    public AuthInfoFluent.ExecNested<A> editOrNewExec(){
            return withNewExecLike(getExec() != null ? getExec(): new ExecConfigBuilder().build());
    }

    public AuthInfoFluent.ExecNested<A> editOrNewExecLike(ExecConfig item){
            return withNewExecLike(getExec() != null ? getExec(): item);
    }

    public A addToExtensions(int index,NamedExtension item){
            if (this.extensions == null) {this.extensions = new ArrayList<NamedExtensionBuilder>();}
            NamedExtensionBuilder builder = new NamedExtensionBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.extensions.add(index >= 0 ? index : extensions.size(), builder); return (A)this;
    }

    public A setToExtensions(int index,NamedExtension item){
            if (this.extensions == null) {this.extensions = new ArrayList<NamedExtensionBuilder>();}
            NamedExtensionBuilder builder = new NamedExtensionBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= extensions.size()) { extensions.add(builder); } else { extensions.set(index, builder);}
             return (A)this;
    }

    public A addToExtensions(NamedExtension... items){
            if (this.extensions == null) {this.extensions = new ArrayList<NamedExtensionBuilder>();}
            for (NamedExtension item : items) {NamedExtensionBuilder builder = new NamedExtensionBuilder(item);_visitables.add(builder);this.extensions.add(builder);} return (A)this;
    }

    public A addAllToExtensions(Collection<NamedExtension> items){
            if (this.extensions == null) {this.extensions = new ArrayList<NamedExtensionBuilder>();}
            for (NamedExtension item : items) {NamedExtensionBuilder builder = new NamedExtensionBuilder(item);_visitables.add(builder);this.extensions.add(builder);} return (A)this;
    }

    public A removeFromExtensions(NamedExtension... items){
            for (NamedExtension item : items) {NamedExtensionBuilder builder = new NamedExtensionBuilder(item);_visitables.remove(builder);if (this.extensions != null) {this.extensions.remove(builder);}} return (A)this;
    }

    public A removeAllFromExtensions(Collection<NamedExtension> items){
            for (NamedExtension item : items) {NamedExtensionBuilder builder = new NamedExtensionBuilder(item);_visitables.remove(builder);if (this.extensions != null) {this.extensions.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildExtensions instead.
 * @return The buildable object.
 */
@Deprecated public List<NamedExtension> getExtensions(){
            return build(extensions);
    }

    public List<NamedExtension> buildExtensions(){
            return build(extensions);
    }

    public NamedExtension buildExtension(int index){
            return this.extensions.get(index).build();
    }

    public NamedExtension buildFirstExtension(){
            return this.extensions.get(0).build();
    }

    public NamedExtension buildLastExtension(){
            return this.extensions.get(extensions.size() - 1).build();
    }

    public NamedExtension buildMatchingExtension(io.fabric8.kubernetes.api.builder.Predicate<NamedExtensionBuilder> predicate){
            for (NamedExtensionBuilder item: extensions) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withExtensions(List<NamedExtension> extensions){
            if (this.extensions != null) { _visitables.removeAll(this.extensions);}
            if (extensions != null) {this.extensions = new ArrayList<NamedExtensionBuilder>(); for (NamedExtension item : extensions){this.addToExtensions(item);}} else { this.extensions = new ArrayList<NamedExtensionBuilder>();} return (A) this;
    }

    public A withExtensions(NamedExtension... extensions){
            if (this.extensions != null) {this.extensions.clear();}
            if (extensions != null) {for (NamedExtension item :extensions){ this.addToExtensions(item);}} return (A) this;
    }

    public Boolean hasExtensions(){
            return extensions != null && !extensions.isEmpty();
    }

    public AuthInfoFluent.ExtensionsNested<A> addNewExtension(){
            return new ExtensionsNestedImpl();
    }

    public AuthInfoFluent.ExtensionsNested<A> addNewExtensionLike(NamedExtension item){
            return new ExtensionsNestedImpl(-1, item);
    }

    public AuthInfoFluent.ExtensionsNested<A> setNewExtensionLike(int index,NamedExtension item){
            return new ExtensionsNestedImpl(index, item);
    }

    public AuthInfoFluent.ExtensionsNested<A> editExtension(int index){
            if (extensions.size() <= index) throw new RuntimeException("Can't edit extensions. Index exceeds size.");
            return setNewExtensionLike(index, buildExtension(index));
    }

    public AuthInfoFluent.ExtensionsNested<A> editFirstExtension(){
            if (extensions.size() == 0) throw new RuntimeException("Can't edit first extensions. The list is empty.");
            return setNewExtensionLike(0, buildExtension(0));
    }

    public AuthInfoFluent.ExtensionsNested<A> editLastExtension(){
            int index = extensions.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last extensions. The list is empty.");
            return setNewExtensionLike(index, buildExtension(index));
    }

    public AuthInfoFluent.ExtensionsNested<A> editMatchingExtension(io.fabric8.kubernetes.api.builder.Predicate<NamedExtensionBuilder> predicate){
            int index = -1;
            for (int i=0;i<extensions.size();i++) { 
            if (predicate.apply(extensions.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching extensions. No match found.");
            return setNewExtensionLike(index, buildExtension(index));
    }

    public String getPassword(){
            return this.password;
    }

    public A withPassword(String password){
            this.password=password; return (A) this;
    }

    public Boolean hasPassword(){
            return this.password != null;
    }

    public String getToken(){
            return this.token;
    }

    public A withToken(String token){
            this.token=token; return (A) this;
    }

    public Boolean hasToken(){
            return this.token != null;
    }

    public String getTokenFile(){
            return this.tokenFile;
    }

    public A withTokenFile(String tokenFile){
            this.tokenFile=tokenFile; return (A) this;
    }

    public Boolean hasTokenFile(){
            return this.tokenFile != null;
    }

    public String getUsername(){
            return this.username;
    }

    public A withUsername(String username){
            this.username=username; return (A) this;
    }

    public Boolean hasUsername(){
            return this.username != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            AuthInfoFluentImpl that = (AuthInfoFluentImpl) o;
            if (as != null ? !as.equals(that.as) :that.as != null) return false;
            if (asGroups != null ? !asGroups.equals(that.asGroups) :that.asGroups != null) return false;
            if (asUserExtra != null ? !asUserExtra.equals(that.asUserExtra) :that.asUserExtra != null) return false;
            if (authProvider != null ? !authProvider.equals(that.authProvider) :that.authProvider != null) return false;
            if (clientCertificate != null ? !clientCertificate.equals(that.clientCertificate) :that.clientCertificate != null) return false;
            if (clientCertificateData != null ? !clientCertificateData.equals(that.clientCertificateData) :that.clientCertificateData != null) return false;
            if (clientKey != null ? !clientKey.equals(that.clientKey) :that.clientKey != null) return false;
            if (clientKeyData != null ? !clientKeyData.equals(that.clientKeyData) :that.clientKeyData != null) return false;
            if (exec != null ? !exec.equals(that.exec) :that.exec != null) return false;
            if (extensions != null ? !extensions.equals(that.extensions) :that.extensions != null) return false;
            if (password != null ? !password.equals(that.password) :that.password != null) return false;
            if (token != null ? !token.equals(that.token) :that.token != null) return false;
            if (tokenFile != null ? !tokenFile.equals(that.tokenFile) :that.tokenFile != null) return false;
            if (username != null ? !username.equals(that.username) :that.username != null) return false;
            return true;
    }


    public class AuthProviderNestedImpl<N> extends AuthProviderConfigFluentImpl<AuthInfoFluent.AuthProviderNested<N>> implements AuthInfoFluent.AuthProviderNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final AuthProviderConfigBuilder builder;
    
            AuthProviderNestedImpl(AuthProviderConfig item){
                    this.builder = new AuthProviderConfigBuilder(this, item);
            }
            AuthProviderNestedImpl(){
                    this.builder = new AuthProviderConfigBuilder(this);
            }
    
    public N and(){
            return (N) AuthInfoFluentImpl.this.withAuthProvider(builder.build());
    }
    public N endAuthProvider(){
            return and();
    }

}
    public class ExecNestedImpl<N> extends ExecConfigFluentImpl<AuthInfoFluent.ExecNested<N>> implements AuthInfoFluent.ExecNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ExecConfigBuilder builder;
    
            ExecNestedImpl(ExecConfig item){
                    this.builder = new ExecConfigBuilder(this, item);
            }
            ExecNestedImpl(){
                    this.builder = new ExecConfigBuilder(this);
            }
    
    public N and(){
            return (N) AuthInfoFluentImpl.this.withExec(builder.build());
    }
    public N endExec(){
            return and();
    }

}
    public class ExtensionsNestedImpl<N> extends NamedExtensionFluentImpl<AuthInfoFluent.ExtensionsNested<N>> implements AuthInfoFluent.ExtensionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NamedExtensionBuilder builder;
        private final int index;
    
            ExtensionsNestedImpl(int index,NamedExtension item){
                    this.index = index;
                    this.builder = new NamedExtensionBuilder(this, item);
            }
            ExtensionsNestedImpl(){
                    this.index = -1;
                    this.builder = new NamedExtensionBuilder(this);
            }
    
    public N and(){
            return (N) AuthInfoFluentImpl.this.setToExtensions(index, builder.build());
    }
    public N endExtension(){
            return and();
    }

}


}
