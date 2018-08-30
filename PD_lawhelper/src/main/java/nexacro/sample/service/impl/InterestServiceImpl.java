package nexacro.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import nexacro.sample.service.InterestService;
import nexacro.sample.service.dao.mybatis.InterestDao;
import nexacro.sample.vo.InterestVo;

import org.springframework.stereotype.Service;

import com.nexacro.spring.data.DataSetRowTypeAccessor;
import com.nexacro.xapi.data.DataSet;


@Service("interestService")
public class InterestServiceImpl implements InterestService {
 @Resource
 private InterestDao interestDao;
	@Override
	public List<InterestVo>  selectInterestVoList() {
		
		return interestDao. selectInterestList();
	}
	
	
	@Override
	public void modifyMultiInterest(List<InterestVo> modifyList) {
		int size = modifyList.size();
		for(int i=0; i<size; i++){
			InterestVo interest = modifyList.get(i);
			if(interest instanceof DataSetRowTypeAccessor){ 
				DataSetRowTypeAccessor accessor = (DataSetRowTypeAccessor) interest;
				if(accessor.getRowType() ==DataSet.ROW_TYPE_INSERTED){
					interestDao.insertInterestVo(interest);
					System.out.println("insert 합니다");
				
				}else if(accessor.getRowType() ==DataSet.ROW_TYPE_DELETED){
					interestDao.deleteInterestVo(interest);
					System.out.println("delete 합니다");
				}
			}
		}   //getRowType()이란  : 데이터셋에서 u를 통해 얻어온값

	}//데이터 변환 시 DataSet의 행(row)의 형식(type)을 처리하기 위한 인터페이스이다-DataSetRowTypeAccessor



	@Override
	public List<InterestVo> selectDetailList(InterestVo interest_interestVo) {
		
		return interestDao.selectDetailList(interest_interestVo);
	}

	
	}


