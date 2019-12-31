package io.fabric8.kubernetes.api.model.certificates;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.model.ObjectMetaFluent;
import java.lang.Deprecated;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import javax.validation.Valid;
import java.lang.Object;
import java.util.Map;

public interface CertificateSigningRequestFluent<A extends CertificateSigningRequestFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public String getKind();
    public A withKind(String kind);
    public Boolean hasKind();
    
/**
 * This method has been deprecated, please use method buildMetadata instead.
 * @return The buildable object.
 */
@Deprecated public ObjectMeta getMetadata();
    public ObjectMeta buildMetadata();
    public A withMetadata(ObjectMeta metadata);
    public Boolean hasMetadata();
    public CertificateSigningRequestFluent.MetadataNested<A> withNewMetadata();
    public CertificateSigningRequestFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public CertificateSigningRequestFluent.MetadataNested<A> editMetadata();
    public CertificateSigningRequestFluent.MetadataNested<A> editOrNewMetadata();
    public CertificateSigningRequestFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public CertificateSigningRequestSpec getSpec();
    public CertificateSigningRequestSpec buildSpec();
    public A withSpec(CertificateSigningRequestSpec spec);
    public Boolean hasSpec();
    public CertificateSigningRequestFluent.SpecNested<A> withNewSpec();
    public CertificateSigningRequestFluent.SpecNested<A> withNewSpecLike(CertificateSigningRequestSpec item);
    public CertificateSigningRequestFluent.SpecNested<A> editSpec();
    public CertificateSigningRequestFluent.SpecNested<A> editOrNewSpec();
    public CertificateSigningRequestFluent.SpecNested<A> editOrNewSpecLike(CertificateSigningRequestSpec item);
    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public CertificateSigningRequestStatus getStatus();
    public CertificateSigningRequestStatus buildStatus();
    public A withStatus(CertificateSigningRequestStatus status);
    public Boolean hasStatus();
    public CertificateSigningRequestFluent.StatusNested<A> withNewStatus();
    public CertificateSigningRequestFluent.StatusNested<A> withNewStatusLike(CertificateSigningRequestStatus item);
    public CertificateSigningRequestFluent.StatusNested<A> editStatus();
    public CertificateSigningRequestFluent.StatusNested<A> editOrNewStatus();
    public CertificateSigningRequestFluent.StatusNested<A> editOrNewStatusLike(CertificateSigningRequestStatus item);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<CertificateSigningRequestFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface SpecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CertificateSigningRequestSpecFluent<CertificateSigningRequestFluent.SpecNested<N>>{

        
    public N and();    public N endSpec();
}
    public interface StatusNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CertificateSigningRequestStatusFluent<CertificateSigningRequestFluent.StatusNested<N>>{

        
    public N and();    public N endStatus();
}


}
