package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class TLSConfigBuilder extends TLSConfigFluentImpl<TLSConfigBuilder> implements VisitableBuilder<TLSConfig,TLSConfigBuilder>{

    TLSConfigFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public TLSConfigBuilder(){
            this(true);
    }
    public TLSConfigBuilder(Boolean validationEnabled){
            this(new TLSConfig(), validationEnabled);
    }
    public TLSConfigBuilder(TLSConfigFluent<?> fluent){
            this(fluent, true);
    }
    public TLSConfigBuilder(TLSConfigFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new TLSConfig(), validationEnabled);
    }
    public TLSConfigBuilder(TLSConfigFluent<?> fluent,TLSConfig instance){
            this(fluent, instance, true);
    }
    public TLSConfigBuilder(TLSConfigFluent<?> fluent,TLSConfig instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withCaCertificate(instance.getCaCertificate()); 
            fluent.withCertificate(instance.getCertificate()); 
            fluent.withDestinationCACertificate(instance.getDestinationCACertificate()); 
            fluent.withInsecureEdgeTerminationPolicy(instance.getInsecureEdgeTerminationPolicy()); 
            fluent.withKey(instance.getKey()); 
            fluent.withTermination(instance.getTermination()); 
            this.validationEnabled = validationEnabled; 
    }
    public TLSConfigBuilder(TLSConfig instance){
            this(instance,true);
    }
    public TLSConfigBuilder(TLSConfig instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withCaCertificate(instance.getCaCertificate()); 
            this.withCertificate(instance.getCertificate()); 
            this.withDestinationCACertificate(instance.getDestinationCACertificate()); 
            this.withInsecureEdgeTerminationPolicy(instance.getInsecureEdgeTerminationPolicy()); 
            this.withKey(instance.getKey()); 
            this.withTermination(instance.getTermination()); 
            this.validationEnabled = validationEnabled; 
    }
    public TLSConfigBuilder(Validator validator){
            this(new TLSConfig(), true);
    }
    public TLSConfigBuilder(TLSConfigFluent<?> fluent,TLSConfig instance,Validator validator){
            this.fluent = fluent; 
            fluent.withCaCertificate(instance.getCaCertificate()); 
            fluent.withCertificate(instance.getCertificate()); 
            fluent.withDestinationCACertificate(instance.getDestinationCACertificate()); 
            fluent.withInsecureEdgeTerminationPolicy(instance.getInsecureEdgeTerminationPolicy()); 
            fluent.withKey(instance.getKey()); 
            fluent.withTermination(instance.getTermination()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public TLSConfigBuilder(TLSConfig instance,Validator validator){
            this.fluent = this; 
            this.withCaCertificate(instance.getCaCertificate()); 
            this.withCertificate(instance.getCertificate()); 
            this.withDestinationCACertificate(instance.getDestinationCACertificate()); 
            this.withInsecureEdgeTerminationPolicy(instance.getInsecureEdgeTerminationPolicy()); 
            this.withKey(instance.getKey()); 
            this.withTermination(instance.getTermination()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public TLSConfig build(){
            TLSConfig buildable = new TLSConfig(fluent.getCaCertificate(),fluent.getCertificate(),fluent.getDestinationCACertificate(),fluent.getInsecureEdgeTerminationPolicy(),fluent.getKey(),fluent.getTermination());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            TLSConfigBuilder that = (TLSConfigBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
