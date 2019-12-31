package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
import javax.validation.Validator;

public class NetNamespaceListBuilder extends NetNamespaceListFluentImpl<NetNamespaceListBuilder> implements VisitableBuilder<NetNamespaceList,NetNamespaceListBuilder>{

    NetNamespaceListFluent<?> fluent;
    Boolean validationEnabled;
    Validator validator;

    public NetNamespaceListBuilder(){
            this(true);
    }
    public NetNamespaceListBuilder(Boolean validationEnabled){
            this(new NetNamespaceList(), validationEnabled);
    }
    public NetNamespaceListBuilder(NetNamespaceListFluent<?> fluent){
            this(fluent, true);
    }
    public NetNamespaceListBuilder(NetNamespaceListFluent<?> fluent,Boolean validationEnabled){
            this(fluent, new NetNamespaceList(), validationEnabled);
    }
    public NetNamespaceListBuilder(NetNamespaceListFluent<?> fluent,NetNamespaceList instance){
            this(fluent, instance, true);
    }
    public NetNamespaceListBuilder(NetNamespaceListFluent<?> fluent,NetNamespaceList instance,Boolean validationEnabled){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public NetNamespaceListBuilder(NetNamespaceList instance){
            this(instance,true);
    }
    public NetNamespaceListBuilder(NetNamespaceList instance,Boolean validationEnabled){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validationEnabled = validationEnabled; 
    }
    public NetNamespaceListBuilder(Validator validator){
            this(new NetNamespaceList(), true);
    }
    public NetNamespaceListBuilder(NetNamespaceListFluent<?> fluent,NetNamespaceList instance,Validator validator){
            this.fluent = fluent; 
            fluent.withApiVersion(instance.getApiVersion()); 
            fluent.withItems(instance.getItems()); 
            fluent.withKind(instance.getKind()); 
            fluent.withMetadata(instance.getMetadata()); 
            this.validator = validator;
            this.validationEnabled = validator != null; 
    }
    public NetNamespaceListBuilder(NetNamespaceList instance,Validator validator){
            this.fluent = this; 
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.validator = validator; 
            this.validationEnabled = validator != null; 
    }

    public NetNamespaceList build(){
            NetNamespaceList buildable = new NetNamespaceList(fluent.getApiVersion(),fluent.getItems(),fluent.getKind(),fluent.getMetadata());
            if (validationEnabled) {io.fabric8.kubernetes.api.builder.ValidationUtils.validate(buildable, validator);}
            return buildable;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NetNamespaceListBuilder that = (NetNamespaceListBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
