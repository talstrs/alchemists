package com.alchemists.infra.timeline;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TimelineService {
	
	@Autowired
	TimelineDao timelineDao;
	
	public List<TimelineDto> selectTimelineList(TimelineVo vo) {
		return timelineDao.selectTimelineList(vo);
	}
	
	public TimelineDto selectTimelineOne(TimelineDto dto) {
		return timelineDao.selectTimelineOne(dto);
	}

	public int timelineInst(TimelineDto dto) {
		return timelineDao.timelineInst(dto);
	}
	
	public int timelineUpdt(TimelineDto dto) {
		return timelineDao.timelineUpdt(dto);
	}
	
	public int timelineUelt(TimelineDto dto) {
		return timelineDao.timelineUelt(dto);
	}
	
	public int timelineDelt(TimelineDto dto) {
		return timelineDao.timelineDelt(dto);
	}
	
	public List<TimelineDto> selectListWithoutPaging(TimelineVo vo) {
		return timelineDao.selectListWithoutPaging(vo);
	}
	
	

}
