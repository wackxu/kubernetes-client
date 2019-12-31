package io.fabric8.kubernetes.api.model;

import java.lang.Object;

public class KubernetesListFluentImpl<A extends KubernetesListFluent<A>> extends BaseKubernetesListFluentImpl<A> implements KubernetesListFluent<A>{


    public KubernetesListFluentImpl(){
    }
    public KubernetesListFluentImpl(KubernetesList instance){
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            KubernetesListFluentImpl that = (KubernetesListFluentImpl) o;
            return true;
    }




}
