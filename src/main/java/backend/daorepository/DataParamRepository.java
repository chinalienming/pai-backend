package backend.daorepository;

import backend.model.po.DataParam;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DataParamRepository extends JpaRepository<DataParam,Long> {
    List<DataParam> findByDataSetID(Long dataSetID) ;
}