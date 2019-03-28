package backend.service;

//import model.*;

import backend.model.po.EdgePO;
import backend.model.po.NodePO;

import java.util.List;
import java.util.Map;

public interface ScenarioService {

    /** 根据算法名字（算法组件的简写）和对应的输入参数调用算法
     *
     * @param algorithmName
     * @param input
     * @return
     */
    Map<String,Object> callAlgorithm(String algorithmName, Map<String,Object> input);


    /** 查找实验下连接组件的边
     * @param experimentID
     * @return
     */
    List<EdgePO> findEdgesByExperimentID(Long experimentID) ;


    /** 查找实验下所有使用的组件
     *
     * @param experimentID
     * @return
     */
    List<NodePO> findNodesByExperimentID(Long experimentID) ;

    /** 通过组件节点的NodeID查找组件的算法名称缩写,如"ce"
     *
     * @param nodeID
     * @return
     */
    String findAlgorithmNameByNodeID(Long nodeID) ;

    /** 保存场景
     *
     */
    boolean saveScenario(Long userID,Long experimentID, List<NodePO> nodePOList,List<EdgePO> edgePOList);

    /** 为输入数据进行封装
     *
     * @param node
     * @return
     */
    Map<String,Object> formatInputForAlgorithm(NodePO node) ;

    Map<String,Object> findDatasetByUserIDAndExperimentIDAndNodeID(Long userID,Long experimentID,Long nodeID);

}
