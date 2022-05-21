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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.DescribeFlowLogsResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeFlowLogsResponse.FlowLogSetType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFlowLogsResponseUnmarshaller {

	public static DescribeFlowLogsResponse unmarshall(DescribeFlowLogsResponse describeFlowLogsResponse, UnmarshallerContext _ctx) {
		
		describeFlowLogsResponse.setRequestId(_ctx.stringValue("DescribeFlowLogsResponse.RequestId"));
		describeFlowLogsResponse.setTotalCount(_ctx.integerValue("DescribeFlowLogsResponse.TotalCount"));
		describeFlowLogsResponse.setPageSize(_ctx.integerValue("DescribeFlowLogsResponse.PageSize"));
		describeFlowLogsResponse.setPageNumber(_ctx.integerValue("DescribeFlowLogsResponse.PageNumber"));

		List<FlowLogSetType> flowLogs = new ArrayList<FlowLogSetType>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFlowLogsResponse.FlowLogs.Length"); i++) {
			FlowLogSetType flowLogSetType = new FlowLogSetType();
			flowLogSetType.setStatus(_ctx.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].Status"));
			flowLogSetType.setTotalSagNum(_ctx.integerValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].TotalSagNum"));
			flowLogSetType.setNetflowServerIp(_ctx.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].NetflowServerIp"));
			flowLogSetType.setProjectName(_ctx.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].ProjectName"));
			flowLogSetType.setSlsRegionId(_ctx.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].SlsRegionId"));
			flowLogSetType.setActiveAging(_ctx.integerValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].ActiveAging"));
			flowLogSetType.setOutputType(_ctx.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].OutputType"));
			flowLogSetType.setDescription(_ctx.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].Description"));
			flowLogSetType.setNetflowVersion(_ctx.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].NetflowVersion"));
			flowLogSetType.setInactiveAging(_ctx.integerValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].InactiveAging"));
			flowLogSetType.setNetflowServerPort(_ctx.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].NetflowServerPort"));
			flowLogSetType.setName(_ctx.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].Name"));
			flowLogSetType.setFlowLogId(_ctx.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].FlowLogId"));
			flowLogSetType.setLogstoreName(_ctx.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].LogstoreName"));
			flowLogSetType.setResourceGroupId(_ctx.stringValue("DescribeFlowLogsResponse.FlowLogs["+ i +"].ResourceGroupId"));

			flowLogs.add(flowLogSetType);
		}
		describeFlowLogsResponse.setFlowLogs(flowLogs);
	 
	 	return describeFlowLogsResponse;
	}
}