package io.fabric8.kubernetes.api.model.certificates;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class CertificateSigningRequestConditionFluentImpl<A extends CertificateSigningRequestConditionFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements CertificateSigningRequestConditionFluent<A>{

    private String lastUpdateTime;
    private String message;
    private String reason;
    private String type;

    public CertificateSigningRequestConditionFluentImpl(){
    }
    public CertificateSigningRequestConditionFluentImpl(CertificateSigningRequestCondition instance){
            this.withLastUpdateTime(instance.getLastUpdateTime()); 
            this.withMessage(instance.getMessage()); 
            this.withReason(instance.getReason()); 
            this.withType(instance.getType()); 
    }

    public String getLastUpdateTime(){
            return this.lastUpdateTime;
    }

    public A withLastUpdateTime(String lastUpdateTime){
            this.lastUpdateTime=lastUpdateTime; return (A) this;
    }

    public Boolean hasLastUpdateTime(){
            return this.lastUpdateTime != null;
    }

    public String getMessage(){
            return this.message;
    }

    public A withMessage(String message){
            this.message=message; return (A) this;
    }

    public Boolean hasMessage(){
            return this.message != null;
    }

    public String getReason(){
            return this.reason;
    }

    public A withReason(String reason){
            this.reason=reason; return (A) this;
    }

    public Boolean hasReason(){
            return this.reason != null;
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
            CertificateSigningRequestConditionFluentImpl that = (CertificateSigningRequestConditionFluentImpl) o;
            if (lastUpdateTime != null ? !lastUpdateTime.equals(that.lastUpdateTime) :that.lastUpdateTime != null) return false;
            if (message != null ? !message.equals(that.message) :that.message != null) return false;
            if (reason != null ? !reason.equals(that.reason) :that.reason != null) return false;
            if (type != null ? !type.equals(that.type) :that.type != null) return false;
            return true;
    }




}
