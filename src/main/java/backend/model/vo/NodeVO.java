package backend.model.vo;

import java.util.Map;

public class NodeVO {
    public String id ; //使用阿里云组件的编号,如"296b59b7"
    public int index; //渲染顺序编号
    public String label;//组件对内的类型标志，如"read-data-base"...
    public String name; //组件对外展示的名称，通常是中文，如"读数据库"
    public String nodeid ; //eg. "2"
    public Map<String,Object> settings ;
    public String shape;//外形名称，如"read-data-base"
    public String size;//节点大小 ,如"170*150"
    public String type; //节点类型，如"node"
    public double x; //x坐标
    public double y; //y坐标
//    public Map<String,Object> anchorJson ;  //暂时不存
}
