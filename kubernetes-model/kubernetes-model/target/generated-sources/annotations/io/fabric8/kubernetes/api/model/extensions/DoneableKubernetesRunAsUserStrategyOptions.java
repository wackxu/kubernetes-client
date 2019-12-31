package io.fabric8.kubernetes.api.model.extensions;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableKubernetesRunAsUserStrategyOptions extends KubernetesRunAsUserStrategyOptionsFluentImpl<DoneableKubernetesRunAsUserStrategyOptions> implements Doneable<KubernetesRunAsUserStrategyOptions>{

    private final KubernetesRunAsUserStrategyOptionsBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<KubernetesRunAsUserStrategyOptions,KubernetesRunAsUserStrategyOptions> function;

    public DoneableKubernetesRunAsUserStrategyOptions(io.fabric8.kubernetes.api.builder.Function<KubernetesRunAsUserStrategyOptions,KubernetesRunAsUserStrategyOptions> function){
            super();this.builder=new KubernetesRunAsUserStrategyOptionsBuilder(this);this.function=function;
    }
    public DoneableKubernetesRunAsUserStrategyOptions(KubernetesRunAsUserStrategyOptions item,io.fabric8.kubernetes.api.builder.Function<KubernetesRunAsUserStrategyOptions,KubernetesRunAsUserStrategyOptions> function){
            super(item);this.builder=new KubernetesRunAsUserStrategyOptionsBuilder(this, item);this.function=function;
    }
    public DoneableKubernetesRunAsUserStrategyOptions(KubernetesRunAsUserStrategyOptions item){
            super(item);this.builder=new KubernetesRunAsUserStrategyOptionsBuilder(this, item);this.function=new Function<KubernetesRunAsUserStrategyOptions, KubernetesRunAsUserStrategyOptions>() {
    public KubernetesRunAsUserStrategyOptions apply(KubernetesRunAsUserStrategyOptions item) {
        return item;
    }
}
;
    }

    public KubernetesRunAsUserStrategyOptions done(){
             return function.apply(builder.build());
    }




}
