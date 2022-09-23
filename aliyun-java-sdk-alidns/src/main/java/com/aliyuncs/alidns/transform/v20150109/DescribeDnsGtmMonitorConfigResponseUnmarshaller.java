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

import com.aliyuncs.alidns.model.v20150109.DescribeDnsGtmMonitorConfigResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeDnsGtmMonitorConfigResponse.IspCityNode;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDnsGtmMonitorConfigResponseUnmarshaller {

	public static DescribeDnsGtmMonitorConfigResponse unmarshall(DescribeDnsGtmMonitorConfigResponse describeDnsGtmMonitorConfigResponse, UnmarshallerContext _ctx) {
		
		describeDnsGtmMonitorConfigResponse.setRequestId(_ctx.stringValue("DescribeDnsGtmMonitorConfigResponse.RequestId"));
		describeDnsGtmMonitorConfigResponse.setTimeout(_ctx.integerValue("DescribeDnsGtmMonitorConfigResponse.Timeout"));
		describeDnsGtmMonitorConfigResponse.setProtocolType(_ctx.stringValue("DescribeDnsGtmMonitorConfigResponse.ProtocolType"));
		describeDnsGtmMonitorConfigResponse.setCreateTime(_ctx.stringValue("DescribeDnsGtmMonitorConfigResponse.CreateTime"));
		describeDnsGtmMonitorConfigResponse.setUpdateTime(_ctx.stringValue("DescribeDnsGtmMonitorConfigResponse.UpdateTime"));
		describeDnsGtmMonitorConfigResponse.setEvaluationCount(_ctx.integerValue("DescribeDnsGtmMonitorConfigResponse.EvaluationCount"));
		describeDnsGtmMonitorConfigResponse.setUpdateTimestamp(_ctx.longValue("DescribeDnsGtmMonitorConfigResponse.UpdateTimestamp"));
		describeDnsGtmMonitorConfigResponse.setMonitorExtendInfo(_ctx.stringValue("DescribeDnsGtmMonitorConfigResponse.MonitorExtendInfo"));
		describeDnsGtmMonitorConfigResponse.setMonitorConfigId(_ctx.stringValue("DescribeDnsGtmMonitorConfigResponse.MonitorConfigId"));
		describeDnsGtmMonitorConfigResponse.setCreateTimestamp(_ctx.longValue("DescribeDnsGtmMonitorConfigResponse.CreateTimestamp"));
		describeDnsGtmMonitorConfigResponse.setInterval(_ctx.integerValue("DescribeDnsGtmMonitorConfigResponse.Interval"));

		List<IspCityNode> ispCityNodes = new ArrayList<IspCityNode>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDnsGtmMonitorConfigResponse.IspCityNodes.Length"); i++) {
			IspCityNode ispCityNode = new IspCityNode();
			ispCityNode.setCityCode(_ctx.stringValue("DescribeDnsGtmMonitorConfigResponse.IspCityNodes["+ i +"].CityCode"));
			ispCityNode.setCountryName(_ctx.stringValue("DescribeDnsGtmMonitorConfigResponse.IspCityNodes["+ i +"].CountryName"));
			ispCityNode.setIspCode(_ctx.stringValue("DescribeDnsGtmMonitorConfigResponse.IspCityNodes["+ i +"].IspCode"));
			ispCityNode.setCityName(_ctx.stringValue("DescribeDnsGtmMonitorConfigResponse.IspCityNodes["+ i +"].CityName"));
			ispCityNode.setCountryCode(_ctx.stringValue("DescribeDnsGtmMonitorConfigResponse.IspCityNodes["+ i +"].CountryCode"));
			ispCityNode.setIspName(_ctx.stringValue("DescribeDnsGtmMonitorConfigResponse.IspCityNodes["+ i +"].IspName"));

			ispCityNodes.add(ispCityNode);
		}
		describeDnsGtmMonitorConfigResponse.setIspCityNodes(ispCityNodes);
	 
	 	return describeDnsGtmMonitorConfigResponse;
	}
}