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

package com.aliyuncs.cc5g.transform.v20220314;

import com.aliyuncs.cc5g.model.v20220314.DetachVpcFromNetLinkResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetachVpcFromNetLinkResponseUnmarshaller {

	public static DetachVpcFromNetLinkResponse unmarshall(DetachVpcFromNetLinkResponse detachVpcFromNetLinkResponse, UnmarshallerContext _ctx) {
		
		detachVpcFromNetLinkResponse.setRequestId(_ctx.stringValue("DetachVpcFromNetLinkResponse.RequestId"));
	 
	 	return detachVpcFromNetLinkResponse;
	}
}