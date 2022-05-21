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

import com.aliyuncs.workbench_ide.model.v20210121.GetAppRepositoryResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppRepositoryResponseUnmarshaller {

	public static GetAppRepositoryResponse unmarshall(GetAppRepositoryResponse getAppRepositoryResponse, UnmarshallerContext _ctx) {
		
		getAppRepositoryResponse.setRequestId(_ctx.stringValue("GetAppRepositoryResponse.RequestId"));
		getAppRepositoryResponse.setCode(_ctx.stringValue("GetAppRepositoryResponse.Code"));
		getAppRepositoryResponse.setMessage(_ctx.stringValue("GetAppRepositoryResponse.Message"));
		getAppRepositoryResponse.setData(_ctx.mapValue("GetAppRepositoryResponse.Data"));
	 
	 	return getAppRepositoryResponse;
	}
}