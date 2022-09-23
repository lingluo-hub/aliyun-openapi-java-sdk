/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.cms.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20190101.DescribeHybridMonitorTaskListResponse;
import com.aliyuncs.cms.model.v20190101.DescribeHybridMonitorTaskListResponse.TaskListItem;
import com.aliyuncs.cms.model.v20190101.DescribeHybridMonitorTaskListResponse.TaskListItem.AttachLabelsItem;
import com.aliyuncs.cms.model.v20190101.DescribeHybridMonitorTaskListResponse.TaskListItem.MatchExpressItem;
import com.aliyuncs.cms.model.v20190101.DescribeHybridMonitorTaskListResponse.TaskListItem.SLSProcessConfig;
import com.aliyuncs.cms.model.v20190101.DescribeHybridMonitorTaskListResponse.TaskListItem.SLSProcessConfig.ExpressItem;
import com.aliyuncs.cms.model.v20190101.DescribeHybridMonitorTaskListResponse.TaskListItem.SLSProcessConfig.Filter;
import com.aliyuncs.cms.model.v20190101.DescribeHybridMonitorTaskListResponse.TaskListItem.SLSProcessConfig.Filter.FiltersItem;
import com.aliyuncs.cms.model.v20190101.DescribeHybridMonitorTaskListResponse.TaskListItem.SLSProcessConfig.GroupByItem;
import com.aliyuncs.cms.model.v20190101.DescribeHybridMonitorTaskListResponse.TaskListItem.SLSProcessConfig.StatisticsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHybridMonitorTaskListResponseUnmarshaller {

	public static DescribeHybridMonitorTaskListResponse unmarshall(DescribeHybridMonitorTaskListResponse describeHybridMonitorTaskListResponse, UnmarshallerContext _ctx) {
		
		describeHybridMonitorTaskListResponse.setRequestId(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.RequestId"));
		describeHybridMonitorTaskListResponse.setSuccess(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.Success"));
		describeHybridMonitorTaskListResponse.setCode(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.Code"));
		describeHybridMonitorTaskListResponse.setMessage(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.Message"));
		describeHybridMonitorTaskListResponse.setPageSize(_ctx.integerValue("DescribeHybridMonitorTaskListResponse.PageSize"));
		describeHybridMonitorTaskListResponse.setPageNumber(_ctx.integerValue("DescribeHybridMonitorTaskListResponse.PageNumber"));
		describeHybridMonitorTaskListResponse.setTotal(_ctx.integerValue("DescribeHybridMonitorTaskListResponse.Total"));

		List<TaskListItem> taskList = new ArrayList<TaskListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHybridMonitorTaskListResponse.TaskList.Length"); i++) {
			TaskListItem taskListItem = new TaskListItem();
			taskListItem.setYARMConfig(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].YARMConfig"));
			taskListItem.setCreateTime(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].CreateTime"));
			taskListItem.setTaskName(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].TaskName"));
			taskListItem.setNamespace(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].Namespace"));
			taskListItem.setUploadRegion(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].UploadRegion"));
			taskListItem.setNetworkType(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].NetworkType"));
			taskListItem.setCollectTimout(_ctx.integerValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].CollectTimout"));
			taskListItem.setCollectTargetEndpoint(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].CollectTargetEndpoint"));
			taskListItem.setTaskType(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].TaskType"));
			taskListItem.setMatchExpressRelation(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].MatchExpressRelation"));
			taskListItem.setDescription(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].Description"));
			taskListItem.setGroupId(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].GroupId"));
			taskListItem.setCollectInterval(_ctx.integerValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].CollectInterval"));
			taskListItem.setTargetUserId(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].TargetUserId"));
			taskListItem.setCollectTargetPath(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].CollectTargetPath"));
			taskListItem.setCollectTargetType(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].CollectTargetType"));
			taskListItem.setTaskId(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].TaskId"));
			taskListItem.setExtraInfo(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].ExtraInfo"));
			taskListItem.setLogFilePath(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].LogFilePath"));
			taskListItem.setLogSplit(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].LogSplit"));
			taskListItem.setLogProcess(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].LogProcess"));
			taskListItem.setLogSample(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].LogSample"));
			taskListItem.setSLSProcess(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].SLSProcess"));

			List<String> instances = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].Instances.Length"); j++) {
				instances.add(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].Instances["+ j +"]"));
			}
			taskListItem.setInstances(instances);

			SLSProcessConfig sLSProcessConfig = new SLSProcessConfig();

			Filter filter = new Filter();
			filter.setRelation(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].SLSProcessConfig.Filter.Relation"));

			List<FiltersItem> filters = new ArrayList<FiltersItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].SLSProcessConfig.Filter.Filters.Length"); j++) {
				FiltersItem filtersItem = new FiltersItem();
				filtersItem.setSLSKeyName(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].SLSProcessConfig.Filter.Filters["+ j +"].SLSKeyName"));
				filtersItem.setOperator(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].SLSProcessConfig.Filter.Filters["+ j +"].Operator"));
				filtersItem.setValue(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].SLSProcessConfig.Filter.Filters["+ j +"].Value"));

				filters.add(filtersItem);
			}
			filter.setFilters(filters);
			sLSProcessConfig.setFilter(filter);

			List<StatisticsItem> statistics = new ArrayList<StatisticsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].SLSProcessConfig.Statistics.Length"); j++) {
				StatisticsItem statisticsItem = new StatisticsItem();
				statisticsItem.setSLSKeyName(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].SLSProcessConfig.Statistics["+ j +"].SLSKeyName"));
				statisticsItem.setFunction(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].SLSProcessConfig.Statistics["+ j +"].Function"));
				statisticsItem.setAlias(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].SLSProcessConfig.Statistics["+ j +"].Alias"));
				statisticsItem.setParameter1(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].SLSProcessConfig.Statistics["+ j +"].Parameter1"));
				statisticsItem.setParameter2(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].SLSProcessConfig.Statistics["+ j +"].Parameter2"));

				statistics.add(statisticsItem);
			}
			sLSProcessConfig.setStatistics(statistics);

			List<GroupByItem> groupBy = new ArrayList<GroupByItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].SLSProcessConfig.GroupBy.Length"); j++) {
				GroupByItem groupByItem = new GroupByItem();
				groupByItem.setSLSKeyName(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].SLSProcessConfig.GroupBy["+ j +"].SLSKeyName"));
				groupByItem.setAlias(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].SLSProcessConfig.GroupBy["+ j +"].Alias"));

				groupBy.add(groupByItem);
			}
			sLSProcessConfig.setGroupBy(groupBy);

			List<ExpressItem> express = new ArrayList<ExpressItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].SLSProcessConfig.Express.Length"); j++) {
				ExpressItem expressItem = new ExpressItem();
				expressItem.setExpress(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].SLSProcessConfig.Express["+ j +"].Express"));
				expressItem.setAlias(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].SLSProcessConfig.Express["+ j +"].Alias"));

				express.add(expressItem);
			}
			sLSProcessConfig.setExpress(express);
			taskListItem.setSLSProcessConfig(sLSProcessConfig);

			List<AttachLabelsItem> attachLabels = new ArrayList<AttachLabelsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].AttachLabels.Length"); j++) {
				AttachLabelsItem attachLabelsItem = new AttachLabelsItem();
				attachLabelsItem.setName(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].AttachLabels["+ j +"].Name"));
				attachLabelsItem.setValue(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].AttachLabels["+ j +"].Value"));

				attachLabels.add(attachLabelsItem);
			}
			taskListItem.setAttachLabels(attachLabels);

			List<MatchExpressItem> matchExpress = new ArrayList<MatchExpressItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].MatchExpress.Length"); j++) {
				MatchExpressItem matchExpressItem = new MatchExpressItem();
				matchExpressItem.setValue(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].MatchExpress["+ j +"].Value"));
				matchExpressItem.setName(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].MatchExpress["+ j +"].Name"));
				matchExpressItem.setFunction(_ctx.stringValue("DescribeHybridMonitorTaskListResponse.TaskList["+ i +"].MatchExpress["+ j +"].Function"));

				matchExpress.add(matchExpressItem);
			}
			taskListItem.setMatchExpress(matchExpress);

			taskList.add(taskListItem);
		}
		describeHybridMonitorTaskListResponse.setTaskList(taskList);
	 
	 	return describeHybridMonitorTaskListResponse;
	}
}