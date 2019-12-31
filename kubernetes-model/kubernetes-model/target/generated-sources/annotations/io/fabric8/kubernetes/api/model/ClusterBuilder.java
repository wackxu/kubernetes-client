package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ClusterBuilder extends ClusterFluentImpl<ClusterBuilder> implements VisitableBuilder<Cluster,ClusterBuilder>{

    ClusterFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ClusterBuilder(){
            this(true);
    }
    public ClusterBuilder(Boolean validationEnabled){
            this(new Cluster(), validationEnabled);
    }
    public ClusterBuilder(ClusterFluent<?> fluent){
            this(fluent, true);
    }
    public ClusterBuilder(ClusterFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new Cluster(), validationEnabled);
    }
    public ClusterBuilder(ClusterFluent<?> fluent,Cluster instance){
            this(fluent, instance, true);
    }
    public ClusterBuilder(ClusterFluent<?> fluent,Cluster instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withCertificateAuthority(instance.getCertificateAuthority()); 
            fluent.withCertificateAuthorityData(instance.getCertificateAuthorityData()); 
            fluent.withExtensions(instance.getExtensions()); 
            fluent.withInsecureSkipTlsVerify(instance.getInsecureSkipTlsVerify()); 
            fluent.withServer(instance.getServer()); 
            this.validationEnabled = validationEnabled; 
    }
    public ClusterBuilder(Cluster instance){
            this(instance,true);
    }
    public ClusterBuilder(Cluster instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withCertificateAuthority(instance.getCertificateAuthority()); 
            this.withCertificateAuthorityData(instance.getCertificateAuthorityData()); 
            this.withExtensions(instance.getExtensions()); 
            this.withInsecureSkipTlsVerify(instance.getInsecureSkipTlsVerify()); 
            this.withServer(instance.getServer()); 
            this.validationEnabled = validationEnabled; 
    }
    public ClusterBuilder(Validator validator){
            this(new Cluster(), true);
    }
    public ClusterBuilder(ClusterFluent<?> fluent,Cluster instance,Validator validator){
            this.fluent = fluent; 
            fluent.withCertificateAuthority(instance.getCertificateAuthority()); 
            fluent.withCertificateAuthorityData(instance.getCertificateAuthorityData()); 
            fluent.withExtensions(instance.getExtensions()); 
            fluent.withInsecureSkipTlsVerify(instance.getInsecureSkipTlsVerify()); 
            fluent.withServer(instance.getServer()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ClusterBuilder(Cluster instance,Validator validator){
            this.fluent = this; 
            this.withCertificateAuthority(instance.getCertificateAuthority()); 
            this.withCertificateAuthorityData(instance.getCertificateAuthorityData()); 
            this.withExtensions(instance.getExtensions()); 
            this.withInsecureSkipTlsVerify(instance.getInsecureSkipTlsVerify()); 
            this.withServer(instance.getServer()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public Cluster build(){
            Cluster buildable = new Cluster(fluent.getCertificateAuthority(),fluent.getCertificateAuthorityData(),fluent.getExtensions(),fluent.isInsecureSkipTlsVerify(),fluent.getServer());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ClusterBuilder that = (ClusterBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
