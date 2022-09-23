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

import com.aliyuncs.ehpc.model.v20180412.ListSoftwaresResponse;
import com.aliyuncs.ehpc.model.v20180412.ListSoftwaresResponse.SoftwareInfo;
import com.aliyuncs.ehpc.model.v20180412.ListSoftwaresResponse.SoftwareInfo.ApplicationInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSoftwaresResponseUnmarshaller {

	public static ListSoftwaresResponse unmarshall(ListSoftwaresResponse listSoftwaresResponse, UnmarshallerContext _ctx) {
		
		listSoftwaresResponse.setRequestId(_ctx.stringValue("ListSoftwaresResponse.RequestId"));

		List<SoftwareInfo> softwares = new ArrayList<SoftwareInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListSoftwaresResponse.Softwares.Length"); i++) {
			SoftwareInfo softwareInfo = new SoftwareInfo();
			softwareInfo.setSchedulerType(_ctx.stringValue("ListSoftwaresResponse.Softwares["+ i +"].SchedulerType"));
			softwareInfo.setOsTag(_ctx.stringValue("ListSoftwaresResponse.Softwares["+ i +"].OsTag"));
			softwareInfo.setSchedulerVersion(_ctx.stringValue("ListSoftwaresResponse.Softwares["+ i +"].SchedulerVersion"));
			softwareInfo.setAccountVersion(_ctx.stringValue("ListSoftwaresResponse.Softwares["+ i +"].AccountVersion"));
			softwareInfo.setAccountType(_ctx.stringValue("ListSoftwaresResponse.Softwares["+ i +"].AccountType"));
			softwareInfo.setEhpcVersion(_ctx.stringValue("ListSoftwaresResponse.Softwares["+ i +"].EhpcVersion"));

			List<ApplicationInfo> applications = new ArrayList<ApplicationInfo>();
			for (int j = 0; j < _ctx.lengthValue("ListSoftwaresResponse.Softwares["+ i +"].Applications.Length"); j++) {
				ApplicationInfo applicationInfo = new ApplicationInfo();
				applicationInfo.setRequired(_ctx.booleanValue("ListSoftwaresResponse.Softwares["+ i +"].Applications["+ j +"].Required"));
				applicationInfo.setTag(_ctx.stringValue("ListSoftwaresResponse.Softwares["+ i +"].Applications["+ j +"].Tag"));
				applicationInfo.setName(_ctx.stringValue("ListSoftwaresResponse.Softwares["+ i +"].Applications["+ j +"].Name"));
				applicationInfo.setVersion(_ctx.stringValue("ListSoftwaresResponse.Softwares["+ i +"].Applications["+ j +"].Version"));

				applications.add(applicationInfo);
			}
			softwareInfo.setApplications(applications);

			softwares.add(softwareInfo);
		}
		listSoftwaresResponse.setSoftwares(softwares);
	 
	 	return listSoftwaresResponse;
	}
}