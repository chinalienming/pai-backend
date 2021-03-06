package backend.model.po;


import com.vladmihalcea.hibernate.type.json.JsonStringType;
import lombok.*;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.util.Map;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TypeDef(name = "json", typeClass = JsonStringType.class)
@Table(name = "dataparams", schema = "GraduationProject5")
public class DataParam {
    @Id
    @GeneratedValue
    @Column(name = "dataparam_id")
    private Long dataParamID;

    //存储参数类型
    @Basic
    @Type( type = "json" )
    @Column(name = "param_json",columnDefinition = "json")
    private Map<String,Object> param ;

    @Basic
    @Column(name = "dataset_id")
    private Long dataSetID;

    @Basic
    @Column(name = "experiment_id")
    private Long experimentID;
}
