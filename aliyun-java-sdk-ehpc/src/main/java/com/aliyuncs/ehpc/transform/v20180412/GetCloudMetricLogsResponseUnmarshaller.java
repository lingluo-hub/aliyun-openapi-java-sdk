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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.GetCloudMetricLogsResponse;
import com.aliyuncs.ehpc.model.v20180412.GetCloudMetricLogsResponse.MetricLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCloudMetricLogsResponseUnmarshaller {

	public static GetCloudMetricLogsResponse unmarshall(GetCloudMetricLogsResponse getCloudMetricLogsResponse, UnmarshallerContext _ctx) {
		
		getCloudMetricLogsResponse.setRequestId(_ctx.stringValue("GetCloudMetricLogsResponse.RequestId"));

		List<MetricLog> metricLogs = new ArrayList<MetricLog>();
		for (int i = 0; i < _ctx.lengthValue("GetCloudMetricLogsResponse.MetricLogs.Length"); i++) {
			MetricLog metricLog = new MetricLog();
			metricLog.setTime(_ctx.integerValue("GetCloudMetricLogsResponse.MetricLogs["+ i +"].Time"));
			metricLog.setDiskDevice(_ctx.stringValue("GetCloudMetricLogsResponse.MetricLogs["+ i +"].DiskDevice"));
			metricLog.setNetworkInterface(_ctx.stringValue("GetCloudMetricLogsResponse.MetricLogs["+ i +"].NetworkInterface"));
			metricLog.setMetricData(_ctx.stringValue("GetCloudMetricLogsResponse.MetricLogs["+ i +"].MetricData"));
			metricLog.setHostname(_ctx.stringValue("GetCloudMetricLogsResponse.MetricLogs["+ i +"].Hostname"));
			metricLog.setInstanceId(_ctx.stringValue("GetCloudMetricLogsResponse.MetricLogs["+ i +"].InstanceId"));

			metricLogs.add(metricLog);
		}
		getCloudMetricLogsResponse.setMetricLogs(metricLogs);
	 
	 	return getCloudMetricLogsResponse;
	}
}