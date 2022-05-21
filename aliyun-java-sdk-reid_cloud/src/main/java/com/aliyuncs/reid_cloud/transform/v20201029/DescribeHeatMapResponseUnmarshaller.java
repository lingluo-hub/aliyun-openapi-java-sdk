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

package com.aliyuncs.reid_cloud.transform.v20201029;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.reid_cloud.model.v20201029.DescribeHeatMapResponse;
import com.aliyuncs.reid_cloud.model.v20201029.DescribeHeatMapResponse.HeatMapPoint;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHeatMapResponseUnmarshaller {

	public static DescribeHeatMapResponse unmarshall(DescribeHeatMapResponse describeHeatMapResponse, UnmarshallerContext _ctx) {
		
		describeHeatMapResponse.setRequestId(_ctx.stringValue("DescribeHeatMapResponse.RequestId"));
		describeHeatMapResponse.setErrorCode(_ctx.stringValue("DescribeHeatMapResponse.ErrorCode"));
		describeHeatMapResponse.setErrorMessage(_ctx.stringValue("DescribeHeatMapResponse.ErrorMessage"));
		describeHeatMapResponse.setMessage(_ctx.stringValue("DescribeHeatMapResponse.Message"));
		describeHeatMapResponse.setCode(_ctx.stringValue("DescribeHeatMapResponse.Code"));
		describeHeatMapResponse.setDynamicCode(_ctx.stringValue("DescribeHeatMapResponse.DynamicCode"));
		describeHeatMapResponse.setSuccess(_ctx.booleanValue("DescribeHeatMapResponse.Success"));
		describeHeatMapResponse.setDynamicMessage(_ctx.stringValue("DescribeHeatMapResponse.DynamicMessage"));

		List<HeatMapPoint> heatMapPoints = new ArrayList<HeatMapPoint>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHeatMapResponse.HeatMapPoints.Length"); i++) {
			HeatMapPoint heatMapPoint = new HeatMapPoint();
			heatMapPoint.setY(_ctx.floatValue("DescribeHeatMapResponse.HeatMapPoints["+ i +"].Y"));
			heatMapPoint.setWeight(_ctx.integerValue("DescribeHeatMapResponse.HeatMapPoints["+ i +"].Weight"));
			heatMapPoint.setX(_ctx.floatValue("DescribeHeatMapResponse.HeatMapPoints["+ i +"].X"));

			heatMapPoints.add(heatMapPoint);
		}
		describeHeatMapResponse.setHeatMapPoints(heatMapPoints);
	 
	 	return describeHeatMapResponse;
	}
}