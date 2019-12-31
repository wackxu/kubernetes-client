package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableDeploymentDetails extends DeploymentDetailsFluentImpl<DoneableDeploymentDetails> implements Doneable<DeploymentDetails>{

    private final DeploymentDetailsBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<DeploymentDetails,DeploymentDetails> function;

    public DoneableDeploymentDetails(io.fabric8.kubernetes.api.builder.Function<DeploymentDetails,DeploymentDetails> function){
            super();this.builder=new DeploymentDetailsBuilder(this);this.function=function;
    }
    public DoneableDeploymentDetails(DeploymentDetails item,io.fabric8.kubernetes.api.builder.Function<DeploymentDetails,DeploymentDetails> function){
            super(item);this.builder=new DeploymentDetailsBuilder(this, item);this.function=function;
    }
    public DoneableDeploymentDetails(DeploymentDetails item){
            super(item);this.builder=new DeploymentDetailsBuilder(this, item);this.function=new Function<DeploymentDetails, DeploymentDetails>() {
    public DeploymentDetails apply(DeploymentDetails item) {
        return item;
    }
}
;
    }

    public DeploymentDetails done(){
             return function.apply(builder.build());
    }




}
