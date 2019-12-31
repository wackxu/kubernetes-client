package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableDockerStrategyOptions extends DockerStrategyOptionsFluentImpl<DoneableDockerStrategyOptions> implements Doneable<DockerStrategyOptions>{

    private final DockerStrategyOptionsBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<DockerStrategyOptions,DockerStrategyOptions> function;

    public DoneableDockerStrategyOptions(io.fabric8.kubernetes.api.builder.Function<DockerStrategyOptions,DockerStrategyOptions> function){
            super();this.builder=new DockerStrategyOptionsBuilder(this);this.function=function;
    }
    public DoneableDockerStrategyOptions(DockerStrategyOptions item,io.fabric8.kubernetes.api.builder.Function<DockerStrategyOptions,DockerStrategyOptions> function){
            super(item);this.builder=new DockerStrategyOptionsBuilder(this, item);this.function=function;
    }
    public DoneableDockerStrategyOptions(DockerStrategyOptions item){
            super(item);this.builder=new DockerStrategyOptionsBuilder(this, item);this.function=new Function<DockerStrategyOptions, DockerStrategyOptions>() {
    public DockerStrategyOptions apply(DockerStrategyOptions item) {
        return item;
    }
}
;
    }

    public DockerStrategyOptions done(){
             return function.apply(builder.build());
    }




}
