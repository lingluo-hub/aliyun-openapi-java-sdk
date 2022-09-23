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

package com.aliyuncs.alidns.transform.v20150109;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alidns.model.v20150109.DescribeGtmMonitorConfigResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeGtmMonitorConfigResponse.IspCityNode;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGtmMonitorConfigResponseUnmarshaller {

	public static DescribeGtmMonitorConfigResponse unmarshall(DescribeGtmMonitorConfigResponse describeGtmMonitorConfigResponse, UnmarshallerContext _ctx) {
		
		describeGtmMonitorConfigResponse.setRequestId(_ctx.stringValue("DescribeGtmMonitorConfigResponse.RequestId"));
		describeGtmMonitorConfigResponse.setTimeout(_ctx.integerValue("DescribeGtmMonitorConfigResponse.Timeout"));
		describeGtmMonitorConfigResponse.setProtocolType(_ctx.stringValue("DescribeGtmMonitorConfigResponse.ProtocolType"));
		describeGtmMonitorConfigResponse.setCreateTime(_ctx.stringValue("DescribeGtmMonitorConfigResponse.CreateTime"));
		describeGtmMonitorConfigResponse.setUpdateTime(_ctx.stringValue("DescribeGtmMonitorConfigResponse.UpdateTime"));
		describeGtmMonitorConfigResponse.setEvaluationCount(_ctx.integerValue("DescribeGtmMonitorConfigResponse.EvaluationCount"));
		describeGtmMonitorConfigResponse.setUpdateTimestamp(_ctx.longValue("DescribeGtmMonitorConfigResponse.UpdateTimestamp"));
		describeGtmMonitorConfigResponse.setMonitorExtendInfo(_ctx.stringValue("DescribeGtmMonitorConfigResponse.MonitorExtendInfo"));
		describeGtmMonitorConfigResponse.setMonitorConfigId(_ctx.stringValue("DescribeGtmMonitorConfigResponse.MonitorConfigId"));
		describeGtmMonitorConfigResponse.setCreateTimestamp(_ctx.longValue("DescribeGtmMonitorConfigResponse.CreateTimestamp"));
		describeGtmMonitorConfigResponse.setInterval(_ctx.integerValue("DescribeGtmMonitorConfigResponse.Interval"));

		List<IspCityNode> ispCityNodes = new ArrayList<IspCityNode>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGtmMonitorConfigResponse.IspCityNodes.Length"); i++) {
			IspCityNode ispCityNode = new IspCityNode();
			ispCityNode.setCityCode(_ctx.stringValue("DescribeGtmMonitorConfigResponse.IspCityNodes["+ i +"].CityCode"));
			ispCityNode.setCountryName(_ctx.stringValue("DescribeGtmMonitorConfigResponse.IspCityNodes["+ i +"].CountryName"));
			ispCityNode.setIspCode(_ctx.stringValue("DescribeGtmMonitorConfigResponse.IspCityNodes["+ i +"].IspCode"));
			ispCityNode.setCityName(_ctx.stringValue("DescribeGtmMonitorConfigResponse.IspCityNodes["+ i +"].CityName"));
			ispCityNode.setCountryCode(_ctx.stringValue("DescribeGtmMonitorConfigResponse.IspCityNodes["+ i +"].CountryCode"));
			ispCityNode.setIspName(_ctx.stringValue("DescribeGtmMonitorConfigResponse.IspCityNodes["+ i +"].IspName"));

			ispCityNodes.add(ispCityNode);
		}
		describeGtmMonitorConfigResponse.setIspCityNodes(ispCityNodes);
	 
	 	return describeGtmMonitorConfigResponse;
	}
}