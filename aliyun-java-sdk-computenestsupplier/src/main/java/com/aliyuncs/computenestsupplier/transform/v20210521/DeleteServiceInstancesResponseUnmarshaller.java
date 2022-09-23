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

package com.aliyuncs.computenestsupplier.transform.v20210521;

import com.aliyuncs.computenestsupplier.model.v20210521.DeleteServiceInstancesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteServiceInstancesResponseUnmarshaller {

	public static DeleteServiceInstancesResponse unmarshall(DeleteServiceInstancesResponse deleteServiceInstancesResponse, UnmarshallerContext _ctx) {
		
		deleteServiceInstancesResponse.setRequestId(_ctx.stringValue("DeleteServiceInstancesResponse.RequestId"));
	 
	 	return deleteServiceInstancesResponse;
	}
}