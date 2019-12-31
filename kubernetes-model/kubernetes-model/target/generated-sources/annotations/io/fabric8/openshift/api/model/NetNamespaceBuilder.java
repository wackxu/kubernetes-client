package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class NetNamespaceBuilder extends NetNamespaceFluentImpl<NetNamespaceBuilder> implements VisitableBuilder<NetNamespace,NetNamespaceBuilder>{

    NetNamespaceFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public NetNamespaceBuilder(){
            this(true);
    }
    public NetNamespaceBuilder(Boolean validationEnabled){
            this(new NetNamespace(), validationEnabled);
    }
    public NetNamespaceBuilder(NetNamespaceFluent<?> fluent){
            this(fluent, true);
    }
    public NetNamespaceBuilder(NetNamespaceFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new NetNamespace(), validationEnabled);
    }
    public NetNamespaceBuilder(NetNamespaceFluent<?> fluent,NetNamespace instance){
            this(fluent, instance, true);
    }
    public NetNamespaceBuilder(NetNamespaceFluent<?> fluent,NetNamespace instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withEgressIPs(instance.getEgressIPs()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withNetid(instance.getNetid()); 
            fluent.withNetname(instance.getNetname()); 
            this.validationEnabled = validationEnabled; 
    }
    public NetNamespaceBuilder(NetNamespace instance){
            this(instance,true);
    }
    public NetNamespaceBuilder(NetNamespace instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withEgressIPs(instance.getEgressIPs()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withNetid(instance.getNetid()); 
            this.withNetname(instance.getNetname()); 
            this.validationEnabled = validationEnabled; 
    }
    public NetNamespaceBuilder(Validator validator){
            this(new NetNamespace(), true);
    }
    public NetNamespaceBuilder(NetNamespaceFluent<?> fluent,NetNamespace instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withEgressIPs(instance.getEgressIPs()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            fluent.withNetid(instance.getNetid()); 
            fluent.withNetname(instance.getNetname()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public NetNamespaceBuilder(NetNamespace instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withEgressIPs(instance.getEgressIPs()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withNetid(instance.getNetid()); 
            this.withNetname(instance.getNetname()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public NetNamespace build(){
            NetNamespace buildable = new NetNamespace(fluent.getApiVersion(),fluent.getEgressIPs(),fluent.getKind(),fluent.getMetadata(),fluent.getNetid(),fluent.getNetname());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NetNamespaceBuilder that = (NetNamespaceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
