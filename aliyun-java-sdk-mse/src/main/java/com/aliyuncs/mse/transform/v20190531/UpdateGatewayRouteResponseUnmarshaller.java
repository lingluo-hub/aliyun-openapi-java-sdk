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

import com.aliyuncs.mse.model.v20190531.UpdateGatewayRouteResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateGatewayRouteResponseUnmarshaller {

	public static UpdateGatewayRouteResponse unmarshall(UpdateGatewayRouteResponse updateGatewayRouteResponse, UnmarshallerContext _ctx) {
		
		updateGatewayRouteResponse.setRequestId(_ctx.stringValue("UpdateGatewayRouteResponse.RequestId"));
		updateGatewayRouteResponse.setHttpStatusCode(_ctx.integerValue("UpdateGatewayRouteResponse.HttpStatusCode"));
		updateGatewayRouteResponse.setMessage(_ctx.stringValue("UpdateGatewayRouteResponse.Message"));
		updateGatewayRouteResponse.setCode(_ctx.integerValue("UpdateGatewayRouteResponse.Code"));
		updateGatewayRouteResponse.setSuccess(_ctx.booleanValue("UpdateGatewayRouteResponse.Success"));
		updateGatewayRouteResponse.setData(_ctx.longValue("UpdateGatewayRouteResponse.Data"));
		updateGatewayRouteResponse.setErrorCode(_ctx.stringValue("UpdateGatewayRouteResponse.ErrorCode"));
	 
	 	return updateGatewayRouteResponse;
	}
}