package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableKubernetesList extends KubernetesListFluentImpl<DoneableKubernetesList> implements Doneable<KubernetesList>{

    private final KubernetesListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<KubernetesList,KubernetesList> function;

    public DoneableKubernetesList(io.fabric8.kubernetes.api.builder.Function<KubernetesList,KubernetesList> function){
            super();this.builder=new KubernetesListBuilder(this);this.function=function;
    }
    public DoneableKubernetesList(KubernetesList item,io.fabric8.kubernetes.api.builder.Function<KubernetesList,KubernetesList> function){
            super(item);this.builder=new KubernetesListBuilder(this, item);this.function=function;
    }
    public DoneableKubernetesList(KubernetesList item){
            super(item);this.builder=new KubernetesListBuilder(this, item);this.function=new Function<KubernetesList, KubernetesList>() {
    public KubernetesList apply(KubernetesList item) {
        return item;
    }
}
;
    }

    public KubernetesList done(){
             return function.apply(builder.build());
    }




}
