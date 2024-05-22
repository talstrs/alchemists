package com.alchemists.infra.timeline;

import java.util.List;

public interface TimelineDao {
	
	public List<TimelineDto> selectTimelineList(TimelineVo vo); 
	public TimelineDto selectTimelineOne(TimelineDto dto);
	
	public int timelineInst(TimelineDto dto);
	
	public int timelineUpdt(TimelineDto dto);
	
	public int timelineUelt(TimelineDto dto);
	
	public int timelineDelt(TimelineDto dto);
	
	public List<TimelineDto> selectListWithoutPaging(TimelineVo vo); 

}
