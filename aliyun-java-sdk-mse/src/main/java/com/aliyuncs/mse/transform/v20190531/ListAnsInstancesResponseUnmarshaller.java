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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.ListAnsInstancesResponse;
import com.aliyuncs.mse.model.v20190531.ListAnsInstancesResponse.NacosAnsInstance;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAnsInstancesResponseUnmarshaller {

	public static ListAnsInstancesResponse unmarshall(ListAnsInstancesResponse listAnsInstancesResponse, UnmarshallerContext _ctx) {
		
		listAnsInstancesResponse.setRequestId(_ctx.stringValue("ListAnsInstancesResponse.RequestId"));
		listAnsInstancesResponse.setHttpCode(_ctx.stringValue("ListAnsInstancesResponse.HttpCode"));
		listAnsInstancesResponse.setTotalCount(_ctx.integerValue("ListAnsInstancesResponse.TotalCount"));
		listAnsInstancesResponse.setMessage(_ctx.stringValue("ListAnsInstancesResponse.Message"));
		listAnsInstancesResponse.setPageSize(_ctx.integerValue("ListAnsInstancesResponse.PageSize"));
		listAnsInstancesResponse.setPageNumber(_ctx.integerValue("ListAnsInstancesResponse.PageNumber"));
		listAnsInstancesResponse.setErrorCode(_ctx.stringValue("ListAnsInstancesResponse.ErrorCode"));
		listAnsInstancesResponse.setSuccess(_ctx.booleanValue("ListAnsInstancesResponse.Success"));

		List<NacosAnsInstance> data = new ArrayList<NacosAnsInstance>();
		for (int i = 0; i < _ctx.lengthValue("ListAnsInstancesResponse.Data.Length"); i++) {
			NacosAnsInstance nacosAnsInstance = new NacosAnsInstance();
			nacosAnsInstance.setDefaultKey(_ctx.stringValue("ListAnsInstancesResponse.Data["+ i +"].DefaultKey"));
			nacosAnsInstance.setEphemeral(_ctx.booleanValue("ListAnsInstancesResponse.Data["+ i +"].Ephemeral"));
			nacosAnsInstance.setMarked(_ctx.booleanValue("ListAnsInstancesResponse.Data["+ i +"].Marked"));
			nacosAnsInstance.setIp(_ctx.stringValue("ListAnsInstancesResponse.Data["+ i +"].Ip"));
			nacosAnsInstance.setInstanceId(_ctx.stringValue("ListAnsInstancesResponse.Data["+ i +"].InstanceId"));
			nacosAnsInstance.setPort(_ctx.integerValue("ListAnsInstancesResponse.Data["+ i +"].Port"));
			nacosAnsInstance.setLastBeat(_ctx.longValue("ListAnsInstancesResponse.Data["+ i +"].LastBeat"));
			nacosAnsInstance.setOkCount(_ctx.integerValue("ListAnsInstancesResponse.Data["+ i +"].OkCount"));
			nacosAnsInstance.setWeight(_ctx.integerValue("ListAnsInstancesResponse.Data["+ i +"].Weight"));
			nacosAnsInstance.setInstanceHeartBeatInterval(_ctx.integerValue("ListAnsInstancesResponse.Data["+ i +"].InstanceHeartBeatInterval"));
			nacosAnsInstance.setIpDeleteTimeout(_ctx.integerValue("ListAnsInstancesResponse.Data["+ i +"].IpDeleteTimeout"));
			nacosAnsInstance.setApp(_ctx.stringValue("ListAnsInstancesResponse.Data["+ i +"].App"));
			nacosAnsInstance.setFailCount(_ctx.integerValue("ListAnsInstancesResponse.Data["+ i +"].FailCount"));
			nacosAnsInstance.setHealthy(_ctx.booleanValue("ListAnsInstancesResponse.Data["+ i +"].Healthy"));
			nacosAnsInstance.setEnabled(_ctx.booleanValue("ListAnsInstancesResponse.Data["+ i +"].Enabled"));
			nacosAnsInstance.setDatumKey(_ctx.stringValue("ListAnsInstancesResponse.Data["+ i +"].DatumKey"));
			nacosAnsInstance.setClusterName(_ctx.stringValue("ListAnsInstancesResponse.Data["+ i +"].ClusterName"));
			nacosAnsInstance.setInstanceHeartBeatTimeOut(_ctx.integerValue("ListAnsInstancesResponse.Data["+ i +"].InstanceHeartBeatTimeOut"));
			nacosAnsInstance.setServiceName(_ctx.stringValue("ListAnsInstancesResponse.Data["+ i +"].ServiceName"));
			nacosAnsInstance.setMetadata(_ctx.mapValue("ListAnsInstancesResponse.Data["+ i +"].Metadata"));

			data.add(nacosAnsInstance);
		}
		listAnsInstancesResponse.setData(data);
	 
	 	return listAnsInstancesResponse;
	}
}