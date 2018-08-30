package nexacro.sample.service.dao.mybatis;



import java.util.List;



import nexacro.sample.vo.InterestVo;
import egovframework.rte.psl.dataaccess.mapper.Mapper;
@Mapper("interestMapper")
public interface InterestDao {


public void  insertInterestVo(InterestVo interest);



public void deleteInterestVo(InterestVo interest);

public List<InterestVo> selectInterestList();

public List<InterestVo> selectDetailList(InterestVo interest_interestVo);
}
