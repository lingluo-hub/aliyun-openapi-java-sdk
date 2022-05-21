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

package com.aliyuncs.workbench_ide.transform.v20210121;

import com.aliyuncs.workbench_ide.model.v20210121.RemoveAppDeveloperResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveAppDeveloperResponseUnmarshaller {

	public static RemoveAppDeveloperResponse unmarshall(RemoveAppDeveloperResponse removeAppDeveloperResponse, UnmarshallerContext _ctx) {
		
		removeAppDeveloperResponse.setRequestId(_ctx.stringValue("RemoveAppDeveloperResponse.RequestId"));
		removeAppDeveloperResponse.setCode(_ctx.stringValue("RemoveAppDeveloperResponse.Code"));
		removeAppDeveloperResponse.setMessage(_ctx.stringValue("RemoveAppDeveloperResponse.Message"));
		removeAppDeveloperResponse.setData(_ctx.mapValue("RemoveAppDeveloperResponse.Data"));
	 
	 	return removeAppDeveloperResponse;
	}
}