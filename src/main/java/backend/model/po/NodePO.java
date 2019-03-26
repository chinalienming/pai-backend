package backend.model.po;


import lombok.*;

import javax.persistence.*;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "nodes", schema = "GraduationProject5")
public class NodePO {

    @Id
    @Column(name = "node_id")
    private Long nodeID;

    @Basic
    @Column(name = "index")
    private int index;

    @Basic
    @Column(name = "label")
    private String label;

    @Basic
    @Column(name = "name")
    private String name;

    @Basic
    @Column(name = "node_no" , length = 10 )
    private int nodeNo ; //??????????

    @Basic
    @Column(name = "shape")
    private String shape;

    @Basic
    @Column(name = "type")
    private String type;

    @Basic
    @Column(name = "size")
    private String size;

    @Basic
    @Column(name = "x")
    private double x;

    @Basic
    @Column(name = "y")
    private double y;

    @Basic
    @Column(name = "component_id")
    private int componentID;

    @Basic
    @Column(name = "experiment_id")
    private Long experimentID;      //long Long??


}
