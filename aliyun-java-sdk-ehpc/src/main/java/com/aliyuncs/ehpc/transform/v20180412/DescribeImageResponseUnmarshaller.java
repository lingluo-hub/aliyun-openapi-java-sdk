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

import com.aliyuncs.ehpc.model.v20180412.DescribeImageResponse;
import com.aliyuncs.ehpc.model.v20180412.DescribeImageResponse.ImageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImageResponseUnmarshaller {

	public static DescribeImageResponse unmarshall(DescribeImageResponse describeImageResponse, UnmarshallerContext _ctx) {
		
		describeImageResponse.setRequestId(_ctx.stringValue("DescribeImageResponse.RequestId"));

		ImageInfo imageInfo = new ImageInfo();
		imageInfo.setType(_ctx.stringValue("DescribeImageResponse.ImageInfo.Type"));
		imageInfo.setStatus(_ctx.stringValue("DescribeImageResponse.ImageInfo.Status"));
		imageInfo.setUpdateDateTime(_ctx.stringValue("DescribeImageResponse.ImageInfo.UpdateDateTime"));
		imageInfo.setRepository(_ctx.stringValue("DescribeImageResponse.ImageInfo.Repository"));
		imageInfo.setTag(_ctx.stringValue("DescribeImageResponse.ImageInfo.Tag"));
		imageInfo.setSystem(_ctx.stringValue("DescribeImageResponse.ImageInfo.System"));
		imageInfo.setImageId(_ctx.stringValue("DescribeImageResponse.ImageInfo.ImageId"));
		describeImageResponse.setImageInfo(imageInfo);
	 
	 	return describeImageResponse;
	}
}