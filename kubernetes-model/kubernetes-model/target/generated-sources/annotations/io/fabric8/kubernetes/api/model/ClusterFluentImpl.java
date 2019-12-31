package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class ClusterFluentImpl<A extends ClusterFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ClusterFluent<A>{

    private String certificateAuthority;
    private String certificateAuthorityData;
    private List<NamedExtensionBuilder> extensions;
    private Boolean insecureSkipTlsVerify;
    private String server;

    public ClusterFluentImpl(){
    }
    public ClusterFluentImpl(Cluster instance){
            this.withCertificateAuthority(instance.getCertificateAuthority()); 
            this.withCertificateAuthorityData(instance.getCertificateAuthorityData()); 
            this.withExtensions(instance.getExtensions()); 
            this.withInsecureSkipTlsVerify(instance.getInsecureSkipTlsVerify()); 
            this.withServer(instance.getServer()); 
    }

    public String getCertificateAuthority(){
            return this.certificateAuthority;
    }

    public A withCertificateAuthority(String certificateAuthority){
            this.certificateAuthority=certificateAuthority; return (A) this;
    }

    public Boolean hasCertificateAuthority(){
            return this.certificateAuthority != null;
    }

    public String getCertificateAuthorityData(){
            return this.certificateAuthorityData;
    }

    public A withCertificateAuthorityData(String certificateAuthorityData){
            this.certificateAuthorityData=certificateAuthorityData; return (A) this;
    }

    public Boolean hasCertificateAuthorityData(){
            return this.certificateAuthorityData != null;
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

    public ClusterFluent.ExtensionsNested<A> addNewExtension(){
            return new ExtensionsNestedImpl();
    }

    public ClusterFluent.ExtensionsNested<A> addNewExtensionLike(NamedExtension item){
            return new ExtensionsNestedImpl(-1, item);
    }

    public ClusterFluent.ExtensionsNested<A> setNewExtensionLike(int index,NamedExtension item){
            return new ExtensionsNestedImpl(index, item);
    }

    public ClusterFluent.ExtensionsNested<A> editExtension(int index){
            if (extensions.size() <= index) throw new RuntimeException("Can't edit extensions. Index exceeds size.");
            return setNewExtensionLike(index, buildExtension(index));
    }

    public ClusterFluent.ExtensionsNested<A> editFirstExtension(){
            if (extensions.size() == 0) throw new RuntimeException("Can't edit first extensions. The list is empty.");
            return setNewExtensionLike(0, buildExtension(0));
    }

    public ClusterFluent.ExtensionsNested<A> editLastExtension(){
            int index = extensions.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last extensions. The list is empty.");
            return setNewExtensionLike(index, buildExtension(index));
    }

    public ClusterFluent.ExtensionsNested<A> editMatchingExtension(io.fabric8.kubernetes.api.builder.Predicate<NamedExtensionBuilder> predicate){
            int index = -1;
            for (int i=0;i<extensions.size();i++) { 
            if (predicate.apply(extensions.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching extensions. No match found.");
            return setNewExtensionLike(index, buildExtension(index));
    }

    public Boolean isInsecureSkipTlsVerify(){
            return this.insecureSkipTlsVerify;
    }

    public A withInsecureSkipTlsVerify(Boolean insecureSkipTlsVerify){
            this.insecureSkipTlsVerify=insecureSkipTlsVerify; return (A) this;
    }

    public Boolean hasInsecureSkipTlsVerify(){
            return this.insecureSkipTlsVerify != null;
    }

    public A withNewInsecureSkipTlsVerify(String arg1){
            return (A)withInsecureSkipTlsVerify(new Boolean(arg1));
    }

    public A withNewInsecureSkipTlsVerify(boolean arg1){
            return (A)withInsecureSkipTlsVerify(new Boolean(arg1));
    }

    public String getServer(){
            return this.server;
    }

    public A withServer(String server){
            this.server=server; return (A) this;
    }

    public Boolean hasServer(){
            return this.server != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ClusterFluentImpl that = (ClusterFluentImpl) o;
            if (certificateAuthority != null ? !certificateAuthority.equals(that.certificateAuthority) :that.certificateAuthority != null) return false;
            if (certificateAuthorityData != null ? !certificateAuthorityData.equals(that.certificateAuthorityData) :that.certificateAuthorityData != null) return false;
            if (extensions != null ? !extensions.equals(that.extensions) :that.extensions != null) return false;
            if (insecureSkipTlsVerify != null ? !insecureSkipTlsVerify.equals(that.insecureSkipTlsVerify) :that.insecureSkipTlsVerify != null) return false;
            if (server != null ? !server.equals(that.server) :that.server != null) return false;
            return true;
    }


    public class ExtensionsNestedImpl<N> extends NamedExtensionFluentImpl<ClusterFluent.ExtensionsNested<N>> implements ClusterFluent.ExtensionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

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
            return (N) ClusterFluentImpl.this.setToExtensions(index, builder.build());
    }
    public N endExtension(){
            return and();
    }

}


}
