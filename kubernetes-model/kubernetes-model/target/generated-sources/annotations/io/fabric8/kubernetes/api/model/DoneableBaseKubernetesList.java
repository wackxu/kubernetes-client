package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableBaseKubernetesList extends BaseKubernetesListFluentImpl<DoneableBaseKubernetesList> implements Doneable<BaseKubernetesList>{

    private final BaseKubernetesListBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<BaseKubernetesList,BaseKubernetesList> function;

    public DoneableBaseKubernetesList(io.fabric8.kubernetes.api.builder.Function<BaseKubernetesList,BaseKubernetesList> function){
            super();this.builder=new BaseKubernetesListBuilder(this);this.function=function;
    }
    public DoneableBaseKubernetesList(BaseKubernetesList item,io.fabric8.kubernetes.api.builder.Function<BaseKubernetesList,BaseKubernetesList> function){
            super(item);this.builder=new BaseKubernetesListBuilder(this, item);this.function=function;
    }
    public DoneableBaseKubernetesList(BaseKubernetesList item){
            super(item);this.builder=new BaseKubernetesListBuilder(this, item);this.function=new Function<BaseKubernetesList, BaseKubernetesList>() {
    public BaseKubernetesList apply(BaseKubernetesList item) {
        return item;
    }
}
;
    }

    public BaseKubernetesList done(){
             return function.apply(builder.build());
    }




}
