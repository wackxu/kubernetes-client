package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableDockerBuildStrategy extends DockerBuildStrategyFluentImpl<DoneableDockerBuildStrategy> implements Doneable<DockerBuildStrategy>{

    private final DockerBuildStrategyBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<DockerBuildStrategy,DockerBuildStrategy> function;

    public DoneableDockerBuildStrategy(io.fabric8.kubernetes.api.builder.Function<DockerBuildStrategy,DockerBuildStrategy> function){
            super();this.builder=new DockerBuildStrategyBuilder(this);this.function=function;
    }
    public DoneableDockerBuildStrategy(DockerBuildStrategy item,io.fabric8.kubernetes.api.builder.Function<DockerBuildStrategy,DockerBuildStrategy> function){
            super(item);this.builder=new DockerBuildStrategyBuilder(this, item);this.function=function;
    }
    public DoneableDockerBuildStrategy(DockerBuildStrategy item){
            super(item);this.builder=new DockerBuildStrategyBuilder(this, item);this.function=new Function<DockerBuildStrategy, DockerBuildStrategy>() {
    public DockerBuildStrategy apply(DockerBuildStrategy item) {
        return item;
    }
}
;
    }

    public DockerBuildStrategy done(){
             return function.apply(builder.build());
    }




}
