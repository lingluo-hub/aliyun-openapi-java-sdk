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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.ListApplicationResponse;
import com.aliyuncs.edas.model.v20170801.ListApplicationResponse.Application;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApplicationResponseUnmarshaller {

	public static ListApplicationResponse unmarshall(ListApplicationResponse listApplicationResponse, UnmarshallerContext _ctx) {
		
		listApplicationResponse.setRequestId(_ctx.stringValue("ListApplicationResponse.RequestId"));
		listApplicationResponse.setCode(_ctx.integerValue("ListApplicationResponse.Code"));
		listApplicationResponse.setMessage(_ctx.stringValue("ListApplicationResponse.Message"));

		List<Application> applicationList = new ArrayList<Application>();
		for (int i = 0; i < _ctx.lengthValue("ListApplicationResponse.ApplicationList.Length"); i++) {
			Application application = new Application();
			application.setAppId(_ctx.stringValue("ListApplicationResponse.ApplicationList["+ i +"].AppId"));
			application.setRegionId(_ctx.stringValue("ListApplicationResponse.ApplicationList["+ i +"].RegionId"));
			application.setName(_ctx.stringValue("ListApplicationResponse.ApplicationList["+ i +"].Name"));
			application.setInstances(_ctx.integerValue("ListApplicationResponse.ApplicationList["+ i +"].Instances"));
			application.setPort(_ctx.integerValue("ListApplicationResponse.ApplicationList["+ i +"].Port"));
			application.setState(_ctx.stringValue("ListApplicationResponse.ApplicationList["+ i +"].State"));
			application.setCreateTime(_ctx.longValue("ListApplicationResponse.ApplicationList["+ i +"].CreateTime"));
			application.setSlbIp(_ctx.stringValue("ListApplicationResponse.ApplicationList["+ i +"].SlbIp"));
			application.setSlbPort(_ctx.integerValue("ListApplicationResponse.ApplicationList["+ i +"].SlbPort"));
			application.setSlbListenerPort(_ctx.integerValue("ListApplicationResponse.ApplicationList["+ i +"].SlbListenerPort"));
			application.setExtSlbListenerPort(_ctx.integerValue("ListApplicationResponse.ApplicationList["+ i +"].ExtSlbListenerPort"));
			application.setBuildPackageId(_ctx.longValue("ListApplicationResponse.ApplicationList["+ i +"].BuildPackageId"));
			application.setExtSlbIp(_ctx.stringValue("ListApplicationResponse.ApplicationList["+ i +"].ExtSlbIp"));
			application.setApplicationType(_ctx.stringValue("ListApplicationResponse.ApplicationList["+ i +"].ApplicationType"));
			application.setClusterType(_ctx.integerValue("ListApplicationResponse.ApplicationList["+ i +"].ClusterType"));
			application.setRunningInstanceCount(_ctx.integerValue("ListApplicationResponse.ApplicationList["+ i +"].RunningInstanceCount"));
			application.setClusterId(_ctx.stringValue("ListApplicationResponse.ApplicationList["+ i +"].ClusterId"));
			application.setResourceGroupId(_ctx.stringValue("ListApplicationResponse.ApplicationList["+ i +"].ResourceGroupId"));
			application.setK8sNamespace(_ctx.stringValue("ListApplicationResponse.ApplicationList["+ i +"].K8sNamespace"));
			application.setNamespaceId(_ctx.stringValue("ListApplicationResponse.ApplicationList["+ i +"].NamespaceId"));

			applicationList.add(application);
		}
		listApplicationResponse.setApplicationList(applicationList);
	 
	 	return listApplicationResponse;
	}
}