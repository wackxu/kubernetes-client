package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class AuthInfoBuilder extends AuthInfoFluentImpl<AuthInfoBuilder> implements VisitableBuilder<AuthInfo,AuthInfoBuilder>{

    AuthInfoFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public AuthInfoBuilder(){
            this(true);
    }
    public AuthInfoBuilder(Boolean validationEnabled){
            this(new AuthInfo(), validationEnabled);
    }
    public AuthInfoBuilder(AuthInfoFluent<?> fluent){
            this(fluent, true);
    }
    public AuthInfoBuilder(AuthInfoFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new AuthInfo(), validationEnabled);
    }
    public AuthInfoBuilder(AuthInfoFluent<?> fluent,AuthInfo instance){
            this(fluent, instance, true);
    }
    public AuthInfoBuilder(AuthInfoFluent<?> fluent,AuthInfo instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withAs(instance.getAs()); 
            fluent.withAsGroups(instance.getAsGroups()); 
            fluent.withAsUserExtra(instance.getAsUserExtra()); 
            fluent.withAuthProvider(instance.getAuthProvider()); 
            fluent.withClientCertificate(instance.getClientCertificate()); 
            fluent.withClientCertificateData(instance.getClientCertificateData()); 
            fluent.withClientKey(instance.getClientKey()); 
            fluent.withClientKeyData(instance.getClientKeyData()); 
            fluent.withExec(instance.getExec()); 
            fluent.withExtensions(instance.getExtensions()); 
            fluent.withPassword(instance.getPassword()); 
            fluent.withToken(instance.getToken()); 
            fluent.withTokenFile(instance.getTokenFile()); 
            fluent.withUsername(instance.getUsername()); 
            this.validationEnabled = validationEnabled; 
    }
    public AuthInfoBuilder(AuthInfo instance){
            this(instance,true);
    }
    public AuthInfoBuilder(AuthInfo instance,Boolean validationEnabled){
            this.fluent = this; 
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
            this.validationEnabled = validationEnabled; 
    }
    public AuthInfoBuilder(Validator validator){
            this(new AuthInfo(), true);
    }
    public AuthInfoBuilder(AuthInfoFluent<?> fluent,AuthInfo instance,Validator validator){
            this.fluent = fluent; 
            fluent.withAs(instance.getAs()); 
            fluent.withAsGroups(instance.getAsGroups()); 
            fluent.withAsUserExtra(instance.getAsUserExtra()); 
            fluent.withAuthProvider(instance.getAuthProvider()); 
            fluent.withClientCertificate(instance.getClientCertificate()); 
            fluent.withClientCertificateData(instance.getClientCertificateData()); 
            fluent.withClientKey(instance.getClientKey()); 
            fluent.withClientKeyData(instance.getClientKeyData()); 
            fluent.withExec(instance.getExec()); 
            fluent.withExtensions(instance.getExtensions()); 
            fluent.withPassword(instance.getPassword()); 
            fluent.withToken(instance.getToken()); 
            fluent.withTokenFile(instance.getTokenFile()); 
            fluent.withUsername(instance.getUsername()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public AuthInfoBuilder(AuthInfo instance,Validator validator){
            this.fluent = this; 
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
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public AuthInfo build(){
            AuthInfo buildable = new AuthInfo(fluent.getAs(),fluent.getAsGroups(),fluent.getAsUserExtra(),fluent.getAuthProvider(),fluent.getClientCertificate(),fluent.getClientCertificateData(),fluent.getClientKey(),fluent.getClientKeyData(),fluent.getExec(),fluent.getExtensions(),fluent.getPassword(),fluent.getToken(),fluent.getTokenFile(),fluent.getUsername());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            AuthInfoBuilder that = (AuthInfoBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
