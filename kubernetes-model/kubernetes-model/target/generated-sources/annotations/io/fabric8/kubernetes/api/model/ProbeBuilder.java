package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class ProbeBuilder extends ProbeFluentImpl<ProbeBuilder> implements VisitableBuilder<Probe,ProbeBuilder>{

    ProbeFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public ProbeBuilder(){
            this(true);
    }
    public ProbeBuilder(Boolean validationEnabled){
            this(new Probe(), validationEnabled);
    }
    public ProbeBuilder(ProbeFluent<?> fluent){
            this(fluent, true);
    }
    public ProbeBuilder(ProbeFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new Probe(), validationEnabled);
    }
    public ProbeBuilder(ProbeFluent<?> fluent,Probe instance){
            this(fluent, instance, true);
    }
    public ProbeBuilder(ProbeFluent<?> fluent,Probe instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withExec(instance.getExec()); 
            fluent.withFailureThreshold(instance.getFailureThreshold()); 
            fluent.withHttpGet(instance.getHttpGet()); 
            fluent.withInitialDelaySeconds(instance.getInitialDelaySeconds()); 
            fluent.withPeriodSeconds(instance.getPeriodSeconds()); 
            fluent.withSuccessThreshold(instance.getSuccessThreshold()); 
            fluent.withTcpSocket(instance.getTcpSocket()); 
            fluent.withTimeoutSeconds(instance.getTimeoutSeconds()); 
            this.validationEnabled = validationEnabled; 
    }
    public ProbeBuilder(Probe instance){
            this(instance,true);
    }
    public ProbeBuilder(Probe instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withExec(instance.getExec()); 
            this.withFailureThreshold(instance.getFailureThreshold()); 
            this.withHttpGet(instance.getHttpGet()); 
            this.withInitialDelaySeconds(instance.getInitialDelaySeconds()); 
            this.withPeriodSeconds(instance.getPeriodSeconds()); 
            this.withSuccessThreshold(instance.getSuccessThreshold()); 
            this.withTcpSocket(instance.getTcpSocket()); 
            this.withTimeoutSeconds(instance.getTimeoutSeconds()); 
            this.validationEnabled = validationEnabled; 
    }
    public ProbeBuilder(Validator validator){
            this(new Probe(), true);
    }
    public ProbeBuilder(ProbeFluent<?> fluent,Probe instance,Validator validator){
            this.fluent = fluent; 
            fluent.withExec(instance.getExec()); 
            fluent.withFailureThreshold(instance.getFailureThreshold()); 
            fluent.withHttpGet(instance.getHttpGet()); 
            fluent.withInitialDelaySeconds(instance.getInitialDelaySeconds()); 
            fluent.withPeriodSeconds(instance.getPeriodSeconds()); 
            fluent.withSuccessThreshold(instance.getSuccessThreshold()); 
            fluent.withTcpSocket(instance.getTcpSocket()); 
            fluent.withTimeoutSeconds(instance.getTimeoutSeconds()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public ProbeBuilder(Probe instance,Validator validator){
            this.fluent = this; 
            this.withExec(instance.getExec()); 
            this.withFailureThreshold(instance.getFailureThreshold()); 
            this.withHttpGet(instance.getHttpGet()); 
            this.withInitialDelaySeconds(instance.getInitialDelaySeconds()); 
            this.withPeriodSeconds(instance.getPeriodSeconds()); 
            this.withSuccessThreshold(instance.getSuccessThreshold()); 
            this.withTcpSocket(instance.getTcpSocket()); 
            this.withTimeoutSeconds(instance.getTimeoutSeconds()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public Probe build(){
            Probe buildable = new Probe(fluent.getExec(),fluent.getFailureThreshold(),fluent.getHttpGet(),fluent.getInitialDelaySeconds(),fluent.getPeriodSeconds(),fluent.getSuccessThreshold(),fluent.getTcpSocket(),fluent.getTimeoutSeconds());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ProbeBuilder that = (ProbeBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
